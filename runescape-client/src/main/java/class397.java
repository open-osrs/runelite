import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public class class397 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	public static final class397 field4431;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static final class397 field4430;
	@ObfuscatedName("q")
	String field4432;

	static {
		field4431 = new class397("application/json"); // L: 4
		field4430 = new class397("text/plain"); // L: 5
	}

	class397(String var1) {
		this.field4432 = var1; // L: 9
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-851015132"
	)
	public String method7086() {
		return this.field4432; // L: 13
	}
}
