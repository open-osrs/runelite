import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fo")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -55906983
	)
	final int field2014;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1208925503
	)
	final int field2011;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1826409873
	)
	final int field2016;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(1, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2014 = var1; // L: 15
		this.field2011 = var2; // L: 16
		this.field2016 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-2129729185"
	)
	boolean method3533(float var1) {
		return var1 >= (float)this.field2016; // L: 21
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "-2058322957"
	)
	static WorldMapLabelSize method3538(int var0) {
		WorldMapLabelSize[] var1 = new WorldMapLabelSize[]{WorldMapLabelSize_small, WorldMapLabelSize_large, WorldMapLabelSize_medium}; // L: 28
		WorldMapLabelSize[] var2 = var1; // L: 30

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 31
			WorldMapLabelSize var4 = var2[var3]; // L: 32
			if (var0 == var4.field2011) { // L: 34
				return var4; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;",
		garbageValue = "0"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 216
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 217
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 218
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 219
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 220
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 221
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 222
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 223
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 224 225
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-2112381958"
	)
	static int method3540(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 483
			class14.Interpreter_intStackSize -= 3; // L: 484
			var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 485
			var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 486
			int var11 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 487
			if (var4 == 0) { // L: 488
				throw new RuntimeException(); // L: 489
			} else {
				Widget var6 = UserComparator9.getWidget(var9); // L: 491
				if (var6.children == null) { // L: 492
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 493
					Widget[] var7 = new Widget[var11 + 1]; // L: 494

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 495
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 496
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 498
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 499
					var12.type = var4; // L: 500
					var12.parentId = var12.id = var6.id; // L: 501
					var12.childIndex = var11; // L: 502
					var12.isIf3 = true; // L: 503
					var6.children[var11] = var12; // L: 504
					if (var2) { // L: 505
						class120.scriptDotWidget = var12;
					} else {
						Frames.scriptActiveWidget = var12; // L: 506
					}

					class184.invalidateWidget(var6); // L: 507
					return 1; // L: 508
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 510
				var3 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget; // L: 511
				Widget var10 = UserComparator9.getWidget(var3.id); // L: 512
				var10.children[var3.childIndex] = null; // L: 513
				class184.invalidateWidget(var10); // L: 514
				return 1; // L: 515
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 517
				var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 518
				var3.children = null; // L: 519
				class184.invalidateWidget(var3); // L: 520
				return 1; // L: 521
			} else if (var0 == 103) { // L: 523
				class14.Interpreter_intStackSize -= 3; // L: 524
				return 1; // L: 525
			} else if (var0 == 104) { // L: 527
				--class14.Interpreter_intStackSize; // L: 528
				return 1; // L: 529
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 531
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 544
					var3 = UserComparator9.getWidget(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 545
					if (var3 != null) { // L: 546
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 547
						if (var2) { // L: 548
							class120.scriptDotWidget = var3;
						} else {
							Frames.scriptActiveWidget = var3; // L: 549
						}
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 551
					}

					return 1; // L: 552
				} else if (var0 == 202) { // L: 554
					Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] = 0; // L: 555
					return 1; // L: 556
				} else if (var0 == 203) { // L: 558
					Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize + 1] = 0; // L: 559
					return 1; // L: 560
				} else {
					return 2; // L: 562
				}
			} else {
				class14.Interpreter_intStackSize -= 2; // L: 532
				var9 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 533
				var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 534
				Widget var5 = ItemContainer.getWidgetChild(var9, var4); // L: 535
				if (var5 != null && var4 != -1) { // L: 536
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 537
					if (var2) { // L: 538
						class120.scriptDotWidget = var5;
					} else {
						Frames.scriptActiveWidget = var5; // L: 539
					}
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 541
				}

				return 1; // L: 542
			}
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "1223728297"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 7473

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7474 7475 7480
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 7476
				var9 = var10; // L: 7477
				break;
			}
		}

		if (var9 == null) { // L: 7482
			var9 = new PendingSpawn(); // L: 7483
			var9.plane = var0; // L: 7484
			var9.type = var3; // L: 7485
			var9.x = var1; // L: 7486
			var9.y = var2; // L: 7487
			class14.method180(var9); // L: 7488
			Client.pendingSpawns.addFirst(var9); // L: 7489
		}

		var9.id = var4; // L: 7491
		var9.field1082 = var5; // L: 7492
		var9.orientation = var6; // L: 7493
		var9.delay = var7; // L: 7494
		var9.hitpoints = var8; // L: 7495
	} // L: 7496

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "([Ljf;IIIZB)V",
		garbageValue = "124"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10244
			Widget var6 = var0[var5]; // L: 10245
			if (var6 != null && var6.parentId == var1) { // L: 10246 10247
				WorldMapScaleHandler.alignWidgetSize(var6, var2, var3, var4); // L: 10248
				LoginPacket.alignWidgetPosition(var6, var2, var3); // L: 10249
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10250
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10251
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 10252
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 10253
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10254
					MouseRecorder.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10256

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "28"
	)
	static final String method3534(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10344 10345
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ItemComposition.method3406(); // L: 11415
		FriendLoginUpdate.method6058(); // L: 11416
		int var1 = ArchiveLoader.VarpDefinition_get(var0).type; // L: 11417
		if (var1 != 0) { // L: 11418
			int var2 = Varps.Varps_main[var0]; // L: 11419
			if (var1 == 1) { // L: 11420
				if (var2 == 1) { // L: 11421
					class354.method6396(0.9D);
				}

				if (var2 == 2) { // L: 11422
					class354.method6396(0.8D);
				}

				if (var2 == 3) { // L: 11423
					class354.method6396(0.7D);
				}

				if (var2 == 4) { // L: 11424
					class354.method6396(0.6D);
				}
			}

			if (var1 == 3) { // L: 11426
				if (var2 == 0) { // L: 11427
					class14.method178(255);
				}

				if (var2 == 1) { // L: 11428
					class14.method178(192);
				}

				if (var2 == 2) { // L: 11429
					class14.method178(128);
				}

				if (var2 == 3) { // L: 11430
					class14.method178(64);
				}

				if (var2 == 4) { // L: 11431
					class14.method178(0);
				}
			}

			if (var1 == 4) { // L: 11433
				if (var2 == 0) { // L: 11434
					WorldMapSection1.updateSoundEffectVolume(127);
				}

				if (var2 == 1) { // L: 11435
					WorldMapSection1.updateSoundEffectVolume(96);
				}

				if (var2 == 2) { // L: 11436
					WorldMapSection1.updateSoundEffectVolume(64);
				}

				if (var2 == 3) { // L: 11437
					WorldMapSection1.updateSoundEffectVolume(32);
				}

				if (var2 == 4) { // L: 11438
					WorldMapSection1.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) { // L: 11440
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) { // L: 11441
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field656 = var2; // L: 11442
			}

			if (var1 == 10) { // L: 11443
				if (var2 == 0) { // L: 11444
					ClanChannel.method2825(127);
				}

				if (var2 == 1) { // L: 11445
					ClanChannel.method2825(96);
				}

				if (var2 == 2) { // L: 11446
					ClanChannel.method2825(64);
				}

				if (var2 == 3) { // L: 11447
					ClanChannel.method2825(32);
				}

				if (var2 == 4) { // L: 11448
					ClanChannel.method2825(0);
				}
			}

			if (var1 == 17) { // L: 11450
				Client.followerIndex = var2 & 65535; // L: 11451
			}

			if (var1 == 18) { // L: 11453
				Client.playerAttackOption = (AttackOption)UserComparator4.findEnumerated(Login.method1950(), var2); // L: 11454
				if (Client.playerAttackOption == null) { // L: 11455
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 11457
				if (var2 == -1) { // L: 11458
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11459
				}
			}

			if (var1 == 22) { // L: 11461
				Client.npcAttackOption = (AttackOption)UserComparator4.findEnumerated(Login.method1950(), var2); // L: 11462
				if (Client.npcAttackOption == null) { // L: 11463
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11465
}
