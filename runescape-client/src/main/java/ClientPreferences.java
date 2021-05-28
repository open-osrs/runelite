import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -437407307
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("eg")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("f")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("y")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -660685365
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("j")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("r")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("b")
	double field1337;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1285356667
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -140834991
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1768933319
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("l")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7; // L: 11
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1337 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method2239(true); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1; // L: 15
		this.rememberedUsername = null; // L: 16
		this.hideUsername = false; // L: 17
		this.field1337 = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.parameters = new LinkedHashMap(); // L: 22
		if (var1 != null && var1.array != null) { // L: 29
			int var2 = var1.readUnsignedByte(); // L: 33
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 34
				if (var1.readUnsignedByte() == 1) { // L: 38
					this.roofsHidden = true;
				}

				if (var2 > 1) { // L: 39
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 40
				}

				if (var2 > 3) { // L: 42
					this.windowMode = var1.readUnsignedByte(); // L: 43
				}

				if (var2 > 2) { // L: 45
					int var3 = var1.readUnsignedByte(); // L: 46

					for (int var4 = 0; var4 < var3; ++var4) { // L: 47
						int var5 = var1.readInt(); // L: 48
						int var6 = var1.readInt(); // L: 49
						this.parameters.put(var5, var6); // L: 50
					}
				}

				if (var2 > 4) { // L: 53
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 54
				}

				if (var2 > 5) { // L: 56
					this.hideUsername = var1.readBoolean(); // L: 57
				}

				if (var2 > 6) { // L: 59
					this.field1337 = (double)var1.readUnsignedByte() / 100.0D; // L: 60
					this.musicVolume = var1.readUnsignedByte(); // L: 61
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 62
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 63
				}
			} else {
				this.method2239(true); // L: 35
			}
		} else {
			this.method2239(true); // L: 30
		}

	} // L: 67

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2046027023"
	)
	void method2239(boolean var1) {
	} // L: 69

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lnd;",
		garbageValue = "2063389348"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 72
		var1.writeByte(ClientPreferences_optionCount); // L: 73
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 74
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 75
		var1.writeByte(this.windowMode); // L: 76
		var1.writeByte(this.parameters.size()); // L: 77
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 78

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 79
			var1.writeInt((Integer)var3.getKey()); // L: 81
			var1.writeInt((Integer)var3.getValue()); // L: 82
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 85
		var1.writeBoolean(this.hideUsername); // L: 86
		var1.writeByte((int)(100.0D * this.field1337)); // L: 87
		var1.writeByte(this.musicVolume); // L: 88
		var1.writeByte(this.soundEffectsVolume); // L: 89
		var1.writeByte(this.areaSoundEffectsVolume); // L: 90
		return var1; // L: 91
	}
}
