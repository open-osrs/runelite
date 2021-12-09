import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -887996437388493325L
	)
	long field4041;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -5378491660972395407L
	)
	long field4048;
	@ObfuscatedName("p")
	public boolean field4043;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 462489706516465413L
	)
	long field4044;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = 2942582294320251895L
	)
	long field4045;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -7148108535853774599L
	)
	long field4050;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 271135193
	)
	int field4046;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -664442429
	)
	int field4047;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -615508399
	)
	int field4049;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1914912277
	)
	int field4042;

	public Timer() {
		this.field4041 = -1L; // L: 7
		this.field4048 = -1L; // L: 8
		this.field4043 = false; // L: 9
		this.field4044 = 0L; // L: 10
		this.field4045 = 0L; // L: 11
		this.field4050 = 0L; // L: 12
		this.field4046 = 0; // L: 13
		this.field4047 = 0; // L: 14
		this.field4049 = 0; // L: 15
		this.field4042 = 0; // L: 16
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "59649257"
	)
	public void method6253() {
		this.field4041 = Ignored.method6459(); // L: 19
	} // L: 20

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "511000597"
	)
	public void method6231() {
		if (-1L != this.field4041) { // L: 23
			this.field4045 = Ignored.method6459() - this.field4041; // L: 24
			this.field4041 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1146982108"
	)
	public void method6232(int var1) {
		this.field4048 = Ignored.method6459(); // L: 30
		this.field4046 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-14983826"
	)
	public void method6234() {
		if (this.field4048 != -1L) { // L: 35
			this.field4044 = Ignored.method6459() - this.field4048; // L: 36
			this.field4048 = -1L; // L: 37
		}

		++this.field4049; // L: 39
		this.field4043 = true; // L: 40
	} // L: 41

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1689549111"
	)
	public void method6238() {
		this.field4043 = false; // L: 44
		this.field4047 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "145143672"
	)
	public void method6244() {
		this.method6234(); // L: 49
	} // L: 50

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-405863584"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4045; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4044; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4050; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4046); // L: 74
		var1.writeShort(this.field4047); // L: 75
		var1.writeShort(this.field4049); // L: 76
		var1.writeShort(this.field4042); // L: 77
	} // L: 78

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lif;",
		garbageValue = "1360000717"
	)
	public static class253[] method6230() {
		return new class253[]{class253.field2918, class253.field2911, class253.field2912, class253.field2913, class253.field2914, class253.field2915, class253.field2916, class253.field2917, class253.field2920, class253.field2919}; // L: 17
	}
}
