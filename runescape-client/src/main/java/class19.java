import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class19 {
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("c")
	Future field107;
	@ObfuscatedName("v")
	String field106;

	class19(Future var1) {
		this.field107 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method243(var1); // L: 14
	} // L: 15

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1161369831"
	)
	void method243(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field106 = var1; // L: 19
		if (this.field107 != null) { // L: 20
			this.field107.cancel(true); // L: 21
			this.field107 = null; // L: 22
		}

	} // L: 24

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-688611992"
	)
	public final String method244() {
		return this.field106; // L: 27
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "731102059"
	)
	public boolean method251() {
		return this.field106 != null || this.field107 == null; // L: 31
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1151479385"
	)
	public final boolean method246() {
		return this.method251() ? true : this.field107.isDone(); // L: 35 36
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(S)Lb;",
		garbageValue = "-5003"
	)
	public final class21 method249() {
		if (this.method251()) { // L: 40
			return new class21(this.field106);
		} else if (!this.method246()) { // L: 41
			return null;
		} else {
			try {
				return (class21)this.field107.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method243(var2); // L: 48
				return new class21(var2); // L: 49
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Ldt;",
		garbageValue = "234177073"
	)
	static class119 method254(int var0) {
		class119 var1 = (class119)Actor.findEnumerated(UserComparator9.method2599(), var0); // L: 92
		if (var1 == null) {
			var1 = class119.field1497; // L: 93
		}

		return var1; // L: 94
	}
}
