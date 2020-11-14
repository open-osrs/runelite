import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -1966290911
	)
	static int field2048;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1735365545
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("f")
	long[] field2042;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1230464275
	)
	int field2040;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1780413157
	)
	int field2041;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 7922425031260846731L
	)
	long field2043;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1604091025
	)
	int field2047;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 738623211
	)
	int field2044;

	MilliClock() {
		this.field2042 = new long[10]; // L: 7
		this.field2040 = 256; // L: 15
		this.field2041 = 1; // L: 16
		this.field2047 = 0; // L: 17
		this.field2043 = User.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field2042[var1] = this.field2043; // L: 20
		}

	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "345512591"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field2042[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-837141414"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2040; // L: 31
		int var4 = this.field2041; // L: 32
		this.field2040 = 300; // L: 33
		this.field2041 = 1; // L: 34
		this.field2043 = User.currentTimeMillis(); // L: 35
		if (this.field2042[this.field2044] == 0L) { // L: 36
			this.field2040 = var3; // L: 37
			this.field2041 = var4; // L: 38
		} else if (this.field2043 > this.field2042[this.field2044]) { // L: 40
			this.field2040 = (int)((long)(var1 * 2560) / (this.field2043 - this.field2042[this.field2044]));
		}

		if (this.field2040 < 25) { // L: 41
			this.field2040 = 25;
		}

		if (this.field2040 > 256) { // L: 42
			this.field2040 = 256; // L: 43
			this.field2041 = (int)((long)var1 - (this.field2043 - this.field2042[this.field2044]) / 10L); // L: 44
		}

		if (this.field2041 > var1) { // L: 46
			this.field2041 = var1;
		}

		this.field2042[this.field2044] = this.field2043; // L: 47
		this.field2044 = (this.field2044 + 1) % 10; // L: 48
		int var5;
		if (this.field2041 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field2042[var5] != 0L) { // L: 51
					this.field2042[var5] += (long)this.field2041;
				}
			}
		}

		if (this.field2041 < var2) { // L: 54
			this.field2041 = var2;
		}

		WorldMapSection3.sleepExact((long)this.field2041); // L: 55

		for (var5 = 0; this.field2047 < 256; this.field2047 += this.field2040) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field2047 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "152"
	)
	static int method3587(int var0) {
		return var0 * 3 + 600; // L: 1918
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-26"
	)
	public static boolean method3590() {
		return Client.staffModLevel >= 2; // L: 11656
	}
}
