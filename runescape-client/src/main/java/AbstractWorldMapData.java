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
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2696 = false;
		this.field2709 = false;
	}

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
		return this.field2696 && this.field2709;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lku;S)V",
		garbageValue = "9434"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2696 = true;
				this.field2709 = true;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2699 = null;
		this.field2706 = null;
		this.decorations = null;
		this.field2696 = false;
		this.field2709 = false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILpi;I)V",
		garbageValue = "1462902800"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4762(var1, var2, var3, var4);
			} else {
				this.method4763(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IILpi;II)V",
		garbageValue = "-1058192672"
	)
	void method4762(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILpi;IB)V",
		garbageValue = "-82"
	)
	void method4763(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedByte();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2699[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2706[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method7400();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-139627402"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1464511988"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "69"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "-2046983611"
	)
	static final void method4787(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field744 == -1) {
				Client.field744 = var0.spriteId2;
				Client.field571 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field744;
			} else {
				var0.spriteId2 = Client.field571;
			}

		} else if (var1 == 325) {
			if (Client.field744 == -1) {
				Client.field744 = var0.spriteId2;
				Client.field571 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field571;
			} else {
				var0.spriteId2 = Client.field744;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1607165722"
	)
	static String method4791(String var0) {
		PlayerType[] var1 = SpotAnimationDefinition.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class221.method4705(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
