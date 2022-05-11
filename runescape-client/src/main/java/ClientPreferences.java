import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1127997151
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("l")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("k")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("a")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("m")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 698831053
	)
	int field1252;
	@ObfuscatedName("s")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1690436583
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1205613435
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1618721713
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1550048415
	)
	int field1249;
	@ObfuscatedName("w")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1272591553
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("t")
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
		this.field1249 = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.parameters = new LinkedHashMap();
		this.method2318(true); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Lpx;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false; // L: 14
		this.displayFps = false; // L: 16
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1249 = -1; // L: 22
		this.rememberedUsername = null; // L: 23
		this.windowMode = 1; // L: 24
		this.parameters = new LinkedHashMap(); // L: 25
		if (var1 != null && var1.array != null) { // L: 32
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte(); // L: 48
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) { // L: 52
						int var5 = var1.readInt(); // L: 53
						int var6 = var1.readInt(); // L: 54
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) { // L: 58
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
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
					this.field1249 = var1.readUnsignedByte(); // L: 71
				}

				if (var2 > 8) { // L: 73
					this.displayFps = var1.readUnsignedByte() == 1; // L: 74
				}

				if (var2 > 9) { // L: 76
					this.field1252 = var1.readInt(); // L: 77
				}
			} else {
				this.method2318(true);
			}
		} else {
			this.method2318(true);
		}

	} // L: 81

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1505304764"
	)
	void method2318(boolean var1) {
	} // L: 83

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lpx;",
		garbageValue = "1983267736"
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
		var1.writeByte(this.field1249); // L: 105
		var1.writeByte(this.displayFps ? 1 : 0); // L: 106
		var1.writeInt(this.field1252); // L: 107
		return var1; // L: 108
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1415859216"
	)
	void method2219(boolean var1) {
		this.roofsHidden = var1; // L: 128
		class270.savePreferences(); // L: 129
	} // L: 130

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1094538117"
	)
	boolean method2222() {
		return this.roofsHidden; // L: 133
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1823199962"
	)
	void method2223(boolean var1) {
		this.hideUsername = var1; // L: 137
		class270.savePreferences(); // L: 138
	} // L: 139

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "242395257"
	)
	boolean method2257() {
		return this.hideUsername; // L: 142
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2129317630"
	)
	void method2305(boolean var1) {
		this.titleMusicDisabled = var1; // L: 146
		class270.savePreferences(); // L: 147
	} // L: 148

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1061667438"
	)
	boolean method2226() {
		return this.titleMusicDisabled; // L: 151
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1459067556"
	)
	void method2227(boolean var1) {
		this.displayFps = var1; // L: 155
		class270.savePreferences(); // L: 156
	} // L: 157

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	void method2228() {
		this.method2227(!this.displayFps); // L: 160
	} // L: 161

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	boolean method2229() {
		return this.displayFps; // L: 164
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "936974237"
	)
	void method2230(int var1) {
		this.field1252 = var1; // L: 168
		class270.savePreferences(); // L: 169
	} // L: 170

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2093496919"
	)
	int method2231() {
		return this.field1252; // L: 173
	}

	@ObfuscatedName("t")
	void method2232(double var1) {
		this.brightness = var1; // L: 177
		class270.savePreferences(); // L: 178
	} // L: 179

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-2107962943"
	)
	double method2225() {
		return this.brightness; // L: 182
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1172859341"
	)
	void method2234(int var1) {
		this.musicVolume = var1; // L: 186
		class270.savePreferences(); // L: 187
	} // L: 188

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-874911160"
	)
	int method2248() {
		return this.musicVolume; // L: 191
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1131698297"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1; // L: 195
		class270.savePreferences(); // L: 196
	} // L: 197

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-971935263"
	)
	int method2244() {
		return this.soundEffectsVolume; // L: 200
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1856408650"
	)
	void method2278(int var1) {
		this.areaSoundEffectsVolume = var1; // L: 204
		class270.savePreferences(); // L: 205
	} // L: 206

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "750592599"
	)
	int method2239() {
		return this.areaSoundEffectsVolume; // L: 209
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-64324606"
	)
	void method2297(String var1) {
		this.rememberedUsername = var1; // L: 213
		class270.savePreferences(); // L: 214
	} // L: 215

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2088208815"
	)
	String method2241() {
		return this.rememberedUsername; // L: 218
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-586904848"
	)
	void method2306(int var1) {
		this.field1249 = var1; // L: 222
		class270.savePreferences(); // L: 223
	} // L: 224

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "19888"
	)
	int method2243() {
		return this.field1249; // L: 227
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	void method2245(int var1) {
		this.windowMode = var1; // L: 231
		class270.savePreferences(); // L: 232
	} // L: 233

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "82"
	)
	int method2274() {
		return this.windowMode; // L: 236
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-66"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (NPC.World_request == null) { // L: 31
				NPC.World_request = UserComparator7.urlRequester.request(new URL(class93.field1280));
			} else if (NPC.World_request.isDone()) { // L: 33
				byte[] var0 = NPC.World_request.getResponse(); // L: 34
				Buffer var1 = new Buffer(var0); // L: 35
				var1.readInt(); // L: 36
				World.World_count = var1.readUnsignedShort(); // L: 37
				World.World_worlds = new World[World.World_count]; // L: 38

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 39 47
					var3 = World.World_worlds[var2] = new World(); // L: 40
					var3.id = var1.readUnsignedShort(); // L: 41
					var3.properties = var1.readInt(); // L: 42
					var3.host = var1.readStringCp1252NullTerminated(); // L: 43
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 44
					var3.location = var1.readUnsignedByte(); // L: 45
					var3.population = var1.readShort(); // L: 46
				}

				UserComparator8.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 49
				NPC.World_request = null; // L: 50
				return true; // L: 51
			}
		} catch (Exception var4) { // L: 55
			var4.printStackTrace(); // L: 56
			NPC.World_request = null; // L: 57
		}

		return false; // L: 59
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Lbx;",
		garbageValue = "-1660202002"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return class146.getNextWorldListWorld(); // L: 248
	}
}
