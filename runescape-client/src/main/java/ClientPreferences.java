import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1137490275
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("h")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("g")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("l")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("n")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1182748365
	)
	int field1237;
	@ObfuscatedName("f")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1977621949
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 949756333
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -925299259
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2046216957
	)
	int field1245;
	@ObfuscatedName("c")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1653018799
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("p")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 10; // L: 11
	}

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1245 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2252(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lpd;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1245 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) { // L: 32
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 37
				if (var1.readUnsignedByte() == 1) { // L: 41
					this.roofsHidden = true; // L: 42
				}

				if (var2 > 1) { // L: 44
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 45
				}

				if (var2 > 3) { // L: 47
					this.windowMode = var1.readUnsignedByte(); // L: 48
				}

				if (var2 > 2) { // L: 50
					int var3 = var1.readUnsignedByte(); // L: 51

					for (int var4 = 0; var4 < var3; ++var4) { // L: 52
						int var5 = var1.readInt(); // L: 53
						int var6 = var1.readInt(); // L: 54
						this.parameters.put(var5, var6); // L: 55
					}
				}

				if (var2 > 4) { // L: 58
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 59
				}

				if (var2 > 5) { // L: 61
					this.hideUsername = var1.readBoolean(); // L: 62
				}

				if (var2 > 6) { // L: 64
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 65
					this.musicVolume = var1.readUnsignedByte(); // L: 66
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 67
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 68
				}

				if (var2 > 7) { // L: 70
					this.field1245 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1237 = var1.readInt(); // L: 77
				}
			} else {
				this.method2252(true); // L: 38
			}
		} else {
			this.method2252(true); // L: 33
		}

	} // L: 81

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "330632498"
	)
	void method2252(boolean var1) {
	} // L: 83

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lpd;",
		garbageValue = "-96"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 86
		var1.writeByte(ClientPreferences_optionCount); // L: 87
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 88
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 89
		var1.writeByte(this.windowMode); // L: 90
		var1.writeByte(this.parameters.size()); // L: 91
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 92

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 93
			var1.writeInt((Integer)var3.getKey()); // L: 95
			var1.writeInt((Integer)var3.getValue()); // L: 96
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 99
		var1.writeBoolean(this.hideUsername); // L: 100
		var1.writeByte((int)(100.0D * this.brightness)); // L: 101
		var1.writeByte(this.musicVolume); // L: 102
		var1.writeByte(this.soundEffectsVolume); // L: 103
		var1.writeByte(this.areaSoundEffectsVolume); // L: 104
		var1.writeByte(this.field1245); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1237); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "80137453"
	)
	void method2254(boolean var1) {
		this.roofsHidden = var1; // L: 150
		class307.savePreferences(); // L: 151
	} // L: 152

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2146516502"
	)
	boolean method2255() {
		return this.roofsHidden; // L: 155
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-100"
	)
	void method2256(boolean var1) {
		this.hideUsername = var1; // L: 159
		class307.savePreferences(); // L: 160
	} // L: 161

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-98"
	)
	boolean method2257() {
		return this.hideUsername; // L: 164
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-12968"
	)
	void method2258(boolean var1) {
		this.titleMusicDisabled = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1326801022"
	)
	boolean method2259() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "20"
	)
	void method2265(boolean var1) {
		this.displayFps = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	void method2271() {
		this.method2265(!this.displayFps);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-122640703"
	)
	boolean method2251() {
		return this.displayFps;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	void method2263(int var1) {
		this.field1237 = var1;
		class307.savePreferences();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1736696043"
	)
	int method2275() {
		return this.field1237;
	}

	@ObfuscatedName("s")
	void method2260(double var1) {
		this.brightness = var1;
		class307.savePreferences(); // L: 200
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "429450872"
	)
	double method2266() {
		return this.brightness;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "272350050"
	)
	void method2326(int var1) {
		this.musicVolume = var1; // L: 208
		class307.savePreferences();
	} // L: 210

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605095826"
	)
	int method2288() {
		return this.musicVolume; // L: 213
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-50"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 217
		class307.savePreferences(); // L: 218
	} // L: 219

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method2269() {
		return this.soundEffectsVolume; // L: 222
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "128"
	)
	void method2270(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 226
		class307.savePreferences(); // L: 227
	} // L: 228

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	int method2286() {
		return this.areaSoundEffectsVolume; // L: 231
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1115049469"
	)
	void method2316(String var1) {
		this.rememberedUsername = var1; // L: 235
		class307.savePreferences(); // L: 236
	} // L: 237

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "85"
	)
	String method2273() {
		return this.rememberedUsername; // L: 240
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "63"
	)
	void method2274(int var1) {
		this.field1245 = var1; // L: 244
		class307.savePreferences(); // L: 245
	} // L: 246

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2268() {
		return this.field1245; // L: 249
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-837481548"
	)
	void method2276(int var1) {
		this.windowMode = var1; // L: 253
		class307.savePreferences(); // L: 254
	} // L: 255

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1919757284"
	)
	int method2317() {
		return this.windowMode; // L: 258
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "960216537"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 168
		var1.offset = var0.length - 2; // L: 169
		class451.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 170
		class451.SpriteBuffer_xOffsets = new int[class451.SpriteBuffer_spriteCount]; // L: 171
		class451.SpriteBuffer_yOffsets = new int[class451.SpriteBuffer_spriteCount]; // L: 172
		class451.SpriteBuffer_spriteWidths = new int[class451.SpriteBuffer_spriteCount]; // L: 173
		class451.SpriteBuffer_spriteHeights = new int[class451.SpriteBuffer_spriteCount]; // L: 174
		class460.SpriteBuffer_pixels = new byte[class451.SpriteBuffer_spriteCount][]; // L: 175
		var1.offset = var0.length - 7 - class451.SpriteBuffer_spriteCount * 8; // L: 176
		class451.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 177
		class451.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 178
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 179

		int var3;
		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 180
			class451.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 181
			class451.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 182
			class451.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 183
			class451.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class451.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 184
		GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette = new int[var2]; // L: 185

		for (var3 = 1; var3 < var2; ++var3) { // L: 186
			GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 187
			if (GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var3] == 0) { // L: 188
				GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 190

		for (var3 = 0; var3 < class451.SpriteBuffer_spriteCount; ++var3) { // L: 191
			int var4 = class451.SpriteBuffer_spriteWidths[var3]; // L: 192
			int var5 = class451.SpriteBuffer_spriteHeights[var3]; // L: 193
			int var6 = var5 * var4; // L: 194
			byte[] var7 = new byte[var6]; // L: 195
			class460.SpriteBuffer_pixels[var3] = var7; // L: 196
			int var8 = var1.readUnsignedByte(); // L: 197
			int var9;
			if (var8 == 0) { // L: 198
				for (var9 = 0; var9 < var6; ++var9) { // L: 199
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 201
				for (var9 = 0; var9 < var4; ++var9) { // L: 202
					for (int var10 = 0; var10 < var5; ++var10) { // L: 203
						var7[var9 + var4 * var10] = var1.readByte(); // L: 204
					}
				}
			}
		}

	} // L: 209
}
