import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("me")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 381573943
	)
	@Export("idxCount")
	public static int idxCount;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1695480497
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2043874087
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1088708309
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1526054429
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-104"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1084787659"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public boolean method6252(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;B)V",
		garbageValue = "-83"
	)
	public void method6253(Bounds var1, Bounds var2) {
		this.method6254(var1, var2);
		this.method6255(var1, var2);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;I)V",
		garbageValue = "348652438"
	)
	void method6254(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * 1746135677 - (var1.lowX * 1746135677 - this.lowX * 1746135677)) * 1088708309;
			var2.lowX = var1.lowX;
		}

		if (var2.method6261() > var1.method6261()) {
			var2.highX -= var2.method6261() - var1.method6261();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lme;Lme;I)V",
		garbageValue = "-1307701486"
	)
	void method6255(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = (var2.highY * 98366517 - (var1.lowY * 98366517 - this.lowY * 98366517)) * 1526054429;
			var2.lowY = var1.lowY;
		}

		if (var2.method6257() > var1.method6257()) {
			var2.highY -= var2.method6257() - var1.method6257();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1298580692"
	)
	int method6261() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-108"
	)
	int method6257() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "1"
	)
	static int method6262(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? WorldMapDecoration.scriptDotWidget : class245.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else if (var0 != 1615 && var0 != 1616) {
			return 2;
		} else {
			++AbstractByteArrayCopier.Interpreter_intStackSize;
			return 1;
		}
	}
}
