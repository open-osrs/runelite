import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1020471777
	)
	int field3978;
	@ObfuscatedName("aw")
	boolean field3974;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1427969131
	)
	int field3960;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -257458079
	)
	int field3969;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1624069527
	)
	int field3961;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1468711737
	)
	int field3963;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -527267229
	)
	int field3964;
	@ObfuscatedName("ao")
	boolean field3965;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1760079217
	)
	int field3966;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -623871219
	)
	int field3971;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1977981671
	)
	int field3968;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1215936229
	)
	int field3982;
	@ObfuscatedName("aa")
	String field3977;
	@ObfuscatedName("al")
	String field3967;
	@ObfuscatedName("ar")
	String field3972;
	@ObfuscatedName("ak")
	String field3973;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1699686401
	)
	int field3970;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1455599319
	)
	int field3975;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1261873211
	)
	int field3976;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 321508639
	)
	int field3956;
	@ObfuscatedName("br")
	String field3950;
	@ObfuscatedName("bn")
	String field3979;
	@ObfuscatedName("bi")
	int[] field3980;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1522227319
	)
	int field3981;
	@ObfuscatedName("bk")
	String field3952;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3980 = new int[3]; // L: 62
		this.field3978 = var1; // L: 67
		this.field3974 = var2; // L: 68
		this.field3960 = var3; // L: 69
		this.field3969 = var4; // L: 70
		this.field3961 = var5; // L: 71
		this.field3963 = var6; // L: 72
		this.field3964 = var7; // L: 73
		this.field3965 = var8; // L: 74
		this.field3966 = var9; // L: 75
		this.field3971 = var10; // L: 76
		this.field3968 = var11; // L: 77
		this.field3982 = var12; // L: 78
		this.field3977 = var13; // L: 79
		this.field3967 = var14; // L: 80
		this.field3972 = var15; // L: 81
		this.field3973 = var16; // L: 82
		this.field3970 = var17; // L: 83
		this.field3975 = var18; // L: 84
		this.field3976 = var19; // L: 85
		this.field3956 = var20; // L: 86
		this.field3950 = var21; // L: 87
		this.field3979 = var22; // L: 88
		this.field3980 = var23; // L: 89
		this.field3981 = var24; // L: 90
		this.field3952 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "506631790"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field3978); // L: 96
		var1.writeByte(this.field3974 ? 1 : 0); // L: 97
		var1.writeShort(this.field3960); // L: 98
		var1.writeByte(this.field3969); // L: 99
		var1.writeByte(this.field3961); // L: 100
		var1.writeByte(this.field3963); // L: 101
		var1.writeByte(this.field3964); // L: 102
		var1.writeByte(this.field3965 ? 1 : 0); // L: 103
		var1.writeShort(this.field3966); // L: 104
		var1.writeByte(this.field3971); // L: 105
		var1.writeMedium(this.field3968); // L: 106
		var1.writeShort(this.field3982); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field3977); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field3967); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field3972); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field3973); // L: 111
		var1.writeByte(this.field3975); // L: 112
		var1.writeShort(this.field3970); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field3950); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field3979); // L: 115
		var1.writeByte(this.field3976); // L: 116
		var1.writeByte(this.field3956); // L: 117

		for (int var2 = 0; var2 < this.field3980.length; ++var2) { // L: 118
			var1.writeInt(this.field3980[var2]);
		}

		var1.writeInt(this.field3981); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field3952); // L: 120
	} // L: 121

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2100625862"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		int var2 = var1 + UrlRequester.method2388(this.field3977); // L: 125
		var2 += UrlRequester.method2388(this.field3967); // L: 126
		var2 += UrlRequester.method2388(this.field3972); // L: 127
		var2 += UrlRequester.method2388(this.field3973); // L: 128
		var2 += UrlRequester.method2388(this.field3950); // L: 129
		var2 += UrlRequester.method2388(this.field3979); // L: 130
		var2 += UrlRequester.method2388(this.field3952); // L: 131
		return var2; // L: 132
	}
}
