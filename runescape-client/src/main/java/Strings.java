import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -742412081
	)
	static int field3397;
	@ObfuscatedName("by")
	public static String field3298;
	@ObfuscatedName("cs")
	public static String field3467;
	@ObfuscatedName("jo")
	public static String field3495;
	@ObfuscatedName("jh")
	public static String field3354;
	@ObfuscatedName("ji")
	public static String field3319;

	static {
		field3298 = "Please visit the support page for assistance.";
		field3467 = "Please visit the support page for assistance.";
		field3495 = "";
		field3354 = "Page has opened in a new window.";
		field3319 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "70"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (NPC.World_request == null) {
				NPC.World_request = WorldMapManager.urlRequester.request(new URL(ByteArrayPool.field3775));
			} else if (NPC.World_request.isDone()) {
				byte[] var0 = NPC.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class15.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class15.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				Varcs.sortWorlds(class15.World_worlds, 0, class15.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				NPC.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			NPC.World_request = null;
		}

		return false;
	}
}
