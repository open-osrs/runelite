import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements PlatformInfoProvider {
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1922177111
	)
	int field3939;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1155417059
	)
	int field3937;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -187752831
	)
	int field3941;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lms;",
		garbageValue = "-1968333950"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (GraphicsObject.formattedOperatingSystemName.startsWith("win")) { // L: 15
			var1 = 1;
		} else if (GraphicsObject.formattedOperatingSystemName.startsWith("mac")) { // L: 16
			var1 = 2;
		} else if (GraphicsObject.formattedOperatingSystemName.startsWith("linux")) { // L: 17
			var1 = 3;
		} else {
			var1 = 4; // L: 18
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase(); // L: 22
		} catch (Exception var27) { // L: 24
			var2 = ""; // L: 25
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase(); // L: 28
		} catch (Exception var26) { // L: 30
			var3 = ""; // L: 31
		}

		String var4 = "Unknown"; // L: 33
		String var5 = "1.1"; // L: 34

		try {
			var4 = System.getProperty("java.vendor"); // L: 36
			var5 = System.getProperty("java.version"); // L: 37
		} catch (Exception var25) { // L: 39
		}

		boolean var24;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) { // L: 41
			var24 = false; // L: 42
		} else {
			var24 = true;
		}

		byte var7 = 0; // L: 43
		if (var1 == 1) { // L: 44
			if (var3.indexOf("4.0") != -1) { // L: 45
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) { // L: 46
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) { // L: 47
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) { // L: 48
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) { // L: 49
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) { // L: 50
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) { // L: 51
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) { // L: 52
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) { // L: 53
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) { // L: 54
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) { // L: 55
				var7 = 11;
			}
		} else if (var1 == 2) { // L: 57
			if (var3.indexOf("10.4") != -1) { // L: 58
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) { // L: 59
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) { // L: 60
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) { // L: 61
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) { // L: 62
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) { // L: 63
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var7 = 26; // L: 64
			} else if (var3.indexOf("10.11") != -1) { // L: 65
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) { // L: 66
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) { // L: 67
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) { // L: 70
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) { // L: 71
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) { // L: 72
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) { // L: 73
			var8 = 5;
		} else {
			var8 = 4; // L: 74
		}

		this.method6099(var5); // L: 75
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1; // L: 77
		int var11;
		if (this.field3939 > 3) { // L: 80
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0; // L: 81
		}

		byte var12 = 0; // L: 82
		String var13 = ""; // L: 83
		String var14 = ""; // L: 84
		String var15 = ""; // L: 85
		String var16 = ""; // L: 86
		String var17 = ""; // L: 87
		String var18 = ""; // L: 88
		int[] var23 = new int[3]; // L: 93
		return new PlatformInfo(var1, var24, var7, var8, this.field3939, this.field3937, this.field3941, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, ""); // L: 97
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1264148958"
	)
	void method6099(String var1) {
		if (var1.startsWith("1.")) { // L: 101
			this.method6107(var1); // L: 102
		} else {
			this.method6101(var1); // L: 105
		}

	} // L: 107

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "497638496"
	)
	void method6107(String var1) {
		String[] var2 = var1.split("\\."); // L: 110

		try {
			this.field3939 = Integer.parseInt(var2[1]); // L: 112
			var2 = var2[2].split("_"); // L: 113
			this.field3937 = Integer.parseInt(var2[0]); // L: 114
			this.field3941 = Integer.parseInt(var2[1]); // L: 115
		} catch (Exception var4) { // L: 117
		}

	} // L: 118

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2055431648"
	)
	void method6101(String var1) {
		String[] var2 = var1.split("\\."); // L: 121

		try {
			this.field3939 = Integer.parseInt(var2[0]); // L: 123
			this.field3937 = Integer.parseInt(var2[1]);
			this.field3941 = Integer.parseInt(var2[2]);
		} catch (Exception var4) { // L: 127
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;ZII)V",
		garbageValue = "2098353545"
	)
	static void method6109(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class377.clearLoginScreen) { // L: 124
			if (var3 == 4) { // L: 125
				Login.loginIndex = 4; // L: 126
			}

		} else {
			Login.loginIndex = var3; // L: 130
			Rasterizer2D.Rasterizer2D_clear(); // L: 131
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 132
			class339.leftTitleSprite = class125.convertJpgToSprite(var4); // L: 133
			class377.rightTitleSprite = class339.leftTitleSprite.mirrorHorizontally(); // L: 134
			class27.method364(var1, Client.worldProperties); // L: 135
			Coord.titleboxSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 136
			class289.titlebuttonSprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 137
			Login.runesSprite = WorldMapLabelSize.method3268(var1, "runes", ""); // L: 138
			GrandExchangeEvents.title_muteSprite = WorldMapLabelSize.method3268(var1, "title_mute", ""); // L: 139
			Login.options_buttons_0Sprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 140
			NetFileRequest.field3577 = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 141
			WorldMapCacheName.options_buttons_2Sprite = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 142
			Login.field1005 = TextureProvider.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 143
			class126.field1477 = Login.options_buttons_0Sprite.subWidth; // L: 144
			PcmPlayer.field416 = Login.options_buttons_0Sprite.subHeight; // L: 145
			PendingSpawn.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 146
			if (var2) { // L: 147
				Login.Login_username = ""; // L: 148
				Login.Login_password = ""; // L: 149
			}

			class0.field2 = 0; // L: 151
			ItemLayer.otp = ""; // L: 152
			Login.field1022 = true; // L: 153
			Login.worldSelectOpen = false; // L: 154
			if (!class4.clientPreferences.titleMusicDisabled) { // L: 155
				Archive var5 = DynamicObject.archive6; // L: 156
				int var6 = var5.getGroupId("scape main"); // L: 158
				int var7 = var5.getFileId(var6, ""); // L: 159
				WorldMapIcon_1.method3300(2, var5, var6, var7, 255, false); // L: 160
			} else {
				PcmPlayer.method856(2); // L: 163
			}

			class105.method2358(false); // L: 164
			class377.clearLoginScreen = true; // L: 165
			Login.xPadding = (AttackOption.canvasWidth - 765) / 2; // L: 166
			Login.loginBoxX = Login.xPadding + 202; // L: 167
			class25.loginBoxCenter = Login.loginBoxX + 180; // L: 168
			class339.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 169
			class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 170
			Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18); // L: 171
		}
	} // L: 128 172
}
