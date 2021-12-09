import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1737169407
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("p")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("m")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -194276067
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("s")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("j")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("w")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1211221709
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 442935595
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -383218273
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1553838981
	)
	int field1197;
	@ObfuscatedName("d")
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
		this.field1197 = -1;
		this.parameters = new LinkedHashMap();
		this.method2282(true); // L: 26
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
		this.field1197 = -1; // L: 22
		this.parameters = new LinkedHashMap(); // L: 23
		if (var1 != null && var1.array != null) { // L: 30
			int var2 = var1.readUnsignedByte(); // L: 34
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) { // L: 35
				if (var1.readUnsignedByte() == 1) { // L: 39
					this.roofsHidden = true;
				}

				if (var2 > 1) { // L: 40
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 41
				}

				if (var2 > 3) { // L: 43
					this.windowMode = var1.readUnsignedByte(); // L: 44
				}

				if (var2 > 2) { // L: 46
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt(); // L: 50
						this.parameters.put(var5, var6); // L: 51
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
					this.field1197 = var1.readUnsignedByte(); // L: 67
				}
			} else {
				this.method2282(true); // L: 36
			}
		} else {
			this.method2282(true); // L: 31
		}

	} // L: 71

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1565386300"
	)
	void method2282(boolean var1) {
	} // L: 73

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-102724797"
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
		var1.writeByte(this.field1197); // L: 95
		return var1; // L: 96
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1263017108"
	)
	public static void method2297(boolean var0) {
		if (NetCache.NetCache_socket != null) { // L: 193
			try {
				Buffer var1 = new Buffer(4); // L: 195
				var1.writeByte(var0 ? 2 : 3); // L: 196
				var1.writeMedium(0); // L: 197
				NetCache.NetCache_socket.write(var1.array, 0, 4); // L: 198
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close(); // L: 202
				} catch (Exception var3) { // L: 204
				}

				++NetCache.NetCache_ioExceptions; // L: 205
				NetCache.NetCache_socket = null; // L: 206
			}

		}
	} // L: 208

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lku;Ljava/lang/String;Ljava/lang/String;B)Lpa;",
		garbageValue = "53"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 47
		int var4 = var0.getFileId(var3, var2); // L: 48
		return class4.method22(var0, var3, var4); // L: 49
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIIIII)V",
		garbageValue = "523505155"
	)
	static final void method2293(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field543) { // L: 10990
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10991
		}

		Client.field543 = false; // L: 10992
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10993
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10994
				var0.scrollY -= 4; // L: 10995
				SecureRandomCallable.invalidateWidget(var0); // L: 10996
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10998
				var0.scrollY += 4; // L: 10999
				SecureRandomCallable.invalidateWidget(var0); // L: 11000
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 11002
				var7 = var3 * (var3 - 32) / var4; // L: 11003
				if (var7 < 8) { // L: 11004
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 11005
				int var9 = var3 - 32 - var7; // L: 11006
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 11007
				SecureRandomCallable.invalidateWidget(var0); // L: 11008
				Client.field543 = true; // L: 11009
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 11012
			var7 = var0.width; // L: 11013
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 11014
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 11015
				SecureRandomCallable.invalidateWidget(var0); // L: 11016
			}
		}

	} // L: 11019
}
