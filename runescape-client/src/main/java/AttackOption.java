import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ce")
@Implements("AttackOption")
public enum AttackOption implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	field1156(2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	field1157(4);

	@ObfuscatedName("k")
	static int[] field1161;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1465894369
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -641800473
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-474179746"
	)
	public static int method2006(int var0) {
		return class345.field3941[var0 & 16383];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-191139997"
	)
	static void method2005() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (Decimator.clientPreferences.rememberedUsername != null) {
				Login.Login_username = Decimator.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "148408733"
	)
	static int method1994(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? GrandExchangeOffer.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)Z",
		garbageValue = "-1661175610"
	)
	static boolean method2003(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = ClanChannel.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "([Lio;Lio;ZI)V",
		garbageValue = "-262719970"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1852896115 * 13396411 : var1.width * 1408116923 * -396764045;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * 1927321653 * -2086667747 : var1.height * 1272528565 * 1874739101;
		FaceNormal.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			FaceNormal.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			int var6 = var5.group;
			if (Huffman.loadInterface(var6)) {
				FaceNormal.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "1411916800"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field615) {
			Client.field616[var0.rootIndex] = true;
		}

	}
}
