import java.util.LinkedList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("gz")
	static byte[][] regionMapArchives;
	@ObfuscatedName("hc")
	@ObfuscatedGetter(
		intValue = -1751628859
	)
	static int cameraZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -79159629
	)
	int regionXLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 522527831
	)
	int regionYLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2063226565
	)
	int regionX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 480521769
	)
	int regionY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 946227363
	)
	int minPlane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1771727323
	)
	int planes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 10575415
	)
	int groupId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -466273533
	)
	int fileId;
	@ObfuscatedName("g")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("m")
	short[][][] floorOverlayIds;
	@ObfuscatedName("n")
	byte[][][] field198;
	@ObfuscatedName("d")
	byte[][][] field191;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "[[[[Laa;"
	)
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("a")
	boolean field182;
	@ObfuscatedName("q")
	boolean field194;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field182 = false;
		this.field194 = false;
	} // L: 29

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "728123848"
	)
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "83"
	)
	boolean isFullyLoaded() {
		return this.field182 && this.field194; // L: 32
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lic;B)V",
		garbageValue = "-109"
	)
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field182 = true; // L: 40
				this.field194 = true; // L: 41
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2117739140"
	)
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field198 = null; // L: 48
		this.field191 = null; // L: 49
		this.decorations = null; // L: 50
		this.field182 = false; // L: 51
		this.field194 = false; // L: 52
	} // L: 53

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IILkf;I)V",
		garbageValue = "-1176902168"
	)
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method329(var1, var2, var3, var4); // L: 61
			} else {
				this.method335(var1, var2, var3, var4);
			}

		}
	} // L: 58

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILkf;II)V",
		garbageValue = "1697201731"
	)
	void method329(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IILkf;II)V",
		garbageValue = "2061843342"
	)
	void method335(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field198[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field191[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method5634(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1414029315"
	)
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1685122418"
	)
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("z")
	public static String method331(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 16
			if (var0 % 37L == 0L) { // L: 17
				return null;
			} else {
				int var2 = 0; // L: 18

				for (long var3 = var0; var3 != 0L; var3 /= 37L) { // L: 19 20 22
					++var2; // L: 21
				}

				StringBuilder var5 = new StringBuilder(var2); // L: 24

				while (var0 != 0L) { // L: 25
					long var6 = var0; // L: 26
					var0 /= 37L; // L: 27
					var5.append(class298.base37Table[(int)(var6 - 37L * var0)]); // L: 28
				}

				return var5.reverse().toString(); // L: 30
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llp;IIII)V",
		garbageValue = "-224536193"
	)
	static void method353(Sprite var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, MenuAction.method2139(var1, var2, var3), var0.pixels.length * 4); // L: 42
	} // L: 43

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "396183986"
	)
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		FloorDecoration.sortWorlds(AbstractByteArrayCopier.World_worlds, 0, AbstractByteArrayCopier.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcy;ZI)I",
		garbageValue = "-1078037762"
	)
	static int method351(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3185
			Client.logoutTimer = 250; // L: 3186
			return 1; // L: 3187
		} else {
			return 2; // L: 3189
		}
	}

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1467299516"
	)
	static final void method354() {
		if (Huffman.Client_plane != Client.field902) { // L: 3319
			Client.field902 = Huffman.Client_plane; // L: 3320
			int var0 = Huffman.Client_plane; // L: 3321
			int[] var1 = ApproximateRouteStrategy.sceneMinimapSprite.pixels; // L: 3323
			int var2 = var1.length; // L: 3324

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 3325
				var1[var3] = 0;
			}

			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) { // L: 3326
				var4 = (103 - var3) * 2048 + 24628; // L: 3327

				for (var5 = 1; var5 < 103; ++var5) { // L: 3328
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 3329
						ScriptEvent.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 3330
						ScriptEvent.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}

					var4 += 4; // L: 3331
				}
			}

			var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 3334
			var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 3335
			ApproximateRouteStrategy.sceneMinimapSprite.setRaster(); // L: 3336

			int var6;
			for (var5 = 1; var5 < 103; ++var5) { // L: 3337
				for (var6 = 1; var6 < 103; ++var6) { // L: 3338
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 3339
						ChatChannel.drawObject(var0, var6, var5, var3, var4);
					}

					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 3340
						ChatChannel.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}

			Client.mapIconCount = 0; // L: 3343

			for (var5 = 0; var5 < 104; ++var5) { // L: 3344
				for (var6 = 0; var6 < 104; ++var6) { // L: 3345
					long var7 = ScriptEvent.scene.getFloorDecorationTag(Huffman.Client_plane, var5, var6); // L: 3346
					if (0L != var7) { // L: 3347
						int var9 = UserComparator9.Entity_unpackID(var7); // L: 3348
						int var10 = MidiPcmStream.getObjectDefinition(var9).mapIconId; // L: 3349
						if (var10 >= 0) { // L: 3350
							Client.mapIcons[Client.mapIconCount] = WorldMapSection0.WorldMapElement_get(var10).getSpriteBool(false); // L: 3351
							Client.mapIconXs[Client.mapIconCount] = var5; // L: 3352
							Client.mapIconYs[Client.mapIconCount] = var6; // L: 3353
							++Client.mapIconCount; // L: 3354
						}
					}
				}
			}

			WorldMapSprite.rasterProvider.apply(); // L: 3359
		}

	} // L: 3362
}
