import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class134 extends class144 {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -457086001
	)
	int field1608;
	@ObfuscatedName("q")
	byte field1607;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 369270557
	)
	int field1609;
	@ObfuscatedName("k")
	String field1606;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lee;)V"
	)
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1608 = -1; // L: 101
	} // L: 106

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1212008489"
	)
	void vmethod3037(Buffer var1) {
		this.field1608 = var1.readUnsignedShort(); // L: 109
		this.field1607 = var1.readByte();
		this.field1609 = var1.readUnsignedShort();
		var1.readLong(); // L: 112
		this.field1606 = var1.readStringCp1252NullTerminated(); // L: 113
	} // L: 114

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "1640110130"
	)
	void vmethod3032(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1608); // L: 117
		var2.rank = this.field1607; // L: 118
		var2.world = this.field1609; // L: 119
		var2.username = new Username(this.field1606); // L: 120
	} // L: 121

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-574473090"
	)
	public static int method2841(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 110
		return (var0 + var2) / var1 - var2; // L: 111
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1592310985"
	)
	static void method2850() {
		if (Client.oculusOrbState == 1) { // L: 12674
			Client.field575 = true; // L: 12675
		}

	} // L: 12677
}
