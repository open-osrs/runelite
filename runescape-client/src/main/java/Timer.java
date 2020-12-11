import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 3770281443563997935L
	)
	long field3620;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -2250207918034291381L
	)
	long field3616;
	@ObfuscatedName("x")
	public boolean field3614;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -2802156095156479445L
	)
	long field3615;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -1144199365391722153L
	)
	long field3622;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = -6579691889222792449L
	)
	long field3613;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 121997523
	)
	int field3618;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1353523553
	)
	int field3619;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1070107525
	)
	int field3612;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1445210843
	)
	int field3621;

	public Timer() {
		this.field3620 = -1L; // L: 7
		this.field3616 = -1L; // L: 8
		this.field3614 = false; // L: 9
		this.field3615 = 0L; // L: 10
		this.field3622 = 0L; // L: 11
		this.field3613 = 0L; // L: 12
		this.field3618 = 0; // L: 13
		this.field3619 = 0; // L: 14
		this.field3612 = 0; // L: 15
		this.field3621 = 0; // L: 16
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	public void method5010() {
		this.field3620 = class298.currentTimeMillis(); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1990101755"
	)
	public void method5018() {
		if (-1L != this.field3620) { // L: 23
			this.field3622 = class298.currentTimeMillis() - this.field3620; // L: 24
			this.field3620 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	public void method5033(int var1) {
		this.field3616 = class298.currentTimeMillis(); // L: 30
		this.field3618 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "820461529"
	)
	public void method5013() {
		if (this.field3616 != -1L) { // L: 35
			this.field3615 = class298.currentTimeMillis() - this.field3616; // L: 36
			this.field3616 = -1L; // L: 37
		}

		++this.field3612; // L: 39
		this.field3614 = true; // L: 40
	} // L: 41

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method5014() {
		this.field3614 = false; // L: 44
		this.field3619 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-105042609"
	)
	public void method5015() {
		this.method5013(); // L: 49
	} // L: 50

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1266632335"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3622; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field3615; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field3613; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field3618); // L: 74
		var1.writeShort(this.field3619); // L: 75
		var1.writeShort(this.field3612); // L: 76
		var1.writeShort(this.field3621); // L: 77
	} // L: 78
}
