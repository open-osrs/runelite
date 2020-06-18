import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class257 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "[Lih;"
	)
	@Export("WorldMapElement_cached")
	public static WorldMapElement[] WorldMapElement_cached;

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-540216390"
	)
	public static void method4679(int var0, int var1) {
		VarbitDefinition var3 = (VarbitDefinition)VarbitDefinition.VarbitDefinition_cached.get((long)var0);
		VarbitDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var8 = VarbitDefinition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitDefinition();
			if (var8 != null) {
				var3.decode(new Buffer(var8));
			}

			VarbitDefinition.VarbitDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		int var4 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}

		var7 <<= var5;
		Varps.Varps_main[var4] = Varps.Varps_main[var4] & ~var7 | var1 << var5 & var7;
	}
}
