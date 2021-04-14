import java.awt.Component;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("f")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llg;Llg;I)I",
		garbageValue = "-867581222"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1533461235"
	)
	static void method2419(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance); // L: 37
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 38
		var0.addFocusListener(MouseHandler.MouseHandler_instance); // L: 39
	} // L: 40

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1612766571"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		class208.sortWorlds(class9.World_worlds, 0, class9.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-303804195"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 172
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(ZLnk;ZI)V",
		garbageValue = "517232593"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1, boolean var2) {
		Client.field723 = 0; // L: 7142
		Client.field645 = 0; // L: 7143
		Strings.method4404(); // L: 7144
		WorldMapScaleHandler.method3246(var0, var1, var2); // L: 7145

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.field645; ++var3) { // L: 7147
			var4 = Client.field646[var3]; // L: 7148
			NPC var5 = Client.npcs[var4]; // L: 7149
			int var6 = var1.readUnsignedByte(); // L: 7150
			int var7;
			if ((var6 & 128) != 0) { // L: 7151
				var5.spotAnimation = var1.readUnsignedShort(); // L: 7152
				var7 = var1.method6629(); // L: 7153
				var5.field1238 = var7 >> 16; // L: 7154
				var5.field1249 = (var7 & 65535) + Client.cycle; // L: 7155
				var5.spotAnimationFrame = 0; // L: 7156
				var5.spotAnimationFrameCycle = 0; // L: 7157
				if (var5.field1249 > Client.cycle) { // L: 7158
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) { // L: 7159
					var5.spotAnimation = -1;
				}
			}

			int var8;
			int var9;
			int var10;
			if ((var6 & 64) != 0) { // L: 7161
				var7 = var1.method6748(); // L: 7162
				var8 = var1.method6766(); // L: 7163
				var9 = var5.x - (var7 - ItemLayer.baseX - ItemLayer.baseX) * 64; // L: 7164
				var10 = var5.y - (var8 - Tile.baseY - Tile.baseY) * 64; // L: 7165
				if (var9 != 0 || var10 != 0) { // L: 7166
					var5.field1237 = (int)(Math.atan2((double)var9, (double)var10) * 325.949D) & 2047;
				}
			}

			if ((var6 & 1) != 0) { // L: 7168
				var5.overheadText = var1.readStringCp1252NullTerminated(); // L: 7169
				var5.overheadTextCyclesRemaining = 100; // L: 7170
			}

			if ((var6 & 16) != 0) { // L: 7172
				var5.definition = GraphicsObject.getNpcDefinition(var1.method6766()); // L: 7173
				var5.field1258 = var5.definition.size; // L: 7174
				var5.field1262 = var5.definition.rotation; // L: 7175
				var5.walkSequence = var5.definition.walkSequence; // L: 7176
				var5.walkBackSequence = var5.definition.walkBackSequence; // L: 7177
				var5.walkLeftSequence = var5.definition.walkLeftSequence; // L: 7178
				var5.walkRightSequence = var5.definition.walkRightSequence; // L: 7179
				var5.idleSequence = var5.definition.idleSequence; // L: 7180
				var5.turnLeftSequence = var5.definition.turnLeftSequence; // L: 7181
				var5.turnRightSequence = var5.definition.turnRightSequence; // L: 7182
			}

			if ((var6 & 8) != 0) { // L: 7184
				var5.targetIndex = var1.readUnsignedShort(); // L: 7185
				if (var5.targetIndex == 65535) { // L: 7186
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 4) != 0) { // L: 7188
				var7 = var1.readUnsignedByte(); // L: 7189
				int var11;
				int var12;
				int var13;
				if (var7 > 0) { // L: 7190
					for (var8 = 0; var8 < var7; ++var8) { // L: 7191
						var10 = -1; // L: 7193
						var11 = -1; // L: 7194
						var12 = -1; // L: 7195
						var9 = var1.readUShortSmart(); // L: 7196
						if (var9 == 32767) { // L: 7197
							var9 = var1.readUShortSmart(); // L: 7198
							var11 = var1.readUShortSmart(); // L: 7199
							var10 = var1.readUShortSmart(); // L: 7200
							var12 = var1.readUShortSmart(); // L: 7201
						} else if (var9 != 32766) { // L: 7203
							var11 = var1.readUShortSmart(); // L: 7204
						} else {
							var9 = -1; // L: 7206
						}

						var13 = var1.readUShortSmart(); // L: 7207
						var5.addHitSplat(var9, var11, var10, var12, Client.cycle, var13); // L: 7208
					}
				}

				var8 = var1.method6623(); // L: 7211
				if (var8 > 0) { // L: 7212
					for (var9 = 0; var9 < var8; ++var9) { // L: 7213
						var10 = var1.readUShortSmart(); // L: 7214
						var11 = var1.readUShortSmart(); // L: 7215
						if (var11 != 32767) { // L: 7216
							var12 = var1.readUShortSmart(); // L: 7217
							var13 = var1.method6623(); // L: 7218
							int var14 = var11 > 0 ? var1.method6609() : var13; // L: 7219
							var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14); // L: 7220
						} else {
							var5.removeHealthBar(var10); // L: 7222
						}
					}
				}
			}

			if ((var6 & 2) != 0) { // L: 7226
				var5.field1240 = var1.method6612(); // L: 7227
				var5.field1253 = var1.method6584(); // L: 7228
				var5.field1252 = var1.method6612(); // L: 7229
				var5.field1239 = var1.readByte(); // L: 7230
				var5.field1255 = var1.method6748() + Client.cycle; // L: 7231
				var5.field1268 = var1.method6766() + Client.cycle; // L: 7232
				var5.field1213 = var1.method6748(); // L: 7233
				var5.pathLength = 1; // L: 7234
				var5.field1224 = 0; // L: 7235
				var5.field1240 += var5.pathX[0]; // L: 7236
				var5.field1253 += var5.pathY[0]; // L: 7237
				var5.field1252 += var5.pathX[0]; // L: 7238
				var5.field1239 += var5.pathY[0]; // L: 7239
			}

			if ((var6 & 32) != 0) { // L: 7241
				var7 = var1.method6617(); // L: 7242
				if (var7 == 65535) { // L: 7243
					var7 = -1;
				}

				var8 = var1.method6610(); // L: 7244
				if (var7 == var5.sequence && var7 != -1) { // L: 7245
					var9 = class225.SequenceDefinition_get(var7).field3707; // L: 7246
					if (var9 == 1) { // L: 7247
						var5.sequenceFrame = 0; // L: 7248
						var5.sequenceFrameCycle = 0; // L: 7249
						var5.sequenceDelay = var8; // L: 7250
						var5.field1245 = 0; // L: 7251
					}

					if (var9 == 2) { // L: 7253
						var5.field1245 = 0; // L: 7254
					}
				} else if (var7 == -1 || var5.sequence == -1 || class225.SequenceDefinition_get(var7).field3718 >= class225.SequenceDefinition_get(var5.sequence).field3718) { // L: 7257
					var5.sequence = var7; // L: 7258
					var5.sequenceFrame = 0; // L: 7259
					var5.sequenceFrameCycle = 0; // L: 7260
					var5.sequenceDelay = var8; // L: 7261
					var5.field1245 = 0; // L: 7262
					var5.field1224 = var5.pathLength; // L: 7263
				}
			}
		}

		for (var3 = 0; var3 < Client.field723; ++var3) { // L: 7269
			var4 = Client.field724[var3]; // L: 7270
			if (Client.npcs[var4].npcCycle != Client.cycle) { // L: 7271
				Client.npcs[var4].definition = null; // L: 7272
				Client.npcs[var4] = null; // L: 7273
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7276
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var3 = 0; var3 < Client.npcCount; ++var3) { // L: 7277
				if (Client.npcs[Client.npcIndices[var3]] == null) { // L: 7278
					throw new RuntimeException(var3 + "," + Client.npcCount); // L: 7279
				}
			}

		}
	} // L: 7282
}
