import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lg")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -410155545
	)
	@Export("world")
	public int world;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1237996835
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 213892793
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1; // L: 4
	} // L: 8

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2093335339"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1; // L: 11
		this.int2 = var2; // L: 12
	} // L: 13

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570510971"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world; // L: 16
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1660177096"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0; // L: 20
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1725299355"
	)
	static int method5815(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1349
			var5 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1350
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.itemId; // L: 1351
			return 1; // L: 1352
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1354
			var5 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1355
			if (var5.itemId != -1) { // L: 1356
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1357
			}

			return 1; // L: 1358
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1360
			int var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1361
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1362
			if (var4 != null) { // L: 1363
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 1364
			}

			return 1; // L: 1365
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1367
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1368
			return 1; // L: 1369
		} else {
			return 2; // L: 1371
		}
	}
}
