import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("f")
	static String[] field3621;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -2999131098664295081L
	)
	long field3620;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 8703508403484672025L
	)
	long field3611;
	@ObfuscatedName("d")
	public boolean field3616;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 6712649404077510219L
	)
	long field3614;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		longValue = 6713522721722477663L
	)
	long field3612;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 4706314381784357345L
	)
	long field3615;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 231611023
	)
	int field3617;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 764593875
	)
	int field3618;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -941214579
	)
	int field3613;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1615778673
	)
	int field3619;

	public Timer() {
		this.field3620 = -1L; // L: 7
		this.field3611 = -1L; // L: 8
		this.field3616 = false; // L: 9
		this.field3614 = 0L; // L: 10
		this.field3612 = 0L; // L: 11
		this.field3615 = 0L; // L: 12
		this.field3617 = 0; // L: 13
		this.field3618 = 0; // L: 14
		this.field3613 = 0; // L: 15
		this.field3619 = 0; // L: 16
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method5212() {
		this.field3620 = Tiles.currentTimeMillis(); // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-86650625"
	)
	public void method5206() {
		if (-1L != this.field3620) { // L: 23
			this.field3612 = Tiles.currentTimeMillis() - this.field3620; // L: 24
			this.field3620 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-330894833"
	)
	public void method5211(int var1) {
		this.field3611 = Tiles.currentTimeMillis(); // L: 30
		this.field3617 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "40"
	)
	public void method5198() {
		if (this.field3611 != -1L) { // L: 35
			this.field3614 = Tiles.currentTimeMillis() - this.field3611; // L: 36
			this.field3611 = -1L; // L: 37
		}

		++this.field3613; // L: 39
		this.field3616 = true; // L: 40
	} // L: 41

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1966837629"
	)
	public void method5199() {
		this.field3616 = false; // L: 44
		this.field3618 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "435711064"
	)
	public void method5200() {
		this.method5198(); // L: 49
	} // L: 50

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkx;S)V",
		garbageValue = "-14322"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field3612; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field3614; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field3615; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field3617); // L: 74
		var1.writeShort(this.field3618); // L: 75
		var1.writeShort(this.field3613); // L: 76
		var1.writeShort(this.field3619); // L: 77
	} // L: 78
}
