import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class336 {
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 1525311123
	)
	@Export("foundItemIndex")
	static int foundItemIndex;

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "80446087"
	)
	static final void method6228(int var0, int var1, int var2, int var3) {
		Client.field590 = 0;
		int var4 = (class340.localPlayer.x >> 7) + class131.baseX;
		int var5 = (class340.localPlayer.y >> 7) + TileItem.baseY;
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field590 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field590 = 1;
		}

		if (Client.field590 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field590 = 0;
		}

	}
}
