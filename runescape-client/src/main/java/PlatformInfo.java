import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -855312751
	)
	int field4092;
	@ObfuscatedName("as")
	boolean field4091;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 934385817
	)
	int field4093;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -841511077
	)
	int field4095;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -88776347
	)
	int field4096;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1463853317
	)
	int field4094;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 117450165
	)
	int field4103;
	@ObfuscatedName("ar")
	boolean field4086;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 330580727
	)
	int field4100;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -376982197
	)
	int field4101;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 922950559
	)
	int field4102;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1991963229
	)
	int field4104;
	@ObfuscatedName("au")
	String field4098;
	@ObfuscatedName("aj")
	String field4099;
	@ObfuscatedName("af")
	String field4106;
	@ObfuscatedName("aw")
	String field4107;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1913673055
	)
	int field4108;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1121209561
	)
	int field4109;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -64925851
	)
	int field4112;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 933896169
	)
	int field4111;
	@ObfuscatedName("bl")
	String field4105;
	@ObfuscatedName("bx")
	String field4113;
	@ObfuscatedName("bd")
	int[] field4114;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -194577267
	)
	int field4115;
	@ObfuscatedName("bf")
	String field4116;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4114 = new int[3]; // L: 62
		this.field4092 = var1; // L: 67
		this.field4091 = var2; // L: 68
		this.field4093 = var3; // L: 69
		this.field4095 = var4; // L: 70
		this.field4096 = var5; // L: 71
		this.field4094 = var6; // L: 72
		this.field4103 = var7; // L: 73
		this.field4086 = var8; // L: 74
		this.field4100 = var9; // L: 75
		this.field4101 = var10; // L: 76
		this.field4102 = var11; // L: 77
		this.field4104 = var12; // L: 78
		this.field4098 = var13; // L: 79
		this.field4099 = var14; // L: 80
		this.field4106 = var15; // L: 81
		this.field4107 = var16; // L: 82
		this.field4108 = var17; // L: 83
		this.field4109 = var18; // L: 84
		this.field4112 = var19; // L: 85
		this.field4111 = var20; // L: 86
		this.field4105 = var21; // L: 87
		this.field4113 = var22; // L: 88
		this.field4114 = var23; // L: 89
		this.field4115 = var24; // L: 90
		this.field4116 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "1363785145"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field4092); // L: 96
		var1.writeByte(this.field4091 ? 1 : 0); // L: 97
		var1.writeShort(this.field4093); // L: 98
		var1.writeByte(this.field4095); // L: 99
		var1.writeByte(this.field4096); // L: 100
		var1.writeByte(this.field4094); // L: 101
		var1.writeByte(this.field4103); // L: 102
		var1.writeByte(this.field4086 ? 1 : 0); // L: 103
		var1.writeShort(this.field4100); // L: 104
		var1.writeByte(this.field4101); // L: 105
		var1.writeMedium(this.field4102); // L: 106
		var1.writeShort(this.field4104); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4098); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4099); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4106); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4107); // L: 111
		var1.writeByte(this.field4109); // L: 112
		var1.writeShort(this.field4108); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4105); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4113); // L: 115
		var1.writeByte(this.field4112); // L: 116
		var1.writeByte(this.field4111); // L: 117

		for (int var2 = 0; var2 < this.field4114.length; ++var2) { // L: 118
			var1.writeInt(this.field4114[var2]);
		}

		var1.writeInt(this.field4115); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4116); // L: 120
	} // L: 121

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1151210729"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		String var4 = this.field4098; // L: 127
		int var3 = var4.length() + 2; // L: 129
		int var23 = var1 + var3; // L: 131
		String var7 = this.field4099; // L: 134
		int var6 = var7.length() + 2; // L: 136
		var23 += var6; // L: 138
		String var10 = this.field4106; // L: 141
		int var9 = var10.length() + 2; // L: 143
		var23 += var9; // L: 145
		String var13 = this.field4107; // L: 148
		int var12 = var13.length() + 2; // L: 150
		var23 += var12; // L: 152
		String var16 = this.field4105; // L: 155
		int var15 = var16.length() + 2; // L: 157
		var23 += var15; // L: 159
		String var19 = this.field4113; // L: 162
		int var18 = var19.length() + 2; // L: 164
		var23 += var18; // L: 166
		String var22 = this.field4116; // L: 169
		int var21 = var22.length() + 2; // L: 171
		var23 += var21; // L: 173
		return var23; // L: 174
	}
}
