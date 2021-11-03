import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
public class class122 extends class132 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = 203381115
	)
	static int field1420;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1422927589
	)
	int field1419;
	@ObfuscatedName("w")
	byte field1415;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1058551231
	)
	int field1417;
	@ObfuscatedName("a")
	String field1414;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class122(class133 var1) {
		this.this$0 = var1;
		this.field1419 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		this.field1419 = var1.readUnsignedShort(); // L: 109
		this.field1415 = var1.readByte(); // L: 110
		this.field1417 = var1.readUnsignedShort(); // L: 111
		var1.readLong(); // L: 112
		this.field1414 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1419); // L: 117
		var2.rank = this.field1415; // L: 118
		var2.world = this.field1417; // L: 119
		var2.username = new Username(this.field1414); // L: 120
	} // L: 121

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "904949583"
	)
	public static void method2599(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 47
			int var4 = (var3 + var2) / 2; // L: 48
			int var5 = var2; // L: 49
			String var6 = var0[var4]; // L: 50
			var0[var4] = var0[var3]; // L: 51
			var0[var3] = var6; // L: 52
			int var7 = var1[var4]; // L: 53
			var1[var4] = var1[var3]; // L: 54
			var1[var3] = var7; // L: 55

			for (int var8 = var2; var8 < var3; ++var8) { // L: 56
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 57
					String var9 = var0[var8]; // L: 58
					var0[var8] = var0[var5]; // L: 59
					var0[var5] = var9; // L: 60
					int var10 = var1[var8]; // L: 61
					var1[var8] = var1[var5]; // L: 62
					var1[var5++] = var10; // L: 63
				}
			}

			var0[var3] = var0[var5]; // L: 67
			var0[var5] = var6; // L: 68
			var1[var3] = var1[var5]; // L: 69
			var1[var5] = var7; // L: 70
			method2599(var0, var1, var2, var5 - 1); // L: 71
			method2599(var0, var1, var5 + 1, var3); // L: 72
		}

	} // L: 74

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lbf;",
		garbageValue = "622139393"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 44
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-47"
	)
	static boolean method2607(int var0) {
		return var0 == 57 || var0 == 58 || var0 == 1007 || var0 == 25 || var0 == 30; // L: 9312
	}
}
