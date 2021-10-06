import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class174 {
	@ObfuscatedName("f")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("j")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1698208835
	)
	public static int field1994;
	@ObfuscatedName("a")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("e")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-44700481"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class4.World_request == null) {
				class4.World_request = WorldMapSection0.urlRequester.request(new URL(Messages.field1273));
			} else if (class4.World_request.isDone()) {
				byte[] var0 = class4.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class386.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class386.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class274.sortWorlds(class386.World_worlds, 0, class386.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class4.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class4.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1701952628"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
