import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public final class class236 {
	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive7")
	static Archive archive7;

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lid;II)V",
		garbageValue = "-237601579"
	)
	static void method4263(Archive var0, int var1) {
		if (class90.NetCache_reference != null) { // L: 211
			class90.NetCache_reference.offset = var1 * 8 + 5; // L: 212
			int var2 = class90.NetCache_reference.readInt(); // L: 213
			int var3 = class90.NetCache_reference.readInt(); // L: 214
			var0.loadIndex(var2, var3); // L: 215
		} else {
			VarcInt.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 218
			NetCache.NetCache_archives[var1] = var0; // L: 219
		}
	} // L: 216 220

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1381808682"
	)
	public static int method4264() {
		return KeyHandler.KeyHandler_idleCycles; // L: 193
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "(Lcs;B)V",
		garbageValue = "-118"
	)
	static final void method4265(Actor var0) {
		int var1 = Math.max(1, var0.field1009 - Client.cycle); // L: 4094
		int var2 = var0.field1011 * 64 + var0.field1017 * 128; // L: 4095
		int var3 = var0.field1011 * 64 + var0.field1019 * 128; // L: 4096
		var0.x += (var2 - var0.x) / var1; // L: 4097
		var0.y += (var3 - var0.y) / var1; // L: 4098
		var0.field978 = 0; // L: 4099
		var0.orientation = var0.field1023; // L: 4100
	} // L: 4101
}
