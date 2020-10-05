import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("z")
	static int[][][] Tiles_heights;
	@ObfuscatedName("k")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 210424451
	)
	static int Tiles_minPlane;
	@ObfuscatedName("t")
	static byte[][][] field528;
	@ObfuscatedName("i")
	static byte[][][] field521;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1682339213
	)
	public static int musicTrackVolume;
	@ObfuscatedName("m")
	static int[] Tiles_hue;
	@ObfuscatedName("n")
	static int[] Tiles_saturation;
	@ObfuscatedName("v")
	static final int[] field524;
	@ObfuscatedName("j")
	static final int[] field525;
	@ObfuscatedName("r")
	static final int[] field517;
	@ObfuscatedName("u")
	static final int[] field527;
	@ObfuscatedName("p")
	static final int[] field534;
	@ObfuscatedName("b")
	static final int[] field529;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1084049787
	)
	static int field535;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 96867879
	)
	static int field520;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	static StudioGame field532;

	static {
		Tiles_heights = new int[4][105][105]; // L: 16
		Tiles_renderFlags = new byte[4][104][104]; // L: 17
		Tiles_minPlane = 99; // L: 18
		field524 = new int[]{1, 2, 4, 8};
		field525 = new int[]{16, 32, 64, 128};
		field517 = new int[]{1, 0, -1, 0};
		field527 = new int[]{0, -1, 0, 1};
		field534 = new int[]{1, -1, -1, 1};
		field529 = new int[]{-1, -1, 1, 1};
		field535 = (int)(Math.random() * 17.0D) - 8; // L: 40
		field520 = (int)(Math.random() * 33.0D) - 16; // L: 41
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Lih;",
		garbageValue = "1036194944"
	)
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition(); // L: 35
			var1.id = var0; // L: 36
			if (var2 != null) { // L: 37
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("z")
	static boolean method1191(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L); // L: 46
		return var2 == 2; // L: 48
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lky;S)I",
		garbageValue = "5748"
	)
	static int method1186(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 179
		int var2;
		if (var1 == 0) { // L: 181
			var2 = 0;
		} else if (var1 == 1) { // L: 182
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 183
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 184
		}

		return var2; // L: 185
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-877871317"
	)
	public static boolean method1187(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) { // L: 61
			if (var0 != 0) { // L: 62
				char[] var1 = class297.cp1252AsciiExtension; // L: 64

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 65
					char var3 = var1[var2]; // L: 66
					if (var0 == var3) { // L: 68
						return true; // L: 69
					}
				}
			}

			return false; // L: 75
		} else {
			return true;
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1367737542"
	)
	static void method1177() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4254
			VarpDefinition.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4255
		}

	} // L: 4257

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V",
		garbageValue = "-1"
	)
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) { // L: 8240
			if (Client.menuOptionsCount < 500) { // L: 8241
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 8242
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 8243
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 8244
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 8245
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 8246
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 8247
				Client.menuShiftClick[Client.menuOptionsCount] = var6; // L: 8248
				++Client.menuOptionsCount; // L: 8249
			}

		}
	} // L: 8251
}
