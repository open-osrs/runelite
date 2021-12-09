import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1782223213
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1380556263
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1179298939
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1710961949
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1957720323
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1718804111
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2087149335
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1532441347
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("d")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("h")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("g")
	byte[][][] field2699;
	@ObfuscatedName("e")
	byte[][][] field2706;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "[[[[Lhb;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("u")
	boolean field2696;
	@ObfuscatedName("k")
	boolean field2709;

	AbstractWorldMapData() {
		this.groupId = -1; // L: 14
		this.fileId = -1; // L: 15
		new LinkedList();
		this.field2696 = false; // L: 26
		this.field2709 = false; // L: 27
	} // L: 29

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "28"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2143795454"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2696 && this.field2709; // L: 32
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lku;S)V",
		garbageValue = "9434"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) { // L: 36
			byte[] var2 = var1.takeFile(this.groupId, this.fileId); // L: 37
			if (var2 != null) { // L: 38
				this.readGeography(new Buffer(var2)); // L: 39
				this.field2696 = true; // L: 40
				this.field2709 = true; // L: 41
			}

		}
	} // L: 43

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null; // L: 46
		this.floorOverlayIds = null; // L: 47
		this.field2699 = null; // L: 48
		this.field2706 = null; // L: 49
		this.decorations = null; // L: 50
		this.field2696 = false; // L: 51
		this.field2709 = false; // L: 52
	} // L: 53

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILpi;I)V",
		garbageValue = "1462902800"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte(); // L: 56
		if (var4 != 0) { // L: 57
			if ((var4 & 1) != 0) { // L: 60
				this.method4762(var1, var2, var3, var4); // L: 61
			} else {
				this.method4763(var1, var2, var3, var4); // L: 64
			}

		}
	} // L: 58 66

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILpi;II)V",
		garbageValue = "-1058192672"
	)
	void method4762(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0; // L: 69
		if (var5) { // L: 70
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 71
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte(); // L: 73
	} // L: 74

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILpi;IB)V",
		garbageValue = "-82"
	)
	void method4763(int var1, int var2, Buffer var3, int var4) {
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
				int var14 = var3.readUnsignedByte(); // L: 84
				if (var14 != 0) { // L: 85
					this.floorOverlayIds[var9][var1][var2] = (short)var14; // L: 86
					var11 = var3.readUnsignedByte(); // L: 87
					this.field2699[var9][var1][var2] = (byte)(var11 >> 2); // L: 88
					this.field2706[var9][var1][var2] = (byte)(var11 & 3); // L: 89
				}
			}
		}

		if (var7) { // L: 93
			for (var8 = 0; var8 < var5; ++var8) { // L: 94
				var9 = var3.readUnsignedByte(); // L: 95
				if (var9 != 0) { // L: 96
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9]; // L: 99

					for (var11 = 0; var11 < var9; ++var11) { // L: 100
						int var12 = var3.method7400(); // L: 101
						int var13 = var3.readUnsignedByte(); // L: 102
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3); // L: 103
					}
				}
			}
		}

	} // L: 107

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-139627402"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX; // L: 112
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1464511988"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY; // L: 116
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "69"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 186
			return true;
		} else if (var0 >= 160 && var0 <= 255) { // L: 187
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 188
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-2046983611"
	)
	static final void method4787(Widget var0) {
		int var1 = var0.contentType; // L: 12214
		if (var1 == 324) { // L: 12215
			if (Client.field744 == -1) { // L: 12216
				Client.field744 = var0.spriteId2; // L: 12217
				Client.field571 = var0.spriteId; // L: 12218
			}

			if (Client.playerAppearance.isFemale) { // L: 12220
				var0.spriteId2 = Client.field744;
			} else {
				var0.spriteId2 = Client.field571; // L: 12221
			}

		} else if (var1 == 325) { // L: 12224
			if (Client.field744 == -1) { // L: 12225
				Client.field744 = var0.spriteId2; // L: 12226
				Client.field571 = var0.spriteId; // L: 12227
			}

			if (Client.playerAppearance.isFemale) { // L: 12229
				var0.spriteId2 = Client.field571;
			} else {
				var0.spriteId2 = Client.field744; // L: 12230
			}

		} else if (var1 == 327) { // L: 12233
			var0.modelAngleX = 150; // L: 12234
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12235
			var0.modelType = 5; // L: 12236
			var0.modelId = 0; // L: 12237
		} else if (var1 == 328) { // L: 12240
			var0.modelAngleX = 150; // L: 12241
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12242
			var0.modelType = 5; // L: 12243
			var0.modelId = 1; // L: 12244
		}
	} // L: 12222 12231 12238 12245 12247

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1607165722"
	)
	static String method4791(String var0) {
		PlayerType[] var1 = SpotAnimationDefinition.PlayerType_values(); // L: 12695

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12696
			PlayerType var3 = var1[var2]; // L: 12697
			if (var3.modIcon != -1 && var0.startsWith(class221.method4705(var3.modIcon))) { // L: 12699 12700
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12701
				break;
			}
		}

		return var0; // L: 12708
	}
}
