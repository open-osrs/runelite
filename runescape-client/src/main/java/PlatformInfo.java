import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -622798091
	)
	int field3950;
	@ObfuscatedName("ac")
	boolean field3964;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -598446107
	)
	int field3970;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 100950821
	)
	int field3956;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2569291
	)
	int field3959;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -345735103
	)
	int field3960;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1780669889
	)
	int field3957;
	@ObfuscatedName("aa")
	boolean field3962;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1651186511
	)
	int field3945;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1652125295
	)
	int field3975;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1267108745
	)
	int field3958;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -906951475
	)
	int field3966;
	@ObfuscatedName("ai")
	String field3967;
	@ObfuscatedName("al")
	String field3968;
	@ObfuscatedName("ay")
	String field3949;
	@ObfuscatedName("af")
	String field3969;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1702101169
	)
	int field3971;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 812667753
	)
	int field3961;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -92695857
	)
	int field3973;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 293448253
	)
	int field3952;
	@ObfuscatedName("by")
	String field3963;
	@ObfuscatedName("bs")
	String field3976;
	@ObfuscatedName("br")
	int[] field3977;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -497607943
	)
	int field3978;
	@ObfuscatedName("bx")
	String field3979;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3977 = new int[3];
		this.field3950 = var1;
		this.field3964 = var2;
		this.field3970 = var3;
		this.field3956 = var4;
		this.field3959 = var5;
		this.field3960 = var6;
		this.field3957 = var7;
		this.field3962 = var8;
		this.field3945 = var9;
		this.field3975 = var10;
		this.field3958 = var11;
		this.field3966 = var12;
		this.field3967 = var13;
		this.field3968 = var14;
		this.field3949 = var15;
		this.field3969 = var16;
		this.field3971 = var17;
		this.field3961 = var18;
		this.field3973 = var19;
		this.field3952 = var20;
		this.field3963 = var21;
		this.field3976 = var22;
		this.field3977 = var23;
		this.field3978 = var24;
		this.field3979 = var25;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "5"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8);
		var1.writeByte(this.field3950);
		var1.writeByte(this.field3964 ? 1 : 0);
		var1.writeShort(this.field3970);
		var1.writeByte(this.field3956);
		var1.writeByte(this.field3959);
		var1.writeByte(this.field3960);
		var1.writeByte(this.field3957);
		var1.writeByte(this.field3962 ? 1 : 0);
		var1.writeShort(this.field3945);
		var1.writeByte(this.field3975);
		var1.writeMedium(this.field3958);
		var1.writeShort(this.field3966);
		var1.writeStringCp1252NullCircumfixed(this.field3967);
		var1.writeStringCp1252NullCircumfixed(this.field3968);
		var1.writeStringCp1252NullCircumfixed(this.field3949);
		var1.writeStringCp1252NullCircumfixed(this.field3969);
		var1.writeByte(this.field3961);
		var1.writeShort(this.field3971);
		var1.writeStringCp1252NullCircumfixed(this.field3963);
		var1.writeStringCp1252NullCircumfixed(this.field3976);
		var1.writeByte(this.field3973);
		var1.writeByte(this.field3952);

		for (int var2 = 0; var2 < this.field3977.length; ++var2) {
			var1.writeInt(this.field3977[var2]);
		}

		var1.writeInt(this.field3978);
		var1.writeStringCp1252NullCircumfixed(this.field3979);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "68"
	)
	@Export("size")
	public int size() {
		byte var1 = 39;
		int var2 = var1 + SoundSystem.method2566(this.field3967);
		var2 += SoundSystem.method2566(this.field3968);
		var2 += SoundSystem.method2566(this.field3949);
		var2 += SoundSystem.method2566(this.field3969);
		var2 += SoundSystem.method2566(this.field3963);
		var2 += SoundSystem.method2566(this.field3976);
		var2 += SoundSystem.method2566(this.field3979);
		return var2;
	}
}
