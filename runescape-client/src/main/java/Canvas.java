import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = 1846107143
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("v")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "1145652403"
	)
	public static File method393(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2; // L: 40
		class390.JagexCache_locationFile = new File(class22.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat"); // L: 41
		String var4 = null; // L: 42
		String var5 = null; // L: 43
		boolean var6 = false; // L: 44
		Buffer var8;
		File var23;
		if (class390.JagexCache_locationFile.exists()) { // L: 45
			try {
				AccessFile var7 = new AccessFile(class390.JagexCache_locationFile, "rw", 10000L); // L: 48

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) { // L: 49
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

				int var10 = 0; // L: 58
				if (var9 > 1) { // L: 59
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) { // L: 60
					var4 = var8.readStringCp1252NullCircumfixed(); // L: 61
					if (var10 == 1) { // L: 62
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8(); // L: 65
					if (var10 == 1) { // L: 66
						var5 = var8.readCESU8();
					}
				}

				var7.close(); // L: 68
			} catch (IOException var21) { // L: 70
				var21.printStackTrace(); // L: 71
			}

			if (var4 != null) { // L: 73
				var23 = new File(var4); // L: 74
				if (!var23.exists()) { // L: 75
					var4 = null; // L: 76
				}
			}

			if (var4 != null) { // L: 79
				var23 = new File(var4, "test.dat"); // L: 80
				if (!FaceNormal.isWriteable(var23, true)) { // L: 81
					var4 = null; // L: 82
				}
			}
		}

		if (var4 == null && var2 == 0) { // L: 86
			label141:
			for (int var15 = 0; var15 < PlayerType.cacheSubPaths.length; ++var15) { // L: 87
				for (int var16 = 0; var16 < InterfaceParent.cacheParentPaths.length; ++var16) { // L: 88
					File var17 = new File(InterfaceParent.cacheParentPaths[var16] + PlayerType.cacheSubPaths[var15] + File.separatorChar + var0 + File.separatorChar); // L: 89
					if (var17.exists() && FaceNormal.isWriteable(new File(var17, "test.dat"), true)) { // L: 90 91
						var4 = var17.toString(); // L: 92
						var6 = true; // L: 93
						break label141; // L: 94
					}
				}
			}
		}

		if (var4 == null) { // L: 100
			var4 = class22.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar; // L: 101
			var6 = true; // L: 102
		}

		File var22;
		if (var5 != null) { // L: 104
			var22 = new File(var5); // L: 105
			var23 = new File(var4); // L: 106

			try {
				File[] var24 = var22.listFiles(); // L: 108
				File[] var18 = var24; // L: 110

				for (int var11 = 0; var11 < var18.length; ++var11) { // L: 111
					File var12 = var18[var11]; // L: 112
					File var13 = new File(var23, var12.getName()); // L: 114
					boolean var14 = var12.renameTo(var13); // L: 115
					if (!var14) { // L: 116
						throw new IOException();
					}
				}
			} catch (Exception var20) { // L: 121
				var20.printStackTrace(); // L: 122
			}

			var6 = true; // L: 124
		}

		if (var6) { // L: 126
			var22 = new File(var4); // L: 127
			var8 = null; // L: 128

			try {
				AccessFile var25 = new AccessFile(class390.JagexCache_locationFile, "rw", 10000L); // L: 132
				Buffer var26 = new Buffer(500); // L: 133
				var26.writeByte(3); // L: 134
				var26.writeByte(var8 != null ? 1 : 0); // L: 135
				var26.writeCESU8(var22.getPath()); // L: 136
				if (var8 != null) { // L: 137
					var26.writeCESU8("");
				}

				var25.write(var26.array, 0, var26.offset); // L: 138
				var25.close(); // L: 139
			} catch (IOException var19) { // L: 141
				var19.printStackTrace(); // L: 142
			}
		}

		return new File(var4); // L: 146
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILjv;IIIZI)V",
		garbageValue = "1003938789"
	)
	public static void method395(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class232.musicPlayerStatus = 1; // L: 50
		ModelData0.musicTrackArchive = var1; // L: 51
		class32.musicTrackGroupId = var2; // L: 52
		class18.musicTrackFileId = var3; // L: 53
		class232.musicTrackVolume = var4; // L: 54
		class232.musicTrackBoolean = var5; // L: 55
		class232.pcmSampleLength = var0; // L: 56
	} // L: 57

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1869214638"
	)
	public static boolean method394(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 25
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-786826616"
	)
	static final void method391(int var0, int var1, boolean var2) {
		if (!var2 || var0 != GrandExchangeOfferOwnWorldComparator.field632 || UserComparator4.field1427 != var1) { // L: 5137
			GrandExchangeOfferOwnWorldComparator.field632 = var0; // L: 5140
			UserComparator4.field1427 = var1; // L: 5141
			class12.updateGameState(25); // L: 5142
			DirectByteArrayCopier.drawLoadingMessage("Loading - please wait.", true); // L: 5143
			int var3 = VertexNormal.baseX; // L: 5144
			int var4 = SoundSystem.baseY; // L: 5145
			VertexNormal.baseX = (var0 - 6) * 8; // L: 5146
			SoundSystem.baseY = (var1 - 6) * 8; // L: 5147
			int var5 = VertexNormal.baseX - var3; // L: 5148
			int var6 = SoundSystem.baseY - var4; // L: 5149
			var3 = VertexNormal.baseX; // L: 5150
			var4 = SoundSystem.baseY; // L: 5151

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5152
				NPC var19 = Client.npcs[var7]; // L: 5153
				if (var19 != null) { // L: 5154
					for (var9 = 0; var9 < 10; ++var9) { // L: 5155
						var10000 = var19.pathX; // L: 5156
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5157
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5159
					var19.y -= var6 * 128; // L: 5160
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5163
				Player var22 = Client.players[var7]; // L: 5164
				if (var22 != null) { // L: 5165
					for (var9 = 0; var9 < 10; ++var9) { // L: 5166
						var10000 = var22.pathX; // L: 5167
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5168
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5170
					var22.y -= var6 * 128; // L: 5171
				}
			}

			byte var20 = 0; // L: 5174
			byte var8 = 104; // L: 5175
			byte var21 = 1; // L: 5176
			if (var5 < 0) { // L: 5177
				var20 = 103; // L: 5178
				var8 = -1; // L: 5179
				var21 = -1; // L: 5180
			}

			byte var10 = 0; // L: 5182
			byte var11 = 104; // L: 5183
			byte var12 = 1; // L: 5184
			if (var6 < 0) { // L: 5185
				var10 = 103; // L: 5186
				var11 = -1; // L: 5187
				var12 = -1; // L: 5188
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5190
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5191
					int var15 = var13 + var5; // L: 5192
					int var16 = var6 + var14; // L: 5193

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5194
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5195
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5196
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5200 5201 5205
				var18.x -= var5; // L: 5202
				var18.y -= var6; // L: 5203
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5204
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5207
				Client.destinationX -= var5; // L: 5208
				Client.destinationY -= var6; // L: 5209
			}

			Client.soundEffectCount = 0; // L: 5211
			Client.isCameraLocked = false; // L: 5212
			MouseHandler.cameraX -= var5 << 7; // L: 5213
			class105.cameraZ -= var6 << 7; // L: 5214
			RouteStrategy.oculusOrbFocalPointX -= var5 << 7; // L: 5215
			ModelData0.oculusOrbFocalPointY -= var6 << 7; // L: 5216
			Client.field872 = -1; // L: 5217
			Client.graphicsObjects.clear(); // L: 5218
			Client.projectiles.clear(); // L: 5219

			for (var14 = 0; var14 < 4; ++var14) { // L: 5220
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5138 5221

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "([Lio;II)V",
		garbageValue = "1454811445"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10836
			Widget var3 = var0[var2]; // L: 10837
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !HitSplatDefinition.isComponentHidden(var3))) { // L: 10838 10839 10840
				int var5;
				if (var3.type == 0) { // L: 10841
					if (!var3.isIf3 && HitSplatDefinition.isComponentHidden(var3) && var3 != World.mousedOverWidgetIf1) { // L: 10842
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 10843
					if (var3.children != null) { // L: 10844
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10845
					if (var4 != null) { // L: 10846
						var5 = var4.group; // L: 10847
						if (Clock.loadInterface(var5)) { // L: 10849
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1); // L: 10850
						}
					}
				}

				if (var3.type == 6) { // L: 10854
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 10855
						boolean var7 = InvDefinition.runCs1(var3); // L: 10856
						if (var7) { // L: 10858
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 10859
						}

						if (var5 != -1) { // L: 10860
							SequenceDefinition var6 = LoginScreenAnimation.SequenceDefinition_get(var5); // L: 10861

							for (var3.modelFrameCycle += Client.field913; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; WorldMapCacheName.invalidateWidget(var3)) { // L: 10862 10863 10870
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 10864
								++var3.modelFrame; // L: 10865
								if (var3.modelFrame >= var6.frameIds.length) { // L: 10866
									var3.modelFrame -= var6.frameCount; // L: 10867
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 10868
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3014 != 0 && !var3.isIf3) { // L: 10874
						int var8 = var3.field3014 >> 16; // L: 10875
						var5 = var3.field3014 << 16 >> 16; // L: 10876
						var8 *= Client.field913; // L: 10877
						var5 *= Client.field913; // L: 10878
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 10879
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 10880
						WorldMapCacheName.invalidateWidget(var3); // L: 10881
					}
				}
			}
		}

	} // L: 10885
}
