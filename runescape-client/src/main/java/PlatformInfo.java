import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
@Implements("PlatformInfo")
public class PlatformInfo extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 815275653
	)
	int field3945;
	@ObfuscatedName("ak")
	boolean field3951;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1145818319
	)
	int field3952;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1017850713
	)
	int field3953;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1420360389
	)
	int field3956;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 522167755
	)
	int field3955;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1444442479
	)
	int field3967;
	@ObfuscatedName("aw")
	boolean field3957;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -881839919
	)
	int field3958;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1492819171
	)
	int field3959;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -612286533
	)
	int field3960;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 445372909
	)
	int field3962;
	@ObfuscatedName("ai")
	String field3972;
	@ObfuscatedName("ab")
	String field3963;
	@ObfuscatedName("au")
	String field3964;
	@ObfuscatedName("ad")
	String field3942;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -543314391
	)
	int field3966;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1469678885
	)
	int field3950;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -771005193
	)
	int field3968;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 2032975169
	)
	int field3961;
	@ObfuscatedName("bn")
	String field3970;
	@ObfuscatedName("bi")
	String field3971;
	@ObfuscatedName("bp")
	int[] field3948;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 988785623
	)
	int field3973;
	@ObfuscatedName("bq")
	String field3974;

	PlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25) {
		this.field3948 = new int[3]; // L: 62
		this.field3945 = var1; // L: 67
		this.field3951 = var2; // L: 68
		this.field3952 = var3; // L: 69
		this.field3953 = var4; // L: 70
		this.field3956 = var5; // L: 71
		this.field3955 = var6; // L: 72
		this.field3967 = var7; // L: 73
		this.field3957 = var8; // L: 74
		this.field3958 = var9; // L: 75
		this.field3959 = var10; // L: 76
		this.field3960 = var11; // L: 77
		this.field3962 = var12; // L: 78
		this.field3972 = var13; // L: 79
		this.field3963 = var14; // L: 80
		this.field3964 = var15; // L: 81
		this.field3942 = var16; // L: 82
		this.field3966 = var17; // L: 83
		this.field3950 = var18; // L: 84
		this.field3968 = var19; // L: 85
		this.field3961 = var20; // L: 86
		this.field3970 = var21; // L: 87
		this.field3971 = var22; // L: 88
		this.field3948 = var23; // L: 89
		this.field3973 = var24; // L: 90
		this.field3974 = var25; // L: 91
	} // L: 92

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V",
		garbageValue = "-1387696137"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(8); // L: 95
		var1.writeByte(this.field3945); // L: 96
		var1.writeByte(this.field3951 ? 1 : 0); // L: 97
		var1.writeShort(this.field3952); // L: 98
		var1.writeByte(this.field3953); // L: 99
		var1.writeByte(this.field3956); // L: 100
		var1.writeByte(this.field3955); // L: 101
		var1.writeByte(this.field3967); // L: 102
		var1.writeByte(this.field3957 ? 1 : 0); // L: 103
		var1.writeShort(this.field3958); // L: 104
		var1.writeByte(this.field3959); // L: 105
		var1.writeMedium(this.field3960); // L: 106
		var1.writeShort(this.field3962); // L: 107
		var1.writeStringCp1252NullCircumfixed(this.field3972); // L: 108
		var1.writeStringCp1252NullCircumfixed(this.field3963); // L: 109
		var1.writeStringCp1252NullCircumfixed(this.field3964); // L: 110
		var1.writeStringCp1252NullCircumfixed(this.field3942); // L: 111
		var1.writeByte(this.field3950); // L: 112
		var1.writeShort(this.field3966); // L: 113
		var1.writeStringCp1252NullCircumfixed(this.field3970); // L: 114
		var1.writeStringCp1252NullCircumfixed(this.field3971); // L: 115
		var1.writeByte(this.field3968); // L: 116
		var1.writeByte(this.field3961); // L: 117

		for (int var2 = 0; var2 < this.field3948.length; ++var2) { // L: 118
			var1.writeInt(this.field3948[var2]);
		}

		var1.writeInt(this.field3973); // L: 119
		var1.writeStringCp1252NullCircumfixed(this.field3974); // L: 120
	} // L: 121

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-90"
	)
	@Export("size")
	public int size() {
		byte var1 = 39; // L: 124
		int var11 = var1 + ApproximateRouteStrategy.method1314(this.field3972); // L: 125
		var11 += ApproximateRouteStrategy.method1314(this.field3963); // L: 126
		var11 += ApproximateRouteStrategy.method1314(this.field3964); // L: 127
		var11 += ApproximateRouteStrategy.method1314(this.field3942); // L: 128
		String var4 = this.field3970; // L: 131
		int var3 = var4.length() + 2; // L: 133
		var11 += var3; // L: 135
		String var7 = this.field3971; // L: 138
		int var6 = var7.length() + 2; // L: 140
		var11 += var6; // L: 142
		String var10 = this.field3974; // L: 145
		int var9 = var10.length() + 2; // L: 147
		var11 += var9; // L: 149
		return var11; // L: 150
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-1"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32
}
