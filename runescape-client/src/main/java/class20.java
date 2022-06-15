import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class20 implements Callable {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1119374455
	)
	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	final class10 field109;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;Ls;)V"
	)
	class20(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field109 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field109.method78()) { // L: 53
				DynamicObject.method1991(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class21("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field109.method90(); // L: 60
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2092046767"
	)
	static int method255(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F)); // L: 3847
	}
}
