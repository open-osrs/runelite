import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("qt")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("to")
	@ObfuscatedGetter(
		intValue = 847821177
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2137823175
	)
	@Export("id")
	int id;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1588847929
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lgl;",
		garbageValue = "1291603774"
	)
	@Export("getModel")
	protected final Model getModel() {
		return KeyHandler.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "-1509"
	)
	static int method2007(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
