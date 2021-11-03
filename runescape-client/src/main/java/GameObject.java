import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 704202637
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -494879285
	)
	@Export("height")
	int height;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 211210251
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1046564479
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1520193173
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -478459065
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -849496909
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 427250493
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1968764473
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1764486953
	)
	int field2641;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1523827707
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -6523351122347780293L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -269494523
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lmp;ZB)V",
		garbageValue = "38"
	)
	public static void method4647(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 42
			try {
				NetCache.NetCache_socket.close(); // L: 44
			} catch (Exception var8) { // L: 46
			}

			NetCache.NetCache_socket = null; // L: 47
		}

		NetCache.NetCache_socket = var0; // L: 49
		Buffer var2;
		if (NetCache.NetCache_socket != null) { // L: 51
			try {
				var2 = new Buffer(4); // L: 53
				var2.writeByte(var1 ? 2 : 3); // L: 54
				var2.writeMedium(0); // L: 55
				NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 56
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close(); // L: 60
				} catch (Exception var6) { // L: 62
				}

				++NetCache.NetCache_ioExceptions; // L: 63
				NetCache.NetCache_socket = null; // L: 64
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 67
		class131.NetCache_currentResponse = null; // L: 68
		class138.NetCache_responseArchiveBuffer = null; // L: 69
		NetCache.field3707 = 0; // L: 70

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 72
			if (var9 == null) { // L: 73
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 79
					if (var9 == null) { // L: 80
						if (NetCache.field3719 != 0) { // L: 86
							try {
								var2 = new Buffer(4); // L: 88
								var2.writeByte(4); // L: 89
								var2.writeByte(NetCache.field3719); // L: 90
								var2.writeShort(0); // L: 91
								NetCache.NetCache_socket.write(var2.array, 0, 4); // L: 92
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close(); // L: 96
								} catch (Exception var4) { // L: 98
								}

								++NetCache.NetCache_ioExceptions; // L: 99
								NetCache.NetCache_socket = null; // L: 100
							}
						}

						NetCache.NetCache_loadTime = 0; // L: 103
						class423.field4436 = class111.method2516(); // L: 104
						return; // L: 105
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9); // L: 81
					NetCache.NetCache_pendingWrites.put(var9, var9.key); // L: 82
					++NetCache.NetCache_pendingWritesCount; // L: 83
					--NetCache.NetCache_pendingResponsesCount; // L: 84
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key); // L: 74
			++NetCache.NetCache_pendingPriorityWritesCount; // L: 75
			--NetCache.NetCache_pendingPriorityResponsesCount; // L: 76
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIB)V",
		garbageValue = "-109"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11713
		if (var4 != null) { // L: 11714
			if (Client.minimapState < 3) { // L: 11715
				class114.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11716
			}

		}
	} // L: 11717
}
