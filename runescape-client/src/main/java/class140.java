import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class140 extends class144 {
	@ObfuscatedName("v")
	String field1623;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1314589285
	)
	int field1625;
	@ObfuscatedName("h")
	byte field1624;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1623 = null; // L: 55
	} // L: 59

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;S)V",
		garbageValue = "3239"
	)
	void vmethod3096(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1623 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1625 = var1.readUnsignedShort(); // L: 67
		this.field1624 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ley;B)V",
		garbageValue = "26"
	)
	void vmethod3093(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1623); // L: 74
		var2.world = this.field1625; // L: 75
		var2.rank = this.field1624; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1416883390"
	)
	public static void method2985() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 46
	} // L: 47
}
