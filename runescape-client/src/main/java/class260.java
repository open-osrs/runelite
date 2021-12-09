import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class260 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1837592887
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1576356909
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1257628969
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "[Lpl;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	static {
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public static String method5070(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class372.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4); // L: 25
			}
		}

		return var2.toString(); // L: 28
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-68634034"
	)
	static final int method5069(int var0, int var1, int var2) {
		int var3 = var0 / var2; // L: 462
		int var4 = var0 & var2 - 1; // L: 463
		int var5 = var1 / var2; // L: 464
		int var6 = var1 & var2 - 1; // L: 465
		int var7 = class139.method2932(var3, var5); // L: 466
		int var8 = class139.method2932(var3 + 1, var5); // L: 467
		int var9 = class139.method2932(var3, var5 + 1); // L: 468
		int var10 = class139.method2932(var3 + 1, var5 + 1); // L: 469
		int var11 = class131.method2802(var7, var8, var4, var2); // L: 470
		int var12 = class131.method2802(var9, var10, var4, var2); // L: 471
		return class131.method2802(var11, var12, var6, var2); // L: 472
	}
}
