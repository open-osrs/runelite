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
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgb;Lmd;B)Lgv;",
		garbageValue = "1"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)Lm;",
		garbageValue = "1684033530"
	)
	public static class12 method1250(class7 var0) {
		switch(var0.field26) {
		case 0:
			return new class5();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I[B[BI)V",
		garbageValue = "-21779272"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field2649 == null) {
			if (var2 == null) {
				return;
			}

			var0.field2649 = new byte[11][];
			var0.field2637 = new byte[11][];
			var0.field2679 = new int[11];
			var0.field2664 = new int[11];
		}

		var0.field2649[var1] = var2;
		if (var2 != null) {
			var0.field2590 = true;
		} else {
			var0.field2590 = false;

			for (int var4 = 0; var4 < var0.field2649.length; ++var4) {
				if (var0.field2649[var4] != null) {
					var0.field2590 = true;
					break;
				}
			}
		}

		var0.field2637[var1] = var3;
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(ZLky;I)V",
		garbageValue = "191589163"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShort();
			int var3 = var1.method5539();
			var4 = var1.readUnsignedShort();
			class227.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class227.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			FileSystem.regions = new int[var4];
			class41.regionMapArchiveIds = new int[var4];
			GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds = new int[var4];
			WorldMapIcon_0.regionLandArchives = new byte[var4][];
			MouseRecorder.regionMapArchives = new byte[var4][];
			boolean var16 = false;
			if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
				var16 = true;
			}

			if (var2 / 8 == 48 && var3 / 8 == 148) {
				var16 = true;
			}

			var4 = 0;

			for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
				for (var7 = (var3 - 6) / 8; var7 <= (var3 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					if (!var16 || var7 != 49 && var7 != 149 && var7 != 147 && var6 != 50 && (var6 != 49 || var7 != 47)) {
						FileSystem.regions[var4] = var8;
						class41.regionMapArchiveIds[var4] = GameShell.archive5.getGroupId("m" + var6 + "_" + var7);
						GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var4] = GameShell.archive5.getGroupId("l" + var6 + "_" + var7);
						++var4;
					}
				}
			}

			VarcInt.method4428(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShort();
			boolean var15 = var1.method5573() == 1;
			var4 = var1.method5580();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class227.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class227.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			FileSystem.regions = new int[var5];
			class41.regionMapArchiveIds = new int[var5];
			GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds = new int[var5];
			WorldMapIcon_0.regionLandArchives = new byte[var5][];
			MouseRecorder.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (FileSystem.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								FileSystem.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class41.regionMapArchiveIds[var5] = GameShell.archive5.getGroupId("m" + var13 + "_" + var14);
								GrandExchangeOfferTotalQuantityComparator.regionLandArchiveIds[var5] = GameShell.archive5.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			VarcInt.method4428(var4, var2, !var15);
		}

	}
}
