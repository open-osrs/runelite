import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public enum class34 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	field256(0, 0);

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	static class339 field254;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -537510065
	)
	final int field252;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1586527889
	)
	final int field253;

	class34(int var3, int var4) {
		this.field252 = var3; // L: 12
		this.field253 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field253; // L: 17
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-67481948"
	)
	static void method327() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.field1120 = new byte[4][104][104]; // L: 49
		class253.field3130 = new byte[4][104][104]; // L: 50
		class20.field182 = new byte[4][104][104]; // L: 51
		DirectByteArrayCopier.field3128 = new byte[4][104][104]; // L: 52
		UrlRequester.field1419 = new int[4][105][105]; // L: 53
		class372.field4123 = new byte[4][105][105]; // L: 54
		class229.field2813 = new int[105][105]; // L: 55
		ChatChannel.Tiles_hue = new int[104]; // L: 56
		class23.Tiles_saturation = new int[104]; // L: 57
		Tiles.Tiles_lightness = new int[104]; // L: 58
		ParamComposition.Tiles_hueMultiplier = new int[104]; // L: 59
		DefaultsGroup.field3894 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method328() {
		Tiles.field1120 = null; // L: 64
		class253.field3130 = null; // L: 65
		class20.field182 = null; // L: 66
		DirectByteArrayCopier.field3128 = null; // L: 67
		UrlRequester.field1419 = null; // L: 68
		class372.field4123 = null; // L: 69
		class229.field2813 = null; // L: 70
		ChatChannel.Tiles_hue = null; // L: 71
		class23.Tiles_saturation = null; // L: 72
		Tiles.Tiles_lightness = null; // L: 73
		ParamComposition.Tiles_hueMultiplier = null; // L: 74
		DefaultsGroup.field3894 = null; // L: 75
	} // L: 76
}
