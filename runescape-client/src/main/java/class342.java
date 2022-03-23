import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class342 extends AbstractQueue {
	@ObfuscatedName("f")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lmt;"
	)
	class340[] field4121;
	@ObfuscatedName("o")
	Map field4116;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 205859761
	)
	int field4117;
	@ObfuscatedName("g")
	final Comparator field4118;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -116505453
	)
	int field4115;

	public class342(int var1, Comparator var2) {
		this.field4115 = 0; // L: 10
		this.field4121 = new class340[var1]; // L: 17
		this.field4116 = new HashMap(); // L: 18
		this.field4118 = var2; // L: 19
	} // L: 20

	public class342(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1358753820"
	)
	void method6346() {
		int var1 = (this.field4121.length << 1) + 1; // L: 23
		this.field4121 = (class340[])((class340[])Arrays.copyOf(this.field4121, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-385967727"
	)
	void method6365(int var1) {
		class340 var2;
		int var3;
		for (var2 = this.field4121[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class340 var4 = this.field4121[var3]; // L: 99
			if (this.field4118 != null) { // L: 100
				if (this.field4118.compare(var2.field4107, var4.field4107) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4107).compareTo(var4.field4107) >= 0) { // L: 104
				break;
			}

			this.field4121[var1] = var4; // L: 106
			this.field4121[var1].field4108 = var1; // L: 107
		}

		this.field4121[var1] = var2; // L: 110
		this.field4121[var1].field4108 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2077762464"
	)
	void method6351(int var1) {
		class340 var2 = this.field4121[var1]; // L: 116

		int var8;
		for (int var3 = this.field4117 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class340 var5 = this.field4121[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class340 var7 = this.field4121[var6]; // L: 122
			if (this.field4118 != null) { // L: 124
				if (var6 < this.field4117 && this.field4118.compare(var5.field4107, var7.field4107) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4117 && ((Comparable)var5.field4107).compareTo(var7.field4107) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4118 != null) { // L: 132
				if (this.field4118.compare(var2.field4107, this.field4121[var8].field4107) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4107).compareTo(this.field4121[var8].field4107) <= 0) { // L: 136
				break;
			}

			this.field4121[var1] = this.field4121[var8]; // L: 138
			this.field4121[var1].field4108 = var1; // L: 139
		}

		this.field4121[var1] = var2; // L: 142
		this.field4121[var1].field4108 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class340 var2 = (class340)this.field4116.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4115; // L: 79
			--this.field4117; // L: 80
			if (var2.field4108 == this.field4117) { // L: 81
				this.field4121[this.field4117] = null; // L: 82
				return true; // L: 83
			} else {
				class340 var3 = this.field4121[this.field4117]; // L: 85
				this.field4121[this.field4117] = null; // L: 86
				this.field4121[var2.field4108] = var3; // L: 87
				this.field4121[var2.field4108].field4108 = var2.field4108; // L: 88
				this.method6351(var2.field4108); // L: 89
				if (var3 == this.field4121[var2.field4108]) { // L: 90
					this.method6365(var2.field4108);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4117 == 0 ? null : this.field4121[0].field4107; // L: 54 55
	}

	public int size() {
		return this.field4117; // L: 29
	}

	public boolean contains(Object var1) {
		return this.field4116.containsKey(var1); // L: 148
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4118 != null) {
			Arrays.sort(var1, this.field4118); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Iterator iterator() {
		return new class341(this); // L: 162
	}

	public Object poll() {
		if (this.field4117 == 0) { // L: 61
			return null;
		} else {
			++this.field4115; // L: 62
			Object var1 = this.field4121[0].field4107; // L: 63
			this.field4116.remove(var1); // L: 64
			--this.field4117; // L: 65
			if (this.field4117 == 0) {
				this.field4121[this.field4117] = null; // L: 66
			} else {
				this.field4121[0] = this.field4121[this.field4117]; // L: 68
				this.field4121[0].field4108 = 0; // L: 69
				this.field4121[this.field4117] = null; // L: 70
				this.method6351(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean offer(Object var1) {
		if (this.field4116.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4115; // L: 35
			int var2 = this.field4117; // L: 36
			if (var2 >= this.field4121.length) { // L: 37
				this.method6346();
			}

			++this.field4117; // L: 38
			if (var2 == 0) { // L: 39
				this.field4121[0] = new class340(var1, 0); // L: 40
				this.field4116.put(var1, this.field4121[0]); // L: 41
			} else {
				this.field4121[var2] = new class340(var1, var2); // L: 44
				this.field4116.put(var1, this.field4121[var2]); // L: 45
				this.method6365(var2); // L: 46
			}

			return true; // L: 48
		}
	}
}
