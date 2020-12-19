import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("v")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("x")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0};
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgb;Lmd;B)Lgv;",
		garbageValue = "1"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) { // L: 24
			var2 = new PacketBufferNode(); // L: 25
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 28
		}

		var2.clientPacket = var0; // L: 31
		var2.clientPacketLength = var0.length; // L: 32
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260); // L: 33
		} else if (var2.clientPacketLength == -2) { // L: 34
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20); // L: 35
		} else if (var2.clientPacketLength <= 98) { // L: 36
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 37
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 38
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 39
		var2.index = 0; // L: 40
		return var2; // L: 41
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)Lm;",
		garbageValue = "1684033530"
	)
	public static class12 method1250(class7 var0) {
		switch(var0.field26) { // L: 9
		case 0:
			return new class5(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I[B[BI)V",
		garbageValue = "-21779272"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2649 == null) { // L: 904
			if (var2 == null) { // L: 905
				return; // L: 911
			}

			var0.field2649 = new byte[11][]; // L: 906
			var0.field2637 = new byte[11][]; // L: 907
			var0.field2679 = new int[11]; // L: 908
			var0.field2664 = new int[11]; // L: 909
		}

		var0.field2649[var1] = var2; // L: 913
		if (var2 != null) {
			var0.field2590 = true; // L: 914
		} else {
			var0.field2590 = false; // L: 916

			for (int var4 = 0; var4 < var0.field2649.length; ++var4) { // L: 917
				if (var0.field2649[var4] != null) { // L: 918
					var0.field2590 = true; // L: 919
					break;
				}
			}
		}

		var0.field2637[var1] = var3; // L: 924
	} // L: 925

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLky;I)V",
		garbageValue = "191589163"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5295
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) { // L: 5296
			var2 = var1.readUnsignedShort(); // L: 5297
			int var3 = var1.method5539(); // L: 5298
			var4 = var1.readUnsignedShort(); // L: 5299
			class227.xteaKeys = new int[var4][4]; // L: 5300

			for (var5 = 0; var5 < var4; ++var5) { // L: 5301
				for (var6 = 0; var6 < 4; ++var6) { // L: 5302
					class227.xteaKeys[var5][var6] = var1.readInt(); // L: 5303
				}
			}

			FileSystem.regions = new int[var4]; // L: 5306
			class41.regionMapArchiveIds = new int[var4]; // L: 5307
			GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds = new int[var4]; // L: 5308
			WorldMapIcon_0.regionLandArchives = new byte[var4][]; // L: 5309
			MouseRecorder.regionMapArchives = new byte[var4][]; // L: 5310
			boolean var16 = false; // L: 5311
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) { // L: 5312
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) { // L: 5313
				var16 = true;
			}

			var4 = 0; // L: 5314

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5315
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) { // L: 5316
					var8 = var7 + (var6 << 8); // L: 5317
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) { // L: 5318
						FileSystem.regions[var4] = var8; // L: 5319
						class41.regionMapArchiveIds[var4] = GameShell.archive5.getGroupId("m" + var6 + "_" + var7); // L: 5320
						GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var4] = GameShell.archive5.getGroupId("l" + var6 + "_" + var7); // L: 5321
						++var4; // L: 5322
					}
				}
			}

			VarcInt.method4428(var2, var3, true); // L: 5325
		} else {
			var2 = var1.readUnsignedShort(); // L: 5328
			boolean var15 = var1.method5573() == 1; // L: 5329
			var4 = var1.method5580(); // L: 5330
			var5 = var1.readUnsignedShort(); // L: 5331
			var1.importIndex(); // L: 5332

			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5333
				for (var7 = 0; var7 < 13; ++var7) { // L: 5334
					for (var8 = 0; var8 < 13; ++var8) { // L: 5335
						var9 = var1.readBits(1); // L: 5336
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5337
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5338
						}
					}
				}
			}

			var1.exportIndex(); // L: 5342
			class227.xteaKeys = new int[var5][4]; // L: 5343

			for (var6 = 0; var6 < var5; ++var6) { // L: 5344
				for (var7 = 0; var7 < 4; ++var7) { // L: 5345
					class227.xteaKeys[var6][var7] = var1.readInt(); // L: 5346
				}
			}

			FileSystem.regions = new int[var5]; // L: 5349
			class41.regionMapArchiveIds = new int[var5]; // L: 5350
			GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds = new int[var5]; // L: 5351
			WorldMapIcon_0.regionLandArchives = new byte[var5][]; // L: 5352
			MouseRecorder.regionMapArchives = new byte[var5][]; // L: 5353
			var5 = 0; // L: 5354

			for (var6 = 0; var6 < 4; ++var6) { // L: 5355
				for (var7 = 0; var7 < 13; ++var7) { // L: 5356
					for (var8 = 0; var8 < 13; ++var8) { // L: 5357
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5358
						if (var9 != -1) { // L: 5359
							int var10 = var9 >> 14 & 1023; // L: 5360
							int var11 = var9 >> 3 & 2047; // L: 5361
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5362

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5363
								if (FileSystem.regions[var13] == var12) {
									var12 = -1; // L: 5364
									break; // L: 5365
								}
							}

							if (var12 != -1) { // L: 5367
								FileSystem.regions[var5] = var12; // L: 5368
								var13 = var12 >> 8 & 255; // L: 5369
								int var14 = var12 & 255; // L: 5370
								class41.regionMapArchiveIds[var5] = GameShell.archive5.getGroupId("m" + var13 + "_" + var14); // L: 5371
								GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var5] = GameShell.archive5.getGroupId("l" + var13 + "_" + var14); // L: 5372
								++var5; // L: 5373
							}
						}
					}
				}
			}

			VarcInt.method4428(var4, var2, !var15); // L: 5379
		}

	} // L: 5381
}
