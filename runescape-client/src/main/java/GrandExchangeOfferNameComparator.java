import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1624406993
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -755072753
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lx;Lx;I)I",
		garbageValue = "1549101660"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Llm;IIII)V",
		garbageValue = "-1717498700"
	)
	static void method211(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, AttackOption.method2203(var1, var2, var3), var0.pixels.length * 4); // L: 46
	} // L: 47

	@ObfuscatedName("z")
	@Export("Entity_unpackSceneX")
	public static int Entity_unpackSceneX(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 68
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lig;II)Z",
		garbageValue = "754600726"
	)
	public static boolean method212(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 198
		if (var2 == null) { // L: 199
			return false;
		} else {
			SpriteBuffer_decode(var2); // L: 200
			return true; // L: 201
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2140539566"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 205
		var1.offset = var0.length - 2; // L: 206
		class336.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 207
		class105.SpriteBuffer_xOffsets = new int[class336.SpriteBuffer_spriteCount]; // L: 208
		class336.SpriteBuffer_yOffsets = new int[class336.SpriteBuffer_spriteCount]; // L: 209
		class336.SpriteBuffer_spriteWidths = new int[class336.SpriteBuffer_spriteCount]; // L: 210
		class225.SpriteBuffer_spriteHeights = new int[class336.SpriteBuffer_spriteCount]; // L: 211
		class2.SpriteBuffer_pixels = new byte[class336.SpriteBuffer_spriteCount][]; // L: 212
		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8; // L: 213
		class336.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 214
		class336.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 215
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 216

		int var3;
		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 217
			class105.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 218
			class336.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 219
			class336.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 220
			class225.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class336.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 221
		HorizontalAlignment.SpriteBuffer_spritePalette = new int[var2]; // L: 222

		for (var3 = 1; var3 < var2; ++var3) { // L: 223
			HorizontalAlignment.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 224
			if (HorizontalAlignment.SpriteBuffer_spritePalette[var3] == 0) { // L: 225
				HorizontalAlignment.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 227

		for (var3 = 0; var3 < class336.SpriteBuffer_spriteCount; ++var3) { // L: 228
			int var4 = class336.SpriteBuffer_spriteWidths[var3]; // L: 229
			int var5 = class225.SpriteBuffer_spriteHeights[var3]; // L: 230
			int var6 = var4 * var5; // L: 231
			byte[] var7 = new byte[var6]; // L: 232
			class2.SpriteBuffer_pixels[var3] = var7; // L: 233
			int var8 = var1.readUnsignedByte(); // L: 234
			int var9;
			if (var8 == 0) { // L: 235
				for (var9 = 0; var9 < var6; ++var9) { // L: 236
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 238
				for (var9 = 0; var9 < var4; ++var9) { // L: 239
					for (int var10 = 0; var10 < var5; ++var10) { // L: 240
						var7[var9 + var4 * var10] = var1.readByte(); // L: 241
					}
				}
			}
		}

	} // L: 246

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1502126569"
	)
	static final void method199(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 9859
		int var7 = var3 - var1; // L: 9860
		int var8 = var6 >= 0 ? var6 : -var6; // L: 9861
		int var9 = var7 >= 0 ? var7 : -var7; // L: 9862
		int var10 = var8; // L: 9863
		if (var8 < var9) { // L: 9864
			var10 = var9;
		}

		if (var10 != 0) { // L: 9865
			int var11 = (var6 << 16) / var10; // L: 9866
			int var12 = (var7 << 16) / var10; // L: 9867
			if (var12 <= var11) { // L: 9868
				var11 = -var11;
			} else {
				var12 = -var12; // L: 9869
			}

			int var13 = var5 * var12 >> 17; // L: 9870
			int var14 = var5 * var12 + 1 >> 17; // L: 9871
			int var15 = var5 * var11 >> 17; // L: 9872
			int var16 = var5 * var11 + 1 >> 17; // L: 9873
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 9874
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 9875
			int var17 = var0 + var13; // L: 9876
			int var18 = var0 - var14; // L: 9877
			int var19 = var0 + var6 - var14; // L: 9878
			int var20 = var0 + var13 + var6; // L: 9879
			int var21 = var15 + var1; // L: 9880
			int var22 = var1 - var16; // L: 9881
			int var23 = var7 + var1 - var16; // L: 9882
			int var24 = var7 + var15 + var1; // L: 9883
			Rasterizer3D.method3237(var17, var18, var19); // L: 9884
			Rasterizer3D.method3179(var21, var22, var23, var17, var18, var19, var4); // L: 9885
			Rasterizer3D.method3237(var17, var19, var20); // L: 9886
			Rasterizer3D.method3179(var21, var23, var24, var17, var19, var20, var4); // L: 9887
		}
	} // L: 9888

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "408357083"
	)
	static String method209(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 11515
		if (Client.gameBuild == 1) { // L: 11516
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 11517
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 11518
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 11519
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 11520
			var0 = "local";
		}

		String var3 = ""; // L: 11521
		if (AccessFile.field4100 != null) { // L: 11522
			var3 = "/p=" + AccessFile.field4100;
		}

		String var4 = "runescape.com"; // L: 11523
		return var2 + var0 + "." + var4 + "/l=" + NPCComposition.clientLanguage + "/a=" + ItemLayer.field1562 + var3 + "/"; // L: 11524
	}
}
