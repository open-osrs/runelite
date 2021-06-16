import java.awt.Component;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1079033783
	)
	static int field448;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1271809059
	)
	public static int field446;
	@ObfuscatedName("ez")
	static int[] field438;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256); // L: 9
		this.rawSounds = new NodeHashTable(256); // L: 10
		this.soundEffectIndex = var1; // L: 13
		this.musicSampleIndex = var2; // L: 14
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lar;",
		garbageValue = "58"
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
				if (var3 != null) {
					var3[0] -= var7.samples.length; // L: 28
				}

				return var7; // L: 29
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lar;",
		garbageValue = "822692099"
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
			if (var7 == null) { // L: 46
				return null;
			} else {
				var8.remove(); // L: 47
				this.rawSounds.put(var7, var5); // L: 48
				return var7; // L: 49
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lar;",
		garbageValue = "-2090630447"
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lar;",
		garbageValue = "-1103543677"
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "-55"
	)
	static void method932(Component var0) {
		var0.setFocusTraversalKeysEnabled(false); // L: 155
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 156
		var0.addFocusListener(KeyHandler.KeyHandler_instance); // L: 157
	} // L: 158

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1363768741"
	)
	static void method928() {
		Players.Players_count = 0; // L: 618

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 619
			Players.field1362[var0] = null; // L: 620
			Players.field1361[var0] = 1; // L: 621
		}

	} // L: 623

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-943679526"
	)
	static int method929(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 2992
			var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 2993
			var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2994
			Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + var9; // L: 2995
			return 1; // L: 2996
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 2998
				UserComparator9.Interpreter_stringStackSize -= 2; // L: 2999
				var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize]; // L: 3000
				var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1]; // L: 3001
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3002
				return 1; // L: 3003
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3005
				var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3006
				var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3007
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + HealthBarDefinition.intToString(var9, true); // L: 3008
				return 1; // L: 3009
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3011
				var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3012
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3013
				return 1; // L: 3014
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3016
					var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3017
					long var13 = ((long)var10 + 11745L) * 86400000L; // L: 3018
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3019
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3020
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3021
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3022
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3023
					return 1; // L: 3024
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3026
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3034
						var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3035
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3036
						return 1; // L: 3037
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3039
						UserComparator9.Interpreter_stringStackSize -= 2; // L: 3040
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class269.method5000(class226.compareStrings(Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1], AbstractArchive.clientLanguage)); // L: 3041
						return 1; // L: 3042
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3044
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3045
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3046
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3047
							var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3048
							var11 = GrandExchangeOfferOwnWorldComparator.archive13.takeFile(var5, 0); // L: 3049
							var12 = new Font(var11); // L: 3050
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3051
							return 1; // L: 3052
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3054
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3055
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3056
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3057
							var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3058
							var11 = GrandExchangeOfferOwnWorldComparator.archive13.takeFile(var5, 0); // L: 3059
							var12 = new Font(var11); // L: 3060
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3061
							return 1; // L: 3062
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3064
							UserComparator9.Interpreter_stringStackSize -= 2; // L: 3065
							var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize]; // L: 3066
							var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1]; // L: 3067
							if (Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1) { // L: 3068
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4; // L: 3069
							}

							return 1; // L: 3070
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3072
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3073
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3074
							return 1; // L: 3075
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3077
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3078
							var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3079
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3080
							return 1; // L: 3081
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3083
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3084
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = GameBuild.isCharPrintable((char)var10) ? 1 : 0; // L: 3085
							return 1; // L: 3086
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3088
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3089
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = DynamicObject.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3090
							return 1; // L: 3091
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3093
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3094
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = HitSplatDefinition.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3095
							return 1; // L: 3096
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3098
							var10 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3099
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class105.isDigit((char)var10) ? 1 : 0; // L: 3100
							return 1; // L: 3101
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3103
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3104
							if (var3 != null) { // L: 3105
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3106
							}

							return 1; // L: 3107
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3109
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3110
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3111
							var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3112
							var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3113
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3114
							return 1; // L: 3115
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3117
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3118
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3119
							boolean var16 = false; // L: 3120

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3121
								char var7 = var3.charAt(var6); // L: 3122
								if (var7 == '<') { // L: 3123
									var16 = true;
								} else if (var7 == '>') { // L: 3124
									var16 = false;
								} else if (!var16) { // L: 3125
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3127
							return 1; // L: 3128
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3130
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3131
							var9 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3132
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3133
							return 1; // L: 3134
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3136
							UserComparator9.Interpreter_stringStackSize -= 2; // L: 3137
							var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize]; // L: 3138
							var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1]; // L: 3139
							var5 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3140
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3141
							return 1; // L: 3142
						} else if (var0 == 4122) { // L: 3144
							var3 = Interpreter.Interpreter_stringStack[--UserComparator9.Interpreter_stringStackSize]; // L: 3145
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3146
							return 1; // L: 3147
						} else {
							return 2; // L: 3149
						}
					}
				} else {
					UserComparator9.Interpreter_stringStackSize -= 2; // L: 3027
					var3 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize]; // L: 3028
					var4 = Interpreter.Interpreter_stringStack[UserComparator9.Interpreter_stringStackSize + 1]; // L: 3029
					if (class262.localPlayer.appearance != null && class262.localPlayer.appearance.isFemale) { // L: 3030
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var3; // L: 3031
					}

					return 1; // L: 3032
				}
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lcl;B)V",
		garbageValue = "-11"
	)
	static final void method930(Actor var0) {
		var0.movementSequence = var0.idleSequence; // L: 4198
		if (var0.pathLength == 0) { // L: 4199
			var0.field1242 = 0; // L: 4200
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) { // L: 4203
				SequenceDefinition var1 = WorldMapScaleHandler.SequenceDefinition_get(var0.sequence); // L: 4204
				if (var0.field1281 > 0 && var1.field1895 == 0) { // L: 4205
					++var0.field1242; // L: 4206
					return; // L: 4207
				}

				if (var0.field1281 <= 0 && var1.field1893 == 0) { // L: 4209
					++var0.field1242; // L: 4210
					return; // L: 4211
				}
			}

			int var10 = var0.x; // L: 4214
			int var2 = var0.y; // L: 4215
			int var3 = var0.field1225 * 64 + var0.pathX[var0.pathLength - 1] * 128; // L: 4216
			int var4 = var0.field1225 * 64 + var0.pathY[var0.pathLength - 1] * 128; // L: 4217
			if (var10 < var3) { // L: 4218
				if (var2 < var4) { // L: 4219
					var0.orientation = 1280;
				} else if (var2 > var4) { // L: 4220
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536; // L: 4221
				}
			} else if (var10 > var3) { // L: 4223
				if (var2 < var4) { // L: 4224
					var0.orientation = 768;
				} else if (var2 > var4) { // L: 4225
					var0.orientation = 256;
				} else {
					var0.orientation = 512; // L: 4226
				}
			} else if (var2 < var4) { // L: 4228
				var0.orientation = 1024;
			} else if (var2 > var4) { // L: 4229
				var0.orientation = 0;
			}

			byte var5 = var0.pathTraversed[var0.pathLength - 1]; // L: 4230
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) { // L: 4231
				int var6 = var0.orientation - var0.rotation & 2047; // L: 4238
				if (var6 > 1024) { // L: 4239
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence; // L: 4240
				if (var6 >= -256 && var6 <= 256) { // L: 4241
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) { // L: 4242
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) { // L: 4243
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence; // L: 4244
				}

				var0.movementSequence = var7; // L: 4245
				int var8 = 4; // L: 4246
				boolean var9 = true; // L: 4247
				if (var0 instanceof NPC) { // L: 4248
					var9 = ((NPC)var0).definition.isClickable;
				}

				if (var9) { // L: 4249
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1275 != 0) { // L: 4250
						var8 = 2;
					}

					if (var0.pathLength > 2) { // L: 4251
						var8 = 6;
					}

					if (var0.pathLength > 3) { // L: 4252
						var8 = 8;
					}

					if (var0.field1242 > 0 && var0.pathLength > 1) { // L: 4253
						var8 = 8; // L: 4254
						--var0.field1242; // L: 4255
					}
				} else {
					if (var0.pathLength > 1) { // L: 4259
						var8 = 6;
					}

					if (var0.pathLength > 2) { // L: 4260
						var8 = 8;
					}

					if (var0.field1242 > 0 && var0.pathLength > 1) { // L: 4261
						var8 = 8; // L: 4262
						--var0.field1242; // L: 4263
					}
				}

				if (var5 == 2) { // L: 4266
					var8 <<= 1;
				}

				if (var8 >= 8 && var0.movementSequence == var0.walkSequence && var0.runSequence != -1) { // L: 4267
					var0.movementSequence = var0.runSequence;
				}

				if (var10 != var3 || var2 != var4) { // L: 4268
					if (var10 < var3) { // L: 4269
						var0.x += var8; // L: 4270
						if (var0.x > var3) { // L: 4271
							var0.x = var3;
						}
					} else if (var10 > var3) { // L: 4273
						var0.x -= var8; // L: 4274
						if (var0.x < var3) { // L: 4275
							var0.x = var3;
						}
					}

					if (var2 < var4) { // L: 4277
						var0.y += var8; // L: 4278
						if (var0.y > var4) { // L: 4279
							var0.y = var4;
						}
					} else if (var2 > var4) { // L: 4281
						var0.y -= var8; // L: 4282
						if (var0.y < var4) { // L: 4283
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) { // L: 4286
					--var0.pathLength; // L: 4287
					if (var0.field1281 > 0) { // L: 4288
						--var0.field1281;
					}
				}

			} else {
				var0.x = var3; // L: 4232
				var0.y = var4; // L: 4233
				--var0.pathLength; // L: 4234
				if (var0.field1281 > 0) {
					--var0.field1281; // L: 4235
				}

			}
		}
	} // L: 4201 4236 4290
}
