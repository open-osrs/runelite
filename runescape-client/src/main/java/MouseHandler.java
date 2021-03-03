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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bl")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -7050613403176353347L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1826122279
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1193500929
	)
	@Export("MouseHandler_currentButtonVolatile")
	static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 69676803
	)
	@Export("MouseHandler_xVolatile")
	static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1528729291
	)
	@Export("MouseHandler_yVolatile")
	static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = -7426561845363356173L
	)
	@Export("MouseHandler_lastMovedVolatile")
	static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 411605215
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -414755305
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 586562237
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 635740657
	)
	@Export("MouseHandler_lastButtonVolatile")
	static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1027797435
	)
	@Export("MouseHandler_lastPressedXVolatile")
	static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1792893405
	)
	@Export("MouseHandler_lastPressedYVolatile")
	static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = -8649203811003384729L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -266650857
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -80903917
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -199008981
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 3494656380039963363L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 47148611
	)
	static int field512;

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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-287252269"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 57
		if (!var1.isAltDown() && var2 != 2) { // L: 58
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 59 60
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 105
			MouseHandler_idleCycles = 0; // L: 106
			MouseHandler_xVolatile = var1.getX(); // L: 107
			MouseHandler_yVolatile = var1.getY(); // L: 108
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 109
		}

	} // L: 111

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 64
			MouseHandler_idleCycles = 0; // L: 65
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 66
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 67
			MouseHandler_lastPressedTimeMillisVolatile = Tiles.currentTimeMillis(); // L: 68
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 69
			if (MouseHandler_lastButtonVolatile != 0) { // L: 70
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 72
			var1.consume();
		}

	} // L: 73

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 76
			MouseHandler_idleCycles = 0; // L: 77
			MouseHandler_currentButtonVolatile = 0; // L: 78
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	} // L: 81

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 84
			var1.consume();
		}

	} // L: 85

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 88
	} // L: 89

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 92
			MouseHandler_idleCycles = 0; // L: 93
			MouseHandler_xVolatile = -1; // L: 94
			MouseHandler_yVolatile = -1; // L: 95
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 96
		}

	} // L: 98

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 116
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 117

	public final void focusGained(FocusEvent var1) {
	} // L: 113

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 101
	} // L: 102

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;Lig;Lig;Lig;I)V",
		garbageValue = "1350296670"
	)
	public static void method1151(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		FontName.Widget_archive = var0; // L: 186
		DirectByteArrayCopier.Widget_modelsArchive = var1; // L: 187
		InterfaceParent.Widget_spritesArchive = var2; // L: 188
		Widget.Widget_fontsArchive = var3; // L: 189
		DefaultsGroup.Widget_interfaceComponents = new Widget[FontName.Widget_archive.getGroupCount()][]; // L: 190
		Widget.Widget_loadedInterfaces = new boolean[FontName.Widget_archive.getGroupCount()]; // L: 191
	} // L: 192

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1766193005"
	)
	public static int method1176(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 79
		return (var0 + var2) / var1 - var2; // L: 80
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZB)I",
		garbageValue = "-67"
	)
	static int method1174(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1281
			var5 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1282
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemId; // L: 1283
			return 1; // L: 1284
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1286
			var5 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1287
			if (var5.itemId != -1) { // L: 1288
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1289
			}

			return 1; // L: 1290
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1292
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1293
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1294
			if (var4 != null) { // L: 1295
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1296
			}

			return 1; // L: 1297
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1299
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1300
			return 1; // L: 1301
		} else {
			return 2; // L: 1303
		}
	}
}
