import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class129 extends class132 {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1235110077
	)
	int field1482;
	@ObfuscatedName("c")
	byte field1480;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1931704741
	)
	int field1481;
	@ObfuscatedName("k")
	String field1483;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lec;)V"
	)
	class129(class133 var1) {
		this.this$0 = var1;
		this.field1482 = -1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "3602154"
	)
	void vmethod2703(Buffer var1) {
		var1.readUnsignedByte();
		this.field1482 = var1.readUnsignedShort();
		this.field1480 = var1.readByte();
		this.field1481 = var1.readUnsignedShort();
		var1.readLong();
		this.field1483 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "66"
	)
	void vmethod2702(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1482);
		var2.rank = this.field1480;
		var2.world = this.field1481;
		var2.username = new Username(this.field1483);
	}
}
