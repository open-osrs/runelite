import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = -1795954439
	)
	static int field198;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 256317953
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -985241173
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1287028281
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1006344441
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1534728703
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -622931363
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1787627211
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 953400525
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("u")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("t")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("e")
	byte[][][] field196;
	@ObfuscatedName("o")
	byte[][][] field187;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "[[[[Laz;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("x")
	boolean field202;
	@ObfuscatedName("p")
	boolean field200;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field202 = false; // L: 26
		this.field200 = false; // L: 27
	} // L: 29

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1024222647"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "15"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field202 && this.field200; // L: 32
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Liw;B)V",
		garbageValue = "-18"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field202 = true; // L: 40
				this.field200 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-246521616"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field196 = null; // L: 48
		this.field187 = null; // L: 49
		this.decorations = null; // L: 50
		this.field202 = false; // L: 51
		this.field200 = false; // L: 52
	} // L: 53

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IILkb;I)V",
		garbageValue = "1303493953"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method337(var1, var2, var3, var4); // L: 61
			} else {
				this.method343(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILkb;IB)V",
		garbageValue = "96"
	)
	void method337(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILkb;II)V",
		garbageValue = "1646413468"
	)
	void method343(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1; // L: 77
		boolean var6 = (var4 & 2) != 0; // L: 78
		boolean var7 = (var4 & 4) != 0; // L: 79
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 80
		int var8;
		int var9;
		int var11;
		if (var6) { // L: 81
			var8 = var3.readUnsignedByte(); // L: 82

			for (var9 = 0; var9 < var8; ++var9) { // L: 83
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field196[var9][var1][var2] = (byte)(var11 >> 2);
					this.field187[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method5851();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "66"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljk;",
		garbageValue = "1003321139"
	)
	@Export("ItemDefinition_get")
	public static ItemDefinition ItemDefinition_get(int var0) {
		ItemDefinition var1 = (ItemDefinition)ItemDefinition.ItemDefinition_cached.get((long)var0); // L: 84
		if (var1 != null) { // L: 85
			return var1;
		} else {
			byte[] var2 = ItemDefinition.ItemDefinition_archive.takeFile(10, var0); // L: 86
			var1 = new ItemDefinition(); // L: 87
			var1.id = var0; // L: 88
			if (var2 != null) { // L: 89
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 90
			if (var1.noteTemplate != -1) { // L: 91
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 92
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 93
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!SoundCache.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 94
				var1.name = "Members object"; // L: 95
				var1.isTradable = false; // L: 96
				var1.groundActions = null; // L: 97
				var1.inventoryActions = null; // L: 98
				var1.shiftClickIndex = -1; // L: 99
				var1.team = 0; // L: 100
				if (var1.params != null) { // L: 101
					boolean var3 = false; // L: 102

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 103
						ParamDefinition var5 = TileItem.getParamDefinition((int)var4.key); // L: 104
						if (var5.autoDisable) { // L: 105
							var4.remove();
						} else {
							var3 = true; // L: 106
						}
					}

					if (!var3) { // L: 108
						var1.params = null;
					}
				}
			}

			ItemDefinition.ItemDefinition_cached.put(var1, (long)var0); // L: 111
			return var1; // L: 112
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-47710105"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 143
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1953135448"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4415
			byte var2 = 4; // L: 4416
			int var3 = var2 + 6; // L: 4417
			int var4 = var2 + 6; // L: 4418
			int var5 = WorldMapCacheName.fontPlain12.lineWidth(var0, 250); // L: 4419
			int var6 = WorldMapCacheName.fontPlain12.lineCount(var0, 250) * 13; // L: 4420
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 0); // L: 4421
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 16777215); // L: 4422
			WorldMapCacheName.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4423
			int var7 = var3 - var2; // L: 4424
			int var8 = var4 - var2; // L: 4425
			int var9 = var2 + var2 + var5; // L: 4426
			int var10 = var2 + var6 + var2; // L: 4427

			int var11;
			for (var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4429
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4430
					Client.field834[var11] = true;
				}
			}

			if (var1) { // L: 4433
				class22.rasterProvider.drawFull(0, 0); // L: 4434
			} else {
				var11 = var3; // L: 4437
				int var12 = var4; // L: 4438
				int var13 = var5; // L: 4439
				int var14 = var6; // L: 4440

				for (int var15 = 0; var15 < Client.rootWidgetCount; ++var15) { // L: 4442
					if (Client.rootWidgetWidths[var15] + Client.rootWidgetXs[var15] > var11 && Client.rootWidgetXs[var15] < var11 + var13 && Client.rootWidgetHeights[var15] + Client.rootWidgetYs[var15] > var12 && Client.rootWidgetYs[var15] < var14 + var12) { // L: 4443
						Client.field758[var15] = true;
					}
				}
			}

		}
	} // L: 4447

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	static void method375() {
		Client.menuOptionsCount = 0; // L: 7729
		Client.isMenuOpen = false; // L: 7730
	} // L: 7731
}
