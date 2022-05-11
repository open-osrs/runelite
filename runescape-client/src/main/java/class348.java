import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class348 extends AbstractQueue {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lmf;"
	)
	class346[] field4179;
	@ObfuscatedName("q")
	Map field4180;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1908884105
	)
	int field4181;
	@ObfuscatedName("k")
	final Comparator field4178;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -633680661
	)
	int field4182;

	public class348(int var1, Comparator var2) {
		this.field4182 = 0; // L: 10
		this.field4179 = new class346[var1]; // L: 17
		this.field4180 = new HashMap(); // L: 18
		this.field4178 = var2; // L: 19
	} // L: 20

	public class348(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2064028908"
	)
	void method6192() {
		int var1 = (this.field4179.length << 1) + 1; // L: 23
		this.field4179 = (class346[])((class346[])Arrays.copyOf(this.field4179, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-79126724"
	)
	void method6173(int var1) {
		class346 var2;
		int var3;
		for (var2 = this.field4179[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class346 var4 = this.field4179[var3]; // L: 99
			if (this.field4178 != null) { // L: 100
				if (this.field4178.compare(var2.field4171, var4.field4171) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4171).compareTo(var4.field4171) >= 0) { // L: 104
				break;
			}

			this.field4179[var1] = var4; // L: 106
			this.field4179[var1].field4170 = var1; // L: 107
		}

		this.field4179[var1] = var2; // L: 110
		this.field4179[var1].field4170 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1826932902"
	)
	void method6181(int var1) {
		class346 var2 = this.field4179[var1]; // L: 116

		int var8;
		for (int var3 = this.field4181 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class346 var5 = this.field4179[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class346 var7 = this.field4179[var6]; // L: 122
			if (this.field4178 != null) { // L: 124
				if (var6 < this.field4181 && this.field4178.compare(var5.field4171, var7.field4171) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4181 && ((Comparable)var5.field4171).compareTo(var7.field4171) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4178 != null) { // L: 132
				if (this.field4178.compare(var2.field4171, this.field4179[var8].field4171) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4171).compareTo(this.field4179[var8].field4171) <= 0) { // L: 136
				break;
			}

			this.field4179[var1] = this.field4179[var8]; // L: 138
			this.field4179[var1].field4170 = var1; // L: 139
		}

		this.field4179[var1] = var2; // L: 142
		this.field4179[var1].field4170 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class346 var2 = (class346)this.field4180.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4182; // L: 79
			--this.field4181; // L: 80
			if (var2.field4170 == this.field4181) { // L: 81
				this.field4179[this.field4181] = null; // L: 82
				return true; // L: 83
			} else {
				class346 var3 = this.field4179[this.field4181]; // L: 85
				this.field4179[this.field4181] = null; // L: 86
				this.field4179[var2.field4170] = var3; // L: 87
				this.field4179[var2.field4170].field4170 = var2.field4170; // L: 88
				this.method6181(var2.field4170); // L: 89
				if (var3 == this.field4179[var2.field4170]) { // L: 90
					this.method6173(var2.field4170);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4181 == 0 ? null : this.field4179[0].field4171; // L: 54 55
	}

	public Iterator iterator() {
		return new class347(this); // L: 162
	}

	public boolean offer(Object var1) {
		if (this.field4180.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4182; // L: 35
			int var2 = this.field4181; // L: 36
			if (var2 >= this.field4179.length) { // L: 37
				this.method6192();
			}

			++this.field4181; // L: 38
			if (var2 == 0) { // L: 39
				this.field4179[0] = new class346(var1, 0); // L: 40
				this.field4180.put(var1, this.field4179[0]); // L: 41
			} else {
				this.field4179[var2] = new class346(var1, var2); // L: 44
				this.field4180.put(var1, this.field4179[var2]); // L: 45
				this.method6173(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public boolean contains(Object var1) {
		return this.field4180.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4178 != null) {
			Arrays.sort(var1, this.field4178); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Object poll() {
		if (this.field4181 == 0) { // L: 61
			return null;
		} else {
			++this.field4182; // L: 62
			Object var1 = this.field4179[0].field4171; // L: 63
			this.field4180.remove(var1); // L: 64
			--this.field4181; // L: 65
			if (this.field4181 == 0) {
				this.field4179[this.field4181] = null; // L: 66
			} else {
				this.field4179[0] = this.field4179[this.field4181]; // L: 68
				this.field4179[0].field4170 = 0; // L: 69
				this.field4179[this.field4181] = null; // L: 70
				this.method6181(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public int size() {
		return this.field4181; // L: 29
	}
}
