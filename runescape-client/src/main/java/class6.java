import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public enum class6 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Li;"
	)
	field27(0, 0);

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("ItemDefinition_modelArchive")
	public static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	static Bounds field25;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1479015629
	)
	final int field22;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 538107041
	)
	final int field20;

	class6(int var3, int var4) {
		this.field22 = var3; // L: 12
		this.field20 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field20; // L: 18
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-72"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (WorldMapID.World_request == null) { // L: 31
				WorldMapID.World_request = urlRequester.request(new URL(ModelData0.field2546));
			} else if (WorldMapID.World_request.isDone()) { // L: 33
				byte[] var0 = WorldMapID.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				class33.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = class33.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				Players.sortWorlds(class33.World_worlds, 0, class33.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				WorldMapID.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			WorldMapID.World_request = null; // L: 57
		}

		return false; // L: 59
	}
}
