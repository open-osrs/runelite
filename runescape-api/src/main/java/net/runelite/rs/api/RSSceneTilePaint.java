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

	@Import("isFlat")
	boolean getIsFlat();

	@Import("texture")
	@Override
	int getTexture();

	@Import("rgb")
	void setRBG(int val);

	@Import("swColor")
	void setSwColor(int val);

	@Import("seColor")
	void setSeColor(int val);

	@Import("nwColor")
	void setNwColor(int val);

	@Import("neColor")
	void setNeColor(int val);

	@Import("isFlat")
	void setIsFlat(boolean val);

	@Import("texture")
	void setTexture(int val);
}
