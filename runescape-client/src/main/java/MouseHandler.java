import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 551932135
	)
	public static int MouseHandler_x;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1641634033
	)
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1212010463
	)
	public static int MouseHandler_y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 569317801
	)
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 476051061
	)
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1924891607
	)
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -5989118801596156891L
	)
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1364176147
	)
	public static int MouseHandler_currentButton;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 1548820219885674609L
	)
	public static long MouseHandler_millis;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1745887067
	)
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2031476779
	)
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -604562201
	)
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -1684843054653501119L
	)
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 376699801
	)
	public static int MouseHandler_lastButton;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1229832903
	)
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -434332357
	)
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = -2055163658116269707L
	)
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractSocket field508;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 1280773695
	)
	static int oculusOrbFocalPointY;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-11"
	)
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 72
		if (!var1.isAltDown() && var2 != 2) { // L: 73
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 74 75
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 120
			MouseHandler_idleCycles = 0; // L: 121
			MouseHandler_xVolatile = var1.getX(); // L: 122
			MouseHandler_yVolatile = var1.getY(); // L: 123
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 124
		}

	} // L: 126

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 99
			var1.consume();
		}

	} // L: 100

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 103
	} // L: 104

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 107
			MouseHandler_idleCycles = 0; // L: 108
			MouseHandler_xVolatile = -1; // L: 109
			MouseHandler_yVolatile = -1; // L: 110
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 111
		}

	} // L: 113

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 116
	} // L: 117

	public final void focusGained(FocusEvent var1) {
	} // L: 128

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 131
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 132

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 79
			MouseHandler_idleCycles = 0; // L: 80
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 81
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 82
			MouseHandler_lastPressedTimeMillisVolatile = PacketWriter.currentTimeMillis(); // L: 83
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 84
			if (MouseHandler_lastButtonVolatile != 0) { // L: 85
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 87
			var1.consume();
		}

	} // L: 88

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 91
			MouseHandler_idleCycles = 0; // L: 92
			MouseHandler_currentButtonVolatile = 0; // L: 93
		}

		if (var1.isPopupTrigger()) { // L: 95
			var1.consume();
		}

	} // L: 96

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "([BI)Llp;",
		garbageValue = "1839748509"
	)
	public static final Sprite convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var2 * var3]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new Sprite(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new Sprite(0, 0); // L: 32
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lhq;IIII)V",
		garbageValue = "1755181117"
	)
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field2682 == null) { // L: 926
			throw new RuntimeException(); // L: 927
		} else {
			var0.field2682[var1] = var2; // L: 929
			var0.field2683[var1] = var3; // L: 930
		}
	} // L: 931

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILhg;ZB)V",
		garbageValue = "70"
	)
	static void method1150(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = WorldMapSection0.getWorldMap().getMapArea(var0); // L: 3851
		int var4 = WorldMapLabelSize.localPlayer.plane; // L: 3852
		int var5 = (WorldMapLabelSize.localPlayer.x >> 7) + WorldMapManager.baseX; // L: 3853
		int var6 = (WorldMapLabelSize.localPlayer.y >> 7) + WorldMapLabel.baseY; // L: 3854
		Coord var7 = new Coord(var4, var5, var6); // L: 3855
		WorldMapSection0.getWorldMap().method6549(var3, var7, var1, var2); // L: 3856
	} // L: 3857

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Lgd;I)V",
		garbageValue = "-930522600"
	)
	static final void method1134(class194 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer; // L: 6341
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class194.field2361 == var0) { // L: 6342
			var2 = var1.method5656(); // L: 6343
			var3 = var1.method5646(); // L: 6344
			var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6345
			var5 = (var3 & 7) + ScriptEvent.field597; // L: 6346
			var6 = var1.method5656(); // L: 6347
			var7 = var1.readUnsignedShort(); // L: 6348
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6349
				NodeDeque var42 = Client.groundItems[Huffman.Client_plane][var4][var5]; // L: 6350
				if (var42 != null) { // L: 6351
					for (TileItem var36 = (TileItem)var42.last(); var36 != null; var36 = (TileItem)var42.previous()) { // L: 6352 6353 6358
						if ((var6 & 32767) == var36.id && var2 == var36.quantity) { // L: 6354
							var36.quantity = var7; // L: 6355
							break;
						}
					}

					class13.updateItemPile(var4, var5); // L: 6360
				}
			}

		} else {
			int var8;
			int var9;
			int var10;
			if (class194.field2371 == var0) { // L: 6365
				var2 = var1.method5612(); // L: 6366
				var3 = var2 >> 4 & 15; // L: 6367
				var4 = var2 & 7; // L: 6368
				var5 = var1.method5612(); // L: 6369
				var6 = var1.readUnsignedByte(); // L: 6370
				var7 = (var6 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6371
				var8 = (var6 & 7) + ScriptEvent.field597; // L: 6372
				var9 = var1.method5656(); // L: 6373
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6374
					var10 = var3 + 1; // L: 6375
					if (WorldMapLabelSize.localPlayer.pathX[0] >= var7 - var10 && WorldMapLabelSize.localPlayer.pathX[0] <= var7 + var10 && WorldMapLabelSize.localPlayer.pathY[0] >= var8 - var10 && WorldMapLabelSize.localPlayer.pathY[0] <= var10 + var8 && Client.areaSoundEffectVolume != 0 && var4 > 0 && Client.soundEffectCount < 50) { // L: 6376 6377
						Client.soundEffectIds[Client.soundEffectCount] = var9; // L: 6378
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 6379
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5; // L: 6380
						Client.soundEffects[Client.soundEffectCount] = null; // L: 6381
						Client.soundLocations[Client.soundEffectCount] = var3 + (var8 << 8) + (var7 << 16); // L: 6382
						++Client.soundEffectCount; // L: 6383
					}
				}
			}

			int var11;
			int var12;
			int var13;
			int var14;
			byte var38;
			if (class194.field2364 == var0) { // L: 6388
				var2 = var1.method5656(); // L: 6389
				var38 = var1.method5649(); // L: 6390
				var4 = var1.method5646(); // L: 6391
				var5 = (var4 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6392
				var6 = (var4 & 7) + ScriptEvent.field597; // L: 6393
				var7 = var1.readUnsignedByte(); // L: 6394
				var8 = var1.method5612() * 4; // L: 6395
				var9 = var1.method5639(); // L: 6396
				var10 = var1.method5655(); // L: 6397
				var11 = var1.readUnsignedShort(); // L: 6398
				var12 = var1.method5658(); // L: 6399
				var13 = var1.method5646() * 4; // L: 6400
				byte var41 = var1.method5649(); // L: 6401
				var3 = var38 + var5; // L: 6402
				var14 = var41 + var6; // L: 6403
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var3 >= 0 && var14 >= 0 && var3 < 104 && var14 < 104 && var2 != 65535) { // L: 6404
					var5 = var5 * 128 + 64; // L: 6405
					var6 = var6 * 128 + 64; // L: 6406
					var3 = var3 * 128 + 64; // L: 6407
					var14 = var14 * 128 + 64; // L: 6408
					Projectile var35 = new Projectile(var2, Huffman.Client_plane, var5, var6, ArchiveLoader.getTileHeight(var5, var6, Huffman.Client_plane) - var8, var10 + Client.cycle, var11 + Client.cycle, var9, var7, var12, var13); // L: 6409
					var35.setDestination(var3, var14, ArchiveLoader.getTileHeight(var3, var14, Huffman.Client_plane) - var13, var10 + Client.cycle); // L: 6410
					Client.projectiles.addFirst(var35); // L: 6411
				}

			} else if (class194.field2365 == var0) { // L: 6415
				var2 = var1.method5639(); // L: 6416
				var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6417
				var4 = (var2 & 7) + ScriptEvent.field597; // L: 6418
				var5 = var1.method5612(); // L: 6419
				var6 = var5 >> 2; // L: 6420
				var7 = var5 & 3; // L: 6421
				var8 = Client.field736[var6]; // L: 6422
				var9 = var1.readUnsignedShort(); // L: 6423
				if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) { // L: 6424
					if (var8 == 0) { // L: 6425
						BoundaryObject var34 = ScriptEvent.scene.method3276(Huffman.Client_plane, var3, var4); // L: 6426
						if (var34 != null) { // L: 6427
							var11 = UserComparator9.Entity_unpackID(var34.tag); // L: 6428
							if (var6 == 2) { // L: 6429
								var34.entity1 = new DynamicObject(var11, 2, var7 + 4, Huffman.Client_plane, var3, var4, var9, false, var34.entity1); // L: 6430
								var34.entity2 = new DynamicObject(var11, 2, var7 + 1 & 3, Huffman.Client_plane, var3, var4, var9, false, var34.entity2); // L: 6431
							} else {
								var34.entity1 = new DynamicObject(var11, var6, var7, Huffman.Client_plane, var3, var4, var9, false, var34.entity1); // L: 6433
							}
						}
					}

					if (var8 == 1) { // L: 6436
						WallDecoration var43 = ScriptEvent.scene.method3211(Huffman.Client_plane, var3, var4); // L: 6437
						if (var43 != null) { // L: 6438
							var11 = UserComparator9.Entity_unpackID(var43.tag); // L: 6439
							if (var6 != 4 && var6 != 5) { // L: 6440
								if (var6 == 6) { // L: 6441
									var43.entity1 = new DynamicObject(var11, 4, var7 + 4, Huffman.Client_plane, var3, var4, var9, false, var43.entity1);
								} else if (var6 == 7) { // L: 6442
									var43.entity1 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, Huffman.Client_plane, var3, var4, var9, false, var43.entity1);
								} else if (var6 == 8) { // L: 6443
									var43.entity1 = new DynamicObject(var11, 4, var7 + 4, Huffman.Client_plane, var3, var4, var9, false, var43.entity1); // L: 6444
									var43.entity2 = new DynamicObject(var11, 4, (var7 + 2 & 3) + 4, Huffman.Client_plane, var3, var4, var9, false, var43.entity2);
								}
							} else {
								var43.entity1 = new DynamicObject(var11, 4, var7, Huffman.Client_plane, var3, var4, var9, false, var43.entity1); // L: 6445
							}
						}
					}

					if (var8 == 2) { // L: 6449
						GameObject var44 = ScriptEvent.scene.method3197(Huffman.Client_plane, var3, var4); // L: 6450
						if (var6 == 11) { // L: 6451
							var6 = 10;
						}

						if (var44 != null) { // L: 6452
							var44.entity = new DynamicObject(UserComparator9.Entity_unpackID(var44.tag), var6, var7, Huffman.Client_plane, var3, var4, var9, false, var44.entity);
						}
					}

					if (var8 == 3) { // L: 6454
						FloorDecoration var45 = ScriptEvent.scene.getFloorDecoration(Huffman.Client_plane, var3, var4); // L: 6455
						if (var45 != null) { // L: 6456
							var45.entity = new DynamicObject(UserComparator9.Entity_unpackID(var45.tag), 22, var7, Huffman.Client_plane, var3, var4, var9, false, var45.entity);
						}
					}
				}

			} else if (class194.field2368 == var0) { // L: 6461
				var2 = var1.method5657(); // L: 6462
				var3 = var1.method5639(); // L: 6463
				var4 = (var3 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6464
				var5 = (var3 & 7) + ScriptEvent.field597; // L: 6465
				var6 = var1.method5639(); // L: 6466
				var7 = var1.method5655(); // L: 6467
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) { // L: 6468
					var4 = var4 * 128 + 64; // L: 6469
					var5 = var5 * 128 + 64; // L: 6470
					GraphicsObject var33 = new GraphicsObject(var2, Huffman.Client_plane, var4, var5, ArchiveLoader.getTileHeight(var4, var5, Huffman.Client_plane) - var6, var7, Client.cycle); // L: 6471
					Client.graphicsObjects.addFirst(var33); // L: 6472
				}

			} else if (class194.field2362 == var0) { // L: 6476
				var2 = var1.method5646(); // L: 6477
				var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6478
				var4 = (var2 & 7) + ScriptEvent.field597; // L: 6479
				var5 = var1.method5639(); // L: 6480
				var6 = var5 >> 2; // L: 6481
				var7 = var5 & 3; // L: 6482
				var8 = Client.field736[var6]; // L: 6483
				var9 = var1.method5657(); // L: 6484
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6485
					class9.updatePendingSpawn(Huffman.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1); // L: 6486
				}

			} else if (class194.field2367 == var0) { // L: 6490
				var2 = var1.method5646(); // L: 6491
				var3 = var2 >> 2; // L: 6492
				var4 = var2 & 3; // L: 6493
				var5 = Client.field736[var3]; // L: 6494
				var6 = var1.method5612(); // L: 6495
				var7 = (var6 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6496
				var8 = (var6 & 7) + ScriptEvent.field597; // L: 6497
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 6498
					class9.updatePendingSpawn(Huffman.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1); // L: 6499
				}

			} else {
				TileItem var31;
				if (class194.field2363 == var0) { // L: 6503
					var2 = var1.method5612(); // L: 6504
					var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6505
					var4 = (var2 & 7) + ScriptEvent.field597; // L: 6506
					var5 = var1.readUnsignedShort(); // L: 6507
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6508
						NodeDeque var32 = Client.groundItems[Huffman.Client_plane][var3][var4]; // L: 6509
						if (var32 != null) { // L: 6510
							for (var31 = (TileItem)var32.last(); var31 != null; var31 = (TileItem)var32.previous()) { // L: 6511 6512 6517
								if ((var5 & 32767) == var31.id) { // L: 6513
									var31.remove(); // L: 6514
									break;
								}
							}

							if (var32.last() == null) { // L: 6519
								Client.groundItems[Huffman.Client_plane][var3][var4] = null;
							}

							class13.updateItemPile(var3, var4); // L: 6520
						}
					}

				} else if (class194.field2370 == var0) { // L: 6525
					var2 = var1.readUnsignedByte(); // L: 6526
					var3 = (var2 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6527
					var4 = (var2 & 7) + ScriptEvent.field597; // L: 6528
					var5 = var1.method5656(); // L: 6529
					var6 = var1.method5657(); // L: 6530
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 6531
						var31 = new TileItem(); // L: 6532
						var31.id = var6; // L: 6533
						var31.quantity = var5; // L: 6534
						if (Client.groundItems[Huffman.Client_plane][var3][var4] == null) { // L: 6535
							Client.groundItems[Huffman.Client_plane][var3][var4] = new NodeDeque();
						}

						Client.groundItems[Huffman.Client_plane][var3][var4].addFirst(var31); // L: 6536
						class13.updateItemPile(var3, var4); // L: 6537
					}

				} else {
					if (class194.field2366 == var0) { // L: 6541
						byte var37 = var1.readByte(); // L: 6542
						var38 = var1.method5649(); // L: 6543
						var4 = var1.readUnsignedShort(); // L: 6544
						byte var39 = var1.readByte(); // L: 6545
						byte var40 = var1.method5649(); // L: 6546
						var7 = var1.readUnsignedShort(); // L: 6547
						var8 = var1.method5656(); // L: 6548
						var9 = var1.readUnsignedByte(); // L: 6549
						var10 = (var9 >> 4 & 7) + WorldMapIcon_0.field154; // L: 6550
						var11 = (var9 & 7) + ScriptEvent.field597; // L: 6551
						var12 = var1.method5646(); // L: 6552
						var13 = var12 >> 2; // L: 6553
						var14 = var12 & 3; // L: 6554
						int var15 = Client.field736[var13]; // L: 6555
						int var16 = var1.readUnsignedShort(); // L: 6556
						Player var17;
						if (var4 == Client.localPlayerIndex) { // L: 6558
							var17 = WorldMapLabelSize.localPlayer;
						} else {
							var17 = Client.players[var4]; // L: 6559
						}

						if (var17 != null) { // L: 6560
							ObjectDefinition var18 = MidiPcmStream.getObjectDefinition(var16); // L: 6561
							int var19;
							int var20;
							if (var14 != 1 && var14 != 3) { // L: 6564
								var19 = var18.sizeX; // L: 6569
								var20 = var18.sizeY; // L: 6570
							} else {
								var19 = var18.sizeY; // L: 6565
								var20 = var18.sizeX; // L: 6566
							}

							int var21 = var10 + (var19 >> 1); // L: 6572
							int var22 = var10 + (var19 + 1 >> 1); // L: 6573
							int var23 = var11 + (var20 >> 1); // L: 6574
							int var24 = var11 + (var20 + 1 >> 1); // L: 6575
							int[][] var25 = Tiles.Tiles_heights[Huffman.Client_plane]; // L: 6576
							int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2; // L: 6577
							int var27 = (var10 << 7) + (var19 << 6); // L: 6578
							int var28 = (var11 << 7) + (var20 << 6); // L: 6579
							Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28); // L: 6580
							if (var29 != null) { // L: 6581
								class9.updatePendingSpawn(Huffman.Client_plane, var10, var11, var15, -1, 0, 0, var8 + 1, var7 + 1); // L: 6582
								var17.animationCycleStart = var8 + Client.cycle; // L: 6583
								var17.animationCycleEnd = var7 + Client.cycle; // L: 6584
								var17.model0 = var29; // L: 6585
								var17.field645 = var19 * 64 + var10 * 128; // L: 6586
								var17.field640 = var20 * 64 + var11 * 128; // L: 6587
								var17.tileHeight2 = var26; // L: 6588
								byte var30;
								if (var38 > var40) { // L: 6589
									var30 = var38; // L: 6590
									var38 = var40; // L: 6591
									var40 = var30; // L: 6592
								}

								if (var37 > var39) { // L: 6594
									var30 = var37; // L: 6595
									var37 = var39; // L: 6596
									var39 = var30; // L: 6597
								}

								var17.field649 = var10 + var38; // L: 6599
								var17.field651 = var40 + var10; // L: 6600
								var17.field635 = var11 + var37; // L: 6601
								var17.field643 = var11 + var39; // L: 6602
							}
						}
					}

				}
			}
		}
	} // L: 6363 6413 6459 6474 6488 6501 6523 6539 6606
}
