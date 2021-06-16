import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fj")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("i")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1205433047
	)
	@Export("type")
	final int type;
	@ObfuscatedName("o")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lfq;",
		garbageValue = "1715010895"
	)
	public static FloorOverlayDefinition method3677(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0); // L: 30
		if (var1 != null) { // L: 31
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferUnitPriceComparator.FloorOverlayDefinition_archive.takeFile(4, var0); // L: 32
			var1 = new FloorOverlayDefinition(); // L: 33
			if (var2 != null) { // L: 34
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 35
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0); // L: 36
			return var1; // L: 37
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-216851091"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) { // L: 171
			class35.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfj;",
		garbageValue = "1780988355"
	)
	static WorldMapSectionType[] method3676() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE3}; // L: 17
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "-73"
	)
	static int method3668(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3469
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class302.getWindowedMode(); // L: 3470
			return 1; // L: 3471
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3473
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3474
				if (var3 == 1 || var3 == 2) { // L: 3475
					WorldMapDecorationType.setWindowedMode(var3);
				}

				return 1; // L: 3476
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3478
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class4.clientPreferences.windowMode; // L: 3479
				return 1; // L: 3480
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3482
				if (var0 == 5310) { // L: 3490
					--ChatChannel.Interpreter_intStackSize; // L: 3491
					return 1; // L: 3492
				} else if (var0 == 5311) { // L: 3494
					ChatChannel.Interpreter_intStackSize -= 2; // L: 3495
					return 1; // L: 3496
				} else if (var0 == 5312) { // L: 3498
					--ChatChannel.Interpreter_intStackSize; // L: 3499
					return 1; // L: 3500
				} else if (var0 == 5350) { // L: 3502
					UserComparator9.Interpreter_stringStackSize -= 2; // L: 3503
					--ChatChannel.Interpreter_intStackSize; // L: 3504
					return 1; // L: 3505
				} else if (var0 == 5351) { // L: 3507
					--UserComparator9.Interpreter_stringStackSize; // L: 3508
					return 1; // L: 3509
				} else {
					return 2; // L: 3511
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3483
				if (var3 == 1 || var3 == 2) { // L: 3484
					class4.clientPreferences.windowMode = var3; // L: 3485
					Actor.savePreferences(); // L: 3486
				}

				return 1; // L: 3488
			}
		}
	}
}
