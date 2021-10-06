import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gv")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 991061131
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1601758079
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 782571425
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = -8680779531833759789L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1317615523
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("l")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (0L == var0 % 37L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class320.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZI)I",
		garbageValue = "557899168"
	)
	static int method4104(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = HealthBarUpdate.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						WorldMapDecoration.scriptDotWidget = var12;
					} else {
						class245.scriptActiveWidget = var12;
					}

					class16.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
				Widget var10 = HealthBarUpdate.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				class16.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
				var3.children = null;
				class16.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--AbstractByteArrayCopier.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							WorldMapDecoration.scriptDotWidget = var3;
						} else {
							class245.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
				Widget var5 = ViewportMouse.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						WorldMapDecoration.scriptDotWidget = var5;
					} else {
						class245.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
