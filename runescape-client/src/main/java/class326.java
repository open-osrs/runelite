import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
public class class326 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-764707553"
	)
	public static boolean method5928(int var0) {
		return var0 >= WorldMapDecorationType.field3232.id && var0 <= WorldMapDecorationType.field3246.id;
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "692474677"
	)
	static void method5929() {
		if (Client.renderSelf) {
			class21.addPlayerToScene(class67.localPlayer, false);
		}

	}
}
