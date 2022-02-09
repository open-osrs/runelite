import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class372 {
	@ObfuscatedName("c")
	float field4256;
	@ObfuscatedName("l")
	float field4253;
	@ObfuscatedName("s")
	float field4247;
	@ObfuscatedName("e")
	float field4248;
	@ObfuscatedName("r")
	float field4245;
	@ObfuscatedName("o")
	float field4249;
	@ObfuscatedName("i")
	float field4251;
	@ObfuscatedName("w")
	float field4252;
	@ObfuscatedName("v")
	float field4254;
	@ObfuscatedName("a")
	float field4250;
	@ObfuscatedName("y")
	float field4255;
	@ObfuscatedName("u")
	float field4246;

	static {
		new class372();
	} // L: 6

	class372() {
		this.method6738(); // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1422082779"
	)
	void method6738() {
		this.field4246 = 0.0F; // L: 26
		this.field4255 = 0.0F; // L: 27
		this.field4250 = 0.0F; // L: 28
		this.field4252 = 0.0F; // L: 29
		this.field4251 = 0.0F; // L: 30
		this.field4249 = 0.0F; // L: 31
		this.field4248 = 0.0F; // L: 32
		this.field4247 = 0.0F; // L: 33
		this.field4253 = 0.0F; // L: 34
		this.field4254 = 1.0F; // L: 35
		this.field4245 = 1.0F; // L: 36
		this.field4256 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1946927400"
	)
	void method6746(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4253; // L: 43
		float var5 = this.field4245; // L: 44
		float var6 = this.field4252; // L: 45
		float var7 = this.field4255; // L: 46
		this.field4253 = var4 * var2 - var3 * this.field4247; // L: 47
		this.field4247 = var4 * var3 + var2 * this.field4247; // L: 48
		this.field4245 = var5 * var2 - this.field4249 * var3; // L: 49
		this.field4249 = var3 * var5 + var2 * this.field4249; // L: 50
		this.field4252 = var6 * var2 - this.field4254 * var3; // L: 51
		this.field4254 = var2 * this.field4254 + var6 * var3; // L: 52
		this.field4255 = var2 * var7 - this.field4246 * var3; // L: 53
		this.field4246 = var3 * var7 + this.field4246 * var2; // L: 54
	} // L: 55

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "2"
	)
	void method6740(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4256; // L: 60
		float var5 = this.field4248; // L: 61
		float var6 = this.field4251; // L: 62
		float var7 = this.field4250; // L: 63
		this.field4256 = var2 * var4 + var3 * this.field4247; // L: 64
		this.field4247 = var2 * this.field4247 - var4 * var3; // L: 65
		this.field4248 = var5 * var2 + var3 * this.field4249; // L: 66
		this.field4249 = this.field4249 * var2 - var5 * var3; // L: 67
		this.field4251 = var2 * var6 + var3 * this.field4254; // L: 68
		this.field4254 = this.field4254 * var2 - var3 * var6; // L: 69
		this.field4250 = var2 * var7 + this.field4246 * var3; // L: 70
		this.field4246 = this.field4246 * var2 - var7 * var3; // L: 71
	} // L: 72

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "255"
	)
	void method6741(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4256; // L: 77
		float var5 = this.field4248; // L: 78
		float var6 = this.field4251; // L: 79
		float var7 = this.field4250; // L: 80
		this.field4256 = var2 * var4 - var3 * this.field4253; // L: 81
		this.field4253 = var3 * var4 + var2 * this.field4253; // L: 82
		this.field4248 = var2 * var5 - var3 * this.field4245; // L: 83
		this.field4245 = var2 * this.field4245 + var5 * var3; // L: 84
		this.field4251 = var2 * var6 - var3 * this.field4252; // L: 85
		this.field4252 = var3 * var6 + this.field4252 * var2; // L: 86
		this.field4250 = var7 * var2 - this.field4255 * var3; // L: 87
		this.field4255 = this.field4255 * var2 + var7 * var3; // L: 88
	} // L: 89

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1555400039"
	)
	void method6742(float var1, float var2, float var3) {
		this.field4250 += var1; // L: 92
		this.field4255 += var2; // L: 93
		this.field4246 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4256 + "," + this.field4248 + "," + this.field4251 + "," + this.field4250 + "\n" + this.field4253 + "," + this.field4245 + "," + this.field4252 + "," + this.field4255 + "\n" + this.field4247 + "," + this.field4249 + "," + this.field4254 + "," + this.field4246; // L: 99
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-101"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 152
		var1.offset = var0.length - 2; // L: 153
		class434.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 154
		class434.SpriteBuffer_xOffsets = new int[class434.SpriteBuffer_spriteCount]; // L: 155
		class434.SpriteBuffer_yOffsets = new int[class434.SpriteBuffer_spriteCount]; // L: 156
		class434.SpriteBuffer_spriteWidths = new int[class434.SpriteBuffer_spriteCount]; // L: 157
		Fonts.SpriteBuffer_spriteHeights = new int[class434.SpriteBuffer_spriteCount]; // L: 158
		WorldMapLabelSize.SpriteBuffer_pixels = new byte[class434.SpriteBuffer_spriteCount][]; // L: 159
		var1.offset = var0.length - 7 - class434.SpriteBuffer_spriteCount * 8; // L: 160
		class434.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 161
		class434.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 162
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 163

		int var3;
		for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) { // L: 164
			class434.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) { // L: 165
			class434.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) { // L: 166
			class434.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) { // L: 167
			Fonts.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class434.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 168
		HealthBarUpdate.SpriteBuffer_spritePalette = new int[var2]; // L: 169

		for (var3 = 1; var3 < var2; ++var3) { // L: 170
			HealthBarUpdate.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 171
			if (HealthBarUpdate.SpriteBuffer_spritePalette[var3] == 0) { // L: 172
				HealthBarUpdate.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 174

		for (var3 = 0; var3 < class434.SpriteBuffer_spriteCount; ++var3) { // L: 175
			int var4 = class434.SpriteBuffer_spriteWidths[var3]; // L: 176
			int var5 = Fonts.SpriteBuffer_spriteHeights[var3]; // L: 177
			int var6 = var5 * var4; // L: 178
			byte[] var7 = new byte[var6]; // L: 179
			WorldMapLabelSize.SpriteBuffer_pixels[var3] = var7; // L: 180
			int var8 = var1.readUnsignedByte(); // L: 181
			int var9;
			if (var8 == 0) { // L: 182
				for (var9 = 0; var9 < var6; ++var9) { // L: 183
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 185
				for (var9 = 0; var9 < var4; ++var9) { // L: 186
					for (int var10 = 0; var10 < var5; ++var10) { // L: 187
						var7[var9 + var4 * var10] = var1.readByte(); // L: 188
					}
				}
			}
		}

	} // L: 193
}
