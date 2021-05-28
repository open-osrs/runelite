import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1820038389
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2092998769
	)
	@Export("x")
	public int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 349527629
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lii;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-738811910"
	)
	@Export("packed")
	public int packed() {
		return this.plane << 28 | this.x << 14 | this.y; // L: 30
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lii;B)Z",
		garbageValue = "-43"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "36531623"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 34
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 35 36
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnb;B)V",
		garbageValue = "-128"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class93.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - VertexNormal.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - SoundSystem.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		class22.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1374[var1] != null) { // L: 50
			var2.read(Players.field1374[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1370[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var1 != var7) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1370[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1649813812"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = AbstractSocket.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5612
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (var5 != 0L) { // L: 5613
			var7 = AbstractSocket.scene.getObjectFlags(var0, var1, var2, var5); // L: 5614
			var8 = var7 >> 6 & 3; // L: 5615
			var9 = var7 & 31; // L: 5616
			var10 = var3; // L: 5617
			boolean var12 = 0L != var5; // L: 5620
			if (var12) { // L: 5621
				boolean var13 = (int)(var5 >>> 16 & 1L) == 1; // L: 5624
				var12 = !var13; // L: 5626
			}

			if (var12) { // L: 5630
				var10 = var4;
			}

			int[] var19 = GameEngine.sceneMinimapSprite.pixels; // L: 5631
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5632
			var14 = class93.Entity_unpackID(var5); // L: 5633
			ObjectComposition var15 = class23.getObjectDefinition(var14); // L: 5634
			if (var15.mapSceneId != -1) { // L: 5635
				IndexedSprite var16 = class10.mapSceneSprites[var15.mapSceneId]; // L: 5636
				if (var16 != null) { // L: 5637
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5638
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5639
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 5640
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5644
					if (var8 == 0) { // L: 5645
						var19[var26] = var10; // L: 5646
						var19[var26 + 512] = var10; // L: 5647
						var19[var26 + 1024] = var10; // L: 5648
						var19[var26 + 1536] = var10; // L: 5649
					} else if (var8 == 1) { // L: 5651
						var19[var26] = var10; // L: 5652
						var19[var26 + 1] = var10; // L: 5653
						var19[var26 + 2] = var10; // L: 5654
						var19[var26 + 3] = var10; // L: 5655
					} else if (var8 == 2) { // L: 5657
						var19[var26 + 3] = var10; // L: 5658
						var19[var26 + 512 + 3] = var10; // L: 5659
						var19[var26 + 1024 + 3] = var10; // L: 5660
						var19[var26 + 1536 + 3] = var10; // L: 5661
					} else if (var8 == 3) { // L: 5663
						var19[var26 + 1536] = var10; // L: 5664
						var19[var26 + 1536 + 1] = var10; // L: 5665
						var19[var26 + 1536 + 2] = var10; // L: 5666
						var19[var26 + 1536 + 3] = var10; // L: 5667
					}
				}

				if (var9 == 3) { // L: 5670
					if (var8 == 0) { // L: 5671
						var19[var26] = var10;
					} else if (var8 == 1) { // L: 5672
						var19[var26 + 3] = var10;
					} else if (var8 == 2) { // L: 5673
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5674
						var19[var26 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5676
					if (var8 == 3) { // L: 5677
						var19[var26] = var10; // L: 5678
						var19[var26 + 512] = var10; // L: 5679
						var19[var26 + 1024] = var10; // L: 5680
						var19[var26 + 1536] = var10; // L: 5681
					} else if (var8 == 0) { // L: 5683
						var19[var26] = var10; // L: 5684
						var19[var26 + 1] = var10; // L: 5685
						var19[var26 + 2] = var10; // L: 5686
						var19[var26 + 3] = var10; // L: 5687
					} else if (var8 == 1) { // L: 5689
						var19[var26 + 3] = var10; // L: 5690
						var19[var26 + 512 + 3] = var10; // L: 5691
						var19[var26 + 1024 + 3] = var10; // L: 5692
						var19[var26 + 1536 + 3] = var10; // L: 5693
					} else if (var8 == 2) { // L: 5695
						var19[var26 + 1536] = var10; // L: 5696
						var19[var26 + 1536 + 1] = var10; // L: 5697
						var19[var26 + 1536 + 2] = var10; // L: 5698
						var19[var26 + 1536 + 3] = var10; // L: 5699
					}
				}
			}
		}

		var5 = AbstractSocket.scene.getGameObjectTag(var0, var1, var2); // L: 5704
		if (0L != var5) { // L: 5705
			var7 = AbstractSocket.scene.getObjectFlags(var0, var1, var2, var5); // L: 5706
			var8 = var7 >> 6 & 3; // L: 5707
			var9 = var7 & 31; // L: 5708
			var10 = class93.Entity_unpackID(var5); // L: 5709
			ObjectComposition var20 = class23.getObjectDefinition(var10); // L: 5710
			if (var20.mapSceneId != -1) { // L: 5711
				IndexedSprite var28 = class10.mapSceneSprites[var20.mapSceneId]; // L: 5712
				if (var28 != null) { // L: 5713
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2; // L: 5714
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2; // L: 5715
					var28.drawAt(var1 * 4 + var26 + 48, var14 + (104 - var2 - var20.sizeY) * 4 + 48); // L: 5716
				}
			} else if (var9 == 9) { // L: 5719
				int var25 = 15658734; // L: 5720
				boolean var27 = var5 != 0L; // L: 5723
				if (var27) { // L: 5724
					boolean var21 = (int)(var5 >>> 16 & 1L) == 1; // L: 5727
					var27 = !var21; // L: 5729
				}

				if (var27) { // L: 5733
					var25 = 15597568;
				}

				int[] var22 = GameEngine.sceneMinimapSprite.pixels; // L: 5734
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5735
				if (var8 != 0 && var8 != 2) { // L: 5736
					var22[var29] = var25; // L: 5743
					var22[var29 + 1 + 512] = var25; // L: 5744
					var22[var29 + 1024 + 2] = var25; // L: 5745
					var22[var29 + 1536 + 3] = var25; // L: 5746
				} else {
					var22[var29 + 1536] = var25; // L: 5737
					var22[var29 + 1 + 1024] = var25; // L: 5738
					var22[var29 + 512 + 2] = var25; // L: 5739
					var22[var29 + 3] = var25; // L: 5740
				}
			}
		}

		var5 = AbstractSocket.scene.getFloorDecorationTag(var0, var1, var2); // L: 5750
		if (var5 != 0L) { // L: 5751
			var7 = class93.Entity_unpackID(var5); // L: 5752
			ObjectComposition var23 = class23.getObjectDefinition(var7); // L: 5753
			if (var23.mapSceneId != -1) { // L: 5754
				IndexedSprite var24 = class10.mapSceneSprites[var23.mapSceneId]; // L: 5755
				if (var24 != null) { // L: 5756
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5757
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5758
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var11 + 48); // L: 5759
				}
			}
		}

	} // L: 5763
}
