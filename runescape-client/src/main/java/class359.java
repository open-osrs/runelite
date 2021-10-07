import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class359 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	static final class359 field4047;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	static final class359 field4048;
	@ObfuscatedName("f")
	String field4046;

	static {
		field4047 = new class359("application/json");
		field4048 = new class359("text/plain");
	}

	class359(String var1) {
		this.field4046 = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1364457726"
	)
	public String method6333() {
		return this.field4046;
	}
}
