import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class162 {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("f")
	public String field1758;
	@ObfuscatedName("b")
	public float[] field1754;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1781750243
	)
	public int field1755;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -608154281
	)
	public int field1756;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -454180149
	)
	public int field1752;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	final class155 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lev;)V"
	)
	class162(class155 var1) {
		this.this$0 = var1;
		this.field1754 = new float[4]; // L: 336
		this.field1755 = 1; // L: 337
		this.field1756 = 1; // L: 338
		this.field1752 = 0; // L: 339
	} // L: 341

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "17"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 955
			var1 /= 2;
		}

		if (var2 > 192) { // L: 956
			var1 /= 2;
		}

		if (var2 > 217) { // L: 957
			var1 /= 2;
		}

		if (var2 > 243) { // L: 958
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 959
		return var3; // L: 960
	}
}
