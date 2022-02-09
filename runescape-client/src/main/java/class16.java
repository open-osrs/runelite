import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("n")
public class class16 implements ThreadFactory {
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("c")
	final ThreadGroup field93;
	@ObfuscatedName("l")
	final AtomicInteger field90;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field90 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field93 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field93, var1, this.this$0.field83 + "-rest-request-" + this.field90.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILgx;Lgi;I)Z",
		garbageValue = "891896577"
	)
	public static final boolean method199(int var0, int var1, RouteStrategy var2, CollisionMap var3) {
		int var4 = var0; // L: 19
		int var5 = var1; // L: 20
		byte var6 = 64; // L: 21
		byte var7 = 64; // L: 22
		int var8 = var0 - var6; // L: 23
		int var9 = var1 - var7; // L: 24
		class186.directions[var6][var7] = 99; // L: 25
		class186.distances[var6][var7] = 0; // L: 26
		byte var10 = 0; // L: 27
		int var11 = 0; // L: 28
		class186.bufferX[var10] = var0; // L: 29
		byte var10001 = var10;
		int var18 = var10 + 1;
		class186.bufferY[var10001] = var1; // L: 30
		int[][] var12 = var3.flags; // L: 31

		while (var11 != var18) { // L: 34
			var4 = class186.bufferX[var11]; // L: 35
			var5 = class186.bufferY[var11]; // L: 36
			var11 = var11 + 1 & 4095; // L: 37
			int var16 = var4 - var8; // L: 38
			int var17 = var5 - var9; // L: 39
			int var13 = var4 - var3.xInset; // L: 40
			int var14 = var5 - var3.yInset; // L: 41
			if (var2.hasArrived(1, var4, var5, var3)) { // L: 42
				SecureRandomCallable.field1009 = var4; // L: 43
				class7.field39 = var5; // L: 44
				return true; // L: 45
			}

			int var15 = class186.distances[var16][var17] + 1; // L: 47
			if (var16 > 0 && class186.directions[var16 - 1][var17] == 0 && (var12[var13 - 1][var14] & 19136776) == 0) { // L: 48
				class186.bufferX[var18] = var4 - 1; // L: 49
				class186.bufferY[var18] = var5; // L: 50
				var18 = var18 + 1 & 4095; // L: 51
				class186.directions[var16 - 1][var17] = 2; // L: 52
				class186.distances[var16 - 1][var17] = var15; // L: 53
			}

			if (var16 < 127 && class186.directions[var16 + 1][var17] == 0 && (var12[var13 + 1][var14] & 19136896) == 0) { // L: 55
				class186.bufferX[var18] = var4 + 1; // L: 56
				class186.bufferY[var18] = var5; // L: 57
				var18 = var18 + 1 & 4095; // L: 58
				class186.directions[var16 + 1][var17] = 8; // L: 59
				class186.distances[var16 + 1][var17] = var15; // L: 60
			}

			if (var17 > 0 && class186.directions[var16][var17 - 1] == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 62
				class186.bufferX[var18] = var4; // L: 63
				class186.bufferY[var18] = var5 - 1; // L: 64
				var18 = var18 + 1 & 4095; // L: 65
				class186.directions[var16][var17 - 1] = 1; // L: 66
				class186.distances[var16][var17 - 1] = var15; // L: 67
			}

			if (var17 < 127 && class186.directions[var16][var17 + 1] == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 69
				class186.bufferX[var18] = var4; // L: 70
				class186.bufferY[var18] = var5 + 1; // L: 71
				var18 = var18 + 1 & 4095; // L: 72
				class186.directions[var16][var17 + 1] = 4; // L: 73
				class186.distances[var16][var17 + 1] = var15; // L: 74
			}

			if (var16 > 0 && var17 > 0 && class186.directions[var16 - 1][var17 - 1] == 0 && (var12[var13 - 1][var14 - 1] & 19136782) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 76
				class186.bufferX[var18] = var4 - 1; // L: 77
				class186.bufferY[var18] = var5 - 1; // L: 78
				var18 = var18 + 1 & 4095; // L: 79
				class186.directions[var16 - 1][var17 - 1] = 3; // L: 80
				class186.distances[var16 - 1][var17 - 1] = var15; // L: 81
			}

			if (var16 < 127 && var17 > 0 && class186.directions[var16 + 1][var17 - 1] == 0 && (var12[var13 + 1][var14 - 1] & 19136899) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 - 1] & 19136770) == 0) { // L: 83
				class186.bufferX[var18] = var4 + 1; // L: 84
				class186.bufferY[var18] = var5 - 1; // L: 85
				var18 = var18 + 1 & 4095; // L: 86
				class186.directions[var16 + 1][var17 - 1] = 9; // L: 87
				class186.distances[var16 + 1][var17 - 1] = var15; // L: 88
			}

			if (var16 > 0 && var17 < 127 && class186.directions[var16 - 1][var17 + 1] == 0 && (var12[var13 - 1][var14 + 1] & 19136824) == 0 && (var12[var13 - 1][var14] & 19136776) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 90
				class186.bufferX[var18] = var4 - 1; // L: 91
				class186.bufferY[var18] = var5 + 1; // L: 92
				var18 = var18 + 1 & 4095; // L: 93
				class186.directions[var16 - 1][var17 + 1] = 6; // L: 94
				class186.distances[var16 - 1][var17 + 1] = var15; // L: 95
			}

			if (var16 < 127 && var17 < 127 && class186.directions[var16 + 1][var17 + 1] == 0 && (var12[var13 + 1][var14 + 1] & 19136992) == 0 && (var12[var13 + 1][var14] & 19136896) == 0 && (var12[var13][var14 + 1] & 19136800) == 0) { // L: 97
				class186.bufferX[var18] = var4 + 1; // L: 98
				class186.bufferY[var18] = var5 + 1; // L: 99
				var18 = var18 + 1 & 4095; // L: 100
				class186.directions[var16 + 1][var17 + 1] = 12; // L: 101
				class186.distances[var16 + 1][var17 + 1] = var15; // L: 102
			}
		}

		SecureRandomCallable.field1009 = var4; // L: 105
		class7.field39 = var5; // L: 106
		return false; // L: 107
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)Z",
		garbageValue = "220440385"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 370
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 371
			if (var0.readBits(1) != 0) { // L: 372
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 373
			var4 = var0.readBits(13); // L: 374
			boolean var12 = var0.readBits(1) == 1; // L: 375
			if (var12) { // L: 376
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 377
				throw new RuntimeException(); // L: 378
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 380
				var11.index = var1; // L: 381
				if (Players.field1278[var1] != null) { // L: 382
					var11.read(Players.field1278[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 383
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 384
				var7 = Players.Players_regions[var1]; // L: 385
				var8 = var7 >> 28; // L: 386
				var9 = var7 >> 14 & 255; // L: 387
				var10 = var7 & 255; // L: 388
				var11.pathTraversed[0] = Players.field1277[var1]; // L: 389
				var11.plane = (byte)var8; // L: 390
				var11.resetPath((var9 << 13) + var3 - Canvas.baseX, (var10 << 13) + var4 - class118.baseY); // L: 391
				var11.field1067 = false; // L: 392
				return true; // L: 393
			}
		} else if (var2 == 1) { // L: 395
			var3 = var0.readBits(2); // L: 396
			var4 = Players.Players_regions[var1]; // L: 397
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 398
			return false; // L: 399
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 401
				var3 = var0.readBits(5); // L: 402
				var4 = var3 >> 3; // L: 403
				var5 = var3 & 7; // L: 404
				var6 = Players.Players_regions[var1]; // L: 405
				var7 = (var6 >> 28) + var4 & 3; // L: 406
				var8 = var6 >> 14 & 255; // L: 407
				var9 = var6 & 255; // L: 408
				if (var5 == 0) { // L: 409
					--var8; // L: 410
					--var9; // L: 411
				}

				if (var5 == 1) { // L: 413
					--var9;
				}

				if (var5 == 2) { // L: 414
					++var8; // L: 415
					--var9; // L: 416
				}

				if (var5 == 3) { // L: 418
					--var8;
				}

				if (var5 == 4) { // L: 419
					++var8;
				}

				if (var5 == 5) { // L: 420
					--var8; // L: 421
					++var9; // L: 422
				}

				if (var5 == 6) { // L: 424
					++var9;
				}

				if (var5 == 7) { // L: 425
					++var8; // L: 426
					++var9; // L: 427
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 429
				return false; // L: 430
			} else {
				var3 = var0.readBits(18); // L: 432
				var4 = var3 >> 16; // L: 433
				var5 = var3 >> 8 & 255; // L: 434
				var6 = var3 & 255; // L: 435
				var7 = Players.Players_regions[var1]; // L: 436
				var8 = (var7 >> 28) + var4 & 3; // L: 437
				var9 = var5 + (var7 >> 14) & 255; // L: 438
				var10 = var6 + var7 & 255; // L: 439
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 440
				return false; // L: 441
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZB)I",
		garbageValue = "28"
	)
	static int method203(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3642
			Interpreter.Interpreter_intStackSize -= 2; // L: 3643
			Client.field775 = (short)class123.method2719(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 3644
			if (Client.field775 <= 0) { // L: 3645
				Client.field775 = 256;
			}

			Client.field759 = (short)class123.method2719(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3646
			if (Client.field759 <= 0) { // L: 3647
				Client.field759 = 256;
			}

			return 1; // L: 3648
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3650
			Interpreter.Interpreter_intStackSize -= 2; // L: 3651
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3652
			if (Client.zoomHeight <= 0) { // L: 3653
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3654
			if (Client.zoomWidth <= 0) { // L: 3655
				Client.zoomWidth = 320;
			}

			return 1; // L: 3656
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3658
			Interpreter.Interpreter_intStackSize -= 4; // L: 3659
			Client.field762 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3660
			if (Client.field762 <= 0) { // L: 3661
				Client.field762 = 1;
			}

			Client.field763 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3662
			if (Client.field763 <= 0) { // L: 3663
				Client.field763 = 32767;
			} else if (Client.field763 < Client.field762) { // L: 3664
				Client.field763 = Client.field762;
			}

			Client.field656 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3665
			if (Client.field656 <= 0) { // L: 3666
				Client.field656 = 1;
			}

			Client.field514 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3667
			if (Client.field514 <= 0) { // L: 3668
				Client.field514 = 32767;
			} else if (Client.field514 < Client.field656) { // L: 3669
				Client.field514 = Client.field656;
			}

			return 1; // L: 3670
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3672
			if (Client.viewportWidget != null) { // L: 3673
				class124.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3674
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3675
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3676
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3679
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3680
			}

			return 1; // L: 3682
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3684
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3685
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3686
			return 1; // L: 3687
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3689
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapCacheName.method4829(Client.field775); // L: 3690
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapCacheName.method4829(Client.field759); // L: 3691
			return 1; // L: 3692
		} else if (var0 == 6220) { // L: 3694
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3695
			return 1; // L: 3696
		} else if (var0 == 6221) { // L: 3698
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3699
			return 1; // L: 3700
		} else if (var0 == 6222) { // L: 3702
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = DirectByteArrayCopier.canvasWidth; // L: 3703
			return 1; // L: 3704
		} else if (var0 == 6223) { // L: 3706
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = NPC.canvasHeight; // L: 3707
			return 1; // L: 3708
		} else {
			return 2; // L: 3710
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-78"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase(); // L: 12043
		short[] var2 = new short[16]; // L: 12044
		int var3 = 0; // L: 12045

		for (int var4 = 0; var4 < HealthBarUpdate.ItemDefinition_fileCount; ++var4) { // L: 12046
			ItemComposition var9 = Client.ItemDefinition_get(var4); // L: 12047
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) { // L: 12048 12049 12050
				if (var3 >= 250) { // L: 12051
					FloorDecoration.foundItemIdCount = -1; // L: 12052
					class133.foundItemIds = null; // L: 12053
					return; // L: 12054
				}

				if (var3 >= var2.length) { // L: 12056
					short[] var6 = new short[var2.length * 2]; // L: 12057

					for (int var7 = 0; var7 < var3; ++var7) { // L: 12058
						var6[var7] = var2[var7];
					}

					var2 = var6; // L: 12059
				}

				var2[var3++] = (short)var4; // L: 12061
			}
		}

		class133.foundItemIds = var2; // L: 12063
		RouteStrategy.foundItemIndex = 0; // L: 12064
		FloorDecoration.foundItemIdCount = var3; // L: 12065
		String[] var8 = new String[FloorDecoration.foundItemIdCount]; // L: 12066

		for (int var5 = 0; var5 < FloorDecoration.foundItemIdCount; ++var5) { // L: 12067
			var8[var5] = Client.ItemDefinition_get(var2[var5]).name;
		}

		Client.method1632(var8, class133.foundItemIds); // L: 12068
	} // L: 12069

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1378041734"
	)
	static void method200() {
		if (Client.field587 && WorldMapSprite.localPlayer != null) { // L: 12117
			int var0 = WorldMapSprite.localPlayer.pathX[0]; // L: 12118
			int var1 = WorldMapSprite.localPlayer.pathY[0]; // L: 12119
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12120
				return;
			}

			class29.oculusOrbFocalPointX = WorldMapSprite.localPlayer.x; // L: 12121
			int var2 = class92.getTileHeight(WorldMapSprite.localPlayer.x, WorldMapSprite.localPlayer.y, SoundSystem.Client_plane) - Client.camFollowHeight; // L: 12122
			if (var2 < SpriteMask.field3218) { // L: 12123
				SpriteMask.field3218 = var2;
			}

			class121.oculusOrbFocalPointY = WorldMapSprite.localPlayer.y; // L: 12124
			Client.field587 = false; // L: 12125
		}

	} // L: 12127
}
