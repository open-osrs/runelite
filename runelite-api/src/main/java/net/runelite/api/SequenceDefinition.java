package net.runelite.api;

import lombok.Value;

@Value
public class SequenceDefinition
{
	int[] frameIDs;
	int[] frameLenths;
	int[] chatFrameIds;
	int frameCount;
}
