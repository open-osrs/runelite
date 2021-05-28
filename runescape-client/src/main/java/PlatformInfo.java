import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1738879851
	)
	int field3962;
	@ObfuscatedName("ag")
	boolean field3960;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -841564613
	)
	int field3972;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1817348859
	)
	int field3965;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -664826965
	)
	int field3963;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 743323425
	)
	int field3977;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1340740659
	)
	int field3967;
	@ObfuscatedName("av")
	boolean field3966;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -862865125
	)
	int field3961;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -669385777
	)
	int field3981;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1636879871
	)
	int field3948;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -741619897
	)
	int field3970;
	@ObfuscatedName("aw")
	String field3971;
	@ObfuscatedName("af")
	String field3982;
	@ObfuscatedName("ak")
	String field3973;
	@ObfuscatedName("ay")
	String field3976;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 945045113
	)
	int field3975;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 611587281
	)
	int field3974;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 942702701
	)
	int field3956;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2113690795
	)
	int field3978;
	@ObfuscatedName("bt")
	String field3979;
	@ObfuscatedName("bq")
	String field3980;
	@ObfuscatedName("bu")
	int[] field3964;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1352170779
	)
	int field3983;
	@ObfuscatedName("bv")
	String field3952;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3964 = new int[3]; // L: 62
		this.field3962 = var1; // L: 67
		this.field3960 = var2; // L: 68
		this.field3972 = var3; // L: 69
		this.field3965 = var4; // L: 70
		this.field3963 = var5; // L: 71
		this.field3977 = var6; // L: 72
		this.field3967 = var7; // L: 73
		this.field3966 = var8; // L: 74
		this.field3961 = var9; // L: 75
		this.field3981 = var10; // L: 76
		this.field3948 = var11; // L: 77
		this.field3970 = var12; // L: 78
		this.field3971 = var13; // L: 79
		this.field3982 = var14; // L: 80
		this.field3973 = var15; // L: 81
		this.field3976 = var16; // L: 82
		this.field3975 = var17; // L: 83
		this.field3974 = var18; // L: 84
		this.field3956 = var19; // L: 85
		this.field3978 = var20; // L: 86
		this.field3979 = var21; // L: 87
		this.field3980 = var22; // L: 88
		this.field3964 = var23; // L: 89
		this.field3983 = var24; // L: 90
		this.field3952 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-57324099"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field3962); // L: 96
		var1.writeByte(this.field3960 ? 1 : 0); // L: 97
		var1.writeShort(this.field3972); // L: 98
		var1.writeByte(this.field3965); // L: 99
		var1.writeByte(this.field3963); // L: 100
		var1.writeByte(this.field3977); // L: 101
		var1.writeByte(this.field3967); // L: 102
		var1.writeByte(this.field3966 ? 1 : 0); // L: 103
		var1.writeShort(this.field3961); // L: 104
		var1.writeByte(this.field3981); // L: 105
		var1.writeMedium(this.field3948); // L: 106
		var1.writeShort(this.field3970); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field3971); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field3982); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field3973); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field3976); // L: 111
		var1.writeByte(this.field3974); // L: 112
		var1.writeShort(this.field3975); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field3979); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field3980); // L: 115
		var1.writeByte(this.field3956); // L: 116
		var1.writeByte(this.field3978); // L: 117

		for (int var2 = 0; var2 < this.field3964.length; ++var2) { // L: 118
			var1.writeInt(this.field3964[var2]);
		}

		var1.writeInt(this.field3983); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field3952); // L: 120
	} // L: 121

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1999982360"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		int var2 = var1 + BufferedFile.method6418(this.field3971); // L: 125
		var2 += BufferedFile.method6418(this.field3982); // L: 126
		var2 += BufferedFile.method6418(this.field3973); // L: 127
		var2 += BufferedFile.method6418(this.field3976); // L: 128
		var2 += BufferedFile.method6418(this.field3979); // L: 129
		var2 += BufferedFile.method6418(this.field3980); // L: 130
		var2 += BufferedFile.method6418(this.field3952); // L: 131
		return var2; // L: 132
	}
}
