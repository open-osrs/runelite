import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 4555750395140073021L
	)
	long field4185;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		longValue = -2846643341585363461L
	)
	long field4183;
	@ObfuscatedName("h")
	public boolean field4182;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 5666983759497851335L
	)
	long field4189;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 796750526860624939L
	)
	long field4186;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -3256458823420726931L
	)
	long field4187;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 283694851
	)
	int field4188;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2009036561
	)
	int field4184;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 43489845
	)
	int field4190;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 425168073
	)
	int field4191;

	public Timer() {
		this.field4185 = -1L; // L: 7
		this.field4183 = -1L; // L: 8
		this.field4182 = false; // L: 9
		this.field4189 = 0L; // L: 10
		this.field4186 = 0L; // L: 11
		this.field4187 = 0L; // L: 12
		this.field4188 = 0; // L: 13
		this.field4184 = 0; // L: 14
		this.field4190 = 0; // L: 15
		this.field4191 = 0; // L: 16
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2052102546"
	)
	public void method6594() {
		this.field4185 = WorldMapSprite.method4989(); // L: 19
	} // L: 20

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method6595() {
		if (this.field4185 != -1L) { // L: 23
			this.field4186 = WorldMapSprite.method4989() - this.field4185; // L: 24
			this.field4185 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-20934"
	)
	public void method6596(int var1) {
		this.field4183 = WorldMapSprite.method4989(); // L: 30
		this.field4188 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1987458157"
	)
	public void method6597() {
		if (this.field4183 != -1L) { // L: 35
			this.field4189 = WorldMapSprite.method4989() - this.field4183; // L: 36
			this.field4183 = -1L; // L: 37
		}

		++this.field4190; // L: 39
		this.field4182 = true; // L: 40
	} // L: 41

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "85953838"
	)
	public void method6593() {
		this.field4182 = false; // L: 44
		this.field4184 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-687283504"
	)
	public void method6598() {
		this.method6597(); // L: 49
	} // L: 50

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lpd;I)V",
		garbageValue = "-893944716"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4186; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4189; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4187; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4188); // L: 74
		var1.writeShort(this.field4184); // L: 75
		var1.writeShort(this.field4190); // L: 76
		var1.writeShort(this.field4191); // L: 77
	} // L: 78
}
