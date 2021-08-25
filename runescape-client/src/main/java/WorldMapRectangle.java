import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1930442357
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1925132623
	)
	@Export("width")
	int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1411511191
	)
	@Export("height")
	int height;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1007463057
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1649439453
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgd;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}
}
