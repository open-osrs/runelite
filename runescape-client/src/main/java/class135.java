import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class135 extends class116 {
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("mouseWheel")
	static class144 mouseWheel;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 86371795
	)
	int field1508;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class135(class119 var1) {
		this.this$0 = var1;
		this.field1508 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1508 = var1.readUnsignedShort();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2565(this.field1508);
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "217"
	)
	static void method2672(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
