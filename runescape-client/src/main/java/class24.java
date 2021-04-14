import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("s")
public class class24 {
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -271696441
	)
	static int field189;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lcc;",
		garbageValue = "1048576"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = BuddyRankComparator.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = WorldMapIcon_1.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZB)I",
		garbageValue = "1"
	)
	static int method349(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 793
			var0 -= 1000; // L: 794
			var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 795
		} else {
			var3 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 797
		}

		class29.invalidateWidget(var3); // L: 798
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 799
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 819
				var3.modelType = 2; // L: 820
				var3.modelId = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 821
				return 1; // L: 822
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 824
				var3.modelType = 3; // L: 825
				var3.modelId = Varcs.localPlayer.appearance.getChatHeadId(); // L: 826
				return 1; // L: 827
			} else {
				return 2; // L: 829
			}
		} else {
			class16.Interpreter_intStackSize -= 2; // L: 800
			int var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 801
			int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 802
			var3.itemId = var4; // L: 803
			var3.itemQuantity = var5; // L: 804
			ItemComposition var6 = class23.ItemDefinition_get(var4); // L: 805
			var3.modelAngleX = var6.xan2d; // L: 806
			var3.modelAngleY = var6.yan2d; // L: 807
			var3.modelAngleZ = var6.zan2d; // L: 808
			var3.modelOffsetX = var6.offsetX2d; // L: 809
			var3.modelOffsetY = var6.offsetY2d; // L: 810
			var3.modelZoom = var6.zoom2d; // L: 811
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 812
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) { // L: 813
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 814
			}

			if (var3.field2720 > 0) { // L: 815
				var3.modelZoom = var3.modelZoom * 32 / var3.field2720;
			} else if (var3.rawWidth > 0) { // L: 816
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 817
		}
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1638618599"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount; // L: 3709
		class283.method4987(); // L: 3710
		if (Client.renderSelf) { // L: 3712
			FriendSystem.addPlayerToScene(Varcs.localPlayer, false); // L: 3713
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 3717
			FriendSystem.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 3718
		}

		SoundSystem.addNpcsToScene(true); // L: 3721
		int var4 = Players.Players_count; // L: 3723
		int[] var5 = Players.Players_indices; // L: 3724

		int var6;
		for (var6 = 0; var6 < var4; ++var6) { // L: 3725
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) { // L: 3726
				FriendSystem.addPlayerToScene(Client.players[var5[var6]], true); // L: 3727
			}
		}

		SoundSystem.addNpcsToScene(false); // L: 3730

		for (Projectile var15 = (Projectile)Client.projectiles.last(); var15 != null; var15 = (Projectile)Client.projectiles.previous()) { // L: 3732 3733 3750
			if (var15.plane == class26.Client_plane && Client.cycle <= var15.cycleEnd) { // L: 3734
				if (Client.cycle >= var15.cycleStart) { // L: 3735
					if (var15.targetIndex > 0) { // L: 3736
						NPC var17 = Client.npcs[var15.targetIndex - 1]; // L: 3737
						if (var17 != null && var17.x >= 0 && var17.x < 13312 && var17.y >= 0 && var17.y < 13312) { // L: 3738
							var15.setDestination(var17.x, var17.y, UserComparator7.getTileHeight(var17.x, var17.y, var15.plane) - var15.endHeight, Client.cycle);
						}
					}

					if (var15.targetIndex < 0) { // L: 3740
						var6 = -var15.targetIndex - 1; // L: 3742
						Player var18;
						if (var6 == Client.localPlayerIndex) { // L: 3743
							var18 = Varcs.localPlayer;
						} else {
							var18 = Client.players[var6]; // L: 3744
						}

						if (var18 != null && var18.x >= 0 && var18.x < 13312 && var18.y >= 0 && var18.y < 13312) { // L: 3745
							var15.setDestination(var18.x, var18.y, UserComparator7.getTileHeight(var18.x, var18.y, var15.plane) - var15.endHeight, Client.cycle);
						}
					}

					var15.advance(Client.field799); // L: 3747
					WorldMapArea.scene.drawEntity(class26.Client_plane, (int)var15.x, (int)var15.y, (int)var15.z, 60, var15, var15.yaw, -1L, false); // L: 3748
				}
			} else {
				var15.remove();
			}
		}

		AccessFile.method6382(); // L: 3753
		Bounds.setViewportShape(var0, var1, var2, var3, true); // L: 3754
		var0 = Client.viewportOffsetX; // L: 3755
		var1 = Client.viewportOffsetY; // L: 3756
		var2 = Client.viewportWidth; // L: 3757
		var3 = Client.viewportHeight; // L: 3758
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 3759
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 3760
		int var16;
		if (!Client.isCameraLocked) { // L: 3761
			var4 = Client.camAngleX; // L: 3762
			if (Client.field735 / 256 > var4) { // L: 3763
				var4 = Client.field735 / 256;
			}

			if (Client.field850[4] && Client.field698[4] + 128 > var4) { // L: 3764
				var4 = Client.field698[4] + 128;
			}

			var16 = Client.camAngleY & 2047; // L: 3765
			class22.method329(class6.oculusOrbFocalPointX, VarbitComposition.field3544, Players.oculusOrbFocalPointY, var4, var16, WorldMapID.method3116(var4), var3); // L: 3766
		}

		if (!Client.isCameraLocked) { // L: 3769
			var4 = class2.method36();
		} else {
			var4 = class34.method420(); // L: 3770
		}

		var16 = ModeWhere.cameraX; // L: 3771
		var6 = WorldMapRectangle.cameraY; // L: 3772
		int var7 = ReflectionCheck.cameraZ; // L: 3773
		int var8 = WorldMapArea.cameraPitch; // L: 3774
		int var9 = class69.cameraYaw; // L: 3775

		int var10;
		int var11;
		for (var10 = 0; var10 < 5; ++var10) { // L: 3776
			if (Client.field850[var10]) { // L: 3777
				var11 = (int)(Math.random() * (double)(Client.field601[var10] * 2 + 1) - (double)Client.field601[var10] + Math.sin((double)Client.field853[var10] / 100.0D * (double)Client.field854[var10]) * (double)Client.field698[var10]); // L: 3778
				if (var10 == 0) { // L: 3779
					ModeWhere.cameraX += var11;
				}

				if (var10 == 1) { // L: 3780
					WorldMapRectangle.cameraY += var11;
				}

				if (var10 == 2) { // L: 3781
					ReflectionCheck.cameraZ += var11;
				}

				if (var10 == 3) { // L: 3782
					class69.cameraYaw = var11 + class69.cameraYaw & 2047;
				}

				if (var10 == 4) { // L: 3783
					WorldMapArea.cameraPitch += var11; // L: 3784
					if (WorldMapArea.cameraPitch < 128) { // L: 3785
						WorldMapArea.cameraPitch = 128;
					}

					if (WorldMapArea.cameraPitch > 383) { // L: 3786
						WorldMapArea.cameraPitch = 383;
					}
				}
			}
		}

		var10 = MouseHandler.MouseHandler_x; // L: 3790
		var11 = MouseHandler.MouseHandler_y; // L: 3791
		if (MouseHandler.MouseHandler_lastButton != 0) { // L: 3792
			var10 = MouseHandler.MouseHandler_lastPressedX; // L: 3793
			var11 = MouseHandler.MouseHandler_lastPressedY; // L: 3794
		}

		int var12;
		int var13;
		if (var10 >= var0 && var10 < var0 + var2 && var11 >= var1 && var11 < var3 + var1) { // L: 3796
			var12 = var10 - var0; // L: 3797
			var13 = var11 - var1; // L: 3798
			ViewportMouse.ViewportMouse_x = var12; // L: 3800
			ViewportMouse.ViewportMouse_y = var13; // L: 3801
			ViewportMouse.ViewportMouse_isInViewport = true; // L: 3802
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 3803
			ViewportMouse.ViewportMouse_false0 = false; // L: 3804
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false; // L: 3809
			ViewportMouse.ViewportMouse_entityCount = 0; // L: 3810
		}

		BoundaryObject.playPcmPlayers(); // L: 3813
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 3814
		BoundaryObject.playPcmPlayers(); // L: 3815
		var12 = Rasterizer3D.Rasterizer3D_zoom; // L: 3816
		Rasterizer3D.Rasterizer3D_zoom = Client.viewportZoom; // L: 3817
		WorldMapArea.scene.draw(ModeWhere.cameraX, WorldMapRectangle.cameraY, ReflectionCheck.cameraZ, WorldMapArea.cameraPitch, class69.cameraYaw, var4); // L: 3818
		Rasterizer3D.Rasterizer3D_zoom = var12; // L: 3819
		BoundaryObject.playPcmPlayers(); // L: 3820
		WorldMapArea.scene.clearTempGameObjects(); // L: 3821
		ServerPacket.method3903(var0, var1, var2, var3); // L: 3822
		if (Client.hintArrowType == 2) { // L: 3824
			class14.worldToScreen((Client.hintArrowX - ItemLayer.baseX << 7) + Client.hintArrowSubX, (Client.hintArrowY - Tile.baseY << 7) + Client.hintArrowSubY, Client.hintArrowHeight * 2); // L: 3825
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) { // L: 3826
				Script.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).animate(Client.field799); // L: 3828
		Client.field716 = 0; // L: 3831
		var13 = (Varcs.localPlayer.x >> 7) + ItemLayer.baseX; // L: 3832
		int var14 = (Varcs.localPlayer.y >> 7) + Tile.baseY; // L: 3833
		if (var13 >= 3053 && var13 <= 3156 && var14 >= 3056 && var14 <= 3136) { // L: 3834
			Client.field716 = 1;
		}

		if (var13 >= 3072 && var13 <= 3118 && var14 >= 9492 && var14 <= 9535) { // L: 3835
			Client.field716 = 1;
		}

		if (Client.field716 == 1 && var13 >= 3139 && var13 <= 3199 && var14 >= 3008 && var14 <= 3062) { // L: 3836
			Client.field716 = 0;
		}

		ModeWhere.cameraX = var16; // L: 3839
		WorldMapRectangle.cameraY = var6; // L: 3840
		ReflectionCheck.cameraZ = var7; // L: 3841
		WorldMapArea.cameraPitch = var8; // L: 3842
		class69.cameraYaw = var9; // L: 3843
		if (Client.isLoading && PacketBufferNode.method3896(true, false) == 0) { // L: 3844
			Client.isLoading = false;
		}

		if (Client.isLoading) { // L: 3845
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0); // L: 3846
			class2.drawLoadingMessage("Loading - please wait.", false); // L: 3847
		}

	} // L: 3849
}
