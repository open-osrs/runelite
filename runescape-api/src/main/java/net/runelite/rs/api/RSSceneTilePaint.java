package net.runelite.rs.api;

import net.runelite.api.SceneTilePaint;
import net.runelite.mapping.Import;

public interface RSSceneTilePaint extends SceneTilePaint
{
	@Import("rgb")
	@Override
	int getRBG();

	@Import("swColor")
	@Override
	int getSwColor();

	@Import("seColor")
	@Override
	int getSeColor();

	@Import("nwColor")
	@Override
	int getNwColor();

	@Import("neColor")
	@Override
	int getNeColor();

	@Import("texture")
	@Override
	int getTexture();
}
