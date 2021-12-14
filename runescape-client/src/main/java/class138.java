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
		this.field1589 = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1589 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1588 = var1.readUnsignedShort();
		this.field1590 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1589);
		var2.world = this.field1588;
		var2.rank = this.field1590;
		var1.addMember(var2);
	}
}
