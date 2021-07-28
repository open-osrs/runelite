import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enumerated {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	field1612(2, 0),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	field1608(1, 2);

	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 408090273
	)
	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("bt")
	@Export("otp")
	static String otp;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		longValue = 2624473618268498173L
	)
	static long field1609;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1196948591
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -491897209
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1806959663"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1899123482"
	)
	public static boolean method2816(int var0) {
		return (var0 >> 28 & 1) != 0;
	}
}
