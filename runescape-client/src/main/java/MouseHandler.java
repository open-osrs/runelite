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

@ObfuscatedName("ar")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 107284469
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 46919017
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -196949191
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 44426053
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = 51726182366578667L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1741182953
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1113383001
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -601944997
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -3366277212682218721L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -173750849
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1130317715
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 533285241
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -5019639506180718005L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1259465113
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -416250337
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -769215047
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 4641952122808710007L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive4")
	static Archive archive4;

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
		descriptor = "(Ljava/awt/event/MouseEvent;B)I",
		garbageValue = "1"
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
			MouseHandler_lastPressedTimeMillisVolatile = WorldMapSprite.method4989(); // L: 66
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 67
			if (MouseHandler_lastButtonVolatile != 0) { // L: 68
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 90
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 94
		}

	} // L: 96

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 86
	} // L: 87

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0; // L: 76
		}

		if (var1.isPopupTrigger()) { // L: 78
			var1.consume();
		}

	} // L: 79

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZZB)Lqx;",
		garbageValue = "28"
	)
	static IndexedSprite method622(boolean var0, boolean var1) {
		return var0 ? (var1 ? class143.field1639 : Skeleton.options_buttons_2Sprite) : (var1 ? InvDefinition.field1814 : class160.options_buttons_0Sprite); // L: 274
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Law;I)V",
		garbageValue = "1699393273"
	)
	static void method621(GameEngine var0) {
		while (class16.isKeyDown()) { // L: 1957
			if (class241.field2833 == 13) { // L: 1958
				Login.worldSelectOpen = false; // L: 1960
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1961
				class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1962
				HorizontalAlignment.logoSprite.drawAt(Login.xPadding + 382 - HorizontalAlignment.logoSprite.subWidth / 2, 18); // L: 1963
				return; // L: 1965
			}

			if (class241.field2833 == 96) { // L: 1967
				if (Login.worldSelectPage > 0 && Interpreter.worldSelectLeftSprite != null) { // L: 1968
					--Login.worldSelectPage; // L: 1969
				}
			} else if (class241.field2833 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class124.worldSelectRightSprite != null) { // L: 1972 1973
				++Login.worldSelectPage; // L: 1974
			}
		}

		if (MouseHandler_lastButton == 1 || !UserComparator5.mouseCam && MouseHandler_lastButton == 4) { // L: 1978
			int var1 = Login.xPadding + 280; // L: 1979
			if (MouseHandler_lastPressedX >= var1 && MouseHandler_lastPressedX <= var1 + 14 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 1980
				Interpreter.changeWorldSelectSorting(0, 0); // L: 1981
				return; // L: 1982
			}

			if (MouseHandler_lastPressedX >= var1 + 15 && MouseHandler_lastPressedX <= var1 + 80 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 1984
				Interpreter.changeWorldSelectSorting(0, 1); // L: 1985
				return; // L: 1986
			}

			int var2 = Login.xPadding + 390; // L: 1988
			if (MouseHandler_lastPressedX >= var2 && MouseHandler_lastPressedX <= var2 + 14 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 1989
				Interpreter.changeWorldSelectSorting(1, 0); // L: 1990
				return; // L: 1991
			}

			if (MouseHandler_lastPressedX >= var2 + 15 && MouseHandler_lastPressedX <= var2 + 80 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 1993
				Interpreter.changeWorldSelectSorting(1, 1); // L: 1994
				return; // L: 1995
			}

			int var3 = Login.xPadding + 500; // L: 1997
			if (MouseHandler_lastPressedX >= var3 && MouseHandler_lastPressedX <= var3 + 14 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 1998
				Interpreter.changeWorldSelectSorting(2, 0); // L: 1999
				return; // L: 2000
			}

			if (MouseHandler_lastPressedX >= var3 + 15 && MouseHandler_lastPressedX <= var3 + 80 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 2002
				Interpreter.changeWorldSelectSorting(2, 1); // L: 2003
				return; // L: 2004
			}

			int var4 = Login.xPadding + 610; // L: 2006
			if (MouseHandler_lastPressedX >= var4 && MouseHandler_lastPressedX <= var4 + 14 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 2007
				Interpreter.changeWorldSelectSorting(3, 0); // L: 2008
				return; // L: 2009
			}

			if (MouseHandler_lastPressedX >= var4 + 15 && MouseHandler_lastPressedX <= var4 + 80 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedY <= 18) { // L: 2011
				Interpreter.changeWorldSelectSorting(3, 1); // L: 2012
				return; // L: 2013
			}

			if (MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler_lastPressedY >= 4 && MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler_lastPressedY <= 20) { // L: 2015
				Login.worldSelectOpen = false; // L: 2017
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2018
				class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2019
				HorizontalAlignment.logoSprite.drawAt(Login.xPadding + 382 - HorizontalAlignment.logoSprite.subWidth / 2, 18); // L: 2020
				return; // L: 2022
			}

			if (Login.hoveredWorldIndex != -1) { // L: 2024
				World var5 = World.World_worlds[Login.hoveredWorldIndex]; // L: 2025
				ItemContainer.changeWorld(var5); // L: 2026
				Login.worldSelectOpen = false; // L: 2028
				Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2029
				class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2030
				HorizontalAlignment.logoSprite.drawAt(Login.xPadding + 382 - HorizontalAlignment.logoSprite.subWidth / 2, 18); // L: 2031
				return; // L: 2033
			}

			if (Login.worldSelectPage > 0 && Interpreter.worldSelectLeftSprite != null && MouseHandler_lastPressedX >= 0 && MouseHandler_lastPressedX <= Interpreter.worldSelectLeftSprite.subWidth && MouseHandler_lastPressedY >= class309.canvasHeight / 2 - 50 && MouseHandler_lastPressedY <= class309.canvasHeight / 2 + 50) { // L: 2035
				--Login.worldSelectPage; // L: 2036
			}

			if (Login.worldSelectPage < Login.worldSelectPagesCount && class124.worldSelectRightSprite != null && MouseHandler_lastPressedX >= class4.canvasWidth - class124.worldSelectRightSprite.subWidth - 5 && MouseHandler_lastPressedX <= class4.canvasWidth && MouseHandler_lastPressedY >= class309.canvasHeight / 2 - 50 && MouseHandler_lastPressedY <= class309.canvasHeight / 2 + 50) { // L: 2038
				++Login.worldSelectPage; // L: 2039
			}
		}

	} // L: 2042

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "797091978"
	)
	static final void method593() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear(); // L: 2583
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 2586
		KitDefinition.KitDefinition_cached.clear(); // L: 2589
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 2592
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 2593
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 2594
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 2595
		WorldMapDecoration.method4988(); // L: 2597
		ItemComposition.ItemDefinition_cached.clear(); // L: 2599
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 2600
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 2601
		SequenceDefinition.SequenceDefinition_cached.clear(); // L: 2604
		SequenceDefinition.SequenceDefinition_cachedFrames.clear(); // L: 2605
		SequenceDefinition.SequenceDefinition_cachedModel.clear(); // L: 2606
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 2609
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 2610
		VarbitComposition.VarbitDefinition_cached.clear(); // L: 2613
		FontName.method7509(); // L: 2615
		ScriptEvent.HitSplatDefinition_cachedSprites.method7640(); // L: 2616
		FontName.HitSplatDefinition_cached.method7640(); // L: 2617
		class146.method3040(); // L: 2618
		UserComparator1.method8029(); // L: 2619
		class141.method2995(); // L: 2620
		StructComposition.method3605(); // L: 2621
		PacketWriter.method2485(); // L: 2622
		PlayerComposition.PlayerAppearance_cachedModels.clear(); // L: 2624
		Widget.Widget_cachedSprites.clear(); // L: 2627
		Widget.Widget_cachedModels.clear(); // L: 2628
		Widget.Widget_cachedFonts.clear(); // L: 2629
		Widget.Widget_cachedSpriteMasks.clear(); // L: 2630
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 2632
		Script.Script_cached.clear(); // L: 2633
		TileItem.archive0.clearFiles(); // L: 2634
		class321.archive1.clearFiles(); // L: 2635
		class121.archive3.clearFiles(); // L: 2636
		archive4.clearFiles(); // L: 2637
		class302.archive5.clearFiles(); // L: 2638
		ArchiveLoader.archive6.clearFiles(); // L: 2639
		class145.archive7.clearFiles(); // L: 2640
		WorldMapData_1.archive8.clearFiles(); // L: 2641
		class132.archive9.clearFiles(); // L: 2642
		World.archive10.clearFiles(); // L: 2643
		class268.archive11.clearFiles(); // L: 2644
		class135.archive12.clearFiles(); // L: 2645
	} // L: 2646

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1201561793"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class182.pcmPlayer1 != null) { // L: 3298
			class182.pcmPlayer1.run();
		}

		if (class290.pcmPlayer0 != null) { // L: 3299
			class290.pcmPlayer0.run();
		}

	} // L: 3300

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1506401046"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (MusicPatchNode2.loadInterface(var0)) { // L: 11114
			ClanSettings.runComponentCloseListeners(EnumComposition.Widget_interfaceComponents[var0], var1); // L: 11115
		}
	} // L: 11116
}
