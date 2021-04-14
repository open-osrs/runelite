import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("j")
public abstract class class14 extends Node {
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;

	class14() {
	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	abstract void vmethod371(Buffer var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	abstract void vmethod376(class11 var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1423124086"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < 1000) { // L: 76
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 77
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < 250) { // L: 80
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 81
		} else if (var0.length == 30000 && ByteArrayPool.ByteArrayPool_largeCount < 50) { // L: 84
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 85
		} else {
			if (ScriptFrame.ByteArrayPool_arrays != null) { // L: 88
				for (int var1 = 0; var1 < UserComparator3.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 89
					if (var0.length == UserComparator3.ByteArrayPool_alternativeSizes[var1] && class221.ByteArrayPool_altSizeArrayCounts[var1] < ScriptFrame.ByteArrayPool_arrays[var1].length) { // L: 90
						ScriptFrame.ByteArrayPool_arrays[var1][class221.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 91
						return; // L: 92
					}
				}
			}

		}
	} // L: 78 82 86 96

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(Lhu;III)V",
		garbageValue = "-326398113"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 3110
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !MouseHandler.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 3111
				SpriteMask var3 = var0.getSpriteMask(true); // L: 3112
				if (var3 == null) { // L: 3113
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 3114
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 3115
				if (var3.contains(var4, var5)) { // L: 3116
					var4 -= var3.width / 2; // L: 3117
					var5 -= var3.height / 2; // L: 3118
					int var6 = Client.camAngleY & 2047; // L: 3119
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 3120
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 3121
					int var9 = var4 * var8 + var7 * var5 >> 11; // L: 3122
					int var10 = var5 * var8 - var4 * var7 >> 11; // L: 3123
					int var11 = var9 + Varcs.localPlayer.x >> 7; // L: 3124
					int var12 = Varcs.localPlayer.y - var10 >> 7; // L: 3125
					PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field2220, Client.packetWriter.isaacCipher); // L: 3127
					var13.packetBuffer.writeByte(18); // L: 3128
					var13.packetBuffer.method6771(var12 + Tile.baseY); // L: 3129
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3130
					var13.packetBuffer.writeIntME(var11 + ItemLayer.baseX); // L: 3131
					var13.packetBuffer.writeByte(var4); // L: 3132
					var13.packetBuffer.writeByte(var5); // L: 3133
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 3134
					var13.packetBuffer.writeByte(57); // L: 3135
					var13.packetBuffer.writeByte(0); // L: 3136
					var13.packetBuffer.writeByte(0); // L: 3137
					var13.packetBuffer.writeByte(89); // L: 3138
					var13.packetBuffer.writeShort(Varcs.localPlayer.x); // L: 3139
					var13.packetBuffer.writeShort(Varcs.localPlayer.y); // L: 3140
					var13.packetBuffer.writeByte(63); // L: 3141
					Client.packetWriter.addNode(var13); // L: 3142
					Client.destinationX = var11; // L: 3143
					Client.destinationY = var12; // L: 3144
				}
			}

		}
	} // L: 3147

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "8"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 4608
			int var3 = UserComparator7.getTileHeight(var0, var1, class26.Client_plane) - var2; // L: 4613
			var0 -= ModeWhere.cameraX; // L: 4614
			var3 -= WorldMapRectangle.cameraY; // L: 4615
			var1 -= ReflectionCheck.cameraZ; // L: 4616
			int var4 = Rasterizer3D.Rasterizer3D_sine[WorldMapArea.cameraPitch]; // L: 4617
			int var5 = Rasterizer3D.Rasterizer3D_cosine[WorldMapArea.cameraPitch]; // L: 4618
			int var6 = Rasterizer3D.Rasterizer3D_sine[class69.cameraYaw]; // L: 4619
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class69.cameraYaw]; // L: 4620
			int var8 = var0 * var7 + var6 * var1 >> 16; // L: 4621
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 4622
			var0 = var8; // L: 4623
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 4624
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 4625
			if (var1 >= 50) { // L: 4627
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 4628
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 4629
			} else {
				Client.viewportTempX = -1; // L: 4632
				Client.viewportTempY = -1; // L: 4633
			}

		} else {
			Client.viewportTempX = -1; // L: 4609
			Client.viewportTempY = -1; // L: 4610
		}
	} // L: 4611 4635

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "62"
	)
	@Export("createMinimapSprite")
	static final void createMinimapSprite(int var0) {
		int[] var1 = class19.sceneMinimapSprite.pixels; // L: 5146
		int var2 = var1.length; // L: 5147

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5148
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5149
			var4 = (103 - var3) * 2048 + 24628; // L: 5150

			for (var5 = 1; var5 < 103; ++var5) { // L: 5151
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5152
					WorldMapArea.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5153
					WorldMapArea.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5154
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5157
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5158
		class19.sceneMinimapSprite.setRaster(); // L: 5159

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5160
			for (var6 = 1; var6 < 103; ++var6) { // L: 5161
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5162
					AbstractRasterProvider.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5163
					AbstractRasterProvider.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5166

		for (var5 = 0; var5 < 104; ++var5) { // L: 5167
			for (var6 = 0; var6 < 104; ++var6) { // L: 5168
				long var7 = WorldMapArea.scene.getFloorDecorationTag(class26.Client_plane, var5, var6); // L: 5169
				if (var7 != 0L) { // L: 5170
					int var9 = WorldMapSection1.Entity_unpackID(var7); // L: 5171
					int var10 = class19.getObjectDefinition(var9).mapIconId; // L: 5172
					if (var10 >= 0 && ByteArrayPool.WorldMapElement_get(var10).field3412) { // L: 5173 5174
						Client.mapIcons[Client.mapIconCount] = ByteArrayPool.WorldMapElement_get(var10).getSpriteBool(false); // L: 5177
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5178
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5179
						++Client.mapIconCount; // L: 5180
					}
				}
			}
		}

		GameEngine.rasterProvider.apply(); // L: 5185
	} // L: 5186
}
