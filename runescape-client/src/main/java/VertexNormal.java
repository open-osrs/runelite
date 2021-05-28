import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("gg")
	@ObfuscatedGetter(
		intValue = 697161691
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -573742035
	)
	@Export("x")
	int x;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -501649501
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 256687101
	)
	@Export("z")
	int z;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1984775097
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lgc;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude;
	} // L: 16

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Lon;",
		garbageValue = "-1929062245"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.field4233, FillMode.SOLID, FillMode.field4232}; // L: 15
	}
}
