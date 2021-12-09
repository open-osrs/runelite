import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public class class312 {
	@ObfuscatedName("c")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("p")
	int[] field3909;
	@ObfuscatedName("m")
	int[] field3910;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -895131131
	)
	int field3911;

	public class312() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field3909 = new int[2048]; // L: 12
		this.field3910 = new int[2048]; // L: 13
		this.field3911 = 0; // L: 14
		class111.field1348 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = class338.method6256((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F)); // L: 27
			class111.field1348[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < class111.field1348.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = class338.method6256((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class111.field1348.length; ++var1) { // L: 34 35
				class111.field1348[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	void method5803(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double var4 = (double)((float)var1 / 3.0F); // L: 46
		int var6 = var1 * 2 + 1; // L: 48
		double[] var7 = new double[var6]; // L: 49
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var20 = Canvas.method408((double)(var8 - 0) / var4) / var4; // L: 55
			var7[var9] = var20; // L: 57
			++var8; // L: 50
		}

		double[] var14 = var7; // L: 61
		double var15 = var7[var1] * var7[var1]; // L: 62
		int[] var17 = new int[var2 * var2]; // L: 63
		boolean var10 = false; // L: 64

		for (int var11 = 0; var11 < var2; ++var11) { // L: 65
			for (int var12 = 0; var12 < var2; ++var12) { // L: 66
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var11] * var14[var12] / var15)); // L: 67
				if (!var10 && var13 > 0) { // L: 68
					var10 = true; // L: 69
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2); // L: 73
		this.spriteMap.put(var1, var18); // L: 74
	} // L: 75

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Lpl;",
		garbageValue = "-904544036"
	)
	SpritePixels method5797(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 78
			this.method5803(var1); // L: 79
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 81
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	public final void method5806(int var1, int var2) {
		if (this.field3911 < this.field3909.length) { // L: 85
			this.field3909[this.field3911] = var1; // L: 86
			this.field3910[this.field3911] = var2; // L: 87
			++this.field3911; // L: 88
		}
	} // L: 89

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-82"
	)
	public final void method5795() {
		this.field3911 = 0; // L: 92
	} // L: 93

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IILpl;FB)V",
		garbageValue = "-56"
	)
	public final void method5800(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 96
		SpritePixels var6 = this.method5797(var5); // L: 97
		int var7 = var5 * 2 + 1; // L: 98
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 99
		Bounds var9 = new Bounds(0, 0); // L: 100
		this.bounds.setHigh(var7, var7); // L: 101
		System.nanoTime(); // L: 102

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field3911; ++var10) { // L: 103
			var11 = this.field3909[var10]; // L: 104
			var12 = this.field3910[var10]; // L: 105
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5; // L: 106
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5; // L: 107
			this.bounds.setLow(var13, var14); // L: 108
			this.bounds.method6578(var8, var9); // L: 109
			this.method5801(var6, var3, var9); // L: 110
		}

		System.nanoTime(); // L: 112
		System.nanoTime(); // L: 113

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 114
			if (var3.pixels[var10] == 0) { // L: 115
				var3.pixels[var10] = -16777216; // L: 116
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 119
				if (var11 <= 0) { // L: 120
					var3.pixels[var10] = -16777216; // L: 121
				} else {
					if (var11 > class111.field1348.length) { // L: 124
						var11 = class111.field1348.length;
					}

					var12 = class111.field1348[var11 - 1]; // L: 125
					var3.pixels[var10] = -16777216 | var12; // L: 126
				}
			}
		}

		System.nanoTime(); // L: 128
	} // L: 129

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;Lme;I)V",
		garbageValue = "-1046616793"
	)
	void method5801(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 132
			int var4 = 0; // L: 133
			int var5 = 0; // L: 134
			if (var3.lowX == 0) { // L: 135
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 136
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 137
			int var7 = var2.subWidth * var3.lowY + var3.lowX; // L: 138

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 139
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 140
					int[] var10000 = var2.pixels; // L: 141
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 143
				var7 += var2.subWidth - var3.highX; // L: 144
			}

		}
	} // L: 146

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "586952329"
	)
	static int method5810(int var0, Script var1, boolean var2) {
		if (var0 == 6900) { // L: 4325
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 4326
			return 1; // L: 4327
		} else if (var0 == 6950) { // L: 4329
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 4330
			return 1; // L: 4331
		} else {
			return 2; // L: 4333
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIS)V",
		garbageValue = "-25379"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) { // L: 4444
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) { // L: 4445
				SpriteMask var3 = var0.getSpriteMask(true); // L: 4446
				if (var3 == null) { // L: 4447
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1; // L: 4448
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2; // L: 4449
				if (var3.contains(var4, var5)) { // L: 4450
					var4 -= var3.width / 2; // L: 4451
					var5 -= var3.height / 2; // L: 4452
					int var6 = Client.camAngleY & 2047; // L: 4453
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6]; // L: 4454
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6]; // L: 4455
					int var9 = var8 * var4 + var5 * var7 >> 11; // L: 4456
					int var10 = var8 * var5 - var7 * var4 >> 11; // L: 4457
					int var11 = var9 + class340.localPlayer.x >> 7; // L: 4458
					int var12 = class340.localPlayer.y - var10 >> 7; // L: 4459
					PacketBufferNode var13 = HitSplatDefinition.getPacketBufferNode(ClientPacket.field2860, Client.packetWriter.isaacCipher); // L: 4461
					var13.packetBuffer.writeByte(18); // L: 4462
					var13.packetBuffer.writeByte(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 4463
					var13.packetBuffer.method7493(var12 + TileItem.baseY); // L: 4464
					var13.packetBuffer.method7349(var11 + class131.baseX); // L: 4465
					var13.packetBuffer.writeByte(var4); // L: 4466
					var13.packetBuffer.writeByte(var5); // L: 4467
					var13.packetBuffer.writeShort(Client.camAngleY); // L: 4468
					var13.packetBuffer.writeByte(57); // L: 4469
					var13.packetBuffer.writeByte(0); // L: 4470
					var13.packetBuffer.writeByte(0); // L: 4471
					var13.packetBuffer.writeByte(89); // L: 4472
					var13.packetBuffer.writeShort(class340.localPlayer.x); // L: 4473
					var13.packetBuffer.writeShort(class340.localPlayer.y); // L: 4474
					var13.packetBuffer.writeByte(63); // L: 4475
					Client.packetWriter.addNode(var13); // L: 4476
					Client.destinationX = var11; // L: 4477
					Client.destinationY = var12; // L: 4478
				}
			}

		}
	} // L: 4481
}
