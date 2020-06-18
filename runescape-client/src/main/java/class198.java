import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
public class class198 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "-100"
	)
	public static boolean method3774(int var0) {
		return (var0 >> 31 & 1) != 0;
	}
}
