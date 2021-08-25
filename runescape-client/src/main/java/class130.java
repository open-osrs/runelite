import java.awt.Image;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class130 extends class116 {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -985111079
	)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("av")
	static Image field1489;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1903391419
	)
	int field1491;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class130(class119 var1) {
		this.this$0 = var1;
		this.field1491 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1491 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2589(this.field1491);
	}
}
