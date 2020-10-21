import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 8550403030095862389L
	)
	long field3604;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 7994702175123860963L
	)
	long field3607;
	@ObfuscatedName("l")
	public boolean field3606;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 4133381384365556773L
	)
	long field3608;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = 3557480670410738873L
	)
	long field3605;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = 6361595278255869411L
	)
	long field3609;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -134378941
	)
	int field3610;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -337124169
	)
	int field3611;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2101828205
	)
	int field3612;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1450803179
	)
	int field3613;

	public Timer() {
		this.field3604 = -1L; // L: 7
		this.field3607 = -1L; // L: 8
		this.field3606 = false; // L: 9
		this.field3608 = 0L; // L: 10
		this.field3605 = 0L; // L: 11
		this.field3609 = 0L; // L: 12
		this.field3610 = 0; // L: 13
		this.field3611 = 0; // L: 14
		this.field3612 = 0; // L: 15
		this.field3613 = 0; // L: 16
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	public void method5135() {
		this.field3604 = User.currentTimeMillis(); // L: 19
	} // L: 20

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "568889217"
	)
	public void method5147() {
		if (this.field3604 != -1L) { // L: 23
			this.field3605 = User.currentTimeMillis() - this.field3604; // L: 24
			this.field3604 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-391105625"
	)
	public void method5153(int var1) {
		this.field3607 = User.currentTimeMillis(); // L: 30
		this.field3610 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	public void method5137() {
		if (this.field3607 != -1L) { // L: 35
			this.field3608 = User.currentTimeMillis() - this.field3607; // L: 36
			this.field3607 = -1L; // L: 37
		}

		++this.field3612; // L: 39
		this.field3606 = true; // L: 40
	} // L: 41

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public void method5142() {
		this.field3606 = false; // L: 44
		this.field3611 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1427350248"
	)
	public void method5139() {
		this.method5137(); // L: 49
	} // L: 50

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-942267659"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3605; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field3608; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field3609; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field3610); // L: 74
		var1.writeShort(this.field3611); // L: 75
		var1.writeShort(this.field3612); // L: 76
		var1.writeShort(this.field3613); // L: 77
	} // L: 78
}
