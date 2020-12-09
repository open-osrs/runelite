package net.runelite.rs.api;

import net.runelite.api.Preferences;
import net.runelite.mapping.Import;

public interface RSClientPreferences extends Preferences
{
	@Import("rememberedUsername")
	@Override
	String getRememberedUsername();

	@Import("rememberedUsername")
	@Override
	void setRememberedUsername(String username);

	@Import("soundEffectsVolume")
	@Override
	int getSoundEffectsVolume();

	@Import("soundEffectsVolume")
	@Override
	void setSoundEffectsVolume(int i);

	@Import("areaSoundEffectsVolume")
	@Override
	int getAreaSoundEffectsVolume();

	@Import("areaSoundEffectsVolume")
	@Override
	void setAreaSoundEffectsVolume(int i);

	@Import("musicVolume")
	@Override
	int getMusicVolume();
}
