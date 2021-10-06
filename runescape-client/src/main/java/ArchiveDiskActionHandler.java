import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -490833597
	)
	public static int field3671;
	@ObfuscatedName("j")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3671 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3671 <= 1) {
							field3671 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						field3671 = 600;
					}
				} else {
					class121.method2542(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3671 <= 1) {
							field3671 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}

						--field3671;
					}
				}
			}
		} catch (Exception var13) {
			Timer.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Loy;B)V",
		garbageValue = "-104"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = class67.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - WorldMapSectionType.baseX;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - PlayerComposition.baseY;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		VertexNormal.Client_plane = var2.plane = var4;
		if (Players.field1248[var1] != null) {
			var2.read(Players.field1248[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1247[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1247[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-551096239"
	)
	static int method5168(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		return ClanChannel.NetCache_currentResponse != null && ClanChannel.NetCache_currentResponse.key == var2 ? StudioGame.NetCache_responseArchiveBuffer.offset * 99 / (StudioGame.NetCache_responseArchiveBuffer.array.length - ClanChannel.NetCache_currentResponse.padding) + 1 : 0;
	}
}
