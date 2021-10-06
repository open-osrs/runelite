import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lgc;"
	)
	@Export("textures")
	Texture[] textures;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("deque")
	NodeDeque deque;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 289326279
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1388522429
	)
	@Export("remaining")
	int remaining;
	@ObfuscatedName("m")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1416724581
	)
	@Export("textureSize")
	int textureSize;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("archive")
	AbstractArchive archive;

	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;IDI)V"
	)
	public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
		this.deque = new NodeDeque();
		this.remaining = 0;
		this.brightness = 1.0D;
		this.textureSize = 128;
		this.archive = var2;
		this.capacity = var3;
		this.remaining = this.capacity;
		this.brightness = var4;
		this.textureSize = var6;
		int[] var7 = var1.getGroupFileIds(0);
		int var8 = var7.length;
		this.textures = new Texture[var1.getGroupFileCount(0)];

		for (int var9 = 0; var9 < var8; ++var9) {
			Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
			this.textures[var7[var9]] = new Texture(var10);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "436377420"
	)
	@Export("getLoadedPercentage")
	public int getLoadedPercentage() {
		int var1 = 0;
		int var2 = 0;
		Texture[] var3 = this.textures;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			Texture var5 = var3[var4];
			if (var5 != null && var5.fileIds != null) {
				var1 += var5.fileIds.length;
				int[] var6 = var5.fileIds;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					int var8 = var6[var7];
					if (this.archive.method5223(var8)) {
						++var2;
					}
				}
			}
		}

		if (var1 == 0) {
			return 0;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("q")
	@Export("setBrightness")
	public void setBrightness(double var1) {
		this.brightness = var1;
		this.clear();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1743192270"
	)
	@Export("getTexturePixels")
	public int[] getTexturePixels(int var1) {
		Texture var2 = this.textures[var1];
		if (var2 != null) {
			if (var2.pixels != null) {
				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}

			boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
			if (var3) {
				if (this.remaining == 0) {
					Texture var4 = (Texture)this.deque.removeFirst();
					var4.reset();
				} else {
					--this.remaining;
				}

				this.deque.addLast(var2);
				var2.isLoaded = true;
				return var2.pixels;
			}
		}

		return null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-100"
	)
	@Export("getAverageTextureRGB")
	public int getAverageTextureRGB(int var1) {
		return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "172178592"
	)
	public boolean vmethod4565(int var1) {
		return this.textures[var1].field2295;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "894427577"
	)
	@Export("isLowDetail")
	public boolean isLowDetail(int var1) {
		return this.textureSize == 64;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("clear")
	public void clear() {
		for (int var1 = 0; var1 < this.textures.length; ++var1) {
			if (this.textures[var1] != null) {
				this.textures[var1].reset();
			}
		}

		this.deque = new NodeDeque();
		this.remaining = this.capacity;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1075488432"
	)
	@Export("animate")
	public void animate(int var1) {
		for (int var2 = 0; var2 < this.textures.length; ++var2) {
			Texture var3 = this.textures[var2];
			if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
				var3.animate(var1);
				var3.isLoaded = false;
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;ZIB)V",
		garbageValue = "0"
	)
	static void method4433(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class112.method2474(4);
			}

		} else {
			if (var3 == 0) {
				byte var4;
				if (class21.client.method1338()) {
					var4 = 10;
				} else {
					var4 = 0;
				}

				class112.method2474(var4);
				if (var2) {
					Login.Login_username = "";
					Login.Login_password = "";
					MouseHandler.field236 = 0;
					Ignored.otp = "";
				}

				Login.method1930();
				class14.method175();
			} else {
				class112.method2474(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var10 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = class135.convertJpgToSprite(var10);
			Login.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				ClanChannelMember.logoSprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				ClanChannelMember.logoSprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				ClanChannelMember.logoSprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			SoundCache.titleboxSprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class132.titlebuttonSprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field873 = class131.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class4.field8 = class131.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class131.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			int var7 = var1.getGroupId("runes");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var6 = KitDefinition.method2934(var1, var7, var8);
			Login.runesSprite = var6;
			var8 = var1.getGroupId("title_mute");
			int var9 = var1.getFileId(var8, "");
			IndexedSprite[] var11 = KitDefinition.method2934(var1, var8, var9);
			class16.title_muteSprite = var11;
			class397.options_buttons_0Sprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field876 = class131.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			FileSystem.options_buttons_2Sprite = class131.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Login.field877 = class131.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			GrandExchangeOfferTotalQuantityComparator.field3741 = class397.options_buttons_0Sprite.subWidth;
			class20.field103 = class397.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			MouseHandler.field236 = 0;
			Ignored.otp = "";
			Login.field900 = true;
			Login.worldSelectOpen = false;
			if (!WorldMapDecorationType.clientPreferences.titleMusicDisabled) {
				WorldMapManager.method3727(2, Tiles.archive6, "scape main", "", 255, false);
			} else {
				CollisionMap.method3417(2);
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var12 = new Buffer(4);
					var12.writeByte(3);
					var12.writeMedium(0);
					NetCache.NetCache_socket.write(var12.array, 0, 4);
				} catch (IOException var15) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var14) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (Huffman.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class78.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			ClanChannelMember.logoSprite.drawAt(Login.xPadding + 382 - ClanChannelMember.logoSprite.subWidth / 2, 18);
		}
	}
}
