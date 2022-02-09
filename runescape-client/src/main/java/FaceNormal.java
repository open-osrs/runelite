import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1096643173
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 142997221
	)
	@Export("y")
	int y;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1816531673
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-430184319"
	)
	static final int method4095() {
		return ViewportMouse.ViewportMouse_x; // L: 99
	}
}
