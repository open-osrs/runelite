import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("v")
	boolean field1653;
	@ObfuscatedName("c")
	boolean field1658;
	@ObfuscatedName("i")
	@Export("members")
	public List members;
	@ObfuscatedName("f")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -6213414464527549047L
	)
	long field1656;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	public byte field1654;
	@ObfuscatedName("l")
	public byte field1659;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1658 = true; // L: 13
		this.name = null; // L: 17
		this.method3117(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-75"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8243();
			}

			int[] var3 = this.sortedMembers; // L: 37
			class433.method7605(var1, var3, 0, var1.length - 1); // L: 39
		}

		return this.sortedMembers; // L: 42
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lec;B)V",
		garbageValue = "6"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 46
		this.sortedMembers = null; // L: 47
	} // L: 48

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-911825702"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 51
		this.sortedMembers = null; // L: 52
	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-251884744"
	)
	public int method3119() {
		return this.members.size(); // L: 56
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "75"
	)
	public int method3116(String var1) {
		if (!this.field1658) { // L: 60
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 61
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 62
				}
			}

			return -1; // L: 64
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lpi;S)V",
		garbageValue = "-10005"
	)
	void method3117(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 68
		if ((var2 & 1) != 0) { // L: 69
			this.field1653 = true;
		}

		if ((var2 & 2) != 0) { // L: 70
			this.field1658 = true;
		}

		int var3 = 2; // L: 71
		if ((var2 & 4) != 0) { // L: 72
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 73
		this.field1656 = var1.readLong(); // L: 74
		this.name = var1.readStringCp1252NullTerminated(); // L: 75
		var1.readBoolean(); // L: 76
		this.field1659 = var1.readByte(); // L: 77
		this.field1654 = var1.readByte(); // L: 78
		int var4 = var1.readUnsignedShort(); // L: 79
		if (var4 > 0) { // L: 80
			this.members = new ArrayList(var4); // L: 81

			for (int var5 = 0; var5 < var4; ++var5) { // L: 82
				ClanChannelMember var6 = new ClanChannelMember(); // L: 83
				if (this.field1653) { // L: 84
					var1.readLong(); // L: 85
				}

				if (this.field1658) { // L: 87
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 88
				var6.world = var1.readUnsignedShort(); // L: 89
				if (var3 >= 3) { // L: 90
					var1.readBoolean(); // L: 91
				}

				this.members.add(var5, var6); // L: 94
			}
		}

	} // L: 97

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbd;",
		garbageValue = "-23"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class152.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = PcmPlayer.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-1683816578"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 7800
			if (Client.isLowDetail && var0 != class18.Client_plane) { // L: 7801
				return;
			}

			long var7 = 0L; // L: 7802
			boolean var9 = true; // L: 7803
			boolean var10 = false; // L: 7804
			boolean var11 = false; // L: 7805
			if (var1 == 0) { // L: 7806
				var7 = ArchiveLoader.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 7807
				var7 = ArchiveLoader.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 7808
				var7 = ArchiveLoader.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 7809
				var7 = ArchiveLoader.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 7810
				var12 = ArchiveLoader.scene.getObjectFlags(var0, var2, var3, var7); // L: 7811
				int var38 = FileSystem.Entity_unpackID(var7); // L: 7812
				int var39 = var12 & 31; // L: 7813
				int var40 = var12 >> 6 & 3; // L: 7814
				ObjectComposition var13;
				if (var1 == 0) { // L: 7815
					ArchiveLoader.scene.removeBoundaryObject(var0, var2, var3); // L: 7816
					var13 = class146.getObjectDefinition(var38); // L: 7817
					if (var13.interactType != 0) { // L: 7818
						Client.collisionMaps[var0].method3853(var2, var3, var39, var40, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7820
					ArchiveLoader.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7821
					ArchiveLoader.scene.removeGameObject(var0, var2, var3); // L: 7822
					var13 = class146.getObjectDefinition(var38); // L: 7823
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7824
						return;
					}

					if (var13.interactType != 0) { // L: 7825
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var40, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7827
					ArchiveLoader.scene.removeFloorDecoration(var0, var2, var3); // L: 7828
					var13 = class146.getObjectDefinition(var38); // L: 7829
					if (var13.interactType == 1) { // L: 7830
						Client.collisionMaps[var0].method3847(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7833
				var12 = var0; // L: 7834
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7835
					var12 = var0 + 1;
				}

				Scene var41 = ArchiveLoader.scene; // L: 7836
				CollisionMap var14 = Client.collisionMaps[var0]; // L: 7837
				ObjectComposition var15 = class146.getObjectDefinition(var4); // L: 7839
				int var16;
				int var17;
				if (var5 != 1 && var5 != 3) { // L: 7842
					var16 = var15.sizeX; // L: 7847
					var17 = var15.sizeY; // L: 7848
				} else {
					var16 = var15.sizeY; // L: 7843
					var17 = var15.sizeX; // L: 7844
				}

				int var18;
				int var19;
				if (var16 + var2 <= 104) { // L: 7854
					var18 = (var16 >> 1) + var2; // L: 7855
					var19 = var2 + (var16 + 1 >> 1); // L: 7856
				} else {
					var18 = var2; // L: 7859
					var19 = var2 + 1; // L: 7860
				}

				int var20;
				int var21;
				if (var3 + var17 <= 104) { // L: 7862
					var20 = var3 + (var17 >> 1); // L: 7863
					var21 = var3 + (var17 + 1 >> 1); // L: 7864
				} else {
					var20 = var3; // L: 7867
					var21 = var3 + 1; // L: 7868
				}

				int[][] var22 = Tiles.Tiles_heights[var12]; // L: 7870
				int var23 = var22[var19][var20] + var22[var18][var20] + var22[var18][var21] + var22[var19][var21] >> 2; // L: 7871
				int var24 = (var2 << 7) + (var16 << 6); // L: 7872
				int var25 = (var3 << 7) + (var17 << 6); // L: 7873
				long var26 = GameObject.calculateTag(var2, var3, 2, var15.int1 == 0, var4); // L: 7874
				int var28 = (var5 << 6) + var6; // L: 7875
				if (var15.int3 == 1) { // L: 7876
					var28 += 256;
				}

				Object var36;
				if (var6 == 22) { // L: 7877
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7879
						var36 = var15.getModel(22, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 22, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7880
					}

					var41.newFloorDecoration(var0, var2, var3, var23, (Renderable)var36, var26, var28); // L: 7881
					if (var15.interactType == 1) { // L: 7882
						var14.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) { // L: 7885
					if (var6 >= 12) { // L: 7893
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7895
							var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7896
						}

						var41.method4882(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7897
						if (var15.interactType != 0) { // L: 7898
							var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
						}
					} else if (var6 == 0) { // L: 7901
						if (var15.animationId == -1 && var15.transforms == null) { // L: 7903
							var36 = var15.getModel(0, var5, var22, var24, var23, var25);
						} else {
							var36 = new DynamicObject(var4, 0, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7904
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field990[var5], 0, var26, var28); // L: 7905
						if (var15.interactType != 0) { // L: 7906
							var14.method3872(var2, var3, var6, var5, var15.boolean1);
						}
					} else if (var6 == 1) { // L: 7909
						if (var15.animationId == -1 && var15.transforms == null) {
							var36 = var15.getModel(1, var5, var22, var24, var23, var25); // L: 7911
						} else {
							var36 = new DynamicObject(var4, 1, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7912
						}

						var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field989[var5], 0, var26, var28); // L: 7913
						if (var15.interactType != 0) { // L: 7914
							var14.method3872(var2, var3, var6, var5, var15.boolean1);
						}
					} else {
						int var29;
						if (var6 == 2) { // L: 7917
							var29 = var5 + 1 & 3; // L: 7918
							Object var31;
							Object var37;
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7921
								var37 = var15.getModel(2, var5 + 4, var22, var24, var23, var25); // L: 7922
								var31 = var15.getModel(2, var29, var22, var24, var23, var25); // L: 7923
							} else {
								var37 = new DynamicObject(var4, 2, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7926
								var31 = new DynamicObject(var4, 2, var29, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7927
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var37, (Renderable)var31, Tiles.field990[var5], Tiles.field990[var29], var26, var28); // L: 7929
							if (var15.interactType != 0) { // L: 7930
								var14.method3872(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 3) { // L: 7933
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7935
								var36 = var15.getModel(3, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 3, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7936
							}

							var41.newBoundaryObject(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field989[var5], 0, var26, var28); // L: 7937
							if (var15.interactType != 0) { // L: 7938
								var14.method3872(var2, var3, var6, var5, var15.boolean1);
							}
						} else if (var6 == 9) { // L: 7941
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7943
								var36 = var15.getModel(var6, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, var6, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7944
							}

							var41.method4882(var0, var2, var3, var23, 1, 1, (Renderable)var36, 0, var26, var28); // L: 7945
							if (var15.interactType != 0) { // L: 7946
								var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
							}
						} else if (var6 == 4) { // L: 7949
							if (var15.animationId == -1 && var15.transforms == null) { // L: 7951
								var36 = var15.getModel(4, var5, var22, var24, var23, var25);
							} else {
								var36 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7952
							}

							var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, Tiles.field990[var5], 0, 0, 0, var26, var28); // L: 7953
						} else {
							long var30;
							Object var32;
							if (var6 == 5) { // L: 7956
								var29 = 16; // L: 7957
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7958
								if (0L != var30) { // L: 7959
									var29 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var30)).int2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7961
									var32 = var15.getModel(4, var5, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7962
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, Tiles.field990[var5], 0, var29 * Tiles.field992[var5], var29 * Tiles.field993[var5], var26, var28); // L: 7963
							} else if (var6 == 6) { // L: 7966
								var29 = 8; // L: 7967
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7968
								if (0L != var30) { // L: 7969
									var29 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var30)).int2 / 2;
								}

								if (var15.animationId == -1 && var15.transforms == null) { // L: 7971
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25);
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7972
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)null, 256, var5, var29 * Tiles.field997[var5], var29 * Tiles.field995[var5], var26, var28); // L: 7973
							} else if (var6 == 7) { // L: 7976
								int var35 = var5 + 2 & 3; // L: 7978
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7979
									var36 = var15.getModel(4, var35 + 4, var22, var24, var23, var25);
								} else {
									var36 = new DynamicObject(var4, 4, var35 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7980
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var36, (Renderable)null, 256, var35, 0, 0, var26, var28); // L: 7981
							} else if (var6 == 8) { // L: 7984
								var29 = 8; // L: 7985
								var30 = var41.getBoundaryObjectTag(var0, var2, var3); // L: 7986
								if (var30 != 0L) { // L: 7987
									var29 = class146.getObjectDefinition(FileSystem.Entity_unpackID(var30)).int2 / 2;
								}

								int var34 = var5 + 2 & 3; // L: 7990
								Object var33;
								if (var15.animationId == -1 && var15.transforms == null) { // L: 7991
									var32 = var15.getModel(4, var5 + 4, var22, var24, var23, var25); // L: 7992
									var33 = var15.getModel(4, var34 + 4, var22, var24, var23, var25); // L: 7993
								} else {
									var32 = new DynamicObject(var4, 4, var5 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7996
									var33 = new DynamicObject(var4, 4, var34 + 4, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7997
								}

								var41.newWallDecoration(var0, var2, var3, var23, (Renderable)var32, (Renderable)var33, 256, var5, var29 * Tiles.field997[var5], var29 * Tiles.field995[var5], var26, var28); // L: 7999
							}
						}
					}
				} else {
					if (var15.animationId == -1 && var15.transforms == null) { // L: 7887
						var36 = var15.getModel(10, var5, var22, var24, var23, var25);
					} else {
						var36 = new DynamicObject(var4, 10, var5, var12, var2, var3, var15.animationId, var15.boolean3, (Renderable)null); // L: 7888
					}

					if (var36 != null) { // L: 7889
						var41.method4882(var0, var2, var3, var23, var16, var17, (Renderable)var36, var6 == 11 ? 256 : 0, var26, var28);
					}

					if (var15.interactType != 0) { // L: 7890
						var14.addGameObject(var2, var3, var16, var17, var15.boolean1);
					}
				}
			}
		}

	} // L: 8004

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "61"
	)
	static final void method3137(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12436
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3119()) { // L: 12437
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12438
				PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2967, Client.packetWriter.isaacCipher); // L: 12439
				var4.packetBuffer.writeByte(4 + class425.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12440
				var4.packetBuffer.writeByte(var0); // L: 12441
				var4.packetBuffer.writeShort(var1); // L: 12442
				var4.packetBuffer.writeBoolean(var2); // L: 12443
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12444
				Client.packetWriter.addNode(var4); // L: 12445
			}
		}
	} // L: 12446
}
