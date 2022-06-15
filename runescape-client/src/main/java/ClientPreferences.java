import java.awt.Component;
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
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 229725929
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("q")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("f")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("j")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("e")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -334746973
	)
	int field1238;
	@ObfuscatedName("w")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1124707181
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1649253505
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 214111179
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1784690563
	)
	int field1247;
	@ObfuscatedName("z")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 2087035801
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("u")
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
		this.field1247 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2242(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lqt;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1247 = -1; // L: 22
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
					this.field1247 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1238 = var1.readInt(); // L: 77
				}
			} else {
				this.method2242(true); // L: 38
			}
		} else {
			this.method2242(true); // L: 33
		}

	} // L: 81

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-998073107"
	)
	void method2242(boolean var1) {
	} // L: 83

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lqt;",
		garbageValue = "26"
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
		var1.writeByte(this.field1247); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1238); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-399700086"
	)
	void method2339(boolean var1) {
		this.roofsHidden = var1; // L: 150
		class220.savePreferences(); // L: 151
	} // L: 152

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "931670239"
	)
	boolean method2245() {
		return this.roofsHidden;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "2048"
	)
	void method2246(boolean var1) {
		this.hideUsername = var1; // L: 159
		class220.savePreferences(); // L: 160
	} // L: 161

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-737599418"
	)
	boolean method2247() {
		return this.hideUsername; // L: 164
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1124391002"
	)
	void method2248(boolean var1) {
		this.titleMusicDisabled = var1; // L: 168
		class220.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1328840913"
	)
	boolean method2317() {
		return this.titleMusicDisabled; // L: 173
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	void method2250(boolean var1) {
		this.displayFps = var1; // L: 177
		class220.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1624511223"
	)
	void method2251() {
		this.method2250(!this.displayFps); // L: 182
	} // L: 183

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method2252() {
		return this.displayFps; // L: 186
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "92"
	)
	void method2330(int var1) {
		this.field1238 = var1; // L: 190
		class220.savePreferences(); // L: 191
	} // L: 192

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1945148699"
	)
	int method2243() {
		return this.field1238; // L: 195
	}

	@ObfuscatedName("k")
	void method2255(double var1) {
		this.brightness = var1; // L: 199
		class220.savePreferences(); // L: 200
	} // L: 201

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-871452438"
	)
	double method2254() {
		return this.brightness; // L: 204
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "5560"
	)
	void method2297(int var1) {
		this.musicVolume = var1; // L: 208
		class220.savePreferences(); // L: 209
	} // L: 210

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1757790636"
	)
	int method2258() {
		return this.musicVolume; // L: 213
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1680251159"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 217
		class220.savePreferences(); // L: 218
	} // L: 219

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1274127259"
	)
	int method2241() {
		return this.soundEffectsVolume; // L: 222
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2115644002"
	)
	void method2341(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 226
		class220.savePreferences(); // L: 227
	} // L: 228

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "50"
	)
	int method2262() {
		return this.areaSoundEffectsVolume; // L: 231
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-106"
	)
	void method2260(String var1) {
		this.rememberedUsername = var1; // L: 235
		class220.savePreferences(); // L: 236
	} // L: 237

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-78579784"
	)
	String method2264() {
		return this.rememberedUsername; // L: 240
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1094835721"
	)
	void method2307(int var1) {
		this.field1247 = var1; // L: 244
		class220.savePreferences(); // L: 245
	} // L: 246

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "8"
	)
	int method2266() {
		return this.field1247; // L: 249
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method2280(int var1) {
		this.windowMode = var1; // L: 253
		class220.savePreferences(); // L: 254
	} // L: 255

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "510"
	)
	int method2268() {
		return this.windowMode; // L: 258
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1915359303"
	)
	static void method2344(Component var0) {
		var0.setFocusTraversalKeysEnabled(false); // L: 155
		var0.addKeyListener(KeyHandler.KeyHandler_instance); // L: 156
		var0.addFocusListener(KeyHandler.KeyHandler_instance); // L: 157
	} // L: 158
}
