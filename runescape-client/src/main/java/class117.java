import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class117 extends class116 {
	@ObfuscatedName("ph")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	static class352 field1388;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -952735657
	)
	int field1390;
	@ObfuscatedName("c")
	boolean field1389;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	class117(class119 var1) {
		this.this$0 = var1;
		this.field1390 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413895325"
	)
	void vmethod2711(Buffer var1) {
		this.field1390 = var1.readUnsignedShort();
		this.field1389 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "697483856"
	)
	void vmethod2712(ClanSettings var1) {
		var1.method2590(this.field1390, this.field1389);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "1371116054"
	)
	static void method2501(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}
}
