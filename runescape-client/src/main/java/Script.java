import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("w")
	String field928;
	@ObfuscatedName("s")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("a")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("o")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1670350009
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -239833439
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1823289949
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1448244841
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lnf;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lnf;",
		garbageValue = "17"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 170
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1899123891"
	)
	static int method1988(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public static void method1989() {
		if (NetCache.NetCache_socket != null) { // L: 156
			NetCache.NetCache_socket.close();
		}

	} // L: 157

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lko;Ljava/lang/String;Ljava/lang/String;I)Loe;",
		garbageValue = "846421699"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 64
		int var4 = var0.getFileId(var3, var2); // L: 65
		byte[] var7 = var0.takeFile(var3, var4); // L: 70
		boolean var6;
		if (var7 == null) { // L: 71
			var6 = false; // L: 72
		} else {
			SpriteBuffer_decode(var7); // L: 75
			var6 = true; // L: 76
		}

		IndexedSprite var5;
		if (!var6) { // L: 78
			var5 = null; // L: 79
		} else {
			IndexedSprite var8 = new IndexedSprite(); // L: 84
			var8.width = class414.SpriteBuffer_spriteWidth; // L: 85
			var8.height = class414.SpriteBuffer_spriteHeight; // L: 86
			var8.xOffset = class414.SpriteBuffer_xOffsets[0]; // L: 87
			var8.yOffset = class414.SpriteBuffer_yOffsets[0]; // L: 88
			var8.subWidth = UrlRequester.SpriteBuffer_spriteWidths[0]; // L: 89
			var8.subHeight = class414.SpriteBuffer_spriteHeights[0]; // L: 90
			var8.palette = HitSplatDefinition.SpriteBuffer_spritePalette; // L: 91
			var8.pixels = class295.SpriteBuffer_pixels[0]; // L: 92
			PacketBuffer.method6913(); // L: 93
			var5 = var8; // L: 96
		}

		return var5; // L: 98
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1694864666"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 215
		var1.offset = var0.length - 2; // L: 216
		class414.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 217
		class414.SpriteBuffer_xOffsets = new int[class414.SpriteBuffer_spriteCount]; // L: 218
		class414.SpriteBuffer_yOffsets = new int[class414.SpriteBuffer_spriteCount]; // L: 219
		UrlRequester.SpriteBuffer_spriteWidths = new int[class414.SpriteBuffer_spriteCount]; // L: 220
		class414.SpriteBuffer_spriteHeights = new int[class414.SpriteBuffer_spriteCount]; // L: 221
		class295.SpriteBuffer_pixels = new byte[class414.SpriteBuffer_spriteCount][]; // L: 222
		var1.offset = var0.length - 7 - class414.SpriteBuffer_spriteCount * 8; // L: 223
		class414.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 224
		class414.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 225
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 226

		int var3;
		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) { // L: 227
			class414.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) { // L: 228
			class414.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) { // L: 229
			UrlRequester.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) { // L: 230
			class414.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class414.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 231
		HitSplatDefinition.SpriteBuffer_spritePalette = new int[var2]; // L: 232

		for (var3 = 1; var3 < var2; ++var3) { // L: 233
			HitSplatDefinition.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 234
			if (HitSplatDefinition.SpriteBuffer_spritePalette[var3] == 0) { // L: 235
				HitSplatDefinition.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 237

		for (var3 = 0; var3 < class414.SpriteBuffer_spriteCount; ++var3) { // L: 238
			int var4 = UrlRequester.SpriteBuffer_spriteWidths[var3]; // L: 239
			int var5 = class414.SpriteBuffer_spriteHeights[var3]; // L: 240
			int var6 = var4 * var5; // L: 241
			byte[] var7 = new byte[var6]; // L: 242
			class295.SpriteBuffer_pixels[var3] = var7; // L: 243
			int var8 = var1.readUnsignedByte(); // L: 244
			int var9;
			if (var8 == 0) { // L: 245
				for (var9 = 0; var9 < var6; ++var9) { // L: 246
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 248
				for (var9 = 0; var9 < var4; ++var9) { // L: 249
					for (int var10 = 0; var10 < var5; ++var10) { // L: 250
						var7[var9 + var10 * var4] = var1.readByte(); // L: 251
					}
				}
			}
		}

	} // L: 256
}
