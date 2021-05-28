import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("tg")
	@Export("foundItemIds")
	static short[] foundItemIds;

	Clock() {
	} // L: 4

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1887937791"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1841090229"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-56"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 205
			return true;
		} else if (!HealthBarUpdate.Widget_archive.tryLoadGroup(var0)) { // L: 206
			return false;
		} else {
			int var1 = HealthBarUpdate.Widget_archive.getGroupFileCount(var0); // L: 207
			if (var1 == 0) { // L: 208
				Widget.Widget_loadedInterfaces[var0] = true; // L: 209
				return true; // L: 210
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) { // L: 212
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 213
					if (Widget.Widget_interfaceComponents[var0][var2] == null) { // L: 214
						byte[] var3 = HealthBarUpdate.Widget_archive.takeFile(var0, var2); // L: 215
						if (var3 != null) { // L: 216
							Widget.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 217
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 218
							if (var3[0] == -1) { // L: 219
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 220
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 224
				return true; // L: 225
			}
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIZI)V",
		garbageValue = "-1829145394"
	)
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width; // L: 9786
		int var5 = var0.height; // L: 9787
		if (var0.widthAlignment == 0) { // L: 9788
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) { // L: 9789
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) { // L: 9790
			var0.width = var0.rawWidth * var1 >> 14;
		}

		if (var0.heightAlignment == 0) { // L: 9791
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) { // L: 9792
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) { // L: 9793
			var0.height = var2 * var0.rawHeight >> 14;
		}

		if (var0.widthAlignment == 4) { // L: 9794
			var0.width = var0.field3060 * var0.height / var0.field2976;
		}

		if (var0.heightAlignment == 4) { // L: 9795
			var0.height = var0.width * var0.field2976 / var0.field3060;
		}

		if (var0.contentType == 1337) { // L: 9796
			Client.viewportWidget = var0;
		}

		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) { // L: 9797
			ScriptEvent var6 = new ScriptEvent(); // L: 9798
			var6.widget = var0; // L: 9799
			var6.args = var0.onResize; // L: 9800
			Client.scriptEvents.addFirst(var6); // L: 9801
		}

	} // L: 9803
}
