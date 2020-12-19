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

@ObfuscatedName("bc")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1946834755
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 775805491
	)
	@Export("MouseHandler_idleCycles")
	static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 573166023
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1601241931
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -393042359
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 2107554156313021357L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -40540789
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1140294545
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 3330713262365834661L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1471802557
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -424181839
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -896112983
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 4573498381714569869L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1823163477
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -246658433
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1476930385
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -5526312633867782885L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ez")
	static int[] field487;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -139305955
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;

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
		MouseHandler_lastPressedXVolatile = 0;
		MouseHandler_lastPressedYVolatile = 0;
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-2088746983"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 67
		if (!var1.isAltDown() && var2 != 2) { // L: 68
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 69 70
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 115
			MouseHandler_idleCycles = 0; // L: 116
			MouseHandler_xVolatile = var1.getX(); // L: 117
			MouseHandler_yVolatile = var1.getY(); // L: 118
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 119
		}

	} // L: 121

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 126
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 127

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 76
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 77
			MouseHandler_lastPressedTimeMillisVolatile = class298.currentTimeMillis(); // L: 78
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 79
			if (MouseHandler_lastButtonVolatile != 0) { // L: 80
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 94
			var1.consume();
		}

	} // L: 95

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 102
			MouseHandler_idleCycles = 0; // L: 103
			MouseHandler_xVolatile = -1; // L: 104
			MouseHandler_yVolatile = -1; // L: 105
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 106
		}

	} // L: 108

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 86
			MouseHandler_idleCycles = 0; // L: 87
			MouseHandler_currentButtonVolatile = 0; // L: 88
		}

		if (var1.isPopupTrigger()) { // L: 90
			var1.consume();
		}

	} // L: 91

	public final void focusGained(FocusEvent var1) {
	} // L: 123

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 98
	} // L: 99

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 111
	} // L: 112

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;I)V",
		garbageValue = "-1589242946"
	)
	public static void method1157(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 26
	} // L: 27

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-870366396"
	)
	static int method1156(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field1093 - 7.0D) * 256.0D); // L: 3263
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1220632952"
	)
	static boolean method1150() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4795
	}
}
