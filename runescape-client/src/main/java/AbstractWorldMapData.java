import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 355210745
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1471766729
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -801266965
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 882284497
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1262038287
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1001361869
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1629652609
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2041641449
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("v")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("f")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("s")
	byte[][][] field2143;
	@ObfuscatedName("h")
	byte[][][] field2144;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "[[[[Lgc;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("q")
	boolean field2146;
	@ObfuscatedName("j")
	boolean field2147;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2146 = false;
		this.field2147 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "2"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "53"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2146 && this.field2147;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkk;I)V",
		garbageValue = "-1354291694"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2146 = true;
				this.field2147 = true;
			}

		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-74"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2143 = null;
		this.field2144 = null;
		this.decorations = null;
		this.field2146 = false;
		this.field2147 = false;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IILot;B)V",
		garbageValue = "59"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method3776(var1, var2, var3, var4);
			} else {
				this.method3777(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IILot;IB)V",
		garbageValue = "0"
	)
	void method3776(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILot;IB)V",
		garbageValue = "103"
	)
	void method3777(int var1, int var2, Buffer var3, int var4) {
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
					this.field2143[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2144[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method6985();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-40452526"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1885413778"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2132924583"
	)
	static String method3800() {
		return VarbitComposition.clientPreferences.hideUsername ? GraphicsObject.method1866(Login.Login_username) : Login.Login_username;
	}
}
