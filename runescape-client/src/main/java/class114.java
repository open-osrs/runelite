import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
public class class114 {
	@ObfuscatedName("g")
	public static final float field1396;
	@ObfuscatedName("l")
	public static final float field1394;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;

	static {
		field1396 = Math.ulp(1.0F); // L: 10
		field1394 = 2.0F * field1396; // L: 11
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lgk;",
		garbageValue = "725728757"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
