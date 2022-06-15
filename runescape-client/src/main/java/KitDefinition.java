import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1206122503
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	public static Buffer field1862;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1440625061
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("e")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("g")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("w")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("y")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("i")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("s")
	@Export("models")
	int[] models;
	@ObfuscatedName("t")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 24

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "-98"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 38
			if (var2 == 0) { // L: 39
				return; // L: 42
			}

			this.decodeNext(var1, var2); // L: 40
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqt;II)V",
		garbageValue = "-1110315310"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 45
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) { // L: 46
				var3 = var1.readUnsignedByte(); // L: 47
				this.models2 = new int[var3]; // L: 48

				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3]; // L: 54
				this.recolorTo = new short[var3]; // L: 55

				for (var4 = 0; var4 < var3; ++var4) { // L: 56
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 57
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 58
				}
			} else if (var2 == 41) { // L: 61
				var3 = var1.readUnsignedByte(); // L: 62
				this.retextureFrom = new short[var3]; // L: 63
				this.retextureTo = new short[var3]; // L: 64

				for (var4 = 0; var4 < var3; ++var4) { // L: 65
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 66
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 67
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 70
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 72

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-798633178"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 75
			return true;
		} else {
			boolean var1 = true; // L: 76

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 77
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 78
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lgw;",
		garbageValue = "1219710236"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 82
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 83

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 84
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 86
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 87
			}

			int var3;
			if (this.recolorFrom != null) { // L: 88
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 89
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 90
				}
			}

			if (this.retextureFrom != null) { // L: 93
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) { // L: 94
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]); // L: 95
				}
			}

			return var4; // L: 98
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1459988613"
	)
	public boolean method3417() {
		boolean var1 = true; // L: 102

		for (int var2 = 0; var2 < 5; ++var2) { // L: 103
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) { // L: 104
				var1 = false;
			}
		}

		return var1; // L: 106
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Lgw;",
		garbageValue = "1"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5]; // L: 110
		int var2 = 0; // L: 111

		for (int var3 = 0; var3 < 5; ++var3) { // L: 112
			if (this.models[var3] != -1) { // L: 113
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 115
		int var4;
		if (this.recolorFrom != null) { // L: 116
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 117
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 118
			}
		}

		if (this.retextureFrom != null) { // L: 121
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 122
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 123
			}
		}

		return var5; // L: 126
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "1691347382"
	)
	public static final void method3438(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 49
			PcmPlayer.field287 = var0; // L: 50
			BuddyRankComparator.PcmPlayer_stereo = var1; // L: 51
			HealthBarUpdate.field1212 = var2; // L: 52
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 53

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "-1471382870"
	)
	static final void method3439(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4172
		if (var0.pathLength == 0) { // L: 4173
			var0.field1202 = 0; // L: 4174
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4177
				SequenceDefinition var1 = ScriptFrame.SequenceDefinition_get(var0.sequence); // L: 4178
				if (var0.field1203 > 0 && var1.field2187 == 0) { // L: 4179
					++var0.field1202; // L: 4180
					return; // L: 4181
				}

				if (var0.field1203 <= 0 && var1.field2188 == 0) { // L: 4183
					++var0.field1202; // L: 4184
					return; // L: 4185
				}
			}

			int var10 = var0.x; // L: 4188
			int var2 = var0.y; // L: 4189
			int var3 = var0.field1205 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4190
			int var4 = var0.field1205 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4191
			if (var10 < var3) { // L: 4192
				if (var2 < var4) { // L: 4193
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4194
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4195
				}
			} else if (var10 > var3) { // L: 4197
				if (var2 < var4) { // L: 4198
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4199
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4200
				}
			} else if (var2 < var4) { // L: 4202
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4203
				var0.orientation = 0;
			}

			class192 var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4204
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4205
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4212
				if (var6 > 1024) { // L: 4213
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4214
				if (var6 >= -256 && var6 <= 256) { // L: 4215
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4216
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4217
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence; // L: 4218
				}

				var0.movementSequence = var7; // L: 4219
				int var8 = 4; // L: 4220
				boolean var9 = true; // L: 4221
				if (var0 instanceof NPC) { // L: 4222
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4223
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1129 != 0) { // L: 4224
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4225
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4226
						var8 = 8;
					}

					if (var0.field1202 > 0 && var0.pathLength > 1) { // L: 4227
						var8 = 8; // L: 4228
						--var0.field1202; // L: 4229
					}
				} else {
					if (var0.pathLength > 1) { // L: 4233
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4234
						var8 = 8;
					}

					if (var0.field1202 > 0 && var0.pathLength > 1) { // L: 4235
						var8 = 8; // L: 4236
						--var0.field1202; // L: 4237
					}
				}

				if (var5 == class192.field2211) { // L: 4240
					var8 <<= 1;
				} else if (var5 == class192.field2209) { // L: 4241
					var8 >>= 1;
				}

				if (var8 >= 8) { // L: 4242
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) { // L: 4243
						var0.movementSequence = var0.runSequence;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1180 != -1) { // L: 4244
						var0.movementSequence = var0.field1180;
					} else if (var0.walkLeftSequence == var0.movementSequence && var0.field1144 != -1) { // L: 4245
						var0.movementSequence = var0.field1144;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1145 != -1) { // L: 4246
						var0.movementSequence = var0.field1145;
					}
				} else if (var8 <= 1) { // L: 4248
					if (var0.walkSequence == var0.movementSequence && var0.field1155 != -1) { // L: 4249
						var0.movementSequence = var0.field1155;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1179 != -1) { // L: 4250
						var0.movementSequence = var0.field1179;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1137 != -1) { // L: 4251
						var0.movementSequence = var0.field1137;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1149 != -1) { // L: 4252
						var0.movementSequence = var0.field1149;
					}
				}

				if (var3 != var10 || var2 != var4) { // L: 4254
					if (var10 < var3) { // L: 4255
						var0.x += var8; // L: 4256
						if (var0.x > var3) { // L: 4257
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4259
						var0.x -= var8; // L: 4260
						if (var0.x < var3) { // L: 4261
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4263
						var0.y += var8; // L: 4264
						if (var0.y > var4) { // L: 4265
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4267
						var0.y -= var8; // L: 4268
						if (var0.y < var4) { // L: 4269
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4272
					--var0.pathLength; // L: 4273
					if (var0.field1203 > 0) { // L: 4274
						--var0.field1203;
					}
				}

			} else {
				var0.x = var3; // L: 4206
				var0.y = var4; // L: 4207
				--var0.pathLength; // L: 4208
				if (var0.field1203 > 0) { // L: 4209
					--var0.field1203;
				}

			}
		}
	} // L: 4175 4210 4276
}
