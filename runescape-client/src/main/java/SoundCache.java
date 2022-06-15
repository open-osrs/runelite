import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[Lkb;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -2119317865
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Laf;",
		garbageValue = "-125"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 18
		var4 |= var1 << 16; // L: 19
		long var5 = (long)var4; // L: 20
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 21
		if (var7 != null) { // L: 22
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 23
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 24
			if (var8 == null) { // L: 25
				return null;
			} else {
				var7 = var8.toRawSound(); // L: 26
				this.rawSounds.put(var7, var5); // L: 27
				if (var3 != null) { // L: 28
					var3[0] -= var7.samples.length;
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II[II)Laf;",
		garbageValue = "-713616404"
	)
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12); // L: 33
		var4 |= var1 << 16; // L: 34
		long var5 = (long)var4 ^ 4294967296L; // L: 35
		RawSound var7 = (RawSound)this.rawSounds.get(var5); // L: 36
		if (var7 != null) { // L: 37
			return var7;
		} else if (var3 != null && var3[0] <= 0) { // L: 38
			return null;
		} else {
			VorbisSample var8 = (VorbisSample)this.musicSamples.get(var5); // L: 39
			if (var8 == null) { // L: 40
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2); // L: 41
				if (var8 == null) { // L: 42
					return null;
				}

				this.musicSamples.put(var8, var5); // L: 43
			}

			var7 = var8.toRawSound(var3); // L: 45
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I[II)Laf;",
		garbageValue = "-1912096844"
	)
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 53
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 54
		} else {
			throw new RuntimeException(); // L: 55
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I[IB)Laf;",
		garbageValue = "0"
	)
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) { // L: 59
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2); // L: 60
		} else {
			throw new RuntimeException(); // L: 61
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llh;Llh;Llh;I)V",
		garbageValue = "1628403772"
	)
	public static void method762(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 46
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 47
		SequenceDefinition.SequenceDefinition_skeletonsArchive = var2; // L: 48
	} // L: 49

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "297920354"
	)
	public static boolean method764(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 247 248
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "275"
	)
	public static boolean method753(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field141[var0] : false; // L: 252 253
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1943432471"
	)
	public static void method763() {
		WorldMapElement.WorldMapElement_cachedSprites.clear(); // L: 173
	} // L: 174

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1304277979"
	)
	static void method766() {
		class426.SpriteBuffer_xOffsets = null; // L: 234
		class142.SpriteBuffer_yOffsets = null; // L: 235
		class359.SpriteBuffer_spriteWidths = null; // L: 236
		class456.SpriteBuffer_spriteHeights = null; // L: 237
		class13.SpriteBuffer_spritePalette = null; // L: 238
		class421.SpriteBuffer_pixels = null; // L: 239
	} // L: 240

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lpq;B)V",
		garbageValue = "41"
	)
	static final void method765(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field538; ++var1) { // L: 8067
			int var2 = Client.field539[var1]; // L: 8068
			NPC var3 = Client.npcs[var2]; // L: 8069
			int var4 = var0.readUnsignedByte(); // L: 8070
			int var5;
			if (class101.field1366 && (var4 & 64) != 0) { // L: 8071
				var5 = var0.readUnsignedByte(); // L: 8072
				var4 += var5 << 8; // L: 8073
			}

			if ((var4 & 1024) != 0) { // L: 8075
				var3.field1189 = Client.cycle + var0.method7775(); // L: 8076
				var3.field1135 = Client.cycle + var0.method7774(); // L: 8077
				var3.field1191 = var0.readByte(); // L: 8078
				var3.field1192 = var0.method7769(); // L: 8079
				var3.field1193 = var0.method7952(); // L: 8080
				var3.field1133 = (byte)var0.method7767(); // L: 8081
			}

			int var6;
			int var7;
			if ((var4 & 16) != 0) { // L: 8083
				var5 = var0.method7774(); // L: 8084
				if (var5 == 65535) { // L: 8085
					var5 = -1; // L: 8086
				}

				var6 = var0.method7766(); // L: 8088
				if (var5 == var3.sequence && var5 != -1) { // L: 8089
					var7 = ScriptFrame.SequenceDefinition_get(var5).field2174; // L: 8090
					if (var7 == 1) { // L: 8091
						var3.sequenceFrame = 0; // L: 8092
						var3.sequenceFrameCycle = 0; // L: 8093
						var3.sequenceDelay = var6; // L: 8094
						var3.field1190 = 0; // L: 8095
					}

					if (var7 == 2) { // L: 8097
						var3.field1190 = 0; // L: 8098
					}
				} else if (var5 == -1 || var3.sequence == -1 || ScriptFrame.SequenceDefinition_get(var5).field2183 >= ScriptFrame.SequenceDefinition_get(var3.sequence).field2183) { // L: 8101
					var3.sequence = var5; // L: 8102
					var3.sequenceFrame = 0; // L: 8103
					var3.sequenceFrameCycle = 0; // L: 8104
					var3.sequenceDelay = var6; // L: 8105
					var3.field1190 = 0; // L: 8106
					var3.field1203 = var3.pathLength; // L: 8107
				}
			}

			if ((var4 & 2) != 0) { // L: 8111
				var3.spotAnimation = var0.method7775(); // L: 8112
				var5 = var0.method7785(); // L: 8113
				var3.spotAnimationHeight = var5 >> 16; // L: 8114
				var3.field1178 = (var5 & 65535) + Client.cycle; // L: 8115
				var3.spotAnimationFrame = 0; // L: 8116
				var3.spotAnimationFrameCycle = 0; // L: 8117
				if (var3.field1178 > Client.cycle) { // L: 8118
					var3.spotAnimationFrame = -1;
				}

				if (var3.spotAnimation == 65535) { // L: 8119
					var3.spotAnimation = -1;
				}
			}

			int var8;
			if ((var4 & 32) != 0) { // L: 8121
				var5 = var0.readUnsignedByte(); // L: 8122
				int var9;
				int var10;
				int var11;
				if (var5 > 0) { // L: 8123
					for (var6 = 0; var6 < var5; ++var6) { // L: 8124
						var8 = -1; // L: 8126
						var9 = -1; // L: 8127
						var10 = -1; // L: 8128
						var7 = var0.readUShortSmart(); // L: 8129
						if (var7 == 32767) { // L: 8130
							var7 = var0.readUShortSmart(); // L: 8131
							var9 = var0.readUShortSmart(); // L: 8132
							var8 = var0.readUShortSmart(); // L: 8133
							var10 = var0.readUShortSmart(); // L: 8134
						} else if (var7 != 32766) { // L: 8136
							var9 = var0.readUShortSmart(); // L: 8137
						} else {
							var7 = -1; // L: 8139
						}

						var11 = var0.readUShortSmart(); // L: 8140
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11); // L: 8141
					}
				}

				var6 = var0.readUnsignedByte(); // L: 8144
				if (var6 > 0) { // L: 8145
					for (var7 = 0; var7 < var6; ++var7) { // L: 8146
						var8 = var0.readUShortSmart(); // L: 8147
						var9 = var0.readUShortSmart(); // L: 8148
						if (var9 != 32767) { // L: 8149
							var10 = var0.readUShortSmart(); // L: 8150
							var11 = var0.method7767(); // L: 8151
							int var12 = var9 > 0 ? var0.method7767() : var11; // L: 8152
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12); // L: 8153
						} else {
							var3.removeHealthBar(var8); // L: 8155
						}
					}
				}
			}

			if ((var4 & 512) != 0) { // L: 8159
				var3.method2373(var0.readStringCp1252NullTerminated()); // L: 8160
			}

			if ((var4 & 2048) != 0) { // L: 8162
				var3.field1204 = var0.method7787(); // L: 8163
			}

			if ((var4 & 8) != 0) { // L: 8165
				var3.definition = BuddyRankComparator.getNpcDefinition(var0.method7776()); // L: 8166
				var3.field1205 = var3.definition.size; // L: 8167
				var3.field1129 = var3.definition.rotation; // L: 8168
				var3.walkSequence = var3.definition.walkSequence; // L: 8169
				var3.walkBackSequence = var3.definition.walkBackSequence; // L: 8170
				var3.walkLeftSequence = var3.definition.walkLeftSequence; // L: 8171
				var3.walkRightSequence = var3.definition.walkRightSequence; // L: 8172
				var3.idleSequence = var3.definition.idleSequence; // L: 8173
				var3.turnLeftSequence = var3.definition.turnLeftSequence; // L: 8174
				var3.turnRightSequence = var3.definition.turnRightSequence; // L: 8175
			}

			if ((var4 & 128) != 0) { // L: 8177
				var3.targetIndex = var0.method7776(); // L: 8178
				if (var3.targetIndex == 65535) { // L: 8179
					var3.targetIndex = -1;
				}
			}

			if (class101.field1366 && (var4 & 256) != 0 || !class101.field1366 && (var4 & 64) != 0) { // L: 8181
				var3.field1140 = var0.method7952(); // L: 8182
				var3.field1182 = var0.method7769(); // L: 8183
				var3.field1181 = var0.method7768(); // L: 8184
				var3.field1183 = var0.method7768(); // L: 8185
				var3.field1184 = var0.method7776() + Client.cycle; // L: 8186
				var3.field1194 = var0.method7775() + Client.cycle; // L: 8187
				var3.field1186 = var0.method7776(); // L: 8188
				var3.pathLength = 1; // L: 8189
				var3.field1203 = 0; // L: 8190
				var3.field1140 += var3.pathX[0]; // L: 8191
				var3.field1182 += var3.pathY[0]; // L: 8192
				var3.field1181 += var3.pathX[0]; // L: 8193
				var3.field1183 += var3.pathY[0]; // L: 8194
			}

			if ((var4 & 1) != 0) { // L: 8196
				var5 = var0.method7776(); // L: 8197
				var6 = var0.method7775(); // L: 8198
				if (class101.field1366) { // L: 8199
					var3.field1161 = var0.method7766() == 1; // L: 8200
				}

				var7 = var3.x - (var5 - class28.baseX - class28.baseX) * 64; // L: 8202
				var8 = var3.y - (var6 - WorldMapLabelSize.baseY - WorldMapLabelSize.baseY) * 64; // L: 8203
				if (var7 != 0 || var8 != 0) { // L: 8204
					var3.field1165 = (int)(Math.atan2((double)var7, (double)var8) * 325.949D) & 2047;
				}
			}

			if ((var4 & 4) != 0) { // L: 8206
				var3.overheadText = var0.readStringCp1252NullTerminated(); // L: 8207
				var3.overheadTextCyclesRemaining = 100; // L: 8208
			}
		}

	} // L: 8211
}
