import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class93 {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1393536385
	)
	static int field1253;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	static IndexedSprite field1254;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = 1900010659
	)
	static int field1252;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 479487429
	)
	int field1251;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1483191049
	)
	int field1248;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1476000165
	)
	int field1247;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -602846795
	)
	int field1250;

	class93(int var1, int var2, int var3, int var4) {
		this.field1251 = var1;
		this.field1248 = var2;
		this.field1247 = var3; // L: 12
		this.field1250 = var4; // L: 13
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "70"
	)
	int method2370() {
		return this.field1251; // L: 17
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "194991061"
	)
	int method2380() {
		return this.field1248; // L: 21
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1753372833"
	)
	int method2372() {
		return this.field1247; // L: 25
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1314673051"
	)
	int method2373() {
		return this.field1250;
	}

	@ObfuscatedName("v")
	public static final void method2384(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;Ljava/lang/String;Ljava/lang/String;I)[Lqq;",
		garbageValue = "18034657"
	)
	public static IndexedSprite[] method2386(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 84
		int var4 = var0.getFileId(var3, var2); // L: 85
		byte[] var7 = var0.takeFile(var3, var4); // L: 90
		boolean var6;
		if (var7 == null) { // L: 91
			var6 = false; // L: 92
		} else {
			WorldMapArea.SpriteBuffer_decode(var7); // L: 95
			var6 = true; // L: 96
		}

		IndexedSprite[] var5;
		if (!var6) { // L: 98
			var5 = null; // L: 99
		} else {
			IndexedSprite[] var8 = new IndexedSprite[class451.SpriteBuffer_spriteCount]; // L: 104

			for (int var9 = 0; var9 < class451.SpriteBuffer_spriteCount; ++var9) { // L: 105
				IndexedSprite var10 = var8[var9] = new IndexedSprite(); // L: 106
				var10.width = class451.SpriteBuffer_spriteWidth; // L: 107
				var10.height = class451.SpriteBuffer_spriteHeight; // L: 108
				var10.xOffset = class451.SpriteBuffer_xOffsets[var9]; // L: 109
				var10.yOffset = class271.SpriteBuffer_yOffsets[var9]; // L: 110
				var10.subWidth = class451.SpriteBuffer_spriteWidths[var9]; // L: 111
				var10.subHeight = class451.SpriteBuffer_spriteHeights[var9]; // L: 112
				var10.palette = NetFileRequest.SpriteBuffer_spritePalette; // L: 113
				var10.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var9]; // L: 114
			}

			ArchiveDiskActionHandler.method5813(); // L: 116
			var5 = var8; // L: 119
		}

		return var5; // L: 121
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lcb;II)V",
		garbageValue = "-314734464"
	)
	static final void method2376(Actor var0, int var1) {
		VarbitComposition.worldToScreen(var0.x, var0.y, var1); // L: 5398
	} // L: 5399
}
