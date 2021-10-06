import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public abstract class class132 extends Node {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1055383279
	)
	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;

	class132() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "35"
	)
	abstract void vmethod2760(Buffer var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)V",
		garbageValue = "1634989707"
	)
	abstract void vmethod2759(ClanChannel var1);

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmk;ZI)V",
		garbageValue = "1491727456"
	)
	public static void method2698(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) {
			try {
				NetCache.NetCache_socket.close();
			} catch (Exception var8) {
			}

			NetCache.NetCache_socket = null;
		}

		NetCache.NetCache_socket = var0;
		Buffer var2;
		if (NetCache.NetCache_socket != null) {
			try {
				var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				NetCache.NetCache_socket.write(var2.array, 0, 4);
			} catch (IOException var7) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var6) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}
		}

		NetCache.NetCache_responseHeaderBuffer.offset = 0;
		ClanChannel.NetCache_currentResponse = null;
		StudioGame.NetCache_responseArchiveBuffer = null;
		NetCache.field3726 = 0;

		while (true) {
			NetFileRequest var9 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
			if (var9 == null) {
				while (true) {
					var9 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
					if (var9 == null) {
						if (NetCache.field3724 != 0) {
							try {
								var2 = new Buffer(4);
								var2.writeByte(4);
								var2.writeByte(NetCache.field3724);
								var2.writeShort(0);
								NetCache.NetCache_socket.write(var2.array, 0, 4);
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var4) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_loadTime = 0;
						NetCache.field3715 = UserComparator4.method2406();
						return;
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var9);
					NetCache.NetCache_pendingWrites.put(var9, var9.key);
					++NetCache.NetCache_pendingWritesCount;
					--NetCache.NetCache_pendingResponsesCount;
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var9, var9.key);
			++NetCache.NetCache_pendingPriorityWritesCount;
			--NetCache.NetCache_pendingPriorityResponsesCount;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method2699() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) {
			int var2 = Client.menuOpcodes[var0];
			boolean var1 = var2 == 57 || var2 == 58 || var2 == 1007 || var2 == 25 || var2 == 30;
			if (var1) {
				if (var0 < Client.menuOptionsCount - 1) {
					for (int var3 = var0; var3 < Client.menuOptionsCount - 1; ++var3) {
						Client.menuActions[var3] = Client.menuActions[var3 + 1];
						Client.menuTargets[var3] = Client.menuTargets[var3 + 1];
						Client.menuOpcodes[var3] = Client.menuOpcodes[var3 + 1];
						Client.menuIdentifiers[var3] = Client.menuIdentifiers[var3 + 1];
						Client.menuArguments1[var3] = Client.menuArguments1[var3 + 1];
						Client.menuArguments2[var3] = Client.menuArguments2[var3 + 1];
						Client.menuShiftClick[var3] = Client.menuShiftClick[var3 + 1];
					}
				}

				--var0;
				--Client.menuOptionsCount;
			}
		}

		Widget.method4997(UserComparator7.menuWidth / 2 + LoginScreenAnimation.menuX, class392.menuY);
	}
}
