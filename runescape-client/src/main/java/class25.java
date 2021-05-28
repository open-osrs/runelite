import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("i")
public class class25 extends class16 {
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1119027669
	)
	int field213;
	@ObfuscatedName("n")
	byte field210;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 376208401
	)
	int field214;
	@ObfuscatedName("y")
	String field212;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class25(class19 var1) {
		this.this$0 = var1;
		this.field213 = -1; // L: 124
	} // L: 129

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "68071115"
	)
	void vmethod266(Buffer var1) {
		var1.readUnsignedByte(); // L: 132
		this.field213 = var1.readUnsignedShort(); // L: 133
		this.field210 = var1.readByte(); // L: 134
		this.field214 = var1.readUnsignedShort(); // L: 135
		var1.readLong(); // L: 136
		this.field212 = var1.readStringCp1252NullTerminated(); // L: 137
		var1.readUnsignedByte(); // L: 138
	} // L: 139

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ly;I)V",
		garbageValue = "-1846892157"
	)
	void vmethod264(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field213); // L: 142
		var2.rank = this.field210; // L: 143
		var2.world = this.field214; // L: 144
		var2.name = this.field212; // L: 145
	} // L: 146
}
