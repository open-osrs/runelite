import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	protected AbstractSocket() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4535"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "61"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1430321597"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "823949627"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "593938417"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-4"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lkk;Lkk;IIB)Llu;",
		garbageValue = "0"
	)
	public static Font method6107(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		byte[] var5 = var0.takeFile(var2, var3);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			class28.SpriteBuffer_decode(var5);
			var4 = true;
		}

		return !var4 ? null : WorldMapArchiveLoader.method6348(var1.takeFile(var2, var3));
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Loc;",
		garbageValue = "-1227979841"
	)
	static SpritePixels method6108() {
		SpritePixels var0 = new SpritePixels();
		var0.width = class413.SpriteBuffer_spriteWidth;
		var0.height = class413.SpriteBuffer_spriteHeight;
		var0.xOffset = class413.SpriteBuffer_xOffsets[0];
		var0.yOffset = class413.SpriteBuffer_yOffsets[0];
		var0.subWidth = InvDefinition.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class413.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = class283.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = ItemContainer.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class413.SpriteBuffer_xOffsets = null;
		class413.SpriteBuffer_yOffsets = null;
		InvDefinition.SpriteBuffer_spriteWidths = null;
		class413.SpriteBuffer_spriteHeights = null;
		ItemContainer.SpriteBuffer_spritePalette = null;
		class283.SpriteBuffer_pixels = null;
		return var0;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Ljd;Lfy;IIZI)V",
		garbageValue = "1327737191"
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
			GrandExchangeEvents.insertMenuItem(var7, class54.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
