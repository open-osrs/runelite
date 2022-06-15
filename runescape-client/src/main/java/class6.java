import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public enum class6 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lg;"
	)
	field17(0, 0);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1659874385
	)
	public final int field16;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -162249617
	)
	final int field15;

	class6(int var3, int var4) {
		this.field16 = var3; // L: 12
		this.field15 = var4; // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15; // L: 18
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1172724173"
	)
	public static boolean method37() {
		ReflectionCheck var0 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 28
		return var0 != null; // L: 29
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIILgk;II)V",
		garbageValue = "565551340"
	)
	static void method38(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 67
		var5.plane = var0; // L: 68
		var5.x = var1 * 128; // L: 69
		var5.y = var2 * 128; // L: 70
		int var6 = var3.sizeX; // L: 71
		int var7 = var3.sizeY; // L: 72
		if (var4 == 1 || var4 == 3) { // L: 73
			var6 = var3.sizeY; // L: 74
			var7 = var3.sizeX; // L: 75
		}

		var5.maxX = (var6 + var1) * 128; // L: 77
		var5.maxY = (var7 + var2) * 128; // L: 78
		var5.soundEffectId = var3.ambientSoundId; // L: 79
		var5.field812 = var3.int7 * 128; // L: 80
		var5.field819 = var3.int5; // L: 81
		var5.field811 = var3.int6; // L: 82
		var5.soundEffectIds = var3.soundEffectIds; // L: 83
		if (var3.transforms != null) { // L: 84
			var5.obj = var3; // L: 85
			var5.set(); // L: 86
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 88
		if (var5.soundEffectIds != null) { // L: 89
			var5.field809 = var5.field819 + (int)(Math.random() * (double)(var5.field811 - var5.field819));
		}

	} // L: 90
}
