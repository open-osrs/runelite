import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public final class class365 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lns;"
	)
	static class365[] field4189;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1235127287
	)
	static int field4184;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -68098279
	)
	static int field4185;
	@ObfuscatedName("m")
	float field4186;
	@ObfuscatedName("t")
	float field4188;
	@ObfuscatedName("s")
	float field4187;
	@ObfuscatedName("j")
	float field4183;

	static {
		field4189 = new class365[0];
		field4184 = 100;
		field4189 = new class365[100];
		field4185 = 0;
		new class365();
	}

	class365() {
		this.method6627();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-330094120"
	)
	public void method6646() {
		synchronized(field4189) {
			if (field4185 < field4184 - 1) {
				field4189[++field4185 - 1] = this;
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "545169306"
	)
	void method6625(float var1, float var2, float var3, float var4) {
		this.field4186 = var1;
		this.field4188 = var2;
		this.field4187 = var3;
		this.field4183 = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "917970306"
	)
	public void method6630(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4186 = var5 * var1;
		this.field4188 = var5 * var2;
		this.field4187 = var5 * var3;
		this.field4183 = var6;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	final void method6627() {
		this.field4187 = 0.0F;
		this.field4188 = 0.0F;
		this.field4186 = 0.0F;
		this.field4183 = 1.0F;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lns;B)V",
		garbageValue = "-13"
	)
	public final void method6628(class365 var1) {
		this.method6625(var1.field4183 * this.field4186 + var1.field4186 * this.field4183 + this.field4187 * var1.field4188 - this.field4188 * var1.field4187, var1.field4187 * this.field4186 + var1.field4188 * this.field4183 + (var1.field4183 * this.field4188 - var1.field4186 * this.field4187), this.field4188 * var1.field4186 + this.field4187 * var1.field4183 - this.field4186 * var1.field4188 + this.field4183 * var1.field4187, this.field4183 * var1.field4183 - var1.field4186 * this.field4186 - this.field4188 * var1.field4188 - var1.field4187 * this.field4187);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class365)) {
			return false;
		} else {
			class365 var2 = (class365)var1;
			return this.field4186 == var2.field4186 && var2.field4188 == this.field4188 && var2.field4187 == this.field4187 && var2.field4183 == this.field4183;
		}
	}

	public String toString() {
		return this.field4186 + "," + this.field4188 + "," + this.field4187 + "," + this.field4183;
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field4186;
		var2 = var2 * 31.0F + this.field4188;
		var2 = 31.0F * var2 + this.field4187;
		var2 = var2 * 31.0F + this.field4183;
		return (int)var2;
	}
}
