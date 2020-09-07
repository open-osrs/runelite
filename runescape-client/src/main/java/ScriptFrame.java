import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 394588123
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("s")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("t")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1817871528"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (WorldMapScaleHandler.World_request == null) { // L: 31
				WorldMapScaleHandler.World_request = UserComparator4.urlRequester.request(new URL(BZip2State.worldListURL));
			} else if (WorldMapScaleHandler.World_request.isDone()) { // L: 33
				byte[] var0 = WorldMapScaleHandler.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				AbstractByteArrayCopier.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = AbstractByteArrayCopier.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				FloorDecoration.sortWorlds(AbstractByteArrayCopier.World_worlds, 0, AbstractByteArrayCopier.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				WorldMapScaleHandler.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			WorldMapScaleHandler.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	static void method1192() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 217
			if (Tile.clientPreferences.rememberedUsername != null) { // L: 218
				Login.Login_username = Tile.clientPreferences.rememberedUsername; // L: 219
				Client.Login_isUsernameRemembered = true; // L: 220
			} else {
				Client.Login_isUsernameRemembered = false; // L: 222
			}

		}
	} // L: 223
}
