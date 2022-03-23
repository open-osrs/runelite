import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class9 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field43;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	public static final class9 field44;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field37;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field36;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lr;"
	)
	static final class9 field38;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1883426091
	)
	static int field35;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(
		intValue = 1206861129
	)
	static int field34;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1164332207
	)
	int field39;
	@ObfuscatedName("d")
	String field40;
	@ObfuscatedName("f")
	boolean field41;
	@ObfuscatedName("u")
	boolean field42;

	static {
		field43 = new class9(0, "POST", true, true); // L: 6
		field44 = new class9(1, "GET", true, false); // L: 7
		field37 = new class9(2, "PUT", false, true); // L: 8
		field36 = new class9(3, "PATCH", false, true); // L: 9
		field38 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field39 = var1; // L: 17
		this.field40 = var2; // L: 18
		this.field41 = var3; // L: 19
		this.field42 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-101"
	)
	boolean method65() {
		return this.field41; // L: 24
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field39; // L: 37
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-259330959"
	)
	String method73() {
		return this.field40; // L: 28
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "112"
	)
	boolean method67() {
		return this.field42; // L: 32
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lfj;",
		garbageValue = "-2110640851"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 62
		if (var1 != null) { // L: 63
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 64
			var1 = new NPCComposition(); // L: 65
			var1.id = var0; // L: 66
			if (var2 != null) { // L: 67
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 68
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 69
			return var1; // L: 70
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpy;II)Z",
		garbageValue = "-1970074857"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 378
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 379
			if (var0.readBits(1) != 0) { // L: 380
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 381
			var4 = var0.readBits(13); // L: 382
			boolean var12 = var0.readBits(1) == 1; // L: 383
			if (var12) { // L: 384
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 385
				throw new RuntimeException(); // L: 386
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 388
				var11.index = var1; // L: 389
				if (Players.field1289[var1] != null) { // L: 390
					var11.read(Players.field1289[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 391
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 392
				var7 = Players.Players_regions[var1]; // L: 393
				var8 = var7 >> 28; // L: 394
				var9 = var7 >> 14 & 255; // L: 395
				var10 = var7 & 255; // L: 396
				var11.pathTraversed[0] = Players.field1285[var1]; // L: 397
				var11.plane = (byte)var8; // L: 398
				var11.resetPath((var9 << 13) + var3 - ApproximateRouteStrategy.baseX, (var10 << 13) + var4 - class250.baseY); // L: 399
				var11.field1109 = false; // L: 400
				return true; // L: 401
			}
		} else if (var2 == 1) { // L: 403
			var3 = var0.readBits(2); // L: 404
			var4 = Players.Players_regions[var1]; // L: 405
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 406
			return false; // L: 407
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 409
				var3 = var0.readBits(5); // L: 410
				var4 = var3 >> 3; // L: 411
				var5 = var3 & 7; // L: 412
				var6 = Players.Players_regions[var1]; // L: 413
				var7 = (var6 >> 28) + var4 & 3; // L: 414
				var8 = var6 >> 14 & 255; // L: 415
				var9 = var6 & 255; // L: 416
				if (var5 == 0) { // L: 417
					--var8; // L: 418
					--var9; // L: 419
				}

				if (var5 == 1) { // L: 421
					--var9;
				}

				if (var5 == 2) { // L: 422
					++var8; // L: 423
					--var9; // L: 424
				}

				if (var5 == 3) { // L: 426
					--var8;
				}

				if (var5 == 4) { // L: 427
					++var8;
				}

				if (var5 == 5) { // L: 428
					--var8; // L: 429
					++var9; // L: 430
				}

				if (var5 == 6) { // L: 432
					++var9;
				}

				if (var5 == 7) { // L: 433
					++var8; // L: 434
					++var9; // L: 435
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 437
				return false; // L: 438
			} else {
				var3 = var0.readBits(18); // L: 440
				var4 = var3 >> 16; // L: 441
				var5 = var3 >> 8 & 255; // L: 442
				var6 = var3 & 255; // L: 443
				var7 = Players.Players_regions[var1]; // L: 444
				var8 = (var7 >> 28) + var4 & 3; // L: 445
				var9 = var5 + (var7 >> 14) & 255; // L: 446
				var10 = var7 + var6 & 255; // L: 447
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 448
				return false; // L: 449
			}
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	static final void method64() {
		if (Client.logoutTimer > 0) { // L: 2649
			GameObject.logOut(); // L: 2650
		} else {
			Client.timer.method6595(); // L: 2653
			InterfaceParent.updateGameState(40); // L: 2654
			BuddyRankComparator.field1378 = Client.packetWriter.getSocket(); // L: 2655
			Client.packetWriter.removeSocket(); // L: 2656
		}
	} // L: 2651 2657

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1705130221"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3453
			Interpreter.clientPreferences.method2254(!Interpreter.clientPreferences.method2255()); // L: 3454
			if (Interpreter.clientPreferences.method2255()) { // L: 3455
				Login.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3456
			} else {
				Login.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3459
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3462
			Interpreter.clientPreferences.method2271();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3463
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3464
		}

		if (Client.staffModLevel >= 2) { // L: 3465
			if (var0.equalsIgnoreCase("errortest")) { // L: 3466
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3467
				ClanChannel.worldMap.showCoord = !ClanChannel.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3468
				Interpreter.clientPreferences.method2265(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3469
				Interpreter.clientPreferences.method2265(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3470
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3471
				method64();
			}
		}

		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher); // L: 3474
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3475
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3476
		Client.packetWriter.addNode(var1); // L: 3477
	} // L: 3478

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-117"
	)
	static final void method85() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2905, Client.packetWriter.isaacCipher); // L: 11486
		Client.packetWriter.addNode(var0); // L: 11487
		Interpreter.field838 = true; // L: 11488

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11489
			if (var1.type == 0 || var1.type == 3) { // L: 11490
				class20.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11492
			class290.invalidateWidget(Client.meslayerContinueWidget); // L: 11493
			Client.meslayerContinueWidget = null; // L: 11494
		}

		Interpreter.field838 = false; // L: 11496
	} // L: 11497
}
