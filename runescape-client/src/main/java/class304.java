import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class304 {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lib;III)Z",
		garbageValue = "975575420"
	)
	public static boolean method5363(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 201
		if (var3 == null) {
			return false; // L: 202
		} else {
			class232.SpriteBuffer_decode(var3); // L: 203
			return true; // L: 204
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-969839782"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class41.loadInterface(var0)) { // L: 10580
			Widget[] var1 = class9.Widget_interfaceComponents[var0]; // L: 10581

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 10582
				Widget var3 = var1[var2]; // L: 10583
				if (var3 != null) { // L: 10584
					var3.modelFrame = 0; // L: 10585
					var3.modelFrameCycle = 0; // L: 10586
				}
			}

		}
	} // L: 10588
}
