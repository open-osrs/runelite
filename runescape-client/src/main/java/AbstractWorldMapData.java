import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 485777657
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1648853135
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 259813413
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1299483951
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 333217485
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1265162417
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1495826135
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1718555041
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("g")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("v")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("s")
	byte[][][] field2155;
	@ObfuscatedName("c")
	byte[][][] field2149;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[[[[Lgk;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("x")
	boolean field2158;
	@ObfuscatedName("p")
	boolean field2159;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2158 = false;
		this.field2159 = false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "725648072"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1318755957"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2158 && this.field2159;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkl;I)V",
		garbageValue = "-207227347"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2158 = true;
				this.field2159 = true;
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "973157758"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2155 = null;
		this.field2149 = null;
		this.decorations = null;
		this.field2158 = false;
		this.field2159 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILot;B)V",
		garbageValue = "7"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3838(var1, var2, var3, var4);
			} else {
				this.method3854(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILot;II)V",
		garbageValue = "-1781544444"
	)
	void method3838(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILot;II)V",
		garbageValue = "817446843"
	)
	void method3854(int var1, int var2, Buffer var3, int var4) {
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
					this.field2155[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2149[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6977();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-344905889"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1558548546"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}
}
