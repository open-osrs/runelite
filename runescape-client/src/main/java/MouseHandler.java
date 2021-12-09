import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1974176507
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1015915071
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2002408097
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 132217623
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 3083150075737463137L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 111248997
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 635129293
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 84217699
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = 7951220240586932353L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1653302159
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1984749271
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2029009913
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -3515226298509130765L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1962519181
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2047825447
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -459086865
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -569068817016549579L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 1070849037
	)
	static int field231;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "1878023149"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 76
		if (!var1.isAltDown() && var2 != 2) { // L: 77
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 78 79
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 124
			MouseHandler_idleCycles = 0; // L: 125
			MouseHandler_xVolatile = var1.getX(); // L: 126
			MouseHandler_yVolatile = var1.getY(); // L: 127
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 128
		}

	} // L: 130

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 83
			MouseHandler_idleCycles = 0; // L: 84
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 85
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 86
			MouseHandler_lastPressedTimeMillisVolatile = Ignored.method6459(); // L: 87
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 88
			if (MouseHandler_lastButtonVolatile != 0) { // L: 89
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 91
			var1.consume();
		}

	} // L: 92

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 95
			MouseHandler_idleCycles = 0; // L: 96
			MouseHandler_currentButtonVolatile = 0; // L: 97
		}

		if (var1.isPopupTrigger()) { // L: 99
			var1.consume();
		}

	} // L: 100

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 103
			var1.consume();
		}

	} // L: 104

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 107
	} // L: 108

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 120
	} // L: 121

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 135
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 136

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 111
			MouseHandler_idleCycles = 0; // L: 112
			MouseHandler_xVolatile = -1; // L: 113
			MouseHandler_yVolatile = -1; // L: 114
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 115
		}

	} // L: 117

	public final void focusGained(FocusEvent var1) {
	} // L: 132

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfs;",
		garbageValue = "-1905138755"
	)
	static VerticalAlignment[] method651() {
		return new VerticalAlignment[]{VerticalAlignment.field1869, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1870}; // L: 14
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "7"
	)
	public static boolean method649(int var0) {
		return (var0 >> 29 & 1) != 0; // L: 33
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "769924990"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 5476
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 5477
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 5478
				int var3 = var2.x >> 7; // L: 5479
				int var4 = var2.y >> 7; // L: 5480
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 5481
					if (var2.field1120 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 5482
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 5483
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 5484
					}

					long var5 = SecureRandomFuture.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 5486
					var2.playerCycle = Client.cycle; // L: 5487
					class7.scene.drawEntity(class20.Client_plane, var2.x, var2.y, FaceNormal.getTileHeight(var2.field1120 * 64 - 64 + var2.x, var2.field1120 * 64 - 64 + var2.y, class20.Client_plane), var2.field1120 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 5488
				}
			}
		}

	} // L: 5492

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "16"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class20.Client_plane][var0][var1]; // L: 8234
		if (var2 == null) { // L: 8235
			class7.scene.removeGroundItemPile(class20.Client_plane, var0, var1); // L: 8236
		} else {
			long var3 = -99999999L; // L: 8239
			TileItem var5 = null; // L: 8240

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8241 8242 8250
				ItemComposition var7 = UserComparator6.ItemDefinition_get(var6.id); // L: 8243
				long var11 = (long)var7.price; // L: 8244
				if (var7.isStackable == 1) { // L: 8245
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 8246
					var3 = var11; // L: 8247
					var5 = var6; // L: 8248
				}
			}

			if (var5 == null) { // L: 8252
				class7.scene.removeGroundItemPile(class20.Client_plane, var0, var1); // L: 8253
			} else {
				var2.addLast(var5); // L: 8256
				TileItem var13 = null; // L: 8257
				TileItem var8 = null; // L: 8258

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8259 8260 8265
					if (var6.id != var5.id) { // L: 8261
						if (var13 == null) { // L: 8262
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8263
							var8 = var6;
						}
					}
				}

				long var9 = SecureRandomFuture.calculateTag(var0, var1, 3, false, 0); // L: 8267
				class7.scene.newGroundItemPile(class20.Client_plane, var0, var1, FaceNormal.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class20.Client_plane), var5, var9, var13, var8); // L: 8268
			}
		}
	} // L: 8237 8254 8269

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static void method646(int var0, int var1) {
		int var2 = class136.fontBold12.stringWidth("Choose Option"); // L: 8974

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) { // L: 8975
			Font var7 = class136.fontBold12; // L: 8976
			String var8;
			if (var3 < 0) { // L: 8979
				var8 = ""; // L: 8980
			} else if (Client.menuTargets[var3].length() > 0) { // L: 8983
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3]; // L: 8984
			}

			int var6 = var7.stringWidth(var8); // L: 8986
			if (var6 > var2) { // L: 8987
				var2 = var6;
			}
		}

		var2 += 8; // L: 8989
		var3 = Client.menuOptionsCount * 15 + 22; // L: 8990
		int var4 = var0 - var2 / 2; // L: 8991
		if (var2 + var4 > class186.canvasWidth) { // L: 8992
			var4 = class186.canvasWidth - var2;
		}

		if (var4 < 0) { // L: 8993
			var4 = 0;
		}

		int var5 = var1; // L: 8994
		if (var3 + var1 > BoundaryObject.canvasHeight) { // L: 8995
			var5 = BoundaryObject.canvasHeight - var3;
		}

		if (var5 < 0) { // L: 8996
			var5 = 0;
		}

		ModeWhere.menuX = var4; // L: 8997
		BufferedSink.menuY = var5; // L: 8998
		GameObject.menuWidth = var2; // L: 8999
		UserComparator3.menuHeight = Client.menuOptionsCount * 15 + 22; // L: 9000
	} // L: 9001

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIB)V",
		garbageValue = "-97"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10975
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10976
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10977
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10978
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10979
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10980
		}

		if (var0.yAlignment == 0) { // L: 10981
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10982
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10983
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10984
		} else if (var0.yAlignment == 4) { // L: 10985
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10986
		}

	} // L: 10987
}
