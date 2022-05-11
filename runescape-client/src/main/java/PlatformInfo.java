import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -352723525
	)
	int field4493;
	@ObfuscatedName("az")
	boolean field4484;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 67717751
	)
	int field4485;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 514361411
	)
	int field4486;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1922265923
	)
	int field4494;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1001039591
	)
	int field4488;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1803225865
	)
	int field4504;
	@ObfuscatedName("al")
	boolean field4490;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1919314793
	)
	int field4491;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1063380295
	)
	int field4498;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1620119563
	)
	int field4489;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1010736361
	)
	int field4487;
	@ObfuscatedName("ao")
	String field4495;
	@ObfuscatedName("av")
	String field4496;
	@ObfuscatedName("ai")
	String field4497;
	@ObfuscatedName("ay")
	String field4483;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 244652383
	)
	int field4499;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1643044807
	)
	int field4500;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1832945347
	)
	int field4501;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 653746079
	)
	int field4502;
	@ObfuscatedName("ba")
	String field4503;
	@ObfuscatedName("bk")
	String field4477;
	@ObfuscatedName("bi")
	int[] field4505;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -826466447
	)
	int field4506;
	@ObfuscatedName("bo")
	String field4507;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4505 = new int[3]; // L: 62
		this.field4493 = var1; // L: 67
		this.field4484 = var2; // L: 68
		this.field4485 = var3; // L: 69
		this.field4486 = var4; // L: 70
		this.field4494 = var5; // L: 71
		this.field4488 = var6; // L: 72
		this.field4504 = var7; // L: 73
		this.field4490 = var8; // L: 74
		this.field4491 = var9; // L: 75
		this.field4498 = var10; // L: 76
		this.field4489 = var11; // L: 77
		this.field4487 = var12; // L: 78
		this.field4495 = var13; // L: 79
		this.field4496 = var14; // L: 80
		this.field4497 = var15; // L: 81
		this.field4483 = var16; // L: 82
		this.field4499 = var17; // L: 83
		this.field4500 = var18; // L: 84
		this.field4501 = var19; // L: 85
		this.field4502 = var20; // L: 86
		this.field4503 = var21; // L: 87
		this.field4477 = var22; // L: 88
		this.field4505 = var23; // L: 89
		this.field4506 = var24; // L: 90
		this.field4507 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lpx;S)V",
		garbageValue = "12185"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field4493); // L: 96
		var1.writeByte(this.field4484 ? 1 : 0); // L: 97
		var1.writeShort(this.field4485); // L: 98
		var1.writeByte(this.field4486); // L: 99
		var1.writeByte(this.field4494); // L: 100
		var1.writeByte(this.field4488); // L: 101
		var1.writeByte(this.field4504); // L: 102
		var1.writeByte(this.field4490 ? 1 : 0); // L: 103
		var1.writeShort(this.field4491); // L: 104
		var1.writeByte(this.field4498); // L: 105
		var1.writeMedium(this.field4489); // L: 106
		var1.writeShort(this.field4487); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4495); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4496); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4497); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4483); // L: 111
		var1.writeByte(this.field4500); // L: 112
		var1.writeShort(this.field4499); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4503); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4477); // L: 115
		var1.writeByte(this.field4501); // L: 116
		var1.writeByte(this.field4502); // L: 117

		for (int var2 = 0; var2 < this.field4505.length; ++var2) { // L: 118
			var1.writeInt(this.field4505[var2]);
		}

		var1.writeInt(this.field4506); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4507); // L: 120
	} // L: 121

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1383471227"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		String var4 = this.field4495; // L: 127
		int var3 = var4.length() + 2; // L: 129
		int var23 = var1 + var3; // L: 131
		String var7 = this.field4496; // L: 134
		int var6 = var7.length() + 2; // L: 136
		var23 += var6; // L: 138
		String var10 = this.field4497; // L: 141
		int var9 = var10.length() + 2; // L: 143
		var23 += var9; // L: 145
		String var13 = this.field4483; // L: 148
		int var12 = var13.length() + 2; // L: 150
		var23 += var12; // L: 152
		String var16 = this.field4503; // L: 155
		int var15 = var16.length() + 2; // L: 157
		var23 += var15; // L: 159
		String var19 = this.field4477; // L: 162
		int var18 = var19.length() + 2; // L: 164
		var23 += var18; // L: 166
		String var22 = this.field4507; // L: 169
		int var21 = var22.length() + 2; // L: 171
		var23 += var21; // L: 173
		return var23; // L: 174
	}
}
