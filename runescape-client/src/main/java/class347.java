import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class347 extends AbstractQueue {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lmn;"
	)
	class345[] field4166;
	@ObfuscatedName("v")
	Map field4167;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1349227939
	)
	int field4165;
	@ObfuscatedName("f")
	final Comparator field4168;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 500600827
	)
	int field4169;

	public class347(int var1, Comparator var2) {
		this.field4169 = 0; // L: 10
		this.field4166 = new class345[var1]; // L: 17
		this.field4167 = new HashMap(); // L: 18
		this.field4168 = var2; // L: 19
	} // L: 20

	public class347(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	void method6341() {
		int var1 = (this.field4166.length << 1) + 1; // L: 23
		this.field4166 = (class345[])((class345[])Arrays.copyOf(this.field4166, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1035999073"
	)
	void method6342(int var1) {
		class345 var2;
		int var3;
		for (var2 = this.field4166[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class345 var4 = this.field4166[var3]; // L: 99
			if (this.field4168 != null) { // L: 100
				if (this.field4168.compare(var2.field4159, var4.field4159) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4159).compareTo(var4.field4159) >= 0) { // L: 104
				break;
			}

			this.field4166[var1] = var4; // L: 106
			this.field4166[var1].field4158 = var1; // L: 107
		}

		this.field4166[var1] = var2; // L: 110
		this.field4166[var1].field4158 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1952216372"
	)
	void method6354(int var1) {
		class345 var2 = this.field4166[var1]; // L: 116

		int var8;
		for (int var3 = this.field4165 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class345 var5 = this.field4166[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class345 var7 = this.field4166[var6]; // L: 122
			if (this.field4168 != null) { // L: 124
				if (var6 < this.field4165 && this.field4168.compare(var5.field4159, var7.field4159) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4165 && ((Comparable)var5.field4159).compareTo(var7.field4159) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4168 != null) { // L: 132
				if (this.field4168.compare(var2.field4159, this.field4166[var8].field4159) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4159).compareTo(this.field4166[var8].field4159) <= 0) { // L: 136
				break;
			}

			this.field4166[var1] = this.field4166[var8]; // L: 138
			this.field4166[var1].field4158 = var1; // L: 139
		}

		this.field4166[var1] = var2; // L: 142
		this.field4166[var1].field4158 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class345 var2 = (class345)this.field4167.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4169; // L: 79
			--this.field4165; // L: 80
			if (var2.field4158 == this.field4165) { // L: 81
				this.field4166[this.field4165] = null; // L: 82
				return true; // L: 83
			} else {
				class345 var3 = this.field4166[this.field4165]; // L: 85
				this.field4166[this.field4165] = null; // L: 86
				this.field4166[var2.field4158] = var3; // L: 87
				this.field4166[var2.field4158].field4158 = var2.field4158; // L: 88
				this.method6354(var2.field4158); // L: 89
				if (var3 == this.field4166[var2.field4158]) { // L: 90
					this.method6342(var2.field4158);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4165 == 0 ? null : this.field4166[0].field4159; // L: 54 55
	}

	public int size() {
		return this.field4165; // L: 29
	}

	public boolean offer(Object var1) {
		if (this.field4167.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4169; // L: 35
			int var2 = this.field4165; // L: 36
			if (var2 >= this.field4166.length) { // L: 37
				this.method6341();
			}

			++this.field4165; // L: 38
			if (var2 == 0) { // L: 39
				this.field4166[0] = new class345(var1, 0); // L: 40
				this.field4167.put(var1, this.field4166[0]); // L: 41
			} else {
				this.field4166[var2] = new class345(var1, var2); // L: 44
				this.field4167.put(var1, this.field4166[var2]); // L: 45
				this.method6342(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4168 != null) {
			Arrays.sort(var1, this.field4168); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}

	public Object poll() {
		if (this.field4165 == 0) { // L: 61
			return null;
		} else {
			++this.field4169; // L: 62
			Object var1 = this.field4166[0].field4159; // L: 63
			this.field4167.remove(var1); // L: 64
			--this.field4165; // L: 65
			if (this.field4165 == 0) {
				this.field4166[this.field4165] = null; // L: 66
			} else {
				this.field4166[0] = this.field4166[this.field4165]; // L: 68
				this.field4166[0].field4158 = 0; // L: 69
				this.field4166[this.field4165] = null; // L: 70
				this.method6354(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public boolean contains(Object var1) {
		return this.field4167.containsKey(var1); // L: 148
	}

	public Iterator iterator() {
		return new class346(this); // L: 162
	}
}
