import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1651182107
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2104957101
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("v")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("j")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1977979545"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Ljava/lang/String;I)I",
		garbageValue = "672319355"
	)
	public static int method4690(Buffer var0, String var1) {
		int var2 = var0.offset;
		byte[] var3 = class104.method2265(var1);
		var0.writeSmartByteShort(var3.length);
		var0.offset += class251.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
		return var0.offset - var2;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1881481613"
	)
	static int method4691(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
