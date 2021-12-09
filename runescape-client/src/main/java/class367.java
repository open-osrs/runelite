import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public class class367 {
	@ObfuscatedName("c")
	float field4197;
	@ObfuscatedName("b")
	float field4198;
	@ObfuscatedName("p")
	float field4199;
	@ObfuscatedName("m")
	float field4200;
	@ObfuscatedName("t")
	float field4201;
	@ObfuscatedName("s")
	float field4202;
	@ObfuscatedName("j")
	float field4204;
	@ObfuscatedName("w")
	float field4203;
	@ObfuscatedName("n")
	float field4205;
	@ObfuscatedName("r")
	float field4206;
	@ObfuscatedName("o")
	float field4207;
	@ObfuscatedName("v")
	float field4208;

	static {
		new class367();
	} // L: 6

	class367() {
		this.method6739(); // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-597263666"
	)
	void method6739() {
		this.field4208 = 0.0F; // L: 26
		this.field4207 = 0.0F; // L: 27
		this.field4206 = 0.0F; // L: 28
		this.field4203 = 0.0F; // L: 29
		this.field4204 = 0.0F; // L: 30
		this.field4202 = 0.0F; // L: 31
		this.field4200 = 0.0F; // L: 32
		this.field4199 = 0.0F; // L: 33
		this.field4198 = 0.0F; // L: 34
		this.field4205 = 1.0F; // L: 35
		this.field4201 = 1.0F; // L: 36
		this.field4197 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-550408615"
	)
	void method6732(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4198; // L: 43
		float var5 = this.field4201; // L: 44
		float var6 = this.field4203; // L: 45
		float var7 = this.field4207; // L: 46
		this.field4198 = var4 * var2 - var3 * this.field4199; // L: 47
		this.field4199 = var4 * var3 + this.field4199 * var2; // L: 48
		this.field4201 = var2 * var5 - this.field4202 * var3; // L: 49
		this.field4202 = var5 * var3 + var2 * this.field4202; // L: 50
		this.field4203 = var2 * var6 - var3 * this.field4205; // L: 51
		this.field4205 = var2 * this.field4205 + var3 * var6; // L: 52
		this.field4207 = var7 * var2 - var3 * this.field4208; // L: 53
		this.field4208 = this.field4208 * var2 + var3 * var7; // L: 54
	} // L: 55

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-452797463"
	)
	void method6717(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4197; // L: 60
		float var5 = this.field4200; // L: 61
		float var6 = this.field4204; // L: 62
		float var7 = this.field4206; // L: 63
		this.field4197 = var3 * this.field4199 + var4 * var2; // L: 64
		this.field4199 = this.field4199 * var2 - var4 * var3; // L: 65
		this.field4200 = this.field4202 * var3 + var2 * var5; // L: 66
		this.field4202 = this.field4202 * var2 - var5 * var3; // L: 67
		this.field4204 = var2 * var6 + var3 * this.field4205; // L: 68
		this.field4205 = var2 * this.field4205 - var3 * var6; // L: 69
		this.field4206 = this.field4208 * var3 + var7 * var2; // L: 70
		this.field4208 = var2 * this.field4208 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1842275724"
	)
	void method6718(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4197; // L: 77
		float var5 = this.field4200; // L: 78
		float var6 = this.field4204; // L: 79
		float var7 = this.field4206; // L: 80
		this.field4197 = var2 * var4 - var3 * this.field4198; // L: 81
		this.field4198 = var3 * var4 + var2 * this.field4198; // L: 82
		this.field4200 = var5 * var2 - this.field4201 * var3; // L: 83
		this.field4201 = var2 * this.field4201 + var3 * var5; // L: 84
		this.field4204 = var6 * var2 - this.field4203 * var3; // L: 85
		this.field4203 = var3 * var6 + var2 * this.field4203; // L: 86
		this.field4206 = var7 * var2 - var3 * this.field4207; // L: 87
		this.field4207 = this.field4207 * var2 + var3 * var7; // L: 88
	} // L: 89

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "12"
	)
	void method6719(float var1, float var2, float var3) {
		this.field4206 += var1; // L: 92
		this.field4207 += var2; // L: 93
		this.field4208 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4197 + "," + this.field4200 + "," + this.field4204 + "," + this.field4206 + "\n" + this.field4198 + "," + this.field4201 + "," + this.field4203 + "," + this.field4207 + "\n" + this.field4199 + "," + this.field4202 + "," + this.field4205 + "," + this.field4208; // L: 99
	}
}
