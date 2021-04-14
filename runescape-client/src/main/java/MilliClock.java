import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("f")
	long[] field1509;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -57079655
	)
	int field1502;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1775737415
	)
	int field1504;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -7099522440067611417L
	)
	long field1505;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -193436617
	)
	int field1503;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1791483173
	)
	int field1506;

	MilliClock() {
		this.field1509 = new long[10]; // L: 7
		this.field1502 = 256; // L: 15
		this.field1504 = 1; // L: 16
		this.field1503 = 0; // L: 17
		this.field1505 = ObjectSound.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1509[var1] = this.field1505; // L: 20
		}

	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-629"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1509[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1172254968"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1502; // L: 31
		int var4 = this.field1504; // L: 32
		this.field1502 = 300; // L: 33
		this.field1504 = 1; // L: 34
		this.field1505 = ObjectSound.currentTimeMillis(); // L: 35
		if (0L == this.field1509[this.field1506]) { // L: 36
			this.field1502 = var3; // L: 37
			this.field1504 = var4; // L: 38
		} else if (this.field1505 > this.field1509[this.field1506]) { // L: 40
			this.field1502 = (int)((long)(var1 * 2560) / (this.field1505 - this.field1509[this.field1506]));
		}

		if (this.field1502 < 25) { // L: 41
			this.field1502 = 25;
		}

		if (this.field1502 > 256) { // L: 42
			this.field1502 = 256; // L: 43
			this.field1504 = (int)((long)var1 - (this.field1505 - this.field1509[this.field1506]) / 10L); // L: 44
		}

		if (this.field1504 > var1) { // L: 46
			this.field1504 = var1;
		}

		this.field1509[this.field1506] = this.field1505; // L: 47
		this.field1506 = (this.field1506 + 1) % 10; // L: 48
		int var5;
		if (this.field1504 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1509[var5] != 0L) { // L: 51
					this.field1509[var5] += (long)this.field1504;
				}
			}
		}

		if (this.field1504 < var2) { // L: 54
			this.field1504 = var2;
		}

		GrandExchangeEvent.sleepExact((long)this.field1504); // L: 55

		for (var5 = 0; this.field1503 < 256; this.field1503 += this.field1502) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1503 &= 255; // L: 61
		return var5; // L: 62
	}
}
