import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public class class125 extends class116 {
	@ObfuscatedName("i")
	String field1429;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class125(class119 var1) {
		this.this$0 = var1; // L: 229
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1429 = var1.readStringCp1252NullTerminated(); // L: 232
		var1.readInt(); // L: 233
	} // L: 234

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.name = this.field1429; // L: 237
	} // L: 238

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-924468253"
	)
	public static void method2637() {
		class54.reflectionChecks = new IterableNodeDeque(); // L: 24
	} // L: 25

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIILfe;II)V",
		garbageValue = "2132581539"
	)
	static void method2635(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound(); // L: 59
		var5.plane = var0; // L: 60
		var5.x = var1 * 128; // L: 61
		var5.y = var2 * 128; // L: 62
		int var6 = var3.sizeX; // L: 63
		int var7 = var3.sizeY; // L: 64
		if (var4 == 1 || var4 == 3) { // L: 65
			var6 = var3.sizeY; // L: 66
			var7 = var3.sizeX; // L: 67
		}

		var5.maxX = (var6 + var1) * 128; // L: 69
		var5.maxY = (var7 + var2) * 128; // L: 70
		var5.soundEffectId = var3.ambientSoundId; // L: 71
		var5.field773 = var3.int7 * 128; // L: 72
		var5.field767 = var3.int5; // L: 73
		var5.field776 = var3.int6; // L: 74
		var5.soundEffectIds = var3.soundEffectIds; // L: 75
		if (var3.transforms != null) { // L: 76
			var5.obj = var3; // L: 77
			var5.set(); // L: 78
		}

		ObjectSound.objectSounds.addFirst(var5); // L: 80
		if (var5.soundEffectIds != null) { // L: 81
			var5.field779 = var5.field767 + (int)(Math.random() * (double)(var5.field776 - var5.field767));
		}

	} // L: 82
}
