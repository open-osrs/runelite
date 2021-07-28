import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("h")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	static Widget field77;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("s")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1747543750"
	)
	static File method125(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.JagexCache_locationFile = new File(class234.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var25) {
				var25.printStackTrace();
			}

			if (var4 != null) {
				var27 = new File(var4);
				if (!var27.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var27 = new File(var4, "test.dat");

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw");
					var11 = var15.read();
					var15.seek(0L);
					var15.write(var11);
					var15.seek(0L);
					var15.close();
					var27.delete();
					var28 = true;
				} catch (Exception var23) {
					var28 = false;
				}

				if (!var28) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label152:
			for (int var16 = 0; var16 < DirectByteArrayCopier.cacheSubPaths.length; ++var16) {
				for (int var17 = 0; var17 < BuddyRankComparator.cacheParentPaths.length; ++var17) {
					File var18 = new File(BuddyRankComparator.cacheParentPaths[var17] + DirectByteArrayCopier.cacheSubPaths[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists()) {
						File var19 = new File(var18, "test.dat");

						boolean var29;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw");
							int var13 = var12.read();
							var12.seek(0L);
							var12.write(var13);
							var12.seek(0L);
							var12.close();
							var19.delete();
							var29 = true;
						} catch (Exception var22) {
							var29 = false;
						}

						if (var29) {
							var4 = var18.toString();
							var6 = true;
							break label152;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = class234.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var26;
		if (var5 != null) {
			var26 = new File(var5);
			var27 = new File(var4);

			try {
				File[] var33 = var26.listFiles();
				File[] var31 = var33;

				for (var11 = 0; var11 < var31.length; ++var11) {
					File var30 = var31[var11];
					File var20 = new File(var27, var30.getName());
					boolean var14 = var30.renameTo(var20);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var24) {
				var24.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var26 = new File(var4);
			var8 = null;

			try {
				AccessFile var34 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);
				Buffer var32 = new Buffer(500);
				var32.writeByte(3);
				var32.writeByte(var8 != null ? 1 : 0);
				var32.writeCESU8(var26.getPath());
				if (var8 != null) {
					var32.writeCESU8("");
				}

				var34.write(var32.array, 0, var32.offset);
				var34.close();
			} catch (IOException var21) {
				var21.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	public static void method123() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIILgw;Lfy;I)V",
		garbageValue = "1213959162"
	)
	static final void method120(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Scene var7, CollisionMap var8) {
		ObjectComposition var9 = ClanChannel.getObjectDefinition(var4);
		int var10;
		int var11;
		if (var5 != 1 && var5 != 3) {
			var10 = var9.sizeX;
			var11 = var9.sizeY;
		} else {
			var10 = var9.sizeY;
			var11 = var9.sizeX;
		}

		int var12;
		int var13;
		if (var10 + var2 <= 104) {
			var12 = (var10 >> 1) + var2;
			var13 = var2 + (var10 + 1 >> 1);
		} else {
			var12 = var2;
			var13 = var2 + 1;
		}

		int var14;
		int var15;
		if (var3 + var11 <= 104) {
			var14 = var3 + (var11 >> 1);
			var15 = var3 + (var11 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int[][] var16 = Tiles.Tiles_heights[var1];
		int var17 = var16[var13][var15] + var16[var12][var14] + var16[var13][var14] + var16[var12][var15] >> 2;
		int var18 = (var2 << 7) + (var10 << 6);
		int var19 = (var3 << 7) + (var11 << 6);
		long var20 = class171.calculateTag(var2, var3, 2, var9.int1 == 0, var4);
		int var22 = (var5 << 6) + var6;
		if (var9.int3 == 1) {
			var22 += 256;
		}

		Object var30;
		if (var6 == 22) {
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(22, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 22, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
			}

			var7.newFloorDecoration(var0, var2, var3, var17, (Renderable)var30, var20, var22);
			if (var9.interactType == 1) {
				var8.setBlockedByFloorDec(var2, var3);
			}

		} else if (var6 != 10 && var6 != 11) {
			if (var6 >= 12) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
				}

				var7.method3984(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22);
				if (var9.interactType != 0) {
					var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
				}

			} else if (var6 == 0) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(0, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 0, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field907[var5], 0, var20, var22);
				if (var9.interactType != 0) {
					var8.method3171(var2, var3, var6, var5, var9.boolean1);
				}

			} else if (var6 == 1) {
				if (var9.animationId == -1 && var9.transforms == null) {
					var30 = var9.getModel(1, var5, var16, var18, var17, var19);
				} else {
					var30 = new DynamicObject(var4, 1, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
				}

				var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field908[var5], 0, var20, var22);
				if (var9.interactType != 0) {
					var8.method3171(var2, var3, var6, var5, var9.boolean1);
				}

			} else {
				int var23;
				if (var6 == 2) {
					var23 = var5 + 1 & 3;
					Object var25;
					Object var31;
					if (var9.animationId == -1 && var9.transforms == null) {
						var31 = var9.getModel(2, var5 + 4, var16, var18, var17, var19);
						var25 = var9.getModel(2, var23, var16, var18, var17, var19);
					} else {
						var31 = new DynamicObject(var4, 2, var5 + 4, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
						var25 = new DynamicObject(var4, 2, var23, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var31, (Renderable)var25, Tiles.field907[var5], Tiles.field907[var23], var20, var22);
					if (var9.interactType != 0) {
						var8.method3171(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 3) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(3, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 3, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
					}

					var7.newBoundaryObject(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field908[var5], 0, var20, var22);
					if (var9.interactType != 0) {
						var8.method3171(var2, var3, var6, var5, var9.boolean1);
					}

				} else if (var6 == 9) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(var6, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, var6, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
					}

					var7.method3984(var0, var2, var3, var17, 1, 1, (Renderable)var30, 0, var20, var22);
					if (var9.interactType != 0) {
						var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
					}

				} else if (var6 == 4) {
					if (var9.animationId == -1 && var9.transforms == null) {
						var30 = var9.getModel(4, var5, var16, var18, var17, var19);
					} else {
						var30 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
					}

					var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, Tiles.field907[var5], 0, 0, 0, var20, var22);
				} else {
					long var24;
					Object var26;
					if (var6 == 5) {
						var23 = 16;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var24) {
							var23 = ClanChannel.getObjectDefinition(class78.Entity_unpackID(var24)).int2;
						}

						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, Tiles.field907[var5], 0, var23 * Tiles.field905[var5], var23 * Tiles.field912[var5], var20, var22);
					} else if (var6 == 6) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (0L != var24) {
							var23 = ClanChannel.getObjectDefinition(class78.Entity_unpackID(var24)).int2 / 2;
						}

						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field903[var5], var23 * Tiles.field914[var5], var20, var22);
					} else if (var6 == 7) {
						int var29 = var5 + 2 & 3;
						if (var9.animationId == -1 && var9.transforms == null) {
							var30 = var9.getModel(4, var29 + 4, var16, var18, var17, var19);
						} else {
							var30 = new DynamicObject(var4, 4, var29 + 4, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var20, var22);
					} else if (var6 == 8) {
						var23 = 8;
						var24 = var7.getBoundaryObjectTag(var0, var2, var3);
						if (var24 != 0L) {
							var23 = ClanChannel.getObjectDefinition(class78.Entity_unpackID(var24)).int2 / 2;
						}

						int var28 = var5 + 2 & 3;
						Object var27;
						if (var9.animationId == -1 && var9.transforms == null) {
							var26 = var9.getModel(4, var5 + 4, var16, var18, var17, var19);
							var27 = var9.getModel(4, var28 + 4, var16, var18, var17, var19);
						} else {
							var26 = new DynamicObject(var4, 4, var5 + 4, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
							var27 = new DynamicObject(var4, 4, var28 + 4, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
						}

						var7.newWallDecoration(var0, var2, var3, var17, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field903[var5], var23 * Tiles.field914[var5], var20, var22);
					}
				}
			}
		} else {
			if (var9.animationId == -1 && var9.transforms == null) {
				var30 = var9.getModel(10, var5, var16, var18, var17, var19);
			} else {
				var30 = new DynamicObject(var4, 10, var5, var1, var2, var3, var9.animationId, var9.field1733, (Renderable)null);
			}

			if (var30 != null) {
				var7.method3984(var0, var2, var3, var17, var10, var11, (Renderable)var30, var6 == 11 ? 256 : 0, var20, var22);
			}

			if (var9.interactType != 0) {
				var8.addGameObject(var2, var3, var10, var11, var9.boolean1);
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1283945843"
	)
	static int method124(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WallDecoration.method4340(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapDecorationType.method4888(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class100.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = GrandExchangeEvent.Client_plane;
					var4 = (MouseHandler.localPlayer.x >> 7) + GrandExchangeOfferNameComparator.baseX;
					var5 = (MouseHandler.localPlayer.y >> 7) + NPC.baseY;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WallDecoration.method4340(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator3.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapDecorationType.method4888(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field417;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field418;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Laq;S)V",
		garbageValue = "-8915"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Lhv;B)V",
		garbageValue = "19"
	)
	static final void method114(class227 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		byte var3;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var37;
		int var38;
		int var39;
		if (class227.field2675 == var0) {
			var37 = var1.readUnsignedByte();
			var3 = var1.method6644();
			var39 = var1.method6785();
			var5 = var1.method6696();
			byte var40 = var1.readByte();
			var7 = var1.method6686();
			var8 = (var7 >> 4 & 7) + Language.field3694;
			var9 = (var7 & 7) + SecureRandomFuture.field858;
			var10 = var1.method6688() * 4;
			var11 = var1.method6686() * 4;
			var12 = var1.method6698();
			var13 = var1.method6873();
			var14 = var1.readUnsignedShort();
			var38 = var3 + var8;
			var6 = var40 + var9;
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var38 >= 0 && var6 >= 0 && var38 < 104 && var6 < 104 && var5 != 65535) {
				var8 = var8 * 128 + 64;
				var9 = var9 * 128 + 64;
				var38 = var38 * 128 + 64;
				var6 = var6 * 128 + 64;
				Projectile var36 = new Projectile(var5, GrandExchangeEvent.Client_plane, var8, var9, class122.getTileHeight(var8, var9, GrandExchangeEvent.Client_plane) - var11, var14 + Client.cycle, var39 + Client.cycle, var37, var13, var12, var10);
				var36.setDestination(var38, var6, class122.getTileHeight(var38, var6, GrandExchangeEvent.Client_plane) - var10, var14 + Client.cycle);
				Client.projectiles.addFirst(var36);
			}

		} else {
			if (class227.field2676 == var0) {
				byte var2 = var1.method6690();
				var3 = var1.method6690();
				byte var4 = var1.method6689();
				var5 = var1.method6696();
				var6 = var1.readUnsignedShort();
				var7 = var1.method6697();
				var8 = var1.method6873();
				var9 = var8 >> 2;
				var10 = var8 & 3;
				var11 = Client.field467[var9];
				var12 = var1.method6686();
				var13 = (var12 >> 4 & 7) + Language.field3694;
				var14 = (var12 & 7) + SecureRandomFuture.field858;
				byte var15 = var1.method6689();
				int var16 = var1.method6696();
				Player var17;
				if (var7 == Client.localPlayerIndex) {
					var17 = MouseHandler.localPlayer;
				} else {
					var17 = Client.players[var7];
				}

				if (var17 != null) {
					ObjectComposition var18 = ClanChannel.getObjectDefinition(var6);
					int var19;
					int var20;
					if (var10 != 1 && var10 != 3) {
						var19 = var18.sizeX;
						var20 = var18.sizeY;
					} else {
						var19 = var18.sizeY;
						var20 = var18.sizeX;
					}

					int var21 = var13 + (var19 >> 1);
					int var22 = var13 + (var19 + 1 >> 1);
					int var23 = var14 + (var20 >> 1);
					int var24 = var14 + (var20 + 1 >> 1);
					int[][] var25 = Tiles.Tiles_heights[GrandExchangeEvent.Client_plane];
					int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
					int var27 = (var13 << 7) + (var19 << 6);
					int var28 = (var14 << 7) + (var20 << 6);
					Model var29 = var18.getModel(var9, var10, var25, var27, var26, var28);
					if (var29 != null) {
						ItemContainer.updatePendingSpawn(GrandExchangeEvent.Client_plane, var13, var14, var11, -1, 0, 0, var16 + 1, var5 + 1);
						var17.animationCycleStart = var16 + Client.cycle;
						var17.animationCycleEnd = var5 + Client.cycle;
						var17.model0 = var29;
						var17.field982 = var19 * 64 + var13 * 128;
						var17.field989 = var20 * 64 + var14 * 128;
						var17.tileHeight2 = var26;
						byte var30;
						if (var2 > var15) {
							var30 = var2;
							var2 = var15;
							var15 = var30;
						}

						if (var4 > var3) {
							var30 = var4;
							var4 = var3;
							var3 = var30;
						}

						var17.minX = var13 + var2;
						var17.maxX = var15 + var13;
						var17.minY = var4 + var14;
						var17.maxY = var14 + var3;
					}
				}
			}

			if (class227.field2682 == var0) {
				var37 = var1.method6686();
				var38 = (var37 >> 4 & 7) + Language.field3694;
				var39 = (var37 & 7) + SecureRandomFuture.field858;
				var5 = var1.method6688();
				var6 = var1.method6697();
				var7 = var1.method6697();
				if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
					var38 = var38 * 128 + 64;
					var39 = var39 * 128 + 64;
					GraphicsObject var44 = new GraphicsObject(var7, GrandExchangeEvent.Client_plane, var38, var39, class122.getTileHeight(var38, var39, GrandExchangeEvent.Client_plane) - var5, var6, Client.cycle);
					Client.graphicsObjects.addFirst(var44);
				}

			} else if (class227.field2683 == var0) {
				var37 = var1.method6697();
				var38 = var1.method6688();
				var39 = (var38 >> 4 & 7) + Language.field3694;
				var5 = (var38 & 7) + SecureRandomFuture.field858;
				var6 = var1.method6785();
				var7 = var1.readUnsignedShort();
				if (var39 >= 0 && var5 >= 0 && var39 < 104 && var5 < 104) {
					NodeDeque var34 = Client.groundItems[GrandExchangeEvent.Client_plane][var39][var5];
					if (var34 != null) {
						for (TileItem var35 = (TileItem)var34.last(); var35 != null; var35 = (TileItem)var34.previous()) {
							if ((var6 & 32767) == var35.id && var7 == var35.quantity) {
								var35.quantity = var37;
								break;
							}
						}

						FriendSystem.updateItemPile(var39, var5);
					}
				}

			} else {
				TileItem var32;
				if (class227.field2680 == var0) {
					var37 = var1.method6873();
					var38 = (var37 >> 4 & 7) + Language.field3694;
					var39 = (var37 & 7) + SecureRandomFuture.field858;
					var5 = var1.method6696();
					if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
						NodeDeque var33 = Client.groundItems[GrandExchangeEvent.Client_plane][var38][var39];
						if (var33 != null) {
							for (var32 = (TileItem)var33.last(); var32 != null; var32 = (TileItem)var33.previous()) {
								if ((var5 & 32767) == var32.id) {
									var32.remove();
									break;
								}
							}

							if (var33.last() == null) {
								Client.groundItems[GrandExchangeEvent.Client_plane][var38][var39] = null;
							}

							FriendSystem.updateItemPile(var38, var39);
						}
					}

				} else if (class227.field2678 == var0) {
					var37 = var1.readUnsignedByte();
					var38 = (var37 >> 4 & 7) + Language.field3694;
					var39 = (var37 & 7) + SecureRandomFuture.field858;
					var5 = var1.method6873();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var8 = Client.field467[var6];
					if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
						ItemContainer.updatePendingSpawn(GrandExchangeEvent.Client_plane, var38, var39, var8, -1, var6, var7, 0, -1);
					}

				} else {
					if (class227.field2681 == var0) {
						var37 = var1.readUnsignedShort();
						var38 = var1.method6873();
						var39 = (var38 >> 4 & 7) + Language.field3694;
						var5 = (var38 & 7) + SecureRandomFuture.field858;
						var6 = var1.readUnsignedByte();
						var7 = var6 >> 4 & 15;
						var8 = var6 & 7;
						var9 = var1.method6873();
						if (var39 >= 0 && var5 >= 0 && var39 < 104 && var5 < 104) {
							var10 = var7 + 1;
							if (MouseHandler.localPlayer.pathX[0] >= var39 - var10 && MouseHandler.localPlayer.pathX[0] <= var39 + var10 && MouseHandler.localPlayer.pathY[0] >= var5 - var10 && MouseHandler.localPlayer.pathY[0] <= var5 + var10 && Decimator.clientPreferences.areaSoundEffectsVolume != 0 && var8 > 0 && Client.soundEffectCount < 50) {
								Client.soundEffectIds[Client.soundEffectCount] = var37;
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var39 << 16);
								++Client.soundEffectCount;
							}
						}
					}

					if (class227.field2674 == var0) {
						var37 = var1.method6873();
						var38 = (var37 >> 4 & 7) + Language.field3694;
						var39 = (var37 & 7) + SecureRandomFuture.field858;
						var5 = var1.method6785();
						var6 = var1.method6785();
						if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
							var32 = new TileItem();
							var32.id = var5;
							var32.quantity = var6;
							if (Client.groundItems[GrandExchangeEvent.Client_plane][var38][var39] == null) {
								Client.groundItems[GrandExchangeEvent.Client_plane][var38][var39] = new NodeDeque();
							}

							Client.groundItems[GrandExchangeEvent.Client_plane][var38][var39].addFirst(var32);
							FriendSystem.updateItemPile(var38, var39);
						}

					} else if (class227.field2677 != var0) {
						if (class227.field2679 == var0) {
							var37 = var1.method6873();
							var38 = var37 >> 2;
							var39 = var37 & 3;
							var5 = Client.field467[var38];
							var6 = var1.readUnsignedByte();
							var7 = (var6 >> 4 & 7) + Language.field3694;
							var8 = (var6 & 7) + SecureRandomFuture.field858;
							var9 = var1.readUnsignedShort();
							if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
								ItemContainer.updatePendingSpawn(GrandExchangeEvent.Client_plane, var7, var8, var5, var9, var38, var39, 0, -1);
							}

						}
					} else {
						var37 = var1.method6686();
						var38 = (var37 >> 4 & 7) + Language.field3694;
						var39 = (var37 & 7) + SecureRandomFuture.field858;
						var5 = var1.method6697();
						var6 = var1.method6688();
						var7 = var6 >> 2;
						var8 = var6 & 3;
						var9 = Client.field467[var7];
						if (var38 >= 0 && var39 >= 0 && var38 < 103 && var39 < 103) {
							if (var9 == 0) {
								BoundaryObject var31 = WorldMapIcon_1.scene.method4060(GrandExchangeEvent.Client_plane, var38, var39);
								if (var31 != null) {
									var11 = class78.Entity_unpackID(var31.tag);
									if (var7 == 2) {
										var31.renderable1 = new DynamicObject(var11, 2, var8 + 4, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var31.renderable1);
										var31.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var31.renderable2);
									} else {
										var31.renderable1 = new DynamicObject(var11, var7, var8, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var31.renderable1);
									}
								}
							}

							if (var9 == 1) {
								WallDecoration var41 = WorldMapIcon_1.scene.method3997(GrandExchangeEvent.Client_plane, var38, var39);
								if (var41 != null) {
									var11 = class78.Entity_unpackID(var41.tag);
									if (var7 != 4 && var7 != 5) {
										if (var7 == 6) {
											var41.renderable1 = new DynamicObject(var11, 4, var8 + 4, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var41.renderable1);
										} else if (var7 == 7) {
											var41.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var41.renderable1);
										} else if (var7 == 8) {
											var41.renderable1 = new DynamicObject(var11, 4, var8 + 4, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var41.renderable1);
											var41.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var41.renderable2);
										}
									} else {
										var41.renderable1 = new DynamicObject(var11, 4, var8, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var41.renderable1);
									}
								}
							}

							if (var9 == 2) {
								GameObject var42 = WorldMapIcon_1.scene.method4043(GrandExchangeEvent.Client_plane, var38, var39);
								if (var7 == 11) {
									var7 = 10;
								}

								if (var42 != null) {
									var42.renderable = new DynamicObject(class78.Entity_unpackID(var42.tag), var7, var8, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var42.renderable);
								}
							}

							if (var9 == 3) {
								FloorDecoration var43 = WorldMapIcon_1.scene.getFloorDecoration(GrandExchangeEvent.Client_plane, var38, var39);
								if (var43 != null) {
									var43.renderable = new DynamicObject(class78.Entity_unpackID(var43.tag), 22, var8, GrandExchangeEvent.Client_plane, var38, var39, var5, false, var43.renderable);
								}
							}
						}

					}
				}
			}
		}
	}
}
