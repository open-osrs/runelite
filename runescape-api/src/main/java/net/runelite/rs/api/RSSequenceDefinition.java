package net.runelite.rs.api;

import net.runelite.api.Animation;
import net.runelite.api.SequenceDefinition;
import net.runelite.mapping.Import;

public interface RSSequenceDefinition extends RSNode, SequenceDefinition, Animation
{
	@Import("frameCount")
	@Override
	int getFrameCount();

	@Import("frameIds")
	@Override
	int[] getFrameIDs();

	@Import("frameLengths")
	@Override
	int[] getFrameLengths();

	@Import("chatFrameIds")
	@Override
	int[] getChatFrameIds();

	@Import("transformSpotAnimationModel")
	RSModel transformSpotAnimationModel(RSModel var1, int var2);
}
