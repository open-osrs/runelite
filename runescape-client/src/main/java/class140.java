import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class140 extends class126 {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 471941729
	)
	int field1603;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class140(class129 var1) {
		this.this$0 = var1;
		this.field1603 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1603 = var1.readUnsignedShort();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2854(this.field1603);
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (class242.loadInterface(var0)) {
			Widget[] var1 = MouseRecorder.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
