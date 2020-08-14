import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("p")
	@Export("SpriteBuffer_yOffsets")
	static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("definition")
	NPCDefinition definition;

	NPC() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IBI)V",
		garbageValue = "-676669615"
	)
	final void method2150(int var1, byte var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && NetSocket.SequenceDefinition_get(super.sequence).field3560 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1996954385"
	)
	final void method2142(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && NetSocket.SequenceDefinition_get(super.sequence).field3560 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = 1;
				return;
			}
		}

		super.pathLength = 0;
		super.field1023 = 0;
		super.field1022 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field967 * 64;
		super.y = super.field967 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lef;",
		garbageValue = "1832696685"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? NetSocket.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? NetSocket.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = class4.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1005, 0);
						Model[] var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)Ljava/lang/String;",
		garbageValue = "1758966720"
	)
	public static String method2157(Buffer var0) {
		return UserComparator5.method3534(var0, 32767);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-25347"
	)
	static void method2156() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1279[var0] = null;
			Players.field1278[var0] = 1;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldh;I)V",
		garbageValue = "2097901447"
	)
	public static final void method2144(PlayerProvider var0) {
		HealthBarUpdate.pcmPlayerProvider = var0;
	}
}
