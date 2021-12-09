import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class149 extends class142 {
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 351712585
	)
	public static int field1663;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1386681445
	)
	static int field1661;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("c")
	String field1662;
	@ObfuscatedName("b")
	byte field1660;
	@ObfuscatedName("p")
	byte field1659;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	class149(class143 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		this.field1662 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1662 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1660 = var1.readByte(); // L: 161
			this.field1659 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		var1.name = this.field1662; // L: 167
		if (this.field1662 != null) { // L: 168
			var1.field1636 = this.field1660; // L: 169
			var1.field1643 = this.field1659; // L: 170
		}

	} // L: 172
}
