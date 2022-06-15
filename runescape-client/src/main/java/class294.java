import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ke")
public class class294 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1442442974"
	)
	static boolean method5736(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 58
			try {
				if (!class29.field169.startsWith("win")) { // L: 60
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 61
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 62

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 63
						if (var13.indexOf(var0.charAt(var4)) == -1) { // L: 64
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 66
					return true; // L: 67
				}
			} catch (Throwable var8) { // L: 69
				return false; // L: 70
			}
		} else if (var1 == 1) { // L: 73
			try {
				Applet var7 = class29.field172; // L: 76
				Object[] var5 = new Object[]{(new URL(class29.field172.getCodeBase(), var0)).toString()}; // L: 77
				Object var3 = JSObject.getWindow(var7).call(var2, var5); // L: 80
				return var3 != null; // L: 83
			} catch (Throwable var9) { // L: 85
				return false; // L: 86
			}
		} else if (var1 == 2) { // L: 89
			try {
				class29.field172.getAppletContext().showDocument(new URL(class29.field172.getCodeBase(), var0), "_blank"); // L: 91
				return true; // L: 92
			} catch (Exception var10) { // L: 94
				return false; // L: 95
			}
		} else if (var1 == 3) { // L: 98
			try {
				class27.method346(class29.field172, "loggedout"); // L: 100
			} catch (Throwable var12) { // L: 102
			}

			try {
				class29.field172.getAppletContext().showDocument(new URL(class29.field172.getCodeBase(), var0), "_top"); // L: 104
				return true; // L: 105
			} catch (Exception var11) { // L: 107
				return false; // L: 108
			}
		} else {
			throw new IllegalArgumentException(); // L: 111
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(ZLpq;I)V",
		garbageValue = "409985565"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5536
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5537
			var2 = var1.readUnsignedShort(); // L: 5538
			int var3 = var1.readUnsignedShort(); // L: 5539
			var4 = var1.readUnsignedShort(); // L: 5540
			WorldMapRegion.xteaKeys = new int[var4][4]; // L: 5541

			for (var5 = 0; var5 < var4; ++var5) { // L: 5542
				for (var6 = 0; var6 < 4; ++var6) { // L: 5543
					WorldMapRegion.xteaKeys[var5][var6] = var1.readInt(); // L: 5544
				}
			}

			Client.regions = new int[var4]; // L: 5547
			PcmPlayer.regionMapArchiveIds = new int[var4]; // L: 5548
			ObjectSound.regionLandArchiveIds = new int[var4]; // L: 5549
			Actor.regionLandArchives = new byte[var4][]; // L: 5550
			class145.regionMapArchives = new byte[var4][]; // L: 5551
			var4 = 0; // L: 5552

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5553
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5554
					var7 = var6 + (var5 << 8); // L: 5555
					Client.regions[var4] = var7; // L: 5556
					PcmPlayer.regionMapArchiveIds[var4] = WorldMapSectionType.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5557
					ObjectSound.regionLandArchiveIds[var4] = WorldMapSectionType.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5558
					++var4; // L: 5559
				}
			}

			WorldMap.method7377(var3, var2, true); // L: 5562
		} else {
			var2 = var1.readUnsignedShort(); // L: 5565
			boolean var15 = var1.readUnsignedByte() == 1; // L: 5566
			var4 = var1.readUnsignedShort(); // L: 5567
			var5 = var1.readUnsignedShort(); // L: 5568
			var1.importIndex(); // L: 5569

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5570
				for (var7 = 0; var7 < 13; ++var7) { // L: 5571
					for (var8 = 0; var8 < 13; ++var8) { // L: 5572
						var9 = var1.readBits(1); // L: 5573
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5574
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5575
						}
					}
				}
			}

			var1.exportIndex(); // L: 5579
			WorldMapRegion.xteaKeys = new int[var5][4]; // L: 5580

			for (var6 = 0; var6 < var5; ++var6) { // L: 5581
				for (var7 = 0; var7 < 4; ++var7) { // L: 5582
					WorldMapRegion.xteaKeys[var6][var7] = var1.readInt(); // L: 5583
				}
			}

			Client.regions = new int[var5]; // L: 5586
			PcmPlayer.regionMapArchiveIds = new int[var5]; // L: 5587
			ObjectSound.regionLandArchiveIds = new int[var5]; // L: 5588
			Actor.regionLandArchives = new byte[var5][]; // L: 5589
			class145.regionMapArchives = new byte[var5][]; // L: 5590
			var5 = 0; // L: 5591

			for (var6 = 0; var6 < 4; ++var6) { // L: 5592
				for (var7 = 0; var7 < 13; ++var7) { // L: 5593
					for (var8 = 0; var8 < 13; ++var8) { // L: 5594
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5595
						if (var9 != -1) { // L: 5596
							int var10 = var9 >> 14 & 1023; // L: 5597
							int var11 = var9 >> 3 & 2047; // L: 5598
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5599

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5600
								if (Client.regions[var13] == var12) {
									var12 = -1; // L: 5601
									break; // L: 5602
								}
							}

							if (var12 != -1) { // L: 5604
								Client.regions[var5] = var12; // L: 5605
								var13 = var12 >> 8 & 255; // L: 5606
								int var14 = var12 & 255; // L: 5607
								PcmPlayer.regionMapArchiveIds[var5] = WorldMapSectionType.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5608
								ObjectSound.regionLandArchiveIds[var5] = WorldMapSectionType.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5609
								++var5; // L: 5610
							}
						}
					}
				}
			}

			WorldMap.method7377(var4, var2, !var15); // L: 5616
		}

	} // L: 5618
}
