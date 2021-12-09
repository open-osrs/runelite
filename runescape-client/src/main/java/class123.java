import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class123 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -601293693
	)
	int field1481;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1319645239
	)
	int field1479;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 6552211
	)
	int field1480;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -223756011
	)
	int field1482;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lda;)V"
	)
	class123(class129 var1) {
		this.this$0 = var1;
		this.field1481 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1416770155"
	)
	void vmethod3029(Buffer var1) {
		this.field1481 = var1.readUnsignedShort(); // L: 166
		this.field1479 = var1.readInt(); // L: 167
		this.field1480 = var1.readUnsignedByte(); // L: 168
		this.field1482 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lej;I)V",
		garbageValue = "-1531735008"
	)
	void vmethod3028(ClanSettings var1) {
		var1.method2858(this.field1481, this.field1479, this.field1480, this.field1482); // L: 173
	} // L: 174

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-84"
	)
	public static int method2744(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1895069117"
	)
	public static int method2737(int var0, int var1, int var2) {
		int var3 = WorldMapEvent.method4942(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public static void method2746(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0; // L: 72
	} // L: 73

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1478303214"
	)
	static void method2745() {
		Messages.Messages_channels.clear(); // L: 50
		Messages.Messages_hashTable.clear(); // L: 51
		Messages.Messages_queue.clear(); // L: 52
		Messages.Messages_count = 0; // L: 53
	} // L: 54
}
