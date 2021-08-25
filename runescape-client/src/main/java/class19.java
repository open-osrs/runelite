import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class19 {
	@ObfuscatedName("n")
	Future field96;
	@ObfuscatedName("c")
	String field92;

	class19(Future var1) {
		this.field96 = var1;
	}

	class19(String var1) {
		this.method303(var1);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method303(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field92 = var1;
		if (this.field96 != null) {
			this.field96.cancel(true);
			this.field96 = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1087159010"
	)
	public final String method291() {
		return this.field92;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-19820"
	)
	public boolean method292() {
		return this.field92 != null || this.field96 == null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "233238474"
	)
	public final boolean method306() {
		return this.method292() ? true : this.field96.isDone();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lt;",
		garbageValue = "934125014"
	)
	public final class21 method294() {
		if (this.method292()) {
			return new class21(this.field92);
		} else if (!this.method306()) {
			return null;
		} else {
			try {
				return (class21)this.field96.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method303(var2);
				return new class21(var2);
			}
		}
	}
}
