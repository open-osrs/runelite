import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dd")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;I)I",
		garbageValue = "155176144"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lpy;I)V",
		garbageValue = "-1723249342"
	)
	static final void method2575(PacketBuffer var0) {
		int var1 = 0; // L: 89
		var0.importIndex(); // L: 90

		byte[] var10000;
		int var2;
		int var4;
		int var5;
		for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 91
			var5 = Players.Players_indices[var2]; // L: 92
			if ((Players.field1288[var5] & 1) == 0) { // L: 93
				if (var1 > 0) { // L: 94
					--var1; // L: 95
					var10000 = Players.field1288; // L: 96
					var10000[var5] = (byte)(var10000[var5] | 2);
				} else {
					var4 = var0.readBits(1); // L: 99
					if (var4 == 0) { // L: 100
						var1 = NPCComposition.method3491(var0); // L: 101
						var10000 = Players.field1288; // L: 102
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						WorldMapLabelSize.readPlayerUpdate(var0, var5); // L: 105
					}
				}
			}
		}

		var0.exportIndex(); // L: 108
		if (var1 != 0) { // L: 109
			throw new RuntimeException(); // L: 110
		} else {
			var0.importIndex(); // L: 112

			for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 113
				var5 = Players.Players_indices[var2]; // L: 114
				if ((Players.field1288[var5] & 1) != 0) { // L: 115
					if (var1 > 0) { // L: 116
						--var1; // L: 117
						var10000 = Players.field1288; // L: 118
						var10000[var5] = (byte)(var10000[var5] | 2);
					} else {
						var4 = var0.readBits(1); // L: 121
						if (var4 == 0) { // L: 122
							var1 = NPCComposition.method3491(var0); // L: 123
							var10000 = Players.field1288; // L: 124
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							WorldMapLabelSize.readPlayerUpdate(var0, var5); // L: 127
						}
					}
				}
			}

			var0.exportIndex(); // L: 130
			if (var1 != 0) { // L: 131
				throw new RuntimeException(); // L: 132
			} else {
				var0.importIndex(); // L: 134

				for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 135
					var5 = Players.Players_emptyIndices[var2]; // L: 136
					if ((Players.field1288[var5] & 1) != 0) { // L: 137
						if (var1 > 0) { // L: 138
							--var1; // L: 139
							var10000 = Players.field1288; // L: 140
							var10000[var5] = (byte)(var10000[var5] | 2);
						} else {
							var4 = var0.readBits(1); // L: 143
							if (var4 == 0) { // L: 144
								var1 = NPCComposition.method3491(var0); // L: 145
								var10000 = Players.field1288; // L: 146
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else if (class9.updateExternalPlayer(var0, var5)) { // L: 149
								var10000 = Players.field1288;
								var10000[var5] = (byte)(var10000[var5] | 2);
							}
						}
					}
				}

				var0.exportIndex(); // L: 152
				if (var1 != 0) { // L: 153
					throw new RuntimeException(); // L: 154
				} else {
					var0.importIndex(); // L: 156

					for (var2 = 0; var2 < Players.Players_emptyIdxCount; ++var2) { // L: 157
						var5 = Players.Players_emptyIndices[var2]; // L: 158
						if ((Players.field1288[var5] & 1) == 0) { // L: 159
							if (var1 > 0) { // L: 160
								--var1; // L: 161
								var10000 = Players.field1288; // L: 162
								var10000[var5] = (byte)(var10000[var5] | 2);
							} else {
								var4 = var0.readBits(1); // L: 165
								if (var4 == 0) { // L: 166
									var1 = NPCComposition.method3491(var0); // L: 167
									var10000 = Players.field1288; // L: 168
									var10000[var5] = (byte)(var10000[var5] | 2);
								} else if (class9.updateExternalPlayer(var0, var5)) { // L: 171
									var10000 = Players.field1288;
									var10000[var5] = (byte)(var10000[var5] | 2);
								}
							}
						}
					}

					var0.exportIndex(); // L: 174
					if (var1 != 0) { // L: 175
						throw new RuntimeException(); // L: 176
					} else {
						Players.Players_count = 0; // L: 178
						Players.Players_emptyIdxCount = 0; // L: 179

						for (var2 = 1; var2 < 2048; ++var2) { // L: 180
							var10000 = Players.field1288; // L: 181
							var10000[var2] = (byte)(var10000[var2] >> 1);
							Player var3 = Client.players[var2]; // L: 182
							if (var3 != null) { // L: 183
								Players.Players_indices[++Players.Players_count - 1] = var2;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var2; // L: 184
							}
						}

					}
				}
			}
		}
	} // L: 186

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "572992012"
	)
	static int method2569(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3428
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3429
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = class67.ItemDefinition_get(var3).name; // L: 3430
			return 1; // L: 3431
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3433
				class295.Interpreter_intStackSize -= 2; // L: 3434
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3435
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3436
				var5 = class67.ItemDefinition_get(var3); // L: 3437
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) {
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1]; // L: 3438
				} else {
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3439
				}

				return 1; // L: 3440
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3442
				class295.Interpreter_intStackSize -= 2; // L: 3443
				var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]; // L: 3444
				var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]; // L: 3445
				var5 = class67.ItemDefinition_get(var3); // L: 3446
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3447
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 3448
				}

				return 1; // L: 3449
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3451
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3452
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class67.ItemDefinition_get(var3).price; // L: 3453
				return 1; // L: 3454
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3456
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3457
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class67.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0; // L: 3458
				return 1; // L: 3459
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3461
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3462
					var7 = class67.ItemDefinition_get(var3); // L: 3463
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3464
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 3465
					}

					return 1; // L: 3466
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3468
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3469
					var7 = class67.ItemDefinition_get(var3); // L: 3470
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3471
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 3472
					}

					return 1; // L: 3473
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3475
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3476
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class67.ItemDefinition_get(var3).isMembersOnly ? 1 : 0; // L: 3477
					return 1; // L: 3478
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3480
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3481
					var7 = class67.ItemDefinition_get(var3); // L: 3482
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3483
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 3484
					}

					return 1; // L: 3485
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3487
					var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3488
					var7 = class67.ItemDefinition_get(var3); // L: 3489
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3490
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var3; // L: 3491
					}

					return 1; // L: 3492
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3494
					String var6 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize]; // L: 3495
					var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3496
					class13.findItemDefinitions(var6, var4 == 1); // L: 3497
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = PendingSpawn.foundItemIdCount; // L: 3498
					return 1; // L: 3499
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3501
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3506
						MouseRecorder.foundItemIndex = 0; // L: 3507
						return 1; // L: 3508
					} else if (var0 == 4213) { // L: 3510
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]; // L: 3511
						var4 = class67.ItemDefinition_get(var3).getShiftClickIndex(); // L: 3512
						if (var4 == -1) { // L: 3513
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4; // L: 3514
						} else {
							Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = var4 + 1; // L: 3517
						}

						return 1; // L: 3519
					} else {
						return 2; // L: 3521
					}
				} else {
					if (class14.foundItemIds != null && MouseRecorder.foundItemIndex < PendingSpawn.foundItemIdCount) { // L: 3502
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = class14.foundItemIds[++MouseRecorder.foundItemIndex - 1] & '\uffff'; // L: 3503
					} else {
						Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3504
				}
			}
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1574231542"
	)
	static void method2576(int var0, int var1) {
		ScriptFrame.method1083(PacketWriter.tempMenuAction, var0, var1); // L: 11239
		PacketWriter.tempMenuAction = null; // L: 11240
	} // L: 11241
}
