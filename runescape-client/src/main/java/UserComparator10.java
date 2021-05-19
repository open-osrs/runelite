import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("soundEffectsArchive")
	static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "-1855689253"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lkr;IB)Lhm;",
		garbageValue = "16"
	)
	public static PacketBufferNode method2486(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2653, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2;
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) {
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) {
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10;
				var1 = var1.substring("glow2:".length()); // L: 114
			} else if (var6.startsWith("glow3:")) { // L: 116
				var7 = 11; // L: 117
				var1 = var1.substring("glow3:".length()); // L: 118
			}
		}

		var6 = var1.toLowerCase(); // L: 121
		byte var8 = 0; // L: 122
		if (var6.startsWith("wave:")) { // L: 123
			var8 = 1; // L: 124
			var1 = var1.substring("wave:".length()); // L: 125
		} else if (var6.startsWith("wave2:")) { // L: 127
			var8 = 2; // L: 128
			var1 = var1.substring("wave2:".length()); // L: 129
		} else if (var6.startsWith("shake:")) { // L: 131
			var8 = 3; // L: 132
			var1 = var1.substring("shake:".length()); // L: 133
		} else if (var6.startsWith("scroll:")) { // L: 135
			var8 = 4; // L: 136
			var1 = var1.substring("scroll:".length()); // L: 137
		} else if (var6.startsWith("slide:")) { // L: 139
			var8 = 5; // L: 140
			var1 = var1.substring("slide:".length()); // L: 141
		} else if (var2 != Language.Language_EN) { // L: 143
			if (var6.startsWith("wave:")) { // L: 144
				var8 = 1; // L: 145
				var1 = var1.substring("wave:".length()); // L: 146
			} else if (var6.startsWith("wave2:")) { // L: 148
				var8 = 2; // L: 149
				var1 = var1.substring("wave2:".length()); // L: 150
			} else if (var6.startsWith("shake:")) { // L: 152
				var8 = 3; // L: 153
				var1 = var1.substring("shake:".length()); // L: 154
			} else if (var6.startsWith("scroll:")) { // L: 156
				var8 = 4; // L: 157
				var1 = var1.substring("scroll:".length()); // L: 158
			} else if (var6.startsWith("slide:")) { // L: 160
				var8 = 5; // L: 161
				var1 = var1.substring("slide:".length()); // L: 162
			}
		}

		var4.packetBuffer.writeByte(var7); // L: 165
		var4.packetBuffer.writeByte(var8); // L: 166
		Occluder.method4089(var4.packetBuffer, var1); // L: 167
		if (var0 == class254.field3144.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkr;I)I",
		garbageValue = "-1915703478"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		byte var7 = 0; // L: 15
		byte var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = (char)var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = (char)var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			byte var11;
			if (var9 == 198) { // L: 35
				var11 = 69; // L: 36
			} else if (var9 == 230) { // L: 39
				var11 = 101; // L: 40
			} else if (var9 == 223) { // L: 43
				var11 = 115; // L: 44
			} else if (var9 == 338) { // L: 47
				var11 = 69; // L: 48
			} else if (var9 == 339) { // L: 51
				var11 = 101; // L: 52
			} else {
				var11 = 0; // L: 55
			}

			var7 = var11; // L: 57
			byte var12;
			if (var10 == 198) { // L: 60
				var12 = 69; // L: 61
			} else if (var10 == 230) { // L: 64
				var12 = 101; // L: 65
			} else if (var10 == 223) { // L: 68
				var12 = 115; // L: 69
			} else if (var10 == 338) { // L: 72
				var12 = 69; // L: 73
			} else if (var10 == 339) { // L: 76
				var12 = 101; // L: 77
			} else {
				var12 = 0; // L: 80
			}

			var8 = var12; // L: 82
			var9 = ParamComposition.standardizeChar(var9, var2); // L: 83
			var10 = ParamComposition.standardizeChar(var10, var2); // L: 84
			if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 85
				var9 = Character.toLowerCase(var9); // L: 86
				var10 = Character.toLowerCase(var10); // L: 87
				if (var9 != var10) { // L: 88
					return class26.lowercaseChar(var9, var2) - class26.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 91

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) { // L: 92
			if (var2 == Language.Language_FR) { // L: 93
				var5 = var3 - 1 - var17; // L: 94
				var6 = var4 - 1 - var17; // L: 95
			} else {
				var6 = var17; // L: 97
				var5 = var17;
			}

			char var18 = var0.charAt(var5); // L: 98
			var20 = var1.charAt(var6); // L: 99
			if (var20 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) { // L: 100
				var18 = Character.toLowerCase(var18); // L: 101
				var20 = Character.toLowerCase(var20); // L: 102
				if (var20 != var18) {
					return class26.lowercaseChar(var18, var2) - class26.lowercaseChar(var20, var2); // L: 103
				}
			}
		}

		var17 = var3 - var4; // L: 106
		if (var17 != 0) { // L: 107
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) { // L: 108
				var20 = var0.charAt(var19); // L: 109
				char var13 = var1.charAt(var19); // L: 110
				if (var13 != var20) { // L: 111
					return class26.lowercaseChar(var20, var2) - class26.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 113
		}
	}
}
