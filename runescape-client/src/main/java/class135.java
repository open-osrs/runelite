import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ei")
public class class135 extends class128 {
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	static IndexedSprite field1569;
	@ObfuscatedName("v")
	boolean field1566;
	@ObfuscatedName("c")
	byte field1565;
	@ObfuscatedName("i")
	byte field1567;
	@ObfuscatedName("f")
	byte field1564;
	@ObfuscatedName("b")
	byte field1568;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Les;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Les;)V"
	)
	class135(class131 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-413979452"
	)
	void vmethod3168(Buffer var1) {
		this.field1566 = var1.readUnsignedByte() == 1; // L: 251
		this.field1565 = var1.readByte(); // L: 252
		this.field1567 = var1.readByte(); // L: 253
		this.field1564 = var1.readByte(); // L: 254
		this.field1568 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "-10316"
	)
	void vmethod3162(ClanSettings var1) {
		var1.allowGuests = this.field1566; // L: 259
		var1.field1591 = this.field1565; // L: 260
		var1.field1592 = this.field1567; // L: 261
		var1.field1593 = this.field1564; // L: 262
		var1.field1606 = this.field1568; // L: 263
	} // L: 264

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "1081787239"
	)
	static final boolean method2919(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 124
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 125
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 126
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false; // L: 127
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 128
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 129
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 130
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 131
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lqi;",
		garbageValue = "-152475428"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 365
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 366
			var4 = 1;
		}

		long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42); // L: 367
		SpritePixels var8;
		if (!var5) { // L: 369
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 370
			if (var8 != null) { // L: 371
				return var8;
			}
		}

		ItemComposition var9 = class19.ItemDefinition_get(var0); // L: 373
		if (var1 > 1 && var9.countobj != null) { // L: 374
			int var10 = -1; // L: 375

			for (int var11 = 0; var11 < 10; ++var11) { // L: 376
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 377
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 379
				var9 = class19.ItemDefinition_get(var10);
			}
		}

		Model var21 = var9.getModel(1); // L: 381
		if (var21 == null) { // L: 382
			return null;
		} else {
			SpritePixels var22 = null; // L: 383
			if (var9.noteTemplate != -1) { // L: 384
				var22 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 385
				if (var22 == null) { // L: 386
					return null;
				}
			} else if (var9.notedId != -1) { // L: 388
				var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 389
				if (var22 == null) { // L: 390
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 392
				var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 393
				if (var22 == null) { // L: 394
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 396
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 397
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 398
			int[] var15 = new int[4]; // L: 399
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 400
			var8 = new SpritePixels(36, 32); // L: 401
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 402
			Rasterizer2D.Rasterizer2D_clear(); // L: 403
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 404
			Rasterizer3D.method4631(16, 16); // L: 405
			Rasterizer3D.field2553 = false; // L: 406
			if (var9.placeholderTemplate != -1) { // L: 407
				var22.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 408
			if (var5) { // L: 409
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 410
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 411
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 412
			var21.calculateBoundsCylinder(); // L: 413
			var21.method5003(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 414
			if (var9.notedId != -1) { // L: 415
				var22.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 416
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 417
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 418
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 419
			if (var9.noteTemplate != -1) { // L: 420
				var22.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 421
				Font var19 = ParamComposition.ItemDefinition_fontPlain11; // L: 422
				String var20;
				if (var1 < 100000) { // L: 425
					var20 = "<col=ffff00>" + var1 + "</col>"; // L: 426
				} else if (var1 < 10000000) { // L: 429
					var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>"; // L: 430
				} else {
					var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>"; // L: 433
				}

				var19.draw(var20, 0, 9, 16776960, 1); // L: 435
			}

			if (!var5) { // L: 437
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 438
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 439
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 440
			Rasterizer3D.field2553 = true; // L: 441
			return var8; // L: 442
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "1999407180"
	)
	static int method2922(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 1199
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1200
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1201
			return 1; // L: 1202
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1204
			if (var3.itemId != -1) { // L: 1205
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1206
			}

			return 1; // L: 1207
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1209
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1210
			return 1; // L: 1211
		} else if (var0 == 1707) { // L: 1213
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method5690() ? 1 : 0; // L: 1214
			return 1; // L: 1215
		} else if (var0 == 1708) { // L: 1217
			return UserComparator9.method2617(var3); // L: 1218
		} else {
			return var0 == 1708 ? class305.method5782(var3) : 2; // L: 1220 1221 1223
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZB)I",
		garbageValue = "-35"
	)
	static int method2921(int var0, Script var1, boolean var2) {
		Widget var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1341
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1342
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1343
			return 1; // L: 1344
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1346
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1347
			return 1; // L: 1348
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1350
			Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var3.text; // L: 1351
			return 1; // L: 1352
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1354
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1355
			return 1; // L: 1356
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1358
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1359
			return 1; // L: 1360
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1362
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1363
			return 1; // L: 1364
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1366
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1367
			return 1; // L: 1368
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1370
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1371
			return 1; // L: 1372
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1374
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1375
			return 1; // L: 1376
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1378
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1379
			return 1; // L: 1380
		} else if (var0 == 2610) { // L: 1382
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1383
			return 1; // L: 1384
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1386
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color; // L: 1387
			return 1; // L: 1388
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1390
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2; // L: 1391
			return 1; // L: 1392
		} else if (var0 == 2613) { // L: 1394
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1395
			return 1; // L: 1396
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1398
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1399
			return 1; // L: 1400
		} else if (var0 != 2615 && var0 != 2616) { // L: 1402
			return 2; // L: 1406
		} else {
			++Interpreter.Interpreter_intStackSize; // L: 1403
			return 1; // L: 1404
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "241580709"
	)
	static final void method2920() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3801
			var0 = GrandExchangeEvents.localPlayer.x; // L: 3802
			var1 = GrandExchangeEvents.localPlayer.y; // L: 3803
			if (class10.oculusOrbFocalPointX - var0 < -500 || class10.oculusOrbFocalPointX - var0 > 500 || ClientPacket.oculusOrbFocalPointY - var1 < -500 || ClientPacket.oculusOrbFocalPointY - var1 > 500) { // L: 3804
				class10.oculusOrbFocalPointX = var0; // L: 3805
				ClientPacket.oculusOrbFocalPointY = var1; // L: 3806
			}

			if (var0 != class10.oculusOrbFocalPointX) { // L: 3808
				class10.oculusOrbFocalPointX += (var0 - class10.oculusOrbFocalPointX) / 16;
			}

			if (var1 != ClientPacket.oculusOrbFocalPointY) { // L: 3809
				ClientPacket.oculusOrbFocalPointY += (var1 - ClientPacket.oculusOrbFocalPointY) / 16;
			}

			var2 = class10.oculusOrbFocalPointX >> 7; // L: 3810
			var3 = ClientPacket.oculusOrbFocalPointY >> 7; // L: 3811
			var4 = WorldMapLabel.getTileHeight(class10.oculusOrbFocalPointX, ClientPacket.oculusOrbFocalPointY, class18.Client_plane); // L: 3812
			var5 = 0; // L: 3813
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3814
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3815
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3816
						int var8 = class18.Client_plane; // L: 3817
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3818
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3819
						if (var9 > var5) { // L: 3820
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3824
			if (var6 > 98048) { // L: 3825
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3826
				var6 = 32768;
			}

			if (var6 > Client.field718) { // L: 3827
				Client.field718 += (var6 - Client.field718) / 24;
			} else if (var6 < Client.field718) { // L: 3828
				Client.field718 += (var6 - Client.field718) / 80;
			}

			Decimator.field397 = WorldMapLabel.getTileHeight(GrandExchangeEvents.localPlayer.x, GrandExchangeEvents.localPlayer.y, class18.Client_plane) - Client.camFollowHeight; // L: 3829
		} else if (Client.oculusOrbState == 1) { // L: 3831
			UrlRequest.method2560(); // L: 3832
			short var10 = -1; // L: 3833
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3834
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3835
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3836
				if (var10 == 0) { // L: 3837
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3838
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3839
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3841
				if (var10 == 0) { // L: 3842
					var10 = 256;
				} else if (var10 == 1024) { // L: 3843
					var10 = 768;
				} else {
					var10 = 512; // L: 3844
				}
			}

			byte var11 = 0; // L: 3846
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3847
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3848
				var11 = 1;
			}

			var2 = 0; // L: 3849
			if (var10 >= 0 || var11 != 0) { // L: 3850
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * 868767683 * -1383870229 : Client.oculusOrbNormalSpeed * -210849807 * -1329831663; // L: 3851
				var2 *= 16; // L: 3852
				Client.field590 = var10; // L: 3853
				Client.field489 = var11; // L: 3854
			}

			if (Client.field581 < var2) { // L: 3856
				Client.field581 += var2 / 8; // L: 3857
				if (Client.field581 > var2) { // L: 3858
					Client.field581 = var2;
				}
			} else if (Client.field581 > var2) { // L: 3860
				Client.field581 = Client.field581 * 9 / 10;
			}

			if (Client.field581 > 0) { // L: 3861
				var3 = Client.field581 / 16; // L: 3862
				if (Client.field590 >= 0) { // L: 3863
					var0 = Client.field590 - class21.cameraYaw & 2047; // L: 3864
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3865
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3866
					class10.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3867
					ClientPacket.oculusOrbFocalPointY += var3 * var5 / 65536; // L: 3868
				}

				if (Client.field489 != 0) { // L: 3870
					Decimator.field397 += var3 * Client.field489; // L: 3871
					if (Decimator.field397 > 0) { // L: 3872
						Decimator.field397 = 0;
					}
				}
			} else {
				Client.field590 = -1; // L: 3876
				Client.field489 = -1; // L: 3877
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3879
				class134.method2908(); // L: 3880
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && GameBuild.mouseCam) { // L: 3883
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3884
			Client.camAngleDX = var0 * 2; // L: 3885
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * 1209120729 * -785295255; // L: 3886
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3887
			Client.camAngleDY = var1 * 2; // L: 3888
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x * 945035617 * -611956063; // L: 3889
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3892
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3893
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3894
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3895
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3896
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3897
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3898
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3899
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3901
		Client.camAngleX += Client.camAngleDX / 2; // L: 3902
		if (Client.camAngleX < 128) { // L: 3903
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3904
			Client.camAngleX = 383;
		}

	} // L: 3905
}
