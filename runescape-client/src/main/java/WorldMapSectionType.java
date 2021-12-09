import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hv")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1872417907
	)
	@Export("type")
	final int type;
	@ObfuscatedName("s")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhv;",
		garbageValue = "-719396809"
	)
	static WorldMapSectionType[] method4754() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0}; // L: 17
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZS)I",
		garbageValue = "4095"
	)
	static int method4756(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3611
			Client.logoutTimer = 250; // L: 3612
			return 1; // L: 3613
		} else if (var0 != 5631 && var0 != 5633) { // L: 3615
			if (var0 == 5632) { // L: 3619
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 26; // L: 3620
				return 1; // L: 3621
			} else {
				return 2; // L: 3623
			}
		} else {
			class13.Interpreter_stringStackSize -= 2; // L: 3616
			return 1; // L: 3617
		}
	}
}
