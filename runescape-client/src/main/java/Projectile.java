import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("bv")
	static String field1254;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -755996103
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1141398545
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 877328381
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1822373019
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -584501537
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1427536699
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1057628543
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1465417479
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1352197335
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1830330659
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 165397127
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("b")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("a")
	@Export("x")
	double x;
	@ObfuscatedName("w")
	@Export("y")
	double y;
	@ObfuscatedName("k")
	@Export("z")
	double z;
	@ObfuscatedName("i")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("x")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("f")
	@Export("speed")
	double speed;
	@ObfuscatedName("g")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("u")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1955217023
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2095511803
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 900549733
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 404929191
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7; // L: 42
		this.slope = var8;
		this.startHeight = var9; // L: 44
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false; // L: 47
		int var12 = AbstractUserComparator.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = InterfaceParent.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "101"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5);
	} // L: 68

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * 0.5D * this.accelerationZ * (double)var1 + this.speedZ * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount; // L: 84
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lef;",
		garbageValue = "127"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = AbstractUserComparator.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame); // L: 93
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "23"
	)
	@Export("findAndLoadCache")
	public static void findAndLoadCache(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3; // L: 40
		JagexCache.cacheGamebuild = var2; // L: 41

		try {
			JagexCache.operatingSystemName = System.getProperty("os.name"); // L: 43
		} catch (Exception var28) { // L: 45
			JagexCache.operatingSystemName = "Unknown"; // L: 46
		}

		GZipDecompressor.formattedOperatingSystemName = JagexCache.operatingSystemName.toLowerCase(); // L: 48

		try {
			JagexCache.userHomeDirectory = System.getProperty("user.home"); // L: 50
			if (JagexCache.userHomeDirectory != null) { // L: 51
				JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
			}
		} catch (Exception var27) { // L: 53
		}

		try {
			if (GZipDecompressor.formattedOperatingSystemName.startsWith("win")) { // L: 55
				if (JagexCache.userHomeDirectory == null) { // L: 56
					JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (JagexCache.userHomeDirectory == null) { // L: 59
				JagexCache.userHomeDirectory = System.getenv("HOME");
			}

			if (JagexCache.userHomeDirectory != null) { // L: 61
				JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
			}
		} catch (Exception var26) { // L: 63
		}

		if (JagexCache.userHomeDirectory == null) { // L: 64
			JagexCache.userHomeDirectory = "~/";
		}

		MinimapRenderer.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""}; // L: 65
		Timer.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild}; // L: 66
		int var18 = 0;

		label250:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18; // L: 70
			JagexCache.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat"); // L: 71
			String var7 = null; // L: 72
			String var8 = null; // L: 73
			boolean var9 = false; // L: 74
			Buffer var11;
			File var33;
			if (JagexCache.JagexCache_locationFile.exists()) { // L: 75
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 78

					int var12;
					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 79 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset); // L: 81
						if (var12 == -1) {
							throw new IOException(); // L: 82
						}
					}

					var11.offset = 0; // L: 85
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) { // L: 89
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) { // L: 90
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) { // L: 92
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) { // L: 96
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var30) { // L: 100
					var30.printStackTrace(); // L: 101
				}

				if (var7 != null) { // L: 103
					var33 = new File(var7); // L: 104
					if (!var33.exists()) { // L: 105
						var7 = null; // L: 106
					}
				}

				if (var7 != null) { // L: 109
					var33 = new File(var7, "test.dat"); // L: 110
					if (!class23.isWriteable(var33, true)) { // L: 111
						var7 = null; // L: 112
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 116
				label225:
				for (int var19 = 0; var19 < Timer.cacheSubPaths.length; ++var19) { // L: 117
					for (int var20 = 0; var20 < MinimapRenderer.cacheParentPaths.length; ++var20) { // L: 118
						File var21 = new File(MinimapRenderer.cacheParentPaths[var20] + Timer.cacheSubPaths[var19] + File.separatorChar + var0 + File.separatorChar); // L: 119
						if (var21.exists() && class23.isWriteable(new File(var21, "test.dat"), true)) { // L: 120 121
							var7 = var21.toString(); // L: 122
							var9 = true; // L: 123
							break label225; // L: 124
						}
					}
				}
			}

			if (var7 == null) { // L: 130
				var7 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 131
				var9 = true; // L: 132
			}

			File var32;
			if (var8 != null) { // L: 134
				var32 = new File(var8); // L: 135
				var33 = new File(var7); // L: 136

				try {
					File[] var35 = var32.listFiles(); // L: 138
					File[] var22 = var35; // L: 140

					for (int var14 = 0; var14 < var22.length; ++var14) { // L: 141
						File var15 = var22[var14]; // L: 142
						File var16 = new File(var33, var15.getName()); // L: 144
						boolean var17 = var15.renameTo(var16); // L: 145
						if (!var17) { // L: 146
							throw new IOException();
						}
					}
				} catch (Exception var29) { // L: 151
					var29.printStackTrace(); // L: 152
				}

				var9 = true; // L: 154
			}

			if (var9) { // L: 156
				var32 = new File(var7); // L: 157
				var11 = null; // L: 158

				try {
					AccessFile var36 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 162
					Buffer var37 = new Buffer(500); // L: 163
					var37.writeByte(3); // L: 164
					var37.writeByte(var11 != null ? 1 : 0); // L: 165
					var37.writeCESU8(var32.getPath()); // L: 166
					if (var11 != null) { // L: 167
						var37.writeCESU8("");
					}

					var36.write(var37.array, 0, var37.offset); // L: 168
					var36.close(); // L: 169
				} catch (IOException var25) { // L: 171
					var25.printStackTrace(); // L: 172
				}
			}

			File var5 = new File(var7); // L: 176
			JagexCache.cacheDir = var5; // L: 178
			if (!JagexCache.cacheDir.exists()) { // L: 179
				JagexCache.cacheDir.mkdirs();
			}

			File[] var31 = JagexCache.cacheDir.listFiles(); // L: 180
			if (var31 != null) { // L: 181
				File[] var34 = var31; // L: 183

				for (int var23 = 0; var23 < var34.length; ++var23) { // L: 184
					File var24 = var34[var23]; // L: 185
					if (!class23.isWriteable(var24, false)) { // L: 187
						++var18; // L: 67
						continue label250;
					}
				}
			}
			break;
		}

		class3.assertCacheDirExists(JagexCache.cacheDir); // L: 194
		Varcs.findOrCreateRandomDatFile(); // L: 195
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GraphicsObject.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 196
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GraphicsObject.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 197
		WorldMapEvent.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 198

		for (var18 = 0; var18 < JagexCache.idxCount; ++var18) { // L: 199
			WorldMapEvent.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(GraphicsObject.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 200
		}

	} // L: 202

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-22"
	)
	public static byte[] method2260() {
		byte[] var0 = new byte[24]; // L: 279

		try {
			JagexCache.JagexCache_randomDat.seek(0L); // L: 281
			JagexCache.JagexCache_randomDat.readFully(var0); // L: 282

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) { // L: 283 284 285
			}

			if (var1 >= 24) {
				throw new IOException(); // L: 287
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) { // L: 290
				var0[var2] = -1;
			}
		}

		return var0; // L: 292
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-87"
	)
	static final void method2262(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) { // L: 7826
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) { // L: 7827
				Client.field816[var4] = true;
			}
		}

	} // L: 7829

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "2"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9046
			WorldMapManager.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9047
		}

		long var4 = -1L; // L: 9050
		long var6 = -1L; // L: 9051

		int var8;
		for (var8 = 0; var8 < AbstractWorldMapData.method342(); ++var8) { // L: 9052
			long var22 = ObjectSound.method2044(var8); // L: 9053
			if (var22 != var6) { // L: 9054
				var6 = var22; // L: 9055
				int var11 = class200.method3865(var8); // L: 9056
				int var12 = NPC.method2179(var8); // L: 9057
				int var13 = FontName.method5502(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9060
				int var15 = AbstractWorldMapIcon.method710(var8); // L: 9063
				if (var13 == 2 && MilliClock.scene.getObjectFlags(class90.Client_plane, var11, var12, var22) >= 0) { // L: 9064 9065
					ObjectComposition var16 = WorldMapAreaData.getObjectDefinition(var15); // L: 9066
					if (var16.transforms != null) { // L: 9067
						var16 = var16.transform();
					}

					if (var16 == null) { // L: 9068
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9069
						WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(65535) + var16.name, 1, var15, var11, var12); // L: 9070
					} else if (Client.isSpellSelected) { // L: 9073
						if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 4) == 4) { // L: 9074
							WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(65535) + var16.name, 2, var15, var11, var12); // L: 9075
						}
					} else {
						String[] var17 = var16.actions; // L: 9080
						if (var17 != null) { // L: 9081
							for (int var18 = 4; var18 >= 0; --var18) { // L: 9082
								if (var17[var18] != null) { // L: 9083
									short var19 = 0; // L: 9084
									if (var18 == 0) { // L: 9085
										var19 = 3;
									}

									if (var18 == 1) { // L: 9086
										var19 = 4;
									}

									if (var18 == 2) { // L: 9087
										var19 = 5;
									}

									if (var18 == 3) { // L: 9088
										var19 = 6;
									}

									if (var18 == 4) { // L: 9089
										var19 = 1001;
									}

									WorldMapManager.insertMenuItemNoShift(var17[var18], FileSystem.colorStartTag(65535) + var16.name, var19, var15, var11, var12); // L: 9090
								}
							}
						}

						WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(65535) + var16.name, 1002, var16.id, var11, var12); // L: 9095
					}
				}

				Player var20;
				int var24;
				NPC var25;
				int var32;
				int[] var33;
				if (var13 == 1) { // L: 9100
					NPC var28 = Client.npcs[var15]; // L: 9101
					if (var28 == null) { // L: 9102
						continue;
					}

					if (var28.definition.size == 1 && (var28.x & 127) == 64 && (var28.y & 127) == 64) { // L: 9103
						for (var24 = 0; var24 < Client.npcCount; ++var24) { // L: 9104
							var25 = Client.npcs[Client.npcIndices[var24]]; // L: 9105
							if (var25 != null && var25 != var28 && var25.definition.size == 1 && var25.x == var28.x && var25.y == var28.y) { // L: 9106
								GameBuild.addNpcToMenu(var25.definition, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count; // L: 9108
						var33 = Players.Players_indices; // L: 9109

						for (var32 = 0; var32 < var24; ++var32) { // L: 9110
							var20 = Client.players[var33[var32]]; // L: 9111
							if (var20 != null && var20.x == var28.x && var20.y == var28.y) { // L: 9112
								GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var20, var33[var32], var11, var12);
							}
						}
					}

					GameBuild.addNpcToMenu(var28.definition, var15, var11, var12); // L: 9115
				}

				if (var13 == 0) { // L: 9117
					Player var29 = Client.players[var15]; // L: 9118
					if (var29 == null) { // L: 9119
						continue;
					}

					if ((var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 9120
						for (var24 = 0; var24 < Client.npcCount; ++var24) { // L: 9121
							var25 = Client.npcs[Client.npcIndices[var24]]; // L: 9122
							if (var25 != null && var25.definition.size == 1 && var29.x == var25.x && var29.y == var25.y) { // L: 9123
								GameBuild.addNpcToMenu(var25.definition, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count; // L: 9125
						var33 = Players.Players_indices; // L: 9126

						for (var32 = 0; var32 < var24; ++var32) { // L: 9127
							var20 = Client.players[var33[var32]]; // L: 9128
							if (var20 != null && var29 != var20 && var20.x == var29.x && var20.y == var29.y) { // L: 9129
								GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var20, var33[var32], var11, var12);
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) { // L: 9132
						GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var29, var15, var11, var12);
					} else {
						var4 = var22; // L: 9133
					}
				}

				if (var13 == 3) { // L: 9135
					NodeDeque var31 = Client.groundItems[class90.Client_plane][var11][var12]; // L: 9136
					if (var31 != null) { // L: 9137
						for (TileItem var30 = (TileItem)var31.first(); var30 != null; var30 = (TileItem)var31.next()) { // L: 9138 9139 9172
							ItemComposition var34 = class281.ItemDefinition_get(var30.id); // L: 9140
							if (Client.isItemSelected == 1) { // L: 9141
								WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var34.name, 16, var30.id, var11, var12); // L: 9142
							} else if (Client.isSpellSelected) { // L: 9145
								if ((GrandExchangeOfferNameComparator.selectedSpellFlags & 1) == 1) { // L: 9146
									WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + FileSystem.colorStartTag(16748608) + var34.name, 17, var30.id, var11, var12); // L: 9147
								}
							} else {
								String[] var26 = var34.groundActions; // L: 9152

								for (int var27 = 4; var27 >= 0; --var27) { // L: 9153
									if (var26 != null && var26[var27] != null) { // L: 9154
										byte var21 = 0; // L: 9155
										if (var27 == 0) { // L: 9156
											var21 = 18;
										}

										if (var27 == 1) { // L: 9157
											var21 = 19;
										}

										if (var27 == 2) { // L: 9158
											var21 = 20;
										}

										if (var27 == 3) { // L: 9159
											var21 = 21;
										}

										if (var27 == 4) { // L: 9160
											var21 = 22;
										}

										WorldMapManager.insertMenuItemNoShift(var26[var27], FileSystem.colorStartTag(16748608) + var34.name, var21, var30.id, var11, var12); // L: 9161
									} else if (var27 == 2) { // L: 9164
										WorldMapManager.insertMenuItemNoShift("Take", FileSystem.colorStartTag(16748608) + var34.name, 20, var30.id, var11, var12); // L: 9165
									}
								}

								WorldMapManager.insertMenuItemNoShift("Examine", FileSystem.colorStartTag(16748608) + var34.name, 1004, var30.id, var11, var12); // L: 9169
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) { // L: 9177
			var8 = ReflectionCheck.method2451(var4); // L: 9178
			int var9 = GrandExchangeOfferNameComparator.Entity_unpackSceneX(var4); // L: 9179
			Player var10 = Client.players[Client.combatTargetPlayerIndex]; // L: 9180
			GrandExchangeOfferUnitPriceComparator.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9); // L: 9181
		}

	} // L: 9183
}