import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("gq")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 39428313
	)
	int field3985;
	@ObfuscatedName("ax")
	boolean field3979;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1924640865
	)
	int field3996;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 600526161
	)
	int field3988;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1782962691
	)
	int field3989;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -250064103
	)
	int field3990;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 602190231
	)
	int field3991;
	@ObfuscatedName("ak")
	boolean field3992;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1805222575
	)
	int field4009;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -166600075
	)
	int field3995;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1055220501
	)
	int field4005;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1915691553
	)
	int field3997;
	@ObfuscatedName("ap")
	String field3977;
	@ObfuscatedName("ah")
	String field3986;
	@ObfuscatedName("ag")
	String field3999;
	@ObfuscatedName("ai")
	String field4000;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -25755207
	)
	int field4001;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1992767683
	)
	int field4002;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1666259367
	)
	int field4003;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 200338609
	)
	int field4004;
	@ObfuscatedName("bk")
	String field3987;
	@ObfuscatedName("br")
	String field4007;
	@ObfuscatedName("by")
	int[] field3998;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1122886171
	)
	int field4008;
	@ObfuscatedName("bf")
	String field3993;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3998 = new int[3];
		this.field3985 = var1;
		this.field3979 = var2;
		this.field3996 = var3;
		this.field3988 = var4;
		this.field3989 = var5;
		this.field3990 = var6;
		this.field3991 = var7;
		this.field3992 = var8;
		this.field4009 = var9;
		this.field3995 = var10;
		this.field4005 = var11;
		this.field3997 = var12;
		this.field3977 = var13;
		this.field3986 = var14;
		this.field3999 = var15;
		this.field4000 = var16;
		this.field4001 = var17;
		this.field4002 = var18;
		this.field4003 = var19;
		this.field4004 = var20;
		this.field3987 = var21;
		this.field4007 = var22;
		this.field3998 = var23;
		this.field4008 = var24;
		this.field3993 = var25;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)V",
		garbageValue = "239897067"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3985);
		var1.writeByte(this.field3979 ? 1 : 0);
		var1.writeShort(this.field3996);
		var1.writeByte(this.field3988);
		var1.writeByte(this.field3989);
		var1.writeByte(this.field3990);
		var1.writeByte(this.field3991);
		var1.writeByte(this.field3992 ? 1 : 0);
		var1.writeShort(this.field4009);
		var1.writeByte(this.field3995);
		var1.writeMedium(this.field4005);
		var1.writeShort(this.field3997);
		var1.writeStringCp1252NullCircumfixed(this.field3977);
		var1.writeStringCp1252NullCircumfixed(this.field3986);
		var1.writeStringCp1252NullCircumfixed(this.field3999);
		var1.writeStringCp1252NullCircumfixed(this.field4000);
		var1.writeByte(this.field4002);
		var1.writeShort(this.field4001);
		var1.writeStringCp1252NullCircumfixed(this.field3987);
		var1.writeStringCp1252NullCircumfixed(this.field4007);
		var1.writeByte(this.field4003);
		var1.writeByte(this.field4004);

		for (int var2 = 0; var2 < this.field3998.length; ++var2) {
			var1.writeInt(this.field3998[var2]);
		}

		var1.writeInt(this.field4008);
		var1.writeStringCp1252NullCircumfixed(this.field3993);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + GrandExchangeOfferAgeComparator.method5131(this.field3977);
		var2 += GrandExchangeOfferAgeComparator.method5131(this.field3986);
		var2 += GrandExchangeOfferAgeComparator.method5131(this.field3999);
		var2 += GrandExchangeOfferAgeComparator.method5131(this.field4000);
		var2 += GrandExchangeOfferAgeComparator.method5131(this.field3987);
		var2 += GrandExchangeOfferAgeComparator.method5131(this.field4007);
		var2 += GrandExchangeOfferAgeComparator.method5131(this.field3993);
		return var2;
	}
}
