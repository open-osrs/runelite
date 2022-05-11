import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class273 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1844825549
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILki;IIIII[FB)Lki;",
		garbageValue = "-124"
	)
	static Widget method5077(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget(); // L: 900
		var8.type = var0; // L: 901
		var8.parentId = var1.id; // L: 902
		var8.childIndex = var2; // L: 903
		var8.isIf3 = true; // L: 904
		var8.xAlignment = var3; // L: 905
		var8.yAlignment = var4; // L: 906
		var8.widthAlignment = var5; // L: 907
		var8.heightAlignment = var6; // L: 908
		var8.rawX = (int)(var7[0] * (float)var1.width); // L: 909
		var8.rawY = (int)(var7[1] * (float)var1.height); // L: 910
		var8.rawWidth = (int)((float)var1.width * var7[2]); // L: 911
		var8.rawHeight = (int)(var7[3] * (float)var1.height); // L: 912
		return var8; // L: 913
	}
}
