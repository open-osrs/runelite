import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public final class class362 {
	@ObfuscatedName("o")
	final Comparator field4283;
	@ObfuscatedName("q")
	final Map field4287;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	final class348 field4282;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	final class348 field4281;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = -5862348301303990459L
	)
	final long field4280;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final class360 field4285;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 410246549
	)
	final int field4286;

	@ObfuscatedSignature(
		descriptor = "(JILmc;)V"
	)
	class362(long var1, int var3, class360 var4) {
		this.field4283 = new class361(this); // L: 7
		this.field4280 = var1; // L: 34
		this.field4286 = var3; // L: 35
		this.field4285 = var4; // L: 36
		if (this.field4286 == -1) { // L: 37
			this.field4287 = new HashMap(64); // L: 38
			this.field4282 = new class348(64, this.field4283); // L: 39
			this.field4281 = null; // L: 40
		} else {
			if (this.field4285 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4287 = new HashMap(this.field4286); // L: 44
			this.field4282 = new class348(this.field4286, this.field4283); // L: 45
			this.field4281 = new class348(this.field4286); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILmc;)V"
	)
	public class362(int var1, class360 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1327719952"
	)
	boolean method6401() {
		return this.field4286 != -1; // L: 51
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "23"
	)
	public Object method6413(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4280 != -1L) { // L: 56
				this.method6404();
			}

			class363 var3 = (class363)this.field4287.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method6403(var3, false); // L: 59
				return var3.field4289; // L: 60
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "735656301"
	)
	public Object method6402(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (this.field4280 != -1L) { // L: 66
				this.method6404();
			}

			class363 var4 = (class363)this.field4287.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4289; // L: 69
				var4.field4289 = var2; // L: 70
				this.method6403(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class363 var5;
				if (this.method6401() && this.field4287.size() == this.field4286) { // L: 74
					var5 = (class363)this.field4281.remove(); // L: 75
					this.field4287.remove(var5.field4288); // L: 76
					this.field4282.remove(var5); // L: 77
				}

				var5 = new class363(var2, var1); // L: 79
				this.field4287.put(var1, var5); // L: 80
				this.method6403(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lmw;ZI)V",
		garbageValue = "1467205859"
	)
	void method6403(class363 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4282.remove(var1); // L: 89
			if (this.method6401() && !this.field4281.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4290 = System.currentTimeMillis(); // L: 94
		if (this.method6401()) { // L: 95
			switch(this.field4285.field4273) { // L: 96
			case 0:
				var1.field4291 = var1.field4290; // L: 98
				break;
			case 1:
				++var1.field4291; // L: 101
			}

			this.field4281.add(var1); // L: 104
		}

		this.field4282.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	void method6404() {
		if (-1L == this.field4280) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4280; // L: 112

			while (!this.field4282.isEmpty()) { // L: 113
				class363 var3 = (class363)this.field4282.peek(); // L: 114
				if (var3.field4290 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4287.remove(var3.field4288); // L: 116
				this.field4282.remove(var3); // L: 117
				if (this.method6401()) { // L: 118
					this.field4281.remove(var3);
				}
			}

		}
	} // L: 122
}
