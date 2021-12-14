import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class130 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 70738287
	)
	int field1524;
	@ObfuscatedName("b")
	byte field1522;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class130(class129 var1) {
		this.this$0 = var1;
		this.field1524 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1524 = var1.readUnsignedShort();
		this.field1522 = var1.readByte();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2887(this.field1524, this.field1522);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Lll;IB)Lll;",
		garbageValue = "5"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Law;I)V",
		garbageValue = "1459785075"
	)
	public static final void method2795(class47 var0) {
		class11.pcmPlayerProvider = var0;
	}
}
