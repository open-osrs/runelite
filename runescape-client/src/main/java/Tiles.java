import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("l")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("q")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 824712715
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("j")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;
	@ObfuscatedName("m")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;
	@ObfuscatedName("e")
	static int[][] field981;
	@ObfuscatedName("y")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("w")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("v")
	static int[] field984;
	@ObfuscatedName("p")
	static final int[] field985;
	@ObfuscatedName("z")
	static final int[] field986;
	@ObfuscatedName("h")
	static final int[] field987;
	@ObfuscatedName("o")
	static final int[] field988;
	@ObfuscatedName("r")
	static final int[] field980;
	@ObfuscatedName("n")
	static final int[] field979;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1532295663
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1213635893
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive6")
	static Archive archive6;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field985 = new int[]{1, 2, 4, 8};
		field986 = new int[]{16, 32, 64, 128};
		field987 = new int[]{1, 0, -1, 0};
		field988 = new int[]{0, -1, 0, 1};
		field980 = new int[]{1, -1, -1, 1};
		field979 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Lbe;",
		garbageValue = "-911712342"
	)
	static Script method2023(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = UserComparator6.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = UserComparator6.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = GrandExchangeOfferOwnWorldComparator.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1127326674"
	)
	public static boolean method2024(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-965136856"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1813758002"
	)
	public static String method2025(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				char var6;
				if (var5 != 181 && var5 != 402) {
					var6 = Character.toTitleCase(var5);
				} else {
					var6 = var5;
				}

				var5 = var6;
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}
}
