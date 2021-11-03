import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;B)V",
		garbageValue = "-38"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field2186.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method6946(); // L: 19
			super.fileId = var1.method6946(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "530647470"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 24
		super.floorUnderlayIds = new short[1][64][64]; // L: 25
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 26
		super.field2154 = new byte[super.planes][64][64]; // L: 27
		super.field2145 = new byte[super.planes][64][64]; // L: 28
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 29
		int var2 = var1.readUnsignedByte(); // L: 30
		if (var2 != class194.field2177.value) { // L: 31
			throw new IllegalStateException(""); // L: 32
		} else {
			int var3 = var1.readUnsignedByte(); // L: 34
			int var4 = var1.readUnsignedByte(); // L: 35
			if (var3 == super.regionX && var4 == super.regionY) { // L: 36
				for (int var5 = 0; var5 < 64; ++var5) { // L: 39
					for (int var6 = 0; var6 < 64; ++var6) { // L: 40
						this.readTile(var5, var6, var1); // L: 41
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 37
			}
		}
	} // L: 44

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) { // L: 47
			return false; // L: 48
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1; // L: 50
			return var2.regionX == super.regionX && super.regionY == var2.regionY; // L: 51
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8; // L: 55
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)Z",
		garbageValue = "-2145762606"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 539
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 540
			if (var0.readBits(1) != 0) { // L: 541
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 542
			var4 = var0.readBits(13); // L: 543
			boolean var12 = var0.readBits(1) == 1; // L: 544
			if (var12) { // L: 545
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 546
				throw new RuntimeException(); // L: 547
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 549
				var11.index = var1; // L: 550
				if (Players.field1242[var1] != null) { // L: 551
					var11.read(Players.field1242[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 552
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 553
				var7 = Players.Players_regions[var1]; // L: 554
				var8 = var7 >> 28; // L: 555
				var9 = var7 >> 14 & 255; // L: 556
				var10 = var7 & 255; // L: 557
				var11.pathTraversed[0] = Players.field1241[var1]; // L: 558
				var11.plane = (byte)var8; // L: 559
				var11.resetPath((var9 << 13) + var3 - class19.baseX, (var10 << 13) + var4 - DefaultsGroup.baseY); // L: 560
				var11.field1067 = false; // L: 561
				return true; // L: 562
			}
		} else if (var2 == 1) { // L: 564
			var3 = var0.readBits(2); // L: 565
			var4 = Players.Players_regions[var1]; // L: 566
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 567
			return false; // L: 568
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 570
				var3 = var0.readBits(5); // L: 571
				var4 = var3 >> 3; // L: 572
				var5 = var3 & 7; // L: 573
				var6 = Players.Players_regions[var1]; // L: 574
				var7 = (var6 >> 28) + var4 & 3; // L: 575
				var8 = var6 >> 14 & 255; // L: 576
				var9 = var6 & 255; // L: 577
				if (var5 == 0) { // L: 578
					--var8; // L: 579
					--var9; // L: 580
				}

				if (var5 == 1) { // L: 582
					--var9;
				}

				if (var5 == 2) { // L: 583
					++var8; // L: 584
					--var9; // L: 585
				}

				if (var5 == 3) { // L: 587
					--var8;
				}

				if (var5 == 4) { // L: 588
					++var8;
				}

				if (var5 == 5) { // L: 589
					--var8; // L: 590
					++var9; // L: 591
				}

				if (var5 == 6) { // L: 593
					++var9;
				}

				if (var5 == 7) { // L: 594
					++var8; // L: 595
					++var9; // L: 596
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 598
				return false; // L: 599
			} else {
				var3 = var0.readBits(18); // L: 601
				var4 = var3 >> 16; // L: 602
				var5 = var3 >> 8 & 255; // L: 603
				var6 = var3 & 255; // L: 604
				var7 = Players.Players_regions[var1]; // L: 605
				var8 = (var7 >> 28) + var4 & 3; // L: 606
				var9 = var5 + (var7 >> 14) & 255; // L: 607
				var10 = var6 + var7 & 255; // L: 608
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 609
				return false; // L: 610
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1849354153"
	)
	static int method3530(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 72 73
		}
	}
}
