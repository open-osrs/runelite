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
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field1905 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field1905[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "442770466"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
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
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && NetSocket.method3119(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && NetSocket.method3119(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= UserComparator4.method2508(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					boolean var8;
					if (Character.isISOControl(var7)) {
						var8 = false;
					} else if (WorldMapIcon_0.isAlphaNumeric(var7)) {
						var8 = true;
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
									if (var7 == var11) {
										var8 = true;
										break label91;
									}
								}

								var8 = false;
								break;
							}

							var11 = var9[var10];
							if (var11 == var7) {
								var8 = true;
								break;
							}

							++var10;
						}
					}

					if (var8) {
						char var12;
						switch(var7) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var12 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var12 = var7;
							break;
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
							var12 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var12 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var12 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var12 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var12 = 'n';
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
							var12 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var12 = 'u';
							break;
						case 'ß':
							var12 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var12 = 'y';
							break;
						default:
							var12 = Character.toLowerCase(var7);
						}

						if (var12 != 0) {
							var5.append(var12);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
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
		if (!class174.method3382(var0, var1)) {
			return null;
		} else {
			IndexedSprite var3 = new IndexedSprite();
			var3.width = class432.SpriteBuffer_spriteWidth;
			var3.height = class432.SpriteBuffer_spriteHeight;
			var3.xOffset = class141.SpriteBuffer_xOffsets[0];
			var3.yOffset = RouteStrategy.SpriteBuffer_yOffsets[0];
			var3.subWidth = class432.SpriteBuffer_spriteWidths[0];
			var3.subHeight = class330.SpriteBuffer_spriteHeights[0];
			var3.palette = class432.SpriteBuffer_spritePalette;
			var3.pixels = class369.SpriteBuffer_pixels[0];
			UserComparator3.method2529();
			return var3;
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(Ljm;Lfx;IIZI)V",
		garbageValue = "718071935"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			class21.insertMenuItem(var7, UserComparator5.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
