import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("PacketBuffer")
public class PacketBuffer extends Buffer {
	@ObfuscatedName("c")
	static final int[] field4266;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	@Export("isaacCipher")
	IsaacCipher isaacCipher;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1741398245
	)
	@Export("bitIndex")
	int bitIndex;

	static {
		field4266 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
	}

	public PacketBuffer(int var1) {
		super(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([IS)V",
		garbageValue = "10361"
	)
	@Export("newIsaacCipher")
	public void newIsaacCipher(int[] var1) {
		this.isaacCipher = new IsaacCipher(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Loe;I)V",
		garbageValue = "1295476424"
	)
	@Export("setIsaacCipher")
	public void setIsaacCipher(IsaacCipher var1) {
		this.isaacCipher = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-489006382"
	)
	@Export("writeByteIsaac")
	public void writeByteIsaac(int var1) {
		super.array[++super.offset - 1] = (byte)(var1 + this.isaacCipher.nextInt());
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1990458391"
	)
	@Export("readByteIsaac")
	public int readByteIsaac() {
		return super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "940310064"
	)
	public boolean method6763() {
		int var1 = super.array[super.offset] - this.isaacCipher.method7376() & 255;
		return var1 >= 128;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "28"
	)
	@Export("readSmartByteShortIsaac")
	public int readSmartByteShortIsaac() {
		int var1 = super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255;
		return var1 < 128 ? var1 : (var1 - 128 << 8) + (super.array[++super.offset - 1] - this.isaacCipher.nextInt() & 255);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "99"
	)
	public void method6767(byte[] var1, int var2, int var3) {
		for (int var4 = 0; var4 < var3; ++var4) {
			var1[var4 + var2] = (byte)(super.array[++super.offset - 1] - this.isaacCipher.nextInt());
		}

	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1253402397"
	)
	@Export("importIndex")
	public void importIndex() {
		this.bitIndex = super.offset * 8;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-911407487"
	)
	@Export("readBits")
	public int readBits(int var1) {
		int var2 = this.bitIndex >> 3;
		int var3 = 8 - (this.bitIndex & 7);
		int var4 = 0;

		for (this.bitIndex += var1; var1 > var3; var3 = 8) {
			var4 += (super.array[var2++] & field4266[var3]) << var1 - var3;
			var1 -= var3;
		}

		if (var3 == var1) {
			var4 += super.array[var2] & field4266[var3];
		} else {
			var4 += super.array[var2] >> var3 - var1 & field4266[var1];
		}

		return var4;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-749875980"
	)
	@Export("exportIndex")
	public void exportIndex() {
		super.offset = (this.bitIndex + 7) / 8;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1116579683"
	)
	@Export("bitsRemaining")
	public int bitsRemaining(int var1) {
		return var1 * 8 - this.bitIndex;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Ljava/lang/String;Ljava/lang/String;B)[Loi;",
		garbageValue = "16"
	)
	public static IndexedSprite[] method6764(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		IndexedSprite[] var5;
		if (!VertexNormal.method4477(var0, var3, var4)) {
			var5 = null;
		} else {
			IndexedSprite[] var7 = new IndexedSprite[class413.SpriteBuffer_spriteCount];

			for (int var8 = 0; var8 < class413.SpriteBuffer_spriteCount; ++var8) {
				IndexedSprite var9 = var7[var8] = new IndexedSprite();
				var9.width = class413.SpriteBuffer_spriteWidth;
				var9.height = class413.SpriteBuffer_spriteHeight;
				var9.xOffset = class413.SpriteBuffer_xOffsets[var8];
				var9.yOffset = class413.SpriteBuffer_yOffsets[var8];
				var9.subWidth = InvDefinition.SpriteBuffer_spriteWidths[var8];
				var9.subHeight = class413.SpriteBuffer_spriteHeights[var8];
				var9.palette = ItemContainer.SpriteBuffer_spritePalette;
				var9.pixels = class283.SpriteBuffer_pixels[var8];
			}

			class413.SpriteBuffer_xOffsets = null;
			class413.SpriteBuffer_yOffsets = null;
			InvDefinition.SpriteBuffer_spriteWidths = null;
			class413.SpriteBuffer_spriteHeights = null;
			ItemContainer.SpriteBuffer_spritePalette = null;
			class283.SpriteBuffer_pixels = null;
			var5 = var7;
		}

		return var5;
	}
}
