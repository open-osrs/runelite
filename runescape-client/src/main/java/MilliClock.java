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
		this.field1718 = new long[10]; // L: 7
		this.field1719 = 256; // L: 15
		this.field1716 = 1; // L: 16
		this.field1714 = 0; // L: 17
		this.field1717 = Ignored.method6459(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1718[var1] = this.field1717; // L: 20
		}

	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "18"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1718[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "293215312"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1719; // L: 31
		int var4 = this.field1716; // L: 32
		this.field1719 = 300; // L: 33
		this.field1716 = 1; // L: 34
		this.field1717 = Ignored.method6459(); // L: 35
		if (0L == this.field1718[this.field1715]) { // L: 36
			this.field1719 = var3; // L: 37
			this.field1716 = var4; // L: 38
		} else if (this.field1717 > this.field1718[this.field1715]) { // L: 40
			this.field1719 = (int)((long)(var1 * 2560) / (this.field1717 - this.field1718[this.field1715]));
		}

		if (this.field1719 < 25) { // L: 41
			this.field1719 = 25;
		}

		if (this.field1719 > 256) { // L: 42
			this.field1719 = 256; // L: 43
			this.field1716 = (int)((long)var1 - (this.field1717 - this.field1718[this.field1715]) / 10L); // L: 44
		}

		if (this.field1716 > var1) { // L: 46
			this.field1716 = var1;
		}

		this.field1718[this.field1715] = this.field1717; // L: 47
		this.field1715 = (this.field1715 + 1) % 10; // L: 48
		int var5;
		if (this.field1716 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1718[var5]) { // L: 51
					this.field1718[var5] += (long)this.field1716;
				}
			}
		}

		if (this.field1716 < var2) { // L: 54
			this.field1716 = var2;
		}

		Bounds.method6608((long)this.field1716); // L: 55

		for (var5 = 0; this.field1714 < 256; this.field1714 += this.field1719) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1714 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "322688664"
	)
	static boolean method3121() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5584
	}
}
