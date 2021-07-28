import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -360591133
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("s")
	boolean field1431;
	@ObfuscatedName("t")
	boolean field1434;
	@ObfuscatedName("v")
	@Export("members")
	public List members;
	@ObfuscatedName("j")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 7823946021418061389L
	)
	long field1433;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("w")
	public byte field1430;
	@ObfuscatedName("f")
	public byte field1436;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1434 = true;
		this.name = null;
		this.method2514(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "5"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method7241();
			}

			class282.method5133(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "1690415442"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1192263820"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-338635200"
	)
	public int method2520() {
		return this.members.size();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-2011364190"
	)
	public int method2512(String var1) {
		if (!this.field1434) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "-1321038089"
	)
	void method2514(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1431 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1434 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1433 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1436 = var1.readByte();
		this.field1430 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1431) {
					var1.readLong();
				}

				if (this.field1434) {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILfg;Lfy;Z[I[IB)I",
		garbageValue = "-18"
	)
	public static int method2508(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class161.directions[var8][var9] = 0;
				class161.distances[var8][var9] = 99999999;
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var17;
		int var19;
		int var20;
		int var21;
		int var22;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) {
			var28 = VarpDefinition.method2715(var0, var1, var3, var4);
		} else if (var2 == 2) {
			var28 = KeyHandler.method107(var0, var1, var3, var4);
		} else {
			var10 = var0;
			var11 = var1;
			byte var12 = 64;
			var13 = 64;
			var14 = var0 - var12;
			var15 = var1 - var13;
			class161.directions[var12][var13] = 99;
			class161.distances[var12][var13] = 0;
			byte var16 = 0;
			var17 = 0;
			class161.bufferX[var16] = var0;
			var33 = var16 + 1;
			class161.bufferY[var16] = var1;
			int[][] var18 = var4.flags;

			boolean var29;
			label457:
			while (true) {
				label455:
				while (true) {
					do {
						do {
							do {
								label432:
								do {
									if (var33 == var17) {
										SoundSystem.field219 = var10;
										class161.field1896 = var11;
										var29 = false;
										break label457;
									}

									var10 = class161.bufferX[var17];
									var11 = class161.bufferY[var17];
									var17 = var17 + 1 & 4095;
									var30 = var10 - var14;
									var31 = var11 - var15;
									var19 = var10 - var4.xInset;
									var20 = var11 - var4.yInset;
									if (var3.hasArrived(var2, var10, var11, var4)) {
										SoundSystem.field219 = var10;
										class161.field1896 = var11;
										var29 = true;
										break label457;
									}

									var21 = class161.distances[var30][var31] + 1;
									if (var30 > 0 && class161.directions[var30 - 1][var31] == 0 && (var18[var19 - 1][var20] & 19136782) == 0 && (var18[var19 - 1][var20 + var2 - 1] & 19136824) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class161.bufferX[var33] = var10 - 1;
												class161.bufferY[var33] = var11;
												var33 = var33 + 1 & 4095;
												class161.directions[var30 - 1][var31] = 2;
												class161.distances[var30 - 1][var31] = var21;
												break;
											}

											if ((var18[var19 - 1][var20 + var22] & 19136830) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 < 128 - var2 && class161.directions[var30 + 1][var31] == 0 && (var18[var19 + var2][var20] & 19136899) == 0 && (var18[var19 + var2][var20 + var2 - 1] & 19136992) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class161.bufferX[var33] = var10 + 1;
												class161.bufferY[var33] = var11;
												var33 = var33 + 1 & 4095;
												class161.directions[var30 + 1][var31] = 8;
												class161.distances[var30 + 1][var31] = var21;
												break;
											}

											if ((var18[var19 + var2][var20 + var22] & 19136995) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var31 > 0 && class161.directions[var30][var31 - 1] == 0 && (var18[var19][var20 - 1] & 19136782) == 0 && (var18[var19 + var2 - 1][var20 - 1] & 19136899) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class161.bufferX[var33] = var10;
												class161.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class161.directions[var30][var31 - 1] = 1;
												class161.distances[var30][var31 - 1] = var21;
												break;
											}

											if ((var18[var22 + var19][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var31 < 128 - var2 && class161.directions[var30][var31 + 1] == 0 && (var18[var19][var20 + var2] & 19136824) == 0 && (var18[var19 + var2 - 1][var20 + var2] & 19136992) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2 - 1) {
												class161.bufferX[var33] = var10;
												class161.bufferY[var33] = var11 + 1;
												var33 = var33 + 1 & 4095;
												class161.directions[var30][var31 + 1] = 4;
												class161.distances[var30][var31 + 1] = var21;
												break;
											}

											if ((var18[var19 + var22][var20 + var2] & 19137016) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 > 0 && var31 > 0 && class161.directions[var30 - 1][var31 - 1] == 0 && (var18[var19 - 1][var20 - 1] & 19136782) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class161.bufferX[var33] = var10 - 1;
												class161.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class161.directions[var30 - 1][var31 - 1] = 3;
												class161.distances[var30 - 1][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 - 1][var22 + (var20 - 1)] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 < 128 - var2 && var31 > 0 && class161.directions[var30 + 1][var31 - 1] == 0 && (var18[var19 + var2][var20 - 1] & 19136899) == 0) {
										var22 = 1;

										while (true) {
											if (var22 >= var2) {
												class161.bufferX[var33] = var10 + 1;
												class161.bufferY[var33] = var11 - 1;
												var33 = var33 + 1 & 4095;
												class161.directions[var30 + 1][var31 - 1] = 9;
												class161.distances[var30 + 1][var31 - 1] = var21;
												break;
											}

											if ((var18[var19 + var2][var22 + (var20 - 1)] & 19136995) != 0 || (var18[var19 + var22][var20 - 1] & 19136911) != 0) {
												break;
											}

											++var22;
										}
									}

									if (var30 > 0 && var31 < 128 - var2 && class161.directions[var30 - 1][var31 + 1] == 0 && (var18[var19 - 1][var20 + var2] & 19136824) == 0) {
										for (var22 = 1; var22 < var2; ++var22) {
											if ((var18[var19 - 1][var22 + var20] & 19136830) != 0 || (var18[var22 + (var19 - 1)][var20 + var2] & 19137016) != 0) {
												continue label432;
											}
										}

										class161.bufferX[var33] = var10 - 1;
										class161.bufferY[var33] = var11 + 1;
										var33 = var33 + 1 & 4095;
										class161.directions[var30 - 1][var31 + 1] = 6;
										class161.distances[var30 - 1][var31 + 1] = var21;
									}
								} while(var30 >= 128 - var2);
							} while(var31 >= 128 - var2);
						} while(class161.directions[var30 + 1][var31 + 1] != 0);
					} while((var18[var19 + var2][var20 + var2] & 19136992) != 0);

					for (var22 = 1; var22 < var2; ++var22) {
						if ((var18[var22 + var19][var20 + var2] & 19137016) != 0 || (var18[var19 + var2][var20 + var22] & 19136995) != 0) {
							continue label455;
						}
					}

					class161.bufferX[var33] = var10 + 1;
					class161.bufferY[var33] = var11 + 1;
					var33 = var33 + 1 & 4095;
					class161.directions[var30 + 1][var31 + 1] = 12;
					class161.distances[var30 + 1][var31 + 1] = var21;
				}
			}

			var28 = var29;
		}

		var9 = var0 - 64;
		var10 = var1 - 64;
		var11 = SoundSystem.field219;
		var30 = class161.field1896;
		if (!var28) {
			var31 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var32 = 10;
			var33 = var3.approxDestinationX;
			var17 = var3.approxDestinationY;
			int var27 = var3.approxDestinationSizeX;
			var19 = var3.approxDestinationSizeY;

			for (var20 = var33 - var32; var20 <= var32 + var33; ++var20) {
				for (var21 = var17 - var32; var21 <= var17 + var32; ++var21) {
					var22 = var20 - var9;
					int var23 = var21 - var10;
					if (var22 >= 0 && var23 >= 0 && var22 < 128 && var23 < 128 && class161.distances[var22][var23] < 100) {
						int var24 = 0;
						if (var20 < var33) {
							var24 = var33 - var20;
						} else if (var20 > var27 + var33 - 1) {
							var24 = var20 - (var27 + var33 - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > var17 + var19 - 1) {
							var25 = var21 - (var19 + var17 - 1);
						}

						int var26 = var25 * var25 + var24 * var24;
						if (var26 < var31 || var26 == var31 && class161.distances[var22][var23] < var14) {
							var31 = var26;
							var14 = class161.distances[var22][var23];
							var11 = var20;
							var30 = var21;
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if (var0 == var11 && var30 == var1) {
			return 0;
		} else {
			var13 = 0;
			class161.bufferX[var13] = var11;
			var31 = var13 + 1;
			class161.bufferY[var13] = var30;

			for (var14 = var15 = class161.directions[var11 - var9][var30 - var10]; var0 != var11 || var30 != var1; var14 = class161.directions[var11 - var9][var30 - var10]) {
				if (var14 != var15) {
					var15 = var14;
					class161.bufferX[var31] = var11;
					class161.bufferY[var31++] = var30;
				}

				if ((var14 & 2) != 0) {
					++var11;
				} else if ((var14 & 8) != 0) {
					--var11;
				}

				if ((var14 & 1) != 0) {
					++var30;
				} else if ((var14 & 4) != 0) {
					--var30;
				}
			}

			var33 = 0;

			while (var31-- > 0) {
				var6[var33] = class161.bufferX[var31];
				var7[var33++] = class161.bufferY[var31];
				if (var33 >= var6.length) {
					break;
				}
			}

			return var33;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(II)Lem;",
		garbageValue = "1601574584"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-20"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1023 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = class171.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					WorldMapIcon_1.scene.drawEntity(GrandExchangeEvent.Client_plane, var2.x, var2.y, class122.getTileHeight(var2.field1023 * 64 - 64 + var2.x, var2.field1023 * 64 - 64 + var2.y, GrandExchangeEvent.Client_plane), var2.field1023 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}
}
