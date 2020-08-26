import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -235857651
	)
	static int field99;
	@ObfuscatedName("z")
	@Export("state")
	byte state;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1886313297
	)
	@Export("id")
	public int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1193190523
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1489525001
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -683135485
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2067595945
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		descriptor = "(Lkf;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "562486348"
	)
	@Export("status")
	public int status() {
		return this.state & 7; // L: 50
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1427821401"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0; // L: 54
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1947498588"
	)
	void method189(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1892738676"
	)
	void method184(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	} // L: 65

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lgn;I)I",
		garbageValue = "-780286568"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			var8 = LoginScreenAnimation.method1879(var10); // L: 58
			var9 = TileItem.standardizeChar(var9, var2); // L: 59
			var10 = TileItem.standardizeChar(var10, var2); // L: 60
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 61
				var9 = Character.toLowerCase(var9); // L: 62
				var10 = Character.toLowerCase(var10); // L: 63
				if (var10 != var9) { // L: 64
					return class58.lowercaseChar(var9, var2) - class58.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 67

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) { // L: 68
			if (var2 == Language.Language_FR) { // L: 69
				var5 = var3 - 1 - var17; // L: 70
				var6 = var4 - 1 - var17; // L: 71
			} else {
				var6 = var17; // L: 73
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 74
			var12 = var1.charAt(var6); // L: 75
			if (var12 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var12)) { // L: 76
				var18 = Character.toLowerCase(var18); // L: 77
				var12 = Character.toLowerCase(var12); // L: 78
				if (var18 != var12) {
					return class58.lowercaseChar(var18, var2) - class58.lowercaseChar(var12, var2); // L: 79
				}
			}
		}

		var17 = var3 - var4; // L: 82
		if (var17 != 0) { // L: 83
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 84
				var12 = var0.charAt(var19); // L: 85
				char var13 = var1.charAt(var19); // L: 86
				if (var13 != var12) { // L: 87
					return class58.lowercaseChar(var12, var2) - class58.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 89
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1774568305"
	)
	static boolean method207() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1427
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1428
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1429
				if (!var0.isLoaded()) {
					return false; // L: 1430
				}

				++Client.archiveLoadersDone; // L: 1431
			}

			return true; // L: 1433
		} else {
			return true; // L: 1432
		}
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "695036800"
	)
	static void method206() {
		if (Client.renderSelf) { // L: 4248
			VarpDefinition.addPlayerToScene(WorldMapLabelSize.localPlayer, false); // L: 4249
		}

	} // L: 4251

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-67"
	)
	static final int method209() {
		return Client.menuOptionsCount - 1; // L: 8254
	}
}
