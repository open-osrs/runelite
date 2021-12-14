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
		if (!class147.method3009(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = class432.SpriteBuffer_spriteWidth;
			var4.height = class432.SpriteBuffer_spriteHeight;
			var4.xOffset = class141.SpriteBuffer_xOffsets[0];
			var4.yOffset = RouteStrategy.SpriteBuffer_yOffsets[0];
			var4.subWidth = class432.SpriteBuffer_spriteWidths[0];
			var4.subHeight = class330.SpriteBuffer_spriteHeights[0];
			var4.palette = class432.SpriteBuffer_spritePalette;
			var4.pixels = class369.SpriteBuffer_pixels[0];
			UserComparator3.method2529();
			return var4;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1111873068"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "1064743606"
	)
	static int method20(int var0, Script var1, boolean var2) {
		Widget var3 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Leb;III)Lar;",
		garbageValue = "863629415"
	)
	public static final PcmPlayer method29(TaskHandler var0, int var1, int var2) {
		if (class339.field4058 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class11.pcmPlayerProvider.player();
				var3.samples = new int[256 * (SpriteMask.PcmPlayer_stereo ? 2 : 1)];
				var3.field298 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (UserComparator10.field1339 > 0 && PcmPlayer.soundSystem == null) {
					PcmPlayer.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (PcmPlayer.soundSystem != null) {
					if (PcmPlayer.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
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
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--class13.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--IsaacCipher.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--IsaacCipher.Interpreter_intStackSize;
										return 1;
									}
								} else {
									IsaacCipher.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--class13.Interpreter_stringStackSize;
								--IsaacCipher.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--IsaacCipher.Interpreter_intStackSize;
							return 1;
						}
					} else {
						IsaacCipher.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					IsaacCipher.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				IsaacCipher.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			IsaacCipher.Interpreter_intStackSize -= 5;
			return 1;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lcg;B)V",
		garbageValue = "-85"
	)
	static final void method26(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class7.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class7.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class7.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class7.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = class7.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = PacketWriter.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1080 = var4;
		var0.field1087 = var5;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "955034020"
	)
	static final void method25() {
		int var0 = ModeWhere.menuX;
		int var1 = BufferedSink.menuY;
		int var2 = GameObject.menuWidth;
		int var3 = UserComparator3.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		class136.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;

		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			var8 = (Client.menuOptionsCount - 1 - var7) * 15 + var1 + 31;
			var9 = 16777215;
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}

			Font var12 = class136.fontBold12;
			String var13;
			if (var7 < 0) {
				var13 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7];
			}

			var12.draw(var13, var0 + 3, var8, var9, 0);
		}

		var7 = ModeWhere.menuX;
		var8 = BufferedSink.menuY;
		var9 = GameObject.menuWidth;
		int var10 = UserComparator3.menuHeight;

		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
			if (Client.rootWidgetXs[var11] + Client.rootWidgetWidths[var11] > var7 && Client.rootWidgetXs[var11] < var9 + var7 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
				Client.field686[var11] = true;
			}
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "985561327"
	)
	static final void method28() {
		PacketBufferNode var0 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2898, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field816 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class10.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field816 = false;
	}
}
