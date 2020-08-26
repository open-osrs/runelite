import java.awt.Component;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aj")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -243088695
	)
	static int field352;
	@ObfuscatedName("h")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("a")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("q")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Lkf;IZB)V",
		garbageValue = "1"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lkf;ZS)V",
		garbageValue = "8691"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method5634(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-681398425"
	)
	static void method751(Component var0) {
		var0.removeMouseListener(MouseHandler.MouseHandler_instance); // L: 43
		var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance); // L: 44
		var0.removeFocusListener(MouseHandler.MouseHandler_instance); // L: 45
		MouseHandler.MouseHandler_currentButtonVolatile = 0; // L: 46
	} // L: 47

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "638484007"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1355090288"
	)
	static final void method752() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3449
			var0 = WorldMapLabelSize.localPlayer.x; // L: 3450
			var1 = WorldMapLabelSize.localPlayer.y; // L: 3451
			if (GrandExchangeOfferWorldComparator.oculusOrbFocalPointX - var0 < -500 || GrandExchangeOfferWorldComparator.oculusOrbFocalPointX - var0 > 500 || MouseHandler.oculusOrbFocalPointY - var1 < -500 || MouseHandler.oculusOrbFocalPointY - var1 > 500) { // L: 3452
				GrandExchangeOfferWorldComparator.oculusOrbFocalPointX = var0; // L: 3453
				MouseHandler.oculusOrbFocalPointY = var1; // L: 3454
			}

			if (var0 != GrandExchangeOfferWorldComparator.oculusOrbFocalPointX) { // L: 3456
				GrandExchangeOfferWorldComparator.oculusOrbFocalPointX += (var0 - GrandExchangeOfferWorldComparator.oculusOrbFocalPointX) / 16;
			}

			if (var1 != MouseHandler.oculusOrbFocalPointY) { // L: 3457
				MouseHandler.oculusOrbFocalPointY += (var1 - MouseHandler.oculusOrbFocalPointY) / 16;
			}

			var2 = GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7; // L: 3458
			var3 = MouseHandler.oculusOrbFocalPointY >> 7; // L: 3459
			var4 = ArchiveLoader.getTileHeight(GrandExchangeOfferWorldComparator.oculusOrbFocalPointX, MouseHandler.oculusOrbFocalPointY, Huffman.Client_plane); // L: 3460
			var5 = 0; // L: 3461
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3462
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3463
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3464
						int var8 = Huffman.Client_plane; // L: 3465
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3466
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3467
						if (var9 > var5) { // L: 3468
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3472
			if (var6 > 98048) { // L: 3473
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3474
				var6 = 32768;
			}

			if (var6 > Client.field762) { // L: 3475
				Client.field762 += (var6 - Client.field762) / 24;
			} else if (var6 < Client.field762) { // L: 3476
				Client.field762 += (var6 - Client.field762) / 80;
			}

			class7.field40 = ArchiveLoader.getTileHeight(WorldMapLabelSize.localPlayer.x, WorldMapLabelSize.localPlayer.y, Huffman.Client_plane) - Client.camFollowHeight; // L: 3477
		} else if (Client.oculusOrbState == 1) { // L: 3479
			if (Client.field759 && WorldMapLabelSize.localPlayer != null) { // L: 3481
				var0 = WorldMapLabelSize.localPlayer.pathX[0]; // L: 3482
				var1 = WorldMapLabelSize.localPlayer.pathY[0]; // L: 3483
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3484
					GrandExchangeOfferWorldComparator.oculusOrbFocalPointX = WorldMapLabelSize.localPlayer.x; // L: 3485
					var2 = ArchiveLoader.getTileHeight(WorldMapLabelSize.localPlayer.x, WorldMapLabelSize.localPlayer.y, Huffman.Client_plane) - Client.camFollowHeight; // L: 3486
					if (var2 < class7.field40) { // L: 3487
						class7.field40 = var2;
					}

					MouseHandler.oculusOrbFocalPointY = WorldMapLabelSize.localPlayer.y; // L: 3488
					Client.field759 = false; // L: 3489
				}
			}

			short var10 = -1; // L: 3492
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3493
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3494
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3495
				if (var10 == 0) { // L: 3496
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3497
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3498
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3500
				if (var10 == 0) { // L: 3501
					var10 = 256;
				} else if (var10 == 1024) { // L: 3502
					var10 = 768;
				} else {
					var10 = 512; // L: 3503
				}
			}

			byte var11 = 0; // L: 3505
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3506
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3507
				var11 = 1;
			}

			var2 = 0; // L: 3508
			if (var10 >= 0 || var11 != 0) { // L: 3509
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed * -1087548987 * -883817203 : Client.oculusOrbNormalSpeed * -106953033 * 1271248647; // L: 3510
				var2 *= 16; // L: 3511
				Client.field796 = var10; // L: 3512
				Client.field755 = var11; // L: 3513
			}

			if (Client.field753 < var2) { // L: 3515
				Client.field753 += var2 / 8; // L: 3516
				if (Client.field753 > var2) { // L: 3517
					Client.field753 = var2;
				}
			} else if (Client.field753 > var2) { // L: 3519
				Client.field753 = Client.field753 * 9 / 10;
			}

			if (Client.field753 > 0) { // L: 3520
				var3 = Client.field753 / 16; // L: 3521
				if (Client.field796 >= 0) { // L: 3522
					var0 = Client.field796 - ServerPacket.cameraYaw & 2047; // L: 3523
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3524
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3525
					GrandExchangeOfferWorldComparator.oculusOrbFocalPointX += var3 * var4 / 65536; // L: 3526
					MouseHandler.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 3527
				}

				if (Client.field755 != 0) { // L: 3529
					class7.field40 += var3 * Client.field755; // L: 3530
					if (class7.field40 > 0) { // L: 3531
						class7.field40 = 0;
					}
				}
			} else {
				Client.field796 = -1; // L: 3535
				Client.field755 = -1; // L: 3536
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3538
				Client.packetWriter.addNode(Client.getPacketBufferNode(ClientPacket.field2290, Client.packetWriter.isaacCipher)); // L: 3540
				Client.oculusOrbState = 0; // L: 3541
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && ScriptEvent.mouseCam) { // L: 3545
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3546
			Client.camAngleDX = var0 * 2; // L: 3547
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y * -630805473 * 1212010463; // L: 3548
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3549
			Client.camAngleDY = var1 * 2; // L: 3550
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x * -376552745 * 551932135; // L: 3551
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3554
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3555
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3556
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3557
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3558
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3559
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3560
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3561
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3563
		Client.camAngleX += Client.camAngleDX / 2; // L: 3564
		if (Client.camAngleX < 128) { // L: 3565
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3566
			Client.camAngleX = 383;
		}

	} // L: 3567

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1654311283"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class279.method5091(); // L: 7009
		Client.menuActions[0] = "Cancel"; // L: 7010
		Client.menuTargets[0] = ""; // L: 7011
		Client.menuOpcodes[0] = 1006; // L: 7012
		Client.menuShiftClick[0] = false; // L: 7013
		Client.menuOptionsCount = 1; // L: 7014
	} // L: 7015

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "([Lhq;II)V",
		garbageValue = "1802029198"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10115
			Widget var3 = var0[var2]; // L: 10116
			if (var3 != null) { // L: 10117
				if (var3.type == 0) { // L: 10118
					if (var3.children != null) { // L: 10119
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10120
					if (var4 != null) { // L: 10121
						ClientPacket.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 10123
					var5 = new ScriptEvent(); // L: 10124
					var5.widget = var3; // L: 10125
					var5.args = var3.onDialogAbort; // L: 10126
					Script.runScriptEvent(var5); // L: 10127
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 10129
					if (var3.childIndex >= 0) { // L: 10130
						Widget var6 = TileItem.getWidget(var3.id); // L: 10131
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 10132
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 10136
					var5.widget = var3; // L: 10137
					var5.args = var3.onSubChange; // L: 10138
					Script.runScriptEvent(var5); // L: 10139
				}
			}
		}

	} // L: 10142

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Lhq;II)Ljava/lang/String;",
		garbageValue = "-1179780727"
	)
	static String method756(Widget var0, int var1) {
		if (!StudioGame.method4230(WorldMapIcon_0.getWidgetFlags(var0), var1) && var0.onOp == null) { // L: 10736
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null; // L: 10737 10738 10740
		}
	}
}
