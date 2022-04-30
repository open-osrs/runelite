package net.runelite.client.plugins;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.pf4j.PluginManager;
import org.pf4j.PluginRuntimeException;
import org.pf4j.PluginState;
import org.pf4j.PluginWrapper;
import org.pf4j.VersionManager;
import org.pf4j.update.DefaultUpdateRepository;
import org.pf4j.update.FileDownloader;
import org.pf4j.update.FileVerifier;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.SimpleFileDownloader;
import org.pf4j.update.UpdateManager;
import org.pf4j.update.verifier.CompoundVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OPRSUpdateManager
{
	private static final Logger log = LoggerFactory.getLogger(UpdateManager.class);

	private final PluginManager pluginManager;
	private final VersionManager versionManager;
	private final String systemVersion;
	private final Path repositoriesJson;

	// cache last plugin release per plugin id (the key)
	private final Map<String, PluginInfo.PluginRelease> lastPluginRelease = new HashMap<>();

	protected List<OPRSUpdateRepository> repositories;

	public OPRSUpdateManager(PluginManager pluginManager)
	{
		this.pluginManager = pluginManager;

		versionManager = pluginManager.getVersionManager();
		systemVersion = pluginManager.getSystemVersion();
		repositoriesJson = Paths.get("repositories.json");
	}

	public OPRSUpdateManager(PluginManager pluginManager, List<OPRSUpdateRepository> repos)
	{
		this(pluginManager);

		repositories = repos == null ? new ArrayList<>() : repos;
	}

	public List<PluginInfo> getAvailablePlugins()
	{
		List<PluginInfo> availablePlugins = new ArrayList<>();
		for (PluginInfo plugin : getPlugins())
		{
			if (pluginManager.getPlugin(plugin.id) == null)
			{
				availablePlugins.add(plugin);
			}
		}

		return availablePlugins;
	}

	/**
	 * Return a list of plugins that are newer versions of already installed plugins.
	 *
	 * @return list of plugins that have updates
	 */
	public List<PluginInfo> getUpdates()
	{
		List<PluginInfo> updates = new ArrayList<>();
		for (PluginWrapper installed : pluginManager.getPlugins())
		{
			String pluginId = installed.getPluginId();
			if (hasPluginUpdate(pluginId))
			{
				updates.add(getPluginsMap().get(pluginId));
			}
		}

		return updates;
	}

	/**
	 * Checks if Update Repositories has newer versions of some of the installed plugins.
	 *
	 * @return true if updates exist
	 */
	public boolean hasUpdates()
	{
		return getUpdates().size() > 0;
	}

	/**
	 * Get the list of plugins from all repos.
	 *
	 * @return List of plugin info
	 */
	public List<PluginInfo> getPlugins()
	{
		List<PluginInfo> list = new ArrayList<>(getPluginsMap().values());
		Collections.sort(list);

		return list;
	}

	/**
	 * Get a map of all plugins from all repos where key is plugin id.
	 *
	 * @return List of plugin info
	 */
	public Map<String, PluginInfo> getPluginsMap()
	{
		Map<String, PluginInfo> pluginsMap = new HashMap<>();
		for (OPRSUpdateRepository repository : getRepositories())
		{
			pluginsMap.putAll(repository.getPlugins());
		}

		return pluginsMap;
	}

	public List<OPRSUpdateRepository> getRepositories()
	{
		if (repositories == null && repositoriesJson != null)
		{
			refresh();
		}

		return repositories;
	}

	/**
	 * Add one {@link DefaultUpdateRepository}.
	 *
	 * @param id  of repo
	 * @param url of repo
	 */
	public void addRepository(String id, URL url)
	{
		for (OPRSUpdateRepository ur : repositories)
		{
			if (ur.getId().equals(id))
			{
				throw new RuntimeException("Repository with id " + id + " already exists");
			}
		}
		repositories.add(new OPRSUpdateRepository(id, url));
	}

	/**
	 * Add a repo that was created by client.
	 *
	 * @param newRepo the new UpdateRepository to add to the list
	 */
	public void addRepository(OPRSUpdateRepository newRepo)
	{
		for (OPRSUpdateRepository ur : repositories)
		{
			if (ur.getId().equals(newRepo.getId()))
			{
				throw new RuntimeException("Repository with id " + newRepo.getId() + " already exists");
			}
		}
		newRepo.refresh();
		repositories.add(newRepo);
	}

	/**
	 * Remove a repository by id.
	 *
	 * @param id of repository to remove
	 */
	public void removeRepository(String id)
	{
		for (OPRSUpdateRepository repo : getRepositories())
		{
			if (id.equals(repo.getId()))
			{
				repositories.remove(repo);
				break;
			}
		}
		log.warn("Repository with id " + id + " not found, doing nothing");
	}

	/**
	 * Refreshes all repositories, so they are forced to refresh list of plugins.
	 */
	public synchronized void refresh()
	{
		if (repositoriesJson != null && Files.exists(repositoriesJson))
		{
			initRepositoriesFromJson();
		}
		for (OPRSUpdateRepository updateRepository : repositories)
		{
			updateRepository.refresh();
		}
		lastPluginRelease.clear();
	}

	/**
	 * Installs a plugin by id and version.
	 *
	 * @param id      the id of plugin to install
	 * @param version the version of plugin to install, on SemVer format, or null for latest
	 * @return true if installation successful and plugin started
	 * @throws PluginRuntimeException if plugin does not exist in repos or problems during
	 */
	public synchronized boolean installPlugin(String id, String version)
	{
		// Download to temporary location
		Path downloaded = downloadPlugin(id, version);

		Path pluginsRoot = pluginManager.getPluginsRoot();
		Path file = pluginsRoot.resolve(downloaded.getFileName());
		try
		{
			Files.move(downloaded, file, REPLACE_EXISTING);
		}
		catch (IOException e)
		{
			throw new PluginRuntimeException(e, "Failed to write file '{}' to plugins folder", file);
		}

		String pluginId = pluginManager.loadPlugin(file);
		PluginState state = pluginManager.startPlugin(pluginId);

		return PluginState.STARTED.equals(state);
	}

	/**
	 * Downloads a plugin with given coordinates, runs all {@link FileVerifier}s
	 * and returns a path to the downloaded file.
	 *
	 * @param id      of plugin
	 * @param version of plugin or null to download latest
	 * @return Path to file which will reside in a temporary folder in the system default temp area
	 * @throws PluginRuntimeException if download failed
	 */
	protected Path downloadPlugin(String id, String version)
	{
		try
		{
			PluginInfo.PluginRelease release = findReleaseForPlugin(id, version);
			Path downloaded = getFileDownloader(id).downloadFile(new URL(release.url));
			getFileVerifier(id).verify(new FileVerifier.Context(id, release), downloaded);
			return downloaded;
		}
		catch (IOException e)
		{
			throw new PluginRuntimeException(e, "Error during download of plugin {}", id);
		}
	}

	/**
	 * Finds the {@link FileDownloader} to use for this repository.
	 *
	 * @param pluginId the plugin we wish to download
	 * @return FileDownloader instance
	 */
	protected FileDownloader getFileDownloader(String pluginId)
	{
		for (OPRSUpdateRepository ur : repositories)
		{
			if (ur.getPlugin(pluginId) != null && ur.getFileDownloader() != null)
			{
				return ur.getFileDownloader();
			}
		}

		return new SimpleFileDownloader();
	}

	/**
	 * Gets a file verifier to use for this plugin. First tries to use custom verifier
	 * configured for the repository, then fallback to the default {@link CompoundVerifier}
	 *
	 * @param pluginId the plugin we wish to download
	 * @return FileVerifier instance
	 */
	protected FileVerifier getFileVerifier(String pluginId)
	{
		for (OPRSUpdateRepository ur : repositories)
		{
			if (ur.getPlugin(pluginId) != null && ur.getFileVerifier() != null)
			{
				return ur.getFileVerifier();
			}
		}

		return new CompoundVerifier();
	}

	/**
	 * Resolves Release from id and version.
	 *
	 * @param id      of plugin
	 * @param version of plugin or null to locate latest version
	 * @return PluginRelease for downloading
	 * @throws PluginRuntimeException if id or version does not exist
	 */
	protected PluginInfo.PluginRelease findReleaseForPlugin(String id, String version)
	{
		PluginInfo pluginInfo = getPluginsMap().get(id);
		if (pluginInfo == null)
		{
			log.info("Plugin with id {} does not exist in any repository", id);
			throw new PluginRuntimeException("Plugin with id {} not found in any repository", id);
		}

		if (version == null)
		{
			return getLastPluginRelease(id);
		}

		for (PluginInfo.PluginRelease release : pluginInfo.releases)
		{
			if (versionManager.compareVersions(version, release.version) == 0 && release.url != null)
			{
				return release;
			}
		}

		throw new PluginRuntimeException("Plugin {} with version @{} does not exist in the repository", id, version);
	}

	/**
	 * Updates a plugin id to given version or to latest version if {@code version == null}.
	 *
	 * @param id      the id of plugin to update
	 * @param version the version to update to, on SemVer format, or null for latest
	 * @return true if update successful
	 * @throws PluginRuntimeException in case the given version is not available, plugin id not already installed etc
	 */
	public boolean updatePlugin(String id, String version)
	{
		if (pluginManager.getPlugin(id) == null)
		{
			throw new PluginRuntimeException("Plugin {} cannot be updated since it is not installed", id);
		}

		PluginInfo pluginInfo = getPluginsMap().get(id);
		if (pluginInfo == null)
		{
			throw new PluginRuntimeException("Plugin {} does not exist in any repository", id);
		}

		if (!hasPluginUpdate(id))
		{
			log.warn("Plugin {} does not have an update available which is compatible with system version {}", id, systemVersion);
			return false;
		}

		// Download to temp folder
		Path downloaded = downloadPlugin(id, version);

		if (!pluginManager.deletePlugin(id))
		{
			return false;
		}

		Path pluginsRoot = pluginManager.getPluginsRoot();
		Path file = pluginsRoot.resolve(downloaded.getFileName());
		try
		{
			Files.move(downloaded, file, REPLACE_EXISTING);
		}
		catch (IOException e)
		{
			throw new PluginRuntimeException("Failed to write plugin file {} to plugin folder", file);
		}

		String newPluginId = pluginManager.loadPlugin(file);
		PluginState state = pluginManager.startPlugin(newPluginId);

		return PluginState.STARTED.equals(state);
	}

	/**
	 * Returns the last release version of this plugin for given system version, regardless of release date.
	 *
	 * @return PluginRelease which has the highest version number
	 */
	public PluginInfo.PluginRelease getLastPluginRelease(String id)
	{
		PluginInfo pluginInfo = getPluginsMap().get(id);
		if (pluginInfo == null)
		{
			return null;
		}

		if (!lastPluginRelease.containsKey(id))
		{
			for (PluginInfo.PluginRelease release : pluginInfo.releases)
			{
				if (systemVersion.equals("0.0.0") || versionManager.checkVersionConstraint(systemVersion, release.requires))
				{
					if (lastPluginRelease.get(id) == null)
					{
						lastPluginRelease.put(id, release);
					}
					else if (versionManager.compareVersions(release.version, lastPluginRelease.get(id).version) > 0)
					{
						lastPluginRelease.put(id, release);
					}
				}
			}
		}

		return lastPluginRelease.get(id);
	}

	/**
	 * Finds whether the newer version of the plugin.
	 *
	 * @return true if there is a newer version available which is compatible with system
	 */
	public boolean hasPluginUpdate(String id)
	{
		PluginInfo pluginInfo = getPluginsMap().get(id);
		if (pluginInfo == null)
		{
			return false;
		}

		String installedVersion = pluginManager.getPlugin(id).getDescriptor().getVersion();
		PluginInfo.PluginRelease last = getLastPluginRelease(id);

		return last != null && versionManager.compareVersions(last.version, installedVersion) > 0;
	}

	protected synchronized void initRepositoriesFromJson()
	{
		log.debug("Read repositories from '{}'", repositoriesJson);
		try (FileReader reader = new FileReader(repositoriesJson.toFile()))
		{
			Gson gson = new GsonBuilder().create();
			OPRSUpdateRepository[] items = gson.fromJson(reader, OPRSUpdateRepository[].class);
			repositories = Arrays.asList(items);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			repositories = Collections.emptyList();
		}
	}
}
