import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public final class class361 {
	@ObfuscatedName("k")
	static int[] field4213;
	@ObfuscatedName("v")
	final Comparator field4217;
	@ObfuscatedName("c")
	final Map field4218;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	final class342 field4214;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	final class342 field4215;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -1677392653166540809L
	)
	final long field4219;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	final class359 field4216;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1491932339
	)
	final int field4212;

	@ObfuscatedSignature(
		descriptor = "(JILmx;)V"
	)
	class361(long var1, int var3, class359 var4) {
		this.field4217 = new class360(this); // L: 7
		this.field4219 = var1; // L: 34
		this.field4212 = var3; // L: 35
		this.field4216 = var4; // L: 36
		if (this.field4212 == -1) { // L: 37
			this.field4218 = new HashMap(64); // L: 38
			this.field4214 = new class342(64, this.field4217); // L: 39
			this.field4215 = null; // L: 40
		} else {
			if (this.field4216 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4218 = new HashMap(this.field4212); // L: 44
			this.field4214 = new class342(this.field4212, this.field4217); // L: 45
			this.field4215 = new class342(this.field4212); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILmx;)V"
	)
	public class361(int var1, class359 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-157414931"
	)
	boolean method6594() {
		return this.field4212 != -1; // L: 51
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-2019489642"
	)
	public Object method6601(Object var1) {
		synchronized(this) { // L: 55
			if (-1L != this.field4219) { // L: 56
				this.method6598();
			}

			class362 var3 = (class362)this.field4218.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method6600(var3, false); // L: 59
				return var3.field4221; // L: 60
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-1186698319"
	)
	public Object method6596(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4219) { // L: 66
				this.method6598();
			}

			class362 var4 = (class362)this.field4218.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4221; // L: 69
				var4.field4221 = var2; // L: 70
				this.method6600(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class362 var5;
				if (this.method6594() && this.field4218.size() == this.field4212) { // L: 74
					var5 = (class362)this.field4215.remove(); // L: 75
					this.field4218.remove(var5.field4224); // L: 76
					this.field4214.remove(var5); // L: 77
				}

				var5 = new class362(var2, var1); // L: 79
				this.field4218.put(var1, var5); // L: 80
				this.method6600(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmv;ZI)V",
		garbageValue = "1250273542"
	)
	void method6600(class362 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4214.remove(var1); // L: 89
			if (this.method6594() && !this.field4215.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4222 = System.currentTimeMillis(); // L: 94
		if (this.method6594()) { // L: 95
			switch(this.field4216.field4206) { // L: 96
			case 0:
				++var1.field4223; // L: 101
				break;
			case 1:
				var1.field4223 = var1.field4222; // L: 98
			}

			this.field4215.add(var1); // L: 104
		}

		this.field4214.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1192700638"
	)
	void method6598() {
		if (-1L == this.field4219) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4219; // L: 112

			while (!this.field4214.isEmpty()) { // L: 113
				class362 var3 = (class362)this.field4214.peek(); // L: 114
				if (var3.field4222 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4218.remove(var3.field4224); // L: 116
				this.field4214.remove(var3); // L: 117
				if (this.method6594()) { // L: 118
					this.field4215.remove(var3);
				}
			}

		}
	} // L: 122
}
