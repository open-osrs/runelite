import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -587272659
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("i")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("f")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("b")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("n")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1845230803
	)
	int field1218;
	@ObfuscatedName("l")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1402013239
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2075315825
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1548024689
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1754436801
	)
	int field1215;
	@ObfuscatedName("w")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2110885389
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("d")
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
		this.field1215 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2226(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1215 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
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
					this.field1215 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1218 = var1.readInt(); // L: 77
				}
			} else {
				this.method2226(true);
			}
		} else {
			this.method2226(true);
		}

	} // L: 81

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-37"
	)
	void method2226(boolean var1) {
	} // L: 83

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-779178440"
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
		var1.writeByte((int)(this.brightness * 100.0D)); // L: 101
		var1.writeByte(this.musicVolume); // L: 102
		var1.writeByte(this.soundEffectsVolume); // L: 103
		var1.writeByte(this.areaSoundEffectsVolume); // L: 104
		var1.writeByte(this.field1215); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1218); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1690911744"
	)
	void method2246(boolean var1) {
		this.roofsHidden = var1; // L: 150
		GameEngine.savePreferences(); // L: 151
	} // L: 152

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-51084929"
	)
	boolean method2263() {
		return this.roofsHidden; // L: 155
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1567835423"
	)
	void method2230(boolean var1) {
		this.hideUsername = var1; // L: 159
		GameEngine.savePreferences(); // L: 160
	} // L: 161

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "266836426"
	)
	boolean method2317() {
		return this.hideUsername; // L: 164
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "944518633"
	)
	void method2237(boolean var1) {
		this.titleMusicDisabled = var1; // L: 168
		GameEngine.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	boolean method2279() {
		return this.titleMusicDisabled; // L: 173
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "618524190"
	)
	void method2234(boolean var1) {
		this.displayFps = var1;
		GameEngine.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	void method2302() {
		this.method2234(!this.displayFps); // L: 182
	} // L: 183

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-509682647"
	)
	boolean method2236() {
		return this.displayFps; // L: 186
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1989585984"
	)
	void method2260(int var1) {
		this.field1218 = var1; // L: 190
		GameEngine.savePreferences(); // L: 191
	} // L: 192

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "117"
	)
	int method2238() {
		return this.field1218; // L: 195
	}

	@ObfuscatedName("m")
	void method2239(double var1) {
		this.brightness = var1; // L: 199
		GameEngine.savePreferences(); // L: 200
	} // L: 201

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "23"
	)
	double method2240() {
		return this.brightness; // L: 204
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-14"
	)
	void method2241(int var1) {
		this.musicVolume = var1; // L: 208
		GameEngine.savePreferences(); // L: 209
	} // L: 210

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1354418976"
	)
	int method2321() {
		return this.musicVolume; // L: 213
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 217
		GameEngine.savePreferences(); // L: 218
	} // L: 219

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "38"
	)
	int method2243() {
		return this.soundEffectsVolume; // L: 222
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1931510599"
	)
	void method2244(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 226
		GameEngine.savePreferences(); // L: 227
	} // L: 228

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "681521036"
	)
	int method2270() {
		return this.areaSoundEffectsVolume; // L: 231
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2038280864"
	)
	void method2286(String var1) {
		this.rememberedUsername = var1; // L: 235
		GameEngine.savePreferences(); // L: 236
	} // L: 237

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "7053"
	)
	String method2247() {
		return this.rememberedUsername; // L: 240
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	void method2248(int var1) {
		this.field1215 = var1; // L: 244
		GameEngine.savePreferences(); // L: 245
	} // L: 246

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-858252444"
	)
	int method2249() {
		return this.field1215; // L: 249
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1789378363"
	)
	void method2250(int var1) {
		this.windowMode = var1; // L: 253
		GameEngine.savePreferences(); // L: 254
	} // L: 255

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "114"
	)
	int method2251() {
		return this.windowMode; // L: 258
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-2074828092"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0); // L: 34
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0); // L: 38
			return var1; // L: 39
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1889189967"
	)
	static void method2259() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				StructComposition.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "441769737"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') { // L: 175
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true; // L: 176
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376; // L: 177
		}
	}
}
