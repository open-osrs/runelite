import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class138 extends class142 {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -539577351
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("c")
	String field1589;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -318281505
	)
	int field1588;
	@ObfuscatedName("p")
	byte field1590;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	class138(class143 var1) {
		this.this$0 = var1;
		this.field1589 = null; // L: 55
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1589 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1588 = var1.readUnsignedShort(); // L: 67
		this.field1590 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1589); // L: 74
		var2.world = this.field1588; // L: 75
		var2.rank = this.field1590; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78
}
