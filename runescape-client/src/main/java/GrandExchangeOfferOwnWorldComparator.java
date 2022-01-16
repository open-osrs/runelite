import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("c")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;I)I",
		garbageValue = "1461383419"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "2109757925"
	)
	public static byte[] method1147(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? TaskHandler.method3047(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "48029406"
	)
	static final void method1148() {
		class1.method12(class127.field1498, class117.field1433, class33.field243);
		SecureRandomFuture.method2025(class142.field1615, ApproximateRouteStrategy.field460);
		if (UserComparator7.cameraX == class127.field1498 && AbstractByteArrayCopier.cameraY == class117.field1433 && class33.field243 == UserComparator10.cameraZ && class142.field1615 == UserComparator7.cameraPitch && ApproximateRouteStrategy.field460 == class379.cameraYaw) {
			Client.field724 = false;
			Client.isCameraLocked = false;
			PlayerComposition.field3193 = 0;
			MusicPatchNode.field3150 = 0;
			ModeWhere.field3951 = 0;
			WorldMapSection1.field2755 = 0;
			ChatChannel.field956 = 0;
			ItemComposition.field2012 = 0;
			Renderable.field2358 = 0;
			class167.field1811 = 0;
			VarpDefinition.field1748 = 0;
			UserComparator9.field1335 = 0;
		}

	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(ZLpj;B)V",
		garbageValue = "6"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field597 = 0;
		Client.field520 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field598[++Client.field597 - 1] = Client.npcIndices[var4];
			}
		}

		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var16 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var16.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						Client.field605[++Client.field520 - 1] = var5;
					} else if (var8 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var16.method2319(var9, class185.field2123);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.field605[++Client.field520 - 1] = var5;
						}
					} else if (var8 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var16.method2319(var9, class185.field2122);
							var10 = var2.readBits(3);
							var16.method2319(var10, class185.field2122);
						} else {
							var9 = var2.readBits(3);
							var16.method2319(var9, class185.field2120);
						}

						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.field605[++Client.field520 - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field598[++Client.field597 - 1] = var5;
					}
				}
			}

			int var6;
			int var14;
			NPC var15;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				var14 = var1.readBits(15);
				if (var14 == 32767) {
					break;
				}

				boolean var17 = false;
				if (Client.npcs[var14] == null) {
					Client.npcs[var14] = new NPC();
					var17 = true;
				}

				var15 = Client.npcs[var14];
				Client.npcIndices[++Client.npcCount - 1] = var14;
				var15.npcCycle = Client.cycle;
				if (class12.field72) {
					boolean var18 = var1.readBits(1) == 1;
					if (var18) {
						var1.readBits(32);
					}

					var9 = var1.readBits(1);
					if (var9 == 1) {
						Client.field605[++Client.field520 - 1] = var14;
					}

					var10 = Client.defaultRotations[var1.readBits(3)];
					if (var17) {
						var15.orientation = var15.rotation = var10;
					}

					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					var5 = var1.readBits(1);
					var15.definition = WorldMapLabelSize.getNpcDefinition(var1.readBits(14));
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}
				} else {
					var5 = var1.readBits(1);
					var15.definition = WorldMapLabelSize.getNpcDefinition(var1.readBits(14));
					var8 = var1.readBits(1);
					if (var8 == 1) {
						Client.field605[++Client.field520 - 1] = var14;
					}

					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}

					boolean var19 = var1.readBits(1) == 1;
					if (var19) {
						var1.readBits(32);
					}

					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}

					var10 = Client.defaultRotations[var1.readBits(3)];
					if (var17) {
						var15.orientation = var15.rotation = var10;
					}
				}

				var15.field1120 = var15.definition.size;
				var15.field1149 = var15.definition.rotation;
				if (var15.field1149 == 0) {
					var15.rotation = 0;
				}

				var15.walkSequence = var15.definition.walkSequence;
				var15.walkBackSequence = var15.definition.walkBackSequence;
				var15.walkLeftSequence = var15.definition.walkLeftSequence;
				var15.walkRightSequence = var15.definition.walkRightSequence;
				var15.idleSequence = var15.definition.idleSequence;
				var15.turnLeftSequence = var15.definition.turnLeftSequence;
				var15.turnRightSequence = var15.definition.turnRightSequence;
				var15.method2315(class340.localPlayer.pathX[0] + var6, class340.localPlayer.pathY[0] + var7, var5 == 1);
			}

			var1.exportIndex();

			for (var14 = 0; var14 < Client.field520; ++var14) {
				var3 = Client.field605[var14];
				var15 = Client.npcs[var3];
				var5 = var1.readUnsignedByte();
				if (class12.field72 && (var5 & 4) != 0) {
					var6 = var1.readUnsignedByte();
					var5 += var6 << 8;
				}

				if ((var5 & 8) != 0) {
					var6 = var1.method7401();
					var7 = var1.method7403();
					if (class12.field72) {
						var15.field1118 = var1.method7394() == 1;
					}

					var8 = var15.x - (var6 - class131.baseX - class131.baseX) * 64;
					var9 = var15.y - (var7 - TileItem.baseY - TileItem.baseY) * 64;
					if (var8 != 0 || var9 != 0) {
						var15.field1122 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
					}
				}

				if ((var5 & 1) != 0) {
					var6 = var1.method7392();
					int var11;
					int var12;
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; ++var7) {
							var9 = -1;
							var10 = -1;
							var11 = -1;
							var8 = var1.readUShortSmart();
							if (var8 == 32767) {
								var8 = var1.readUShortSmart();
								var10 = var1.readUShortSmart();
								var9 = var1.readUShortSmart();
								var11 = var1.readUShortSmart();
							} else if (var8 != 32766) {
								var10 = var1.readUShortSmart();
							} else {
								var8 = -1;
							}

							var12 = var1.readUShortSmart();
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
						}
					}

					var7 = var1.method7520();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var11 = var1.readUShortSmart();
								var12 = var1.method7392();
								int var13 = var10 > 0 ? var1.method7394() : var12;
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
							} else {
								var15.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var5 & 16) != 0) {
					var15.overheadText = var1.readStringCp1252NullTerminated();
					var15.overheadTextCyclesRemaining = 100;
				}

				if ((var5 & 2) != 0) {
					var15.spotAnimation = var1.method7403();
					var6 = var1.method7412();
					var15.spotAnimationHeight = var6 >> 16;
					var15.field1130 = (var6 & 65535) + Client.cycle;
					var15.spotAnimationFrame = 0;
					var15.spotAnimationFrameCycle = 0;
					if (var15.field1130 > Client.cycle) {
						var15.spotAnimationFrame = -1;
					}

					if (var15.spotAnimation == 65535) {
						var15.spotAnimation = -1;
					}
				}

				if ((var5 & 512) != 0) {
					var15.field1119 = var1.method7411();
				}

				if ((var5 & 64) != 0) {
					var6 = var1.method7403();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var1.method7394();
					if (var6 == var15.sequence && var6 != -1) {
						var8 = UserComparator5.SequenceDefinition_get(var6).field2078;
						if (var8 == 1) {
							var15.sequenceFrame = 0;
							var15.sequenceFrameCycle = 0;
							var15.sequenceDelay = var7;
							var15.field1126 = 0;
						}

						if (var8 == 2) {
							var15.field1126 = 0;
						}
					} else if (var6 == -1 || var15.sequence == -1 || UserComparator5.SequenceDefinition_get(var6).field2092 >= UserComparator5.SequenceDefinition_get(var15.sequence).field2092) {
						var15.sequence = var6;
						var15.sequenceFrame = 0;
						var15.sequenceFrameCycle = 0;
						var15.sequenceDelay = var7;
						var15.field1126 = 0;
						var15.field1098 = var15.pathLength;
					}
				}

				if (class12.field72 && (var5 & 1024) != 0 || !class12.field72 && (var5 & 4) != 0) {
					var15.field1132 = var1.method7396();
					var15.field1134 = var1.readByte();
					var15.field1133 = var1.method7396();
					var15.field1135 = var1.readByte();
					var15.field1136 = var1.method7403() + Client.cycle;
					var15.field1157 = var1.readUnsignedShort() + Client.cycle;
					var15.field1138 = var1.method7403();
					var15.pathLength = 1;
					var15.field1098 = 0;
					var15.field1132 += var15.pathX[0];
					var15.field1134 += var15.pathY[0];
					var15.field1133 += var15.pathX[0];
					var15.field1135 += var15.pathY[0];
				}

				if ((var5 & 128) != 0) {
					var15.targetIndex = var1.method7401();
					if (var15.targetIndex == 65535) {
						var15.targetIndex = -1;
					}
				}

				if ((var5 & 256) != 0) {
					var15.field1141 = Client.cycle + var1.readUnsignedShort();
					var15.field1140 = Client.cycle + var1.method7401();
					var15.field1143 = var1.readByte();
					var15.field1144 = var1.method7396();
					var15.field1095 = var1.method7396();
					var15.field1146 = (byte)var1.readUnsignedByte();
				}

				if ((var5 & 32) != 0) {
					var15.definition = WorldMapLabelSize.getNpcDefinition(var1.method7401());
					var15.field1120 = var15.definition.size;
					var15.field1149 = var15.definition.rotation;
					var15.walkSequence = var15.definition.walkSequence;
					var15.walkBackSequence = var15.definition.walkBackSequence;
					var15.walkLeftSequence = var15.definition.walkLeftSequence;
					var15.walkRightSequence = var15.definition.walkRightSequence;
					var15.idleSequence = var15.definition.idleSequence;
					var15.turnLeftSequence = var15.definition.turnLeftSequence;
					var15.turnRightSequence = var15.definition.turnRightSequence;
				}
			}

			for (var14 = 0; var14 < Client.field597; ++var14) {
				var3 = Client.field598[var14];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) {
					if (Client.npcs[Client.npcIndices[var14]] == null) {
						throw new RuntimeException(var14 + "," + Client.npcCount);
					}
				}

			}
		}
	}
}
