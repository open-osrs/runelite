import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -1707200579
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("x")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "Llo;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("dw")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		signature = "Lfa;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1705798073
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 607937277
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		signature = "(Lig;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1314527591"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method4452(var1) || this.archive.method4460(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(III)I",
		garbageValue = "1299326622"
	)
	static int method1212(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "677134031"
	)
	static int method1213(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			UrlRequester.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = WorldMapSprite.getWidget(var3);
				if (var6.children == null) {
					var6.children = new Widget[var5 + 1];
				}

				if (var6.children.length <= var5) {
					Widget[] var7 = new Widget[var5 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var5 > 0 && var6.children[var5 - 1] == null) {
					throw new RuntimeException("" + (var5 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var5;
					var12.isIf3 = true;
					var6.children[var5] = var12;
					if (var2) {
						KeyHandler.field407 = var12;
					} else {
						SecureRandomCallable.field544 = var12;
					}

					class234.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var9;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var9 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
				Widget var10 = WorldMapSprite.getWidget(var9.id);
				var10.children[var9.childIndex] = null;
				class234.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var9 = WorldMapSprite.getWidget(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
				var9.children = null;
				class234.invalidateWidget(var9);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var9 = WorldMapSprite.getWidget(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
					if (var9 != null) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							KeyHandler.field407 = var9;
						} else {
							SecureRandomCallable.field544 = var9;
						}
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				UrlRequester.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
				Widget var11 = WorldMapLabelSize.getWidgetChild(var3, var4);
				if (var11 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						KeyHandler.field407 = var11;
					} else {
						SecureRandomCallable.field544 = var11;
					}
				} else {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
