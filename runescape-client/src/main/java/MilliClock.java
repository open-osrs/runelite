import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("h")
	long[] field2030;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -367823923
	)
	int field2031;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -830034537
	)
	int field2032;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 4655820028414698343L
	)
	long field2038;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 744937881
	)
	int field2034;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 802438317
	)
	int field2035;

	public MilliClock() {
		this.field2030 = new long[10]; // L: 7
		this.field2031 = 256; // L: 15
		this.field2032 = 1; // L: 16
		this.field2034 = 0; // L: 17
		this.field2038 = class298.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field2030[var1] = this.field2038; // L: 20
		}

	} // L: 22

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2095078818"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field2030[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-680717242"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2031; // L: 31
		int var4 = this.field2032; // L: 32
		this.field2031 = 300; // L: 33
		this.field2032 = 1; // L: 34
		this.field2038 = class298.currentTimeMillis(); // L: 35
		if (0L == this.field2030[this.field2035]) { // L: 36
			this.field2031 = var3; // L: 37
			this.field2032 = var4; // L: 38
		} else if (this.field2038 > this.field2030[this.field2035]) { // L: 40
			this.field2031 = (int)((long)(var1 * 2560) / (this.field2038 - this.field2030[this.field2035]));
		}

		if (this.field2031 < 25) { // L: 41
			this.field2031 = 25;
		}

		if (this.field2031 > 256) { // L: 42
			this.field2031 = 256; // L: 43
			this.field2032 = (int)((long)var1 - (this.field2038 - this.field2030[this.field2035]) / 10L); // L: 44
		}

		if (this.field2032 > var1) { // L: 46
			this.field2032 = var1;
		}

		this.field2030[this.field2035] = this.field2038; // L: 47
		this.field2035 = (this.field2035 + 1) % 10; // L: 48
		int var5;
		if (this.field2032 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field2030[var5] != 0L) { // L: 51
					this.field2030[var5] += (long)this.field2032;
				}
			}
		}

		if (this.field2032 < var2) { // L: 54
			this.field2032 = var2;
		}

		class236.sleepExact((long)this.field2032); // L: 55

		for (var5 = 0; this.field2034 < 256; this.field2034 += this.field2031) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field2034 &= 255; // L: 61
		return var5; // L: 62
	}
}
