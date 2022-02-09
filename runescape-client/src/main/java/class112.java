import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class112 {
	@ObfuscatedName("e")
	public static final float field1386;
	@ObfuscatedName("r")
	public static final float field1390;

	static {
		field1386 = Math.ulp(1.0F); // L: 10
		field1390 = 2.0F * field1386; // L: 11
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lkq;I)V",
		garbageValue = "-1607854153"
	)
	public static void method2558(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0; // L: 18
		VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 19
	} // L: 20

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ljz;B)V",
		garbageValue = "47"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field712) { // L: 11438
			Client.field713[var0.rootIndex] = true; // L: 11439
		}

	} // L: 11441
}
