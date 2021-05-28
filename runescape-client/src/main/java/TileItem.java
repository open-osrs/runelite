import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -467972035
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 223075527
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgr;",
		garbageValue = "-76"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class260.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1655147086"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null; // L: 95

		try {
			var0 = class82.getPreferencesFile("", SoundSystem.field461.name, true); // L: 97
			Buffer var1 = ObjectComposition.clientPreferences.toBuffer(); // L: 98
			var0.write(var1.array, 0, var1.offset); // L: 99
		} catch (Exception var3) { // L: 101
		}

		try {
			if (var0 != null) { // L: 103
				var0.closeSync(true); // L: 104
			}
		} catch (Exception var2) { // L: 107
		}

	} // L: 108
}
