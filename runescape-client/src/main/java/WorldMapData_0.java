import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("archive7")
	static Archive archive7;

	WorldMapData_0() {
	} // L: 6

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "2072507243"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 9
		if (var2 != WorldMapID.field301.value) { // L: 10
			throw new IllegalStateException(""); // L: 11
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 13
			super.planes = var1.readUnsignedByte(); // L: 14
			super.regionXLow = var1.readUnsignedShort(); // L: 15
			super.regionYLow = var1.readUnsignedShort(); // L: 16
			super.regionX = var1.readUnsignedShort(); // L: 17
			super.regionY = var1.readUnsignedShort(); // L: 18
			super.groupId = var1.method5833(); // L: 19
			super.fileId = var1.method5833(); // L: 20
		}
	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkx;B)V",
		garbageValue = "36"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4); // L: 24
		super.floorUnderlayIds = new short[1][64][64]; // L: 25
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 26
		super.field193 = new byte[super.planes][64][64]; // L: 27
		super.field204 = new byte[super.planes][64][64]; // L: 28
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 29
		int var2 = var1.readUnsignedByte(); // L: 30
		if (var2 != class39.field285.value) {
			throw new IllegalStateException(""); // L: 32
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false; // L: 48
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return super.regionX == var2.regionX && super.regionY == var2.regionY;
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-825511368"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (UserComparator9.World_request == null) { // L: 31
				UserComparator9.World_request = ScriptFrame.urlRequester.request(new URL(Projectile.field1254));
			} else if (UserComparator9.World_request.isDone()) { // L: 33
				byte[] var0 = UserComparator9.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = World.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				class206.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				UserComparator9.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			UserComparator9.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-9455782"
	)
	static int method250(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) { // L: 508
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0; // L: 509
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	public static void method239() {
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 543
	} // L: 544
}
