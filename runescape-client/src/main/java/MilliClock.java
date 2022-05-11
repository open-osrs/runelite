import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("o")
	long[] field1817;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -613728771
	)
	int field1815;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2030028533
	)
	int field1816;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 6860375109753774457L
	)
	long field1814;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 101342221
	)
	int field1818;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 578259899
	)
	int field1819;

	MilliClock() {
		this.field1817 = new long[10]; // L: 7
		this.field1815 = 256; // L: 15
		this.field1816 = 1; // L: 16
		this.field1818 = 0; // L: 17
		this.field1814 = class113.method2624(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1817[var1] = this.field1814; // L: 20
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1993169750"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1817[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1389334721"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1815; // L: 31
		int var4 = this.field1816; // L: 32
		this.field1815 = 300; // L: 33
		this.field1816 = 1; // L: 34
		this.field1814 = class113.method2624(); // L: 35
		if (0L == this.field1817[this.field1819]) { // L: 36
			this.field1815 = var3; // L: 37
			this.field1816 = var4; // L: 38
		} else if (this.field1814 > this.field1817[this.field1819]) { // L: 40
			this.field1815 = (int)((long)(var1 * 2560) / (this.field1814 - this.field1817[this.field1819]));
		}

		if (this.field1815 < 25) { // L: 41
			this.field1815 = 25;
		}

		if (this.field1815 > 256) { // L: 42
			this.field1815 = 256; // L: 43
			this.field1816 = (int)((long)var1 - (this.field1814 - this.field1817[this.field1819]) / 10L); // L: 44
		}

		if (this.field1816 > var1) { // L: 46
			this.field1816 = var1;
		}

		this.field1817[this.field1819] = this.field1814; // L: 47
		this.field1819 = (this.field1819 + 1) % 10; // L: 48
		int var5;
		if (this.field1816 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (0L != this.field1817[var5]) { // L: 51
					this.field1817[var5] += (long)this.field1816;
				}
			}
		}

		if (this.field1816 < var2) { // L: 54
			this.field1816 = var2;
		}

		class241.method4815((long)this.field1816); // L: 55

		for (var5 = 0; this.field1818 < 256; this.field1818 += this.field1815) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1818 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1996215175"
	)
	static void method3219(int var0) {
		GrandExchangeOfferTotalQuantityComparator.field4069 = var0; // L: 21
		class388.field4402 = new class388[var0]; // L: 22
		class388.field4401 = 0; // L: 23
	} // L: 24

	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "(I)Lop;",
		garbageValue = "-973548519"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return ServerPacket.worldMap; // L: 679
	}
}
