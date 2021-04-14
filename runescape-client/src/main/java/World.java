import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("World")
public class World {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -466976069
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 284068341
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("g")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("h")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -53330073
	)
	@Export("id")
	int id;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1889608255
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 677246703
	)
	@Export("population")
	int population;
	@ObfuscatedName("c")
	@Export("host")
	String host;
	@ObfuscatedName("j")
	@Export("activity")
	String activity;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 931546619
	)
	@Export("location")
	int location;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1351760003
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-19498881"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 257
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2123080773"
	)
	boolean method1672() {
		return (2 & this.properties) != 0; // L: 261
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 265
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-30852"
	)
	boolean method1695() {
		return (8 & this.properties) != 0; // L: 269
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "118"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 273
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "54"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 277
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-91"
	)
	boolean method1677() {
		return (1073741824 & this.properties) != 0; // L: 281
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(Lhu;Lko;IIZI)V",
		garbageValue = "-1691139839"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 10185
		byte var6 = -1; // L: 10186
		String var7 = null; // L: 10187
		if (var5 != null && var5[var3] != null) { // L: 10188
			if (var3 == 0) { // L: 10189
				var6 = 33;
			} else if (var3 == 1) { // L: 10190
				var6 = 34;
			} else if (var3 == 2) { // L: 10191
				var6 = 35;
			} else if (var3 == 3) { // L: 10192
				var6 = 36;
			} else {
				var6 = 37; // L: 10193
			}

			var7 = var5[var3]; // L: 10194
		} else if (var3 == 4) { // L: 10197
			var6 = 37; // L: 10198
			var7 = "Drop"; // L: 10199
		}

		if (var6 != -1 && var7 != null) { // L: 10202
			AbstractByteArrayCopier.insertMenuItem(var7, DefaultsGroup.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 10203
		}

	} // L: 10205
}
