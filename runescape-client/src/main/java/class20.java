import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("z")
public class class20 extends class16 {
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1884586225
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1810186183
	)
	int field158;
	@ObfuscatedName("o")
	byte field164;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -950803681
	)
	int field163;
	@ObfuscatedName("p")
	String field160;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lx;)V"
	)
	class20(class19 var1) {
		this.this$0 = var1;
		this.field158 = -1; // L: 100
	} // L: 105

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		this.field158 = var1.readUnsignedShort(); // L: 108
		this.field164 = var1.readByte(); // L: 109
		this.field163 = var1.readUnsignedShort(); // L: 110
		var1.readLong(); // L: 111
		this.field160 = var1.readStringCp1252NullTerminated(); // L: 112
	} // L: 113

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		class9 var2 = (class9)var1.field27.get(this.field158); // L: 116
		var2.field66 = this.field164; // L: 117
		var2.field64 = this.field163; // L: 118
		var2.field65 = this.field160; // L: 119
	} // L: 120

	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1867749847"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1040
			if (Client.gameState == 0) { // L: 1041
				class10.client.method594();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1042
				Client.loginState = 0; // L: 1043
				Client.field633 = 0; // L: 1044
				Client.field634 = 0; // L: 1045
				Client.timer.method5579(var0); // L: 1046
				if (var0 != 20) { // L: 1047
					TriBool.method5818(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Client.field686 != null) { // L: 1049 1050
				Client.field686.close(); // L: 1051
				Client.field686 = null; // L: 1052
			}

			if (Client.gameState == 25) { // L: 1055
				Client.field659 = 0; // L: 1056
				Client.field655 = 0; // L: 1057
				Client.field656 = 1; // L: 1058
				Client.field657 = 0; // L: 1059
				Client.field752 = 1; // L: 1060
			}

			if (var0 != 5 && var0 != 10) { // L: 1062
				if (var0 == 20) { // L: 1065
					ObjectSound.method1796(class373.archive10, SoundSystem.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1066
				} else if (var0 == 11) { // L: 1068
					ObjectSound.method1796(class373.archive10, SoundSystem.archive8, false, 4); // L: 1069
				} else if (class5.clearLoginScreen) { // L: 1072
					TileItem.titleboxSprite = null; // L: 1073
					Interpreter.titlebuttonSprite = null; // L: 1074
					Login.runesSprite = null; // L: 1075
					Client.leftTitleSprite = null; // L: 1076
					ArchiveDiskActionHandler.rightTitleSprite = null; // L: 1077
					class125.logoSprite = null; // L: 1078
					class373.title_muteSprite = null; // L: 1079
					TileItem.options_buttons_0Sprite = null; // L: 1080
					Skeleton.options_buttons_2Sprite = null; // L: 1081
					Tile.worldSelectBackSprites = null; // L: 1082
					ByteArrayPool.worldSelectFlagSprites = null; // L: 1083
					class6.worldSelectArrows = null; // L: 1084
					class13.worldSelectStars = null; // L: 1085
					class242.field2900 = null; // L: 1086
					Login.loginScreenRunesAnimation.method2192(); // L: 1087
					PacketWriter.method2368(2); // L: 1088
					class246.method4409(true); // L: 1089
					class5.clearLoginScreen = false; // L: 1090
				}
			} else {
				ObjectSound.method1796(class373.archive10, SoundSystem.archive8, true, 0); // L: 1063
			}

			Client.gameState = var0; // L: 1092
		}
	} // L: 1093

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-431696930"
	)
	static final void method304(boolean var0) {
		BoundaryObject.playPcmPlayers(); // L: 4871
		++Client.packetWriter.pendingWrites; // L: 4872
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 4873
			Client.packetWriter.pendingWrites = 0; // L: 4874
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 4875
				PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field2271, Client.packetWriter.isaacCipher); // L: 4877
				Client.packetWriter.addNode(var1); // L: 4878

				try {
					Client.packetWriter.flush(); // L: 4880
				} catch (IOException var3) { // L: 4882
					Client.hadNetworkError = true; // L: 4883
				}
			}

		}
	} // L: 4886
}
