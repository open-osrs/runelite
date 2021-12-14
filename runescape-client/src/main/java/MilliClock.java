import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("c")
	long[] field1718;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1638196517
	)
	int field1719;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -91104037
	)
	int field1716;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 1696569632045813077L
	)
	long field1717;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2107971493
	)
	int field1714;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -465084751
	)
	int field1715;

	public MilliClock() {
		this.field1718 = new long[10];
		this.field1719 = 256;
		this.field1716 = 1;
		this.field1714 = 0;
		this.field1717 = Ignored.method6459();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1718[var1] = this.field1717;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1718[var1] = 0L;
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "293215312"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1719;
		int var4 = this.field1716;
		this.field1719 = 300;
		this.field1716 = 1;
		this.field1717 = Ignored.method6459();
		if (0L == this.field1718[this.field1715]) {
			this.field1719 = var3;
			this.field1716 = var4;
		} else if (this.field1717 > this.field1718[this.field1715]) {
			this.field1719 = (int)((long)(var1 * 2560) / (this.field1717 - this.field1718[this.field1715]));
		}

		if (this.field1719 < 25) {
			this.field1719 = 25;
		}

		if (this.field1719 > 256) {
			this.field1719 = 256;
			this.field1716 = (int)((long)var1 - (this.field1717 - this.field1718[this.field1715]) / 10L);
		}

		if (this.field1716 > var1) {
			this.field1716 = var1;
		}

		this.field1718[this.field1715] = this.field1717;
		this.field1715 = (this.field1715 + 1) % 10;
		int var5;
		if (this.field1716 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1718[var5]) {
					this.field1718[var5] += (long)this.field1716;
				}
			}
		}

		if (this.field1716 < var2) {
			this.field1716 = var2;
		}

		Bounds.method6608((long)this.field1716);

		for (var5 = 0; this.field1714 < 256; this.field1714 += this.field1719) {
			++var5;
		}

		this.field1714 &= 255;
		return var5;
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "322688664"
	)
	static boolean method3121() {
		return (Client.drawPlayerNames & 4) != 0;
	}
}
