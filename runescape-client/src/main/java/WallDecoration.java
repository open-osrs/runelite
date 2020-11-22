import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("gd")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1368883061
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1255836875
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1394186747
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1069815711
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1005575771
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 287109355
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -872509349
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("entity1")
	public Entity entity1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("entity2")
	public Entity entity2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -3894207238426267157L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -237175035
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L; // L: 13
		this.flags = 0; // L: 14
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class248.World_request == null) { // L: 31
				class248.World_request = class52.urlRequester.request(new URL(PcmPlayer.worldListURL));
			} else if (class248.World_request.isDone()) { // L: 33
				byte[] var0 = class248.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				DefaultsGroup.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = DefaultsGroup.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				ModeWhere.sortWorlds(DefaultsGroup.World_worlds, 0, DefaultsGroup.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				class248.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			class248.World_request = null; // L: 57
		}

		return false; // L: 59
	}
}
