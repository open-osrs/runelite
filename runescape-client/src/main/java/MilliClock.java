import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class MilliClock extends Clock {
	@ObfuscatedName("z")
	long[] field2057;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -886018089
	)
	int field2053;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -786123251
	)
	int field2055;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 4297873508162360303L
	)
	long field2056;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -981834759
	)
	int field2054;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 709273215
	)
	int field2058;

	MilliClock() {
		this.field2057 = new long[10]; // L: 7
		this.field2053 = 256; // L: 15
		this.field2055 = 1; // L: 16
		this.field2054 = 0; // L: 17
		this.field2056 = PacketWriter.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field2057[var1] = this.field2056; // L: 20
		}

	} // L: 22

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "208275261"
	)
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field2057[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-16016139"
	)
	public int wait(int var1, int var2) {
		int var3 = this.field2053; // L: 31
		int var4 = this.field2055; // L: 32
		this.field2053 = 300; // L: 33
		this.field2055 = 1; // L: 34
		this.field2056 = PacketWriter.currentTimeMillis(); // L: 35
		if (this.field2057[this.field2058] == 0L) { // L: 36
			this.field2053 = var3; // L: 37
			this.field2055 = var4; // L: 38
		} else if (this.field2056 > this.field2057[this.field2058]) { // L: 40
			this.field2053 = (int)((long)(var1 * 2560) / (this.field2056 - this.field2057[this.field2058]));
		}

		if (this.field2053 < 25) { // L: 41
			this.field2053 = 25;
		}

		if (this.field2053 > 256) { // L: 42
			this.field2053 = 256; // L: 43
			this.field2055 = (int)((long)var1 - (this.field2056 - this.field2057[this.field2058]) / 10L); // L: 44
		}

		if (this.field2055 > var1) { // L: 46
			this.field2055 = var1;
		}

		this.field2057[this.field2058] = this.field2056; // L: 47
		this.field2058 = (this.field2058 + 1) % 10; // L: 48
		int var5;
		if (this.field2055 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field2057[var5]) { // L: 51
					this.field2057[var5] += (long)this.field2055;
				}
			}
		}

		if (this.field2055 < var2) { // L: 54
			this.field2055 = var2;
		}

		class227.sleepExact((long)this.field2055); // L: 55

		for (var5 = 0; this.field2054 < 256; this.field2054 += this.field2053) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field2054 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-473742756"
	)
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 142
	}
}
