import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("l")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -953546055
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 649288631
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("j")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1423122717
	)
	static int field2585;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 170270171
	)
	static int field2579;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1898268003
	)
	static int field2580;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1146683373
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("s")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive19")
	static Archive archive19;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1260271458"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		SoundSystem.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "457176058"
	)
	static void method4556() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Ljt;",
		garbageValue = "1935657633"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = HealthBarUpdate.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IIIIIII)V",
		garbageValue = "1628744155"
	)
	static final void method4559(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field551) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field551 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !VarbitComposition.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class16.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class16.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class16.invalidateWidget(var0);
				Client.field551 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class16.invalidateWidget(var0);
			}
		}

	}
}
