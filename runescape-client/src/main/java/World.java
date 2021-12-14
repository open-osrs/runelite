import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("World")
public class World {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 63855855
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -951276337
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("w")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("n")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("k")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ai")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 402163899
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 967201023
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1525969609
	)
	@Export("population")
	int population;
	@ObfuscatedName("h")
	@Export("host")
	String host;
	@ObfuscatedName("g")
	@Export("activity")
	String activity;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -102724797
	)
	@Export("location")
	int location;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 742286855
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-624791914"
	)
	boolean method1696() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1709463484"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1754892594"
	)
	boolean method1676() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-24"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-126940607"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-98"
	)
	boolean method1679() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I[B[BI)V",
		garbageValue = "-1955457060"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3300 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3300 = new byte[11][];
			var0.field3301 = new byte[11][];
			var0.field3302 = new int[11];
			var0.field3303 = new int[11];
		}

		var0.field3300[var1] = var2;
		if (var2 != null) {
			var0.field3299 = true;
		} else {
			var0.field3299 = false;

			for (int var4 = 0; var4 < var0.field3300.length; ++var4) {
				if (var0.field3300[var4] != null) {
					var0.field3299 = true;
					break;
				}
			}
		}

		var0.field3301[var1] = var3;
	}
}
