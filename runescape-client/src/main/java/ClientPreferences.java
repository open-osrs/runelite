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
		ClientPreferences_optionCount = 7;
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
		this.method1908(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lkj;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1057 = 0.8D;
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
					this.field1057 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}
			} else {
				this.method1908(true);
			}
		} else {
			this.method1908(true);
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1410665690"
	)
	void method1908(boolean var1) {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Lkj;",
		garbageValue = "-99"
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
		var1.writeByte((int)(100.0D * this.field1057));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		return var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIB)[Llm;",
		garbageValue = "93"
	)
	public static Sprite[] method1918(AbstractArchive var0, int var1, int var2) {
		if (!class304.method5363(var0, var1, var2)) {
			return null;
		} else {
			Sprite[] var4 = new Sprite[class336.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class336.SpriteBuffer_spriteCount; ++var5) {
				Sprite var6 = var4[var5] = new Sprite();
				var6.width = DirectByteArrayCopier.SpriteBuffer_spriteWidth;
				var6.height = class336.SpriteBuffer_spriteHeight;
				var6.xOffset = class336.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class336.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class336.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class336.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subHeight * var6.subWidth;
				byte[] var8 = GrandExchangeEvents.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = class336.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			class336.SpriteBuffer_xOffsets = null;
			class336.SpriteBuffer_yOffsets = null;
			class336.SpriteBuffer_spriteWidths = null;
			class336.SpriteBuffer_spriteHeights = null;
			class336.SpriteBuffer_spritePalette = null;
			GrandExchangeEvents.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Lbq;ZI)V",
		garbageValue = "-864569617"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
				var0.isUnanimated = true;
			}

			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = NPC.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = SecureRandomFuture.getTileHeight(var0.x, var0.y, GameObject.Client_plane);
					var0.playerCycle = Client.cycle;
					ArchiveLoader.scene.addNullableObject(GameObject.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.field620, var0.field606, var0.field622, var0.field623);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}

						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}

					var0.tileHeight = SecureRandomFuture.getTileHeight(var0.x, var0.y, GameObject.Client_plane);
					var0.playerCycle = Client.cycle;
					ArchiveLoader.scene.drawEntity(GameObject.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}

	}
}
