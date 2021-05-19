import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("KeyHandler")
public final class KeyHandler implements KeyListener, FocusListener {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("KeyHandler_instance")
	static KeyHandler KeyHandler_instance;
	@ObfuscatedName("cf")
	@Export("KeyHandler_pressedKeys")
	public static boolean[] KeyHandler_pressedKeys;
	@ObfuscatedName("cd")
	static int[] field270;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1180346521
	)
	static int field273;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 244620517
	)
	static int field260;
	@ObfuscatedName("cz")
	static char[] field255;
	@ObfuscatedName("cl")
	static int[] field274;
	@ObfuscatedName("cp")
	public static int[] field275;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 189017369
	)
	public static int field276;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1087799347
	)
	static int field277;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 741110317
	)
	static int field278;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 477685323
	)
	static int field279;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -1222037043
	)
	@Export("KeyHandler_idleCycles")
	public static volatile int KeyHandler_idleCycles;
	@ObfuscatedName("cb")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("archive11")
	static Archive archive11;

	static {
		KeyHandler_instance = new KeyHandler(); // L: 13
		KeyHandler_pressedKeys = new boolean[112]; // L: 100
		field270 = new int[128];
		field273 = 0;
		field260 = 0; // L: 105
		field255 = new char[128]; // L: 106
		field274 = new int[128];
		field275 = new int[128];
		field276 = 0; // L: 109
		field277 = 0; // L: 110
		field278 = 0; // L: 111
		field279 = 0; // L: 112
		KeyHandler_idleCycles = 0; // L: 113
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // L: 114
	}

	KeyHandler() {
	} // L: 116

	public final synchronized void keyPressed(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 201
			int var2 = var1.getKeyCode(); // L: 202
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 203
				var2 = KeyHandler_keyCodes[var2]; // L: 204
				if ((var2 & 128) != 0) { // L: 205
					var2 = -1;
				}
			} else {
				var2 = -1; // L: 207
			}

			if (field260 >= 0 && var2 >= 0) { // L: 208
				field270[field260] = var2; // L: 209
				field260 = field260 + 1 & 127; // L: 210
				if (field260 == field273) { // L: 211
					field260 = -1;
				}
			}

			int var3;
			if (var2 >= 0) { // L: 213
				var3 = field278 + 1 & 127; // L: 214
				if (var3 != field277) { // L: 215
					field274[field278] = var2; // L: 216
					field255[field278] = 0; // L: 217
					field278 = var3; // L: 218
				}
			}

			var3 = var1.getModifiers(); // L: 221
			if ((var3 & 10) != 0 || var2 == 85 || var2 == 10) { // L: 222
				var1.consume(); // L: 223
			}
		}

	} // L: 226

	public final void keyTyped(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 243
			char var2 = var1.getKeyChar(); // L: 244
			if (var2 != 0 && var2 != '\uffff') { // L: 245
				boolean var3;
				if ((var2 <= 0 || var2 >= 128) && (var2 < 160 || var2 > 255)) { // L: 248
					label53: {
						if (var2 != 0) { // L: 252
							char[] var4 = class301.cp1252AsciiExtension; // L: 254

							for (int var5 = 0; var5 < var4.length; ++var5) { // L: 255
								char var6 = var4[var5]; // L: 256
								if (var6 == var2) { // L: 258
									var3 = true; // L: 259
									break label53; // L: 260
								}
							}
						}

						var3 = false; // L: 266
					}
				} else {
					var3 = true; // L: 249
				}

				if (var3) { // L: 268
					int var7 = field278 + 1 & 127; // L: 269
					if (var7 != field277) { // L: 270
						field274[field278] = -1; // L: 271
						field255[field278] = var2; // L: 272
						field278 = var7; // L: 273
					}
				}
			}
		}

		var1.consume(); // L: 278
	} // L: 279

	public final void focusGained(FocusEvent var1) {
	} // L: 281

	public final synchronized void focusLost(FocusEvent var1) {
		if (KeyHandler_instance != null) { // L: 284
			field260 = -1; // L: 285
		}

	} // L: 287

	public final synchronized void keyReleased(KeyEvent var1) {
		if (KeyHandler_instance != null) { // L: 229
			int var2 = var1.getKeyCode(); // L: 230
			if (var2 >= 0 && var2 < KeyHandler_keyCodes.length) { // L: 231
				var2 = KeyHandler_keyCodes[var2] & -129;
			} else {
				var2 = -1; // L: 232
			}

			if (field260 >= 0 && var2 >= 0) { // L: 233
				field270[field260] = ~var2; // L: 234
				field260 = field260 + 1 & 127; // L: 235
				if (field260 == field273) { // L: 236
					field260 = -1;
				}
			}
		}

		var1.consume(); // L: 239
	} // L: 240

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)V",
		garbageValue = "-1477820122"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class35.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1; // L: 40
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - JagexCache.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - Messages.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		ParamComposition.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1346[var1] != null) { // L: 50
			var2.read(Players.field1346[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1344[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1344[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-692879798"
	)
	static int method453(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 95

		try {
			var0 = Buddy.getPreferencesFile("", NetSocket.field1492.name, true); // L: 97
			Buffer var1 = class12.clientPreferences.toBuffer(); // L: 98
			var0.write(var1.array, 0, var1.offset); // L: 99
		} catch (Exception var3) { // L: 101
		}

		try {
			if (var0 != null) { // L: 103
				var0.closeSync(true); // L: 104
			}
		} catch (Exception var2) { // L: 107
		}

	} // L: 108

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1908910529"
	)
	public static void method451(boolean var0) {
		if (var0 != BufferedNetSocket.ItemDefinition_inMembersWorld) { // L: 541
			ItemComposition.ItemDefinition_cached.clear(); // L: 543
			ItemComposition.ItemDefinition_cachedModels.clear(); // L: 544
			ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 545
			BufferedNetSocket.ItemDefinition_inMembersWorld = var0; // L: 547
		}

	} // L: 549

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1066006751"
	)
	@Export("createMinimapSprite")
	static final void createMinimapSprite(int var0) {
		int[] var1 = UserComparator8.sceneMinimapSprite.pixels; // L: 5663
		int var2 = var1.length; // L: 5664

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5665
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5666
			var4 = (103 - var3) * 2048 + 24628; // L: 5667

			for (var5 = 1; var5 < 103; ++var5) { // L: 5668
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5669
					class5.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5670
					class5.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5671
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5674
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5675
		UserComparator8.sceneMinimapSprite.setRaster(); // L: 5676

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5677
			for (var6 = 1; var6 < 103; ++var6) { // L: 5678
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5679
					ItemComposition.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5680
					ItemComposition.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5683

		for (var5 = 0; var5 < 104; ++var5) { // L: 5684
			for (var6 = 0; var6 < 104; ++var6) { // L: 5685
				long var7 = class5.scene.getFloorDecorationTag(ParamComposition.Client_plane, var5, var6); // L: 5686
				if (var7 != 0L) { // L: 5687
					int var9 = class6.Entity_unpackID(var7); // L: 5688
					int var10 = AttackOption.getObjectDefinition(var9).mapIconId; // L: 5689
					if (var10 >= 0 && WorldMapAreaData.WorldMapElement_get(var10).field1558) { // L: 5690 5691
						Client.mapIcons[Client.mapIconCount] = WorldMapAreaData.WorldMapElement_get(var10).getSpriteBool(false); // L: 5694
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5695
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5696
						++Client.mapIconCount; // L: 5697
					}
				}
			}
		}

		WorldMapDecorationType.rasterProvider.apply(); // L: 5702
	} // L: 5703
}
