import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class132 extends class128 {
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static Archive field1588;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1669105563
	)
	int field1590;
	@ObfuscatedName("v")
	byte field1589;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lej;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1590 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;B)V",
		garbageValue = "5"
	)
	void vmethod3150(Buffer var1) {
		this.field1590 = var1.readUnsignedShort(); // L: 134
		this.field1589 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Len;I)V",
		garbageValue = "-1718344311"
	)
	void vmethod3149(ClanSettings var1) {
		var1.method2961(this.field1590, this.field1589); // L: 139
	} // L: 140

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Law;I)V",
		garbageValue = "-1204833299"
	)
	public static final void method2885(class47 var0) {
		ModelData0.pcmPlayerProvider = var0; // L: 45
	} // L: 46

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "854083418"
	)
	static void method2887() {
		if (class121.worldMap != null) { // L: 4337
			class121.worldMap.method7192(PacketWriter.Client_plane, (class101.localPlayer.x >> 7) + class28.baseX, (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY, false); // L: 4338
			class121.worldMap.loadCache(); // L: 4339
		}

	} // L: 4341
}
