import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1292974499
	)
	static int field1523;
	@ObfuscatedName("ab")
	static Image field1527;
	@ObfuscatedName("f")
	long[] field1518;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1121640641
	)
	int field1519;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1291175111
	)
	int field1521;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 6157496358684260999L
	)
	long field1520;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -15673867
	)
	int field1522;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -668116803
	)
	int field1525;

	public MilliClock() {
		this.field1518 = new long[10]; // L: 7
		this.field1519 = 256; // L: 15
		this.field1521 = 1; // L: 16
		this.field1522 = 0; // L: 17
		this.field1520 = ClientPacket.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1518[var1] = this.field1520; // L: 20
		}

	} // L: 22

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1518[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-104"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1519; // L: 31
		int var4 = this.field1521; // L: 32
		this.field1519 = 300; // L: 33
		this.field1521 = 1; // L: 34
		this.field1520 = ClientPacket.currentTimeMillis(); // L: 35
		if (this.field1518[this.field1525] == 0L) { // L: 36
			this.field1519 = var3; // L: 37
			this.field1521 = var4; // L: 38
		} else if (this.field1520 > this.field1518[this.field1525]) { // L: 40
			this.field1519 = (int)((long)(var1 * 2560) / (this.field1520 - this.field1518[this.field1525]));
		}

		if (this.field1519 < 25) { // L: 41
			this.field1519 = 25;
		}

		if (this.field1519 > 256) { // L: 42
			this.field1519 = 256; // L: 43
			this.field1521 = (int)((long)var1 - (this.field1520 - this.field1518[this.field1525]) / 10L); // L: 44
		}

		if (this.field1521 > var1) { // L: 46
			this.field1521 = var1;
		}

		this.field1518[this.field1525] = this.field1520; // L: 47
		this.field1525 = (this.field1525 + 1) % 10; // L: 48
		int var5;
		if (this.field1521 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1518[var5] != 0L) { // L: 51
					this.field1518[var5] += (long)this.field1521;
				}
			}
		}

		if (this.field1521 < var2) { // L: 54
			this.field1521 = var2;
		}

		class18.method272((long)this.field1521); // L: 55

		for (var5 = 0; this.field1522 < 256; this.field1522 += this.field1519) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1522 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZB)I",
		garbageValue = "70"
	)
	static int method2685(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) { // L: 2067
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2068
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class18.method271(var3) ? 1 : 0; // L: 2069
			return 1; // L: 2070
		} else if (var0 == 3501) { // L: 2072
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2073
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = ClanChannelMember.method108(var3) ? 1 : 0; // L: 2074
			return 1; // L: 2075
		} else if (var0 == 3502) { // L: 2077
			var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 2078
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = KitDefinition.method2778(var3) ? 1 : 0; // L: 2079
			return 1; // L: 2080
		} else {
			return 2; // L: 2082
		}
	}
}
