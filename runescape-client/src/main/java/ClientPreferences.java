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
		ClientPreferences_optionCount = 8;
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
		this.method2282(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpi;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1197 = -1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1197 = var1.readUnsignedByte();
				}
			} else {
				this.method2282(true);
			}
		} else {
			this.method2282(true);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1565386300"
	)
	void method2282(boolean var1) {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-102724797"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1197);
		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1263017108"
	)
	public static void method2297(boolean var0) {
		if (NetCache.NetCache_socket != null) {
			try {
				Buffer var1 = new Buffer(4);
				var1.writeByte(var0 ? 2 : 3);
				var1.writeMedium(0);
				NetCache.NetCache_socket.write(var1.array, 0, 4);
			} catch (IOException var4) {
				try {
					NetCache.NetCache_socket.close();
				} catch (Exception var3) {
				}

				++NetCache.NetCache_ioExceptions;
				NetCache.NetCache_socket = null;
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lku;Ljava/lang/String;Ljava/lang/String;B)Lpa;",
		garbageValue = "53"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return class4.method22(var0, var3, var4);
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(Ljm;IIIIIII)V",
		garbageValue = "523505155"
	)
	static final void method2293(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field543) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field543 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class150.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				SecureRandomCallable.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				SecureRandomCallable.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				SecureRandomCallable.invalidateWidget(var0);
				Client.field543 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				SecureRandomCallable.invalidateWidget(var0);
			}
		}

	}
}
