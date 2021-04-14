import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bz")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("SequenceDefinition_animationsArchive")
	public static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("d")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("f")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 11779

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljt;Ljt;I)I",
		garbageValue = "-1018432181"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 11782
			return 0;
		} else {
			if (this.filterWorlds) { // L: 11783
				if (Client.worldId == var1.world) { // L: 11784
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 11785
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 11787
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 11795
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 11791
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "20"
	)
	static int method1217(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 3375
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = WorldMapScaleHandler.getWindowedMode(); // L: 3376
			return 1; // L: 3377
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 3379
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3380
				if (var3 == 1 || var3 == 2) { // L: 3381
					Tile.setWindowedMode(var3);
				}

				return 1; // L: 3382
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 3384
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Login.clientPreferences.windowMode; // L: 3385
				return 1; // L: 3386
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 3388
				if (var0 == 5310) { // L: 3396
					--class16.Interpreter_intStackSize; // L: 3397
					return 1; // L: 3398
				} else if (var0 == 5350) { // L: 3400
					Interpreter.Interpreter_stringStackSize -= 2; // L: 3401
					--class16.Interpreter_intStackSize; // L: 3402
					return 1; // L: 3403
				} else if (var0 == 5351) { // L: 3405
					--Interpreter.Interpreter_stringStackSize; // L: 3406
					return 1; // L: 3407
				} else {
					return 2; // L: 3409
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 3389
				if (var3 == 1 || var3 == 2) { // L: 3390
					Login.clientPreferences.windowMode = var3; // L: 3391
					Message.savePreferences(); // L: 3392
				}

				return 1; // L: 3394
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "73"
	)
	static int method1216(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) { // L: 4108
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) { // L: 4113
				if (var0 == 6750) { // L: 4117
					++Interpreter.Interpreter_stringStackSize; // L: 4118
					return 1; // L: 4119
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) { // L: 4121
					if (var0 == 6754) { // L: 4125
						int var3 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 4126
						NPCComposition var4 = GraphicsObject.getNpcDefinition(var3); // L: 4127
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : ""; // L: 4128
						return 1; // L: 4129
					} else {
						return 2; // L: 4131
					}
				} else {
					++class16.Interpreter_intStackSize; // L: 4122
					return 1; // L: 4123
				}
			} else {
				--class16.Interpreter_intStackSize; // L: 4114
				return 1; // L: 4115
			}
		} else {
			class16.Interpreter_intStackSize -= 2; // L: 4109
			--Interpreter.Interpreter_stringStackSize; // L: 4110
			return 1; // L: 4111
		}
	}
}
