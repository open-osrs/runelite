import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public final class class318 {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 323329615
	)
	public static int field3870;

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Loy;I)V",
		garbageValue = "-741339264"
	)
	static final void method5839(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field713; ++var1) {
			int var2 = Client.field535[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 16) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			int var5;
			if ((var4 & 2) != 0) {
				var3.spotAnimation = var0.method7059();
				var5 = var0.method6944();
				var3.field1147 = var5 >> 16;
				var3.field1105 = (var5 & 65535) + Client.cycle;
				var3.spotAnimationFrame = 0;
				var3.spotAnimationFrameCycle = 0;
				if (var3.field1105 > Client.cycle) {
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) {
					var3.spotAnimation = -1;
				}
			}

			int var6;
			int var7;
			if ((var4 & 4) != 0) {
				var5 = var0.method6934();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.method6925();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = KitDefinition.SequenceDefinition_get(var5).field1961;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1142 = 0;
					}

					if (var7 == 2) {
						var3.field1142 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || KitDefinition.SequenceDefinition_get(var5).field1955 >= KitDefinition.SequenceDefinition_get(var3.sequence).field1955) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1142 = 0;
					var3.field1129 = var3.pathLength;
				}
			}

			int var8;
			if ((var4 & 128) != 0) {
				var5 = var0.readUnsignedByte();
				int var9;
				int var10;
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByte();
							int var12 = var9 > 0 ? var0.method6926() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 8) != 0) {
				var3.definition = class112.getNpcDefinition(var0.method7059());
				var3.field1109 = var3.definition.size;
				var3.field1146 = var3.definition.rotation;
				var3.walkSequence = var3.definition.walkSequence;
				var3.walkBackSequence = var3.definition.walkBackSequence;
				var3.walkLeftSequence = var3.definition.walkLeftSequence;
				var3.walkRightSequence = var3.definition.walkRightSequence;
				var3.idleSequence = var3.definition.idleSequence;
				var3.turnLeftSequence = var3.definition.turnLeftSequence;
				var3.turnRightSequence = var3.definition.turnRightSequence;
			}

			if ((var4 & 1) != 0) {
				var5 = var0.method7059();
				var6 = var0.method6933();
				var7 = var3.x - (var5 - WorldMapSectionType.baseX - WorldMapSectionType.baseX) * 64;
				var8 = var3.y - (var6 - PlayerComposition.baseY - PlayerComposition.baseY) * 64;
				if (var7 != 0 || var8 != 0) {
					var3.field1134 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 32) != 0) {
				var3.field1148 = var0.method6915();
				var3.field1126 = var0.method6915();
				var3.field1149 = var0.method6958();
				var3.field1125 = var0.method6958();
				var3.field1145 = var0.method6934() + Client.cycle;
				var3.field1165 = var0.method6933() + Client.cycle;
				var3.field1151 = var0.method7059();
				var3.pathLength = 1;
				var3.field1129 = 0;
				var3.field1148 += var3.pathX[0];
				var3.field1126 += var3.pathY[0];
				var3.field1149 += var3.pathX[0];
				var3.field1125 += var3.pathY[0];
			}

			if ((var4 & 64) != 0) {
				var3.targetIndex = var0.method6934();
				if (var3.targetIndex == 65535) {
					var3.targetIndex = -1;
				}
			}
		}

	}
}
