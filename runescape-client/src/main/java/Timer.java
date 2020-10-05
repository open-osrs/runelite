import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -5225543966373226735L
	)
	long field3597;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = 4082684683626742437L
	)
	long field3602;
	@ObfuscatedName("s")
	public boolean field3598;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -551536066132799497L
	)
	long field3600;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -5071374217160666521L
	)
	long field3601;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = 6965498240839128689L
	)
	long field3606;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1025178027
	)
	int field3603;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -931396039
	)
	int field3604;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -531975401
	)
	int field3605;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -76474973
	)
	int field3599;

	public Timer() {
		this.field3597 = -1L; // L: 7
		this.field3602 = -1L; // L: 8
		this.field3598 = false; // L: 9
		this.field3600 = 0L; // L: 10
		this.field3601 = 0L; // L: 11
		this.field3606 = 0L; // L: 12
		this.field3603 = 0; // L: 13
		this.field3604 = 0; // L: 14
		this.field3605 = 0; // L: 15
		this.field3599 = 0; // L: 16
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1776227441"
	)
	public void method5106() {
		this.field3597 = PacketWriter.currentTimeMillis(); // L: 19
	} // L: 20

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2001375296"
	)
	public void method5098() {
		if (-1L != this.field3597) { // L: 23
			this.field3601 = PacketWriter.currentTimeMillis() - this.field3597; // L: 24
			this.field3597 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1052633329"
	)
	public void method5110(int var1) {
		this.field3602 = PacketWriter.currentTimeMillis(); // L: 30
		this.field3603 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "683776298"
	)
	public void method5100() {
		if (-1L != this.field3602) { // L: 35
			this.field3600 = PacketWriter.currentTimeMillis() - this.field3602; // L: 36
			this.field3602 = -1L; // L: 37
		}

		++this.field3605; // L: 39
		this.field3598 = true; // L: 40
	} // L: 41

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1997993253"
	)
	public void method5101() {
		this.field3598 = false; // L: 44
		this.field3604 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-729089885"
	)
	public void method5099() {
		this.method5100(); // L: 49
	} // L: 50

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1209731041"
	)
	public void write(Buffer var1) {
		long var2 = this.field3601; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field3600; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field3606; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field3603); // L: 74
		var1.writeShort(this.field3604); // L: 75
		var1.writeShort(this.field3605); // L: 76
		var1.writeShort(this.field3599); // L: 77
	} // L: 78

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "98"
	)
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 135
		int var2 = 0; // L: 136

		for (int var3 = 0; var3 < var1; ++var3) { // L: 137
			var2 = (var2 << 5) - var2 + class227.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 138
	}
}
