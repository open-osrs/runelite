import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lls;"
	)
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("g")
	public static short[] field83;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lf;Lf;I)I",
		garbageValue = "1171850991"
	)
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1); // L: 69
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 77
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 73
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "666077913"
	)
	static int method172(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) {
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1; // L: 23
			return var1; // L: 24
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 26
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) { // L: 28
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 29
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljq;",
		garbageValue = "5"
	)
	public static ItemDefinition ItemDefinition_get(int var0) {
		ItemDefinition var1 = (ItemDefinition)ItemDefinition.ItemDefinition_cached.get((long)var0); // L: 92
		if (var1 != null) { // L: 93
			return var1;
		} else {
			byte[] var2 = class231.ItemDefinition_archive.takeFile(10, var0); // L: 94
			var1 = new ItemDefinition(); // L: 95
			var1.id = var0; // L: 96
			if (var2 != null) { // L: 97
				var1.decode(new Buffer(var2));
			}

			var1.post(); // L: 98
			if (var1.noteTemplate != -1) { // L: 99
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) { // L: 100
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) { // L: 101
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemDefinition.ItemDefinition_inMembersWorld && var1.isMembersOnly) { // L: 102
				var1.name = "Members object"; // L: 103
				var1.isTradable = false; // L: 104
				var1.groundActions = null; // L: 105
				var1.inventoryActions = null; // L: 106
				var1.shiftClickIndex = -1; // L: 107
				var1.team = 0; // L: 108
				if (var1.params != null) { // L: 109
					boolean var3 = false; // L: 110

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) { // L: 111
						ParamDefinition var5 = PlayerAppearance.getParamDefinition((int)var4.key); // L: 112
						if (var5.autoDisable) { // L: 113
							var4.remove();
						} else {
							var3 = true; // L: 114
						}
					}

					if (!var3) { // L: 116
						var1.params = null;
					}
				}
			}

			ItemDefinition.ItemDefinition_cached.put(var1, (long)var0); // L: 119
			return var1; // L: 120
		}
	}

	@ObfuscatedName("k")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) { // L: 34
			if (var0 % 37L == 0L) { // L: 35
				return null;
			} else {
				int var2 = 0; // L: 36

				for (long var3 = var0; 0L != var3; var3 /= 37L) { // L: 37 38 40
					++var2; // L: 39
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) { // L: 42 43
					long var6 = var0; // L: 44
					var0 /= 37L; // L: 45
					var8 = class298.base37Table[(int)(var6 - var0 * 37L)]; // L: 46
					if (var8 == '_') { // L: 47
						int var9 = var5.length() - 1; // L: 48
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9))); // L: 49
						var8 = 160; // L: 50
					}
				}

				var5.reverse(); // L: 54
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0))); // L: 55
				return var5.toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("k")
	public static boolean method173(long var0) {
		boolean var2 = 0L != var0; // L: 52
		if (var2) { // L: 53
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1; // L: 56
			var2 = !var3; // L: 58
		}

		return var2; // L: 60
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2133866985"
	)
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63; // L: 17
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1811677104"
	)
	public static int parseInt(CharSequence var0) {
		return UserComparator7.parseIntCustomRadix(var0, 10, true); // L: 67
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2132548468"
	)
	static void method169() {
		Login.loginIndex = 24; // L: 1745
		UrlRequester.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1746
	} // L: 1747

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2070536842"
	)
	static void method164() {
		WorldMapSprite.method493(DevicePcmPlayerProvider.menuWidth / 2 + ChatChannel.menuX, Client.menuY); // L: 7205
	} // L: 7206
}
