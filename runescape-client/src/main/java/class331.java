import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class331 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;Lku;B)V",
		garbageValue = "0"
	)
	public static void method6174(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		HitSplatDefinition.HitSplatDefinition_archive = var0; // L: 46
		HitSplatDefinition.field1939 = var1; // L: 47
		HitSplatDefinition.HitSplatDefinition_fontsArchive = var2; // L: 48
	} // L: 49
}
