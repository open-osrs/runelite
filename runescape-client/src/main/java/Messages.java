import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("l")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1654217227
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("o")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("ba")
	static String field1273;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1980575358"
	)
	public static boolean method2350(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field129[var0] : false;
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1326528361"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		WorldMapDecoration.scrollBarSprites[0].drawAt(var0, var1);
		WorldMapDecoration.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field553);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field514);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field697);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field697);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field697);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field697);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field555);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field555);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field555);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field555);
	}
}
