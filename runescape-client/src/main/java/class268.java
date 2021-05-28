import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public enum class268 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3537(-1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3540(0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3538(1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	field3539(2);

	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1451177967
	)
	final int field3536;

	class268(int var3) {
		this.field3536 = var3; // L: 19
	} // L: 20

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3536; // L: 23
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIILeg;IB)V",
		garbageValue = "2"
	)
	static void method4851(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 73
		var5.plane = var0; // L: 74
		var5.x = var1 * 128; // L: 75
		var5.y = var2 * 128; // L: 76
		int var6 = var3.sizeX; // L: 77
		int var7 = var3.sizeY; // L: 78
		if (var4 == 1 || var4 == 3) { // L: 79
			var6 = var3.sizeY; // L: 80
			var7 = var3.sizeX; // L: 81
		}

		var5.field956 = (var6 + var1) * 128; // L: 83
		var5.field957 = (var7 + var2) * 128; // L: 84
		var5.soundEffectId = var3.ambientSoundId; // L: 85
		var5.field958 = var3.int4 * 128; // L: 86
		var5.field961 = var3.int5; // L: 87
		var5.field964 = var3.int6; // L: 88
		var5.soundEffectIds = var3.soundEffectIds; // L: 89
		if (var3.transforms != null) { // L: 90
			var5.obj = var3; // L: 91
			var5.set(); // L: 92
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 94
		if (var5.soundEffectIds != null) { // L: 95
			var5.field954 = var5.field961 + (int)(Math.random() * (double)(var5.field964 - var5.field961));
		}

	} // L: 96
}
