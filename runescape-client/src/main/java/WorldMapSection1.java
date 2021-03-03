import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ap")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1101754891
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 112760039
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1255981351
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 282137725
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2048603637
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2025477005
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	} // L: 14

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lar;B)V",
		garbageValue = "112"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) { // L: 17
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX; // L: 18
		}

		if (var1.regionLowY > this.regionEndY) { // L: 19
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) { // L: 20
			var1.regionHighY = this.regionEndY;
		}

	} // L: 21

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-90"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) { // L: 24
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY; // L: 27
		} else {
			return false; // L: 25
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-5"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY; // L: 31
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-76"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 35
			return null; // L: 36
		} else {
			int[] var4 = new int[]{var2 + (this.regionEndX * 64 - this.regionStartX * 64), var3 + (this.regionEndY * 64 - this.regionStartY * 64)}; // L: 38 39 40
			return var4; // L: 41
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(III)Lhd;",
		garbageValue = "-1841969392"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 45
			return null; // L: 46
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1; // L: 48
			int var4 = var2 + (this.regionStartY * 64 - this.regionEndY * 64); // L: 49
			return new Coord(this.minPlane, var3, var4); // L: 50
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-489268143"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort(); // L: 56
		this.regionStartY = var1.readUnsignedShort(); // L: 57
		this.regionEndX = var1.readUnsignedShort(); // L: 58
		this.regionEndY = var1.readUnsignedShort(); // L: 59
		this.postRead(); // L: 60
	} // L: 61

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("postRead")
	void postRead() {
	} // L: 63

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "103"
	)
	public static void method671() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 54
	} // L: 55

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "4"
	)
	static boolean method657(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) { // L: 777
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) { // L: 778
				return true;
			}
		}

		return false; // L: 780
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ILcl;ZI)I",
		garbageValue = "-1029416071"
	)
	static int method679(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 948
			var0 -= 1000; // L: 949
			var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 950
		} else {
			var3 = var2 ? class277.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 952
		}

		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 953
		int[] var5 = null; // L: 954
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 955
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 956
			if (var6 > 0) { // L: 957
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 958 959
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 961
		}

		Object[] var8 = new Object[var4.length() + 1]; // L: 963

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) { // L: 964
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 965
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 966
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 968
		if (var7 != -1) { // L: 969
			var8[0] = new Integer(var7);
		} else {
			var8 = null; // L: 970
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8; // L: 971
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 972
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 973
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 974
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 975
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 976
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 977
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 978
			var3.onVarTransmit = var8; // L: 979
			var3.varTransmitTriggers = var5; // L: 980
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 982
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 983
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 984
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 985
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 986
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 987
			var3.onInvTransmit = var8; // L: 988
			var3.invTransmitTriggers = var5; // L: 989
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 991
			var3.onStatTransmit = var8; // L: 992
			var3.statTransmitTriggers = var5; // L: 993
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 995
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 996
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 997
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 998
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 999
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1000
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1001
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1002
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1003
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1004
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) { // L: 1005
			var3.field2678 = var8;
		} else {
			if (var0 != ScriptOpcodes.CC_SETONRESIZE) { // L: 1006
				return 2; // L: 1007
			}

			var3.onResize = var8;
		}

		var3.hasListener = true; // L: 1008
		return 1; // L: 1009
	}
}
