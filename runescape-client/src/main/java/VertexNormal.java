import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1974778043
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -537542863
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 987855995
	)
	@Export("z")
	int z;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1799823947
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lge;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;S)V",
		garbageValue = "6851"
	)
	public static void method3782(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0; // L: 30
		HealthBarDefinition.HitSplatDefinition_spritesArchive = var1; // L: 31
	} // L: 32

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lir;II)Low;",
		garbageValue = "577836402"
	)
	public static IndexedSprite method3783(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1); // L: 190
		boolean var2;
		if (var3 == null) { // L: 191
			var2 = false; // L: 192
		} else {
			class244.SpriteBuffer_decode(var3); // L: 195
			var2 = true; // L: 196
		}

		return !var2 ? null : ArchiveLoader.method2076(); // L: 198 199
	}
}
