import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public final class class387 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "[Lnh;"
	)
	public static class387[] field4395;
	@ObfuscatedName("k")
	float field4393;
	@ObfuscatedName("a")
	float field4394;
	@ObfuscatedName("m")
	float field4396;
	@ObfuscatedName("p")
	float field4397;

	static {
		field4395 = new class387[0]; // L: 4
		class10.method87(100); // L: 9
		new class387();
	} // L: 14

	public class387() {
		this.method6782(); // L: 34
	} // L: 35

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	public void method6779() {
		synchronized(field4395) { // L: 28
			if (Frames.field2492 < GrandExchangeOfferAgeComparator.field4072 - 1) { // L: 29
				field4395[++Frames.field2492 - 1] = this;
			}

		}
	} // L: 31

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1983266145"
	)
	void method6797(float var1, float var2, float var3, float var4) {
		this.field4393 = var1; // L: 38
		this.field4394 = var2; // L: 39
		this.field4396 = var3; // L: 40
		this.field4397 = var4; // L: 41
	} // L: 42

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-1"
	)
	public void method6784(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4)); // L: 45
		float var6 = (float)Math.cos((double)(var4 * 0.5F)); // L: 46
		this.field4393 = var1 * var5; // L: 47
		this.field4394 = var2 * var5; // L: 48
		this.field4396 = var5 * var3; // L: 49
		this.field4397 = var6; // L: 50
	} // L: 51

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public final void method6782() {
		this.field4396 = 0.0F; // L: 54
		this.field4394 = 0.0F; // L: 55
		this.field4393 = 0.0F; // L: 56
		this.field4397 = 1.0F; // L: 57
	} // L: 58

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lnh;B)V",
		garbageValue = "94"
	)
	public final void method6783(class387 var1) {
		this.method6797(var1.field4397 * this.field4393 + var1.field4393 * this.field4397 + var1.field4394 * this.field4396 - var1.field4396 * this.field4394, this.field4393 * var1.field4396 + this.field4394 * var1.field4397 - var1.field4393 * this.field4396 + this.field4397 * var1.field4394, this.field4397 * var1.field4396 + (this.field4394 * var1.field4393 + var1.field4397 * this.field4396 - var1.field4394 * this.field4393), this.field4397 * var1.field4397 - var1.field4393 * this.field4393 - var1.field4394 * this.field4394 - var1.field4396 * this.field4396); // L: 61
	} // L: 62

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) { // L: 66
			return false; // L: 70
		} else {
			class387 var2 = (class387)var1; // L: 67
			return var2.field4393 == this.field4393 && var2.field4394 == this.field4394 && this.field4396 == var2.field4396 && this.field4397 == var2.field4397; // L: 68
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 75
		float var2 = 1.0F; // L: 76
		var2 = 31.0F * var2 + this.field4393;
		var2 = 31.0F * var2 + this.field4394;
		var2 = this.field4396 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field4397; // L: 80
		return (int)var2;
	}

	public String toString() {
		return this.field4393 + "," + this.field4394 + "," + this.field4396 + "," + this.field4397; // L: 86
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llp;Llp;III)Lmx;",
		garbageValue = "-1067807239"
	)
	public static Font method6781(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!User.method6514(var0, var2, var3)) { // L: 69
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3); // L: 71
			Font var4;
			if (var5 == null) { // L: 73
				var4 = null; // L: 74
			} else {
				Font var6 = new Font(var5, class453.SpriteBuffer_xOffsets, class453.SpriteBuffer_yOffsets, ScriptFrame.SpriteBuffer_spriteWidths, class453.SpriteBuffer_spriteHeights, Decimator.SpriteBuffer_spritePalette, class127.SpriteBuffer_pixels); // L: 77
				VarcInt.method3325(); // L: 78
				var4 = var6; // L: 79
			}

			return var4; // L: 81
		}
	}
}
