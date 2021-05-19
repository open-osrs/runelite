import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -765310817
	)
	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "1501213760"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II)I",
		garbageValue = "686379758"
	)
	public static int method2440(CharSequence var0, int var1) {
		return class18.method255(var0, var1, true); // L: 80
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1683819364"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class5.Widget_loadedInterfaces[var0]) { // L: 214
			return true;
		} else if (!GrandExchangeOffer.Widget_archive.tryLoadGroup(var0)) { // L: 215
			return false;
		} else {
			int var1 = GrandExchangeOffer.Widget_archive.getGroupFileCount(var0); // L: 216
			if (var1 == 0) { // L: 217
				class5.Widget_loadedInterfaces[var0] = true; // L: 218
				return true; // L: 219
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 221
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 222
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 223
						byte[] var3 = GrandExchangeOffer.Widget_archive.takeFile(var0, var2); // L: 224
						if (var3 != null) { // L: 225
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 226
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 227
							if (var3[0] == -1) { // L: 228
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 229
							}
						}
					}
				}

				class5.Widget_loadedInterfaces[var0] = true; // L: 233
				return true; // L: 234
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1727381075"
	)
	public static void method2447() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 123
	} // L: 124
}
