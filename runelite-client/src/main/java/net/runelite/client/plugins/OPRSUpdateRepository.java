package net.runelite.client.plugins;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.pf4j.update.DefaultUpdateRepository;
import org.pf4j.update.FileDownloader;
import org.pf4j.update.FileVerifier;
import org.pf4j.update.PluginInfo;
import org.pf4j.update.SimpleFileDownloader;
import org.pf4j.update.UpdateRepository;
import org.pf4j.update.util.LenientDateTypeAdapter;
import org.pf4j.update.verifier.CompoundVerifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OPRSUpdateRepository implements UpdateRepository
{

	private static final String DEFAULT_PLUGINS_JSON_FILENAME = "plugins.json";
	private static final Logger log = LoggerFactory.getLogger(DefaultUpdateRepository.class);

	private final String id;
	private final URL url;
	private String pluginsJsonFileName;

	private Map<String, PluginInfo> plugins;

	public OPRSUpdateRepository(String id, URL url)
	{
		this(id, url, DEFAULT_PLUGINS_JSON_FILENAME);
	}

	public OPRSUpdateRepository(String id, URL url, String pluginsJsonFileName)
	{
		this.id = id;
		this.url = url;
		this.pluginsJsonFileName = pluginsJsonFileName;
	}

	@Override
	public String getId()
	{
		return id;
	}

	@Override
	public URL getUrl()
	{
		return url;
	}

	@Override
	public Map<String, PluginInfo> getPlugins()
	{
		if (plugins == null)
		{
			initPlugins();
		}

		return plugins;
	}

	@Override
	public PluginInfo getPlugin(String id)
	{
		return getPlugins().get(id);
	}

	private void initPlugins()
	{
		Reader pluginsJsonReader;
		try
		{
			URL pluginsUrl = new URL(getUrl(), getPluginsJsonFileName());
			log.debug("Read plugins of '{}' repository from '{}'", id, pluginsUrl);
			pluginsJsonReader = new InputStreamReader(pluginsUrl.openStream());
		}
		catch (FileNotFoundException e)
		{
			log.error("{}{} could not be loaded (file missing)", getUrl(), getPluginsJsonFileName());
			plugins = Collections.emptyMap();
			return;
		}
		catch (Exception e)
		{
			log.error(e.getMessage(), e);
			plugins = Collections.emptyMap();
			return;
		}

		Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new LenientDateTypeAdapter()).create();
		PluginInfo[] items;
		try
		{
			items = gson.fromJson(pluginsJsonReader, PluginInfo[].class);
		}
		catch (IllegalStateException | JsonSyntaxException ex)
		{
			items = new PluginInfo[]{};
		}
		plugins = new HashMap<>(items.length);
		for (PluginInfo p : items)
		{
			for (PluginInfo.PluginRelease r : p.releases)
			{
				try
				{
					r.url = new URL(getUrl(), r.url).toString();
					if (r.date.getTime() == 0)
					{
						log.warn("Illegal release date when parsing {}@{}, setting to epoch", p.id, r.version);
					}
				}
				catch (MalformedURLException e)
				{
					log.warn("Skipping release {} of plugin {} due to failure to build valid absolute URL. Url was {}{}", r.version, p.id, getUrl(), r.url);
				}
			}
			p.setRepositoryId(getId());
			plugins.put(p.id, p);
		}
		log.debug("Found {} plugins in repository '{}'", plugins.size(), id);
	}

	/**
	 * Causes {@code plugins.json} to be read again to look for new updates from repositories.
	 */
	@Override
	public void refresh()
	{
		plugins = null;
	}

	@Override
	public FileDownloader getFileDownloader()
	{
		return new SimpleFileDownloader();
	}

	/**
	 * Gets a file verifier to execute on the downloaded file for it to be claimed valid.
	 * May be a CompoundVerifier in order to chain several verifiers.
	 *
	 * @return list of {@link FileVerifier}s
	 */
	@Override
	public FileVerifier getFileVerifier()
	{
		return new CompoundVerifier();
	}

	/**
	 * Gets the plugins json file name. Returns {@code plugins.json} if null.
	 *
	 * @return the plugins json file name
	 */
	public String getPluginsJsonFileName()
	{
		if (pluginsJsonFileName == null)
		{
			pluginsJsonFileName = DEFAULT_PLUGINS_JSON_FILENAME;
		}

		return pluginsJsonFileName;
	}
}
