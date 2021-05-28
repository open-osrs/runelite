import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ex")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 634754105
	)
	static int field1544;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1782450907
	)
	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 812709151
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64); // L: 12
	}

	VarpDefinition() {
		this.type = 0; // L: 13
	} // L: 15

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1856210017"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 == 0) { // L: 35
				return; // L: 38
			}

			this.decodeNext(var1, var2); // L: 36
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "1230881703"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) { // L: 41
			this.type = var1.readUnsignedShort();
		}

	} // L: 43

	@ObfuscatedName("p")
	public static int method2630(long var0) {
		return (int)(var0 >>> 0 & 127L); // L: 64
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-2015232474"
	)
	static int method2629(int var0, Script var1, boolean var2) {
		Widget var3 = Frames.getWidget(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 1252
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1253
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.x; // L: 1254
			return 1; // L: 1255
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1257
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.y; // L: 1258
			return 1; // L: 1259
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1261
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.width; // L: 1262
			return 1; // L: 1263
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1265
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.height; // L: 1266
			return 1; // L: 1267
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1269
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1270
			return 1; // L: 1271
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1273
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3.parentId; // L: 1274
			return 1; // L: 1275
		} else {
			return 2; // L: 1277
		}
	}
}
