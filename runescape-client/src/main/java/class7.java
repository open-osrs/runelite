import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("w")
public class class7 {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		intValue = -495360995
	)
	static int field33;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1430198081
	)
	public static int field39;
	@ObfuscatedName("a")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("u")
	public static short[][] field40;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -1073511333
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 1883104503
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("c")
	ExecutorService field34;
	@ObfuscatedName("l")
	Future field42;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	final Buffer field30;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	final class3 field31;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Le;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field34 = Executors.newSingleThreadExecutor(); // L: 10
		this.field30 = var1; // L: 16
		this.field31 = var2; // L: 17
		this.method46(); // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343029273"
	)
	public boolean method43() {
		return this.field42.isDone(); // L: 22
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-42"
	)
	public void method44() {
		this.field34.shutdown(); // L: 26
		this.field34 = null; // L: 27
	} // L: 28

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-149589484"
	)
	public Buffer method45() {
		try {
			return (Buffer)this.field42.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2103816119"
	)
	void method46() {
		this.field42 = this.field34.submit(new class1(this, this.field30, this.field31)); // L: 40
	} // L: 41

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-863466486"
	)
	static final void method51(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) { // L: 79
			for (int var5 = var0; var5 <= var0 + var2; ++var5) { // L: 80
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) { // L: 81
					class260.field3078[0][var5][var4] = 127; // L: 82
					if (var0 == var5 && var5 > 0) { // L: 83
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) { // L: 84
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) { // L: 85
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) { // L: 86
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	} // L: 90

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1815302672"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lan;I)V",
		garbageValue = "2092950553"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 266
		if (var0.sound != null) { // L: 267
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 268
		}

	} // L: 269

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-382096679"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = Decimator.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5667
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) { // L: 5668
			var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5); // L: 5669
			var8 = var7 >> 6 & 3; // L: 5670
			var9 = var7 & 31; // L: 5671
			var10 = var3; // L: 5672
			if (LoginScreenAnimation.method2219(var5)) { // L: 5673
				var10 = var4;
			}

			int[] var11 = class414.sceneMinimapSprite.pixels; // L: 5674
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5675
			var13 = Skeleton.Entity_unpackID(var5); // L: 5676
			ObjectComposition var14 = ParamComposition.getObjectDefinition(var13); // L: 5677
			if (var14.mapSceneId != -1) { // L: 5678
				IndexedSprite var15 = class10.mapSceneSprites[var14.mapSceneId]; // L: 5679
				if (var15 != null) { // L: 5680
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2; // L: 5681
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2; // L: 5682
					var15.drawAt(var16 + var1 * 4 + 48, var17 + (104 - var2 - var14.sizeY) * 4 + 48); // L: 5683
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5687
					if (var8 == 0) { // L: 5688
						var11[var12] = var10; // L: 5689
						var11[var12 + 512] = var10; // L: 5690
						var11[var12 + 1024] = var10; // L: 5691
						var11[var12 + 1536] = var10; // L: 5692
					} else if (var8 == 1) { // L: 5694
						var11[var12] = var10; // L: 5695
						var11[var12 + 1] = var10; // L: 5696
						var11[var12 + 2] = var10; // L: 5697
						var11[var12 + 3] = var10; // L: 5698
					} else if (var8 == 2) { // L: 5700
						var11[var12 + 3] = var10; // L: 5701
						var11[var12 + 512 + 3] = var10; // L: 5702
						var11[var12 + 1024 + 3] = var10; // L: 5703
						var11[var12 + 1536 + 3] = var10; // L: 5704
					} else if (var8 == 3) { // L: 5706
						var11[var12 + 1536] = var10; // L: 5707
						var11[var12 + 1536 + 1] = var10; // L: 5708
						var11[var12 + 1536 + 2] = var10; // L: 5709
						var11[var12 + 1536 + 3] = var10; // L: 5710
					}
				}

				if (var9 == 3) { // L: 5713
					if (var8 == 0) { // L: 5714
						var11[var12] = var10;
					} else if (var8 == 1) { // L: 5715
						var11[var12 + 3] = var10;
					} else if (var8 == 2) { // L: 5716
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5717
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5719
					if (var8 == 3) { // L: 5720
						var11[var12] = var10; // L: 5721
						var11[var12 + 512] = var10; // L: 5722
						var11[var12 + 1024] = var10; // L: 5723
						var11[var12 + 1536] = var10; // L: 5724
					} else if (var8 == 0) { // L: 5726
						var11[var12] = var10; // L: 5727
						var11[var12 + 1] = var10; // L: 5728
						var11[var12 + 2] = var10; // L: 5729
						var11[var12 + 3] = var10; // L: 5730
					} else if (var8 == 1) { // L: 5732
						var11[var12 + 3] = var10; // L: 5733
						var11[var12 + 512 + 3] = var10; // L: 5734
						var11[var12 + 1024 + 3] = var10; // L: 5735
						var11[var12 + 1536 + 3] = var10; // L: 5736
					} else if (var8 == 2) { // L: 5738
						var11[var12 + 1536] = var10; // L: 5739
						var11[var12 + 1536 + 1] = var10; // L: 5740
						var11[var12 + 1536 + 2] = var10; // L: 5741
						var11[var12 + 1536 + 3] = var10; // L: 5742
					}
				}
			}
		}

		var5 = Decimator.scene.getGameObjectTag(var0, var1, var2); // L: 5747
		if (0L != var5) { // L: 5748
			var7 = Decimator.scene.getObjectFlags(var0, var1, var2, var5); // L: 5749
			var8 = var7 >> 6 & 3; // L: 5750
			var9 = var7 & 31; // L: 5751
			var10 = Skeleton.Entity_unpackID(var5); // L: 5752
			ObjectComposition var24 = ParamComposition.getObjectDefinition(var10); // L: 5753
			int var19;
			if (var24.mapSceneId != -1) { // L: 5754
				IndexedSprite var20 = class10.mapSceneSprites[var24.mapSceneId]; // L: 5755
				if (var20 != null) { // L: 5756
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2; // L: 5757
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2; // L: 5758
					var20.drawAt(var13 + var1 * 4 + 48, (104 - var2 - var24.sizeY) * 4 + var19 + 48); // L: 5759
				}
			} else if (var9 == 9) { // L: 5762
				var12 = 15658734; // L: 5763
				if (LoginScreenAnimation.method2219(var5)) { // L: 5764
					var12 = 15597568;
				}

				int[] var18 = class414.sceneMinimapSprite.pixels; // L: 5765
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5766
				if (var8 != 0 && var8 != 2) { // L: 5767
					var18[var19] = var12; // L: 5774
					var18[var19 + 1 + 512] = var12; // L: 5775
					var18[var19 + 1024 + 2] = var12; // L: 5776
					var18[var19 + 1536 + 3] = var12; // L: 5777
				} else {
					var18[var19 + 1536] = var12; // L: 5768
					var18[var19 + 1 + 1024] = var12; // L: 5769
					var18[var19 + 512 + 2] = var12; // L: 5770
					var18[var19 + 3] = var12; // L: 5771
				}
			}
		}

		var5 = Decimator.scene.getFloorDecorationTag(var0, var1, var2); // L: 5781
		if (0L != var5) { // L: 5782
			var7 = Skeleton.Entity_unpackID(var5); // L: 5783
			ObjectComposition var21 = ParamComposition.getObjectDefinition(var7); // L: 5784
			if (var21.mapSceneId != -1) { // L: 5785
				IndexedSprite var22 = class10.mapSceneSprites[var21.mapSceneId]; // L: 5786
				if (var22 != null) { // L: 5787
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2; // L: 5788
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2; // L: 5789
					var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48); // L: 5790
				}
			}
		}

	} // L: 5794
}
