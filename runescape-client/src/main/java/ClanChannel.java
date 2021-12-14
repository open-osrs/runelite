import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("c")
	boolean field1637;
	@ObfuscatedName("b")
	boolean field1642;
	@ObfuscatedName("p")
	@Export("members")
	public List members;
	@ObfuscatedName("m")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -6629358270265648135L
	)
	long field1640;
	@ObfuscatedName("s")
	@Export("name")
	public String name;
	@ObfuscatedName("j")
	public byte field1636;
	@ObfuscatedName("w")
	public byte field1643;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1642 = true;
		this.name = null;
		this.method2992(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1790223696"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7914();
			}

			int[] var3 = this.sortedMembers;
			class292.method5504(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ldz;B)V",
		garbageValue = "-47"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1232070979"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method2990() {
		return this.members.size();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2014586653"
	)
	public int method2991(String var1) {
		if (!this.field1642) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-517363636"
	)
	void method2992(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1637 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1642 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1640 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1643 = var1.readByte();
		this.field1636 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1637) {
					var1.readLong();
				}

				if (this.field1642) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILgy;Lgf;B)V",
		garbageValue = "-30"
	)
	static final void method2996(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class148.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = SecureRandomFuture.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) {
				ObjectSound var22 = new ObjectSound();
				var22.plane = var0;
				var22.x = var1 * 128;
				var22.y = var2 * 128;
				var23 = var8.sizeX;
				var24 = var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var23 = var8.sizeY;
					var24 = var8.sizeX;
				}

				var22.maxX = (var23 + var1) * 128;
				var22.maxY = (var24 + var2) * 128;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field793 = var8.int7 * 128;
				var22.field796 = var8.int5;
				var22.field797 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}

				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field789 = var22.field796 + (int)(Math.random() * (double)(var22.field797 - var22.field796));
				}
			}

			Object var34;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) {
				int[] var10000;
				if (var5 >= 12) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.method3960(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = ClanChannelMember.field1504[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field969[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							SoundCache.field321[var0][var1][var2] = 50;
							SoundCache.field321[var0][var1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = ClanChannelMember.field1504[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							SoundCache.field321[var0][var1][var2 + 1] = 50;
							SoundCache.field321[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = ClanChannelMember.field1504[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							SoundCache.field321[var0][var1 + 1][var2] = 50;
							SoundCache.field321[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = ClanChannelMember.field1504[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							SoundCache.field321[var0][var1][var2] = 50;
							SoundCache.field321[var0][var1 + 1][var2] = 50;
						}

						if (var8.modelClipped) {
							var10000 = ClanChannelMember.field1504[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3721(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) {
						var6.method3966(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field970[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							SoundCache.field321[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							SoundCache.field321[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							SoundCache.field321[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							SoundCache.field321[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3721(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) {
						var28 = var4 + 1 & 3;
						Object var31;
						Object var32;
						if (var8.animationId == -1 && var8.transforms == null) {
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var31, (Renderable)var32, Tiles.field969[var4], Tiles.field969[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = ClanChannelMember.field1504[var0][var1];
								var10000[var2] |= 585;
								var10000 = ClanChannelMember.field1504[var0][var1];
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) {
								var10000 = ClanChannelMember.field1504[var0][var1];
								var10000[var2 + 1] |= 1170;
								var10000 = ClanChannelMember.field1504[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = ClanChannelMember.field1504[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = ClanChannelMember.field1504[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = ClanChannelMember.field1504[var0][var1];
								var10000[var2] |= 1170;
								var10000 = ClanChannelMember.field1504[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3721(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3966(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field970[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								SoundCache.field321[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								SoundCache.field321[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								SoundCache.field321[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								SoundCache.field321[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3721(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.method3960(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3966(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field969[var4], 0, 0, 0, var19, var21);
					} else {
						Object var25;
						long var29;
						if (var5 == 5) {
							var28 = 16;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var29)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field969[var4], 0, var28 * Tiles.field976[var4], var28 * Tiles.field966[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var29)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var28 * Tiles.field973[var4], var28 * Tiles.field974[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 3;
							if (var8.animationId == -1 && var8.transforms == null) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var29 != 0L) {
								var28 = class148.getObjectDefinition(PacketWriter.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = var4 + 2 & 3;
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var28 * Tiles.field973[var4], var28 * Tiles.field974[var4], var19, var21);
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
				}

				if (var34 != null && var6.method3960(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model)var34).method4222() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var33 = 0; var33 <= var10; ++var33) {
							if (var23 > SoundCache.field321[var0][var24 + var1][var33 + var2]) {
								SoundCache.field321[var0][var24 + var1][var33 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) {
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	}
}
