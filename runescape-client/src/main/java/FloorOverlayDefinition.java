import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1313207677
	)
	public int primaryRgb;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1768544221
	)
	public int texture;
	@ObfuscatedName("i")
	public boolean hideUnderlay;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1964387519
	)
	public int secondaryRgb;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1954941483
	)
	public int hue;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -935699783
	)
	public int saturation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1596036719
	)
	public int lightness;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 45293449
	)
	public int secondaryHue;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1367236851
	)
	public int secondarySaturation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1186195215
	)
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	} // L: 23

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1294557825"
	)
	void postDecode() {
		if (this.secondaryRgb != -1) { // L: 37
			this.setHsl(this.secondaryRgb); // L: 38
			this.secondaryHue = this.hue; // L: 39
			this.secondarySaturation = this.saturation; // L: 40
			this.secondaryLightness = this.lightness; // L: 41
		}

		this.setHsl(this.primaryRgb); // L: 43
	} // L: 44

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lkf;II)V",
		garbageValue = "-1509952388"
	)
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 48
			if (var3 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var3, var2); // L: 50
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lkf;III)V",
		garbageValue = "211427426"
	)
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 55
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 56
		} else if (var2 == 5) { // L: 57
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 58
		} else if (var2 == 8) { // L: 59
		}

	} // L: 61

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "304322495"
	)
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 64
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 65
		double var6 = (double)(var1 & 255) / 256.0D; // L: 66
		double var8 = var2; // L: 67
		if (var4 < var2) { // L: 68
			var8 = var4;
		}

		if (var6 < var8) { // L: 69
			var8 = var6;
		}

		double var10 = var2; // L: 70
		if (var4 > var2) { // L: 71
			var10 = var4;
		}

		if (var6 > var10) { // L: 72
			var10 = var6;
		}

		double var12 = 0.0D; // L: 73
		double var14 = 0.0D; // L: 74
		double var16 = (var10 + var8) / 2.0D; // L: 75
		if (var8 != var10) { // L: 76
			if (var16 < 0.5D) { // L: 77
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 78
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 79
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 80
				var12 = 2.0D + (var6 - var2) / (var10 - var8);
			} else if (var6 == var10) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 81
			}
		}

		var12 /= 6.0D; // L: 83
		this.hue = (int)(256.0D * var12); // L: 84
		this.saturation = (int)(var14 * 256.0D); // L: 85
		this.lightness = (int)(var16 * 256.0D); // L: 86
		if (this.saturation < 0) { // L: 87
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 88
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 89
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 90
			this.lightness = 255;
		}

	} // L: 91

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1598465666"
	)
	public static int method4871(CharSequence var0) {
		int var1 = var0.length(); // L: 9
		int var2 = 0; // L: 10

		for (int var3 = 0; var3 < var1; ++var3) { // L: 11
			char var4 = var0.charAt(var3); // L: 12
			if (var4 <= 127) { // L: 13
				++var2;
			} else if (var4 <= 2047) { // L: 14
				var2 += 2;
			} else {
				var2 += 3; // L: 15
			}
		}

		return var2; // L: 17
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(ZLky;I)V",
		garbageValue = "2034094426"
	)
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field771 = 0; // L: 6735
		Client.field702 = 0; // L: 6736
		PacketBuffer var2 = Client.packetWriter.packetBuffer; // L: 6738
		var2.importIndex(); // L: 6739
		int var3 = var2.readBits(8); // L: 6740
		int var4;
		if (var3 < Client.npcCount) { // L: 6741
			for (var4 = var3; var4 < Client.npcCount; ++var4) { // L: 6742
				Client.field930[++Client.field771 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) { // L: 6744
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0; // L: 6745

			for (var4 = 0; var4 < var3; ++var4) { // L: 6746
				int var5 = Client.npcIndices[var4]; // L: 6747
				NPC var6 = Client.npcs[var5]; // L: 6748
				int var7 = var2.readBits(1); // L: 6749
				if (var7 == 0) { // L: 6750
					Client.npcIndices[++Client.npcCount - 1] = var5; // L: 6751
					var6.npcCycle = Client.cycle; // L: 6752
				} else {
					int var8 = var2.readBits(2); // L: 6755
					if (var8 == 0) { // L: 6756
						Client.npcIndices[++Client.npcCount - 1] = var5; // L: 6757
						var6.npcCycle = Client.cycle; // L: 6758
						Client.field721[++Client.field702 - 1] = var5; // L: 6759
					} else {
						int var9;
						int var10;
						if (var8 == 1) { // L: 6762
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 6763
							var6.npcCycle = Client.cycle; // L: 6764
							var9 = var2.readBits(3); // L: 6765
							var6.method2115(var9, (byte)1); // L: 6766
							var10 = var2.readBits(1); // L: 6767
							if (var10 == 1) { // L: 6768
								Client.field721[++Client.field702 - 1] = var5;
							}
						} else if (var8 == 2) { // L: 6771
							Client.npcIndices[++Client.npcCount - 1] = var5; // L: 6772
							var6.npcCycle = Client.cycle; // L: 6773
							var9 = var2.readBits(3); // L: 6774
							var6.method2115(var9, (byte)2); // L: 6775
							var10 = var2.readBits(3); // L: 6776
							var6.method2115(var10, (byte)2); // L: 6777
							int var11 = var2.readBits(1); // L: 6778
							if (var11 == 1) { // L: 6779
								Client.field721[++Client.field702 - 1] = var5;
							}
						} else if (var8 == 3) { // L: 6782
							Client.field930[++Client.field771 - 1] = var5; // L: 6783
						}
					}
				}
			}

			method4879(var0, var1); // L: 6788
			Archive.method4357(var1); // L: 6789

			int var12;
			for (var12 = 0; var12 < Client.field771; ++var12) { // L: 6790
				var3 = Client.field930[var12]; // L: 6791
				if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 6792
					Client.npcs[var3].definition = null; // L: 6793
					Client.npcs[var3] = null; // L: 6794
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 6797
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var12 = 0; var12 < Client.npcCount; ++var12) { // L: 6798
					if (Client.npcs[Client.npcIndices[var12]] == null) { // L: 6799
						throw new RuntimeException(var12 + "," + Client.npcCount); // L: 6800
					}
				}

			}
		}
	} // L: 6803

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(ZLky;B)V",
		garbageValue = "46"
	)
	static final void method4879(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 6807
				int var2 = var1.readBits(15); // L: 6808
				if (var2 != 32767) { // L: 6809
					boolean var3 = false; // L: 6810
					if (Client.npcs[var2] == null) { // L: 6811
						Client.npcs[var2] = new NPC(); // L: 6812
						var3 = true; // L: 6813
					}

					NPC var4 = Client.npcs[var2]; // L: 6815
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 6816
					var4.npcCycle = Client.cycle; // L: 6817
					int var5 = var1.readBits(1); // L: 6818
					if (var5 == 1) { // L: 6819
						Client.field721[++Client.field702 - 1] = var2;
					}

					int var6;
					if (var0) { // L: 6821
						var6 = var1.readBits(8); // L: 6822
						if (var6 > 127) { // L: 6823
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5); // L: 6826
						if (var6 > 15) { // L: 6827
							var6 -= 32;
						}
					}

					int var7 = var1.readBits(1); // L: 6829
					var4.definition = Skeleton.getNpcDefinition(var1.readBits(14)); // L: 6830
					int var8 = Client.defaultRotations[var1.readBits(3)]; // L: 6831
					if (var3) { // L: 6832
						var4.orientation = var4.rotation = var8;
					}

					int var9;
					if (var0) { // L: 6834
						var9 = var1.readBits(8); // L: 6835
						if (var9 > 127) { // L: 6836
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 6839
						if (var9 > 15) {
							var9 -= 32; // L: 6840
						}
					}

					var4.field1014 = var4.definition.size; // L: 6842
					var4.field1025 = var4.definition.rotation; // L: 6843
					if (var4.field1025 == 0) { // L: 6844
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 6845
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 6846
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 6847
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 6848
					var4.idleSequence = var4.definition.idleSequence; // L: 6849
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 6850
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 6851
					var4.method2121(WorldMapLabelSize.localPlayer.pathX[0] + var9, WorldMapLabelSize.localPlayer.pathY[0] + var6, var7 == 1); // L: 6852
					continue; // L: 6853
				}
			}

			var1.exportIndex(); // L: 6854
			return; // L: 6855
		}
	}
}
