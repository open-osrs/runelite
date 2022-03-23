import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class1 implements Callable {
	@ObfuscatedName("cc")
	public static char field3;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	final Buffer field4;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;Lpd;Lg;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field4 = var2; // L: 48
		this.field0 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field0.vmethod11(this.field4); // L: 54
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lca;I)V",
		garbageValue = "1044420160"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class175.runScript(var0, 500000, 475000); // L: 108
	} // L: 109
}
