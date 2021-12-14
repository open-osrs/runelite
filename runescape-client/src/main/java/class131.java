import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class131 extends class126 {
	@ObfuscatedName("an")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = -366800695
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -564677501
	)
	int field1526;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 165982009
	)
	int field1525;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1640415355
	)
	int field1528;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1105926385
	)
	int field1533;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class131(class129 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1526 = var1.readInt();
		this.field1533 = var1.readInt();
		this.field1525 = var1.readUnsignedByte();
		this.field1528 = var1.readUnsignedByte();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2860(this.field1526, this.field1533, this.field1525, this.field1528);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-37"
	)
	static final int method2802(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
