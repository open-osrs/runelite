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

@ObfuscatedName("ab")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1203671229
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1070541047
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 671107575
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1944795407
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 6457713861817890273L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1502128885
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -661389681
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -563072281
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -7265018834219168001L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -662783221
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1121821905
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1456763281
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 4471934586475877591L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 499374847
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 234052353
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 864945233
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -2883108443216478533L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "[Low;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-606551724"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 54
		if (!var1.isAltDown() && var2 != 2) { // L: 55
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 56 57
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 102
			MouseHandler_idleCycles = 0; // L: 103
			MouseHandler_xVolatile = var1.getX(); // L: 104
			MouseHandler_yVolatile = var1.getY(); // L: 105
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 106
		}

	} // L: 108

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 61
			MouseHandler_idleCycles = 0;
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 63
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 64
			MouseHandler_lastPressedTimeMillisVolatile = Archive.currentTimeMillis(); // L: 65
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 66
			if (MouseHandler_lastButtonVolatile != 0) { // L: 67
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 69
			var1.consume();
		}

	} // L: 70

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 81
			var1.consume();
		}

	} // L: 82

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 98
	} // L: 99

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 85
	} // L: 86

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 113
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 114

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 89
			MouseHandler_idleCycles = 0; // L: 90
			MouseHandler_xVolatile = -1; // L: 91
			MouseHandler_yVolatile = -1; // L: 92
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 93
		}

	} // L: 95

	public final void focusGained(FocusEvent var1) {
	} // L: 110

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 73
			MouseHandler_idleCycles = 0; // L: 74
			MouseHandler_currentButtonVolatile = 0; // L: 75
		}

		if (var1.isPopupTrigger()) { // L: 77
			var1.consume();
		}

	} // L: 78

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1680800354"
	)
	public static int method688(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0]; // L: 58
		int var1 = (int)(var2 >>> 7 & 127L); // L: 60
		return var1; // L: 62
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1494646828"
	)
	static final void method686() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) { // L: 4030
			int var1 = Client.npcIndices[var0]; // L: 4031
			NPC var2 = Client.npcs[var1]; // L: 4032
			if (var2 != null) { // L: 4033
				class35.updateActorSequence(var2, var2.definition.size); // L: 4034
			}
		}

	} // L: 4037
}
