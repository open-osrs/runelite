import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 372314029
	)
	int field3958;
	@ObfuscatedName("am")
	boolean field3932;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 146044699
	)
	int field3937;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1561853885
	)
	int field3938;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 139773765
	)
	int field3939;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2088982113
	)
	int field3940;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 174880953
	)
	int field3941;
	@ObfuscatedName("al")
	boolean field3942;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 48276617
	)
	int field3959;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1247220209
	)
	int field3949;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -609367375
	)
	int field3945;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1576577653
	)
	int field3946;
	@ObfuscatedName("aa")
	String field3947;
	@ObfuscatedName("aw")
	String field3948;
	@ObfuscatedName("az")
	String field3953;
	@ObfuscatedName("aq")
	String field3950;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -229581371
	)
	int field3951;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 968666789
	)
	int field3952;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1359786411
	)
	int field3955;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 401731303
	)
	int field3954;
	@ObfuscatedName("bh")
	String field3943;
	@ObfuscatedName("bg")
	String field3936;
	@ObfuscatedName("be")
	int[] field3957;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1085036985
	)
	int field3944;
	@ObfuscatedName("ba")
	String field3934;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3957 = new int[3];
		this.field3958 = var1;
		this.field3932 = var2;
		this.field3937 = var3;
		this.field3938 = var4;
		this.field3939 = var5;
		this.field3940 = var6;
		this.field3941 = var7;
		this.field3942 = var8;
		this.field3959 = var9;
		this.field3949 = var10;
		this.field3945 = var11;
		this.field3946 = var12;
		this.field3947 = var13;
		this.field3948 = var14;
		this.field3953 = var15;
		this.field3950 = var16;
		this.field3951 = var17;
		this.field3952 = var18;
		this.field3955 = var19;
		this.field3954 = var20;
		this.field3943 = var21;
		this.field3936 = var22;
		this.field3957 = var23;
		this.field3944 = var24;
		this.field3934 = var25;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lkn;I)V",
		garbageValue = "972520847"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3958);
		var1.writeByte(this.field3932 ? 1 : 0);
		var1.writeShort(this.field3937);
		var1.writeByte(this.field3938);
		var1.writeByte(this.field3939);
		var1.writeByte(this.field3940);
		var1.writeByte(this.field3941);
		var1.writeByte(this.field3942 ? 1 : 0);
		var1.writeShort(this.field3959);
		var1.writeByte(this.field3949);
		var1.writeMedium(this.field3945);
		var1.writeShort(this.field3946);
		var1.writeStringCp1252NullCircumfixed(this.field3947);
		var1.writeStringCp1252NullCircumfixed(this.field3948);
		var1.writeStringCp1252NullCircumfixed(this.field3953);
		var1.writeStringCp1252NullCircumfixed(this.field3950);
		var1.writeByte(this.field3952);
		var1.writeShort(this.field3951);
		var1.writeStringCp1252NullCircumfixed(this.field3943);
		var1.writeStringCp1252NullCircumfixed(this.field3936);
		var1.writeByte(this.field3955);
		var1.writeByte(this.field3954);

		for (int var2 = 0; var2 < this.field3957.length; ++var2) {
			var1.writeInt(this.field3957[var2]);
		}

		var1.writeInt(this.field3944);
		var1.writeStringCp1252NullCircumfixed(this.field3934);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1553987970"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + TextureProvider.method2873(this.field3947);
		var2 += TextureProvider.method2873(this.field3948);
		var2 += TextureProvider.method2873(this.field3953);
		var2 += TextureProvider.method2873(this.field3950);
		var2 += TextureProvider.method2873(this.field3943);
		var2 += TextureProvider.method2873(this.field3936);
		var2 += TextureProvider.method2873(this.field3934);
		return var2;
	}
}
