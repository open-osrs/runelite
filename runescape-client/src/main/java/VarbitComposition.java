import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("s")
	static final int[] field1905;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1455193379
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1681216867
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1158305531
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
		field1905 = new int[32]; // L: 15
		int var0 = 2; // L: 18

		for (int var1 = 0; var1 < 32; ++var1) { // L: 19
			field1905[var1] = var0 - 1; // L: 20
			var0 += var0; // L: 21
		}

	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "442770466"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 27
			if (var2 == 0) { // L: 28
				return; // L: 31
			}

			this.decodeNext(var1, var2); // L: 29
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "1766433531"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Low;I)Ljava/lang/String;",
		garbageValue = "402019438"
	)
	public static String method3395(CharSequence var0, LoginType var1) {
		if (var0 == null) { // L: 32
			return null;
		} else {
			int var2 = 0; // L: 33

			int var3;
			for (var3 = var0.length(); var2 < var3 && NetSocket.method3119(var0.charAt(var2)); ++var2) { // L: 34 35
			}

			while (var3 > var2 && NetSocket.method3119(var0.charAt(var3 - 1))) { // L: 36
				--var3;
			}

			int var4 = var3 - var2; // L: 37
			if (var4 >= 1 && var4 <= UserComparator4.method2508(var1)) { // L: 38
				StringBuilder var5 = new StringBuilder(var4); // L: 39

				for (int var6 = var2; var6 < var3; ++var6) { // L: 40
					char var7 = var0.charAt(var6); // L: 41
					boolean var8;
					if (Character.isISOControl(var7)) { // L: 44
						var8 = false; // L: 45
					} else if (WorldMapIcon_0.isAlphaNumeric(var7)) { // L: 48
						var8 = true; // L: 49
					} else {
						char[] var9 = class400.field4411;
						int var10 = 0;

						label91:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class400.field4410;

								for (var10 = 0; var10 < var9.length; ++var10) {
									var11 = var9[var10];
									if (var7 == var11) { // L: 66
										var8 = true; // L: 67
										break label91;
									}
								}

								var8 = false; // L: 72
								break;
							}

							var11 = var9[var10]; // L: 55
							if (var11 == var7) {
								var8 = true;
								break;
							}

							++var10; // L: 54
						}
					}

					if (var8) { // L: 74
						char var12;
						switch(var7) { // L: 77
						case ' ':
						case '-':
						case '_':
						case ' ':
							var12 = '_'; // L: 157
							break;
						case '#':
						case '[':
						case ']':
							var12 = var7; // L: 85
							break; // L: 86
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var12 = 'a'; // L: 101
							break; // L: 102
						case 'Ç':
						case 'ç':
							var12 = 'c'; // L: 89
							break; // L: 90
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var12 = 'e'; // L: 140
							break; // L: 141
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var12 = 'i'; // L: 151
							break;
						case 'Ñ':
						case 'ñ':
							var12 = 'n'; // L: 80
							break;
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var12 = 'o'; // L: 120
							break; // L: 121
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var12 = 'u'; // L: 130
							break; // L: 131
						case 'ß':
							var12 = 'b'; // L: 108
							break; // L: 109
						case 'ÿ':
						case 'Ÿ':
							var12 = 'y'; // L: 105
							break; // L: 106
						default:
							var12 = Character.toLowerCase(var7); // L: 143
						}

						if (var12 != 0) { // L: 162
							var5.append(var12); // L: 163
						}
					}
				}

				if (var5.length() == 0) { // L: 165
					return null;
				} else {
					return var5.toString(); // L: 166
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lku;II)Lpa;",
		garbageValue = "120991325"
	)
	public static IndexedSprite method3396(AbstractArchive var0, int var1) {
		if (!class174.method3382(var0, var1)) { // L: 53
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite(); // L: 56
			var3.width = class432.SpriteBuffer_spriteWidth; // L: 57
			var3.height = class432.SpriteBuffer_spriteHeight; // L: 58
			var3.xOffset = class141.SpriteBuffer_xOffsets[0]; // L: 59
			var3.yOffset = RouteStrategy.SpriteBuffer_yOffsets[0]; // L: 60
			var3.subWidth = class432.SpriteBuffer_spriteWidths[0]; // L: 61
			var3.subHeight = class330.SpriteBuffer_spriteHeights[0]; // L: 62
			var3.palette = class432.SpriteBuffer_spritePalette; // L: 63
			var3.pixels = class369.SpriteBuffer_pixels[0]; // L: 64
			UserComparator3.method2529(); // L: 65
			return var3; // L: 68
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ljm;Lfx;IIZI)V",
		garbageValue = "718071935"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions; // L: 11144
		byte var6 = -1; // L: 11145
		String var7 = null; // L: 11146
		if (var5 != null && var5[var3] != null) { // L: 11147
			if (var3 == 0) { // L: 11148
				var6 = 33;
			} else if (var3 == 1) { // L: 11149
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35; // L: 11150
			} else if (var3 == 3) { // L: 11151
				var6 = 36;
			} else {
				var6 = 37; // L: 11152
			}

			var7 = var5[var3]; // L: 11153
		} else if (var3 == 4) { // L: 11156
			var6 = 37; // L: 11157
			var7 = "Drop"; // L: 11158
		}

		if (var6 != -1 && var7 != null) { // L: 11161
			class21.insertMenuItem(var7, UserComparator5.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4); // L: 11162
		}

	} // L: 11164
}
