package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSClientPreferences;

@Mixin(RSClientPreferences.class)
public abstract class RSClientPreferencesMixin implements RSClientPreferences
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public void setClientMusicVolume(int volume)
	{
		if (volume > 0 && client.getPreferences().getMusicVolume() <= 0 && client.getCurrentTrackGroupId() != -1)
		{
			client.playMusicTrack(1000, client.getMusicTracks(), client.getCurrentTrackGroupId(), 0, volume, false);
		}

		client.getPreferences().setMusicVolume(volume);
		client.setMusicTrackVolume(volume);
		if (client.getMidiPcmStream() != null)
		{
			client.getMidiPcmStream().setPcmStreamVolume(volume);
		}
	}
}
