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
		this.field4041 = -1L;
		this.field4048 = -1L;
		this.field4043 = false;
		this.field4044 = 0L;
		this.field4045 = 0L;
		this.field4050 = 0L;
		this.field4046 = 0;
		this.field4047 = 0;
		this.field4049 = 0;
		this.field4042 = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "59649257"
	)
	public void method6253() {
		this.field4041 = Ignored.method6459();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "511000597"
	)
	public void method6231() {
		if (-1L != this.field4041) {
			this.field4045 = Ignored.method6459() - this.field4041;
			this.field4041 = -1L;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1146982108"
	)
	public void method6232(int var1) {
		this.field4048 = Ignored.method6459();
		this.field4046 = var1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-14983826"
	)
	public void method6234() {
		if (this.field4048 != -1L) {
			this.field4044 = Ignored.method6459() - this.field4048;
			this.field4048 = -1L;
		}

		++this.field4049;
		this.field4043 = true;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1689549111"
	)
	public void method6238() {
		this.field4043 = false;
		this.field4047 = 0;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "145143672"
	)
	public void method6244() {
		this.method6234();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-405863584"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4045;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4044;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4050;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4046);
		var1.writeShort(this.field4047);
		var1.writeShort(this.field4049);
		var1.writeShort(this.field4042);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lif;",
		garbageValue = "1360000717"
	)
	public static class253[] method6230() {
		return new class253[]{class253.field2918, class253.field2911, class253.field2912, class253.field2913, class253.field2914, class253.field2915, class253.field2916, class253.field2917, class253.field2920, class253.field2919};
	}
}
