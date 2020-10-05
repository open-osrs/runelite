import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public final class WorldMapRectangle {
	@ObfuscatedName("d")
	static int[] Tiles_lightness;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 743023489
	)
	int width;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 995076797
	)
	int height;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1102925233
	)
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1014669257
	)
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "128"
	)
	static void addGameMessage(int var0, String var1, String var2) {
		WorldMapData_0.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Lcy;",
		garbageValue = "-1672146154"
	)
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = ApproximateRouteStrategy.archive12.takeFile(var0, 0); // L: 27
			if (var2 == null) { // L: 28
				return null; // L: 29
			} else {
				var1 = UserComparator7.newScript(var2); // L: 31
				Script.Script_cached.put(var1, (long)var0); // L: 32
				return var1; // L: 33
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2081056745"
	)
	static String method359() {
		return Tile.clientPreferences.hideUsername ? FontName.method5445(Login.Login_username) : Login.Login_username; // L: 213
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1970592993"
	)
	static void method361() {
		Players.Players_count = 0; // L: 616

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 617
			Players.field1277[var0] = null; // L: 618
			Players.field1284[var0] = 1; // L: 619
		}

	} // L: 621
}
