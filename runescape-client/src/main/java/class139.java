import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class139 extends class142 {
	@ObfuscatedName("sl")
	@ObfuscatedGetter(
		intValue = -839412529
	)
	static int field1624;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1184963117
	)
	int field1618;
	@ObfuscatedName("l")
	byte field1620;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 266467011
	)
	int field1623;
	@ObfuscatedName("e")
	String field1621;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Led;)V"
	)
	class139(class143 var1) {
		this.this$0 = var1;
		this.field1618 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "-103"
	)
	void vmethod3014(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1618 = var1.readUnsignedShort(); // L: 134
		this.field1620 = var1.readByte(); // L: 135
		this.field1623 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1621 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Leg;B)V",
		garbageValue = "48"
	)
	void vmethod3015(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1618); // L: 143
		var2.rank = this.field1620; // L: 144
		var2.world = this.field1623; // L: 145
		var2.username = new Username(this.field1621); // L: 146
	} // L: 147

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1814466450"
	)
	static final boolean method2923() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 95
	}
}
