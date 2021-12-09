import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public abstract class class242 implements class244 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 991744633
	)
	protected int field2787;

	@ObfuscatedSignature(
		descriptor = "(Lko;Llf;I)V"
	)
	protected class242(StudioGame var1, Language var2, int var3) {
		this.field2787 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-49"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) { // L: 216
			return true;
		} else if (!CollisionMap.Widget_archive.tryLoadGroup(var0)) { // L: 217
			return false;
		} else {
			int var1 = CollisionMap.Widget_archive.getGroupFileCount(var0); // L: 218
			if (var1 == 0) { // L: 219
				Widget.Widget_loadedInterfaces[var0] = true; // L: 220
				return true; // L: 221
			} else {
				if (MouseRecorder.Widget_interfaceComponents[var0] == null) { // L: 223
					MouseRecorder.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 224
					if (MouseRecorder.Widget_interfaceComponents[var0][var2] == null) { // L: 225
						byte[] var3 = CollisionMap.Widget_archive.takeFile(var0, var2); // L: 226
						if (var3 != null) { // L: 227
							MouseRecorder.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 228
							MouseRecorder.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 229
							if (var3[0] == -1) { // L: 230
								MouseRecorder.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								MouseRecorder.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 231
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true; // L: 235
				return true; // L: 236
			}
		}
	}
}
