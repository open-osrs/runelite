import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		signature = "Lkk;"
	)
	@Export("clanChat")
	static ClanChat clanChat;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -833768267
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "Llh;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("q")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("j")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1665448065
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("g")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("n")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("u")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 6;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.parameters = new LinkedHashMap();
		this.method1911(true);
	}

	@ObfuscatedSignature(
		signature = "(Lkn;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
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
			} else {
				this.method1911(true);
			}
		} else {
			this.method1911(true);
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-943142768"
	)
	void method1911(boolean var1) {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(S)Lkn;",
		garbageValue = "128"
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
		return var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "116"
	)
	static final int method1914(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		signature = "(IB)V",
		garbageValue = "-82"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				WorldMapSectionType.client.method1017();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				Client.loginState = 0;
				Client.field705 = 0;
				Client.field706 = 0;
				Client.timer.method5184(var0);
				if (var0 != 20) {
					SequenceDefinition.method4973(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class8.field35 != null) {
				class8.field35.close();
				class8.field35 = null;
			}

			if (Client.gameState == 25) {
				Client.field809 = 0;
				Client.field822 = 0;
				Client.field759 = 1;
				Client.field690 = 0;
				Client.field729 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					WorldMapRegion.method541(GraphicsObject.archive10, GrandExchangeEvent.archive8, true, Client.gameState == 11 ? 4 : 0);
				} else if (var0 == 11) {
					WorldMapRegion.method541(GraphicsObject.archive10, GrandExchangeEvent.archive8, false, 4);
				} else if (GrandExchangeOfferAgeComparator.clearLoginScreen) {
					HealthBar.titleboxSprite = null;
					Fonts.titlebuttonSprite = null;
					Login.runesSprite = null;
					Login.leftTitleSprite = null;
					ItemContainer.rightTitleSprite = null;
					Login.logoSprite = null;
					Decimator.title_muteSprite = null;
					Login.options_buttons_0Sprite = null;
					GameShell.options_buttons_2Sprite = null;
					class90.worldSelectBackSprites = null;
					SpotAnimationDefinition.worldSelectFlagSprites = null;
					GrandExchangeEvent.worldSelectArrows = null;
					class228.worldSelectStars = null;
					WorldMapIcon_1.field206 = null;
					Login.loginScreenRunesAnimation.method1878();
					class206.field2439 = 1;
					Huffman.musicTrackArchive = null;
					class206.musicTrackGroupId = -1;
					MilliClock.musicTrackFileId = -1;
					class206.musicTrackVolume = 0;
					class336.musicTrackBoolean = false;
					class206.field2442 = 2;
					class41.method624(true);
					GrandExchangeOfferAgeComparator.clearLoginScreen = false;
				}
			} else {
				WorldMapRegion.method541(GraphicsObject.archive10, GrandExchangeEvent.archive8, true, 0);
			}

			Client.gameState = var0;
		}
	}
}
