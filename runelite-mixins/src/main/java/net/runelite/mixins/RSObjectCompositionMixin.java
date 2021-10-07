package net.runelite.mixins;

import net.runelite.api.IterableHashTable;
import net.runelite.api.Node;
import net.runelite.api.NodeCache;
import net.runelite.api.mixins.*;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSObjectComposition;

@Mixin(RSObjectComposition.class)
public abstract class RSObjectCompositionMixin implements RSObjectComposition
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int accessBitMask = 0;

	@MethodHook(value = "<init>", end = true)
	@Inject
	public void rl$init()
	{
		NodeCache cachedModels2 = client.getCachedModels2();
		cachedModels2.setCapacity(256);
		cachedModels2.setRemainingCapacity(256);
		cachedModels2.reset();
	}

	@Inject
	@Override
	public int getAccessBitMask()
	{
		return accessBitMask;
	}

	@Copy("decodeNext")
	@Replace("decodeNext")
	public void decodeNext(RSBuffer buffer, int opcode)
	{
		int var3;
		int var4;
		if (opcode == 1)
		{
			var3 = buffer.readUnsignedByte();
			if (var3 > 0)
			{
				if (getModelIds() != null && !getObjectDefinitionIsLowDetail())
				{
					buffer.setOffset(buffer.getOffset() + 3 * var3);
				}
				else
				{
					setModels(new int[var3]);
					setModelIds(new int[var3]);

					for (var4 = 0; var4 < var3; ++var4)
					{
						getModelIds()[var4] = buffer.readUnsignedShort();
						getModels()[var4] = buffer.readUnsignedByte();
					}
				}
			}
		}
		else if (opcode == 2) setName(buffer.readStringCp1252NullTerminated());
		else if (opcode == 5)
		{
			var3 = buffer.readUnsignedByte();
			if (var3 > 0)
			{
				if (getModelIds() != null && !getObjectDefinitionIsLowDetail())
				{
					buffer.setOffset(buffer.getOffset() + var3 * 2);
				}
				else
				{
					setModels(null);
					setModelIds(new int[var3]);

					for (var4 = 0; var4 < var3; ++var4)
					{
						getModelIds()[var4] = buffer.readUnsignedShort();
					}
				}
			}
		}
		else if (opcode == 14) setSizeX(buffer.readUnsignedByte());
		else if (opcode == 15) setSizeY(buffer.readUnsignedByte());
		else if (opcode == 17)
		{
			setInteractType(0);
			setBoolean1(false);
		}
		else if (opcode == 18) setBoolean1(false);
		else if (opcode == 19) setInt1(buffer.readUnsignedByte());
		else if (opcode == 21) setClipType(0);
		else if (opcode == 22) setNonFlatShading(true);
		else if (opcode == 23) setModelClipped(true);
		else if (opcode == 24)
		{
			setAnimationId(buffer.readUnsignedShort());
			if (getAnimationId() == 65535) setAnimationId(-1);
		}
		else if (opcode == 27) setInteractType(1);
		else if (opcode == 28) setInt2(buffer.readUnsignedByte());
		else if (opcode == 29) setAmbient(buffer.readByte());
		else if (opcode == 39) setContrast(buffer.readByte() * 25);
		else if (opcode >= 30 && opcode < 35)
		{
			getActions()[opcode - 30] = buffer.readStringCp1252NullTerminated();
			if (getActions()[opcode - 30].equalsIgnoreCase("Hidden"))
			{
				getActions()[opcode - 30] = null;
			}
		}
		else if (opcode == 40)
		{
			var3 = buffer.readUnsignedByte();
			setRecolorFrom(new short[var3]);
			setRecolorTo(new short[var3]);
			for (var4 = 0; var4 < var3; ++var4)
			{
				getRecolorFrom()[var4] = (short) buffer.readUnsignedShort();
				getRecolorTo()[var4] = (short) buffer.readUnsignedShort();
			}
		}
		else if (opcode == 41)
		{
			var3 = buffer.readUnsignedByte();
			setRetextureFrom(new short[var3]);
			setRetextureTo(new short[var3]);
			for (var4 = 0; var4 < var3; ++var4)
			{
				getRetextureFrom()[var4] = (short) buffer.readUnsignedShort();
				getRetextureTo()[var4] = (short) buffer.readUnsignedShort();
			}
		}
		else if (opcode == 61) buffer.readUnsignedShort();
		else if (opcode == 62) setIsRotated(true);
		else if (opcode == 64) setClipped(false);
		else if (opcode == 65) setModelSizeX(buffer.readUnsignedShort());
		else if (opcode == 66) setModelHeight(buffer.readUnsignedShort());
		else if (opcode == 67) setModelSizeY(buffer.readUnsignedShort());
		else if (opcode == 68) setMapSceneId(buffer.readUnsignedShort());
		else if (opcode == 69) accessBitMask = buffer.readUnsignedByte();
		else if (opcode == 70) setOffsetX(buffer.readShort());
		else if (opcode == 71) setOffsetHeight(buffer.readShort());
		else if (opcode == 72) setOffsetY(buffer.readShort());
		else if (opcode == 73) setBoolean2(true) ;
		else if (opcode == 74) setIsSolid(true);
		else if (opcode == 75) setInt3(buffer.readUnsignedByte());
		else if (opcode != 77 && opcode != 92)
		{
			if (opcode == 78)
			{
				setAmbientSoundId(buffer.readUnsignedShort());
				setInt7(buffer.readUnsignedByte());
			}
			else if (opcode == 79)
			{
				setInt5(buffer.readUnsignedShort());
				setInt6(buffer.readUnsignedShort());
				setInt7(buffer.readUnsignedByte());

				var3 = buffer.readUnsignedByte();
				setSoundEffectIds(new int[var3]);

				for (var4 = 0; var4 < var3; ++var4)
				{
					getSoundEffectIds()[var4] = buffer.readUnsignedShort();
				}
			}
			else if (opcode == 81) setClipType(buffer.readUnsignedByte() * 256);
			else if (opcode == 82) setMapIconId(buffer.readUnsignedShort());
			else if (opcode == 89) setBoolean3(false);
			else if (opcode == 249)
			{
				setParams((IterableHashTable<Node>) client.readStringIntParameters(buffer, getParams()));
			}
		}
		else
		{
			setTransformVarbit(buffer.readUnsignedShort());
			if (getTransformVarbit() == 65535) setTransformVarbit(-1);
			setTransformVarp(buffer.readUnsignedShort());
			if (getTransformVarp() == 65535) setTransformVarp(-1);

			var3 = -1;

			if (opcode == 92)
			{
				var3 = buffer.readUnsignedShort();
				if (var3 == 65535) var3 = -1;
			}

			var4 = buffer.readUnsignedByte();
			setTransforms(new int[var4 + 2]);

			for (int var5 = 0; var5 <= var4; ++var5)
			{
				getTransforms()[var5] = buffer.readUnsignedShort();
				if (getTransforms()[var5] == 65535) getTransforms()[var5] = -1;
			}

			getTransforms()[var4 + 1] = var3;
		}
	}
}
