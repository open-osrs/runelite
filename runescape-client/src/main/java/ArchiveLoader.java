import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("crossSprites")
	static Sprite[] crossSprites;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -412619053
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 486257523
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Liw;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1957084823"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method4350(var1) || this.archive.method4349(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2074712023"
	)
	static final void method1208() {
		if (Client.logoutTimer > 0) { // L: 2585
			ViewportMouse.logOut(); // L: 2586
		} else {
			Client.timer.method5098(); // L: 2589
			CollisionMap.updateGameState(40); // L: 2590
			MouseHandler.field508 = Client.packetWriter.getSocket(); // L: 2591
			Client.packetWriter.removeSocket(); // L: 2592
		}
	} // L: 2587 2593

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-513803575"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7; // L: 4975
		int var4 = var1 >> 7; // L: 4976
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) { // L: 4977
			int var5 = var2; // L: 4978
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 4979
				var5 = var2 + 1;
			}

			int var6 = var0 & 127; // L: 4980
			int var7 = var1 & 127; // L: 4981
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7; // L: 4982
			int var9 = Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) + Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 >> 7; // L: 4983
			return var8 * (128 - var7) + var9 * var7 >> 7; // L: 4984
		} else {
			return 0;
		}
	}
}
