import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lz")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 875893217
	)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -7945689886712382461L
	)
	public static long field3982;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1056584685
	)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -275565499
	)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -644606303
	)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -183804397
	)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -47257767
	)
	public static int field3995;
	@ObfuscatedName("g")
	@Export("NetCache_crc")
	public static CRC32 NetCache_crc;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[Llx;"
	)
	@Export("NetCache_archives")
	public static Archive[] NetCache_archives;
	@ObfuscatedName("y")
	public static byte field3998;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1326084145
	)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1735632963
	)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions;

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
		field3995 = 0; // L: 28
		NetCache_crc = new CRC32(); // L: 30
		NetCache_archives = new Archive[256]; // L: 32
		field3998 = 0; // L: 33
		NetCache_crcMismatches = 0; // L: 34
		NetCache_ioExceptions = 0; // L: 35
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-1081311758"
	)
	static int method5965(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3428
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3429
			Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = class19.ItemDefinition_get(var3).name; // L: 3430
			return 1; // L: 3431
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3433
				Interpreter.Interpreter_intStackSize -= 2; // L: 3434
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3435
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3436
				var5 = class19.ItemDefinition_get(var3); // L: 3437
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3438
				} else {
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3439
				}

				return 1; // L: 3440
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3442
				Interpreter.Interpreter_intStackSize -= 2; // L: 3443
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3444
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3445
				var5 = class19.ItemDefinition_get(var3); // L: 3446
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3447
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 3448
				}

				return 1; // L: 3449
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3451
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3452
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.ItemDefinition_get(var3).price; // L: 3453
				return 1; // L: 3454
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3456
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3457
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3458
				return 1; // L: 3459
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3461
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3462
					var7 = class19.ItemDefinition_get(var3); // L: 3463
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3464
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3465
					}

					return 1; // L: 3466
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3468
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3469
					var7 = class19.ItemDefinition_get(var3); // L: 3470
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3471
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3472
					}

					return 1; // L: 3473
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3475
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3476
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class19.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3477
					return 1; // L: 3478
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3480
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3481
					var7 = class19.ItemDefinition_get(var3); // L: 3482
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3483
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3484
					}

					return 1; // L: 3485
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3487
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3488
					var7 = class19.ItemDefinition_get(var3); // L: 3489
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3490
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 3491
					}

					return 1; // L: 3492
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3494
					String var6 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]; // L: 3495
					var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3496
					class12.findItemDefinitions(var6, var4 == 1); // L: 3497
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Script.foundItemIdCount; // L: 3498
					return 1; // L: 3499
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3501
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3506
						GameEngine.foundItemIndex = 0; // L: 3507
						return 1; // L: 3508
					} else if (var0 == 4213) { // L: 3510
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3511
						var4 = class19.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3512
						if (var4 == -1) { // L: 3513
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4; // L: 3514
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + 1; // L: 3517
						}

						return 1; // L: 3519
					} else {
						return 2; // L: 3521
					}
				} else {
					if (PendingSpawn.foundItemIds != null && GameEngine.foundItemIndex < Script.foundItemIdCount) { // L: 3502
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PendingSpawn.foundItemIds[++GameEngine.foundItemIndex - 1] & '\uffff'; // L: 3503
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3504
				}
			}
		}
	}
}
