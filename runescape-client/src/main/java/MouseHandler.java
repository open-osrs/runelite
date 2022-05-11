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

@ObfuscatedName("ae")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1681939429
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1954795539
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -990713497
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2068251699
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1733497125
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 8288662778520390807L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -7279409155159127695L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 86476017
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1263316171
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 14622161
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1442175051
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 844374905
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 6423114043985559653L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 265860113
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1874338505
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 797268567
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 1079896650509100317L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;

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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-845105013"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 68
		if (!var1.isAltDown() && var2 != 2) { // L: 69
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 70 71
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 116
			MouseHandler_idleCycles = 0; // L: 117
			MouseHandler_xVolatile = var1.getX(); // L: 118
			MouseHandler_yVolatile = var1.getY(); // L: 119
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 120
		}

	} // L: 122

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 127
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 128

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 87
			MouseHandler_idleCycles = 0; // L: 88
			MouseHandler_currentButtonVolatile = 0; // L: 89
		}

		if (var1.isPopupTrigger()) { // L: 91
			var1.consume();
		}

	} // L: 92

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 95
			var1.consume();
		}

	} // L: 96

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	public final void focusGained(FocusEvent var1) {
	} // L: 124

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 112
	} // L: 113

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 75
			MouseHandler_idleCycles = 0; // L: 76
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 77
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 78
			MouseHandler_lastPressedTimeMillisVolatile = class113.method2624(); // L: 79
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 80
			if (MouseHandler_lastButtonVolatile != 0) { // L: 81
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 83
			var1.consume();
		}

	} // L: 84

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 103
			MouseHandler_idleCycles = 0; // L: 104
			MouseHandler_xVolatile = -1; // L: 105
			MouseHandler_yVolatile = -1; // L: 106
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 107
		}

	} // L: 109

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1658227237"
	)
	static void method588(int var0, int var1, int var2) {
		if (var0 != 0) { // L: 3774
			int var3 = var0 >> 8; // L: 3775
			int var4 = var0 >> 4 & 7; // L: 3776
			int var5 = var0 & 15; // L: 3777
			Client.soundEffectIds[Client.soundEffectCount] = var3; // L: 3778
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4; // L: 3779
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3780
			Client.soundEffects[Client.soundEffectCount] = null; // L: 3781
			int var6 = (var1 - 64) / 128; // L: 3782
			int var7 = (var2 - 64) / 128; // L: 3783
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16); // L: 3784
			++Client.soundEffectCount; // L: 3785
		}
	} // L: 3786

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1845150784"
	)
	static final void method591(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12078
		class12.clientPreferences.method2278(var0); // L: 12079
	} // L: 12080
}
