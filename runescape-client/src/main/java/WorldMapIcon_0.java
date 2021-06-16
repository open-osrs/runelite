import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -439578227
	)
	static int field2029;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	static ClanChannel field2031;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1437380799
	)
	@Export("element")
	final int element;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1704027019
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 96075769
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;ILfd;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2); // L: 14
		this.element = var3; // L: 15
		this.label = var4; // L: 16
		WorldMapElement var5 = Archive.WorldMapElement_get(this.getElement()); // L: 17
		SpritePixels var6 = var5.getSpriteBool(false); // L: 18
		if (var6 != null) { // L: 19
			this.subWidth = var6.subWidth; // L: 20
			this.subHeight = var6.subHeight; // L: 21
		} else {
			this.subWidth = 0; // L: 24
			this.subHeight = 0; // L: 25
		}

	} // L: 27

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717389517"
	)
	@Export("getElement")
	public int getElement() {
		return this.element; // L: 30
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lfd;",
		garbageValue = "1736510941"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label; // L: 34
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-60"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth; // L: 38
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-401407374"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight; // L: 42
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Lhs;",
		garbageValue = "0"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2752, ServerPacket.field2704, ServerPacket.field2705, ServerPacket.field2706, ServerPacket.field2707, ServerPacket.field2708, ServerPacket.field2709, ServerPacket.field2746, ServerPacket.field2711, ServerPacket.field2728, ServerPacket.field2713, ServerPacket.field2714, ServerPacket.field2715, ServerPacket.field2716, ServerPacket.field2721, ServerPacket.field2718, ServerPacket.field2719, ServerPacket.field2778, ServerPacket.field2765, ServerPacket.field2722, ServerPacket.field2720, ServerPacket.field2724, ServerPacket.field2725, ServerPacket.field2726, ServerPacket.field2712, ServerPacket.field2753, ServerPacket.field2732, ServerPacket.field2773, ServerPacket.field2731, ServerPacket.field2798, ServerPacket.field2733, ServerPacket.field2734, ServerPacket.field2735, ServerPacket.field2717, ServerPacket.field2737, ServerPacket.field2738, ServerPacket.field2739, ServerPacket.field2740, ServerPacket.field2741, ServerPacket.field2742, ServerPacket.field2743, ServerPacket.field2744, ServerPacket.field2710, ServerPacket.field2793, ServerPacket.field2747, ServerPacket.field2723, ServerPacket.field2749, ServerPacket.field2748, ServerPacket.field2751, ServerPacket.field2727, ServerPacket.field2736, ServerPacket.field2754, ServerPacket.field2755, ServerPacket.field2703, ServerPacket.field2757, ServerPacket.field2758, ServerPacket.field2799, ServerPacket.field2760, ServerPacket.field2761, ServerPacket.field2762, ServerPacket.field2763, ServerPacket.field2764, ServerPacket.field2794, ServerPacket.field2766, ServerPacket.field2767, ServerPacket.field2768, ServerPacket.field2769, ServerPacket.field2770, ServerPacket.field2771, ServerPacket.field2772, ServerPacket.field2759, ServerPacket.field2774, ServerPacket.field2775, ServerPacket.field2776, ServerPacket.field2777, ServerPacket.field2780, ServerPacket.field2779, ServerPacket.field2730, ServerPacket.field2781, ServerPacket.field2750, ServerPacket.field2782, ServerPacket.field2784, ServerPacket.field2785, ServerPacket.field2786, ServerPacket.field2729, ServerPacket.field2792, ServerPacket.field2789, ServerPacket.field2790, ServerPacket.field2783, ServerPacket.field2791, ServerPacket.field2745, ServerPacket.field2756, ServerPacket.field2795, ServerPacket.field2796, ServerPacket.field2797}; // L: 104
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIS)V",
		garbageValue = "-23293"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = DevicePcmPlayerProvider.scene.getBoundaryObjectTag(var0, var1, var2); // L: 5720
		int var7;
		int var8;
		int var9;
		int var10;
		int var13;
		int var14;
		if (0L != var5) { // L: 5721
			var7 = DevicePcmPlayerProvider.scene.getObjectFlags(var0, var1, var2, var5); // L: 5722
			var8 = var7 >> 6 & 3; // L: 5723
			var9 = var7 & 31; // L: 5724
			var10 = var3; // L: 5725
			boolean var11 = var5 != 0L && !class24.method329(var5); // L: 5728
			if (var11) { // L: 5730
				var10 = var4;
			}

			int[] var12 = class69.sceneMinimapSprite.pixels; // L: 5731
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5732
			var14 = Message.Entity_unpackID(var5); // L: 5733
			ObjectComposition var15 = Tiles.getObjectDefinition(var14); // L: 5734
			if (var15.mapSceneId != -1) { // L: 5735
				IndexedSprite var16 = FloorDecoration.mapSceneSprites[var15.mapSceneId]; // L: 5736
				if (var16 != null) { // L: 5737
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2; // L: 5738
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2; // L: 5739
					var16.drawAt(var17 + var1 * 4 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48); // L: 5740
				}
			} else {
				if (var9 == 0 || var9 == 2) { // L: 5744
					if (var8 == 0) { // L: 5745
						var12[var13] = var10; // L: 5746
						var12[var13 + 512] = var10; // L: 5747
						var12[var13 + 1024] = var10; // L: 5748
						var12[var13 + 1536] = var10; // L: 5749
					} else if (var8 == 1) { // L: 5751
						var12[var13] = var10; // L: 5752
						var12[var13 + 1] = var10; // L: 5753
						var12[var13 + 2] = var10; // L: 5754
						var12[var13 + 3] = var10; // L: 5755
					} else if (var8 == 2) { // L: 5757
						var12[var13 + 3] = var10; // L: 5758
						var12[var13 + 512 + 3] = var10; // L: 5759
						var12[var13 + 1024 + 3] = var10; // L: 5760
						var12[var13 + 1536 + 3] = var10; // L: 5761
					} else if (var8 == 3) { // L: 5763
						var12[var13 + 1536] = var10; // L: 5764
						var12[var13 + 1536 + 1] = var10; // L: 5765
						var12[var13 + 1536 + 2] = var10; // L: 5766
						var12[var13 + 1536 + 3] = var10; // L: 5767
					}
				}

				if (var9 == 3) { // L: 5770
					if (var8 == 0) { // L: 5771
						var12[var13] = var10;
					} else if (var8 == 1) { // L: 5772
						var12[var13 + 3] = var10;
					} else if (var8 == 2) { // L: 5773
						var12[var13 + 1536 + 3] = var10;
					} else if (var8 == 3) { // L: 5774
						var12[var13 + 1536] = var10;
					}
				}

				if (var9 == 2) { // L: 5776
					if (var8 == 3) { // L: 5777
						var12[var13] = var10; // L: 5778
						var12[var13 + 512] = var10; // L: 5779
						var12[var13 + 1024] = var10; // L: 5780
						var12[var13 + 1536] = var10; // L: 5781
					} else if (var8 == 0) { // L: 5783
						var12[var13] = var10; // L: 5784
						var12[var13 + 1] = var10; // L: 5785
						var12[var13 + 2] = var10; // L: 5786
						var12[var13 + 3] = var10; // L: 5787
					} else if (var8 == 1) { // L: 5789
						var12[var13 + 3] = var10; // L: 5790
						var12[var13 + 512 + 3] = var10; // L: 5791
						var12[var13 + 1024 + 3] = var10; // L: 5792
						var12[var13 + 1536 + 3] = var10; // L: 5793
					} else if (var8 == 2) { // L: 5795
						var12[var13 + 1536] = var10; // L: 5796
						var12[var13 + 1536 + 1] = var10; // L: 5797
						var12[var13 + 1536 + 2] = var10; // L: 5798
						var12[var13 + 1536 + 3] = var10; // L: 5799
					}
				}
			}
		}

		var5 = DevicePcmPlayerProvider.scene.getGameObjectTag(var0, var1, var2); // L: 5804
		if (0L != var5) { // L: 5805
			var7 = DevicePcmPlayerProvider.scene.getObjectFlags(var0, var1, var2, var5); // L: 5806
			var8 = var7 >> 6 & 3; // L: 5807
			var9 = var7 & 31; // L: 5808
			var10 = Message.Entity_unpackID(var5); // L: 5809
			ObjectComposition var19 = Tiles.getObjectDefinition(var10); // L: 5810
			if (var19.mapSceneId != -1) { // L: 5811
				IndexedSprite var26 = FloorDecoration.mapSceneSprites[var19.mapSceneId]; // L: 5812
				if (var26 != null) { // L: 5813
					var13 = (var19.sizeX * 4 - var26.subWidth) / 2; // L: 5814
					var14 = (var19.sizeY * 4 - var26.subHeight) / 2; // L: 5815
					var26.drawAt(var13 + var1 * 4 + 48, var14 + (104 - var2 - var19.sizeY) * 4 + 48); // L: 5816
				}
			} else if (var9 == 9) { // L: 5819
				int var20 = 15658734; // L: 5820
				boolean var27 = 0L != var5 && !class24.method329(var5); // L: 5823
				if (var27) { // L: 5825
					var20 = 15597568;
				}

				int[] var21 = class69.sceneMinimapSprite.pixels; // L: 5826
				int var22 = var1 * 4 + (103 - var2) * 2048 + 24624; // L: 5827
				if (var8 != 0 && var8 != 2) { // L: 5828
					var21[var22] = var20; // L: 5835
					var21[var22 + 1 + 512] = var20; // L: 5836
					var21[var22 + 1024 + 2] = var20; // L: 5837
					var21[var22 + 1536 + 3] = var20; // L: 5838
				} else {
					var21[var22 + 1536] = var20; // L: 5829
					var21[var22 + 1 + 1024] = var20; // L: 5830
					var21[var22 + 512 + 2] = var20; // L: 5831
					var21[var22 + 3] = var20; // L: 5832
				}
			}
		}

		var5 = DevicePcmPlayerProvider.scene.getFloorDecorationTag(var0, var1, var2); // L: 5842
		if (0L != var5) { // L: 5843
			var7 = Message.Entity_unpackID(var5); // L: 5844
			ObjectComposition var23 = Tiles.getObjectDefinition(var7); // L: 5845
			if (var23.mapSceneId != -1) { // L: 5846
				IndexedSprite var24 = FloorDecoration.mapSceneSprites[var23.mapSceneId]; // L: 5847
				if (var24 != null) { // L: 5848
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2; // L: 5849
					int var25 = (var23.sizeY * 4 - var24.subHeight) / 2; // L: 5850
					var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var25 + 48); // L: 5851
				}
			}
		}

	} // L: 5855

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "360913539"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = InterfaceParent.getPacketBufferNode(ClientPacket.field2667, Client.packetWriter.isaacCipher); // L: 11489
		var0.packetBuffer.writeByte(0); // L: 11490
		Client.packetWriter.addNode(var0); // L: 11491
	} // L: 11492
}
