import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2045687167
	)
	@Export("x")
	int x;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 259443193
	)
	@Export("y")
	int y;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1323517785
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1766790995"
	)
	public static int method4344(CharSequence var0) {
		return HealthBar.method2356(var0, 10, true); // L: 77
	}
}
