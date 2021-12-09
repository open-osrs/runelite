import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1901271563
	)
	@Export("osType")
	int osType;
	@ObfuscatedName("au")
	@Export("is64bit")
	boolean is64bit;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1729392719
	)
	@Export("osVersionType")
	int osVersionType;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1778133759
	)
	@Export("javaVendorType")
	int javaVendorType;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1484226765
	)
	@Export("javaVersionMajor")
	int javaVersionMajor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1891325743
	)
	@Export("javaVersionMinor")
	int javaVersionMinor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 859155677
	)
	@Export("javaVersionPatch")
	int javaVersionPatch;
	@ObfuscatedName("ar")
	boolean field4281;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1239922409
	)
	@Export("maxMemory")
	int maxMemory;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 657537983
	)
	@Export("availableProcessors")
	int availableProcessors;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1974722965
	)
	int field4284;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1148891367
	)
	int field4268;
	@ObfuscatedName("ai")
	String field4286;
	@ObfuscatedName("aq")
	String field4287;
	@ObfuscatedName("aw")
	String field4294;
	@ObfuscatedName("ay")
	String field4289;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1038767679
	)
	int field4274;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -757895191
	)
	int field4275;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -268917115
	)
	int field4292;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1908862077
	)
	int field4293;
	@ObfuscatedName("bd")
	String field4290;
	@ObfuscatedName("ba")
	String field4291;
	@ObfuscatedName("bq")
	int[] field4296;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1223421039
	)
	int field4285;
	@ObfuscatedName("br")
	String field4298;

	PlatformInfo(int osType, boolean is64bit, int osVersionType, int javaVendorType, int javaVersionMajor, int javaVersionMinor, int javaVersionPatch, boolean var8, int maxMemory, int availableProcessors, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field4296 = new int[3]; // L: 62
		this.osType = osType; // L: 67
		this.is64bit = is64bit; // L: 68
		this.osVersionType = osVersionType; // L: 69
		this.javaVendorType = javaVendorType; // L: 70
		this.javaVersionMajor = javaVersionMajor; // L: 71
		this.javaVersionMinor = javaVersionMinor; // L: 72
		this.javaVersionPatch = javaVersionPatch; // L: 73
		this.field4281 = var8; // L: 74
		this.maxMemory = maxMemory; // L: 75
		this.availableProcessors = availableProcessors; // L: 76
		this.field4284 = var11; // L: 77
		this.field4268 = var12; // L: 78
		this.field4286 = var13; // L: 79
		this.field4287 = var14; // L: 80
		this.field4294 = var15; // L: 81
		this.field4289 = var16; // L: 82
		this.field4274 = var17; // L: 83
		this.field4275 = var18; // L: 84
		this.field4292 = var19; // L: 85
		this.field4293 = var20; // L: 86
		this.field4290 = var21; // L: 87
		this.field4291 = var22; // L: 88
		this.field4296 = var23; // L: 89
		this.field4285 = var24; // L: 90
		this.field4298 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "-2015078153"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.osType); // L: 96
		var1.writeByte(this.is64bit ? 1 : 0); // L: 97
		var1.writeShort(this.osVersionType); // L: 98
		var1.writeByte(this.javaVendorType); // L: 99
		var1.writeByte(this.javaVersionMajor); // L: 100
		var1.writeByte(this.javaVersionMinor); // L: 101
		var1.writeByte(this.javaVersionPatch); // L: 102
		var1.writeByte(this.field4281 ? 1 : 0); // L: 103
		var1.writeShort(this.maxMemory); // L: 104
		var1.writeByte(this.availableProcessors); // L: 105
		var1.writeMedium(this.field4284); // L: 106
		var1.writeShort(this.field4268); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field4286); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field4287); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field4294); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field4289); // L: 111
		var1.writeByte(this.field4275); // L: 112
		var1.writeShort(this.field4274); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field4290); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field4291); // L: 115
		var1.writeByte(this.field4292); // L: 116
		var1.writeByte(this.field4293); // L: 117

		for (int var2 = 0; var2 < this.field4296.length; ++var2) { // L: 118
			var1.writeInt(this.field4296[var2]);
		}

		var1.writeInt(this.field4285); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field4298); // L: 120
	} // L: 121

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-722999470"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		String var4 = this.field4286; // L: 127
		int var3 = var4.length() + 2; // L: 129
		int var23 = var3 + var1; // L: 131
		String var7 = this.field4287; // L: 134
		int var6 = var7.length() + 2; // L: 136
		var23 += var6; // L: 138
		String var10 = this.field4294; // L: 141
		int var9 = var10.length() + 2; // L: 143
		var23 += var9; // L: 145
		String var13 = this.field4289; // L: 148
		int var12 = var13.length() + 2; // L: 150
		var23 += var12; // L: 152
		String var16 = this.field4290; // L: 155
		int var15 = var16.length() + 2; // L: 157
		var23 += var15; // L: 159
		String var19 = this.field4291; // L: 162
		int var18 = var19.length() + 2; // L: 164
		var23 += var18; // L: 166
		String var22 = this.field4298; // L: 169
		int var21 = var22.length() + 2; // L: 171
		var23 += var21; // L: 173
		return var23; // L: 174
	}
}
