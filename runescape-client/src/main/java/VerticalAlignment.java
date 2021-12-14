import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1870(2, 0),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1869(0, 2);

	@ObfuscatedName("h")
	static int[] field1874;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1994152567
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -927577259
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfr;",
		garbageValue = "65"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	public static void method3338() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}
