import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 996345837
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1273849555
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2115208813
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -575888969
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -393031685
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -2981327926764741279L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -279954639
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -581221331
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -6548306948160213705L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 950852407
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 53768097
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1335668523
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = -8304358038408735417L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1344493173
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -42560979
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1647084327
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -4462860366380858355L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static IndexedSprite field523;
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	static Widget field525;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0;
		MouseHandler_currentButtonVolatile = 0;
		MouseHandler_xVolatile = -1;
		MouseHandler_yVolatile = -1;
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "1643778515"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 55
		if (!var1.isAltDown() && var2 != 2) { // L: 56
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 57 58
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 103
			MouseHandler_idleCycles = 0; // L: 104
			MouseHandler_xVolatile = var1.getX(); // L: 105
			MouseHandler_yVolatile = var1.getY(); // L: 106
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 107
		}

	} // L: 109

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 62
			MouseHandler_idleCycles = 0; // L: 63
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 64
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 65
			MouseHandler_lastPressedTimeMillisVolatile = User.currentTimeMillis(); // L: 66
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 67
			if (MouseHandler_lastButtonVolatile != 0) { // L: 68
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0; // L: 76
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) {
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen();
		}

	} // L: 96

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-203771743"
	)
	static void method1177(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Z",
		garbageValue = "1"
	)
	static boolean method1176(String var0, int var1) {
		return WorldMapManager.method735(var0, var1, "openjs"); // L: 50
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lfh;B)V",
		garbageValue = "-2"
	)
	static final void method1174(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 78
			for (var10 = 0; var10 < 8; ++var10) { // L: 79
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) {
					int[] var10000 = var8[var1].flags[var9 + var2]; // L: 80
					var10000[var3 + var10] &= -16777217;
				}
			}
		}

		Buffer var13 = new Buffer(var0); // L: 83

		for (var10 = 0; var10 < 4; ++var10) { // L: 84
			for (int var11 = 0; var11 < 64; ++var11) { // L: 85
				for (int var12 = 0; var12 < 64; ++var12) { // L: 86
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 87
						HealthBarUpdate.loadTerrain(var13, var1, var2 + Varps.method4122(var11 & 7, var12 & 7, var7), var3 + MusicPatchNode2.method3831(var11 & 7, var12 & 7, var7), 0, 0, var7); // L: 88
					} else {
						HealthBarUpdate.loadTerrain(var13, 0, -1, -1, 0, 0, 0); // L: 90
					}
				}
			}
		}

	} // L: 94

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-128859351"
	)
	static int method1152(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 1122
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1123
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = JagexCache.Widget_unpackTargetMask(WorldMapData_0.getWidgetFlags(var3)); // L: 1124
			return 1; // L: 1125
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1127
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1134
				if (var3.dataText == null) { // L: 1135
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1136
				}

				return 1; // L: 1137
			} else {
				return 2; // L: 1139
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 1128
			--var4; // L: 1129
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1130
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1131
			} else {
				Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1132
		}
	}
}
