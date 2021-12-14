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
		this.field2787 = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-49"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!CollisionMap.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = CollisionMap.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (MouseRecorder.Widget_interfaceComponents[var0] == null) {
					MouseRecorder.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (MouseRecorder.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = CollisionMap.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							MouseRecorder.Widget_interfaceComponents[var0][var2] = new Widget();
							MouseRecorder.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								MouseRecorder.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								MouseRecorder.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}
}
