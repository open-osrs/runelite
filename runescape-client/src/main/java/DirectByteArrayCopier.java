import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("r")
	static byte[][][] field3128;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1885485519
	)
	static int field3126;
	@ObfuscatedName("v")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "74"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "43"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIIBZB)V",
		garbageValue = "-95"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 72
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 73
		if (var8 == null) { // L: 74
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 75
			if (var8 == null) { // L: 76
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 77
				if (var8 != null) { // L: 78
					if (var5) { // L: 79
						var8.removeDual(); // L: 80
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 81
						--NetCache.NetCache_pendingWritesCount; // L: 82
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 83
					}

				} else {
					if (!var5) { // L: 87
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 88
						if (var8 != null) { // L: 89
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 91
					var8.archive = var0; // L: 92
					var8.crc = var3; // L: 93
					var8.padding = var4; // L: 94
					if (var5) { // L: 95
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 96
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 97
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 100
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 101
						++NetCache.NetCache_pendingWritesCount; // L: 102
					}

				}
			}
		}
	} // L: 85 104

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-1640664715"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (Tiles.World_worlds != null) { // L: 171
			DesktopPlatformInfoProvider.doWorldSorting(0, Tiles.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1591335539"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4019
			byte var2 = 4; // L: 4020
			int var3 = var2 + 6; // L: 4021
			int var4 = var2 + 6; // L: 4022
			int var5 = UserComparator3.fontPlain12.lineWidth(var0, 250); // L: 4023
			int var6 = UserComparator3.fontPlain12.lineCount(var0, 250) * 13; // L: 4024
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0); // L: 4025
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var6 + var2 + var2, 16777215); // L: 4026
			UserComparator3.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4027
			int var7 = var3 - var2; // L: 4028
			int var8 = var4 - var2; // L: 4029
			int var9 = var2 + var2 + var5; // L: 4030
			int var10 = var2 + var2 + var6; // L: 4031

			for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 4033
				if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) { // L: 4034
					Client.field719[var11] = true;
				}
			}

			if (var1) { // L: 4037
				class26.rasterProvider.drawFull(0, 0); // L: 4038
			} else {
				PcmPlayer.method786(var3, var4, var5, var6); // L: 4041
			}

		}
	} // L: 4043
}
