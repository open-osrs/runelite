import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = -2229775801046207963L
	)
	long field3776;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -2890453841099618337L
	)
	long field3772;
	@ObfuscatedName("u")
	public boolean field3773;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = -7962001912981584977L
	)
	long field3774;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 8981361987879773313L
	)
	long field3771;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		longValue = 329501522501233997L
	)
	long field3778;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1107893853
	)
	int field3775;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1705593105
	)
	int field3777;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 825874723
	)
	int field3779;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2111113097
	)
	int field3780;

	public Timer() {
		this.field3776 = -1L; // L: 7
		this.field3772 = -1L; // L: 8
		this.field3773 = false; // L: 9
		this.field3774 = 0L; // L: 10
		this.field3771 = 0L; // L: 11
		this.field3778 = 0L; // L: 12
		this.field3775 = 0; // L: 13
		this.field3777 = 0; // L: 14
		this.field3779 = 0; // L: 15
		this.field3780 = 0; // L: 16
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2125552653"
	)
	public void method5577() {
		this.field3776 = ObjectSound.currentTimeMillis(); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1077201550"
	)
	public void method5578() {
		if (this.field3776 != -1L) { // L: 23
			this.field3771 = ObjectSound.currentTimeMillis() - this.field3776; // L: 24
			this.field3776 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	public void method5579(int var1) {
		this.field3772 = ObjectSound.currentTimeMillis(); // L: 30
		this.field3775 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-44027989"
	)
	public void method5587() {
		if (-1L != this.field3772) { // L: 35
			this.field3774 = ObjectSound.currentTimeMillis() - this.field3772; // L: 36
			this.field3772 = -1L; // L: 37
		}

		++this.field3779; // L: 39
		this.field3773 = true; // L: 40
	} // L: 41

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
	)
	public void method5581() {
		this.field3773 = false; // L: 44
		this.field3777 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-170289943"
	)
	public void method5582() {
		this.method5587(); // L: 49
	} // L: 50

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnu;B)V",
		garbageValue = "114"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3771; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field3774; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field3778; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field3775); // L: 74
		var1.writeShort(this.field3777); // L: 75
		var1.writeShort(this.field3779); // L: 76
		var1.writeShort(this.field3780); // L: 77
	} // L: 78
}
