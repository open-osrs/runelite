import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fd")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("f")
	@Export("text")
	String text;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 797016481
	)
	@Export("width")
	int width;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2014432723
	)
	@Export("height")
	int height;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILfg;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1; // L: 10
		this.width = var2; // L: 11
		this.height = var3; // L: 12
		this.size = var4; // L: 13
	} // L: 14

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "427619994"
	)
	public static int method3714(int var0, int var1, int var2) {
		int var3 = UserComparator2.method6890(var2 - var1 + 1); // L: 57
		var3 <<= var1; // L: 58
		var0 |= var3; // L: 59
		return var0; // L: 60
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-481933347"
	)
	static int method3715(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1223
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1240
				var7 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1241
				var4 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1242
				if (var4 >= 1 && var4 <= 10) { // L: 1243
					class106 var8 = new class106(var4, var7.id, var7.childIndex, var7.itemId); // L: 1246
					Interpreter.field965.add(var8); // L: 1247
					return 1; // L: 1248
				} else {
					throw new RuntimeException(); // L: 1244
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1250
				ChatChannel.Interpreter_intStackSize -= 3; // L: 1251
				int var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 1252
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 1253
				int var5 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 1254
				if (var5 >= 1 && var5 <= 10) { // L: 1255
					class106 var6 = new class106(var5, var3, var4, WorldMapData_1.getWidget(var3).itemId); // L: 1258
					Interpreter.field965.add(var6); // L: 1259
					return 1; // L: 1260
				} else {
					throw new RuntimeException(); // L: 1256
				}
			} else {
				return 2; // L: 1262
			}
		} else if (Interpreter.field966 >= 10) { // L: 1224
			throw new RuntimeException(); // L: 1225
		} else {
			if (var0 >= 2000) { // L: 1228
				var7 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1229
			} else {
				var7 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 1231
			}

			if (var7.onResize == null) { // L: 1232
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1233
				var9.widget = var7; // L: 1234
				var9.args = var7.onResize; // L: 1235
				var9.field1154 = Interpreter.field966 + 1; // L: 1236
				Client.scriptEvents.addFirst(var9); // L: 1237
				return 1; // L: 1238
			}
		}
	}
}
