import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public enum class246 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	field3215(-1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	field3214(0),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	field3216(1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	field3217(2);

	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1212234029
	)
	final int field3218;

	class246(int var3) {
		this.field3218 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3218; // L: 19
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-34"
	)
	public static void method4409(boolean var0) {
		if (class303.NetCache_socket != null) { // L: 193
			try {
				Buffer var1 = new Buffer(4); // L: 195
				var1.writeByte(var0 ? 2 : 3); // L: 196
				var1.writeMedium(0); // L: 197
				class303.NetCache_socket.write(var1.array, 0, 4); // L: 198
			} catch (IOException var4) {
				try {
					class303.NetCache_socket.close(); // L: 202
				} catch (Exception var3) { // L: 204
				}

				++NetCache.NetCache_ioExceptions; // L: 205
				class303.NetCache_socket = null; // L: 206
			}

		}
	} // L: 208
}
