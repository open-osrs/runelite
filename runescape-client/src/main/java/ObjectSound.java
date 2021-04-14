import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	static class11 field928;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1467616233
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1683122899
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -2011686891
	)
	@Export("y")
	int y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1571650761
	)
	int field916;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 606469859
	)
	int field917;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 948333273
	)
	int field918;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1224516347
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -300336185
	)
	int field921;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1348614677
	)
	int field922;
	@ObfuscatedName("m")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 57547595
	)
	int field924;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1410090359"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 30
		ObjectComposition var2 = this.obj.transform(); // L: 31
		if (var2 != null) { // L: 32
			this.soundEffectId = var2.ambientSoundId; // L: 33
			this.field918 = var2.int4 * 128; // L: 34
			this.field921 = var2.int5; // L: 35
			this.field922 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field918 = 0;
			this.field921 = 0;
			this.field922 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			Huffman.pcmStreamMixer.removeSubStream(this.stream1); // L: 47
			this.stream1 = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "0"
	)
	@Export("currentTimeMillis")
	public static final synchronized long currentTimeMillis() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class378.field4146) { // L: 15
			class378.field4145 += class378.field4146 - var0; // L: 16
		}

		class378.field4146 = var0; // L: 18
		return var0 + class378.field4145; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-23572140"
	)
	static long method1798() {
		try {
			URL var0 = new URL(FontName.method6285("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;ZIS)V",
		garbageValue = "12426"
	)
	static void method1796(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class5.clearLoginScreen) { // L: 128
			if (var3 == 4) { // L: 129
				Login.loginIndex = 4; // L: 130
			}

		} else {
			Login.loginIndex = var3; // L: 134
			Rasterizer2D.Rasterizer2D_clear(); // L: 135
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 136
			Client.leftTitleSprite = WorldMapDecorationType.convertJpgToSprite(var4); // L: 137
			ArchiveDiskActionHandler.rightTitleSprite = Client.leftTitleSprite.mirrorHorizontally(); // L: 138
			int var5 = Client.worldProperties; // L: 139
			if ((var5 & 536870912) != 0) { // L: 141
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", ""); // L: 142
			} else if ((var5 & 1073741824) != 0) { // L: 144
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", ""); // L: 145
			} else {
				class125.logoSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "logo", ""); // L: 148
			}

			TileItem.titleboxSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 151
			Interpreter.titlebuttonSprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 152
			Login.runesSprite = Players.method2284(var1, "runes", ""); // L: 153
			class373.title_muteSprite = Players.method2284(var1, "title_mute", ""); // L: 154
			TileItem.options_buttons_0Sprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 155
			UrlRequester.field1400 = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 156
			Skeleton.options_buttons_2Sprite = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 157
			VarcInt.field3429 = WorldMapSection1.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 158
			class225.field2777 = TileItem.options_buttons_0Sprite.subWidth; // L: 159
			class34.field232 = TileItem.options_buttons_0Sprite.subHeight; // L: 160
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite); // L: 161
			if (var2) { // L: 162
				Login.Login_username = ""; // L: 163
				Login.Login_password = ""; // L: 164
			}

			class139.field1560 = 0; // L: 166
			Bounds.otp = ""; // L: 167
			Login.field1005 = true; // L: 168
			Login.worldSelectOpen = false; // L: 169
			if (!Login.clientPreferences.titleMusicDisabled) { // L: 170
				WorldMapRectangle.method3103(2, class8.archive6, "scape main", "", 255, false);
			} else {
				PacketWriter.method2368(2); // L: 171
			}

			class246.method4409(false); // L: 172
			class5.clearLoginScreen = true; // L: 173
			Login.xPadding = (InterfaceParent.canvasWidth - 765) / 2; // L: 174
			Login.loginBoxX = Login.xPadding + 202; // L: 175
			GraphicsObject.loginBoxCenter = Login.loginBoxX + 180; // L: 176
			Client.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 177
			ArchiveDiskActionHandler.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 178
			class125.logoSprite.drawAt(Login.xPadding + 382 - class125.logoSprite.subWidth / 2, 18); // L: 179
		}
	} // L: 132 180

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1063868291"
	)
	public static boolean method1797(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}
}
