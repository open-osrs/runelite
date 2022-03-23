import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class273 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1842086067
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1619549501
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 317324399
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("musicTrack")
	static MusicTrack musicTrack;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("soundCache")
	static SoundCache soundCache;

	static {
		musicPlayerStatus = 0; // L: 11
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "2006366579"
	)
	public static String method5271(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) { // L: 12
			return "";
		} else if (var2 == 1) { // L: 13
			CharSequence var10 = var0[var1]; // L: 14
			return var10 == null ? "null" : var10.toString(); // L: 15 16
		} else {
			int var3 = var2 + var1; // L: 18
			int var4 = 0; // L: 19

			for (int var5 = var1; var5 < var3; ++var5) { // L: 20
				CharSequence var9 = var0[var5]; // L: 21
				if (var9 == null) { // L: 22
					var4 += 4;
				} else {
					var4 += var9.length(); // L: 23
				}
			}

			StringBuilder var8 = new StringBuilder(var4); // L: 25

			for (int var6 = var1; var6 < var3; ++var6) { // L: 26
				CharSequence var7 = var0[var6]; // L: 27
				if (var7 == null) { // L: 28
					var8.append("null");
				} else {
					var8.append(var7); // L: 29
				}
			}

			return var8.toString(); // L: 31
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1687746978"
	)
	static boolean method5267(int var0) {
		for (int var1 = 0; var1 < Client.field713; ++var1) { // L: 11107
			if (Client.field568[var1] == var0) { // L: 11108
				return true;
			}
		}

		return false; // L: 11110
	}
}
