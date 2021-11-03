import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = 4485476439573351559L
	)
	long field3896;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 6376917815787743615L
	)
	long field3895;
	@ObfuscatedName("s")
	public boolean field3900;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 357962707005069125L
	)
	long field3897;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -7413813924228279315L
	)
	long field3898;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -3703343557375834617L
	)
	long field3894;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1540289443
	)
	int field3899;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 407913171
	)
	int field3901;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1614050671
	)
	int field3902;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -18152441
	)
	int field3903;

	public Timer() {
		this.field3896 = -1L; // L: 7
		this.field3895 = -1L; // L: 8
		this.field3900 = false; // L: 9
		this.field3897 = 0L; // L: 10
		this.field3898 = 0L; // L: 11
		this.field3894 = 0L; // L: 12
		this.field3899 = 0; // L: 13
		this.field3901 = 0; // L: 14
		this.field3902 = 0; // L: 15
		this.field3903 = 0; // L: 16
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	public void method5972() {
		this.field3896 = class111.method2516(); // L: 19
	} // L: 20

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1321149777"
	)
	public void method5978() {
		if (-1L != this.field3896) { // L: 23
			this.field3898 = class111.method2516() - this.field3896; // L: 24
			this.field3896 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "119"
	)
	public void method5973(int var1) {
		this.field3895 = class111.method2516(); // L: 30
		this.field3899 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "229876245"
	)
	public void method5974() {
		if (this.field3895 != -1L) { // L: 35
			this.field3897 = class111.method2516() - this.field3895; // L: 36
			this.field3895 = -1L; // L: 37
		}

		++this.field3902; // L: 39
		this.field3900 = true; // L: 40
	} // L: 41

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1931068869"
	)
	public void method5975() {
		this.field3900 = false; // L: 44
		this.field3901 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1431059239"
	)
	public void method5970() {
		this.method5974(); // L: 49
	} // L: 50

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "417956413"
	)
	@Export("write")
	public void write(Buffer var1) {
		class264.method5144(var1, this.field3898); // L: 53
		class264.method5144(var1, this.field3897); // L: 54
		class264.method5144(var1, this.field3894); // L: 55
		var1.writeShort(this.field3899); // L: 56
		var1.writeShort(this.field3901); // L: 57
		var1.writeShort(this.field3902); // L: 58
		var1.writeShort(this.field3903); // L: 59
	} // L: 60
}
