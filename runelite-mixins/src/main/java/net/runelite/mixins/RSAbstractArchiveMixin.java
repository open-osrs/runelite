package net.runelite.mixins;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.overlay.OverlayIndex;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSArchive;
import net.runelite.rs.api.RSClient;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

@Mixin(RSAbstractArchive.class)
public abstract class RSAbstractArchiveMixin implements RSAbstractArchive
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private boolean overlayOutdated;

	@Inject
	private Map<String, String> scriptNames;

	@Inject
	@Override
	public boolean isOverlayOutdated()
	{
		return overlayOutdated;
	}

	@SuppressWarnings("InfiniteRecursion")
	@Copy("takeFile")
	@Replace("takeFile")
	public byte[] copy$getConfigData(int groupId, int fileId)
	{
		final byte[] rsData = copy$getConfigData(groupId, fileId);
		final int archiveId = ((RSArchive) this).getIndex();

		if (!OverlayIndex.hasOverlay(archiveId, groupId))
		{
			return rsData;
		}

		if (scriptNames == null)
		try
		{
			scriptNames = new HashMap<>();
			InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("scripts/");
			if (is != null)
			{
				List<String> files = IOUtils.readLines(is, Charsets.UTF_8);
				for (String s : files)
				{
					if (s.endsWith(".rs2asm"))
						continue;

					String scriptName = s.replace(".hash", "");
					InputStream hashStream = ClassLoader.getSystemClassLoader().getResourceAsStream("scripts/" + scriptName + ".hash");
					if (hashStream != null)
					{
						String scriptHash = (String) IOUtils.readLines(hashStream, Charsets.UTF_8).toArray()[0];
						scriptNames.put(scriptHash, scriptName);
					}
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		final Logger log = client.getLogger();
		final String path = String.format("/runelite/%s/%s", archiveId, groupId);

		// rsData will be null if this script didn't exist at first
		if (rsData != null)
		{
			String overlayHash, originalHash;

			try (final InputStream hashIn = getClass().getResourceAsStream(path + ".hash"))
			{
				overlayHash = CharStreams.toString(new InputStreamReader(hashIn));
				originalHash = Hashing.sha256().hashBytes(rsData).toString();
			}
			catch (IOException e)
			{
				log.warn("Missing overlay hash for {}/{}", archiveId, groupId);
				return rsData;
			}

			// Check if hash is correct first, so we don't have to load the overlay file if it doesn't match
			if (!overlayHash.equalsIgnoreCase(originalHash))
			{
				log.error("Script " + scriptNames.get(overlayHash) + " is invalid, and will not be overlaid. This will break plugin(s)!");
				client.setOutdatedScript(scriptNames.get(overlayHash));
				overlayOutdated = true;
				return rsData;
			}
		}

		try (final InputStream ovlIn = getClass().getResourceAsStream(path))
		{
			return ByteStreams.toByteArray(ovlIn);
		}
		catch (IOException e)
		{
			log.warn("Missing overlay data for {}/{}", archiveId, groupId);
			return rsData;
		}
	}
}
