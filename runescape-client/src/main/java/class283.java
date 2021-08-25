import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jz")
public enum class283 implements MouseWheel {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	field3651(-1),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	field3653(0),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	field3650(1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	field3652(2);

	@ObfuscatedName("u")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 69732641
	)
	final int field3654;

	class283(int var3) {
		this.field3654 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665712539"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3654;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZS)I",
		garbageValue = "25842"
	)
	static int method5093(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? PacketWriter.scriptDotWidget : class9.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
