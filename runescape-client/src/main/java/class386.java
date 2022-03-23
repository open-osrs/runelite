import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
public final class class386 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lnf;"
	)
	static class386[] field4342;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1794460551
	)
	static int field4337;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -404699295
	)
	static int field4336;
	@ObfuscatedName("g")
	float field4339;
	@ObfuscatedName("l")
	float field4340;
	@ObfuscatedName("n")
	float field4341;
	@ObfuscatedName("d")
	float field4338;

	static {
		field4342 = new class386[0]; // L: 4
		ObjectComposition.method3692(100); // L: 9
		new class386();
	} // L: 14

	class386() {
		this.method7033(); // L: 44
	} // L: 45

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2084662859"
	)
	public void method7043() {
		synchronized(field4342) { // L: 38
			if (field4336 < field4337 - 1) { // L: 39
				field4342[++field4336 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "2036430223"
	)
	void method7031(float var1, float var2, float var3, float var4) {
		this.field4339 = var1; // L: 48
		this.field4340 = var2; // L: 49
		this.field4341 = var3; // L: 50
		this.field4338 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1941052212"
	)
	public void method7032(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 56
		this.field4339 = var5 * var1; // L: 57
		this.field4340 = var5 * var2; // L: 58
		this.field4341 = var3 * var5; // L: 59
		this.field4338 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1368789286"
	)
	final void method7033() {
		this.field4341 = 0.0F; // L: 64
		this.field4340 = 0.0F; // L: 65
		this.field4339 = 0.0F; // L: 66
		this.field4338 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)V",
		garbageValue = "-1233889427"
	)
	public final void method7036(class386 var1) {
		this.method7031(this.field4341 * var1.field4340 + var1.field4338 * this.field4339 + this.field4338 * var1.field4339 - this.field4340 * var1.field4341, this.field4338 * var1.field4340 + (this.field4340 * var1.field4338 - this.field4341 * var1.field4339) + this.field4339 * var1.field4341, var1.field4341 * this.field4338 + (var1.field4338 * this.field4341 + var1.field4339 * this.field4340 - var1.field4340 * this.field4339), var1.field4338 * this.field4338 - var1.field4339 * this.field4339 - var1.field4340 * this.field4340 - this.field4341 * var1.field4341); // L: 71
	} // L: 72

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = this.field4339 + var2 * 31.0F; // L: 87
		var2 = this.field4340 + 31.0F * var2; // L: 88
		var2 = this.field4341 + 31.0F * var2; // L: 89
		var2 = this.field4338 + 31.0F * var2; // L: 90
		return (int)var2; // L: 91
	}

	public String toString() {
		return this.field4339 + "," + this.field4340 + "," + this.field4341 + "," + this.field4338; // L: 96
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class386)) { // L: 76
			return false; // L: 80
		} else {
			class386 var2 = (class386)var1; // L: 77
			return this.field4339 == var2.field4339 && this.field4340 == var2.field4340 && this.field4341 == var2.field4341 && var2.field4338 == this.field4338; // L: 78
		}
	}
}
