import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class388 {
	@ObfuscatedName("v")
	float field4359;
	@ObfuscatedName("o")
	float field4350;
	@ObfuscatedName("h")
	float field4351;
	@ObfuscatedName("g")
	float field4352;
	@ObfuscatedName("l")
	float field4353;
	@ObfuscatedName("n")
	float field4357;
	@ObfuscatedName("d")
	float field4355;
	@ObfuscatedName("f")
	float field4349;
	@ObfuscatedName("u")
	float field4356;
	@ObfuscatedName("r")
	float field4358;
	@ObfuscatedName("k")
	float field4354;
	@ObfuscatedName("x")
	float field4360;

	static {
		new class388();
	} // L: 6

	class388() {
		this.method7127();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1625527457"
	)
	void method7127() {
		this.field4360 = 0.0F; // L: 26
		this.field4354 = 0.0F;
		this.field4358 = 0.0F;
		this.field4349 = 0.0F;
		this.field4355 = 0.0F; // L: 30
		this.field4357 = 0.0F;
		this.field4352 = 0.0F;
		this.field4351 = 0.0F;
		this.field4350 = 0.0F; // L: 34
		this.field4356 = 1.0F;
		this.field4353 = 1.0F;
		this.field4359 = 1.0F;
	} // L: 38

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-465113031"
	)
	void method7128(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4350;
		float var5 = this.field4353;
		float var6 = this.field4349;
		float var7 = this.field4354; // L: 46
		this.field4350 = var2 * var4 - var3 * this.field4351;
		this.field4351 = var2 * this.field4351 + var4 * var3;
		this.field4353 = var2 * var5 - var3 * this.field4357;
		this.field4357 = var5 * var3 + var2 * this.field4357; // L: 50
		this.field4349 = var6 * var2 - var3 * this.field4356;
		this.field4356 = var3 * var6 + this.field4356 * var2;
		this.field4354 = var2 * var7 - this.field4360 * var3;
		this.field4360 = var2 * this.field4360 + var7 * var3; // L: 54
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1919823756"
	)
	void method7129(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4359;
		float var5 = this.field4352;
		float var6 = this.field4355; // L: 62
		float var7 = this.field4358;
		this.field4359 = var2 * var4 + var3 * this.field4351;
		this.field4351 = var2 * this.field4351 - var4 * var3;
		this.field4352 = this.field4357 * var3 + var2 * var5; // L: 66
		this.field4357 = this.field4357 * var2 - var3 * var5;
		this.field4355 = this.field4356 * var3 + var2 * var6;
		this.field4356 = this.field4356 * var2 - var6 * var3;
		this.field4358 = var7 * var2 + this.field4360 * var3; // L: 70
		this.field4360 = this.field4360 * var2 - var7 * var3;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1580684401"
	)
	void method7139(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4359;
		float var5 = this.field4352;
		float var6 = this.field4355; // L: 79
		float var7 = this.field4358;
		this.field4359 = var2 * var4 - var3 * this.field4350;
		this.field4350 = var2 * this.field4350 + var3 * var4;
		this.field4352 = var2 * var5 - this.field4353 * var3; // L: 83
		this.field4353 = this.field4353 * var2 + var3 * var5;
		this.field4355 = var6 * var2 - var3 * this.field4349;
		this.field4349 = this.field4349 * var2 + var6 * var3;
		this.field4358 = var7 * var2 - var3 * this.field4354; // L: 87
		this.field4354 = var2 * this.field4354 + var3 * var7;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FFFS)V",
		garbageValue = "3240"
	)
	void method7131(float var1, float var2, float var3) {
		this.field4358 += var1;
		this.field4354 += var2;
		this.field4360 += var3;
	} // L: 95

	public String toString() {
		return this.field4359 + "," + this.field4352 + "," + this.field4355 + "," + this.field4358 + "\n" + this.field4350 + "," + this.field4353 + "," + this.field4349 + "," + this.field4354 + "\n" + this.field4351 + "," + this.field4357 + "," + this.field4356 + "," + this.field4360; // L: 99
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Llp;II)Ljt;",
		garbageValue = "1639475928"
	)
	public static PacketBufferNode method7151(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ItemContainer.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher); // L: 17
		var4.packetBuffer.writeByte(0); // L: 18
		int var5 = var4.packetBuffer.offset; // L: 19
		var4.packetBuffer.writeByte(var0); // L: 20
		String var6 = var1.toLowerCase(); // L: 21
		byte var7 = 0; // L: 22
		if (var6.startsWith("yellow:")) { // L: 23
			var7 = 0; // L: 24
			var1 = var1.substring("yellow:".length()); // L: 25
		} else if (var6.startsWith("red:")) { // L: 27
			var7 = 1; // L: 28
			var1 = var1.substring("red:".length()); // L: 29
		} else if (var6.startsWith("green:")) { // L: 31
			var7 = 2; // L: 32
			var1 = var1.substring("green:".length()); // L: 33
		} else if (var6.startsWith("cyan:")) { // L: 35
			var7 = 3; // L: 36
			var1 = var1.substring("cyan:".length()); // L: 37
		} else if (var6.startsWith("purple:")) { // L: 39
			var7 = 4; // L: 40
			var1 = var1.substring("purple:".length()); // L: 41
		} else if (var6.startsWith("white:")) { // L: 43
			var7 = 5; // L: 44
			var1 = var1.substring("white:".length()); // L: 45
		} else if (var6.startsWith("flash1:")) { // L: 47
			var7 = 6; // L: 48
			var1 = var1.substring("flash1:".length()); // L: 49
		} else if (var6.startsWith("flash2:")) { // L: 51
			var7 = 7; // L: 52
			var1 = var1.substring("flash2:".length()); // L: 53
		} else if (var6.startsWith("flash3:")) { // L: 55
			var7 = 8; // L: 56
			var1 = var1.substring("flash3:".length()); // L: 57
		} else if (var6.startsWith("glow1:")) { // L: 59
			var7 = 9; // L: 60
			var1 = var1.substring("glow1:".length()); // L: 61
		} else if (var6.startsWith("glow2:")) { // L: 63
			var7 = 10; // L: 64
			var1 = var1.substring("glow2:".length()); // L: 65
		} else if (var6.startsWith("glow3:")) { // L: 67
			var7 = 11; // L: 68
			var1 = var1.substring("glow3:".length()); // L: 69
		} else if (var2 != Language.Language_EN) { // L: 71
			if (var6.startsWith("yellow:")) { // L: 72
				var7 = 0; // L: 73
				var1 = var1.substring("yellow:".length()); // L: 74
			} else if (var6.startsWith("red:")) { // L: 76
				var7 = 1; // L: 77
				var1 = var1.substring("red:".length()); // L: 78
			} else if (var6.startsWith("green:")) { // L: 80
				var7 = 2; // L: 81
				var1 = var1.substring("green:".length()); // L: 82
			} else if (var6.startsWith("cyan:")) { // L: 84
				var7 = 3; // L: 85
				var1 = var1.substring("cyan:".length()); // L: 86
			} else if (var6.startsWith("purple:")) { // L: 88
				var7 = 4; // L: 89
				var1 = var1.substring("purple:".length()); // L: 90
			} else if (var6.startsWith("white:")) { // L: 92
				var7 = 5; // L: 93
				var1 = var1.substring("white:".length()); // L: 94
			} else if (var6.startsWith("flash1:")) { // L: 96
				var7 = 6; // L: 97
				var1 = var1.substring("flash1:".length()); // L: 98
			} else if (var6.startsWith("flash2:")) { // L: 100
				var7 = 7; // L: 101
				var1 = var1.substring("flash2:".length()); // L: 102
			} else if (var6.startsWith("flash3:")) { // L: 104
				var7 = 8; // L: 105
				var1 = var1.substring("flash3:".length()); // L: 106
			} else if (var6.startsWith("glow1:")) { // L: 108
				var7 = 9; // L: 109
				var1 = var1.substring("glow1:".length()); // L: 110
			} else if (var6.startsWith("glow2:")) { // L: 112
				var7 = 10; // L: 113
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
		WorldMapIcon_0.method4900(var4.packetBuffer, var1); // L: 167
		if (var0 == class296.field3502.rsOrdinal()) { // L: 168
			var4.packetBuffer.writeByte(var3); // L: 169
		}

		var4.packetBuffer.method7756(var4.packetBuffer.offset - var5); // L: 171
		return var4; // L: 172
	}
}
