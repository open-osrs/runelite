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
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
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
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2039082864"
	)
	boolean method1829() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1586384705"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1688533510"
	)
	boolean method1831() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-65"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "495435944"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	boolean method1845() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "719435212"
	)
	public static int method1870(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;I)V",
		garbageValue = "-186964533"
	)
	public static void method1849(AbstractArchive var0, AbstractArchive var1) {
		NPCDefinition.NpcDefinition_archive = var0;
		NPCDefinition.NpcDefinition_modelArchive = var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "689239187"
	)
	public static int method1871(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1735277376"
	)
	@Export("parseIntCustomRadix")
	public static int parseIntCustomRadix(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
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
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
