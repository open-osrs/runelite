import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class20 implements Callable {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1111023185
	)
	@Export("selectedItemWidget")
	static int selectedItemWidget;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	final class10 field106;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lt;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lt;Ly;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field106 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field106.method79()) { // L: 53
				class241.method4815(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field106.method82(); // L: 60
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)I",
		garbageValue = "-14"
	)
	static int method269(Widget var0) {
		if (var0.type != 11) { // L: 1238
			Interpreter.Interpreter_stringStack[class9.Interpreter_stringStackSize - 1] = ""; // L: 1239
			return 1; // L: 1240
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class9.Interpreter_stringStackSize]; // L: 1242
			Interpreter.Interpreter_stringStack[++class9.Interpreter_stringStackSize - 1] = var0.method5523(var1); // L: 1243
			return 1; // L: 1244
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1249445157"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		HealthBar.method2336(); // L: 8702
		Client.menuActions[0] = "Cancel"; // L: 8703
		Client.menuTargets[0] = ""; // L: 8704
		Client.menuOpcodes[0] = 1006; // L: 8705
		Client.menuShiftClick[0] = false; // L: 8706
		Client.menuOptionsCount = 1; // L: 8707
	} // L: 8708
}
