import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 189428749
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -443583549
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2120803321
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1865243023
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 851664485
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1526795569
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 734373105
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1590073095
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("h")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("k")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("a")
	byte[][][] field2056;
	@ObfuscatedName("q")
	byte[][][] field2057;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[[[[Lfl;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("e")
	boolean field2059;
	@ObfuscatedName("c")
	boolean field2055;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2059 = false;
		this.field2055 = false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "-1489554607"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-64"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2059 && this.field2055;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljy;I)V",
		garbageValue = "-882466387"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2059 = true;
				this.field2055 = true;
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1710471414"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2056 = null;
		this.field2057 = null;
		this.decorations = null;
		this.field2059 = false;
		this.field2055 = false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IILnv;B)V",
		garbageValue = "80"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3615(var1, var2, var3, var4);
			} else {
				this.method3614(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILnv;II)V",
		garbageValue = "-657714466"
	)
	void method3615(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILnv;IB)V",
		garbageValue = "127"
	)
	void method3614(int var1, int var2, Buffer var3, int var4) {
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
					this.field2056[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2057[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6674();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-98"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-750308465"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}
}
