import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1092227393
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("b")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("v")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("j")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1426015777
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("n")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("w")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("f")
	double field1117;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1197443065
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1564342051
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1303154967
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("p")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1117 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method1937(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1117 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
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
					this.field1117 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
			} else {
				this.method1937(true);
			}
		} else {
			this.method1937(true);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "909536447"
	)
	void method1937(boolean var1) {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lnv;",
		garbageValue = "2036795437"
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
		var1.writeByte((int)(this.field1117 * 100.0D));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BB)Lom;",
		garbageValue = "12"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var2 * var3];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "578056164"
	)
	public static int[] method1942() {
		int[] var0 = new int[KeyHandler.field64];

		for (int var1 = 0; var1 < KeyHandler.field64; ++var1) {
			var0[var1] = KeyHandler.field55[var1];
		}

		return var0;
	}
}
