import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1056687123
	)
	@Export("pcmSampleLength")
	static int pcmSampleLength;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1204882397
	)
	@Export("x")
	int x;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 126335521
	)
	@Export("y")
	int y;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -301502337
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "-1897650462"
	)
	public static void method4252(AbstractArchive var0) {
		GrandExchangeOfferUnitPriceComparator.FloorOverlayDefinition_archive = var0; // L: 26
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "67"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 31
				World.World_request = ArchiveDiskActionHandler.urlRequester.request(new URL(class162.field1936));
			} else if (World.World_request.isDone()) { // L: 33
				byte[] var0 = World.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 47
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				FileSystem.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				World.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			World.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1748496485"
	)
	public static int method4253(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 38
			int var6 = var3; // L: 39
			var3 = var4; // L: 40
			var4 = var6; // L: 41
		}

		var2 &= 3; // L: 43
		if (var2 == 0) { // L: 44
			return var1;
		} else if (var2 == 1) { // L: 45
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 46
		}
	}
}
