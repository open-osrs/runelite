import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -188292449
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -559769321
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("s")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) { // L: 14
			int var3 = WorldMapCacheName.method4865(var1, var2); // L: 15
			var1 /= var3; // L: 16
			var2 /= var3; // L: 17
			this.inputRate = var1; // L: 18
			this.outputRate = var2; // L: 19
			this.table = new int[var1][14]; // L: 20

			for (int var4 = 0; var4 < var1; ++var4) { // L: 21
				int[] var5 = this.table[var4]; // L: 22
				double var6 = (double)var4 / (double)var1 + 6.0D; // L: 23
				int var8 = (int)Math.floor(1.0D + (var6 - 7.0D)); // L: 24
				if (var8 < 0) { // L: 25
					var8 = 0;
				}

				int var9 = (int)Math.ceil(7.0D + var6); // L: 26
				if (var9 > 14) { // L: 27
					var9 = 14;
				}

				for (double var10 = (double)var2 / (double)var1; var8 < var9; ++var8) { // L: 28 29
					double var12 = ((double)var8 - var6) * 3.141592653589793D; // L: 30
					double var14 = var10; // L: 31
					if (var12 < -1.0E-4D || var12 > 1.0E-4D) {
						var14 = var10 * (Math.sin(var12) / var12);
					}

					var14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var8 - var6)); // L: 33
					var5[var8] = (int)Math.floor(65536.0D * var14 + 0.5D); // L: 34
				}
			}

		}
	} // L: 37

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "71"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) { // L: 40
			int var2 = (int)((long)var1.length * (long)this.outputRate / (long)this.inputRate) + 14; // L: 41
			int[] var3 = new int[var2]; // L: 42
			int var4 = 0; // L: 43
			int var5 = 0; // L: 44

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) { // L: 45
				byte var7 = var1[var6]; // L: 46
				int[] var8 = this.table[var5]; // L: 47

				int var9;
				for (var9 = 0; var9 < 14; ++var9) { // L: 48
					var3[var4 + var9] += var7 * var8[var9];
				}

				var5 += this.outputRate; // L: 49
				var9 = var5 / this.inputRate; // L: 50
				var4 += var9; // L: 51
				var5 -= var9 * this.inputRate; // L: 52
			}

			var1 = new byte[var2]; // L: 54

			for (var6 = 0; var6 < var2; ++var6) { // L: 55
				int var10 = var3[var6] + 32768 >> 16; // L: 56
				if (var10 < -128) { // L: 57
					var1[var6] = -128;
				} else if (var10 > 127) { // L: 58
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10; // L: 59
				}
			}
		}

		return var1; // L: 62
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "679122393"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) { // L: 66
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate);
		}

		return var1; // L: 67
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-100"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) { // L: 71
			var1 = (int)((long)this.outputRate * (long)var1 / (long)this.inputRate) + 6;
		}

		return var1; // L: 72
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1433736231"
	)
	static void method1073(int var0) {
	} // L: 32

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lpj;IB)Z",
		garbageValue = "1"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 376
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 377
			if (var0.readBits(1) != 0) { // L: 378
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 379
			var4 = var0.readBits(13); // L: 380
			boolean var12 = var0.readBits(1) == 1; // L: 381
			if (var12) { // L: 382
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 383
				throw new RuntimeException(); // L: 384
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 386
				var11.index = var1; // L: 387
				if (Players.field1248[var1] != null) { // L: 388
					var11.read(Players.field1248[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 389
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 390
				var7 = Players.Players_regions[var1]; // L: 391
				var8 = var7 >> 28; // L: 392
				var9 = var7 >> 14 & 255; // L: 393
				var10 = var7 & 255; // L: 394
				var11.field1153[0] = Players.field1246[var1]; // L: 395
				var11.plane = (byte)var8; // L: 396
				var11.resetPath((var9 << 13) + var3 - class131.baseX, (var10 << 13) + var4 - TileItem.baseY); // L: 397
				var11.field1055 = false; // L: 398
				return true; // L: 399
			}
		} else if (var2 == 1) { // L: 401
			var3 = var0.readBits(2); // L: 402
			var4 = Players.Players_regions[var1]; // L: 403
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 404
			return false; // L: 405
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 407
				var3 = var0.readBits(5); // L: 408
				var4 = var3 >> 3; // L: 409
				var5 = var3 & 7; // L: 410
				var6 = Players.Players_regions[var1]; // L: 411
				var7 = (var6 >> 28) + var4 & 3; // L: 412
				var8 = var6 >> 14 & 255; // L: 413
				var9 = var6 & 255; // L: 414
				if (var5 == 0) { // L: 415
					--var8; // L: 416
					--var9; // L: 417
				}

				if (var5 == 1) { // L: 419
					--var9;
				}

				if (var5 == 2) { // L: 420
					++var8; // L: 421
					--var9; // L: 422
				}

				if (var5 == 3) { // L: 424
					--var8;
				}

				if (var5 == 4) { // L: 425
					++var8;
				}

				if (var5 == 5) { // L: 426
					--var8; // L: 427
					++var9; // L: 428
				}

				if (var5 == 6) { // L: 430
					++var9;
				}

				if (var5 == 7) { // L: 431
					++var8; // L: 432
					++var9; // L: 433
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 435
				return false; // L: 436
			} else {
				var3 = var0.readBits(18); // L: 438
				var4 = var3 >> 16; // L: 439
				var5 = var3 >> 8 & 255; // L: 440
				var6 = var3 & 255; // L: 441
				var7 = Players.Players_regions[var1]; // L: 442
				var8 = (var7 >> 28) + var4 & 3; // L: 443
				var9 = var5 + (var7 >> 14) & 255; // L: 444
				var10 = var6 + var7 & 255; // L: 445
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 446
				return false; // L: 447
			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-646384904"
	)
	@Export("menuAction")
	static final void menuAction(int var0, int var1, int var2, int var3, String var4, String var5, int var6, int var7) {
		if (var2 >= 2000) { // L: 9020
			var2 -= 2000;
		}

		PacketBufferNode var8;
		if (var2 == 1) { // L: 9021
			Client.mouseCrossX = var6; // L: 9450
			Client.mouseCrossY = var7; // L: 9451
			Client.mouseCrossColor = 2; // L: 9452
			Client.mouseCrossState = 0; // L: 9453
			Client.destinationX = var0; // L: 9454
			Client.destinationY = var1; // L: 9455
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2831, Client.packetWriter.isaacCipher); // L: 9457
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9458
			var8.packetBuffer.writeShort(var3); // L: 9459
			var8.packetBuffer.writeShort(class139.selectedItemId); // L: 9460
			var8.packetBuffer.method7398(TileItem.baseY + var1); // L: 9461
			var8.packetBuffer.method7407(MidiPcmStream.selectedItemWidget); // L: 9462
			var8.packetBuffer.method7349(Calendar.selectedItemSlot); // L: 9463
			var8.packetBuffer.method7349(var0 + class131.baseX); // L: 9464
			Client.packetWriter.addNode(var8); // L: 9465
		} else if (var2 == 2) {
			Client.mouseCrossX = var6; // L: 9206
			Client.mouseCrossY = var7; // L: 9207
			Client.mouseCrossColor = 2; // L: 9208
			Client.mouseCrossState = 0; // L: 9209
			Client.destinationX = var0; // L: 9210
			Client.destinationY = var1; // L: 9211
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2850, Client.packetWriter.isaacCipher); // L: 9212
			var8.packetBuffer.method7493(Client.selectedSpellChildIndex); // L: 9213
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9214
			var8.packetBuffer.method7527(class20.selectedSpellWidget); // L: 9215
			var8.packetBuffer.method7398(Client.field633); // L: 9216
			var8.packetBuffer.method7493(var0 + class131.baseX); // L: 9217
			var8.packetBuffer.method7493(var3); // L: 9218
			var8.packetBuffer.method7493(TileItem.baseY + var1); // L: 9219
			Client.packetWriter.addNode(var8); // L: 9220
		} else if (var2 == 3) {
			Client.mouseCrossX = var6; // L: 9389
			Client.mouseCrossY = var7; // L: 9390
			Client.mouseCrossColor = 2; // L: 9391
			Client.mouseCrossState = 0; // L: 9392
			Client.destinationX = var0; // L: 9393
			Client.destinationY = var1; // L: 9394
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2883, Client.packetWriter.isaacCipher); // L: 9396
			var8.packetBuffer.method7398(var0 + class131.baseX); // L: 9397
			var8.packetBuffer.writeShort(var3); // L: 9398
			var8.packetBuffer.method7493(TileItem.baseY + var1); // L: 9399
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9400
			Client.packetWriter.addNode(var8); // L: 9401
		} else if (var2 == 4) {
			Client.mouseCrossX = var6; // L: 9329
			Client.mouseCrossY = var7; // L: 9330
			Client.mouseCrossColor = 2; // L: 9331
			Client.mouseCrossState = 0; // L: 9332
			Client.destinationX = var0; // L: 9333
			Client.destinationY = var1; // L: 9334
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2896, Client.packetWriter.isaacCipher); // L: 9336
			var8.packetBuffer.method7398(TileItem.baseY + var1); // L: 9337
			var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9338
			var8.packetBuffer.method7349(var0 + class131.baseX); // L: 9339
			var8.packetBuffer.method7398(var3); // L: 9340
			Client.packetWriter.addNode(var8); // L: 9341
		} else if (var2 == 5) {
			Client.mouseCrossX = var6; // L: 9664
			Client.mouseCrossY = var7; // L: 9665
			Client.mouseCrossColor = 2; // L: 9666
			Client.mouseCrossState = 0; // L: 9667
			Client.destinationX = var0; // L: 9668
			Client.destinationY = var1; // L: 9669
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2856, Client.packetWriter.isaacCipher); // L: 9671
			var8.packetBuffer.method7493(var3); // L: 9672
			var8.packetBuffer.method7493(TileItem.baseY + var1); // L: 9673
			var8.packetBuffer.writeShort(var0 + class131.baseX); // L: 9674
			var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9675
			Client.packetWriter.addNode(var8); // L: 9676
		} else if (var2 == 6) {
			Client.mouseCrossX = var6; // L: 9627
			Client.mouseCrossY = var7; // L: 9628
			Client.mouseCrossColor = 2; // L: 9629
			Client.mouseCrossState = 0; // L: 9630
			Client.destinationX = var0; // L: 9631
			Client.destinationY = var1; // L: 9632
			var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2870, Client.packetWriter.isaacCipher); // L: 9634
			var8.packetBuffer.method7493(var3); // L: 9635
			var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9636
			var8.packetBuffer.method7493(TileItem.baseY + var1); // L: 9637
			var8.packetBuffer.method7493(var0 + class131.baseX); // L: 9638
			Client.packetWriter.addNode(var8); // L: 9639
		} else {
			PacketBufferNode var9;
			NPC var13;
			if (var2 == 7) {
				var13 = Client.npcs[var3]; // L: 9088
				if (var13 != null) { // L: 9089
					Client.mouseCrossX = var6; // L: 9090
					Client.mouseCrossY = var7; // L: 9091
					Client.mouseCrossColor = 2; // L: 9092
					Client.mouseCrossState = 0; // L: 9093
					Client.destinationX = var0; // L: 9094
					Client.destinationY = var1; // L: 9095
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2840, Client.packetWriter.isaacCipher); // L: 9097
					var9.packetBuffer.method7398(class139.selectedItemId); // L: 9098
					var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9099
					var9.packetBuffer.method7398(var3); // L: 9100
					var9.packetBuffer.method7527(MidiPcmStream.selectedItemWidget); // L: 9101
					var9.packetBuffer.method7398(Calendar.selectedItemSlot); // L: 9102
					Client.packetWriter.addNode(var9); // L: 9103
				}
			} else if (var2 == 8) {
				var13 = Client.npcs[var3]; // L: 9692
				if (var13 != null) { // L: 9693
					Client.mouseCrossX = var6; // L: 9694
					Client.mouseCrossY = var7; // L: 9695
					Client.mouseCrossColor = 2; // L: 9696
					Client.mouseCrossState = 0; // L: 9697
					Client.destinationX = var0; // L: 9698
					Client.destinationY = var1; // L: 9699
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2901, Client.packetWriter.isaacCipher); // L: 9700
					var9.packetBuffer.method7407(class20.selectedSpellWidget); // L: 9701
					var9.packetBuffer.method7398(Client.field633); // L: 9702
					var9.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9703
					var9.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9704
					var9.packetBuffer.writeShort(var3); // L: 9705
					Client.packetWriter.addNode(var9); // L: 9706
				}
			} else if (var2 == 9) {
				var13 = Client.npcs[var3]; // L: 9611
				if (var13 != null) { // L: 9612
					Client.mouseCrossX = var6; // L: 9613
					Client.mouseCrossY = var7; // L: 9614
					Client.mouseCrossColor = 2; // L: 9615
					Client.mouseCrossState = 0; // L: 9616
					Client.destinationX = var0; // L: 9617
					Client.destinationY = var1; // L: 9618
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2839, Client.packetWriter.isaacCipher); // L: 9620
					var9.packetBuffer.method7349(var3); // L: 9621
					var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9622
					Client.packetWriter.addNode(var9); // L: 9623
				}
			} else if (var2 == 10) {
				var13 = Client.npcs[var3]; // L: 9239
				if (var13 != null) { // L: 9240
					Client.mouseCrossX = var6; // L: 9241
					Client.mouseCrossY = var7; // L: 9242
					Client.mouseCrossColor = 2; // L: 9243
					Client.mouseCrossState = 0; // L: 9244
					Client.destinationX = var0; // L: 9245
					Client.destinationY = var1; // L: 9246
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2865, Client.packetWriter.isaacCipher); // L: 9248
					var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9249
					var9.packetBuffer.method7398(var3); // L: 9250
					Client.packetWriter.addNode(var9); // L: 9251
				}
			} else if (var2 == 11) {
				var13 = Client.npcs[var3]; // L: 9768
				if (var13 != null) { // L: 9769
					Client.mouseCrossX = var6; // L: 9770
					Client.mouseCrossY = var7; // L: 9771
					Client.mouseCrossColor = 2; // L: 9772
					Client.mouseCrossState = 0; // L: 9773
					Client.destinationX = var0; // L: 9774
					Client.destinationY = var1; // L: 9775
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2812, Client.packetWriter.isaacCipher); // L: 9777
					var9.packetBuffer.method7493(var3); // L: 9778
					var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9779
					Client.packetWriter.addNode(var9); // L: 9780
				}
			} else if (var2 == 12) {
				var13 = Client.npcs[var3]; // L: 9265
				if (var13 != null) { // L: 9266
					Client.mouseCrossX = var6; // L: 9267
					Client.mouseCrossY = var7; // L: 9268
					Client.mouseCrossColor = 2; // L: 9269
					Client.mouseCrossState = 0; // L: 9270
					Client.destinationX = var0; // L: 9271
					Client.destinationY = var1; // L: 9272
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2872, Client.packetWriter.isaacCipher); // L: 9274
					var9.packetBuffer.writeShort(var3); // L: 9275
					var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9276
					Client.packetWriter.addNode(var9); // L: 9277
				}
			} else if (var2 == 13) {
				var13 = Client.npcs[var3]; // L: 9509
				if (var13 != null) { // L: 9510
					Client.mouseCrossX = var6; // L: 9511
					Client.mouseCrossY = var7; // L: 9512
					Client.mouseCrossColor = 2; // L: 9513
					Client.mouseCrossState = 0; // L: 9514
					Client.destinationX = var0; // L: 9515
					Client.destinationY = var1; // L: 9516
					var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2876, Client.packetWriter.isaacCipher); // L: 9518
					var9.packetBuffer.method7398(var3); // L: 9519
					var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9520
					Client.packetWriter.addNode(var9); // L: 9521
				}
			} else {
				Player var15;
				if (var2 == 14) {
					var15 = Client.players[var3]; // L: 9536
					if (var15 != null) { // L: 9537
						Client.mouseCrossX = var6; // L: 9538
						Client.mouseCrossY = var7; // L: 9539
						Client.mouseCrossColor = 2; // L: 9540
						Client.mouseCrossState = 0; // L: 9541
						Client.destinationX = var0; // L: 9542
						Client.destinationY = var1; // L: 9543
						var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2864, Client.packetWriter.isaacCipher); // L: 9545
						var9.packetBuffer.method7398(class139.selectedItemId); // L: 9546
						var9.packetBuffer.method7527(MidiPcmStream.selectedItemWidget); // L: 9547
						var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9548
						var9.packetBuffer.method7493(Calendar.selectedItemSlot); // L: 9549
						var9.packetBuffer.method7398(var3); // L: 9550
						Client.packetWriter.addNode(var9); // L: 9551
					}
				} else if (var2 == 15) {
					var15 = Client.players[var3]; // L: 9355
					if (var15 != null) { // L: 9356
						Client.mouseCrossX = var6; // L: 9357
						Client.mouseCrossY = var7; // L: 9358
						Client.mouseCrossColor = 2; // L: 9359
						Client.mouseCrossState = 0; // L: 9360
						Client.destinationX = var0; // L: 9361
						Client.destinationY = var1; // L: 9362
						var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2820, Client.packetWriter.isaacCipher); // L: 9363
						var9.packetBuffer.method7407(class20.selectedSpellWidget); // L: 9364
						var9.packetBuffer.writeShort(Client.field633); // L: 9365
						var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9366
						var9.packetBuffer.method7349(var3); // L: 9367
						var9.packetBuffer.method7398(Client.selectedSpellChildIndex); // L: 9368
						Client.packetWriter.addNode(var9); // L: 9369
					}
				} else if (var2 == 16) {
					Client.mouseCrossX = var6; // L: 9038
					Client.mouseCrossY = var7; // L: 9039
					Client.mouseCrossColor = 2; // L: 9040
					Client.mouseCrossState = 0; // L: 9041
					Client.destinationX = var0; // L: 9042
					Client.destinationY = var1; // L: 9043
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2882, Client.packetWriter.isaacCipher); // L: 9045
					var8.packetBuffer.writeShort(class139.selectedItemId); // L: 9046
					var8.packetBuffer.writeShort(Calendar.selectedItemSlot); // L: 9047
					var8.packetBuffer.writeShort(TileItem.baseY + var1); // L: 9048
					var8.packetBuffer.method7493(var3); // L: 9049
					var8.packetBuffer.method7527(MidiPcmStream.selectedItemWidget); // L: 9050
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9051
					var8.packetBuffer.method7493(var0 + class131.baseX); // L: 9052
					Client.packetWriter.addNode(var8); // L: 9053
				} else if (var2 == 17) {
					Client.mouseCrossX = var6; // L: 9189
					Client.mouseCrossY = var7; // L: 9190
					Client.mouseCrossColor = 2; // L: 9191
					Client.mouseCrossState = 0; // L: 9192
					Client.destinationX = var0; // L: 9193
					Client.destinationY = var1; // L: 9194
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2835, Client.packetWriter.isaacCipher); // L: 9195
					var8.packetBuffer.method7398(TileItem.baseY + var1); // L: 9196
					var8.packetBuffer.writeShort(Client.selectedSpellChildIndex); // L: 9197
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9198
					var8.packetBuffer.writeInt(class20.selectedSpellWidget); // L: 9199
					var8.packetBuffer.writeShort(var0 + class131.baseX); // L: 9200
					var8.packetBuffer.method7493(var3); // L: 9201
					var8.packetBuffer.writeShort(Client.field633); // L: 9202
					Client.packetWriter.addNode(var8); // L: 9203
				} else if (var2 == 18) {
					Client.mouseCrossX = var6; // L: 9555
					Client.mouseCrossY = var7; // L: 9556
					Client.mouseCrossColor = 2; // L: 9557
					Client.mouseCrossState = 0; // L: 9558
					Client.destinationX = var0; // L: 9559
					Client.destinationY = var1; // L: 9560
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2836, Client.packetWriter.isaacCipher); // L: 9562
					var8.packetBuffer.method7398(var0 + class131.baseX); // L: 9563
					var8.packetBuffer.method7349(var3); // L: 9564
					var8.packetBuffer.method7349(TileItem.baseY + var1); // L: 9565
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9566
					Client.packetWriter.addNode(var8); // L: 9567
				} else if (var2 == 19) {
					Client.mouseCrossX = var6; // L: 9716
					Client.mouseCrossY = var7; // L: 9717
					Client.mouseCrossColor = 2; // L: 9718
					Client.mouseCrossState = 0; // L: 9719
					Client.destinationX = var0; // L: 9720
					Client.destinationY = var1; // L: 9721
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2838, Client.packetWriter.isaacCipher); // L: 9723
					var8.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9724
					var8.packetBuffer.method7493(TileItem.baseY + var1); // L: 9725
					var8.packetBuffer.method7493(var3); // L: 9726
					var8.packetBuffer.method7349(var0 + class131.baseX); // L: 9727
					Client.packetWriter.addNode(var8); // L: 9728
				} else if (var2 == 20) {
					Client.mouseCrossX = var6; // L: 9118
					Client.mouseCrossY = var7; // L: 9119
					Client.mouseCrossColor = 2; // L: 9120
					Client.mouseCrossState = 0; // L: 9121
					Client.destinationX = var0; // L: 9122
					Client.destinationY = var1; // L: 9123
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2818, Client.packetWriter.isaacCipher); // L: 9125
					var8.packetBuffer.method7493(var0 + class131.baseX); // L: 9126
					var8.packetBuffer.writeShort(var3); // L: 9127
					var8.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9128
					var8.packetBuffer.method7349(TileItem.baseY + var1); // L: 9129
					Client.packetWriter.addNode(var8); // L: 9130
				} else if (var2 == 21) {
					Client.mouseCrossX = var6; // L: 9411
					Client.mouseCrossY = var7; // L: 9412
					Client.mouseCrossColor = 2; // L: 9413
					Client.mouseCrossState = 0; // L: 9414
					Client.destinationX = var0; // L: 9415
					Client.destinationY = var1; // L: 9416
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2823, Client.packetWriter.isaacCipher); // L: 9418
					var8.packetBuffer.method7349(TileItem.baseY + var1); // L: 9419
					var8.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9420
					var8.packetBuffer.writeShort(var3); // L: 9421
					var8.packetBuffer.method7398(var0 + class131.baseX); // L: 9422
					Client.packetWriter.addNode(var8); // L: 9423
				} else if (var2 == 22) {
					Client.mouseCrossX = var6; // L: 9742
					Client.mouseCrossY = var7; // L: 9743
					Client.mouseCrossColor = 2; // L: 9744
					Client.mouseCrossState = 0; // L: 9745
					Client.destinationX = var0; // L: 9746
					Client.destinationY = var1; // L: 9747
					var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2868, Client.packetWriter.isaacCipher); // L: 9749
					var8.packetBuffer.method7398(var0 + class131.baseX); // L: 9750
					var8.packetBuffer.method7349(TileItem.baseY + var1); // L: 9751
					var8.packetBuffer.method7398(var3); // L: 9752
					var8.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9753
					Client.packetWriter.addNode(var8); // L: 9754
				} else if (var2 == 23) {
					if (Client.isMenuOpen) { // L: 9642
						class7.scene.setViewportWalking(); // L: 9643
					} else {
						class7.scene.menuOpen(class20.Client_plane, var0, var1, true); // L: 9646
					}
				} else {
					PacketBufferNode var12;
					Widget var16;
					if (var2 == 24) {
						var16 = ChatChannel.getWidget(var1); // L: 9318
						boolean var11 = true; // L: 9319
						if (var16.contentType > 0) { // L: 9320
							var11 = class19.method329(var16);
						}

						if (var11) { // L: 9321
							var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher); // L: 9323
							var12.packetBuffer.writeInt(var1); // L: 9324
							Client.packetWriter.addNode(var12); // L: 9325
						}
					} else {
						if (var2 == 25) {
							var16 = class126.getWidgetChild(var1, var0); // L: 9801
							if (var16 != null) { // L: 9802
								HealthBar.Widget_runOnTargetLeave(); // L: 9803
								UrlRequest.selectSpell(var1, var0, class404.Widget_unpackTargetMask(class363.getWidgetFlags(var16)), var16.itemId); // L: 9804
								Client.isItemSelected = 0; // L: 9805
								Client.selectedSpellActionName = SecureRandomFuture.Widget_getSpellActionName(var16); // L: 9806
								if (Client.selectedSpellActionName == null) { // L: 9807
									Client.selectedSpellActionName = "null";
								}

								if (var16.isIf3) { // L: 9808
									Client.selectedSpellName = var16.dataText + UserComparator5.colorStartTag(16777215);
								} else {
									Client.selectedSpellName = UserComparator5.colorStartTag(65280) + var16.spellName + UserComparator5.colorStartTag(16777215); // L: 9809
								}
							}

							return; // L: 9811
						}

						if (var2 == 26) {
							class4.method28(); // L: 9133
						} else {
							int var10;
							Widget var14;
							if (var2 == 28) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher); // L: 9282
								var8.packetBuffer.writeInt(var1); // L: 9283
								Client.packetWriter.addNode(var8); // L: 9284
								var14 = ChatChannel.getWidget(var1); // L: 9285
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9286
									var10 = var14.cs1Instructions[0][1]; // L: 9287
									Varps.Varps_main[var10] = 1 - Varps.Varps_main[var10]; // L: 9288
									class281.changeGameOptions(var10); // L: 9289
								}
							} else if (var2 == 29) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2842, Client.packetWriter.isaacCipher); // L: 9496
								var8.packetBuffer.writeInt(var1); // L: 9497
								Client.packetWriter.addNode(var8); // L: 9498
								var14 = ChatChannel.getWidget(var1); // L: 9499
								if (var14.cs1Instructions != null && var14.cs1Instructions[0][0] == 5) { // L: 9500
									var10 = var14.cs1Instructions[0][1]; // L: 9501
									if (Varps.Varps_main[var10] != var14.cs1ComparisonValues[0]) { // L: 9502
										Varps.Varps_main[var10] = var14.cs1ComparisonValues[0]; // L: 9503
										class281.changeGameOptions(var10); // L: 9504
									}
								}
							} else if (var2 == 30) {
								if (Client.meslayerContinueWidget == null) { // L: 9404
									class288.resumePauseWidget(var1, var0); // L: 9405
									Client.meslayerContinueWidget = class126.getWidgetChild(var1, var0); // L: 9406
									SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget); // L: 9407
								}
							} else if (var2 == 31) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2804, Client.packetWriter.isaacCipher); // L: 9294
								var8.packetBuffer.method7349(var0); // L: 9295
								var8.packetBuffer.writeShort(class139.selectedItemId); // L: 9296
								var8.packetBuffer.method7349(var3); // L: 9297
								var8.packetBuffer.writeInt(MidiPcmStream.selectedItemWidget); // L: 9298
								var8.packetBuffer.writeIntME(var1); // L: 9299
								var8.packetBuffer.method7398(Calendar.selectedItemSlot); // L: 9300
								Client.packetWriter.addNode(var8); // L: 9301
								Client.field582 = 0; // L: 9302
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9303
								Client.field599 = var0; // L: 9304
							} else if (var2 == 32) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2886, Client.packetWriter.isaacCipher); // L: 9571
								var8.packetBuffer.writeShort(var0); // L: 9572
								var8.packetBuffer.writeIntME(var1); // L: 9573
								var8.packetBuffer.method7493(Client.selectedSpellChildIndex); // L: 9574
								var8.packetBuffer.writeShort(var3); // L: 9575
								var8.packetBuffer.writeInt(class20.selectedSpellWidget); // L: 9576
								Client.packetWriter.addNode(var8); // L: 9577
								Client.field582 = 0; // L: 9578
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9579
								Client.field599 = var0; // L: 9580
							} else if (var2 == 33) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2874, Client.packetWriter.isaacCipher); // L: 9308
								var8.packetBuffer.writeInt(var1); // L: 9309
								var8.packetBuffer.method7349(var0); // L: 9310
								var8.packetBuffer.method7349(var3); // L: 9311
								Client.packetWriter.addNode(var8); // L: 9312
								Client.field582 = 0; // L: 9313
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9314
								Client.field599 = var0; // L: 9315
							} else if (var2 == 34) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2833, Client.packetWriter.isaacCipher); // L: 9427
								var8.packetBuffer.method7398(var3); // L: 9428
								var8.packetBuffer.method7398(var0); // L: 9429
								var8.packetBuffer.method7407(var1); // L: 9430
								Client.packetWriter.addNode(var8); // L: 9431
								Client.field582 = 0; // L: 9432
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9433
								Client.field599 = var0; // L: 9434
							} else if (var2 == 35) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2817, Client.packetWriter.isaacCipher); // L: 9485
								var8.packetBuffer.method7349(var0); // L: 9486
								var8.packetBuffer.method7349(var3); // L: 9487
								var8.packetBuffer.writeInt(var1); // L: 9488
								Client.packetWriter.addNode(var8); // L: 9489
								Client.field582 = 0; // L: 9490
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9491
								Client.field599 = var0; // L: 9492
							} else if (var2 == 36) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2847, Client.packetWriter.isaacCipher); // L: 9164
								var8.packetBuffer.method7527(var1); // L: 9165
								var8.packetBuffer.method7349(var0); // L: 9166
								var8.packetBuffer.method7398(var3); // L: 9167
								Client.packetWriter.addNode(var8); // L: 9168
								Client.field582 = 0; // L: 9169
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9170
								Client.field599 = var0; // L: 9171
							} else if (var2 == 37) {
								var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2802, Client.packetWriter.isaacCipher); // L: 9345
								var8.packetBuffer.writeIntME(var1); // L: 9346
								var8.packetBuffer.method7493(var0); // L: 9347
								var8.packetBuffer.writeShort(var3); // L: 9348
								Client.packetWriter.addNode(var8); // L: 9349
								Client.field582 = 0; // L: 9350
								WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9351
								Client.field599 = var0; // L: 9352
							} else {
								if (var2 == 38) {
									HealthBar.Widget_runOnTargetLeave(); // L: 9599
									var16 = ChatChannel.getWidget(var1); // L: 9600
									Client.isItemSelected = 1; // L: 9601
									Calendar.selectedItemSlot = var0; // L: 9602
									MidiPcmStream.selectedItemWidget = var1; // L: 9603
									class139.selectedItemId = var3; // L: 9604
									SecureRandomCallable.invalidateWidget(var16); // L: 9605
									Client.selectedItemName = UserComparator5.colorStartTag(16748608) + UserComparator6.ItemDefinition_get(var3).name + UserComparator5.colorStartTag(16777215); // L: 9606
									if (Client.selectedItemName == null) { // L: 9607
										Client.selectedItemName = "null";
									}

									return; // L: 9608
								}

								if (var2 == 39) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2844, Client.packetWriter.isaacCipher); // L: 9526
									var8.packetBuffer.writeIntME(var1); // L: 9527
									var8.packetBuffer.method7493(var0); // L: 9528
									var8.packetBuffer.writeShort(var3); // L: 9529
									Client.packetWriter.addNode(var8); // L: 9530
									Client.field582 = 0; // L: 9531
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9532
									Client.field599 = var0; // L: 9533
								} else if (var2 == 40) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2871, Client.packetWriter.isaacCipher); // L: 9732
									var8.packetBuffer.writeInt(var1); // L: 9733
									var8.packetBuffer.method7493(var3); // L: 9734
									var8.packetBuffer.method7493(var0); // L: 9735
									Client.packetWriter.addNode(var8); // L: 9736
									Client.field582 = 0; // L: 9737
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9738
									Client.field599 = var0; // L: 9739
								} else if (var2 == 41) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2810, Client.packetWriter.isaacCipher); // L: 9758
									var8.packetBuffer.method7398(var3); // L: 9759
									var8.packetBuffer.writeInt(var1); // L: 9760
									var8.packetBuffer.method7398(var0); // L: 9761
									Client.packetWriter.addNode(var8); // L: 9762
									Client.field582 = 0; // L: 9763
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9764
									Client.field599 = var0; // L: 9765
								} else if (var2 == 42) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2803, Client.packetWriter.isaacCipher); // L: 9137
									var8.packetBuffer.method7493(var0); // L: 9138
									var8.packetBuffer.writeIntME(var1); // L: 9139
									var8.packetBuffer.method7398(var3); // L: 9140
									Client.packetWriter.addNode(var8); // L: 9141
									Client.field582 = 0; // L: 9142
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9143
									Client.field599 = var0; // L: 9144
								} else if (var2 == 43) {
									var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2843, Client.packetWriter.isaacCipher); // L: 9108
									var8.packetBuffer.writeInt(var1); // L: 9109
									var8.packetBuffer.writeShort(var0); // L: 9110
									var8.packetBuffer.writeShort(var3); // L: 9111
									Client.packetWriter.addNode(var8); // L: 9112
									Client.field582 = 0; // L: 9113
									WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9114
									Client.field599 = var0; // L: 9115
								} else if (var2 == 44) {
									var15 = Client.players[var3]; // L: 9072
									if (var15 != null) { // L: 9073
										Client.mouseCrossX = var6; // L: 9074
										Client.mouseCrossY = var7; // L: 9075
										Client.mouseCrossColor = 2; // L: 9076
										Client.mouseCrossState = 0; // L: 9077
										Client.destinationX = var0; // L: 9078
										Client.destinationY = var1; // L: 9079
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2887, Client.packetWriter.isaacCipher); // L: 9081
										var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9082
										var9.packetBuffer.method7398(var3); // L: 9083
										Client.packetWriter.addNode(var9); // L: 9084
									}
								} else if (var2 == 45) {
									var15 = Client.players[var3]; // L: 9373
									if (var15 != null) { // L: 9374
										Client.mouseCrossX = var6; // L: 9375
										Client.mouseCrossY = var7; // L: 9376
										Client.mouseCrossColor = 2; // L: 9377
										Client.mouseCrossState = 0; // L: 9378
										Client.destinationX = var0; // L: 9379
										Client.destinationY = var1; // L: 9380
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2813, Client.packetWriter.isaacCipher); // L: 9382
										var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9383
										var9.packetBuffer.method7493(var3); // L: 9384
										Client.packetWriter.addNode(var9); // L: 9385
									}
								} else if (var2 == 46) {
									var15 = Client.players[var3]; // L: 9583
									if (var15 != null) { // L: 9584
										Client.mouseCrossX = var6; // L: 9585
										Client.mouseCrossY = var7; // L: 9586
										Client.mouseCrossColor = 2; // L: 9587
										Client.mouseCrossState = 0; // L: 9588
										Client.destinationX = var0; // L: 9589
										Client.destinationY = var1; // L: 9590
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2827, Client.packetWriter.isaacCipher); // L: 9592
										var9.packetBuffer.method7398(var3); // L: 9593
										var9.packetBuffer.method7343(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9594
										Client.packetWriter.addNode(var9); // L: 9595
									}
								} else if (var2 == 47) {
									var15 = Client.players[var3]; // L: 9468
									if (var15 != null) { // L: 9469
										Client.mouseCrossX = var6; // L: 9470
										Client.mouseCrossY = var7; // L: 9471
										Client.mouseCrossColor = 2; // L: 9472
										Client.mouseCrossState = 0; // L: 9473
										Client.destinationX = var0; // L: 9474
										Client.destinationY = var1; // L: 9475
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2807, Client.packetWriter.isaacCipher); // L: 9477
										var9.packetBuffer.method7349(var3); // L: 9478
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9479
										Client.packetWriter.addNode(var9); // L: 9480
									}
								} else if (var2 == 48) {
									var15 = Client.players[var3]; // L: 9147
									if (var15 != null) { // L: 9148
										Client.mouseCrossX = var6; // L: 9149
										Client.mouseCrossY = var7; // L: 9150
										Client.mouseCrossColor = 2; // L: 9151
										Client.mouseCrossState = 0; // L: 9152
										Client.destinationX = var0; // L: 9153
										Client.destinationY = var1; // L: 9154
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2892, Client.packetWriter.isaacCipher); // L: 9156
										var9.packetBuffer.writeShort(var3); // L: 9157
										var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9158
										Client.packetWriter.addNode(var9); // L: 9159
									}
								} else if (var2 == 49) {
									var15 = Client.players[var3]; // L: 9056
									if (var15 != null) { // L: 9057
										Client.mouseCrossX = var6; // L: 9058
										Client.mouseCrossY = var7; // L: 9059
										Client.mouseCrossColor = 2; // L: 9060
										Client.mouseCrossState = 0; // L: 9061
										Client.destinationX = var0; // L: 9062
										Client.destinationY = var1; // L: 9063
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2863, Client.packetWriter.isaacCipher); // L: 9065
										var9.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9066
										var9.packetBuffer.method7398(var3); // L: 9067
										Client.packetWriter.addNode(var9); // L: 9068
									}
								} else if (var2 == 50) {
									var15 = Client.players[var3]; // L: 9223
									if (var15 != null) { // L: 9224
										Client.mouseCrossX = var6; // L: 9225
										Client.mouseCrossY = var7; // L: 9226
										Client.mouseCrossColor = 2; // L: 9227
										Client.mouseCrossState = 0; // L: 9228
										Client.destinationX = var0; // L: 9229
										Client.destinationY = var1; // L: 9230
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2906, Client.packetWriter.isaacCipher); // L: 9232
										var9.packetBuffer.method7362(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9233
										var9.packetBuffer.method7493(var3); // L: 9234
										Client.packetWriter.addNode(var9); // L: 9235
									}
								} else if (var2 == 51) {
									var15 = Client.players[var3]; // L: 9022
									if (var15 != null) { // L: 9023
										Client.mouseCrossX = var6; // L: 9024
										Client.mouseCrossY = var7; // L: 9025
										Client.mouseCrossColor = 2; // L: 9026
										Client.mouseCrossState = 0; // L: 9027
										Client.destinationX = var0; // L: 9028
										Client.destinationY = var1; // L: 9029
										var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2885, Client.packetWriter.isaacCipher); // L: 9031
										var9.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9032
										var9.packetBuffer.method7398(var3); // L: 9033
										Client.packetWriter.addNode(var9); // L: 9034
									}
								} else if (var2 != 57 && var2 != 1007) {
									if (var2 == 58) {
										var16 = class126.getWidgetChild(var1, var0); // L: 9650
										if (var16 != null) { // L: 9651
											var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2809, Client.packetWriter.isaacCipher); // L: 9653
											var9.packetBuffer.writeShort(var16.itemId); // L: 9654
											var9.packetBuffer.method7527(var1); // L: 9655
											var9.packetBuffer.method7493(Client.selectedSpellChildIndex); // L: 9656
											var9.packetBuffer.method7398(var0); // L: 9657
											var9.packetBuffer.writeIntME(class20.selectedSpellWidget); // L: 9658
											var9.packetBuffer.writeShort(Client.field633); // L: 9659
											Client.packetWriter.addNode(var9); // L: 9660
										}
									} else if (var2 == 1001) {
										Client.mouseCrossX = var6; // L: 9174
										Client.mouseCrossY = var7; // L: 9175
										Client.mouseCrossColor = 2; // L: 9176
										Client.mouseCrossState = 0; // L: 9177
										Client.destinationX = var0; // L: 9178
										Client.destinationY = var1; // L: 9179
										var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2826, Client.packetWriter.isaacCipher); // L: 9181
										var8.packetBuffer.method7398(TileItem.baseY + var1); // L: 9182
										var8.packetBuffer.method7390(KeyHandler.KeyHandler_pressedKeys[82] ? 1 : 0); // L: 9183
										var8.packetBuffer.method7493(var0 + class131.baseX); // L: 9184
										var8.packetBuffer.method7349(var3); // L: 9185
										Client.packetWriter.addNode(var8); // L: 9186
									} else if (var2 == 1002) {
										Client.mouseCrossX = var6; // L: 9255
										Client.mouseCrossY = var7; // L: 9256
										Client.mouseCrossColor = 2; // L: 9257
										Client.mouseCrossState = 0; // L: 9258
										var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2815, Client.packetWriter.isaacCipher); // L: 9260
										var8.packetBuffer.method7349(var3); // L: 9261
										Client.packetWriter.addNode(var8); // L: 9262
									} else if (var2 == 1003) {
										Client.mouseCrossX = var6; // L: 9784
										Client.mouseCrossY = var7; // L: 9785
										Client.mouseCrossColor = 2; // L: 9786
										Client.mouseCrossState = 0; // L: 9787
										var13 = Client.npcs[var3]; // L: 9788
										if (var13 != null) { // L: 9789
											NPCComposition var17 = var13.definition; // L: 9790
											if (var17.transforms != null) { // L: 9791
												var17 = var17.transform();
											}

											if (var17 != null) { // L: 9792
												var12 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2829, Client.packetWriter.isaacCipher); // L: 9794
												var12.packetBuffer.method7398(var17.id); // L: 9795
												Client.packetWriter.addNode(var12); // L: 9796
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var6; // L: 9440
										Client.mouseCrossY = var7; // L: 9441
										Client.mouseCrossColor = 2; // L: 9442
										Client.mouseCrossState = 0; // L: 9443
										var8 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher); // L: 9445
										var8.packetBuffer.method7398(var3); // L: 9446
										Client.packetWriter.addNode(var8); // L: 9447
									} else if (var2 == 1005) {
										var16 = ChatChannel.getWidget(var1); // L: 9679
										if (var16 != null && var16.itemQuantities[var0] >= 100000) { // L: 9680
											class194.addGameMessage(27, "", var16.itemQuantities[var0] + " x " + UserComparator6.ItemDefinition_get(var3).name);
										} else {
											var9 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2902, Client.packetWriter.isaacCipher); // L: 9683
											var9.packetBuffer.method7398(var3); // L: 9684
											Client.packetWriter.addNode(var9); // L: 9685
										}

										Client.field582 = 0; // L: 9687
										WorldMapDecoration.field2722 = ChatChannel.getWidget(var1); // L: 9688
										Client.field599 = var0; // L: 9689
									} else if (var2 == 1010 || var2 == 1011 || var2 == 1009 || var2 == 1012 || var2 == 1008) {
										Varcs.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1)); // L: 9437
									}
								} else {
									var16 = class126.getWidgetChild(var1, var0); // L: 9710
									if (var16 != null) { // L: 9711
										SoundCache.widgetDefaultMenuAction(var3, var1, var0, var16.itemId, var5); // L: 9712
									}
								}
							}
						}
					}
				}
			}
		}

		if (Client.isItemSelected != 0) { // L: 9813
			Client.isItemSelected = 0; // L: 9814
			SecureRandomCallable.invalidateWidget(ChatChannel.getWidget(MidiPcmStream.selectedItemWidget)); // L: 9815
		}

		if (Client.isSpellSelected) { // L: 9817
			HealthBar.Widget_runOnTargetLeave();
		}

		if (WorldMapDecoration.field2722 != null && Client.field582 == 0) { // L: 9818
			SecureRandomCallable.invalidateWidget(WorldMapDecoration.field2722);
		}

	} // L: 9819

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-66"
	)
	static void method1082(Buffer var0) {
		if (Client.randomDatData != null) { // L: 12661
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 12662
		} else {
			byte[] var1 = class118.method2684(); // L: 12665
			var0.writeBytes(var1, 0, var1.length); // L: 12666
		}
	} // L: 12663 12667
}
