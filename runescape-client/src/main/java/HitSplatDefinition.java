import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gj")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1926287649
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1728432001
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 670201833
	)
	public int field2025;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2088614137
	)
	int field2018;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1486126739
	)
	int field2015;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 463403451
	)
	int field2014;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1913451591
	)
	int field2003;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1607995829
	)
	public int field2016;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 304686181
	)
	public int field2017;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 686533415
	)
	public int field2005;
	@ObfuscatedName("y")
	String field2019;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -731376779
	)
	public int field2020;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1728160459
	)
	public int field2021;
	@ObfuscatedName("t")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1797964889
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 602971365
	)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64); // L: 18
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 19
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20); // L: 20
	}

	HitSplatDefinition() {
		this.fontId = -1; // L: 26
		this.textColor = 16777215; // L: 27
		this.field2025 = 70; // L: 28
		this.field2018 = -1; // L: 29
		this.field2015 = -1; // L: 30
		this.field2014 = -1; // L: 31
		this.field2003 = -1;
		this.field2016 = 0;
		this.field2017 = 0;
		this.field2005 = -1;
		this.field2019 = "";
		this.field2020 = -1;
		this.field2021 = 0;
		this.transformVarbit = -1; // L: 40
		this.transformVarp = -1; // L: 41
	} // L: 43

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-766688511"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 57
			if (var2 == 0) { // L: 58
				return; // L: 61
			}

			this.decodeNext(var1, var2); // L: 59
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)V",
		garbageValue = "-907720149"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 64
			this.fontId = var1.method7742();
		} else if (var2 == 2) { // L: 65
			this.textColor = var1.readMedium();
		} else if (var2 == 3) { // L: 66
			this.field2018 = var1.method7742();
		} else if (var2 == 4) { // L: 67
			this.field2014 = var1.method7742();
		} else if (var2 == 5) { // L: 68
			this.field2015 = var1.method7742();
		} else if (var2 == 6) { // L: 69
			this.field2003 = var1.method7742();
		} else if (var2 == 7) { // L: 70
			this.field2016 = var1.readShort();
		} else if (var2 == 8) { // L: 71
			this.field2019 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) { // L: 72
			this.field2025 = var1.readUnsignedShort();
		} else if (var2 == 10) { // L: 73
			this.field2017 = var1.readShort();
		} else if (var2 == 11) { // L: 74
			this.field2005 = 0;
		} else if (var2 == 12) { // L: 75
			this.field2020 = var1.readUnsignedByte();
		} else if (var2 == 13) { // L: 76
			this.field2021 = var1.readShort();
		} else if (var2 == 14) {
			this.field2005 = var1.readUnsignedShort(); // L: 77
		} else if (var2 == 17 || var2 == 18) { // L: 78
			this.transformVarbit = var1.readUnsignedShort(); // L: 79
			if (this.transformVarbit == 65535) { // L: 80
				this.transformVarbit = -1;
			}

			this.transformVarp = var1.readUnsignedShort(); // L: 81
			if (this.transformVarp == 65535) { // L: 82
				this.transformVarp = -1;
			}

			int var3 = -1; // L: 83
			if (var2 == 18) { // L: 84
				var3 = var1.readUnsignedShort(); // L: 85
				if (var3 == 65535) { // L: 86
					var3 = -1;
				}
			}

			int var4 = var1.readUnsignedByte(); // L: 88
			this.transforms = new int[var4 + 2]; // L: 89

			for (int var5 = 0; var5 <= var4; ++var5) { // L: 90
				this.transforms[var5] = var1.readUnsignedShort(); // L: 91
				if (this.transforms[var5] == 65535) { // L: 92
					this.transforms[var5] = -1;
				}
			}

			this.transforms[var4 + 1] = var3; // L: 94
		}

	} // L: 97

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-1523162219"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1; // L: 100
		if (this.transformVarbit != -1) { // L: 101
			var1 = WorldMapRegion.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) { // L: 102
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) { // L: 104
			var2 = this.transforms[var1]; // L: 105
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? GameEngine.method589(var2) : null; // L: 106 107
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2040807148"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2019; // L: 111

		while (true) {
			int var3 = var2.indexOf("%1"); // L: 113
			if (var3 < 0) { // L: 114
				return var2; // L: 117
			}

			var2 = var2.substring(0, var3) + JagexCache.intToString(var1, false) + var2.substring(var3 + 2); // L: 115
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-817208999"
	)
	public SpritePixels method3611() {
		if (this.field2018 < 0) { // L: 121
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2018); // L: 122
			if (var1 != null) {
				return var1; // L: 123
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2018, 0); // L: 124
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2018); // L: 125
				}

				return var1; // L: 127
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(S)Lql;",
		garbageValue = "6554"
	)
	public SpritePixels method3620() {
		if (this.field2015 < 0) { // L: 131
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2015); // L: 132
			if (var1 != null) { // L: 133
				return var1;
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2015, 0); // L: 134
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2015); // L: 135
				}

				return var1; // L: 137
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)Lql;",
		garbageValue = "8947"
	)
	public SpritePixels method3613() {
		if (this.field2014 < 0) { // L: 141
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2014); // L: 142
			if (var1 != null) {
				return var1; // L: 143
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2014, 0); // L: 144
				if (var1 != null) { // L: 145
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2014);
				}

				return var1; // L: 147
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-2026619889"
	)
	public SpritePixels method3614() {
		if (this.field2003 < 0) { // L: 151
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2003); // L: 152
			if (var1 != null) {
				return var1; // L: 153
			} else {
				var1 = InterfaceParent.SpriteBuffer_getSprite(class20.field101, this.field2003, 0); // L: 154
				if (var1 != null) { // L: 155
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2003);
				}

				return var1; // L: 157
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Lmr;",
		garbageValue = "95"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) { // L: 161
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId); // L: 162
			if (var1 != null) { // L: 163
				return var1;
			} else {
				var1 = class19.method319(class20.field101, HitSplatDefinition_fontsArchive, this.fontId, 0); // L: 164
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId); // L: 165
				}

				return var1; // L: 167
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfy;",
		garbageValue = "346076354"
	)
	public static HealthBarDefinition method3619(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0); // L: 34
			var1 = new HealthBarDefinition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkj;",
		garbageValue = "945276935"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.field3919, PlayerType.field3931, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_normal, PlayerType.field3926, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman}; // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "-213160896"
	)
	static int method3642(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3917
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = MusicPatch.loadWorlds() ? 1 : 0; // L: 3918
			return 1; // L: 3919
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3921
				var9 = FloorDecoration.worldListStart(); // L: 3922
				if (var9 != null) { // L: 3923
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.id; // L: 3924
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.properties; // L: 3925
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var9.activity; // L: 3926
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.location; // L: 3927
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.population; // L: 3928
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var9.host; // L: 3929
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3932
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3933
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3934
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3935
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3936
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3937
				}

				return 1; // L: 3939
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3941
				var9 = WallDecoration.getNextWorldListWorld(); // L: 3942
				if (var9 != null) { // L: 3943
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.id; // L: 3944
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.properties; // L: 3945
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var9.activity; // L: 3946
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.location; // L: 3947
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var9.population; // L: 3948
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var9.host; // L: 3949
				} else {
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3952
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3953
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3954
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3955
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3956
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3957
				}

				return 1; // L: 3959
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3961
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3962
					var7 = null; // L: 3963

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3964
						if (var3 == World.World_worlds[var8].id) { // L: 3965
							var7 = World.World_worlds[var8]; // L: 3966
							break;
						}
					}

					if (var7 != null) { // L: 3970
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.id; // L: 3971
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.properties; // L: 3972
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var7.activity; // L: 3973
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.location; // L: 3974
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.population; // L: 3975
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var7.host; // L: 3976
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 3979
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3980
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3981
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3982
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 3983
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3984
					}

					return 1; // L: 3986
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3988
					class295.Interpreter_intStackSize -= 4; // L: 3989
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3990
					boolean var10 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1; // L: 3991
					var8 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]; // L: 3992
					boolean var6 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3] == 1; // L: 3993
					FriendsList.sortWorldList(var3, var10, var8, var6); // L: 3994
					return 1; // L: 3995
				} else if (var0 != 6511) { // L: 3997
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 4018
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1; // L: 4019
						return 1; // L: 4020
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 4022
							class295.Interpreter_intStackSize -= 2; // L: 4023
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4024
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 4025
							var5 = class182.getParamDefinition(var4); // L: 4026
							if (var5.isString()) { // L: 4027
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class9.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4028
							} else {
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class9.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4031
							}

							return 1; // L: 4033
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 4035
							class295.Interpreter_intStackSize -= 2; // L: 4036
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4037
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 4038
							var5 = class182.getParamDefinition(var4); // L: 4039
							if (var5.isString()) { // L: 4040
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class116.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4041
							} else {
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class116.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4044
							}

							return 1; // L: 4046
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 4048
							class295.Interpreter_intStackSize -= 2; // L: 4049
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4050
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 4051
							var5 = class182.getParamDefinition(var4); // L: 4052
							if (var5.isString()) { // L: 4053
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class67.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 4054
							} else {
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class67.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 4057
							}

							return 1; // L: 4059
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 4061
							class295.Interpreter_intStackSize -= 2; // L: 4062
							var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 4063
							var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 4064
							var5 = class182.getParamDefinition(var4); // L: 4065
							if (var5.isString()) { // L: 4066
								Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class114.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 4067
							} else {
								Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class114.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 4070
							}

							return 1; // L: 4072
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 4074
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 4075
							return 1; // L: 4076
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 4078
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.clientType; // L: 4079
							return 1; // L: 4080
						} else if (var0 == 6520) { // L: 4082
							return 1; // L: 4083
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 4085
							return 1; // L: 4086
						} else if (var0 == 6522) { // L: 4088
							--ChatChannel.Interpreter_stringStackSize; // L: 4089
							--class295.Interpreter_intStackSize; // L: 4090
							return 1; // L: 4091
						} else if (var0 == 6523) { // L: 4093
							--ChatChannel.Interpreter_stringStackSize; // L: 4094
							--class295.Interpreter_intStackSize; // L: 4095
							return 1; // L: 4096
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 4098
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4099
							return 1; // L: 4100
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 4102
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 4103
							return 1; // L: 4104
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 4106
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 1; // L: 4107
							return 1; // L: 4108
						} else if (var0 == 6527) { // L: 4110
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = Client.field486; // L: 4111
							return 1; // L: 4112
						} else {
							return 2; // L: 4114
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3998
					if (var3 >= 0 && var3 < World.World_count) { // L: 3999
						var7 = World.World_worlds[var3]; // L: 4000
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.id; // L: 4001
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.properties; // L: 4002
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var7.activity; // L: 4003
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.location; // L: 4004
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.population; // L: 4005
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var7.host; // L: 4006
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4009
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4010
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4011
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4012
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4013
						Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4014
					}

					return 1; // L: 4016
				}
			}
		}
	}
}
