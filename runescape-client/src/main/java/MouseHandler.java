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
		MouseHandler_instance = new MouseHandler();
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
		MouseHandler_lastMovedVolatile = -1L;
		MouseHandler_currentButton = 0;
		MouseHandler_x = 0;
		MouseHandler_y = 0;
		MouseHandler_millis = 0L;
		MouseHandler_lastButtonVolatile = 0;
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L;
		MouseHandler_lastButton = 0;
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "1878023149"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton();
		if (!var1.isAltDown() && var2 != 2) {
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = var1.getX();
			MouseHandler_yVolatile = var1.getY();
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX();
			MouseHandler_lastPressedYVolatile = var1.getY();
			MouseHandler_lastPressedTimeMillisVolatile = Ignored.method6459();
			MouseHandler_lastButtonVolatile = this.getButton(var1);
			if (MouseHandler_lastButtonVolatile != 0) {
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_currentButtonVolatile = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_currentButtonVolatile = 0;
		}

	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0;
			MouseHandler_xVolatile = -1;
			MouseHandler_yVolatile = -1;
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfs;",
		garbageValue = "-1905138755"
	)
	static VerticalAlignment[] method651() {
		return new VerticalAlignment[]{VerticalAlignment.field1869, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1870};
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "7"
	)
	public static boolean method649(int var0) {
		return (var0 >> 29 & 1) != 0;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "769924990"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1120 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = SecureRandomFuture.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					class7.scene.drawEntity(class20.Client_plane, var2.x, var2.y, FaceNormal.getTileHeight(var2.field1120 * 64 - 64 + var2.x, var2.field1120 * 64 - 64 + var2.y, class20.Client_plane), var2.field1120 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "16"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class20.Client_plane][var0][var1];
		if (var2 == null) {
			class7.scene.removeGroundItemPile(class20.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = UserComparator6.ItemDefinition_get(var6.id);
				long var11 = (long)var7.price;
				if (var7.isStackable == 1) {
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) {
					var3 = var11;
					var5 = var6;
				}
			}

			if (var5 == null) {
				class7.scene.removeGroundItemPile(class20.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var13 = null;
				TileItem var8 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var13 == null) {
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) {
							var8 = var6;
						}
					}
				}

				long var9 = SecureRandomFuture.calculateTag(var0, var1, 3, false, 0);
				class7.scene.newGroundItemPile(class20.Client_plane, var0, var1, FaceNormal.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class20.Client_plane), var5, var9, var13, var8);
			}
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static void method646(int var0, int var1) {
		int var2 = class136.fontBold12.stringWidth("Choose Option");

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var7 = class136.fontBold12;
			String var8;
			if (var3 < 0) {
				var8 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var8 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var8 = Client.menuActions[var3];
			}

			int var6 = var7.stringWidth(var8);
			if (var6 > var2) {
				var2 = var6;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var4 = var0 - var2 / 2;
		if (var2 + var4 > class186.canvasWidth) {
			var4 = class186.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > BoundaryObject.canvasHeight) {
			var5 = BoundaryObject.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		ModeWhere.menuX = var4;
		BufferedSink.menuY = var5;
		GameObject.menuWidth = var2;
		UserComparator3.menuHeight = Client.menuOptionsCount * 15 + 22;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIB)V",
		garbageValue = "-97"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}

	}
}
