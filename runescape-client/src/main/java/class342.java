import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class342 extends AbstractQueue {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lmk;"
	)
	class340[] field4104;
	@ObfuscatedName("c")
	Map field4105;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -609081385
	)
	int field4106;
	@ObfuscatedName("f")
	final Comparator field4107;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1292007073
	)
	int field4108;

	public class342(int var1, Comparator var2) {
		this.field4108 = 0; // L: 10
		this.field4104 = new class340[var1]; // L: 17
		this.field4105 = new HashMap(); // L: 18
		this.field4107 = var2; // L: 19
	} // L: 20

	public class342(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1379999236"
	)
	void method6297() {
		int var1 = (this.field4104.length << 1) + 1; // L: 23
		this.field4104 = (class340[])((class340[])Arrays.copyOf(this.field4104, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-54903220"
	)
	void method6285(int var1) {
		class340 var2;
		int var3;
		for (var2 = this.field4104[var1]; var1 > 0; var1 = var3) { // L: 89 90 101
			var3 = var1 - 1 >>> 1; // L: 91
			class340 var4 = this.field4104[var3]; // L: 92
			if (this.field4107 != null) { // L: 93
				if (this.field4107.compare(var2.field4096, var4.field4096) >= 0) { // L: 94
					break;
				}
			} else if (((Comparable)var2.field4096).compareTo(var4.field4096) >= 0) { // L: 97
				break;
			}

			this.field4104[var1] = var4; // L: 99
			this.field4104[var1].field4095 = var1; // L: 100
		}

		this.field4104[var1] = var2; // L: 103
		this.field4104[var1].field4095 = var1; // L: 104
	} // L: 105

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "45"
	)
	void method6309(int var1) {
		class340 var2 = this.field4104[var1]; // L: 108

		int var8;
		for (int var3 = this.field4106 >>> 1; var1 < var3; var1 = var8) { // L: 109 110 132
			int var4 = (var1 << 1) + 1; // L: 111
			class340 var5 = this.field4104[var4]; // L: 112
			int var6 = (var1 << 1) + 2; // L: 113
			class340 var7 = this.field4104[var6]; // L: 114
			if (this.field4107 != null) { // L: 116
				if (var6 < this.field4106 && this.field4107.compare(var5.field4096, var7.field4096) > 0) { // L: 117
					var8 = var6;
				} else {
					var8 = var4; // L: 118
				}
			} else if (var6 < this.field4106 && ((Comparable)var5.field4096).compareTo(var7.field4096) > 0) { // L: 121
				var8 = var6;
			} else {
				var8 = var4; // L: 122
			}

			if (this.field4107 != null) { // L: 124
				if (this.field4107.compare(var2.field4096, this.field4104[var8].field4096) <= 0) { // L: 125
					break;
				}
			} else if (((Comparable)var2.field4096).compareTo(this.field4104[var8].field4096) <= 0) { // L: 128
				break;
			}

			this.field4104[var1] = this.field4104[var8]; // L: 130
			this.field4104[var1].field4095 = var1; // L: 131
		}

		this.field4104[var1] = var2; // L: 134
		this.field4104[var1].field4095 = var1; // L: 135
	} // L: 136

	public boolean remove(Object var1) {
		class340 var2 = (class340)this.field4105.remove(var1); // L: 71
		if (var2 == null) { // L: 72
			return false;
		} else {
			++this.field4108; // L: 73
			--this.field4106; // L: 74
			if (var2.field4095 == this.field4106) { // L: 75
				this.field4104[this.field4106] = null; // L: 76
				return true; // L: 77
			} else {
				class340 var3 = this.field4104[this.field4106]; // L: 79
				this.field4104[this.field4106] = null; // L: 80
				this.field4104[var2.field4095] = var3; // L: 81
				this.field4104[var2.field4095].field4095 = var2.field4095; // L: 82
				this.method6309(var2.field4095); // L: 83
				if (var3 == this.field4104[var2.field4095]) { // L: 84
					this.method6285(var2.field4095);
				}

				return true; // L: 85
			}
		}
	}

	public Object peek() {
		return this.field4106 == 0 ? null : this.field4104[0].field4096; // L: 50 51
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 143
		if (this.field4107 != null) {
			Arrays.sort(var1, this.field4107); // L: 144
		} else {
			Arrays.sort(var1); // L: 145
		}

		return var1; // L: 146
	}

	public Object poll() {
		if (this.field4106 == 0) { // L: 55
			return null;
		} else {
			++this.field4108; // L: 56
			Object var1 = this.field4104[0].field4096; // L: 57
			this.field4105.remove(var1); // L: 58
			--this.field4106; // L: 59
			if (this.field4106 == 0) {
				this.field4104[this.field4106] = null; // L: 60
			} else {
				this.field4104[0] = this.field4104[this.field4106]; // L: 62
				this.field4104[0].field4095 = 0; // L: 63
				this.field4104[this.field4106] = null; // L: 64
				this.method6309(0); // L: 65
			}

			return var1; // L: 67
		}
	}

	public int size() {
		return this.field4106; // L: 28
	}

	public Iterator iterator() {
		return new class341(this); // L: 150
	}

	public boolean offer(Object var1) {
		if (this.field4105.containsKey(var1)) { // L: 32
			throw new IllegalArgumentException("");
		} else {
			++this.field4108; // L: 33
			int var2 = this.field4106; // L: 34
			if (var2 >= this.field4104.length) { // L: 35
				this.method6297();
			}

			++this.field4106; // L: 36
			if (var2 == 0) { // L: 37
				this.field4104[0] = new class340(var1, 0); // L: 38
				this.field4105.put(var1, this.field4104[0]); // L: 39
			} else {
				this.field4104[var2] = new class340(var1, var2); // L: 42
				this.field4105.put(var1, this.field4104[var2]); // L: 43
				this.method6285(var2); // L: 44
			}

			return true; // L: 46
		}
	}

	public boolean contains(Object var1) {
		return this.field4105.containsKey(var1); // L: 139
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ldo;",
		garbageValue = "901392143"
	)
	static class122 method6314(int var0) {
		class122 var1 = (class122)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 339
		if (var1 != null) { // L: 340
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive; // L: 342
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 343
			boolean var5 = true; // L: 345
			byte[] var6 = var3.takeFile(var0 >> 16 & 65535, var0 & 65535); // L: 346
			class122 var2;
			if (var6 == null) { // L: 347
				var5 = false; // L: 348
				var2 = null; // L: 349
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 352
				byte[] var8 = var4.getFile(var7, 0); // L: 355
				if (var8 == null) { // L: 356
					var5 = false;
				}

				if (!var5) { // L: 357
					var2 = null; // L: 358
				} else {
					try {
						var2 = new class122(var3, var4, var0, false); // L: 362
					} catch (Exception var10) { // L: 364
						var2 = null; // L: 365
					}
				}
			}

			if (var2 != null) { // L: 369
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 370
		}
	}
}
