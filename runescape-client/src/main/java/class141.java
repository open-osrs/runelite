import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class141 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -705325855
	)
	int field1616;
	@ObfuscatedName("c")
	byte field1617;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1660871845
	)
	int field1618;
	@ObfuscatedName("f")
	String field1619;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ler;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ler;)V"
	)
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1616 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "23"
	)
	void vmethod3152(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1616 = var1.readUnsignedShort(); // L: 134
		this.field1617 = var1.readByte(); // L: 135
		this.field1618 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1619 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "1764669808"
	)
	void vmethod3153(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1616); // L: 143
		var2.rank = this.field1617; // L: 144
		var2.world = this.field1618; // L: 145
		var2.username = new Username(this.field1619); // L: 146
	} // L: 147
}
