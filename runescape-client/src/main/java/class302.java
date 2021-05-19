import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class302 {
	@ObfuscatedName("h")
	public static char[] field3770;
	@ObfuscatedName("c")
	static char[] field3769;
	@ObfuscatedName("o")
	static char[] field3768;
	@ObfuscatedName("g")
	static int[] field3771;

	static {
		field3770 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field3770[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field3770[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field3770[var0] = (char)(var0 + 48 - 52);
		}

		field3770[62] = '+'; // L: 11
		field3770[63] = '/'; // L: 12
		field3769 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field3769[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field3769[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field3769[var0] = (char)(var0 + 48 - 52);
		}

		field3769[62] = '*'; // L: 22
		field3769[63] = '-'; // L: 23
		field3768 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field3768[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field3768[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field3768[var0] = (char)(var0 + 48 - 52);
		}

		field3768[62] = '-'; // L: 33
		field3768[63] = '_'; // L: 34
		field3771 = new int[128]; // L: 40

		for (var0 = 0; var0 < field3771.length; ++var0) { // L: 41
			field3771[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field3771[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field3771[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field3771[var0] = var0 - 48 + 52;
		}

		int[] var2 = field3771; // L: 45
		field3771[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field3771; // L: 48
		field3771[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	static final void method5372() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4718 4719 4736
			if (var0.plane == ParamComposition.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4720
				if (Client.cycle >= var0.cycleStart) { // L: 4721
					if (var0.targetIndex > 0) { // L: 4722
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4723
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4724
							var0.setDestination(var1.x, var1.y, SceneTilePaint.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4726
						int var2 = -var0.targetIndex - 1; // L: 4728
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4729
							var3 = class35.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4730
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, SceneTilePaint.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4731
						}
					}

					var0.advance(Client.field768); // L: 4733
					class5.scene.drawEntity(ParamComposition.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4734
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4738
}
