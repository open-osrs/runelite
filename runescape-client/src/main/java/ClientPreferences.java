import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1425200295
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("x")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("w")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 681335643
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("j")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("n")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("p")
	double field1057;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 489243513
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -482830731
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 452733913
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("e")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 7; // L: 11
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1057 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.parameters = new LinkedHashMap();
		this.method1908(true); // L: 25
	}

	@ObfuscatedSignature(
		descriptor = "(Lkj;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1; // L: 15
		this.rememberedUsername = null; // L: 16
		this.hideUsername = false; // L: 17
		this.field1057 = 0.8D; // L: 18
		this.musicVolume = 127; // L: 19
		this.soundEffectsVolume = 127; // L: 20
		this.areaSoundEffectsVolume = 127; // L: 21
		this.parameters = new LinkedHashMap(); // L: 22
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) { // L: 39
					this.titleMusicDisabled = var1.readUnsignedByte() == 1; // L: 40
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) { // L: 47
						int var5 = var1.readInt(); // L: 48
						int var6 = var1.readInt(); // L: 49
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) { // L: 53
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull(); // L: 54
				}

				if (var2 > 5) { // L: 56
					this.hideUsername = var1.readBoolean(); // L: 57
				}

				if (var2 > 6) { // L: 59
					this.field1057 = (double)var1.readUnsignedByte() / 100.0D; // L: 60
					this.musicVolume = var1.readUnsignedByte(); // L: 61
					this.soundEffectsVolume = var1.readUnsignedByte(); // L: 62
					this.areaSoundEffectsVolume = var1.readUnsignedByte(); // L: 63
				}
			} else {
				this.method1908(true);
			}
		} else {
			this.method1908(true);
		}

	} // L: 67

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1410665690"
	)
	void method1908(boolean var1) {
	} // L: 69

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lkj;",
		garbageValue = "-99"
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
		var1.writeByte((int)(100.0D * this.field1057)); // L: 87
		var1.writeByte(this.musicVolume); // L: 88
		var1.writeByte(this.soundEffectsVolume); // L: 89
		var1.writeByte(this.areaSoundEffectsVolume); // L: 90
		return var1; // L: 91
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIB)[Llm;",
		garbageValue = "93"
	)
	public static SpritePixels[] method1918(AbstractArchive var0, int var1, int var2) {
		if (!class304.method5363(var0, var1, var2)) { // L: 23
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[class336.SpriteBuffer_spriteCount]; // L: 26

			for (int var5 = 0; var5 < class336.SpriteBuffer_spriteCount; ++var5) { // L: 27
				SpritePixels var6 = var4[var5] = new SpritePixels(); // L: 28
				var6.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth; // L: 29
				var6.height = class336.SpriteBuffer_spriteHeight; // L: 30
				var6.xOffset = class336.SpriteBuffer_xOffsets[var5]; // L: 31
				var6.yOffset = class336.SpriteBuffer_yOffsets[var5]; // L: 32
				var6.subWidth = class336.SpriteBuffer_spriteWidths[var5]; // L: 33
				var6.subHeight = class336.SpriteBuffer_spriteHeights[var5]; // L: 34
				int var7 = var6.subHeight * var6.subWidth; // L: 35
				byte[] var8 = GrandExchangeEvents.SpriteBuffer_pixels[var5]; // L: 36
				var6.pixels = new int[var7]; // L: 37

				for (int var9 = 0; var9 < var7; ++var9) { // L: 38
					var6.pixels[var9] = class336.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class336.SpriteBuffer_xOffsets = null; // L: 41
			class336.SpriteBuffer_yOffsets = null; // L: 42
			class336.SpriteBuffer_spriteWidths = null; // L: 43
			class336.SpriteBuffer_spriteHeights = null; // L: 44
			class336.SpriteBuffer_spritePalette = null; // L: 45
			GrandExchangeEvents.SpriteBuffer_pixels = null; // L: 46
			return var4; // L: 50
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Lbq;ZI)V",
		garbageValue = "-864569617"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) { // L: 4723
			var0.isUnanimated = false; // L: 4724
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) { // L: 4725 4726
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7; // L: 4728
			int var3 = var0.y >> 7; // L: 4729
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) { // L: 4730
				long var4 = NPC.calculateTag(0, 0, 0, false, var0.index); // L: 4731
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) { // L: 4732
					var0.isUnanimated = false; // L: 4733
					var0.tileHeight = SecureRandomFuture.getTileHeight(var0.x, var0.y, GameObject.Client_plane); // L: 4734
					var0.playerCycle = Client.cycle; // L: 4735
					ArchiveLoader.scene.addNullableObject(GameObject.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field620, var0.field606, var0.field622, var0.field623); // L: 4736
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) { // L: 4739
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) { // L: 4740
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount; // L: 4741
					}

					var0.tileHeight = SecureRandomFuture.getTileHeight(var0.x, var0.y, GameObject.Client_plane); // L: 4743
					var0.playerCycle = Client.cycle; // L: 4744
					ArchiveLoader.scene.drawEntity(GameObject.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking); // L: 4745
				}
			}
		}

	} // L: 4749
}
