import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1887(2, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	field1886(1, 2);

	@ObfuscatedName("v")
	static int[] field1884;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -702197369
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1138323233
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Lij;",
		garbageValue = "57"
	)
	public static class255[] method3321() {
		return new class255[]{class255.field2941, class255.field2942, class255.field2943, class255.field2949, class255.field2945, class255.field2948, class255.field2946, class255.field2944, class255.field2947, class255.field2950}; // L: 17
	}
}
