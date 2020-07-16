import java.awt.Component;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1613993877
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -341048683
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -718032253
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2006912863
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1970114381
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -352793185
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 449340635
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1711100227
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("a")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("z")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("w")
	byte[][][] field185;
	@ObfuscatedName("y")
	byte[][][] field175;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[[[[Lak;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("h")
	boolean field188;
	@ObfuscatedName("k")
	boolean field179;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field188 = false;
		this.field179 = false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V",
		garbageValue = "-1774414997"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "923610125"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field188 && this.field179;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lic;S)V",
		garbageValue = "19318"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field188 = true;
				this.field179 = true;
			}

		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1097959131"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field185 = null;
		this.field175 = null;
		this.decorations = null;
		this.field188 = false;
		this.field179 = false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IILkn;I)V",
		garbageValue = "929230318"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method319(var1, var2, var3, var4);
			} else {
				this.method320(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILkn;II)V",
		garbageValue = "1830113999"
	)
	void method319(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IILkn;IB)V",
		garbageValue = "73"
	)
	void method320(int var1, int var2, Buffer var3, int var4) {
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
				int var10 = var3.readUnsignedByte();
				if (var10 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var10;
					var11 = var3.readUnsignedByte();
					this.field185[var9][var1][var2] = (byte)(var11 >> 2);
					this.field175[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var14 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.method5843();
						int var13 = var3.readUnsignedByte();
						var14[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-4"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1541126292"
	)
	static void method342(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2015859206"
	)
	public static void method343() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "324919704"
	)
	static final void method328() {
		Object var10000 = null;
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		ObjectSound.addGameMessage(30, "", var0);
	}
}
