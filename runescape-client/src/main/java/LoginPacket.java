import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("LoginPacket")
public class LoginPacket implements class238 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	public static final LoginPacket field2901;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final LoginPacket field2897;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	public static final LoginPacket field2896;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	public static final LoginPacket field2894;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	public static final LoginPacket field2900;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final LoginPacket field2899;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Lim;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -152367843
	)
	@Export("id")
	public final int id;

	static {
		field2901 = new LoginPacket(14, 0); // L: 5
		field2897 = new LoginPacket(15, 4); // L: 6
		field2896 = new LoginPacket(16, -2); // L: 7
		field2894 = new LoginPacket(18, -2); // L: 8
		field2900 = new LoginPacket(19, -2); // L: 9
		field2899 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class240.method4711(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIB)V",
		garbageValue = "8"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10279
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10280
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10281
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10282
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10283
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10284
		}

		if (var0.yAlignment == 0) { // L: 10285
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10286
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10287
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10288
		} else if (var0.yAlignment == 4) { // L: 10289
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10290
		}

	} // L: 10291
}
