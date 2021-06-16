import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 706955279943509111L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -323054323
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -885858399
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1506829559
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -955747453
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -8056893470675873067L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1239059943
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1657999347
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1895436129
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 826495123
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1870863145
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1293703447
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 1966416586161698317L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1652979825
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 5633659
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 280210219
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -6822610554360794767L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "2128058823"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) { // L: 62
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0; // L: 110
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 113
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 70
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = ClientPacket.currentTimeMillis();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 76
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 88
			var1.consume();
		}

	} // L: 89

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 92
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1; // L: 98
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 80
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0; // L: 82
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILla;Ljf;I)V",
		garbageValue = "1715760839"
	)
	static void method727(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 18
		var3.type = 1; // L: 19
		var3.key = (long)var0; // L: 20
		var3.archiveDisk = var1; // L: 21
		var3.archive = var2; // L: 22
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 24
		} // L: 25

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 27
			if (ArchiveDiskActionHandler.field3557 == 0) { // L: 28
				class305.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 29
				class305.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 30
				class305.ArchiveDiskActionHandler_thread.start(); // L: 31
				class305.ArchiveDiskActionHandler_thread.setPriority(5); // L: 32
			}

			ArchiveDiskActionHandler.field3557 = 600; // L: 34
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lns;I)V",
		garbageValue = "-1319930513"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class69.reflectionChecks.last(); // L: 35
		if (var1 != null) { // L: 36
			int var2 = var0.offset; // L: 37
			var0.writeInt(var1.id); // L: 38

			for (int var3 = 0; var3 < var1.size; ++var3) { // L: 39
				if (var1.creationErrors[var3] != 0) { // L: 40
					var0.writeByte(var1.creationErrors[var3]); // L: 41
				} else {
					try {
						int var4 = var1.operations[var3]; // L: 45
						Field var5;
						int var6;
						if (var4 == 0) { // L: 46
							var5 = var1.fields[var3]; // L: 47
							var6 = Reflection.getInt(var5, (Object)null); // L: 48
							var0.writeByte(0); // L: 49
							var0.writeInt(var6); // L: 50
						} else if (var4 == 1) { // L: 52
							var5 = var1.fields[var3]; // L: 53
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]); // L: 54
							var0.writeByte(0); // L: 55
						} else if (var4 == 2) { // L: 57
							var5 = var1.fields[var3]; // L: 58
							var6 = var5.getModifiers(); // L: 59
							var0.writeByte(0); // L: 60
							var0.writeInt(var6); // L: 61
						}

						Method var25;
						if (var4 != 3) { // L: 63
							if (var4 == 4) { // L: 83
								var25 = var1.methods[var3]; // L: 84
								var6 = var25.getModifiers(); // L: 85
								var0.writeByte(0); // L: 86
								var0.writeInt(var6); // L: 87
							}
						} else {
							var25 = var1.methods[var3]; // L: 64
							byte[][] var10 = var1.arguments[var3]; // L: 65
							Object[] var7 = new Object[var10.length]; // L: 66

							for (int var8 = 0; var8 < var10.length; ++var8) { // L: 67
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8])); // L: 68
								var7[var8] = var9.readObject(); // L: 69
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7); // L: 71
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) { // L: 77
								var0.writeByte(2); // L: 78
								var0.writeStringCp1252NullTerminated((String)var11); // L: 79
							} else {
								var0.writeByte(4); // L: 81
							}
						}
					} catch (ClassNotFoundException var13) { // L: 90
						var0.writeByte(-10); // L: 91
					} catch (InvalidClassException var14) { // L: 93
						var0.writeByte(-11); // L: 94
					} catch (StreamCorruptedException var15) { // L: 96
						var0.writeByte(-12); // L: 97
					} catch (OptionalDataException var16) { // L: 99
						var0.writeByte(-13); // L: 100
					} catch (IllegalAccessException var17) { // L: 102
						var0.writeByte(-14); // L: 103
					} catch (IllegalArgumentException var18) { // L: 105
						var0.writeByte(-15); // L: 106
					} catch (InvocationTargetException var19) { // L: 108
						var0.writeByte(-16); // L: 109
					} catch (SecurityException var20) { // L: 111
						var0.writeByte(-17); // L: 112
					} catch (IOException var21) { // L: 114
						var0.writeByte(-18); // L: 115
					} catch (NullPointerException var22) { // L: 117
						var0.writeByte(-19); // L: 118
					} catch (Exception var23) { // L: 120
						var0.writeByte(-20); // L: 121
					} catch (Throwable var24) { // L: 123
						var0.writeByte(-21); // L: 124
					}
				}
			}

			var0.writeCrc(var2); // L: 127
			var1.remove(); // L: 128
		}
	} // L: 129

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1544814105"
	)
	static int method718(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 482
			ChatChannel.Interpreter_intStackSize -= 3; // L: 483
			var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 484
			var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 485
			int var11 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 486
			if (var4 == 0) { // L: 487
				throw new RuntimeException(); // L: 488
			} else {
				Widget var6 = WorldMapData_1.getWidget(var9); // L: 490
				if (var6.children == null) { // L: 491
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 492
					Widget[] var7 = new Widget[var11 + 1]; // L: 493

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 494
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 495
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 497
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 498
					var12.type = var4; // L: 499
					var12.parentId = var12.id = var6.id; // L: 500
					var12.childIndex = var11; // L: 501
					var12.isIf3 = true; // L: 502
					var6.children[var11] = var12; // L: 503
					if (var2) { // L: 504
						UserComparator5.scriptDotWidget = var12;
					} else {
						User.scriptActiveWidget = var12; // L: 505
					}

					Script.invalidateWidget(var6); // L: 506
					return 1; // L: 507
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 509
				var3 = var2 ? UserComparator5.scriptDotWidget : User.scriptActiveWidget; // L: 510
				Widget var10 = WorldMapData_1.getWidget(var3.id); // L: 511
				var10.children[var3.childIndex] = null; // L: 512
				Script.invalidateWidget(var10); // L: 513
				return 1; // L: 514
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 516
				var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 517
				var3.children = null; // L: 518
				Script.invalidateWidget(var3); // L: 519
				return 1; // L: 520
			} else if (var0 == 103) { // L: 522
				ChatChannel.Interpreter_intStackSize -= 3; // L: 523
				return 1; // L: 524
			} else if (var0 == 104) { // L: 526
				--ChatChannel.Interpreter_intStackSize; // L: 527
				return 1; // L: 528
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 530
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 543
					var3 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 544
					if (var3 != null) { // L: 545
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 546
						if (var2) { // L: 547
							UserComparator5.scriptDotWidget = var3;
						} else {
							User.scriptActiveWidget = var3; // L: 548
						}
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 550
					}

					return 1; // L: 551
				} else if (var0 == 202) { // L: 553
					Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] = 0; // L: 554
					return 1; // L: 555
				} else if (var0 == 203) { // L: 557
					Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize + 1] = 0; // L: 558
					return 1; // L: 559
				} else {
					return 2; // L: 561
				}
			} else {
				ChatChannel.Interpreter_intStackSize -= 2; // L: 531
				var9 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 532
				var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 533
				Widget var5 = class17.getWidgetChild(var9, var4); // L: 534
				if (var5 != null && var4 != -1) { // L: 535
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 536
					if (var2) { // L: 537
						UserComparator5.scriptDotWidget = var5;
					} else {
						User.scriptActiveWidget = var5; // L: 538
					}
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 540
				}

				return 1; // L: 541
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)[Leq;",
		garbageValue = "47395397"
	)
	static HorizontalAlignment[] method726() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1632, HorizontalAlignment.field1630, HorizontalAlignment.HorizontalAlignment_centered}; // L: 14
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1550544078"
	)
	static void method750(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "292035251"
	)
	static int method747(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1364
			var5 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1365
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.itemId; // L: 1366
			return 1; // L: 1367
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1369
			var5 = WorldMapData_1.getWidget(Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]); // L: 1370
			if (var5.itemId != -1) { // L: 1371
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1372
			}

			return 1; // L: 1373
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1375
			int var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 1376
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1377
			if (var4 != null) { // L: 1378
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 1379
			}

			return 1; // L: 1380
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1382
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1383
			return 1; // L: 1384
		} else {
			return 2; // L: 1386
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1980065411"
	)
	static void method741() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4772
			class160.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4773
		}

	} // L: 4775

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-205223779"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		Widget var5 = class17.getWidgetChild(var1, var2); // L: 8818
		if (var5 != null) { // L: 8819
			if (var5.onOp != null) { // L: 8820
				ScriptEvent var6 = new ScriptEvent(); // L: 8821
				var6.widget = var5; // L: 8822
				var6.opIndex = var0; // L: 8823
				var6.targetName = var4; // L: 8824
				var6.args = var5.onOp; // L: 8825
				WorldMapSection1.runScriptEvent(var6); // L: 8826
			}

			boolean var8 = true; // L: 8828
			if (var5.contentType > 0) { // L: 8829
				var8 = class343.method6080(var5);
			}

			if (var8) { // L: 8830
				if (class136.method2696(class22.getWidgetFlags(var5), var0 - 1)) { // L: 8831
					PacketBufferNode var7;
					if (var0 == 1) { // L: 8834
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2658, Client.packetWriter.isaacCipher); // L: 8836
						var7.packetBuffer.writeInt(var1); // L: 8837
						var7.packetBuffer.writeShort(var2); // L: 8838
						var7.packetBuffer.writeShort(var3); // L: 8839
						Client.packetWriter.addNode(var7); // L: 8840
					}

					if (var0 == 2) { // L: 8842
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2631, Client.packetWriter.isaacCipher); // L: 8844
						var7.packetBuffer.writeInt(var1); // L: 8845
						var7.packetBuffer.writeShort(var2); // L: 8846
						var7.packetBuffer.writeShort(var3); // L: 8847
						Client.packetWriter.addNode(var7); // L: 8848
					}

					if (var0 == 3) { // L: 8850
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2630, Client.packetWriter.isaacCipher); // L: 8852
						var7.packetBuffer.writeInt(var1); // L: 8853
						var7.packetBuffer.writeShort(var2); // L: 8854
						var7.packetBuffer.writeShort(var3); // L: 8855
						Client.packetWriter.addNode(var7); // L: 8856
					}

					if (var0 == 4) { // L: 8858
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2659, Client.packetWriter.isaacCipher); // L: 8860
						var7.packetBuffer.writeInt(var1); // L: 8861
						var7.packetBuffer.writeShort(var2); // L: 8862
						var7.packetBuffer.writeShort(var3); // L: 8863
						Client.packetWriter.addNode(var7); // L: 8864
					}

					if (var0 == 5) { // L: 8866
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2588, Client.packetWriter.isaacCipher); // L: 8868
						var7.packetBuffer.writeInt(var1); // L: 8869
						var7.packetBuffer.writeShort(var2); // L: 8870
						var7.packetBuffer.writeShort(var3); // L: 8871
						Client.packetWriter.addNode(var7); // L: 8872
					}

					if (var0 == 6) { // L: 8874
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2579, Client.packetWriter.isaacCipher); // L: 8876
						var7.packetBuffer.writeInt(var1); // L: 8877
						var7.packetBuffer.writeShort(var2); // L: 8878
						var7.packetBuffer.writeShort(var3); // L: 8879
						Client.packetWriter.addNode(var7); // L: 8880
					}

					if (var0 == 7) { // L: 8882
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2660, Client.packetWriter.isaacCipher); // L: 8884
						var7.packetBuffer.writeInt(var1); // L: 8885
						var7.packetBuffer.writeShort(var2); // L: 8886
						var7.packetBuffer.writeShort(var3); // L: 8887
						Client.packetWriter.addNode(var7); // L: 8888
					}

					if (var0 == 8) { // L: 8890
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2633, Client.packetWriter.isaacCipher); // L: 8892
						var7.packetBuffer.writeInt(var1); // L: 8893
						var7.packetBuffer.writeShort(var2); // L: 8894
						var7.packetBuffer.writeShort(var3); // L: 8895
						Client.packetWriter.addNode(var7); // L: 8896
					}

					if (var0 == 9) { // L: 8898
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2598, Client.packetWriter.isaacCipher); // L: 8900
						var7.packetBuffer.writeInt(var1); // L: 8901
						var7.packetBuffer.writeShort(var2); // L: 8902
						var7.packetBuffer.writeShort(var3); // L: 8903
						Client.packetWriter.addNode(var7); // L: 8904
					}

					if (var0 == 10) { // L: 8906
						var7 = InterfaceParent.getPacketBufferNode(ClientPacket.field2592, Client.packetWriter.isaacCipher); // L: 8908
						var7.packetBuffer.writeInt(var1); // L: 8909
						var7.packetBuffer.writeShort(var2); // L: 8910
						var7.packetBuffer.writeShort(var3); // L: 8911
						Client.packetWriter.addNode(var7); // L: 8912
					}

				}
			}
		}
	} // L: 8832 8914
}
