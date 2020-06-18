import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class25 {
	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		signature = "[Lhd;"
	)
	static Widget[] field124;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 2108681749
	)
	static int field122;

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-777100102"
	)
	static void method245(int var0) {
		Client.oculusOrbState = var0;
	}
}
