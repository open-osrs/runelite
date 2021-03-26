import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -1513110219
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 318238525
	)
	@Export("menuX")
	static int menuX;

	ApproximateRouteStrategy() {
	} // L: 11728

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIILfe;I)Z",
		garbageValue = "1148121553"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 11731
	}

	@ObfuscatedName("n")
	@Export("sleepExact")
	public static final void sleepExact(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lci;",
		garbageValue = "-915685508"
	)
	static AttackOption[] method1310() {
		return new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_leftClickWhereAvailable, AttackOption.AttackOption_dependsOnCombatLevels}; // L: 11682
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "-1904582422"
	)
	public static IndexedSprite method1304() {
		IndexedSprite var0 = new IndexedSprite(); // L: 151
		var0.width = class336.SpriteBuffer_spriteWidth; // L: 152
		var0.height = class336.SpriteBuffer_spriteHeight; // L: 153
		var0.xOffset = class105.SpriteBuffer_xOffsets[0]; // L: 154
		var0.yOffset = class336.SpriteBuffer_yOffsets[0]; // L: 155
		var0.subWidth = class336.SpriteBuffer_spriteWidths[0]; // L: 156
		var0.subHeight = class225.SpriteBuffer_spriteHeights[0]; // L: 157
		var0.palette = HorizontalAlignment.SpriteBuffer_spritePalette; // L: 158
		var0.pixels = class2.SpriteBuffer_pixels[0]; // L: 159
		class105.SpriteBuffer_xOffsets = null; // L: 161
		class336.SpriteBuffer_yOffsets = null; // L: 162
		class336.SpriteBuffer_spriteWidths = null; // L: 163
		class225.SpriteBuffer_spriteHeights = null; // L: 164
		HorizontalAlignment.SpriteBuffer_spritePalette = null; // L: 165
		class2.SpriteBuffer_pixels = null; // L: 166
		return var0; // L: 168
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "-109"
	)
	static int method1313(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) { // L: 1737
			Interpreter.Interpreter_intStackSize -= 3; // L: 1738
			class58.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]); // L: 1739
			return 1; // L: 1740
		} else if (var0 == ScriptOpcodes.SOUND_SONG) { // L: 1742
			AbstractSocket.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1743
			return 1; // L: 1744
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) { // L: 1746
			Interpreter.Interpreter_intStackSize -= 2; // L: 1747
			NPC.method2180(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 1748
			return 1; // L: 1749
		} else {
			int var3;
			if (var0 == 3203) { // L: 1751
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100); // L: 1752
				class194.method3820(Math.round(2.55F * (float)var3)); // L: 1753
				return 1; // L: 1754
			} else if (var0 == 3204) { // L: 1756
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.round((float)WorldMapSectionType.clientPreferences.musicVolume / 2.55F); // L: 1757
				return 1; // L: 1758
			} else if (var0 == 3205) { // L: 1760
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100); // L: 1761
				class171.updateSoundEffectVolume(Math.round(1.27F * (float)var3)); // L: 1762
				return 1; // L: 1763
			} else if (var0 == 3206) { // L: 1765
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.round((float)WorldMapSectionType.clientPreferences.soundEffectsVolume / 1.27F); // L: 1766
				return 1; // L: 1767
			} else if (var0 == 3207) { // L: 1769
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100); // L: 1770
				WorldMapData_1.method810(Math.round((float)var3 * 1.27F)); // L: 1771
				return 1; // L: 1772
			} else if (var0 == 3208) { // L: 1774
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.round((float)WorldMapSectionType.clientPreferences.areaSoundEffectsVolume / 1.27F); // L: 1775
				return 1; // L: 1776
			} else {
				return 2; // L: 1778
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "-107"
	)
	static int method1315(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3281
			Interpreter.Interpreter_intStackSize -= 2; // L: 3282
			Client.field779 = (short)Canvas.method935(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 3283
			if (Client.field779 <= 0) { // L: 3284
				Client.field779 = 256;
			}

			Client.field913 = (short)Canvas.method935(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 3285
			if (Client.field913 <= 0) { // L: 3286
				Client.field913 = 256;
			}

			return 1; // L: 3287
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3289
			Interpreter.Interpreter_intStackSize -= 2; // L: 3290
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3291
			if (Client.zoomHeight <= 0) { // L: 3292
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3293
			if (Client.zoomWidth <= 0) { // L: 3294
				Client.zoomWidth = 320;
			}

			return 1; // L: 3295
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3297
			Interpreter.Interpreter_intStackSize -= 4; // L: 3298
			Client.field916 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3299
			if (Client.field916 <= 0) { // L: 3300
				Client.field916 = 1;
			}

			Client.field690 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3301
			if (Client.field690 <= 0) { // L: 3302
				Client.field690 = 32767;
			} else if (Client.field690 < Client.field916) { // L: 3303
				Client.field690 = Client.field916;
			}

			Client.field918 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 3304
			if (Client.field918 <= 0) { // L: 3305
				Client.field918 = 1;
			}

			Client.field846 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 3306
			if (Client.field846 <= 0) { // L: 3307
				Client.field846 = 32767;
			} else if (Client.field846 < Client.field918) { // L: 3308
				Client.field846 = Client.field918;
			}

			return 1; // L: 3309
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3311
			if (Client.viewportWidget != null) { // L: 3312
				MenuAction.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3313
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3314
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3315
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3318
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 3319
			}

			return 1; // L: 3321
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3323
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3324
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3325
			return 1; // L: 3326
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3328
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.method3709(Client.field779); // L: 3329
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FileSystem.method3709(Client.field913); // L: 3330
			return 1; // L: 3331
		} else if (var0 == 6220) { // L: 3333
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3334
			return 1; // L: 3335
		} else if (var0 == 6221) { // L: 3337
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3338
			return 1; // L: 3339
		} else if (var0 == 6222) { // L: 3341
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth; // L: 3342
			return 1; // L: 3343
		} else if (var0 == 6223) { // L: 3345
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class25.canvasHeight; // L: 3346
			return 1; // L: 3347
		} else {
			return 2; // L: 3349
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1969316699"
	)
	public static int method1314(String var0) {
		return var0.length() + 2; // L: 130
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;B)V",
		garbageValue = "45"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = ArchiveLoader.getWidgetChild(var1, var2); // L: 8898
		if (var5 != null) { // L: 8899
			if (var5.onOp != null) { // L: 8900
				ScriptEvent var6 = new ScriptEvent(); // L: 8901
				var6.widget = var5; // L: 8902
				var6.opIndex = var0; // L: 8903
				var6.targetName = var4; // L: 8904
				var6.args = var5.onOp; // L: 8905
				PacketWriter.runScriptEvent(var6); // L: 8906
			}

			boolean var8 = true; // L: 8908
			if (var5.contentType > 0) { // L: 8909
				var8 = WorldMapLabelSize.method254(var5);
			}

			if (var8) { // L: 8910
				if (MidiPcmStream.method3972(class60.getWidgetFlags(var5), var0 - 1)) { // L: 8911
					PacketBufferNode var7;
					if (var0 == 1) { // L: 8914
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2320, Client.packetWriter.isaacCipher); // L: 8916
						var7.packetBuffer.writeInt(var1); // L: 8917
						var7.packetBuffer.writeShort(var2); // L: 8918
						var7.packetBuffer.writeShort(var3); // L: 8919
						Client.packetWriter.addNode(var7); // L: 8920
					}

					if (var0 == 2) { // L: 8922
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher); // L: 8924
						var7.packetBuffer.writeInt(var1); // L: 8925
						var7.packetBuffer.writeShort(var2); // L: 8926
						var7.packetBuffer.writeShort(var3); // L: 8927
						Client.packetWriter.addNode(var7); // L: 8928
					}

					if (var0 == 3) { // L: 8930
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2326, Client.packetWriter.isaacCipher); // L: 8932
						var7.packetBuffer.writeInt(var1); // L: 8933
						var7.packetBuffer.writeShort(var2); // L: 8934
						var7.packetBuffer.writeShort(var3); // L: 8935
						Client.packetWriter.addNode(var7); // L: 8936
					}

					if (var0 == 4) { // L: 8938
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2248, Client.packetWriter.isaacCipher); // L: 8940
						var7.packetBuffer.writeInt(var1); // L: 8941
						var7.packetBuffer.writeShort(var2); // L: 8942
						var7.packetBuffer.writeShort(var3); // L: 8943
						Client.packetWriter.addNode(var7); // L: 8944
					}

					if (var0 == 5) { // L: 8946
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2254, Client.packetWriter.isaacCipher); // L: 8948
						var7.packetBuffer.writeInt(var1); // L: 8949
						var7.packetBuffer.writeShort(var2); // L: 8950
						var7.packetBuffer.writeShort(var3); // L: 8951
						Client.packetWriter.addNode(var7); // L: 8952
					}

					if (var0 == 6) { // L: 8954
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2280, Client.packetWriter.isaacCipher); // L: 8956
						var7.packetBuffer.writeInt(var1); // L: 8957
						var7.packetBuffer.writeShort(var2); // L: 8958
						var7.packetBuffer.writeShort(var3); // L: 8959
						Client.packetWriter.addNode(var7); // L: 8960
					}

					if (var0 == 7) { // L: 8962
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2258, Client.packetWriter.isaacCipher); // L: 8964
						var7.packetBuffer.writeInt(var1); // L: 8965
						var7.packetBuffer.writeShort(var2); // L: 8966
						var7.packetBuffer.writeShort(var3); // L: 8967
						Client.packetWriter.addNode(var7); // L: 8968
					}

					if (var0 == 8) { // L: 8970
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2328, Client.packetWriter.isaacCipher); // L: 8972
						var7.packetBuffer.writeInt(var1); // L: 8973
						var7.packetBuffer.writeShort(var2); // L: 8974
						var7.packetBuffer.writeShort(var3); // L: 8975
						Client.packetWriter.addNode(var7); // L: 8976
					}

					if (var0 == 9) { // L: 8978
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2253, Client.packetWriter.isaacCipher); // L: 8980
						var7.packetBuffer.writeInt(var1); // L: 8981
						var7.packetBuffer.writeShort(var2); // L: 8982
						var7.packetBuffer.writeShort(var3); // L: 8983
						Client.packetWriter.addNode(var7); // L: 8984
					}

					if (var0 == 10) { // L: 8986
						var7 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2300, Client.packetWriter.isaacCipher); // L: 8988
						var7.packetBuffer.writeInt(var1); // L: 8989
						var7.packetBuffer.writeShort(var2); // L: 8990
						var7.packetBuffer.writeShort(var3); // L: 8991
						Client.packetWriter.addNode(var7); // L: 8992
					}

				}
			}
		}
	} // L: 8912 8994

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "([Lhz;II)V",
		garbageValue = "-1753877400"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11032
			Widget var3 = var0[var2]; // L: 11033
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !DevicePcmPlayerProvider.isComponentHidden(var3))) { // L: 11034 11035 11036
				int var5;
				if (var3.type == 0) { // L: 11037
					if (!var3.isIf3 && DevicePcmPlayerProvider.isComponentHidden(var3) && var3 != Canvas.mousedOverWidgetIf1) { // L: 11038
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 11039
					if (var3.children != null) { // L: 11040
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11041
					if (var4 != null) { // L: 11042
						var5 = var4.group; // L: 11043
						if (WorldMapCacheName.loadInterface(var5)) { // L: 11045
							drawModelComponents(DefaultsGroup.Widget_interfaceComponents[var5], -1); // L: 11046
						}
					}
				}

				if (var3.type == 6) { // L: 11050
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 11051
						boolean var7 = GrandExchangeOfferWorldComparator.runCs1(var3); // L: 11052
						if (var7) { // L: 11054
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 11055
						}

						if (var5 != -1) { // L: 11056
							SequenceDefinition var6 = InterfaceParent.SequenceDefinition_get(var5); // L: 11057

							for (var3.modelFrameCycle += Client.field808; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; IsaacCipher.invalidateWidget(var3)) { // L: 11058 11059 11066
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 11060
								++var3.modelFrame; // L: 11061
								if (var3.modelFrame >= var6.frameIds.length) { // L: 11062
									var3.modelFrame -= var6.frameCount; // L: 11063
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 11064
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2649 != 0 && !var3.isIf3) { // L: 11070
						int var8 = var3.field2649 >> 16; // L: 11071
						var5 = var3.field2649 << 16 >> 16; // L: 11072
						var8 *= Client.field808; // L: 11073
						var5 *= Client.field808; // L: 11074
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 11075
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 11076
						IsaacCipher.invalidateWidget(var3); // L: 11077
					}
				}
			}
		}

	} // L: 11081
}