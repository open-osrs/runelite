import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ar")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("MouseHandler_instance")
	static MouseHandler MouseHandler_instance;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -2009408369
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1655097803
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1775381995
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -287499463
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1278537481
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 7684175983304981365L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 320986893
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1997230525
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		longValue = -23953879977166285L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -659702837
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1493673469
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2049905729
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 4257889617743394737L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1535018267
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1275346307
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1778744007
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -2098715734298926973L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("dy")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("go")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

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
		MouseHandler_lastPressedX = 0;
		MouseHandler_lastPressedY = 0;
		MouseHandler_lastPressedTimeMillis = 0L;
	}

	MouseHandler() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-171580309"
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
			MouseHandler_lastPressedTimeMillisVolatile = ObjectSound.currentTimeMillis(); // L: 87
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

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 107
	} // L: 108

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 120
	} // L: 121

	public final void focusGained(FocusEvent var1) {
	} // L: 132

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

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 103
			var1.consume();
		}

	} // L: 104

	@ObfuscatedName("f")
	public static String method724(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0)); // L: 30
		int var2 = Calendar.Calendar_calendar.get(7); // L: 31
		int var3 = Calendar.Calendar_calendar.get(5); // L: 32
		int var4 = Calendar.Calendar_calendar.get(2); // L: 33
		int var5 = Calendar.Calendar_calendar.get(1); // L: 34
		int var6 = Calendar.Calendar_calendar.get(11); // L: 35
		int var7 = Calendar.Calendar_calendar.get(12); // L: 36
		int var8 = Calendar.Calendar_calendar.get(13); // L: 37
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT"; // L: 38
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lme;ILjava/lang/String;S)Ljava/lang/String;",
		garbageValue = "-709"
	)
	static String method725(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 44
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 45
			return var3 == null ? var2 : (String)var3.obj; // L: 46 47
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "-76"
	)
	@Export("isWriteable")
	static boolean isWriteable(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 232
			int var3 = var2.read(); // L: 233
			var2.seek(0L); // L: 234
			var2.write(var3); // L: 235
			var2.seek(0L); // L: 236
			var2.close(); // L: 237
			if (var1) { // L: 238
				var0.delete();
			}

			return true; // L: 239
		} catch (Exception var4) { // L: 241
			return false; // L: 242
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1530869780"
	)
	static int method726(int var0, Script var1, boolean var2) {
		Widget var6;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1210
			int var4;
			if (var0 == 1928) { // L: 1227
				var6 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1228
				var4 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 1229
				if (var4 >= 1 && var4 <= 10) { // L: 1230
					class376.widgetDefaultMenuAction(var4, var6.id, var6.childIndex, var6.itemId, ""); // L: 1233
					return 1; // L: 1234
				} else {
					throw new RuntimeException(); // L: 1231
				}
			} else if (var0 == 2928) { // L: 1236
				class16.Interpreter_intStackSize -= 3; // L: 1237
				int var3 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 1238
				var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 1239
				int var5 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 1240
				if (var5 >= 1 && var5 <= 10) { // L: 1241
					class376.widgetDefaultMenuAction(var5, var3, var4, class139.getWidget(var3).itemId, ""); // L: 1244
					return 1; // L: 1245
				} else {
					throw new RuntimeException(); // L: 1242
				}
			} else {
				return 2; // L: 1247
			}
		} else if (Interpreter.field950 >= 10) { // L: 1211
			throw new RuntimeException(); // L: 1212
		} else {
			if (var0 >= 2000) { // L: 1215
				var6 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]); // L: 1216
			} else {
				var6 = var2 ? FriendSystem.scriptDotWidget : class4.scriptActiveWidget; // L: 1218
			}

			if (var6.onResize == null) { // L: 1219
				return 0;
			} else {
				ScriptEvent var7 = new ScriptEvent(); // L: 1220
				var7.widget = var6; // L: 1221
				var7.args = var6.onResize; // L: 1222
				var7.field1154 = Interpreter.field950 + 1; // L: 1223
				Client.scriptEvents.addFirst(var7); // L: 1224
				return 1; // L: 1225
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	static final void method707() {
		Client.field797 = Client.cycleCntr; // L: 11505
	} // L: 11506
}
