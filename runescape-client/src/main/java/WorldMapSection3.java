import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("WorldMapSection3")
public class WorldMapSection3 implements WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -862489875
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1213021705
	)
	int field391;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -54957495
	)
	int field379;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1592783569
	)
	int field383;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 370580043
	)
	int field381;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -461171823
	)
	int field382;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -238437965
	)
	int field380;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -344073573
	)
	int field384;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -290440995
	)
	int field385;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1800160845
	)
	int field386;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1694202633
	)
	int field387;

	WorldMapSection3() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lad;I)V",
		garbageValue = "411670415"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field382) {
			var1.regionLowX = this.field382;
		}

		if (var1.regionHighX < this.field382) {
			var1.regionHighX = this.field382;
		}

		if (var1.regionLowY > this.field380) {
			var1.regionLowY = this.field380;
		}

		if (var1.regionHighY < this.field380) {
			var1.regionHighY = this.field380;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field391 && var1 < this.field379 + this.field391) {
			return var2 >= (this.field383 << 6) + (this.field384 << 3) && var2 <= (this.field383 << 6) + (this.field384 << 3) + 7 && var3 >= (this.field381 << 6) + (this.field385 << 3) && var3 <= (this.field381 << 6) + (this.field385 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "48"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field382 << 6) + (this.field386 << 3) && var1 <= (this.field382 << 6) + (this.field386 << 3) + 7 && var2 >= (this.field380 << 6) + (this.field387 << 3) && var2 <= (this.field380 << 6) + (this.field387 << 3) + 7;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "459340529"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{var2 + (this.field382 * 64 - this.field383 * 64) + (this.field386 * 8 - this.field384 * 8), var3 + (this.field380 * 64 - this.field381 * 64) + (this.field387 * 8 - this.field385 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)Lhg;",
		garbageValue = "1240901536"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field383 * 64 - this.field382 * 64 + (this.field384 * 8 - this.field386 * 8) + var1;
			int var4 = var2 + (this.field381 * 64 - this.field380 * 64) + (this.field385 * 8 - this.field387 * 8);
			return new Coord(this.field391, var3, var4);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)V",
		garbageValue = "0"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field391 = var1.readUnsignedByte();
		this.field379 = var1.readUnsignedByte();
		this.field383 = var1.readUnsignedShort();
		this.field384 = var1.readUnsignedByte();
		this.field381 = var1.readUnsignedShort();
		this.field385 = var1.readUnsignedByte();
		this.field382 = var1.readUnsignedShort();
		this.field386 = var1.readUnsignedByte();
		this.field380 = var1.readUnsignedShort();
		this.field387 = var1.readUnsignedByte();
		this.method842();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1212353754"
	)
	void method842() {
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "26"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (VertexNormal.World_request == null) {
				VertexNormal.World_request = WorldMapLabelSize.urlRequester.request(new URL(HorizontalAlignment.worldListURL));
			} else if (VertexNormal.World_request.isDone()) {
				byte[] var0 = VertexNormal.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class13.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class13.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				GrandExchangeOffer.sortWorlds(class13.World_worlds, 0, class13.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				VertexNormal.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			VertexNormal.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-672116026"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Lig;",
		garbageValue = "34"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, FloorUnderlayDefinition.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	static final void method841() {
		int var0 = WorldMapRectangle.menuX;
		int var1 = Frames.menuY;
		int var2 = class69.menuWidth;
		int var3 = ApproximateRouteStrategy.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		GrandExchangeOfferNameComparator.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			int var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31;
			int var9 = 16777215;
			if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}

			Font var10 = GrandExchangeOfferNameComparator.fontBold12;
			String var11;
			if (var7 < 0) {
				var11 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7];
			}

			var10.draw(var11, var0 + 3, var8, var9, 0);
		}

		WorldMapData_0.method243(WorldMapRectangle.menuX, Frames.menuY, class69.menuWidth, ApproximateRouteStrategy.menuHeight);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (UserComparator4.loadInterface(var0)) {
			Widget[] var1 = Widget.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
