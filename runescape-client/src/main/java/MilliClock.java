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
		this.field2030 = new long[10];
		this.field2031 = 256;
		this.field2032 = 1;
		this.field2034 = 0;
		this.field2038 = class298.currentTimeMillis();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2030[var1] = this.field2038;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2095078818"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2030[var1] = 0L;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-680717242"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2031;
		int var4 = this.field2032;
		this.field2031 = 300;
		this.field2032 = 1;
		this.field2038 = class298.currentTimeMillis();
		if (0L == this.field2030[this.field2035]) {
			this.field2031 = var3;
			this.field2032 = var4;
		} else if (this.field2038 > this.field2030[this.field2035]) {
			this.field2031 = (int)((long)(var1 * 2560) / (this.field2038 - this.field2030[this.field2035]));
		}

		if (this.field2031 < 25) {
			this.field2031 = 25;
		}

		if (this.field2031 > 256) {
			this.field2031 = 256;
			this.field2032 = (int)((long)var1 - (this.field2038 - this.field2030[this.field2035]) / 10L);
		}

		if (this.field2032 > var1) {
			this.field2032 = var1;
		}

		this.field2030[this.field2035] = this.field2038;
		this.field2035 = (this.field2035 + 1) % 10;
		int var5;
		if (this.field2032 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2030[var5] != 0L) {
					this.field2030[var5] += (long)this.field2032;
				}
			}
		}

		if (this.field2032 < var2) {
			this.field2032 = var2;
		}

		class236.sleepExact((long)this.field2032);

		for (var5 = 0; this.field2034 < 256; this.field2034 += this.field2031) {
			++var5;
		}

		this.field2034 &= 255;
		return var5;
	}
}
