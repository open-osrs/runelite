import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ga")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1657490379
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -338901479
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 74746585
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1630451137
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -80564939
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("j")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 426134523
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "1"
	)
	static int method4258(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class13.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1074
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1075
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.x; // L: 1076
			return 1; // L: 1077
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1079
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.y; // L: 1080
			return 1; // L: 1081
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1083
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.width; // L: 1084
			return 1; // L: 1085
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1087
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.height; // L: 1088
			return 1; // L: 1089
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1091
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1092
			return 1; // L: 1093
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1095
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.parentId; // L: 1096
			return 1; // L: 1097
		} else {
			return 2; // L: 1099
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1201682368"
	)
	public static void method4259() {
		ItemComposition.ItemDefinition_cached.clear(); // L: 536
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 537
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 538
	} // L: 539

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-1626936369"
	)
	static int method4260(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4217
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4221
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4225
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4229
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4233
							if (var0 != 7031 && var0 != 7032) { // L: 4237
								if (var0 == 7033) { // L: 4242
									--Interpreter.Interpreter_stringStackSize; // L: 4243
									return 1; // L: 4244
								} else if (var0 != 7036 && var0 != 7037) { // L: 4246
									if (var0 == 7038) { // L: 4250
										--class44.Interpreter_intStackSize; // L: 4251
										return 1; // L: 4252
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4254
										return 2; // L: 4258
									} else {
										--class44.Interpreter_intStackSize; // L: 4255
										return 1; // L: 4256
									}
								} else {
									class44.Interpreter_intStackSize -= 2; // L: 4247
									return 1; // L: 4248
								}
							} else {
								--Interpreter.Interpreter_stringStackSize; // L: 4238
								--class44.Interpreter_intStackSize; // L: 4239
								return 1; // L: 4240
							}
						} else {
							--class44.Interpreter_intStackSize; // L: 4234
							return 1; // L: 4235
						}
					} else {
						class44.Interpreter_intStackSize -= 2; // L: 4230
						return 1; // L: 4231
					}
				} else {
					class44.Interpreter_intStackSize -= 2; // L: 4226
					return 1; // L: 4227
				}
			} else {
				class44.Interpreter_intStackSize -= 3; // L: 4222
				return 1; // L: 4223
			}
		} else {
			class44.Interpreter_intStackSize -= 5; // L: 4218
			return 1; // L: 4219
		}
	}
}
