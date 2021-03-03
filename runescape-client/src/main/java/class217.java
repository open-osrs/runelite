import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class217 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 338729147
	)
	@Export("clientType")
	public static int clientType;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lig;B)V",
		garbageValue = "0"
	)
	public static void method4154(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2092030193"
	)
	@Export("parseInt")
	public static int parseInt(CharSequence var0) {
		return LoginScreenAnimation.parseIntCustomRadix(var0, 10, true); // L: 76
	}

	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "(Liy;Ljava/lang/String;I)V",
		garbageValue = "2062536839"
	)
	static void method4155(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1); // L: 1383
		Client.archiveLoaders.add(var2); // L: 1384
		Client.field934 += var2.groupCount; // L: 1385
	} // L: 1386
}
