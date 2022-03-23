import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 857425217
	)
	int field4433;
	@ObfuscatedName("ae")
	boolean field4431;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2119911943
	)
	int field4428;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -712766327
	)
	int field4448;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2135911943
	)
	int field4430;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1474931891
	)
	int field4443;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1685554017
	)
	int field4432;
	@ObfuscatedName("ao")
	boolean field4442;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1843869685
	)
	int field4418;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 464330657
	)
	int field4435;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1641777413
	)
	int field4436;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 475952813
	)
	int field4437;
	@ObfuscatedName("al")
	String field4438;
	@ObfuscatedName("ak")
	String field4439;
	@ObfuscatedName("az")
	String field4440;
	@ObfuscatedName("ag")
	String field4441;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 381879925
	)
	int field4427;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -409359365
	)
	int field4434;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -317460353
	)
	int field4444;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1030786911
	)
	int field4445;
	@ObfuscatedName("bz")
	String field4426;
	@ObfuscatedName("bl")
	String field4447;
	@ObfuscatedName("be")
	int[] field4446;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1178087619
	)
	int field4449;
	@ObfuscatedName("ba")
	String field4450;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4446 = new int[3]; // L: 62
		this.field4433 = var1; // L: 67
		this.field4431 = var2; // L: 68
		this.field4428 = var3; // L: 69
		this.field4448 = var4; // L: 70
		this.field4430 = var5; // L: 71
		this.field4443 = var6; // L: 72
		this.field4432 = var7; // L: 73
		this.field4442 = var8; // L: 74
		this.field4418 = var9; // L: 75
		this.field4435 = var10; // L: 76
		this.field4436 = var11; // L: 77
		this.field4437 = var12; // L: 78
		this.field4438 = var13; // L: 79
		this.field4439 = var14; // L: 80
		this.field4440 = var15; // L: 81
		this.field4441 = var16; // L: 82
		this.field4427 = var17; // L: 83
		this.field4434 = var18; // L: 84
		this.field4444 = var19; // L: 85
		this.field4445 = var20; // L: 86
		this.field4426 = var21; // L: 87
		this.field4447 = var22; // L: 88
		this.field4446 = var23; // L: 89
		this.field4449 = var24; // L: 90
		this.field4450 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpd;B)V",
		garbageValue = "1"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field4433); // L: 96
		var1.writeByte(this.field4431 ? 1 : 0); // L: 97
		var1.writeShort(this.field4428); // L: 98
		var1.writeByte(this.field4448); // L: 99
		var1.writeByte(this.field4430); // L: 100
		var1.writeByte(this.field4443); // L: 101
		var1.writeByte(this.field4432); // L: 102
		var1.writeByte(this.field4442 ? 1 : 0); // L: 103
		var1.writeShort(this.field4418); // L: 104
		var1.writeByte(this.field4435); // L: 105
		var1.writeMedium(this.field4436); // L: 106
		var1.writeShort(this.field4437); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4438); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4439); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4440); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4441); // L: 111
		var1.writeByte(this.field4434); // L: 112
		var1.writeShort(this.field4427); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4426); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4447); // L: 115
		var1.writeByte(this.field4444); // L: 116
		var1.writeByte(this.field4445); // L: 117

		for (int var2 = 0; var2 < this.field4446.length; ++var2) { // L: 118
			var1.writeInt(this.field4446[var2]);
		}

		var1.writeInt(this.field4449); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4450); // L: 120
	} // L: 121

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1632205942"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		String var4 = this.field4438; // L: 127
		int var3 = var4.length() + 2; // L: 129
		int var23 = var1 + var3; // L: 131
		String var7 = this.field4439; // L: 134
		int var6 = var7.length() + 2; // L: 136
		var23 += var6; // L: 138
		String var10 = this.field4440; // L: 141
		int var9 = var10.length() + 2; // L: 143
		var23 += var9; // L: 145
		String var13 = this.field4441; // L: 148
		int var12 = var13.length() + 2; // L: 150
		var23 += var12; // L: 152
		String var16 = this.field4426; // L: 155
		int var15 = var16.length() + 2; // L: 157
		var23 += var15; // L: 159
		String var19 = this.field4447; // L: 162
		int var18 = var19.length() + 2; // L: 164
		var23 += var18; // L: 166
		String var22 = this.field4450; // L: 169
		int var21 = var22.length() + 2; // L: 171
		var23 += var21; // L: 173
		return var23; // L: 174
	}
}
