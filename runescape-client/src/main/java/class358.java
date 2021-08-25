import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class358 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	static final class358 field4027;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	static final class358 field4028;
	@ObfuscatedName("m")
	String field4029;

	static {
		field4027 = new class358("application/json");
		field4028 = new class358("text/plain");
	}

	class358(String var1) {
		this.field4029 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "120"
	)
	public String method6273() {
		return this.field4029;
	}
}
