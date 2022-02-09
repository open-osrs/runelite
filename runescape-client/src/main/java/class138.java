import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class138 extends class142 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static IndexedSprite field1613;
	@ObfuscatedName("c")
	String field1617;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1865380487
	)
	int field1616;
	@ObfuscatedName("s")
	byte field1615;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class138(class143 var1) {
		this.this$0 = var1;
		this.field1617 = null; // L: 55
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-103"
	)
	void vmethod3014(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1617 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1616 = var1.readUnsignedShort(); // L: 67
		this.field1615 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leg;B)V",
		garbageValue = "48"
	)
	void vmethod3015(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1617); // L: 74
		var2.world = this.field1616; // L: 75
		var2.rank = this.field1615; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78
}
