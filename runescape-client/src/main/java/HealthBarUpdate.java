import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -400345829
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1402646487
	)
	@Export("health")
	int health;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1279526783
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 313548895
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2; // L: 13
		this.health2 = var3; // L: 14
		this.cycleOffset = var4; // L: 15
	} // L: 16

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2078509011"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 19
		this.health = var2; // L: 20
		this.health2 = var3; // L: 21
		this.cycleOffset = var4; // L: 22
	} // L: 23

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "1840987704"
	)
	public static void method2183(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 28
	} // L: 29

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "44"
	)
	static int method2185(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 150
		return class131.NetCache_currentResponse != null && var2 == class131.NetCache_currentResponse.key ? class138.NetCache_responseArchiveBuffer.offset * 99 / (class138.NetCache_responseArchiveBuffer.array.length - class131.NetCache_currentResponse.padding) + 1 : 0; // L: 151 152
	}
}
