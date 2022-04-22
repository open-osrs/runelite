import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 359254147
	)
	int field4422;
	@ObfuscatedName("al")
	boolean field4423;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1214181177
	)
	int field4429;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2123313943
	)
	int field4425;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -293463653
	)
	int field4433;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -290319841
	)
	int field4440;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 114996927
	)
	int field4428;
	@ObfuscatedName("ah")
	boolean field4426;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1292539811
	)
	int field4430;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -598233409
	)
	int field4431;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2084134641
	)
	int field4417;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 200679177
	)
	int field4436;
	@ObfuscatedName("ai")
	String field4434;
	@ObfuscatedName("ax")
	String field4435;
	@ObfuscatedName("ar")
	String field4444;
	@ObfuscatedName("ap")
	String field4437;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 800300679
	)
	int field4420;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -562728499
	)
	int field4439;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2035566047
	)
	int field4446;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -995431815
	)
	int field4441;
	@ObfuscatedName("bm")
	String field4427;
	@ObfuscatedName("br")
	String field4443;
	@ObfuscatedName("bo")
	int[] field4442;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -123804323
	)
	int field4424;
	@ObfuscatedName("be")
	String field4432;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4442 = new int[3]; // L: 62
		this.field4422 = var1; // L: 67
		this.field4423 = var2; // L: 68
		this.field4429 = var3; // L: 69
		this.field4425 = var4; // L: 70
		this.field4433 = var5; // L: 71
		this.field4440 = var6; // L: 72
		this.field4428 = var7; // L: 73
		this.field4426 = var8; // L: 74
		this.field4430 = var9; // L: 75
		this.field4431 = var10; // L: 76
		this.field4417 = var11; // L: 77
		this.field4436 = var12; // L: 78
		this.field4434 = var13; // L: 79
		this.field4435 = var14; // L: 80
		this.field4444 = var15; // L: 81
		this.field4437 = var16; // L: 82
		this.field4420 = var17; // L: 83
		this.field4439 = var18; // L: 84
		this.field4446 = var19; // L: 85
		this.field4441 = var20; // L: 86
		this.field4427 = var21; // L: 87
		this.field4443 = var22; // L: 88
		this.field4442 = var23; // L: 89
		this.field4424 = var24; // L: 90
		this.field4432 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "1752573389"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field4422); // L: 96
		var1.writeByte(this.field4423 ? 1 : 0); // L: 97
		var1.writeShort(this.field4429); // L: 98
		var1.writeByte(this.field4425); // L: 99
		var1.writeByte(this.field4433); // L: 100
		var1.writeByte(this.field4440); // L: 101
		var1.writeByte(this.field4428); // L: 102
		var1.writeByte(this.field4426 ? 1 : 0); // L: 103
		var1.writeShort(this.field4430); // L: 104
		var1.writeByte(this.field4431); // L: 105
		var1.writeMedium(this.field4417); // L: 106
		var1.writeShort(this.field4436); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4434); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4435); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4444); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4437); // L: 111
		var1.writeByte(this.field4439); // L: 112
		var1.writeShort(this.field4420); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4427); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4443); // L: 115
		var1.writeByte(this.field4446); // L: 116
		var1.writeByte(this.field4441); // L: 117

		for (int var2 = 0; var2 < this.field4442.length; ++var2) { // L: 118
			var1.writeInt(this.field4442[var2]);
		}

		var1.writeInt(this.field4424); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4432); // L: 120
	} // L: 121

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1283677650"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		String var4 = this.field4434; // L: 127
		int var3 = var4.length() + 2; // L: 129
		int var23 = var3 + var1; // L: 131
		String var7 = this.field4435; // L: 134
		int var6 = var7.length() + 2; // L: 136
		var23 += var6; // L: 138
		String var10 = this.field4444; // L: 141
		int var9 = var10.length() + 2; // L: 143
		var23 += var9; // L: 145
		String var13 = this.field4437; // L: 148
		int var12 = var13.length() + 2; // L: 150
		var23 += var12; // L: 152
		String var16 = this.field4427; // L: 155
		int var15 = var16.length() + 2; // L: 157
		var23 += var15; // L: 159
		String var19 = this.field4443; // L: 162
		int var18 = var19.length() + 2; // L: 164
		var23 += var18; // L: 166
		String var22 = this.field4432; // L: 169
		int var21 = var22.length() + 2; // L: 171
		var23 += var21; // L: 173
		return var23; // L: 174
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lbb;B)V",
		garbageValue = "-99"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1823
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1824
			ClanSettings.method3033(var0.isMembersOnly()); // L: 1825
		}

		if (var0.properties != Client.worldProperties) { // L: 1827
			class260.method5174(class145.archive8, var0.properties); // L: 1828
		}

		class17.worldHost = var0.host; // L: 1830
		Client.worldId = var0.id; // L: 1831
		Client.worldProperties = var0.properties; // L: 1832
		SecureRandomFuture.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1833
		UserComparator9.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1834
		class329.currentPort = SecureRandomFuture.worldPort; // L: 1835
	} // L: 1836
}
