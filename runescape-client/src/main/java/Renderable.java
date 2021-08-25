import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1436498337
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lhg;",
		garbageValue = "18"
	)
	@Export("getModel")
	protected Model getModel() {
		return null;
	}

	@ObfuscatedName("cc")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel();
		if (var11 != null) {
			this.height = var11.height;
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "-14"
	)
	static int method4319(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++class240.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class240.Interpreter_intStackSize;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZI)I",
		garbageValue = "2106514322"
	)
	static int method4326(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			class240.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			class240.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			class240.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--class240.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			class240.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Ljd;IIII)V",
		garbageValue = "434430533"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class1.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class129.localPlayer.x / 32 + 48;
				int var7 = 464 - class129.localPlayer.y / 32;
				class113.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class129.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class129.localPlayer.y / 32;
					Fonts.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[class391.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class129.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class129.localPlayer.y / 32;
							Fonts.drawSpriteOnMinimap(var1, var2, var11, var12, DynamicObject.mapDotSprites[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) {
					NPC var9 = Client.npcs[Client.npcIndices[var8]];
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - class129.localPlayer.x / 32;
							var12 = var9.y / 32 - class129.localPlayer.y / 32;
							Fonts.drawSpriteOnMinimap(var1, var2, var11, var12, DynamicObject.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class129.localPlayer) {
						var12 = var15.x / 32 - class129.localPlayer.x / 32;
						int var13 = var15.y / 32 - class129.localPlayer.y / 32;
						if (var15.isFriend()) {
							Fonts.drawSpriteOnMinimap(var1, var2, var12, var13, DynamicObject.mapDotSprites[3], var4);
						} else if (class129.localPlayer.team != 0 && var15.team != 0 && var15.team == class129.localPlayer.team) {
							Fonts.drawSpriteOnMinimap(var1, var2, var12, var13, DynamicObject.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							Fonts.drawSpriteOnMinimap(var1, var2, var12, var13, DynamicObject.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							Fonts.drawSpriteOnMinimap(var1, var2, var12, var13, DynamicObject.mapDotSprites[6], var4);
						} else {
							Fonts.drawSpriteOnMinimap(var1, var2, var12, var13, DynamicObject.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class129.localPlayer.x / 32;
							var12 = var19.y / 32 - class129.localPlayer.y / 32;
							class78.worldToMinimap(var1, var2, var11, var12, class13.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - FloorOverlayDefinition.baseX * 4 + 2 - class129.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - class320.baseY * 4 + 2 - class129.localPlayer.y / 32;
						class78.worldToMinimap(var1, var2, var10, var11, class13.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class129.localPlayer.x / 32;
							var12 = var20.y / 32 - class129.localPlayer.y / 32;
							class78.worldToMinimap(var1, var2, var11, var12, class13.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class129.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class129.localPlayer.y / 32;
					Fonts.drawSpriteOnMinimap(var1, var2, var10, var11, class13.mapMarkerSprites[0], var4);
				}

				if (!class129.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field766[var3] = true;
		}
	}
}
