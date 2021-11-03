import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public class class121 extends class116 {
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1196916291
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1717605109
	)
	int field1412;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1452092031
	)
	int field1408;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 513208975
	)
	int field1409;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 479707565
	)
	int field1407;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class121(class119 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1412 = var1.readInt(); // L: 292
		this.field1407 = var1.readInt(); // L: 293
		this.field1408 = var1.readUnsignedByte(); // L: 294
		this.field1409 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2665(this.field1412, this.field1407, this.field1408, this.field1409); // L: 299
	} // L: 300
}
