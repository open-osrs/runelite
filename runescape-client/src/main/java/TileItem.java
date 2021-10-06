import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1760777195
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2008394151
	)
	@Export("quantity")
	int quantity;

	TileItem() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lhl;",
		garbageValue = "126"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class87.ItemDefinition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(CLkn;I)C",
		garbageValue = "1899420979"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else {
			return var0 == 376 ? 'Y' : var0;
		}
	}
}
