import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("c")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12774

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;I)I",
		garbageValue = "1461383419"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12777
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12778
				if (Client.worldId == var1.world) { // L: 12779
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12780
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12782
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12790
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12786
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "2109757925"
	)
	public static byte[] method1147(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var3 = (byte[])((byte[])var0); // L: 10
			return var1 ? TaskHandler.method3047(var3) : var3; // L: 11
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 14
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 15
			return var2.get(); // L: 16
		} else {
			throw new IllegalArgumentException(); // L: 18
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "48029406"
	)
	static final void method1148() {
		class1.method12(class127.field1498, class117.field1433, class33.field243); // L: 4528
		SecureRandomFuture.method2025(class142.field1615, ApproximateRouteStrategy.field460); // L: 4529
		if (UserComparator7.cameraX == class127.field1498 && AbstractByteArrayCopier.cameraY == class117.field1433 && class33.field243 == UserComparator10.cameraZ && class142.field1615 == UserComparator7.cameraPitch && ApproximateRouteStrategy.field460 == class379.cameraYaw) { // L: 4530
			Client.field724 = false; // L: 4531
			Client.isCameraLocked = false; // L: 4532
			PlayerComposition.field3193 = 0; // L: 4533
			MusicPatchNode.field3150 = 0; // L: 4534
			ModeWhere.field3951 = 0; // L: 4535
			WorldMapSection1.field2755 = 0; // L: 4536
			ChatChannel.field956 = 0; // L: 4537
			ItemComposition.field2012 = 0; // L: 4538
			Renderable.field2358 = 0; // L: 4539
			class167.field1811 = 0; // L: 4540
			VarpDefinition.field1748 = 0; // L: 4541
			UserComparator9.field1335 = 0; // L: 4542
		}

	} // L: 4545

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(ZLpj;B)V",
		garbageValue = "6"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field597 = 0; // L: 8272
		Client.field520 = 0; // L: 8273
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 8275
		var2.importIndex(); // L: 8276
		int var3 = var2.readBits(8); // L: 8277
		int var4;
		if (var3 < Client.npcCount) { // L: 8278
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 8279
				Client.field598[++Client.field597 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 8281
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 8282

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) { // L: 8283
				var5 = Client.npcIndices[var4]; // L: 8284
				NPC var16 = Client.npcs[var5]; // L: 8285
				var7 = var2.readBits(1); // L: 8286
				if (var7 == 0) { // L: 8287
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8288
					var16.npcCycle = Client.cycle; // L: 8289
				} else {
					var8 = var2.readBits(2); // L: 8292
					if (var8 == 0) { // L: 8293
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8294
						var16.npcCycle = Client.cycle; // L: 8295
						Client.field605[++Client.field520 - 1] = var5; // L: 8296
					} else if (var8 == 1) { // L: 8299
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8300
						var16.npcCycle = Client.cycle; // L: 8301
						var9 = var2.readBits(3); // L: 8302
						var16.method2319(var9, class185.field2123); // L: 8303
						var10 = var2.readBits(1); // L: 8304
						if (var10 == 1) { // L: 8305
							Client.field605[++Client.field520 - 1] = var5;
						}
					} else if (var8 == 2) { // L: 8308
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 8309
						var16.npcCycle = Client.cycle; // L: 8310
						if (var2.readBits(1) == 1) { // L: 8311
							var9 = var2.readBits(3); // L: 8312
							var16.method2319(var9, class185.field2122); // L: 8313
							var10 = var2.readBits(3); // L: 8314
							var16.method2319(var10, class185.field2122); // L: 8315
						} else {
							var9 = var2.readBits(3); // L: 8318
							var16.method2319(var9, class185.field2120); // L: 8319
						}

						var9 = var2.readBits(1); // L: 8321
						if (var9 == 1) { // L: 8322
							Client.field605[++Client.field520 - 1] = var5;
						}
					} else if (var8 == 3) { // L: 8325
						Client.field598[++Client.field597 - 1] = var5; // L: 8326
					}
				}
			}

			int var6;
			int var14;
			NPC var15;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 8333
				var14 = var1.readBits(15); // L: 8334
				if (var14 == 32767) { // L: 8335
					break;
				}

				boolean var17 = false; // L: 8336
				if (Client.npcs[var14] == null) { // L: 8337
					Client.npcs[var14] = new NPC(); // L: 8338
					var17 = true; // L: 8339
				}

				var15 = Client.npcs[var14]; // L: 8341
				Client.npcIndices[++Client.npcCount - 1] = var14; // L: 8342
				var15.npcCycle = Client.cycle; // L: 8343
				if (class12.field72) { // L: 8347
					boolean var18 = var1.readBits(1) == 1; // L: 8348
					if (var18) { // L: 8349
						var1.readBits(32); // L: 8350
					}

					var9 = var1.readBits(1); // L: 8352
					if (var9 == 1) { // L: 8353
						Client.field605[++Client.field520 - 1] = var14;
					}

					var10 = Client.defaultRotations[var1.readBits(3)]; // L: 8354
					if (var17) { // L: 8355
						var15.orientation = var15.rotation = var10;
					}

					if (var0) { // L: 8356
						var7 = var1.readBits(8); // L: 8357
						if (var7 > 127) { // L: 8358
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 8361
						if (var7 > 15) { // L: 8362
							var7 -= 32;
						}
					}

					var5 = var1.readBits(1); // L: 8364
					var15.definition = WorldMapLabelSize.getNpcDefinition(var1.readBits(14)); // L: 8365
					if (var0) { // L: 8366
						var6 = var1.readBits(8); // L: 8367
						if (var6 > 127) { // L: 8368
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 8371
						if (var6 > 15) { // L: 8372
							var6 -= 32;
						}
					}
				} else {
					var5 = var1.readBits(1); // L: 8376
					var15.definition = WorldMapLabelSize.getNpcDefinition(var1.readBits(14)); // L: 8377
					var8 = var1.readBits(1); // L: 8378
					if (var8 == 1) { // L: 8379
						Client.field605[++Client.field520 - 1] = var14;
					}

					if (var0) { // L: 8380
						var6 = var1.readBits(8); // L: 8381
						if (var6 > 127) { // L: 8382
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 8385
						if (var6 > 15) { // L: 8386
							var6 -= 32;
						}
					}

					boolean var19 = var1.readBits(1) == 1; // L: 8388
					if (var19) { // L: 8389
						var1.readBits(32); // L: 8390
					}

					if (var0) { // L: 8392
						var7 = var1.readBits(8); // L: 8393
						if (var7 > 127) { // L: 8394
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5); // L: 8397
						if (var7 > 15) { // L: 8398
							var7 -= 32;
						}
					}

					var10 = Client.defaultRotations[var1.readBits(3)]; // L: 8400
					if (var17) { // L: 8401
						var15.orientation = var15.rotation = var10;
					}
				}

				var15.field1120 = var15.definition.size; // L: 8403
				var15.field1149 = var15.definition.rotation; // L: 8404
				if (var15.field1149 == 0) { // L: 8405
					var15.rotation = 0;
				}

				var15.walkSequence = var15.definition.walkSequence; // L: 8406
				var15.walkBackSequence = var15.definition.walkBackSequence; // L: 8407
				var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 8408
				var15.walkRightSequence = var15.definition.walkRightSequence; // L: 8409
				var15.idleSequence = var15.definition.idleSequence; // L: 8410
				var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 8411
				var15.turnRightSequence = var15.definition.turnRightSequence; // L: 8412
				var15.method2315(class340.localPlayer.pathX[0] + var6, class340.localPlayer.pathY[0] + var7, var5 == 1); // L: 8413
			}

			var1.exportIndex(); // L: 8415

			for (var14 = 0; var14 < Client.field520; ++var14) { // L: 8418
				var3 = Client.field605[var14]; // L: 8419
				var15 = Client.npcs[var3]; // L: 8420
				var5 = var1.readUnsignedByte(); // L: 8421
				if (class12.field72 && (var5 & 4) != 0) { // L: 8422
					var6 = var1.readUnsignedByte(); // L: 8423
					var5 += var6 << 8; // L: 8424
				}

				if ((var5 & 8) != 0) { // L: 8426
					var6 = var1.method7401(); // L: 8427
					var7 = var1.method7403(); // L: 8428
					if (class12.field72) { // L: 8429
						var15.field1118 = var1.method7394() == 1; // L: 8430
					}

					var8 = var15.x - (var6 - class131.baseX - class131.baseX) * 64; // L: 8432
					var9 = var15.y - (var7 - TileItem.baseY - TileItem.baseY) * 64; // L: 8433
					if (var8 != 0 || var9 != 0) { // L: 8434
						var15.field1122 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 1) != 0) { // L: 8436
					var6 = var1.method7392(); // L: 8437
					int var11;
					int var12;
					if (var6 > 0) { // L: 8438
						for (var7 = 0; var7 < var6; ++var7) { // L: 8439
							var9 = -1; // L: 8441
							var10 = -1; // L: 8442
							var11 = -1; // L: 8443
							var8 = var1.readUShortSmart(); // L: 8444
							if (var8 == 32767) { // L: 8445
								var8 = var1.readUShortSmart(); // L: 8446
								var10 = var1.readUShortSmart(); // L: 8447
								var9 = var1.readUShortSmart(); // L: 8448
								var11 = var1.readUShortSmart(); // L: 8449
							} else if (var8 != 32766) { // L: 8451
								var10 = var1.readUShortSmart(); // L: 8452
							} else {
								var8 = -1; // L: 8454
							}

							var12 = var1.readUShortSmart(); // L: 8455
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12); // L: 8456
						}
					}

					var7 = var1.method7520(); // L: 8459
					if (var7 > 0) { // L: 8460
						for (var8 = 0; var8 < var7; ++var8) { // L: 8461
							var9 = var1.readUShortSmart(); // L: 8462
							var10 = var1.readUShortSmart(); // L: 8463
							if (var10 != 32767) { // L: 8464
								var11 = var1.readUShortSmart(); // L: 8465
								var12 = var1.method7392(); // L: 8466
								int var13 = var10 > 0 ? var1.method7394() : var12; // L: 8467
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13); // L: 8468
							} else {
								var15.removeHealthBar(var9); // L: 8470
							}
						}
					}
				}

				if ((var5 & 16) != 0) { // L: 8474
					var15.overheadText = var1.readStringCp1252NullTerminated(); // L: 8475
					var15.overheadTextCyclesRemaining = 100; // L: 8476
				}

				if ((var5 & 2) != 0) { // L: 8478
					var15.spotAnimation = var1.method7403(); // L: 8479
					var6 = var1.method7412(); // L: 8480
					var15.field1131 = var6 >> 16; // L: 8481
					var15.field1130 = (var6 & 65535) + Client.cycle; // L: 8482
					var15.spotAnimationFrame = 0; // L: 8483
					var15.spotAnimationFrameCycle = 0; // L: 8484
					if (var15.field1130 > Client.cycle) { // L: 8485
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) { // L: 8486
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 512) != 0) { // L: 8488
					var15.field1119 = var1.method7411(); // L: 8489
				}

				if ((var5 & 64) != 0) { // L: 8491
					var6 = var1.method7403(); // L: 8492
					if (var6 == 65535) { // L: 8493
						var6 = -1;
					}

					var7 = var1.method7394(); // L: 8494
					if (var6 == var15.sequence && var6 != -1) { // L: 8495
						var8 = UserComparator5.SequenceDefinition_get(var6).field2078; // L: 8496
						if (var8 == 1) { // L: 8497
							var15.sequenceFrame = 0; // L: 8498
							var15.sequenceFrameCycle = 0; // L: 8499
							var15.sequenceDelay = var7; // L: 8500
							var15.field1126 = 0; // L: 8501
						}

						if (var8 == 2) { // L: 8503
							var15.field1126 = 0; // L: 8504
						}
					} else if (var6 == -1 || var15.sequence == -1 || UserComparator5.SequenceDefinition_get(var6).field2092 >= UserComparator5.SequenceDefinition_get(var15.sequence).field2092) { // L: 8507
						var15.sequence = var6; // L: 8508
						var15.sequenceFrame = 0; // L: 8509
						var15.sequenceFrameCycle = 0; // L: 8510
						var15.sequenceDelay = var7; // L: 8511
						var15.field1126 = 0; // L: 8512
						var15.field1098 = var15.pathLength; // L: 8513
					}
				}

				if (class12.field72 && (var5 & 1024) != 0 || !class12.field72 && (var5 & 4) != 0) { // L: 8517
					var15.field1132 = var1.method7396(); // L: 8518
					var15.field1134 = var1.readByte(); // L: 8519
					var15.field1133 = var1.method7396(); // L: 8520
					var15.field1135 = var1.readByte(); // L: 8521
					var15.field1136 = var1.method7403() + Client.cycle; // L: 8522
					var15.field1157 = var1.readUnsignedShort() + Client.cycle; // L: 8523
					var15.field1138 = var1.method7403(); // L: 8524
					var15.pathLength = 1; // L: 8525
					var15.field1098 = 0; // L: 8526
					var15.field1132 += var15.pathX[0]; // L: 8527
					var15.field1134 += var15.pathY[0]; // L: 8528
					var15.field1133 += var15.pathX[0]; // L: 8529
					var15.field1135 += var15.pathY[0]; // L: 8530
				}

				if ((var5 & 128) != 0) { // L: 8532
					var15.targetIndex = var1.method7401(); // L: 8533
					if (var15.targetIndex == 65535) { // L: 8534
						var15.targetIndex = -1;
					}
				}

				if ((var5 & 256) != 0) { // L: 8536
					var15.field1141 = Client.cycle + var1.readUnsignedShort(); // L: 8537
					var15.field1140 = Client.cycle + var1.method7401(); // L: 8538
					var15.field1143 = var1.readByte(); // L: 8539
					var15.field1144 = var1.method7396(); // L: 8540
					var15.field1095 = var1.method7396(); // L: 8541
					var15.field1146 = (byte)var1.readUnsignedByte(); // L: 8542
				}

				if ((var5 & 32) != 0) { // L: 8544
					var15.definition = WorldMapLabelSize.getNpcDefinition(var1.method7401()); // L: 8545
					var15.field1120 = var15.definition.size; // L: 8546
					var15.field1149 = var15.definition.rotation; // L: 8547
					var15.walkSequence = var15.definition.walkSequence; // L: 8548
					var15.walkBackSequence = var15.definition.walkBackSequence; // L: 8549
					var15.walkLeftSequence = var15.definition.walkLeftSequence; // L: 8550
					var15.walkRightSequence = var15.definition.walkRightSequence; // L: 8551
					var15.idleSequence = var15.definition.idleSequence; // L: 8552
					var15.turnLeftSequence = var15.definition.turnLeftSequence; // L: 8553
					var15.turnRightSequence = var15.definition.turnRightSequence; // L: 8554
				}
			}

			for (var14 = 0; var14 < Client.field597; ++var14) { // L: 8558
				var3 = Client.field598[var14]; // L: 8559
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 8560
					Client.npcs[var3].definition = null; // L: 8561
					Client.npcs[var3] = null; // L: 8562
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 8565
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) { // L: 8566
					if (Client.npcs[Client.npcIndices[var14]] == null) { // L: 8567
						throw new RuntimeException(var14 + "," + Client.npcCount); // L: 8568
					}
				}

			}
		}
	} // L: 8571
}
