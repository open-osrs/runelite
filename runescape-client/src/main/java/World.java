import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("World")
public class World {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 708983157
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1412956873
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("f")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("u")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1791268419
	)
	@Export("id")
	int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1457180793
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1283993585
	)
	@Export("population")
	int population;
	@ObfuscatedName("j")
	@Export("host")
	String host;
	@ObfuscatedName("p")
	@Export("activity")
	String activity;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -658464583
	)
	@Export("location")
	int location;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1286682885
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
	} // L: 27

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1842412760"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "728871441"
	)
	boolean method1628() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1860289724"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1727369163"
	)
	boolean method1612() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1493123434"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1898535773"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "116"
	)
	boolean method1638() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-200801552"
	)
	public static void method1655() {
		try {
			JagexCache.JagexCache_dat2File.close(); // L: 240

			for (int var0 = 0; var0 < JagexCache.idxCount; ++var0) { // L: 241
				class194.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 242
			JagexCache.JagexCache_randomDat.close(); // L: 243
		} catch (Exception var2) { // L: 245
		}

	} // L: 246
}
