import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 132603253
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1994150525
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1137484745
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1490566699
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2105987209
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 999326875
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 769253589
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 805585157
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 180055579
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -106119971
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1816013269
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2075610043
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 754853053
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1118736637
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "112"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-90"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) { // L: 32
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-5"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-76"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Lhd;",
		garbageValue = "-1841969392"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-489268143"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort(); // L: 64
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 68
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 69
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1652627756"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "705199058"
	)
	public static String method311(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 11
			return "";
		} else if (var2 == 1) { // L: 12
			CharSequence var10 = var0[var1]; // L: 13
			return var10 == null ? "null" : var10.toString(); // L: 14 15
		} else {
			int var3 = var2 + var1; // L: 17
			int var4 = 0; // L: 18

			for (int var5 = var1; var5 < var3; ++var5) { // L: 19
				CharSequence var9 = var0[var5]; // L: 20
				if (var9 == null) { // L: 21
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 22
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 24

			for (int var6 = var1; var6 < var3; ++var6) { // L: 25
				CharSequence var7 = var0[var6]; // L: 26
				if (var7 == null) { // L: 27
					var8.append("null");
				} else {
					var8.append(var7); // L: 28
				}
			}

			return var8.toString(); // L: 30
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "16686"
	)
	static void method308(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 53
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) { // L: 54
				int var5 = 0; // L: 55
				if (var1 > var4.field1090) { // L: 56
					var5 += var1 - var4.field1090;
				} else if (var1 < var4.x) { // L: 57
					var5 += var4.x - var1;
				}

				if (var2 > var4.field1094) { // L: 58
					var5 += var2 - var4.field1094;
				} else if (var2 < var4.y) { // L: 59
					var5 += var4.y - var2;
				}

				if (var5 - 64 <= var4.field1092 && WorldMapSectionType.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) { // L: 60
					var5 -= 64; // L: 71
					if (var5 < 0) { // L: 72
						var5 = 0;
					}

					int var6 = (var4.field1092 - var5) * WorldMapSectionType.clientPreferences.areaSoundEffectsVolume / var4.field1092; // L: 73
					if (var4.stream1 == null) { // L: 74
						if (var4.soundEffectId >= 0) { // L: 75
							SoundEffect var7 = SoundEffect.readSoundEffect(WorldMapCacheName.archive4, var4.soundEffectId, 0); // L: 76
							if (var7 != null) { // L: 77
								RawSound var8 = var7.toRawSound().resample(World.decimator); // L: 78
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6); // L: 79
								var9.setNumLoops(-1); // L: 80
								VarbitComposition.pcmStreamMixer.addSubStream(var9); // L: 81
								var4.stream1 = var9; // L: 82
							}
						}
					} else {
						var4.stream1.method2796(var6); // L: 86
					}

					if (var4.stream2 == null) { // L: 87
						if (var4.soundEffectIds != null && (var4.field1097 -= var3) <= 0) { // L: 88
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length); // L: 89
							SoundEffect var12 = SoundEffect.readSoundEffect(WorldMapCacheName.archive4, var4.soundEffectIds[var11], 0); // L: 90
							if (var12 != null) { // L: 91
								RawSound var13 = var12.toRawSound().resample(World.decimator); // L: 92
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6); // L: 93
								var10.setNumLoops(0); // L: 94
								VarbitComposition.pcmStreamMixer.addSubStream(var10); // L: 95
								var4.stream2 = var10; // L: 96
								var4.field1097 = var4.field1095 + (int)(Math.random() * (double)(var4.field1096 - var4.field1095)); // L: 97
							}
						}
					} else {
						var4.stream2.method2796(var6); // L: 102
						if (!var4.stream2.hasNext()) { // L: 103
							var4.stream2 = null; // L: 104
						}
					}
				} else {
					if (var4.stream1 != null) { // L: 61
						VarbitComposition.pcmStreamMixer.removeSubStream(var4.stream1); // L: 62
						var4.stream1 = null; // L: 63
					}

					if (var4.stream2 != null) { // L: 65
						VarbitComposition.pcmStreamMixer.removeSubStream(var4.stream2); // L: 66
						var4.stream2 = null; // L: 67
					}
				}
			}
		}

	} // L: 108

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILeq;[Lfe;I)V",
		garbageValue = "2043009976"
	)
	static final void method310(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0); // L: 173
		int var11 = -1; // L: 174

		while (true) {
			int var12 = var10.method5704(); // L: 176
			if (var12 == 0) { // L: 177
				return; // L: 232
			}

			var11 += var12; // L: 178
			int var13 = 0; // L: 179

			while (true) {
				int var14 = var10.readUShortSmart(); // L: 181
				if (var14 == 0) { // L: 182
					break;
				}

				var13 += var14 - 1; // L: 183
				int var15 = var13 & 63; // L: 184
				int var16 = var13 >> 6 & 63; // L: 185
				int var17 = var13 >> 12; // L: 186
				int var18 = var10.readUnsignedByte(); // L: 187
				int var19 = var18 >> 2; // L: 188
				int var20 = var18 & 3; // L: 189
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) { // L: 190
					ObjectComposition var21 = WorldMapAreaData.getObjectDefinition(var11); // L: 191
					int var24 = var16 & 7; // L: 194
					int var25 = var15 & 7; // L: 195
					int var27 = var21.sizeX; // L: 197
					int var28 = var21.sizeY; // L: 198
					int var29;
					if ((var20 & 1) == 1) { // L: 200
						var29 = var27; // L: 201
						var27 = var28; // L: 202
						var28 = var29; // L: 203
					}

					int var26 = var7 & 3; // L: 205
					int var23;
					if (var26 == 0) { // L: 206
						var23 = var24; // L: 207
					} else if (var26 == 1) { // L: 210
						var23 = var25; // L: 211
					} else if (var26 == 2) { // L: 214
						var23 = 7 - var24 - (var27 - 1); // L: 215
					} else {
						var23 = 7 - var25 - (var28 - 1); // L: 218
					}

					var29 = var2 + var23; // L: 220
					int var30 = var3 + DevicePcmPlayerProvider.method921(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20); // L: 221
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) { // L: 222
						int var31 = var1; // L: 223
						if ((Tiles.Tiles_renderFlags[1][var29][var30] & 2) == 2) { // L: 224
							var31 = var1 - 1;
						}

						CollisionMap var32 = null; // L: 225
						if (var31 >= 0) { // L: 226
							var32 = var9[var31];
						}

						GameEngine.method1134(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32); // L: 227
					}
				}
			}
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)Lmf;",
		garbageValue = "355278253"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return SoundSystem.worldMap; // L: 663
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-116"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3468
			WorldMapSectionType.clientPreferences.roofsHidden = !WorldMapSectionType.clientPreferences.roofsHidden; // L: 3469
			class23.savePreferences(); // L: 3470
			if (WorldMapSectionType.clientPreferences.roofsHidden) { // L: 3471
				AbstractWorldMapData.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				AbstractWorldMapData.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3472
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3474
			Client.displayFps = !Client.displayFps;
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf; // L: 3475
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3476
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3477
			if (var0.equalsIgnoreCase("errortest")) { // L: 3478
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3479
				SoundSystem.worldMap.showCoord = !SoundSystem.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3480
				Client.displayFps = true;
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Client.displayFps = false; // L: 3481
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3482
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3483
				class8.method90();
			}
		}

		PacketBufferNode var1 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher); // L: 3486
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3487
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3488
		Client.packetWriter.addNode(var1); // L: 3489
	} // L: 3490
}
