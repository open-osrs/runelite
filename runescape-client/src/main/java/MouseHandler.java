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

@ObfuscatedName("ah")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	@Export("mouseWheel")
	static class144 mouseWheel;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1036288491
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -422885389
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -19196403
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 197302675
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 8130240115469217441L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1212092085
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1137004173
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 8667664769144098865L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1769064135
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1482494963
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 363259853
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1639433965
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -7568180939030180395L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 307748861
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -994811429
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1483939719
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		longValue = 5932498801769663649L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1129600087
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0;
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "-42"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 70
		if (!var1.isAltDown() && var2 != 2) { // L: 71
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 72 73
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 118
			MouseHandler_idleCycles = 0; // L: 119
			MouseHandler_xVolatile = var1.getX(); // L: 120
			MouseHandler_yVolatile = var1.getY(); // L: 121
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 122
		}

	} // L: 124

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 97
			var1.consume();
		}

	} // L: 98

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	} // L: 102

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 105
			MouseHandler_idleCycles = 0; // L: 106
			MouseHandler_xVolatile = -1; // L: 107
			MouseHandler_yVolatile = -1; // L: 108
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 109
		}

	} // L: 111

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 114
	} // L: 115

	public final void focusGained(FocusEvent var1) {
	} // L: 126

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 129
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 130

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 77
			MouseHandler_idleCycles = 0; // L: 78
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 79
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 80
			MouseHandler_lastPressedTimeMillisVolatile = class111.method2516(); // L: 81
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 82
			if (MouseHandler_lastButtonVolatile != 0) { // L: 83
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 85
			var1.consume();
		}

	} // L: 86

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 89
			MouseHandler_idleCycles = 0; // L: 90
			MouseHandler_currentButtonVolatile = 0; // L: 91
		}

		if (var1.isPopupTrigger()) { // L: 93
			var1.consume();
		}

	} // L: 94

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfm;",
		garbageValue = "58"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 35
		if (var1 != null) { // L: 36
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 37
			var1 = new SequenceDefinition(); // L: 38
			if (var2 != null) { // L: 39
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 40
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 41
			return var1; // L: 42
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lpg;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 99
			var2 = (RunException)var0; // L: 100
			var2.message = var2.message + ' ' + var1; // L: 101
		} else {
			var2 = new RunException(var0, var1); // L: 103
		}

		return var2; // L: 104
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1583806912"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "15047"
	)
	static int method626(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field801 - 7.0D) * 256.0D); // L: 3634
	}
}
