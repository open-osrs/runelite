import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("q")
public class class18 extends class14 {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1954969381
	)
	int field144;
	@ObfuscatedName("e")
	boolean field145;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class18(class2 var1) {
		this.this$0 = var1;
		this.field144 = -1; // L: 178
	} // L: 181

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field144 = var1.readUnsignedShort(); // L: 184
		this.field145 = var1.readUnsignedByte() == 1; // L: 185
	} // L: 186

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method133(this.field144, this.field145); // L: 189
	} // L: 190

	@ObfuscatedName("f")
	public static final void method272(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-118293038"
	)
	static void method275(Component var0) {
		var0.removeKeyListener(KeyHandler.KeyHandler_instance); // L: 161
		var0.removeFocusListener(KeyHandler.KeyHandler_instance); // L: 162
		KeyHandler.field268 = -1; // L: 163
	} // L: 164

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	public static boolean method271(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false; // L: 239 240
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1866300199"
	)
	static int method262(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2015
			ChatChannel.Interpreter_intStackSize -= 2; // L: 2016
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2017
			var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2018
			EnumComposition var10 = TextureProvider.getEnum(var3); // L: 2019
			if (var10.outputType != 's') { // L: 2020
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2021
				if (var9 == var10.keys[var6]) { // L: 2022
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2023
					var10 = null; // L: 2024
					break;
				}
			}

			if (var10 != null) { // L: 2028
				Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2029
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2031
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2057
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2058
				EnumComposition var4 = TextureProvider.getEnum(var3); // L: 2059
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var4.size(); // L: 2060
				return 1; // L: 2061
			} else {
				return 2; // L: 2063
			}
		} else {
			ChatChannel.Interpreter_intStackSize -= 4; // L: 2032
			var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 2033
			var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 2034
			int var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 2035
			var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3]; // L: 2036
			EnumComposition var7 = TextureProvider.getEnum(var5); // L: 2037
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2038
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2043
					if (var6 == var7.keys[var8]) { // L: 2044
						if (var9 == 115) { // L: 2045
							Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2046
						}

						var7 = null; // L: 2047
						break;
					}
				}

				if (var7 != null) { // L: 2051
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.defaultStr; // L: 2052
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2053
					}
				}

				return 1; // L: 2055
			} else {
				if (var9 == 115) { // L: 2039
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 2040
				}

				return 1; // L: 2041
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Liv;IIIIIII)V",
		garbageValue = "1257309508"
	)
	static final void method273(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field689) { // L: 10001
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10002
		}

		Client.field689 = false; // L: 10003
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !UserComparator3.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10004
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10005
				var0.scrollY -= 4; // L: 10006
				Script.invalidateWidget(var0); // L: 10007
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10009
				var0.scrollY += 4; // L: 10010
				Script.invalidateWidget(var0); // L: 10011
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10013
				var7 = var3 * (var3 - 32) / var4; // L: 10014
				if (var7 < 8) { // L: 10015
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10016
				int var9 = var3 - 32 - var7; // L: 10017
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10018
				Script.invalidateWidget(var0); // L: 10019
				Client.field689 = true; // L: 10020
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10023
			var7 = var0.width; // L: 10024
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10025
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10026
				Script.invalidateWidget(var0); // L: 10027
			}
		}

	} // L: 10030
}
