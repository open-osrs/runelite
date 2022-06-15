import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class141 extends class144 {
	@ObfuscatedName("jm")
	@ObfuscatedGetter(
		intValue = -1799721325
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1400461077
	)
	int field1659;
	@ObfuscatedName("v")
	byte field1660;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1585058459
	)
	int field1658;
	@ObfuscatedName("f")
	String field1656;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leu;)V"
	)
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1659 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "355261812"
	)
	void vmethod3137(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1659 = var1.readUnsignedShort(); // L: 134
		this.field1660 = var1.readByte(); // L: 135
		this.field1658 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1656 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "1368590037"
	)
	void vmethod3138(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1659); // L: 143
		var2.rank = this.field1660; // L: 144
		var2.world = this.field1658; // L: 145
		var2.username = new Username(this.field1656); // L: 146
	} // L: 147

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-113948023"
	)
	public static int method3048(int var0) {
		return (var0 & class438.field4680) - 1; // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "-612042966"
	)
	public static int method3044(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 38
			int var6 = var3; // L: 39
			var3 = var4; // L: 40
			var4 = var6; // L: 41
		}

		var2 &= 3; // L: 43
		if (var2 == 0) { // L: 44
			return var1;
		} else if (var2 == 1) { // L: 45
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 46
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1644827355"
	)
	public static void method3047() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 429
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 430
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 431
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 432
	} // L: 433
}
