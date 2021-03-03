import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2348;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2354;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2347;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2356;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2350;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2351;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2352;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2353;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2346;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public static final class194 field2355;

	static {
		field2348 = new class194(3); // L: 5
		field2354 = new class194(4); // L: 6
		field2347 = new class194(6); // L: 7
		field2356 = new class194(5); // L: 8
		field2350 = new class194(14); // L: 9
		field2351 = new class194(7); // L: 10
		field2352 = new class194(15); // L: 11
		field2353 = new class194(4); // L: 12
		field2346 = new class194(5); // L: 13
		field2355 = new class194(2); // L: 14
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3"
	)
	class194(int var1) {
	} // L: 20

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-921891961"
	)
	static final void method3820(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11092
		if (var0 != WorldMapSectionType.clientPreferences.musicVolume) { // L: 11093
			if (WorldMapSectionType.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11094
				ReflectionCheck.method2450(UrlRequester.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11095
				Client.field899 = false; // L: 11096
			} else if (var0 == 0) { // L: 11098
				ScriptEvent.method1272(); // L: 11099
				Client.field899 = false; // L: 11100
			} else if (class206.musicPlayerStatus != 0) { // L: 11103
				DevicePcmPlayerProvider.musicTrackVolume = var0;
			} else {
				VertexNormal.midiPcmStream.setPcmStreamVolume(var0); // L: 11104
			}

			WorldMapSectionType.clientPreferences.musicVolume = var0; // L: 11106
			class23.savePreferences(); // L: 11107
		}

	} // L: 11109
}
