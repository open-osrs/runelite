import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("h")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("c")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 617721713
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("g")
	static byte[][][] field1097;
	@ObfuscatedName("z")
	static byte[][][] field1088;
	@ObfuscatedName("t")
	static byte[][][] field1086;
	@ObfuscatedName("v")
	static byte[][][] field1090;
	@ObfuscatedName("q")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("x")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("pcmPlayerProvider")
	static PlayerProvider pcmPlayerProvider;
	@ObfuscatedName("p")
	static int[][][] field1105;
	@ObfuscatedName("u")
	static final int[] field1085;
	@ObfuscatedName("m")
	static final int[] field1095;
	@ObfuscatedName("j")
	static final int[] field1096;
	@ObfuscatedName("f")
	static final int[] field1100;
	@ObfuscatedName("s")
	static final int[] field1098;
	@ObfuscatedName("y")
	static final int[] field1094;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -606383605
	)
	static int field1092;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 257499445
	)
	static int field1101;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field1085 = new int[]{1, 2, 4, 8}; // L: 34
		field1095 = new int[]{16, 32, 64, 128}; // L: 35
		field1096 = new int[]{1, 0, -1, 0}; // L: 36
		field1100 = new int[]{0, -1, 0, 1}; // L: 37
		field1098 = new int[]{1, -1, -1, 1}; // L: 38
		field1094 = new int[]{-1, -1, 1, 1}; // L: 39
		field1092 = (int)(Math.random() * 17.0D) - 8; // L: 40
		field1101 = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lnm;IS)Z",
		garbageValue = "12210"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 408
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 409
			if (var0.readBits(1) != 0) { // L: 410
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 411
			var4 = var0.readBits(13); // L: 412
			boolean var12 = var0.readBits(1) == 1; // L: 413
			if (var12) { // L: 414
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 415
				throw new RuntimeException(); // L: 416
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 418
				var11.index = var1; // L: 419
				if (Players.field1346[var1] != null) { // L: 420
					var11.read(Players.field1346[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 421
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 422
				var7 = Players.Players_regions[var1]; // L: 423
				var8 = var7 >> 28; // L: 424
				var9 = var7 >> 14 & 255; // L: 425
				var10 = var7 & 255; // L: 426
				var11.pathTraversed[0] = Players.field1345[var1]; // L: 427
				var11.plane = (byte)var8; // L: 428
				var11.resetPath((var9 << 13) + var3 - JagexCache.baseX, (var10 << 13) + var4 - Messages.baseY); // L: 429
				var11.field1186 = false; // L: 430
				return true; // L: 431
			}
		} else if (var2 == 1) { // L: 433
			var3 = var0.readBits(2); // L: 434
			var4 = Players.Players_regions[var1]; // L: 435
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 436
			return false; // L: 437
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 439
				var3 = var0.readBits(5); // L: 440
				var4 = var3 >> 3; // L: 441
				var5 = var3 & 7; // L: 442
				var6 = Players.Players_regions[var1]; // L: 443
				var7 = (var6 >> 28) + var4 & 3; // L: 444
				var8 = var6 >> 14 & 255; // L: 445
				var9 = var6 & 255; // L: 446
				if (var5 == 0) { // L: 447
					--var8; // L: 448
					--var9; // L: 449
				}

				if (var5 == 1) { // L: 451
					--var9;
				}

				if (var5 == 2) { // L: 452
					++var8; // L: 453
					--var9; // L: 454
				}

				if (var5 == 3) { // L: 456
					--var8;
				}

				if (var5 == 4) { // L: 457
					++var8;
				}

				if (var5 == 5) { // L: 458
					--var8; // L: 459
					++var9; // L: 460
				}

				if (var5 == 6) { // L: 462
					++var9;
				}

				if (var5 == 7) { // L: 463
					++var8; // L: 464
					++var9; // L: 465
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 467
				return false; // L: 468
			} else {
				var3 = var0.readBits(18); // L: 470
				var4 = var3 >> 16; // L: 471
				var5 = var3 >> 8 & 255; // L: 472
				var6 = var3 & 255; // L: 473
				var7 = Players.Players_regions[var1]; // L: 474
				var8 = (var7 >> 28) + var4 & 3; // L: 475
				var9 = var5 + (var7 >> 14) & 255; // L: 476
				var10 = var6 + var7 & 255; // L: 477
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 478
				return false; // L: 479
			}
		}
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2232"
	)
	static final void method2046() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 4741 4742 4749
			if (var0.plane == ParamComposition.Client_plane && !var0.isFinished) { // L: 4743
				if (Client.cycle >= var0.cycleStart) { // L: 4744
					var0.advance(Client.field768); // L: 4745
					if (var0.isFinished) { // L: 4746
						var0.remove();
					} else {
						class5.scene.drawEntity(var0.plane, var0.x, var0.y, var0.height, 60, var0, 0, -1L, false); // L: 4747
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4751

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1790483961"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 11535
			PacketBufferNode var1 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2658, Client.packetWriter.isaacCipher); // L: 11537
			var1.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var0)); // L: 11538
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 11539
			Client.packetWriter.addNode(var1); // L: 11540
		}
	} // L: 11541
}
