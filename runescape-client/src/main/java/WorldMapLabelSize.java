import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 339414095
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2074270997
	)
	final int field149;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 603088885
	)
	final int field153;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 518486027
	)
	final int field154;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field149 = var1; // L: 19
		this.field153 = var2; // L: 20
		this.field154 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "-67"
	)
	boolean method255(float var1) {
		return var1 >= (float)this.field154; // L: 25
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lay;",
		garbageValue = "-2106429153"
	)
	static WorldMapLabelSize[] method269() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small}; // L: 15
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lig;III)[Llm;",
		garbageValue = "-173751595"
	)
	public static SpritePixels[] method268(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 64
		boolean var3;
		if (var4 == null) { // L: 65
			var3 = false; // L: 66
		} else {
			GrandExchangeOfferNameComparator.SpriteBuffer_decode(var4); // L: 69
			var3 = true; // L: 70
		}

		return !var3 ? null : BufferedSource.method6103(); // L: 72 73
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Lay;",
		garbageValue = "31"
	)
	static WorldMapLabelSize method266(int var0) {
		WorldMapLabelSize[] var1 = method269(); // L: 30

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 31
			WorldMapLabelSize var3 = var1[var2]; // L: 32
			if (var0 == var3.field153) { // L: 34
				return var3; // L: 35
			}
		}

		return null; // L: 40
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1679154092"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (class22.method226(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = World.World_worlds[var9]; // L: 185
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 186
					World.World_worlds[var7++] = var10; // L: 187
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 191
			World.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1534549931"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 119
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "1283328511"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		ObjectSound.scrollBarSprites[0].drawAt(var0, var1); // L: 10038
		ObjectSound.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10039
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field727); // L: 10040
		int var5 = var3 * (var3 - 32) / var4; // L: 10041
		if (var5 < 8) { // L: 10042
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10043
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field777); // L: 10044
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field730); // L: 10045
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field730); // L: 10046
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field730); // L: 10047
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field730); // L: 10048
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field729); // L: 10049
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field729); // L: 10050
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field729); // L: 10051
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field729); // L: 10052
	} // L: 10053

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Lhz;I)Z",
		garbageValue = "-490308531"
	)
	static final boolean method254(Widget var0) {
		int var1 = var0.contentType; // L: 11275
		if (var1 == 205) { // L: 11276
			Client.logoutTimer = 250; // L: 11277
			return true; // L: 11278
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11280
				var2 = (var1 - 300) / 2; // L: 11281
				var3 = var1 & 1; // L: 11282
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11283
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11285
				var2 = (var1 - 314) / 2; // L: 11286
				var3 = var1 & 1; // L: 11287
				Client.playerAppearance.method4206(var2, var3 == 1); // L: 11288
			}

			if (var1 == 324) { // L: 11290
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) { // L: 11291
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11292
				PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher); // L: 11294
				Client.playerAppearance.write(var4.packetBuffer); // L: 11295
				Client.packetWriter.addNode(var4); // L: 11296
				return true; // L: 11297
			} else {
				return false; // L: 11299
			}
		}
	}
}
