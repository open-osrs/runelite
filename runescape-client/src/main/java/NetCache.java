import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jb")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -371422605
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -6267907732532608685L
	)
	public static long field3604;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 786077645
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1874437275
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("NetCache_pendingWrites")
	static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 470761029
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -535814739
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1970079707
	)
	public static int field3615;
	@ObfuscatedName("q")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("c")
	public static byte field3618;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1816313081
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1810903915
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		NetCache_loadTime = 0; // L: 13
		NetCache_pendingPriorityWrites = new NodeHashTable(4096); // L: 15
		NetCache_pendingPriorityWritesCount = 0; // L: 16
		NetCache_pendingPriorityResponses = new NodeHashTable(32); // L: 17
		NetCache_pendingPriorityResponsesCount = 0; // L: 18
		NetCache_pendingWritesQueue = new DualNodeDeque(); // L: 19
		NetCache_pendingWrites = new NodeHashTable(4096); // L: 20
		NetCache_pendingWritesCount = 0; // L: 21
		NetCache_pendingResponses = new NodeHashTable(4096); // L: 22
		NetCache_pendingResponsesCount = 0; // L: 23
		NetCache_responseHeaderBuffer = new Buffer(8); // L: 26
		field3615 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3618 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2090121313"
	)
	static void method5177() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 124
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 125
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 126
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 127
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 128
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 129
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 130
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 131
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 132
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 133
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 134
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 135
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 136
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 139
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 140
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 143
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 144
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 145
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 147
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 148
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 149
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 150
		}

	} // L: 152

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "71"
	)
	static int method5178(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1266
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1267
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.x; // L: 1268
			return 1; // L: 1269
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1271
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.y; // L: 1272
			return 1; // L: 1273
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1275
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.width; // L: 1276
			return 1; // L: 1277
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1279
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.height; // L: 1280
			return 1; // L: 1281
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1283
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1284
			return 1; // L: 1285
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1287
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var3.parentId; // L: 1288
			return 1; // L: 1289
		} else {
			return 2; // L: 1291
		}
	}
}
