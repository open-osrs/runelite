import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public final class class386 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lni;"
	)
	public static class386[] field4389;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1938256603
	)
	static int field4386;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 585469667
	)
	public static int field4385;
	@ObfuscatedName("f")
	float field4388;
	@ObfuscatedName("j")
	float field4387;
	@ObfuscatedName("e")
	float field4390;
	@ObfuscatedName("g")
	float field4391;

	static {
		field4389 = new class386[0]; // L: 4
		field4386 = 100; // L: 10
		field4389 = new class386[100]; // L: 11
		field4385 = 0; // L: 12
		new class386();
	} // L: 18

	public class386() {
		this.method6951(); // L: 32
	} // L: 33

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1892686311"
	)
	public void method6936() {
		synchronized(field4389) { // L: 26
			if (field4385 < field4386 - 1) { // L: 27
				field4389[++field4385 - 1] = this;
			}

		}
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "365980617"
	)
	void method6942(float var1, float var2, float var3, float var4) {
		this.field4388 = var1; // L: 36
		this.field4387 = var2; // L: 37
		this.field4390 = var3; // L: 38
		this.field4391 = var4; // L: 39
	} // L: 40

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1728138085"
	)
	public void method6945(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 43
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 44
		this.field4388 = var5 * var1; // L: 45
		this.field4387 = var2 * var5; // L: 46
		this.field4390 = var3 * var5; // L: 47
		this.field4391 = var6; // L: 48
	} // L: 49

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "112"
	)
	public final void method6951() {
		this.field4390 = 0.0F; // L: 52
		this.field4387 = 0.0F; // L: 53
		this.field4388 = 0.0F; // L: 54
		this.field4391 = 1.0F; // L: 55
	} // L: 56

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "-1489073832"
	)
	public final void method6938(class386 var1) {
		this.method6942(var1.field4388 * this.field4391 + this.field4388 * var1.field4391 + this.field4390 * var1.field4387 - var1.field4390 * this.field4387, this.field4388 * var1.field4390 + var1.field4391 * this.field4387 - this.field4390 * var1.field4388 + var1.field4387 * this.field4391, this.field4391 * var1.field4390 + (this.field4387 * var1.field4388 + var1.field4391 * this.field4390 - var1.field4387 * this.field4388), var1.field4391 * this.field4391 - this.field4388 * var1.field4388 - this.field4387 * var1.field4387 - this.field4390 * var1.field4390); // L: 59
	} // L: 60

	public int hashCode() {
		boolean var1 = true; // L: 73
		float var2 = 1.0F; // L: 74
		var2 = this.field4388 + var2 * 31.0F; // L: 75
		var2 = 31.0F * var2 + this.field4387; // L: 76
		var2 = this.field4390 + var2 * 31.0F; // L: 77
		var2 = 31.0F * var2 + this.field4391; // L: 78
		return (int)var2; // L: 79
	}

	public String toString() {
		return this.field4388 + "," + this.field4387 + "," + this.field4390 + "," + this.field4391; // L: 84
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class386)) { // L: 64
			return false; // L: 68
		} else {
			class386 var2 = (class386)var1; // L: 65
			return var2.field4388 == this.field4388 && this.field4387 == var2.field4387 && var2.field4390 == this.field4390 && var2.field4391 == this.field4391; // L: 66
		}
	}
}
