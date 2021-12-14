import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class186 {
	@ObfuscatedName("p")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("m")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2119093831
	)
	public static int field2129;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -479037751
	)
	public static int field2130;
	@ObfuscatedName("w")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("n")
	@Export("bufferY")
	public static int[] bufferY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1673283901
	)
	static int field2135;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1374404947
	)
	@Export("canvasWidth")
	public static int canvasWidth;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lfc;",
		garbageValue = "45"
	)
	static HorizontalAlignment[] method3739() {
		return new HorizontalAlignment[]{HorizontalAlignment.field1829, HorizontalAlignment.field1826, HorizontalAlignment.HorizontalAlignment_centered};
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;ZI)V",
		garbageValue = "19498859"
	)
	public static void method3740(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}
}
