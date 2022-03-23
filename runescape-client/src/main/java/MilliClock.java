import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("v")
	long[] field1788;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1148661387
	)
	int field1784;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 426032869
	)
	int field1785;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -8930858235242911925L
	)
	long field1786;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1472705891
	)
	int field1787;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -985366599
	)
	int field1783;

	MilliClock() {
		this.field1788 = new long[10]; // L: 7
		this.field1784 = 256; // L: 15
		this.field1785 = 1; // L: 16
		this.field1787 = 0; // L: 17
		this.field1786 = WorldMapSprite.method4989(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1788[var1] = this.field1786; // L: 20
		}

	} // L: 22

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "947451014"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1788[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-932830121"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1784; // L: 31
		int var4 = this.field1785; // L: 32
		this.field1784 = 300; // L: 33
		this.field1785 = 1; // L: 34
		this.field1786 = WorldMapSprite.method4989(); // L: 35
		if (this.field1788[this.field1783] == 0L) { // L: 36
			this.field1784 = var3; // L: 37
			this.field1785 = var4; // L: 38
		} else if (this.field1786 > this.field1788[this.field1783]) { // L: 40
			this.field1784 = (int)((long)(var1 * 2560) / (this.field1786 - this.field1788[this.field1783]));
		}

		if (this.field1784 < 25) { // L: 41
			this.field1784 = 25;
		}

		if (this.field1784 > 256) { // L: 42
			this.field1784 = 256; // L: 43
			this.field1785 = (int)((long)var1 - (this.field1786 - this.field1788[this.field1783]) / 10L); // L: 44
		}

		if (this.field1785 > var1) { // L: 46
			this.field1785 = var1;
		}

		this.field1788[this.field1783] = this.field1786; // L: 47
		this.field1783 = (this.field1783 + 1) % 10; // L: 48
		int var5;
		if (this.field1785 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1788[var5] != 0L) { // L: 51
					this.field1788[var5] += (long)this.field1785;
				}
			}
		}

		if (this.field1785 < var2) { // L: 54
			this.field1785 = var2;
		}

		GrandExchangeOfferTotalQuantityComparator.method6007((long)this.field1785); // L: 55

		for (var5 = 0; this.field1787 < 256; this.field1787 += this.field1784) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1787 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "-220853787"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17; // L: 85
		if (var3) { // L: 86
			var5 |= 65536L;
		}

		return var5; // L: 87
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILbo;ZI)I",
		garbageValue = "2046695299"
	)
	static int method3293(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4511
			Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4512
			return 1; // L: 4513
		} else if (var0 != 6801 && var0 != 6802) { // L: 4515
			if (var0 == 6850) { // L: 4519
				Interpreter.Interpreter_stringStack[++ChatChannel.Interpreter_stringStackSize - 1] = ""; // L: 4520
				return 1; // L: 4521
			} else if (var0 != 6851 && var0 != 6852) { // L: 4523
				if (var0 == 6853) { // L: 4527
					Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = 0; // L: 4528
					return 1; // L: 4529
				} else {
					return 2; // L: 4531
				}
			} else {
				Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4524
				return 1; // L: 4525
			}
		} else {
			Interpreter.Interpreter_intStack[++class295.Interpreter_intStackSize - 1] = -1; // L: 4516
			return 1; // L: 4517
		}
	}
}
