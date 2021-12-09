import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("t")
public final class class4 {
	@ObfuscatedName("hg")
	@ObfuscatedGetter(
		intValue = -1796979241
	)
	static int field9;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;IIB)Lpa;",
		garbageValue = "96"
	)
	static IndexedSprite method22(AbstractArchive var0, int var1, int var2) {
		if (!class147.method3009(var0, var1, var2)) { // L: 23
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite(); // L: 26
			var4.width = class432.SpriteBuffer_spriteWidth; // L: 27
			var4.height = class432.SpriteBuffer_spriteHeight; // L: 28
			var4.xOffset = class141.SpriteBuffer_xOffsets[0]; // L: 29
			var4.yOffset = RouteStrategy.SpriteBuffer_yOffsets[0]; // L: 30
			var4.subWidth = class432.SpriteBuffer_spriteWidths[0]; // L: 31
			var4.subHeight = class330.SpriteBuffer_spriteHeights[0]; // L: 32
			var4.palette = class432.SpriteBuffer_spritePalette; // L: 33
			var4.pixels = class369.SpriteBuffer_pixels[0]; // L: 34
			UserComparator3.method2529(); // L: 35
			return var4; // L: 38
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1111873068"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 212
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 213
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 214
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 215
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE; // L: 216
		} else if (var0.equals("F")) { // L: 217
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 218
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 219
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 220 221
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1064743606"
	)
	static int method20(int var0, Script var1, boolean var2) {
		Widget var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1264
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1265
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.x; // L: 1266
			return 1; // L: 1267
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1269
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.y; // L: 1270
			return 1; // L: 1271
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1273
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.width; // L: 1274
			return 1; // L: 1275
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1277
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.height; // L: 1278
			return 1; // L: 1279
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1281
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1282
			return 1; // L: 1283
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1285
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.parentId; // L: 1286
			return 1; // L: 1287
		} else {
			return 2; // L: 1289
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Leb;III)Lar;",
		garbageValue = "863629415"
	)
	public static final PcmPlayer method29(TaskHandler var0, int var1, int var2) {
		if (class339.field4058 == 0) { // L: 49
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 50
			if (var2 < 256) { // L: 51
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class11.pcmPlayerProvider.player(); // L: 53
				var3.samples = new int[256 * (SpriteMask.PcmPlayer_stereo ? 2 : 1)]; // L: 54
				var3.field298 = var2; // L: 55
				var3.init(); // L: 56
				var3.capacity = (var2 & -1024) + 1024; // L: 57
				if (var3.capacity > 16384) { // L: 58
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 59
				if (UserComparator10.field1339 > 0 && PcmPlayer.soundSystem == null) { // L: 60
					PcmPlayer.soundSystem = new SoundSystem(); // L: 61
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 62
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 63
				}

				if (PcmPlayer.soundSystem != null) { // L: 65
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 66
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 67
				}

				return var3; // L: 69
			} catch (Throwable var4) { // L: 71
				return new PcmPlayer(); // L: 72
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-2142198504"
	)
	static int method27(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) { // L: 4337
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) { // L: 4341
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) { // L: 4345
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) { // L: 4349
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) { // L: 4353
							if (var0 != 7031 && var0 != 7032) { // L: 4357
								if (var0 == 7033) { // L: 4362
									--class13.Interpreter_stringStackSize; // L: 4363
									return 1; // L: 4364
								} else if (var0 != 7036 && var0 != 7037) { // L: 4366
									if (var0 == 7038) { // L: 4370
										--IsaacCipher.Interpreter_intStackSize; // L: 4371
										return 1; // L: 4372
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) { // L: 4374
										return 2; // L: 4378
									} else {
										--IsaacCipher.Interpreter_intStackSize; // L: 4375
										return 1; // L: 4376
									}
								} else {
									IsaacCipher.Interpreter_intStackSize -= 2; // L: 4367
									return 1; // L: 4368
								}
							} else {
								--class13.Interpreter_stringStackSize; // L: 4358
								--IsaacCipher.Interpreter_intStackSize; // L: 4359
								return 1; // L: 4360
							}
						} else {
							--IsaacCipher.Interpreter_intStackSize; // L: 4354
							return 1; // L: 4355
						}
					} else {
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 4350
						return 1; // L: 4351
					}
				} else {
					IsaacCipher.Interpreter_intStackSize -= 2; // L: 4346
					return 1; // L: 4347
				}
			} else {
				IsaacCipher.Interpreter_intStackSize -= 3; // L: 4342
				return 1; // L: 4343
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 5; // L: 4338
			return 1; // L: 4339
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcg;B)V",
		garbageValue = "-85"
	)
	static final void method26(PendingSpawn var0) {
		long var1 = 0L; // L: 7958
		int var3 = -1; // L: 7959
		int var4 = 0; // L: 7960
		int var5 = 0; // L: 7961
		if (var0.type == 0) { // L: 7962
			var1 = class7.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7963
			var1 = class7.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7964
			var1 = class7.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class7.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 7965
		}

		if (0L != var1) { // L: 7966
			int var6 = class7.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7967
			var3 = PacketWriter.Entity_unpackID(var1); // L: 7968
			var4 = var6 & 31; // L: 7969
			var5 = var6 >> 6 & 3; // L: 7970
		}

		var0.objectId = var3; // L: 7972
		var0.field1080 = var4; // L: 7973
		var0.field1087 = var5; // L: 7974
	} // L: 7975

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "955034020"
	)
	static final void method25() {
		int var0 = ModeWhere.menuX; // L: 8818
		int var1 = BufferedSink.menuY; // L: 8819
		int var2 = GameObject.menuWidth; // L: 8820
		int var3 = UserComparator3.menuHeight; // L: 8821
		int var4 = 6116423; // L: 8822
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 8823
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 8824
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 8825
		class136.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 8826
		int var5 = MouseHandler.MouseHandler_x; // L: 8827
		int var6 = MouseHandler.MouseHandler_y; // L: 8828

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 8829
			var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31; // L: 8830
			var9 = 16777215; // L: 8831
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 8832
				var9 = 16776960;
			}

			Font var12 = class136.fontBold12; // L: 8833
			String var13;
			if (var7 < 0) { // L: 8836
				var13 = ""; // L: 8837
			} else if (Client.menuTargets[var7].length() > 0) { // L: 8840
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7]; // L: 8841
			}

			var12.draw(var13, var0 + 3, var8, var9, 0); // L: 8843
		}

		var7 = ModeWhere.menuX; // L: 8845
		var8 = BufferedSink.menuY; // L: 8846
		var9 = GameObject.menuWidth; // L: 8847
		int var10 = UserComparator3.menuHeight; // L: 8848

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) { // L: 8850
			if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) { // L: 8851
				Client.field686[var11] = true;
			}
		}

	} // L: 8854

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-5742457"
	)
	static final void method28() {
		PacketBufferNode var0 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher); // L: 12251
		Client.packetWriter.addNode(var0); // L: 12252
		Interpreter.field816 = true; // L: 12253

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12254
			if (var1.type == 0 || var1.type == 3) { // L: 12255
				class10.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12257
			SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget); // L: 12258
			Client.meslayerContinueWidget = null; // L: 12259
		}

		Interpreter.field816 = false; // L: 12261
	} // L: 12262
}
