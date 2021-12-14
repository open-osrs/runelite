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
	}

	class367() {
		this.method6739();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-597263666"
	)
	void method6739() {
		this.field4208 = 0.0F;
		this.field4207 = 0.0F;
		this.field4206 = 0.0F;
		this.field4203 = 0.0F;
		this.field4204 = 0.0F;
		this.field4202 = 0.0F;
		this.field4200 = 0.0F;
		this.field4199 = 0.0F;
		this.field4198 = 0.0F;
		this.field4205 = 1.0F;
		this.field4201 = 1.0F;
		this.field4197 = 1.0F;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-550408615"
	)
	void method6732(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4198;
		float var5 = this.field4201;
		float var6 = this.field4203;
		float var7 = this.field4207;
		this.field4198 = var4 * var2 - var3 * this.field4199;
		this.field4199 = var4 * var3 + this.field4199 * var2;
		this.field4201 = var2 * var5 - this.field4202 * var3;
		this.field4202 = var5 * var3 + var2 * this.field4202;
		this.field4203 = var2 * var6 - var3 * this.field4205;
		this.field4205 = var2 * this.field4205 + var3 * var6;
		this.field4207 = var7 * var2 - var3 * this.field4208;
		this.field4208 = this.field4208 * var2 + var3 * var7;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-452797463"
	)
	void method6717(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4197;
		float var5 = this.field4200;
		float var6 = this.field4204;
		float var7 = this.field4206;
		this.field4197 = var3 * this.field4199 + var4 * var2;
		this.field4199 = this.field4199 * var2 - var4 * var3;
		this.field4200 = this.field4202 * var3 + var2 * var5;
		this.field4202 = this.field4202 * var2 - var5 * var3;
		this.field4204 = var2 * var6 + var3 * this.field4205;
		this.field4205 = var2 * this.field4205 - var3 * var6;
		this.field4206 = this.field4208 * var3 + var7 * var2;
		this.field4208 = var2 * this.field4208 - var7 * var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1842275724"
	)
	void method6718(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4197;
		float var5 = this.field4200;
		float var6 = this.field4204;
		float var7 = this.field4206;
		this.field4197 = var2 * var4 - var3 * this.field4198;
		this.field4198 = var3 * var4 + var2 * this.field4198;
		this.field4200 = var5 * var2 - this.field4201 * var3;
		this.field4201 = var2 * this.field4201 + var3 * var5;
		this.field4204 = var6 * var2 - this.field4203 * var3;
		this.field4203 = var3 * var6 + var2 * this.field4203;
		this.field4206 = var7 * var2 - var3 * this.field4207;
		this.field4207 = this.field4207 * var2 + var3 * var7;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "12"
	)
	void method6719(float var1, float var2, float var3) {
		this.field4206 += var1;
		this.field4207 += var2;
		this.field4208 += var3;
	}

	public String toString() {
		return this.field4197 + "," + this.field4200 + "," + this.field4204 + "," + this.field4206 + "\n" + this.field4198 + "," + this.field4201 + "," + this.field4203 + "," + this.field4207 + "\n" + this.field4199 + "," + this.field4202 + "," + this.field4205 + "," + this.field4208;
	}
}
