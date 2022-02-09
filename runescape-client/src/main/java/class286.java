import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
public class class286 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1524812193
	)
	@Export("selectedItemId")
	static int selectedItemId;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-5"
	)
	public static boolean method5462(int var0) {
		return var0 >= WorldMapDecorationType.field3424.id && var0 <= WorldMapDecorationType.field3426.id || var0 == WorldMapDecorationType.field3429.id; // L: 43
	}
}
