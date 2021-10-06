import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
public class class113 extends class116 {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 611077485
	)
	static int field1364;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1446418621
	)
	int field1365;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 837732111
	)
	int field1366;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 191831599
	)
	int field1367;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -779185285
	)
	int field1368;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class113(class119 var1) {
		this.this$0 = var1;
		this.field1365 = -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-912681401"
	)
	void vmethod2767(Buffer var1) {
		this.field1365 = var1.readUnsignedShort();
		this.field1366 = var1.readInt();
		this.field1367 = var1.readUnsignedByte();
		this.field1368 = var1.readUnsignedByte();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1225074726"
	)
	void vmethod2766(ClanSettings var1) {
		var1.method2596(this.field1365, this.field1366, this.field1367, this.field1368);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "-47"
	)
	static int method2482(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = HealthBarUpdate.getWidget(Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
		}

		class16.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--AbstractByteArrayCopier.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class67.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			AbstractByteArrayCopier.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[AbstractByteArrayCopier.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class87.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3102 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3102;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1268577977"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-1912016711"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			Script.method1969(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field1104 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class356.playPcmPlayers();
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = class67.localPlayer.x / 32 + 48;
				int var7 = 464 - class67.localPlayer.y / 32;
				class11.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - class67.localPlayer.x / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - class67.localPlayer.y / 32;
					StudioGame.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Client.groundItems[VertexNormal.Client_plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - class67.localPlayer.x / 32;
							var12 = var16 * 4 + 2 - class67.localPlayer.y / 32;
							StudioGame.drawSpriteOnMinimap(var1, var2, var11, var12, class119.mapDotSprites[0], var4);
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
							var11 = var9.x / 32 - class67.localPlayer.x / 32;
							var12 = var9.y / 32 - class67.localPlayer.y / 32;
							StudioGame.drawSpriteOnMinimap(var1, var2, var11, var12, class119.mapDotSprites[1], var4);
						}
					}
				}

				var8 = Players.Players_count;
				int[] var17 = Players.Players_indices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = Client.players[var17[var10]];
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class67.localPlayer) {
						var12 = var15.x / 32 - class67.localPlayer.x / 32;
						int var13 = var15.y / 32 - class67.localPlayer.y / 32;
						if (var15.isFriend()) {
							StudioGame.drawSpriteOnMinimap(var1, var2, var12, var13, class119.mapDotSprites[3], var4);
						} else if (class67.localPlayer.team != 0 && var15.team != 0 && var15.team == class67.localPlayer.team) {
							StudioGame.drawSpriteOnMinimap(var1, var2, var12, var13, class119.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) {
							StudioGame.drawSpriteOnMinimap(var1, var2, var12, var13, class119.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) {
							StudioGame.drawSpriteOnMinimap(var1, var2, var12, var13, class119.mapDotSprites[6], var4);
						} else {
							StudioGame.drawSpriteOnMinimap(var1, var2, var12, var13, class119.mapDotSprites[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) {
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex];
						if (var19 != null) {
							var11 = var19.x / 32 - class67.localPlayer.x / 32;
							var12 = var19.y / 32 - class67.localPlayer.y / 32;
							Calendar.worldToMinimap(var1, var2, var11, var12, Client.mapMarkerSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - WorldMapSectionType.baseX * 4 + 2 - class67.localPlayer.x / 32;
						var11 = Client.hintArrowY * 4 - PlayerComposition.baseY * 4 + 2 - class67.localPlayer.y / 32;
						Calendar.worldToMinimap(var1, var2, var10, var11, Client.mapMarkerSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) {
						Player var20 = Client.players[Client.hintArrowPlayerIndex];
						if (var20 != null) {
							var11 = var20.x / 32 - class67.localPlayer.x / 32;
							var12 = var20.y / 32 - class67.localPlayer.y / 32;
							Calendar.worldToMinimap(var1, var2, var11, var12, Client.mapMarkerSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - class67.localPlayer.x / 32;
					var11 = Client.destinationY * 4 + 2 - class67.localPlayer.y / 32;
					StudioGame.drawSpriteOnMinimap(var1, var2, var10, var11, Client.mapMarkerSprites[0], var4);
				}

				if (!class67.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field701[var3] = true;
		}
	}
}
