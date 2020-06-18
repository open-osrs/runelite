import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class277 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "([I[II)V",
		garbageValue = "805948782"
	)
	public static void method5157(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			ParamDefinition.ByteArrayPool_alternativeSizes = var0;
			VarbitDefinition.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			Fonts.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < ParamDefinition.ByteArrayPool_alternativeSizes.length; ++var2) {
				Fonts.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
			}

		} else {
			ParamDefinition.ByteArrayPool_alternativeSizes = null;
			VarbitDefinition.ByteArrayPool_altSizeArrayCounts = null;
			Fonts.ByteArrayPool_arrays = null;
		}
	}
}
