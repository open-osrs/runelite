import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class121 extends class116 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 983909083
	)
	int field1417;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1160316359
	)
	int field1411;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1316430201
	)
	int field1410;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1321113621
	)
	int field1416;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class121(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1417 = var1.readInt();
		this.field1416 = var1.readInt();
		this.field1411 = var1.readUnsignedByte();
		this.field1410 = var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2569(this.field1417, this.field1416, this.field1411, this.field1410);
	}
}
