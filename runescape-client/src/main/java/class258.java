import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class258 {
	@ObfuscatedName("c")
	static int[] field3049;

	static {
		new Object();
		field3049 = new int[33]; // L: 8
		field3049[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3049[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;I)V",
		garbageValue = "-156509951"
	)
	public static void method5047(AbstractArchive var0, AbstractArchive var1) {
		NPCComposition.NpcDefinition_archive = var0; // L: 57
		NPCComposition.NpcDefinition_modelArchive = var1; // L: 58
	} // L: 59
}
