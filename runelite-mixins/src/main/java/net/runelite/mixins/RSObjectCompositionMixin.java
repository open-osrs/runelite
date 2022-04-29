package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSObjectComposition;

@Mixin(RSObjectComposition.class)
public abstract class RSObjectCompositionMixin implements RSObjectComposition
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int accessBitMask = 0;

	@MethodHook(value = "<clinit>", end = true)
	@Inject
	public static void rl$clinit()
	{
		RSEvictingDualNodeHashTable objectDefinitionModelsCache = client.getObjectDefinitionModelsCache();
		objectDefinitionModelsCache.resize(256);
	}

	@Inject
	RSObjectCompositionMixin()
	{

	}

	@Inject
	@Override
	public int getAccessBitMask()
	{
		return accessBitMask;
	}

	@Inject
	@MethodHook(value = "decodeNext", end = true)
	public void decodeNextHook(RSBuffer buffer, int opcode)
	{
		if (opcode == 69)
		{
			accessBitMask = buffer.readUnsignedByte();
		}
	}
}
