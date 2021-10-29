package net.runelite.rs.api;

import net.runelite.api.RuneLiteObject;

public interface RSRuneLiteObject extends RuneLiteObject, RSGraphicsObject
{
	boolean isLooping();

	void advanceRL(int var1);

	RSModel getModelRl();
}
