import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static Bounds field973;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 554829183
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 991387999
	)
	@Export("type")
	int type;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 736345731
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -831272437
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 270984957
	)
	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1149406205
	)
	@Export("y")
	int y;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -895172373
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1887106399
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLgh;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2172 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (var10.sequenceDefinition == this.sequenceDefinition) { // L: 32
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart; // L: 34
					return; // L: 35
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) { // L: 38
				if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 39
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length); // L: 40
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]); // L: 41
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method3827()); // L: 44
				}
			}
		}

	} // L: 48

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) { // L: 51
			int var1 = Client.cycle - this.cycleStart; // L: 52
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method3827(); // L: 68
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label78: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label78;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 56
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 58

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 60

					this.sequenceDefinition = null;
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class116.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) { // L: 81
			var12 = var12.transform();
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var4][var6] + var8[var5][var6] + var8[var4][var7] + var8[var5][var7] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lpd;II)Ljava/lang/String;",
		garbageValue = "-255046682"
	)
	static String method1988(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 69
			if (var2 > var1) { // L: 70
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 71
			var0.offset += class282.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 72
			String var4 = class113.decodeStringCp1252(var3, 0, var2); // L: 73
			return var4; // L: 74
		} catch (Exception var6) { // L: 76
			return "Cabbage"; // L: 77
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-429735944"
	)
	public static int method1987(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 57
		int var1 = (int)(var2 >>> 0 & 127L); // L: 59
		return var1; // L: 61
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "2084684475"
	)
	static final void method1985(String var0, int var1) {
		PacketBufferNode var2 = ItemContainer.getPacketBufferNode(ClientPacket.field2924, Client.packetWriter.isaacCipher); // L: 228
		var2.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 229
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 230
		var2.packetBuffer.method7787(var1); // L: 231
		Client.packetWriter.addNode(var2); // L: 232
	} // L: 233

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(ZLpy;S)V",
		garbageValue = "176"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field634 = 0; // L: 7687
		Client.field609 = 0; // L: 7688
		class385.method7028(); // L: 7689
		SecureRandomCallable.method2066(var0, var1); // L: 7690

		int var2;
		int var3;
		for (var2 = 0; var2 < Client.field609; ++var2) { // L: 7692
			var3 = Client.field533[var2]; // L: 7693
			NPC var4 = Client.npcs[var3]; // L: 7694
			int var5 = var1.readUnsignedByte(); // L: 7695
			int var6;
			if (class162.field1768 && (var5 & 64) != 0) { // L: 7696
				var6 = var1.readUnsignedByte(); // L: 7697
				var5 += var6 << 8; // L: 7698
			}

			int var7;
			int var8;
			int var9;
			if ((var5 & 1) != 0) { // L: 7700
				var6 = var1.readUnsignedShort(); // L: 7701
				var7 = var1.method7971(); // L: 7702
				if (class162.field1768) { // L: 7703
					var4.field1183 = var1.method7789() == 1; // L: 7704
				}

				var8 = var4.x - (var6 - ApproximateRouteStrategy.baseX - ApproximateRouteStrategy.baseX) * 64; // L: 7706
				var9 = var4.y - (var7 - class250.baseY - class250.baseY) * 64; // L: 7707
				if (var8 != 0 || var9 != 0) { // L: 7708
					var4.field1160 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
				}
			}

			if ((var5 & 1024) != 0) { // L: 7710
				var4.field1161 = var1.readInt(); // L: 7711
			}

			if ((var5 & 16) != 0) { // L: 7713
				var4.spotAnimation = var1.readUnsignedShort(); // L: 7714
				var6 = var1.readInt(); // L: 7715
				var4.spotAnimationHeight = var6 >> 16; // L: 7716
				var4.field1173 = (var6 & 65535) + Client.cycle; // L: 7717
				var4.spotAnimationFrame = 0; // L: 7718
				var4.spotAnimationFrameCycle = 0; // L: 7719
				if (var4.field1173 > Client.cycle) { // L: 7720
					var4.spotAnimationFrame = -1;
				}

				if (var4.spotAnimation == 65535) { // L: 7721
					var4.spotAnimation = -1;
				}
			}

			if ((var5 & 128) != 0) { // L: 7723
				var6 = var1.readUnsignedByte(); // L: 7724
				int var10;
				int var11;
				int var12;
				if (var6 > 0) { // L: 7725
					for (var7 = 0; var7 < var6; ++var7) { // L: 7726
						var9 = -1; // L: 7728
						var10 = -1; // L: 7729
						var11 = -1; // L: 7730
						var8 = var1.readUShortSmart(); // L: 7731
						if (var8 == 32767) { // L: 7732
							var8 = var1.readUShortSmart(); // L: 7733
							var10 = var1.readUShortSmart(); // L: 7734
							var9 = var1.readUShortSmart(); // L: 7735
							var11 = var1.readUShortSmart(); // L: 7736
						} else if (var8 != 32766) { // L: 7738
							var10 = var1.readUShortSmart(); // L: 7739
						} else {
							var8 = -1; // L: 7741
						}

						var12 = var1.readUShortSmart(); // L: 7742
						var4.addHitSplat(var8, var10, var9, var11, Client.cycle, var12); // L: 7743
					}
				}

				var7 = var1.method7790(); // L: 7746
				if (var7 > 0) { // L: 7747
					for (var8 = 0; var8 < var7; ++var8) { // L: 7748
						var9 = var1.readUShortSmart(); // L: 7749
						var10 = var1.readUShortSmart(); // L: 7750
						if (var10 != 32767) { // L: 7751
							var11 = var1.readUShortSmart(); // L: 7752
							var12 = var1.readUnsignedByte(); // L: 7753
							int var13 = var10 > 0 ? var1.method7789() : var12; // L: 7754
							var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13); // L: 7755
						} else {
							var4.removeHealthBar(var9); // L: 7757
						}
					}
				}
			}

			if (class162.field1768 && (var5 & 256) != 0 || !class162.field1768 && (var5 & 64) != 0) { // L: 7761
				var4.field1175 = var1.method7925(); // L: 7762
				var4.field1177 = var1.method7792(); // L: 7763
				var4.field1176 = var1.readByte(); // L: 7764
				var4.field1178 = var1.readByte(); // L: 7765
				var4.field1179 = var1.method7971() + Client.cycle; // L: 7766
				var4.field1180 = var1.readUnsignedShort() + Client.cycle; // L: 7767
				var4.field1181 = var1.method7971(); // L: 7768
				var4.pathLength = 1; // L: 7769
				var4.field1134 = 0; // L: 7770
				var4.field1175 += var4.pathX[0]; // L: 7771
				var4.field1177 += var4.pathY[0]; // L: 7772
				var4.field1176 += var4.pathX[0]; // L: 7773
				var4.field1178 += var4.pathY[0]; // L: 7774
			}

			if ((var5 & 512) != 0) { // L: 7776
				var4.field1133 = Client.cycle + var1.method7798(); // L: 7777
				var4.field1185 = Client.cycle + var1.method7935(); // L: 7778
				var4.field1146 = var1.readByte(); // L: 7779
				var4.field1187 = var1.method7792(); // L: 7780
				var4.field1188 = var1.method7792(); // L: 7781
				var4.field1189 = (byte)var1.method7927(); // L: 7782
			}

			if ((var5 & 2) != 0) { // L: 7784
				var4.overheadText = var1.readStringCp1252NullTerminated(); // L: 7785
				var4.overheadTextCyclesRemaining = 100; // L: 7786
			}

			if ((var5 & 4) != 0) { // L: 7788
				var4.targetIndex = var1.method7935(); // L: 7789
				if (var4.targetIndex == 65535) { // L: 7790
					var4.targetIndex = -1;
				}
			}

			if ((var5 & 32) != 0) { // L: 7792
				var4.definition = class9.getNpcDefinition(var1.method7971()); // L: 7793
				var4.field1145 = var4.definition.size; // L: 7794
				var4.field1192 = var4.definition.rotation; // L: 7795
				var4.walkSequence = var4.definition.walkSequence; // L: 7796
				var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7797
				var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7798
				var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7799
				var4.idleSequence = var4.definition.idleSequence; // L: 7800
				var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7801
				var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7802
			}

			if ((var5 & 8) != 0) { // L: 7804
				var6 = var1.method7798(); // L: 7805
				if (var6 == 65535) { // L: 7806
					var6 = -1; // L: 7807
				}

				var7 = var1.method7789(); // L: 7809
				if (var6 == var4.sequence && var6 != -1) { // L: 7810
					var8 = ItemContainer.SequenceDefinition_get(var6).field2172; // L: 7811
					if (var8 == 1) { // L: 7812
						var4.sequenceFrame = 0; // L: 7813
						var4.sequenceFrameCycle = 0; // L: 7814
						var4.sequenceDelay = var7; // L: 7815
						var4.field1169 = 0; // L: 7816
					}

					if (var8 == 2) { // L: 7818
						var4.field1169 = 0; // L: 7819
					}
				} else if (var6 == -1 || var4.sequence == -1 || ItemContainer.SequenceDefinition_get(var6).field2166 >= ItemContainer.SequenceDefinition_get(var4.sequence).field2166) { // L: 7822
					var4.sequence = var6; // L: 7823
					var4.sequenceFrame = 0; // L: 7824
					var4.sequenceFrameCycle = 0; // L: 7825
					var4.sequenceDelay = var7; // L: 7826
					var4.field1169 = 0; // L: 7827
					var4.field1134 = var4.pathLength; // L: 7828
				}
			}
		}

		for (var2 = 0; var2 < Client.field634; ++var2) { // L: 7834
			var3 = Client.field612[var2]; // L: 7835
			if (Client.npcs[var3].npcCycle != Client.cycle) { // L: 7836
				Client.npcs[var3].definition = null; // L: 7837
				Client.npcs[var3] = null; // L: 7838
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) { // L: 7841
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) { // L: 7842
				if (Client.npcs[Client.npcIndices[var2]] == null) { // L: 7843
					throw new RuntimeException(var2 + "," + Client.npcCount); // L: 7844
				}
			}

		}
	} // L: 7847

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "-4"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 9218
			if (Client.menuOptionsCount < 500) { // L: 9219
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9220
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9221
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9222
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9223
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9224
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9225
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 9226
				++Client.menuOptionsCount; // L: 9227
			}

		}
	} // L: 9229

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-403331915"
	)
	static final void method1982(int var0, int var1, int var2, boolean var3) {
		if (MusicPatchNode2.loadInterface(var0)) { // L: 10165
			class65.resizeInterface(EnumComposition.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 10166
		}
	} // L: 10167
}
