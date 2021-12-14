import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class139 extends class142 {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -723386135
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1906943517
	)
	int field1595;
	@ObfuscatedName("b")
	byte field1594;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1562134813
	)
	int field1593;
	@ObfuscatedName("m")
	String field1596;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Len;"
	)
	final class143 this$0;

	@ObfuscatedSignature(
		descriptor = "(Len;)V"
	)
	class139(class143 var1) {
		this.this$0 = var1;
		this.field1595 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		var1.readUnsignedByte();
		this.field1595 = var1.readUnsignedShort();
		this.field1594 = var1.readByte();
		this.field1593 = var1.readUnsignedShort();
		var1.readLong();
		this.field1596 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1595);
		var2.rank = this.field1594;
		var2.world = this.field1593;
		var2.username = new Username(this.field1596);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqg;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lbr;",
		garbageValue = "-1096898317"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1312744051"
	)
	static final int method2932(int var0, int var1) {
		int var2 = KeyHandler.method367(var0 - 1, var1 - 1) + KeyHandler.method367(var0 + 1, var1 - 1) + KeyHandler.method367(var0 - 1, 1 + var1) + KeyHandler.method367(var0 + 1, var1 + 1);
		int var3 = KeyHandler.method367(var0 - 1, var1) + KeyHandler.method367(var0 + 1, var1) + KeyHandler.method367(var0, var1 - 1) + KeyHandler.method367(var0, 1 + var1);
		int var4 = KeyHandler.method367(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "341496897"
	)
	static final boolean method2931() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}
}
