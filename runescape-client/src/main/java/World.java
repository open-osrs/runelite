import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("World")
public class World {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lcj;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1189755659
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -8988331
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("p")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("l")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1102432463
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 920976113
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1580207855
	)
	@Export("population")
	int population;
	@ObfuscatedName("c")
	@Export("host")
	String host;
	@ObfuscatedName("i")
	@Export("activity")
	String activity;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1662346653
	)
	@Export("location")
	int location;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1162479517
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2039082864"
	)
	boolean method1829() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1586384705"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1688533510"
	)
	boolean method1831() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-65"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "495435944"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	boolean method1845() {
		return (1073741824 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "719435212"
	)
	public static int method1870(int var0) {
		--var0; // L: 24
		var0 |= var0 >>> 1; // L: 25
		var0 |= var0 >>> 2; // L: 26
		var0 |= var0 >>> 4; // L: 27
		var0 |= var0 >>> 8; // L: 28
		var0 |= var0 >>> 16; // L: 29
		return var0 + 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;I)V",
		garbageValue = "-186964533"
	)
	public static void method1849(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 57
		NPCComposition.NpcDefinition_modelArchive = var1; // L: 58
	} // L: 59

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "689239187"
	)
	public static int method1871(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 30
			int var6 = var3; // L: 31
			var3 = var4; // L: 32
			var4 = var6; // L: 33
		}

		var2 &= 3; // L: 35
		if (var2 == 0) { // L: 36
			return var1;
		} else if (var2 == 1) { // L: 37
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 38
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1735277376"
	)
	@Export("parseIntCustomRadix")
	public static int parseIntCustomRadix(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 80
			boolean var3 = false; // L: 81
			boolean var4 = false; // L: 82
			int var5 = 0; // L: 83
			int var6 = var0.length(); // L: 84

			for (int var7 = 0; var7 < var6; ++var7) { // L: 85
				char var8 = var0.charAt(var7); // L: 86
				if (var7 == 0) { // L: 87
					if (var8 == '-') { // L: 88
						var3 = true; // L: 89
						continue;
					}

					if (var8 == '+') { // L: 92
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 94
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 95
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 96
						throw new NumberFormatException(); // L: 97
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 98
					throw new NumberFormatException();
				}

				if (var3) { // L: 99
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 100
				if (var9 / var1 != var5) { // L: 101
					throw new NumberFormatException();
				}

				var5 = var9; // L: 102
				var4 = true; // L: 103
			}

			if (!var4) { // L: 105
				throw new NumberFormatException();
			} else {
				return var5; // L: 106
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "614025062"
	)
	public static int method1874(int var0) {
		if (var0 > 0) { // L: 195
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 196 197
		}
	}
}
