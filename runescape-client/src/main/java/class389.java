import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class389 {
	@ObfuscatedName("o")
	float field4410;
	@ObfuscatedName("q")
	float field4405;
	@ObfuscatedName("l")
	float field4406;
	@ObfuscatedName("k")
	float field4407;
	@ObfuscatedName("a")
	float field4409;
	@ObfuscatedName("m")
	float field4412;
	@ObfuscatedName("p")
	float field4413;
	@ObfuscatedName("s")
	float field4411;
	@ObfuscatedName("r")
	float field4404;
	@ObfuscatedName("v")
	float field4408;
	@ObfuscatedName("y")
	float field4414;
	@ObfuscatedName("c")
	float field4415;

	static {
		new class389();
	} // L: 6

	class389() {
		this.method6876(); // L: 22
	} // L: 23

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1906485872"
	)
	void method6876() {
		this.field4415 = 0.0F; // L: 26
		this.field4414 = 0.0F; // L: 27
		this.field4408 = 0.0F; // L: 28
		this.field4411 = 0.0F; // L: 29
		this.field4413 = 0.0F; // L: 30
		this.field4412 = 0.0F; // L: 31
		this.field4407 = 0.0F; // L: 32
		this.field4406 = 0.0F; // L: 33
		this.field4405 = 0.0F; // L: 34
		this.field4404 = 1.0F; // L: 35
		this.field4409 = 1.0F; // L: 36
		this.field4410 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1653714241"
	)
	void method6877(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4405; // L: 43
		float var5 = this.field4409; // L: 44
		float var6 = this.field4411; // L: 45
		float var7 = this.field4414; // L: 46
		this.field4405 = var4 * var2 - this.field4406 * var3; // L: 47
		this.field4406 = this.field4406 * var2 + var3 * var4; // L: 48
		this.field4409 = var5 * var2 - var3 * this.field4412; // L: 49
		this.field4412 = var3 * var5 + this.field4412 * var2; // L: 50
		this.field4411 = var6 * var2 - this.field4404 * var3; // L: 51
		this.field4404 = var3 * var6 + var2 * this.field4404; // L: 52
		this.field4414 = var2 * var7 - var3 * this.field4415; // L: 53
		this.field4415 = var2 * this.field4415 + var7 * var3; // L: 54
	} // L: 55

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1318784664"
	)
	void method6878(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4410; // L: 60
		float var5 = this.field4407; // L: 61
		float var6 = this.field4413; // L: 62
		float var7 = this.field4408; // L: 63
		this.field4410 = var4 * var2 + this.field4406 * var3; // L: 64
		this.field4406 = this.field4406 * var2 - var4 * var3; // L: 65
		this.field4407 = var5 * var2 + var3 * this.field4412; // L: 66
		this.field4412 = var2 * this.field4412 - var5 * var3; // L: 67
		this.field4413 = var2 * var6 + var3 * this.field4404; // L: 68
		this.field4404 = var2 * this.field4404 - var6 * var3; // L: 69
		this.field4408 = this.field4415 * var3 + var7 * var2; // L: 70
		this.field4415 = this.field4415 * var2 - var3 * var7; // L: 71
	} // L: 72

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1867033025"
	)
	void method6879(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4410; // L: 77
		float var5 = this.field4407; // L: 78
		float var6 = this.field4413; // L: 79
		float var7 = this.field4408; // L: 80
		this.field4410 = var2 * var4 - var3 * this.field4405; // L: 81
		this.field4405 = var4 * var3 + var2 * this.field4405; // L: 82
		this.field4407 = var5 * var2 - this.field4409 * var3; // L: 83
		this.field4409 = var5 * var3 + this.field4409 * var2; // L: 84
		this.field4413 = var2 * var6 - var3 * this.field4411; // L: 85
		this.field4411 = var6 * var3 + this.field4411 * var2; // L: 86
		this.field4408 = var2 * var7 - var3 * this.field4414; // L: 87
		this.field4414 = this.field4414 * var2 + var7 * var3; // L: 88
	} // L: 89

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1766831994"
	)
	void method6887(float var1, float var2, float var3) {
		this.field4408 += var1; // L: 92
		this.field4414 += var2; // L: 93
		this.field4415 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4410 + "," + this.field4407 + "," + this.field4413 + "," + this.field4408 + "\n" + this.field4405 + "," + this.field4409 + "," + this.field4411 + "," + this.field4414 + "\n" + this.field4406 + "," + this.field4412 + "," + this.field4404 + "," + this.field4415; // L: 99
	}
}
