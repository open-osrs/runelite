import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("j")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -2001741545
	)
	static int field87;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("gr")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	@Export("state")
	byte state;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1175311391
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1620049031
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -658451115
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 682864265
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2131508633
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lkb;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-682485902"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1493721468"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-629489777"
	)
	void method189(int var1) {
		this.state &= -8; // L: 58
		this.state = (byte)(this.state | var1 & 7); // L: 59
	} // L: 60

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-130470346"
	)
	void method206(int var1) {
		this.state &= -9; // L: 63
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	} // L: 65

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgg;",
		garbageValue = "-42"
	)
	public static class194[] method208() {
		return new class194[]{class194.field2356, class194.field2349, class194.field2359, class194.field2348, class194.field2352, class194.field2351, class194.field2354, class194.field2353, class194.field2355, class194.field2357}; // L: 17
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-253768081"
	)
	static int method198(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 1010
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1011
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.x; // L: 1012
			return 1; // L: 1013
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1015
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.y; // L: 1016
			return 1; // L: 1017
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1019
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.width; // L: 1020
			return 1; // L: 1021
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1023
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.height; // L: 1024
			return 1; // L: 1025
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1027
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1028
			return 1; // L: 1029
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1031
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.parentId; // L: 1032
			return 1; // L: 1033
		} else {
			return 2; // L: 1035
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7144

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7145 7146 7151
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7147
				var9 = var10; // L: 7148
				break;
			}
		}

		if (var9 == null) { // L: 7153
			var9 = new PendingSpawn(); // L: 7154
			var9.plane = var0; // L: 7155
			var9.type = var3; // L: 7156
			var9.x = var1; // L: 7157
			var9.y = var2; // L: 7158
			JagexCache.method3619(var9); // L: 7159
			Client.pendingSpawns.addFirst(var9); // L: 7160
		}

		var9.id = var4; // L: 7162
		var9.field962 = var5; // L: 7163
		var9.orientation = var6; // L: 7164
		var9.delay = var7; // L: 7165
		var9.hitpoints = var8; // L: 7166
	} // L: 7167
}
