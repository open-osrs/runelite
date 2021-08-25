import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -401677395
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1245481
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1613056851
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "13608"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1523765132"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
