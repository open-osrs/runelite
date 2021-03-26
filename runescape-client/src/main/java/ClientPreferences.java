import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 921813781
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("d")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("c")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1342258111
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("h")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("z")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("e")
	double field1072;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1550375763
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 625718061
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -429932721
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("b")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7; // L: 11
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1072 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method1963(true); // L: 25
	} // L: 26

	@ObfuscatedSignature(
		descriptor = "(Lkx;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1; // L: 15
		this.rememberedUsername = null; // L: 16
		this.hideUsername = false; // L: 17
		this.field1072 = 0.8D; // L: 18
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
					this.field1072 = (double)var1.readUnsignedByte() / 100.0D; // L: 60
					this.musicVolume = var1.readUnsignedByte(); // L: 61
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 62
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 63
				}
			} else {
				this.method1963(true); // L: 35
			}
		} else {
			this.method1963(true); // L: 30
		}

	} // L: 67

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-83879013"
	)
	void method1963(boolean var1) {
	} // L: 69

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lkx;",
		garbageValue = "241772586"
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
		var1.writeByte((int)(this.field1072 * 100.0D)); // L: 87
		var1.writeByte(this.musicVolume); // L: 88
		var1.writeByte(this.soundEffectsVolume); // L: 89
		var1.writeByte(this.areaSoundEffectsVolume); // L: 90
		return var1; // L: 91
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "433818884"
	)
	static boolean method1972(String var0, int var1) {
		return class204.method3888(var0, var1, "openjs"); // L: 55
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lel;",
		garbageValue = "1792916984"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 187
		if (var1 != null) { // L: 188
			return var1;
		} else {
			var1 = class171.loadFrames(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false); // L: 189
			if (var1 != null) { // L: 190
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 191
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Lhz;III)V",
		garbageValue = "1981013350"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 9991
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 9992
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 9993
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 9994
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 9995
			var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 9996
		}

		if (var0.yAlignment == 0) { // L: 9997
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 9998
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 9999
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10000
		} else if (var0.yAlignment == 4) { // L: 10001
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10002
		}

	} // L: 10003
}