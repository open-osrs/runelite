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
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 389167517
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("s")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("e")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 687015131
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("o")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("i")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("w")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 497474901
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 292884651
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -2024623247
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 591433569
	)
	int field1231;
	@ObfuscatedName("h")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 8; // L: 11
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1231 = -1;
		this.parameters = new LinkedHashMap();
		this.method2226(true); // L: 26
	} // L: 27

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1; // L: 15
		this.rememberedUsername = null; // L: 16
		this.hideUsername = false; // L: 17
		this.brightness = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.field1231 = -1; // L: 22
		this.parameters = new LinkedHashMap(); // L: 23
		if (var1 != null && var1.array != null) { // L: 30
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 35
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) { // L: 40
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 41
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt(); // L: 50
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) { // L: 54
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 55
				}

				if (var2 > 5) { // L: 57
					this.hideUsername = var1.readBoolean(); // L: 58
				}

				if (var2 > 6) { // L: 60
					this.brightness = (double)var1.readUnsignedByte() / 100.0D; // L: 61
					this.musicVolume = var1.readUnsignedByte(); // L: 62
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 63
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 64
				}

				if (var2 > 7) { // L: 66
					this.field1231 = var1.readUnsignedByte(); // L: 67
				}
			} else {
				this.method2226(true); // L: 36
			}
		} else {
			this.method2226(true); // L: 31
		}

	} // L: 71

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65280"
	)
	void method2226(boolean var1) {
	} // L: 73

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-118732597"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100); // L: 76
		var1.writeByte(ClientPreferences_optionCount); // L: 77
		var1.writeByte(this.roofsHidden ? 1 : 0); // L: 78
		var1.writeByte(this.titleMusicDisabled ? 1 : 0); // L: 79
		var1.writeByte(this.windowMode); // L: 80
		var1.writeByte(this.parameters.size()); // L: 81
		Iterator var2 = this.parameters.entrySet().iterator(); // L: 82

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 83
			var1.writeInt((Integer)var3.getKey()); // L: 85
			var1.writeInt((Integer)var3.getValue()); // L: 86
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : ""); // L: 89
		var1.writeBoolean(this.hideUsername); // L: 90
		var1.writeByte((int)(100.0D * this.brightness)); // L: 91
		var1.writeByte(this.musicVolume); // L: 92
		var1.writeByte(this.soundEffectsVolume); // L: 93
		var1.writeByte(this.areaSoundEffectsVolume); // L: 94
		var1.writeByte(this.field1231); // L: 95
		return var1; // L: 96
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	static void method2236() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear(); // L: 38
	} // L: 39

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1797277779"
	)
	public static int method2237(int var0, int var1, int var2) {
		int var3 = class125.method2741(var2 - var1 + 1); // L: 43
		var3 <<= var1; // L: 44
		var0 |= var3; // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2125194524"
	)
	public static int method2230(byte[] var0, int var1, int var2) {
		int var3 = -1; // L: 47

		for (int var4 = var1; var4 < var2; ++var4) { // L: 48
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255]; // L: 49
		}

		var3 = ~var3; // L: 51
		return var3; // L: 52
	}
}
