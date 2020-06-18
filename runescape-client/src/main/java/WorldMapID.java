import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	static final WorldMapID field301;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lan;"
	)
	static final WorldMapID field299;
	@ObfuscatedName("am")
	static String field300;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2051394385
	)
	@Export("value")
	final int value;

	static {
		field301 = new WorldMapID(0);
		field299 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-452075122"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-211582550"
	)
	public static int method617(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		signature = "(IIIIZI)V",
		garbageValue = "-1973135066"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field727;
		} else if (var5 >= 100) {
			var6 = Client.field924;
		} else {
			var6 = (Client.field924 - Client.field727) * var5 / 100 + Client.field727;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field685) {
			var10 = Client.field685;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field928) {
				var6 = Client.field928;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field861) {
			var10 = Client.field861;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field927) {
				var6 = Client.field927;
				var8 = var10 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			class23.method230(var2, var3);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
