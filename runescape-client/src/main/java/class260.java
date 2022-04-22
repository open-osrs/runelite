import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
public class class260 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static Bounds field2892;

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lln;II)V",
		garbageValue = "-921893463"
	)
	static void method5174(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 288
			Decimator.logoSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 289
		} else if ((var1 & 1073741824) != 0) { // L: 291
			Decimator.logoSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 292
		} else {
			Decimator.logoSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 295
		}

	} // L: 297

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1779965800"
	)
	static final void method5173() {
		Client.field618 = 0; // L: 5389
		int var0 = (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX; // L: 5390
		int var1 = (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY; // L: 5391
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) { // L: 5392
			Client.field618 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) { // L: 5393
			Client.field618 = 1;
		}

		if (Client.field618 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) { // L: 5394
			Client.field618 = 0;
		}

	} // L: 5395
}
