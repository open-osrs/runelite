import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -433932703
	)
	int field3961;
	@ObfuscatedName("ah")
	boolean field3968;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1848627019
	)
	int field3952;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1832118753
	)
	int field3958;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -555698661
	)
	int field3959;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -970589663
	)
	int field3950;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1243453955
	)
	int field3976;
	@ObfuscatedName("ag")
	boolean field3962;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -668677467
	)
	int field3963;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1196353791
	)
	int field3964;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2023487119
	)
	int field3965;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1164464565
	)
	int field3966;
	@ObfuscatedName("at")
	String field3979;
	@ObfuscatedName("as")
	String field3953;
	@ObfuscatedName("aj")
	String field3969;
	@ObfuscatedName("ae")
	String field3970;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1856505343
	)
	int field3971;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -908092979
	)
	int field3954;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -319239105
	)
	int field3973;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2054037315
	)
	int field3974;
	@ObfuscatedName("bf")
	String field3975;
	@ObfuscatedName("bp")
	String field3960;
	@ObfuscatedName("bg")
	int[] field3977;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 173908363
	)
	int field3978;
	@ObfuscatedName("bj")
	String field3955;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3977 = new int[3]; // L: 62
		this.field3961 = var1; // L: 67
		this.field3968 = var2; // L: 68
		this.field3952 = var3; // L: 69
		this.field3958 = var4; // L: 70
		this.field3959 = var5; // L: 71
		this.field3950 = var6; // L: 72
		this.field3976 = var7; // L: 73
		this.field3962 = var8; // L: 74
		this.field3963 = var9; // L: 75
		this.field3964 = var10; // L: 76
		this.field3965 = var11; // L: 77
		this.field3966 = var12; // L: 78
		this.field3979 = var13; // L: 79
		this.field3953 = var14; // L: 80
		this.field3969 = var15; // L: 81
		this.field3970 = var16; // L: 82
		this.field3971 = var17; // L: 83
		this.field3954 = var18; // L: 84
		this.field3973 = var19; // L: 85
		this.field3974 = var20; // L: 86
		this.field3975 = var21; // L: 87
		this.field3960 = var22; // L: 88
		this.field3977 = var23; // L: 89
		this.field3978 = var24; // L: 90
		this.field3955 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "1047408836"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field3961); // L: 96
		var1.writeByte(this.field3968 ? 1 : 0); // L: 97
		var1.writeShort(this.field3952); // L: 98
		var1.writeByte(this.field3958); // L: 99
		var1.writeByte(this.field3959); // L: 100
		var1.writeByte(this.field3950); // L: 101
		var1.writeByte(this.field3976); // L: 102
		var1.writeByte(this.field3962 ? 1 : 0); // L: 103
		var1.writeShort(this.field3963); // L: 104
		var1.writeByte(this.field3964); // L: 105
		var1.writeMedium(this.field3965); // L: 106
		var1.writeShort(this.field3966); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field3979); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field3953); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field3969); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field3970); // L: 111
		var1.writeByte(this.field3954); // L: 112
		var1.writeShort(this.field3971); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field3975); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field3960); // L: 115
		var1.writeByte(this.field3973); // L: 116
		var1.writeByte(this.field3974); // L: 117

		for (int var2 = 0; var2 < this.field3977.length; ++var2) { // L: 118
			var1.writeInt(this.field3977[var2]);
		}

		var1.writeInt(this.field3978); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field3955); // L: 120
	} // L: 121

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2060654992"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		int var2 = var1 + class90.method2169(this.field3979); // L: 125
		var2 += class90.method2169(this.field3953); // L: 126
		var2 += class90.method2169(this.field3969); // L: 127
		var2 += class90.method2169(this.field3970); // L: 128
		var2 += class90.method2169(this.field3975); // L: 129
		var2 += class90.method2169(this.field3960); // L: 130
		var2 += class90.method2169(this.field3955); // L: 131
		return var2; // L: 132
	}
}
