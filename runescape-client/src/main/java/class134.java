import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class134 extends class144 {
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1229066847
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1626167143
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1869646227
	)
	int field1566;
	@ObfuscatedName("o")
	byte field1564;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1456142123
	)
	int field1565;
	@ObfuscatedName("g")
	String field1567;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lez;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1566 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;S)V",
		garbageValue = "3239"
	)
	void vmethod3096(Buffer var1) {
		this.field1566 = var1.readUnsignedShort(); // L: 109
		this.field1564 = var1.readByte(); // L: 110
		this.field1565 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1567 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ley;B)V",
		garbageValue = "26"
	)
	void vmethod3093(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1566); // L: 117
		var2.rank = this.field1564; // L: 118
		var2.world = this.field1565; // L: 119
		var2.username = new Username(this.field1567); // L: 120
	} // L: 121
}
