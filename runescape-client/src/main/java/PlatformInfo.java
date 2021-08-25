import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("qf")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -301713757
	)
	int field4088;
	@ObfuscatedName("ae")
	boolean field4072;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -111848783
	)
	int field4076;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 820690551
	)
	int field4074;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 116174243
	)
	int field4075;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1318161517
	)
	int field4065;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 980413449
	)
	int field4081;
	@ObfuscatedName("am")
	boolean field4078;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1922115909
	)
	int field4079;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 719297693
	)
	int field4080;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1688569519
	)
	int field4067;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -672091149
	)
	int field4082;
	@ObfuscatedName("ac")
	String field4083;
	@ObfuscatedName("ag")
	String field4084;
	@ObfuscatedName("ar")
	String field4085;
	@ObfuscatedName("az")
	String field4086;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1923916565
	)
	int field4087;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1684165867
	)
	int field4095;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -517088015
	)
	int field4089;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 2045048519
	)
	int field4071;
	@ObfuscatedName("bt")
	String field4091;
	@ObfuscatedName("bf")
	String field4096;
	@ObfuscatedName("bp")
	int[] field4064;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1427079985
	)
	int field4094;
	@ObfuscatedName("bc")
	String field4077;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4064 = new int[3];
		this.field4088 = var1;
		this.field4072 = var2;
		this.field4076 = var3;
		this.field4074 = var4;
		this.field4075 = var5;
		this.field4065 = var6;
		this.field4081 = var7;
		this.field4078 = var8;
		this.field4079 = var9;
		this.field4080 = var10;
		this.field4067 = var11;
		this.field4082 = var12;
		this.field4083 = var13;
		this.field4084 = var14;
		this.field4085 = var15;
		this.field4086 = var16;
		this.field4087 = var17;
		this.field4095 = var18;
		this.field4089 = var19;
		this.field4071 = var20;
		this.field4091 = var21;
		this.field4096 = var22;
		this.field4064 = var23;
		this.field4094 = var24;
		this.field4077 = var25;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "46"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field4088);
		var1.writeByte(this.field4072 ? 1 : 0);
		var1.writeShort(this.field4076);
		var1.writeByte(this.field4074);
		var1.writeByte(this.field4075);
		var1.writeByte(this.field4065);
		var1.writeByte(this.field4081);
		var1.writeByte(this.field4078 ? 1 : 0);
		var1.writeShort(this.field4079);
		var1.writeByte(this.field4080);
		var1.writeMedium(this.field4067);
		var1.writeShort(this.field4082);
		var1.writeStringCp1252NullCircumfixed(this.field4083);
		var1.writeStringCp1252NullCircumfixed(this.field4084);
		var1.writeStringCp1252NullCircumfixed(this.field4085);
		var1.writeStringCp1252NullCircumfixed(this.field4086);
		var1.writeByte(this.field4095);
		var1.writeShort(this.field4087);
		var1.writeStringCp1252NullCircumfixed(this.field4091);
		var1.writeStringCp1252NullCircumfixed(this.field4096);
		var1.writeByte(this.field4089);
		var1.writeByte(this.field4071);

		for (int var2 = 0; var2 < this.field4064.length; ++var2) {
			var1.writeInt(this.field4064[var2]);
		}

		var1.writeInt(this.field4094);
		var1.writeStringCp1252NullCircumfixed(this.field4077);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1850450729"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class262.method5002(this.field4083);
		var2 += class262.method5002(this.field4084);
		var2 += class262.method5002(this.field4085);
		var2 += class262.method5002(this.field4086);
		var2 += class262.method5002(this.field4091);
		var2 += class262.method5002(this.field4096);
		var2 += class262.method5002(this.field4077);
		return var2;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "100"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1464995775"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
