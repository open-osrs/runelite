package net.runelite.rs.api;

import net.runelite.api.GraphicsObject;
import net.runelite.mapping.Import;

public interface RSGraphicsObject extends GraphicsObject, RSRenderable
{
	@Import("id")
	@Override
	int getId();

	@Import("id")
	void setId(int id);

	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("cycleStart")
	@Override
	int getStartCycle();

	@Import("plane")
	@Override
	int getLevel();

	@Import("z")
	@Override
	int getZ();

	@Import("isFinished")
	@Override
	boolean finished();

	@Import("frame")
	int getFrame();

	@Import("frame")
	void setFrame(int frame);

	@Import("frameCycle")
	int getFrameCycle();

	@Import("frameCycle")
	void setFrameCycle(int frameCycle);

	@Import("isFinished")
	void setFinished(boolean finished);

	@Import("plane")
	void setLevel(int level);

	@Import("x")
	void setX(int x);

	@Import("y")
	void setY(int y);

	@Import("z")
	void setZ(int height);

	@Import("sequenceDefinition")
	RSSequenceDefinition getSequenceDefinition();

	@Import("sequenceDefinition")
	void setSequenceDefinition(RSSequenceDefinition sequenceDefinition);
}
