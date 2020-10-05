import java.text.DecimalFormat;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Login")
public class Login {
	@ObfuscatedName("k")
	static boolean clearLoginScreen;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1062905543
	)
	static int xPadding;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	static Sprite rightTitleSprite;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	static IndexedSprite field1221;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -760884959
	)
	static int loginBoxX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 496089237
	)
	static int Login_loadingPercent;
	@ObfuscatedName("p")
	static String Login_loadingText;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1163892197
	)
	static int field1210;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -608933825
	)
	static int field1213;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 662808535
	)
	static int loginIndex;
	@ObfuscatedName("aq")
	static String Login_response0;
	@ObfuscatedName("al")
	static String Login_response1;
	@ObfuscatedName("ah")
	static String Login_response2;
	@ObfuscatedName("av")
	static String Login_response3;
	@ObfuscatedName("ax")
	static String Login_username;
	@ObfuscatedName("as")
	static String Login_password;
	@ObfuscatedName("af")
	static boolean field1224;
	@ObfuscatedName("ak")
	static boolean field1201;
	@ObfuscatedName("bc")
	static boolean field1223;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -189383965
	)
	static int currentLoginField;
	@ObfuscatedName("bg")
	static boolean worldSelectOpen;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -322396857
	)
	static int hoveredWorldIndex;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1129392139
	)
	static int worldSelectPage;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1846745523
	)
	static int worldSelectPagesCount;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = -4736688833894642183L
	)
	static long field1232;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = -2848820817006551463L
	)
	static long field1233;

	static {
		xPadding = 0; // L: 38
		loginBoxX = xPadding + 202; // L: 55
		Login_loadingPercent = 10; // L: 57
		Login_loadingText = ""; // L: 58
		field1210 = -1; // L: 65
		field1213 = 1; // L: 68
		loginIndex = 0; // L: 72
		Login_response0 = ""; // L: 73
		Login_response1 = ""; // L: 74
		Login_response2 = ""; // L: 75
		Login_response3 = ""; // L: 76
		Login_username = ""; // L: 77
		Login_password = ""; // L: 78
		field1224 = false; // L: 85
		field1201 = false; // L: 86
		field1223 = true; // L: 89
		currentLoginField = 0; // L: 90
		worldSelectOpen = false; // L: 94
		hoveredWorldIndex = -1; // L: 102
		worldSelectPage = 0; // L: 103
		worldSelectPagesCount = 0; // L: 104
		new DecimalFormat("##0.00"); // L: 107
		new class171();
		field1232 = -1L; // L: 115
		field1233 = -1L; // L: 116
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "942552334"
	)
	static final void method2160() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4308 4309 4326
			if (var0.plane == Huffman.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4310
				if (Client.cycle >= var0.cycleStart) { // L: 4311
					if (var0.targetIndex > 0) { // L: 4312
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4313
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4314
							var0.setDestination(var1.x, var1.y, ArchiveLoader.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4316
						int var2 = -var0.targetIndex - 1; // L: 4318
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4319
							var3 = WorldMapLabelSize.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4320
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, ArchiveLoader.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4321
						}
					}

					var0.advance(Client.field737); // L: 4323
					ScriptEvent.scene.drawEntity(Huffman.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4324
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4328
}
