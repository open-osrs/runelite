import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class PlatformInfo extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1124416131
	)
	int field3946;
	@ObfuscatedName("au")
	boolean field3947;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2075791329
	)
	int field3966;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1751132195
	)
	int field3949;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1214639501
	)
	int field3950;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -118237247
	)
	int field3951;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -392627061
	)
	int field3942;
	@ObfuscatedName("ah")
	boolean field3953;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 41619559
	)
	int field3957;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1839522133
	)
	int field3948;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1827610411
	)
	int field3956;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 773398051
	)
	int field3959;
	@ObfuscatedName("ai")
	String field3958;
	@ObfuscatedName("ay")
	String field3960;
	@ObfuscatedName("aj")
	String field3937;
	@ObfuscatedName("aw")
	String field3961;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1592928573
	)
	int field3962;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 325841347
	)
	int field3963;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -865607359
	)
	int field3964;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1202183243
	)
	int field3965;
	@ObfuscatedName("bc")
	String field3941;
	@ObfuscatedName("bz")
	String field3967;
	@ObfuscatedName("bj")
	int[] field3968;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1188578061
	)
	int field3969;
	@ObfuscatedName("bi")
	String field3970;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3968 = new int[3]; // L: 62
		this.field3946 = var1; // L: 67
		this.field3947 = var2; // L: 68
		this.field3966 = var3; // L: 69
		this.field3949 = var4; // L: 70
		this.field3950 = var5; // L: 71
		this.field3951 = var6; // L: 72
		this.field3942 = var7; // L: 73
		this.field3953 = var8; // L: 74
		this.field3957 = var9; // L: 75
		this.field3948 = var10; // L: 76
		this.field3956 = var11; // L: 77
		this.field3959 = var12; // L: 78
		this.field3958 = var13; // L: 79
		this.field3960 = var14; // L: 80
		this.field3937 = var15; // L: 81
		this.field3961 = var16; // L: 82
		this.field3962 = var17; // L: 83
		this.field3963 = var18; // L: 84
		this.field3964 = var19; // L: 85
		this.field3965 = var20; // L: 86
		this.field3941 = var21; // L: 87
		this.field3967 = var22; // L: 88
		this.field3968 = var23; // L: 89
		this.field3969 = var24; // L: 90
		this.field3970 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "34"
	)
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field3946); // L: 96
		var1.writeByte(this.field3947 ? 1 : 0); // L: 97
		var1.writeShort(this.field3966); // L: 98
		var1.writeByte(this.field3949); // L: 99
		var1.writeByte(this.field3950); // L: 100
		var1.writeByte(this.field3951); // L: 101
		var1.writeByte(this.field3942); // L: 102
		var1.writeByte(this.field3953 ? 1 : 0); // L: 103
		var1.writeShort(this.field3957); // L: 104
		var1.writeByte(this.field3948); // L: 105
		var1.writeMedium(this.field3956); // L: 106
		var1.writeShort(this.field3959);
		var1.writeStringCp1252NullCircumfixed(this.field3958);
		var1.writeStringCp1252NullCircumfixed(this.field3960);
		var1.writeStringCp1252NullCircumfixed(this.field3937);
		var1.writeStringCp1252NullCircumfixed(this.field3961);
		var1.writeByte(this.field3963);
		var1.writeShort(this.field3962);
		var1.writeStringCp1252NullCircumfixed(this.field3941);
		var1.writeStringCp1252NullCircumfixed(this.field3967);
		var1.writeByte(this.field3964);
		var1.writeByte(this.field3965);

		for (int var2 = 0; var2 < this.field3968.length; ++var2) { // L: 118
			var1.writeInt(this.field3968[var2]);
		}

		var1.writeInt(this.field3969);
		var1.writeStringCp1252NullCircumfixed(this.field3970);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-202992024"
	)
	public int size() {
		byte var1 = 39;
		int var2 = var1 + class228.method4189(this.field3958);
		var2 += class228.method4189(this.field3960);
		var2 += class228.method4189(this.field3937);
		var2 += class228.method4189(this.field3961);
		var2 += class228.method4189(this.field3941);
		var2 += class228.method4189(this.field3967); // L: 130
		var2 += class228.method4189(this.field3970);
		return var2;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	static final void method6411() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 107
			int var0 = Scene.Scene_cameraPitchSine; // L: 108
			int var1 = Scene.Scene_cameraPitchCosine; // L: 109
			int var2 = Scene.Scene_cameraYawSine; // L: 110
			int var3 = Scene.Scene_cameraYawCosine; // L: 111
			byte var4 = 50; // L: 112
			short var5 = 3500; // L: 113
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 114
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 115
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 116
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 117
			int var10 = Rasterizer3D.method3132(var7, var4, var1, var0); // L: 119
			int var11 = Rasterizer3D.method3124(var7, var4, var1, var0); // L: 120
			var7 = var10; // L: 121
			var10 = Rasterizer3D.method3132(var9, var5, var1, var0); // L: 122
			int var12 = Rasterizer3D.method3124(var9, var5, var1, var0); // L: 123
			var9 = var10; // L: 124
			var10 = Rasterizer3D.method3131(var6, var11, var3, var2); // L: 125
			var11 = Rasterizer3D.method3111(var6, var11, var3, var2); // L: 126
			var6 = var10; // L: 127
			var10 = Rasterizer3D.method3131(var8, var12, var3, var2); // L: 128
			var12 = Rasterizer3D.method3111(var8, var12, var3, var2); // L: 129
			ViewportMouse.field1768 = (var6 + var10) / 2; // L: 131
			class217.field2537 = (var7 + var9) / 2; // L: 132
			ViewportMouse.field1769 = (var11 + var12) / 2; // L: 133
			SpriteMask.field2552 = (var10 - var6) / 2; // L: 134
			WorldMapSectionType.field178 = (var9 - var7) / 2; // L: 135
			ViewportMouse.field1770 = (var12 - var11) / 2; // L: 136
			class3.field25 = Math.abs(SpriteMask.field2552); // L: 137
			class234.field3100 = Math.abs(WorldMapSectionType.field178); // L: 138
			ViewportMouse.field1771 = Math.abs(ViewportMouse.field1770); // L: 139
		}
	} // L: 140
}
