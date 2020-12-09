import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("h")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("v")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -2047065695
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("w")
	static byte[][][] field514;
	@ObfuscatedName("t")
	static byte[][][] field508;
	@ObfuscatedName("p")
	static byte[][][] field511;
	@ObfuscatedName("y")
	static final int[] field512;
	@ObfuscatedName("r")
	static final int[] field513;
	@ObfuscatedName("q")
	static final int[] field518;
	@ObfuscatedName("g")
	static final int[] field515;
	@ObfuscatedName("s")
	static final int[] field509;
	@ObfuscatedName("o")
	static final int[] field517;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -172195291
	)
	static int field516;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 870257593
	)
	static int field510;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field512 = new int[]{1, 2, 4, 8};
		field513 = new int[]{16, 32, 64, 128};
		field518 = new int[]{1, 0, -1, 0};
		field515 = new int[]{0, -1, 0, 1};
		field509 = new int[]{1, -1, -1, 1};
		field517 = new int[]{-1, -1, 1, 1};
		field516 = (int)(Math.random() * 17.0D) - 8;
		field510 = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)[Lgt;",
		garbageValue = "47"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2179, ServerPacket.field2202, ServerPacket.field2141, ServerPacket.field2142, ServerPacket.field2143, ServerPacket.field2144, ServerPacket.field2201, ServerPacket.field2146, ServerPacket.field2182, ServerPacket.field2148, ServerPacket.field2200, ServerPacket.field2150, ServerPacket.field2190, ServerPacket.field2152, ServerPacket.field2139, ServerPacket.field2188, ServerPacket.field2155, ServerPacket.field2156, ServerPacket.field2163, ServerPacket.field2158, ServerPacket.field2159, ServerPacket.field2160, ServerPacket.field2161, ServerPacket.field2162, ServerPacket.field2218, ServerPacket.field2164, ServerPacket.field2165, ServerPacket.field2192, ServerPacket.field2167, ServerPacket.field2212, ServerPacket.field2208, ServerPacket.field2170, ServerPacket.field2171, ServerPacket.field2172, ServerPacket.field2173, ServerPacket.field2174, ServerPacket.field2175, ServerPacket.field2176, ServerPacket.field2140, ServerPacket.field2178, ServerPacket.field2151, ServerPacket.field2180, ServerPacket.field2181, ServerPacket.field2157, ServerPacket.field2166, ServerPacket.field2184, ServerPacket.field2197, ServerPacket.field2186, ServerPacket.field2149, ServerPacket.field2214, ServerPacket.field2189, ServerPacket.field2209, ServerPacket.field2191, ServerPacket.field2145, ServerPacket.field2183, ServerPacket.field2194, ServerPacket.field2195, ServerPacket.field2196, ServerPacket.field2215, ServerPacket.field2198, ServerPacket.field2177, ServerPacket.field2207, ServerPacket.field2154, ServerPacket.field2153, ServerPacket.field2203, ServerPacket.field2204, ServerPacket.field2205, ServerPacket.field2169, ServerPacket.field2206, ServerPacket.field2185, ServerPacket.field2187, ServerPacket.field2210, ServerPacket.field2211, ServerPacket.field2193, ServerPacket.field2213, ServerPacket.field2168, ServerPacket.field2199, ServerPacket.field2216, ServerPacket.field2217, ServerPacket.field2147, ServerPacket.field2219, ServerPacket.field2220, ServerPacket.field2221, ServerPacket.field2222, ServerPacket.field2223, ServerPacket.field2224};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;ZII)V",
		garbageValue = "1438840019"
	)
	static void method1208(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Login.loginIndex = 4;
			}

		} else {
			Login.loginIndex = var3;
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class25.leftTitleSprite = WorldMapSection0.convertJpgToSprite(var4);
			class224.rightTitleSprite = class25.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & 536870912) != 0) {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & 1073741824) != 0) {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else {
				class224.logoSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			WorldMapEvent.titleboxSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			GZipDecompressor.runesSprite = class89.method2123(var1, "runes", "");
			Login.title_muteSprite = class89.method2123(var1, "title_mute", "");
			DirectByteArrayCopier.options_buttons_0Sprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			AccessFile.field4101 = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			ItemContainer.options_buttons_2Sprite = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class204.field2408 = class51.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			FriendSystem.field1071 = DirectByteArrayCopier.options_buttons_0Sprite.subWidth;
			Players.field1260 = DirectByteArrayCopier.options_buttons_0Sprite.subHeight;
			class1.loginScreenRunesAnimation = new LoginScreenAnimation(GZipDecompressor.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
			}

			WorldMapSection1.field313 = 0;
			SecureRandomCallable.otp = "";
			Login.field1200 = true;
			Login.worldSelectOpen = false;
			if (!Timer.clientPreferences.titleMusicDisabled) {
				WorldMapSectionType.method300(2, class217.archive6, "scape main", "", 255, false);
			} else {
				SecureRandomCallable.method1220(2);
			}

			SoundSystem.method2564(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (IgnoreList.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			class25.leftTitleSprite.drawAt(Login.xPadding, 0);
			class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "5"
	)
	public static int method1170(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 7 & 127L);
		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-834710380"
	)
	static void method1203() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "(Lbq;III)V",
		garbageValue = "1651593642"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = ParamDefinition.SequenceDefinition_get(var1).field3548;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field974 = 0;
			}

			if (var3 == 2) {
				var0.field974 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || ParamDefinition.SequenceDefinition_get(var1).field3557 >= ParamDefinition.SequenceDefinition_get(var0.sequence).field3557) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field974 = 0;
			var0.field996 = var0.pathLength;
		}

	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "2048"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (WorldMapArea.clanChat != null) {
			PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2228, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(FloorDecoration.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
