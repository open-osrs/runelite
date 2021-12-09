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
		this.field1595 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;B)V",
		garbageValue = "4"
	)
	void vmethod3022(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1595 = var1.readUnsignedShort(); // L: 134
		this.field1594 = var1.readByte(); // L: 135
		this.field1593 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1596 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lei;B)V",
		garbageValue = "40"
	)
	void vmethod3021(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1595); // L: 143
		var2.rank = this.field1594; // L: 144
		var2.world = this.field1593; // L: 145
		var2.username = new Username(this.field1596); // L: 146
	} // L: 147

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqg;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 57
			var2 = (RunException)var0; // L: 58
			var2.message = var2.message + ' ' + var1; // L: 59
		} else {
			var2 = new RunException(var0, var1); // L: 61
		}

		return var2; // L: 62
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Lbr;",
		garbageValue = "-1096898317"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1312744051"
	)
	static final int method2932(int var0, int var1) {
		int var2 = KeyHandler.method367(var0 - 1, var1 - 1) + KeyHandler.method367(var0 + 1, var1 - 1) + KeyHandler.method367(var0 - 1, 1 + var1) + KeyHandler.method367(var0 + 1, var1 + 1); // L: 481
		int var3 = KeyHandler.method367(var0 - 1, var1) + KeyHandler.method367(var0 + 1, var1) + KeyHandler.method367(var0, var1 - 1) + KeyHandler.method367(var0, 1 + var1); // L: 482
		int var4 = KeyHandler.method367(var0, var1); // L: 483
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 484
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "341496897"
	)
	static final boolean method2931() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 100
	}
}
