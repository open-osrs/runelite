import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("k")
class class12 extends SSLSocket {
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static IndexedSprite field54;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1033236073
	)
	public static int field55;
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("i")
	Certificate[] field53;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lu;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 83
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public String[] getEnabledProtocols() {
		return null; // L: 109
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 87
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 95
	} // L: 96

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 98

	public boolean getEnableSessionCreation() {
		return false; // L: 101
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 105
	}

	public String[] getSupportedProtocols() {
		return null; // L: 205
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 209
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 221

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 220

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 222

	public void setNeedClientAuth(boolean var1) {
	} // L: 224

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 229
	} // L: 275

	public SSLSession getSession() {
		return new class17(this); // L: 117
	}

	public void setWantClientAuth(boolean var1) {
	} // L: 226

	public void setEnabledProtocols(String[] var1) {
	} // L: 223

	public boolean getWantClientAuth() {
		return false; // L: 217
	}

	public boolean getNeedClientAuth() {
		return false; // L: 113
	}

	public void setUseClientMode(boolean var1) {
	} // L: 225

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 91
	}

	public boolean getUseClientMode() {
		return false; // L: 213
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lle;Lle;Lle;I)V",
		garbageValue = "31635471"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 941
		Login.loginBoxX = Login.xPadding + 202; // L: 942
		Login.loginBoxCenter = Login.loginBoxX + 180; // L: 943
		byte var3;
		int var4;
		int var8;
		boolean var15;
		int var16;
		int var25;
		int var33;
		int var43;
		if (Login.worldSelectOpen) { // L: 944
			int var47;
			if (DirectByteArrayCopier.worldSelectBackSprites == null) { // L: 946
				Archive var44 = GrandExchangeOfferOwnWorldComparator.archive8; // L: 948
				var43 = var44.getGroupId("sl_back"); // L: 950
				var47 = var44.getFileId(var43, ""); // L: 951
				SpritePixels[] var45 = class21.method312(var44, var43, var47); // L: 952
				DirectByteArrayCopier.worldSelectBackSprites = var45; // L: 954
			}

			if (UserComparator7.worldSelectFlagSprites == null) { // L: 956
				UserComparator7.worldSelectFlagSprites = class393.method6882(GrandExchangeOfferOwnWorldComparator.archive8, "sl_flags", "");
			}

			if (class54.worldSelectArrows == null) { // L: 957
				class54.worldSelectArrows = class393.method6882(GrandExchangeOfferOwnWorldComparator.archive8, "sl_arrows", "");
			}

			if (KeyHandler.worldSelectStars == null) { // L: 958
				KeyHandler.worldSelectStars = class393.method6882(GrandExchangeOfferOwnWorldComparator.archive8, "sl_stars", "");
			}

			if (UserComparator6.worldSelectLeftSprite == null) { // L: 959
				UserComparator6.worldSelectLeftSprite = Script.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "leftarrow", "");
			}

			if (MouseRecorder.worldSelectRightSprite == null) { // L: 960
				MouseRecorder.worldSelectRightSprite = Script.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 961
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 962
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 963
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 964
			if (KeyHandler.worldSelectStars != null) { // L: 965
				KeyHandler.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 966
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 967
				KeyHandler.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 968
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 969
			}

			if (class54.worldSelectArrows != null) { // L: 971
				var33 = Login.xPadding + 280; // L: 972
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 973
					class54.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var33, 4); // L: 974
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 975
					class54.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var33 + 15, 4); // L: 976
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1); // L: 977
				var4 = Login.xPadding + 390; // L: 978
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 979
					class54.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var4, 4); // L: 980
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 981
					class54.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 982
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 983
				var43 = Login.xPadding + 500; // L: 984
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 985
					class54.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var43, 4); // L: 986
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 987
					class54.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var43 + 15, 4); // L: 988
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1); // L: 989
				var47 = Login.xPadding + 610; // L: 990
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 991
					class54.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					class54.worldSelectArrows[0].drawAt(var47, 4); // L: 992
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 993
					class54.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					class54.worldSelectArrows[1].drawAt(var47 + 15, 4); // L: 994
				}

				var0.draw("Type", var47 + 32, 17, 16777215, -1); // L: 995
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 997
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 998
			Login.hoveredWorldIndex = -1; // L: 999
			if (DirectByteArrayCopier.worldSelectBackSprites != null) { // L: 1000
				var3 = 88; // L: 1001
				byte var39 = 19; // L: 1002
				var43 = 765 / (var3 + 1) - 1; // L: 1003
				var47 = 480 / (var39 + 1); // L: 1004

				do {
					var25 = var47; // L: 1006
					var8 = var43; // L: 1007
					if (var47 * (var43 - 1) >= World.World_count) { // L: 1008
						--var43;
					}

					if (var43 * (var47 - 1) >= World.World_count) { // L: 1009
						--var47;
					}

					if (var43 * (var47 - 1) >= World.World_count) { // L: 1010
						--var47;
					}
				} while(var47 != var25 || var43 != var8); // L: 1011

				var25 = (765 - var3 * var43) / (var43 + 1); // L: 1013
				if (var25 > 5) { // L: 1014
					var25 = 5;
				}

				var8 = (480 - var39 * var47) / (var47 + 1); // L: 1015
				if (var8 > 5) { // L: 1016
					var8 = 5;
				}

				int var28 = (765 - var3 * var43 - var25 * (var43 - 1)) / 2; // L: 1017
				int var37 = (480 - var39 * var47 - var8 * (var47 - 1)) / 2; // L: 1018
				int var38 = (var47 + World.World_count - 1) / var47; // L: 1019
				Login.worldSelectPagesCount = var38 - var43; // L: 1020
				if (UserComparator6.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1021
					UserComparator6.worldSelectLeftSprite.drawAt(8, KeyHandler.canvasHeight / 2 - UserComparator6.worldSelectLeftSprite.subHeight / 2); // L: 1022
				}

				if (MouseRecorder.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1024
					MouseRecorder.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - MouseRecorder.worldSelectRightSprite.subWidth - 8, KeyHandler.canvasHeight / 2 - MouseRecorder.worldSelectRightSprite.subHeight / 2); // L: 1025
				}

				int var29 = var37 + 23; // L: 1027
				int var30 = var28 + Login.xPadding; // L: 1028
				int var40 = 0; // L: 1029
				var15 = false; // L: 1030
				var16 = Login.worldSelectPage; // L: 1031

				int var41;
				for (var41 = var16 * var47; var41 < World.World_count && var16 - Login.worldSelectPage < var43; ++var41) { // L: 1032 1033
					World var18 = WorldMapEvent.World_worlds[var41]; // L: 1036
					boolean var19 = true; // L: 1037
					String var20 = Integer.toString(var18.population); // L: 1038
					if (var18.population == -1) { // L: 1039
						var20 = "OFF"; // L: 1040
						var19 = false; // L: 1041
					} else if (var18.population > 1980) { // L: 1043
						var20 = "FULL"; // L: 1044
						var19 = false; // L: 1045
					}

					int var22 = 0; // L: 1048
					byte var21;
					if (var18.isBeta()) { // L: 1049
						if (var18.isMembersOnly()) { // L: 1050
							var21 = 7;
						} else {
							var21 = 6; // L: 1051
						}
					} else if (var18.isDeadman()) { // L: 1053
						var22 = 16711680; // L: 1054
						if (var18.isMembersOnly()) { // L: 1055
							var21 = 5;
						} else {
							var21 = 4; // L: 1056
						}
					} else if (var18.method1652()) { // L: 1058
						if (var18.isMembersOnly()) { // L: 1059
							var21 = 9;
						} else {
							var21 = 8; // L: 1060
						}
					} else if (var18.isPvp()) { // L: 1062
						if (var18.isMembersOnly()) { // L: 1063
							var21 = 3;
						} else {
							var21 = 2; // L: 1064
						}
					} else if (var18.isMembersOnly()) { // L: 1067
						var21 = 1;
					} else {
						var21 = 0; // L: 1068
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var30 && MouseHandler.MouseHandler_y < var29 + var39 && var19) { // L: 1070
						Login.hoveredWorldIndex = var41; // L: 1071
						DirectByteArrayCopier.worldSelectBackSprites[var21].drawTransOverlayAt(var30, var29, 128, 16777215); // L: 1072
						var15 = true; // L: 1073
					} else {
						DirectByteArrayCopier.worldSelectBackSprites[var21].drawAt(var30, var29); // L: 1075
					}

					if (UserComparator7.worldSelectFlagSprites != null) { // L: 1076
						UserComparator7.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var30 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var30 + 15, var39 / 2 + var29 + 5, var22, -1); // L: 1077
					var1.drawCentered(var20, var30 + 60, var39 / 2 + var29 + 5, 268435455, -1); // L: 1078
					var29 = var29 + var8 + var39; // L: 1079
					++var40; // L: 1080
					if (var40 >= var47) {
						var29 = var37 + 23; // L: 1081
						var30 = var30 + var3 + var25; // L: 1082
						var40 = 0; // L: 1083
						++var16; // L: 1084
					}
				}

				if (var15) { // L: 1087
					var41 = var1.stringWidth(WorldMapEvent.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1088
					int var31 = var1.ascent + 8; // L: 1089
					int var42 = MouseHandler.MouseHandler_y + 25; // L: 1090
					if (var31 + var42 > 480) { // L: 1091
						var42 = MouseHandler.MouseHandler_y - 25 - var31; // L: 1092
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 16777120); // L: 1094
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 0); // L: 1095
					var1.drawCentered(WorldMapEvent.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1); // L: 1096
				}
			}

			Canvas.rasterProvider.drawFull(0, 0); // L: 1099
		} else {
			RouteStrategy.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1103
			class139.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1104
			class16.logoSprite.drawAt(Login.xPadding + 382 - class16.logoSprite.subWidth / 2, 18); // L: 1105
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1106
				var3 = 20; // L: 1107
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1108
				var4 = 253 - var3; // L: 1109
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1110
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1111
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1112
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1113
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1114
			}

			String var5;
			String var6;
			String var7;
			short var32;
			short var34;
			if (Client.gameState == 20) { // L: 1116
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1117
				var32 = 201; // L: 1118
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1119
				var33 = var32 + 15; // L: 1120
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1121
				var33 += 15; // L: 1122
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1123
				var33 += 15; // L: 1124
				var33 += 7; // L: 1125
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1126
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0); // L: 1127
					var34 = 200; // L: 1128
					var5 = class408.clientPreferences.hideUsername ? class115.method2555(Login.Login_username) : Login.Login_username; // L: 1131

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(0, var6.length() - 1)) { // L: 1133 1134 1135
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var33, 16777215, 0); // L: 1137
					var33 += 15; // L: 1138

					for (var7 = class115.method2555(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) { // L: 1139 1140 1141
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1143
					var33 += 15; // L: 1144
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1147
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1148
				short var23;
				if (Login.loginIndex == 0) { // L: 1149
					var32 = 251; // L: 1150
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1151
					var33 = var32 + 30; // L: 1152
					var4 = Login.loginBoxX + 180 - 80; // L: 1153
					var23 = 291; // L: 1154
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1155
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1156
					var4 = Login.loginBoxX + 180 + 80; // L: 1157
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1158
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1159
				} else if (Login.loginIndex == 1) { // L: 1161
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1162
					var32 = 236; // L: 1163
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1164
					var33 = var32 + 15; // L: 1165
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1166
					var33 += 15; // L: 1167
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1168
					var33 += 15; // L: 1169
					var4 = Login.loginBoxX + 180 - 80; // L: 1170
					var23 = 321; // L: 1171
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1172
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1173
					var4 = Login.loginBoxX + 180 + 80; // L: 1174
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1175
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1176
				} else if (Login.loginIndex == 2) { // L: 1178
					var32 = 201; // L: 1179
					var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var32, 16776960, 0); // L: 1180
					var33 = var32 + 15; // L: 1181
					var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var33, 16776960, 0); // L: 1182
					var33 += 15; // L: 1183
					var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var33, 16776960, 0); // L: 1184
					var33 += 15; // L: 1185
					var33 += 7; // L: 1186
					var0.draw("Login: ", Login.loginBoxCenter - 110, var33, 16777215, 0); // L: 1187
					var34 = 200; // L: 1188
					var5 = class408.clientPreferences.hideUsername ? class115.method2555(Login.Login_username) : Login.Login_username; // L: 1191

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1193 1194 1195
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var33, 16777215, 0); // L: 1197
					var33 += 15; // L: 1198

					for (var7 = class115.method2555(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) { // L: 1199 1200 1201
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var33, 16777215, 0); // L: 1203
					var33 += 15; // L: 1204
					var32 = 277; // L: 1205
					var8 = Login.loginBoxCenter + -117; // L: 1206
					boolean var10 = Client.Login_isUsernameRemembered; // L: 1208
					boolean var11 = Login.field873; // L: 1209
					IndexedSprite var9 = var10 ? (var11 ? ClanMate.field3950 : class9.options_buttons_2Sprite) : (var11 ? Login.field868 : NetSocket.options_buttons_0Sprite); // L: 1211
					var9.drawAt(var8, var32); // L: 1214
					var8 = var8 + var9.subWidth + 5; // L: 1215
					var1.draw("Remember username", var8, var32 + 13, 16776960, 0); // L: 1216
					var8 = Login.loginBoxCenter + 24; // L: 1217
					boolean var14 = class408.clientPreferences.hideUsername; // L: 1219
					var15 = Login.field860; // L: 1220
					IndexedSprite var13 = var14 ? (var15 ? ClanMate.field3950 : class9.options_buttons_2Sprite) : (var15 ? Login.field868 : NetSocket.options_buttons_0Sprite); // L: 1222
					var13.drawAt(var8, var32); // L: 1225
					var8 = var8 + var13.subWidth + 5; // L: 1226
					var1.draw("Hide username", var8, var32 + 13, 16776960, 0); // L: 1227
					var33 = var32 + 15; // L: 1228
					var16 = Login.loginBoxCenter - 80; // L: 1229
					short var17 = 321; // L: 1230
					Login.titlebuttonSprite.drawAt(var16 - 73, var17 - 20); // L: 1231
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0); // L: 1232
					var16 = Login.loginBoxCenter + 80; // L: 1233
					Login.titlebuttonSprite.drawAt(var16 - 73, var17 - 20); // L: 1234
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0); // L: 1235
					var32 = 357; // L: 1236
					switch(Login.field865) { // L: 1237
					case 2:
						UserComparator6.field1340 = "Having trouble logging in?"; // L: 1242
						break;
					default:
						UserComparator6.field1340 = "Can't login? Click here."; // L: 1239
					}

					class114.field1359 = new Bounds(Login.loginBoxCenter, var32, var1.stringWidth(UserComparator6.field1340), 11); // L: 1245
					ItemContainer.field998 = new Bounds(Login.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1246
					var1.drawCentered(UserComparator6.field1340, Login.loginBoxCenter, var32, 16777215, 0); // L: 1247
				} else if (Login.loginIndex == 3) { // L: 1249
					var32 = 201; // L: 1250
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1251
					var33 = var32 + 20; // L: 1252
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1253
					var33 += 15; // L: 1254
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1255
					var33 += 15; // L: 1256
					var4 = Login.loginBoxX + 180; // L: 1257
					var23 = 276; // L: 1258
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1259
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1260
					var4 = Login.loginBoxX + 180; // L: 1261
					var23 = 326; // L: 1262
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1263
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1264
				} else {
					short var36;
					if (Login.loginIndex == 4) { // L: 1266
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1267
						var32 = 236; // L: 1268
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1269
						var33 = var32 + 15; // L: 1270
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1271
						var33 += 15; // L: 1272
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1273
						var33 += 15; // L: 1274
						var0.draw("PIN: " + class115.method2555(Tiles.otp) + (Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1275
						var33 -= 8; // L: 1276
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1277
						var33 += 15; // L: 1278
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1279
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1280
						var43 = var33 - var0.ascent; // L: 1281
						IndexedSprite var35;
						if (Login.field875) { // L: 1283
							var35 = class9.options_buttons_2Sprite; // L: 1284
						} else {
							var35 = NetSocket.options_buttons_0Sprite; // L: 1287
						}

						var35.drawAt(var4, var43); // L: 1289
						var33 += 15; // L: 1290
						var25 = Login.loginBoxX + 180 - 80; // L: 1291
						var36 = 321; // L: 1292
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1293
						var0.drawCentered("Continue", var25, var36 + 5, 16777215, 0); // L: 1294
						var25 = Login.loginBoxX + 180 + 80; // L: 1295
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1296
						var0.drawCentered("Cancel", var25, var36 + 5, 16777215, 0); // L: 1297
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0); // L: 1298
					} else if (Login.loginIndex == 5) { // L: 1300
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1301
						var32 = 221; // L: 1302
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1303
						var33 = var32 + 15; // L: 1304
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1305
						var33 += 15; // L: 1306
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1307
						var33 += 15; // L: 1308
						var33 += 14; // L: 1309
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0); // L: 1310
						var34 = 174; // L: 1311
						var5 = class408.clientPreferences.hideUsername ? class115.method2555(Login.Login_username) : Login.Login_username; // L: 1314

						for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1316 1317 1318
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? MouseHandler.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0); // L: 1320
						var33 += 15; // L: 1321
						var25 = Login.loginBoxX + 180 - 80; // L: 1322
						var36 = 321; // L: 1323
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1324
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0); // L: 1325
						var25 = Login.loginBoxX + 180 + 80; // L: 1326
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1327
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1328
						var36 = 356; // L: 1329
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var36, 268435455, 0); // L: 1330
					} else if (Login.loginIndex == 6) { // L: 1332
						var32 = 201; // L: 1333
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1334
						var33 = var32 + 15; // L: 1335
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1336
						var33 += 15; // L: 1337
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1338
						var33 += 15; // L: 1339
						var4 = Login.loginBoxX + 180; // L: 1340
						var23 = 321; // L: 1341
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1342
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1343
					} else if (Login.loginIndex == 7) { // L: 1345
						var32 = 216; // L: 1346
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1347
						var33 = var32 + 15; // L: 1348
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1349
						var33 += 15; // L: 1350
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1351
						var33 += 15; // L: 1352
						var4 = Login.loginBoxX + 180 - 80; // L: 1353
						var23 = 321; // L: 1354
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1355
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1356
						var4 = Login.loginBoxX + 180 + 80; // L: 1357
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1358
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1359
					} else if (Login.loginIndex == 8) { // L: 1361
						var32 = 216; // L: 1362
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1363
						var33 = var32 + 15; // L: 1364
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1365
						var33 += 15; // L: 1366
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1367
						var33 += 15; // L: 1368
						var4 = Login.loginBoxX + 180 - 80; // L: 1369
						var23 = 321; // L: 1370
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1371
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1372
						var4 = Login.loginBoxX + 180 + 80; // L: 1373
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1374
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1375
					} else if (Login.loginIndex == 9) { // L: 1377
						var32 = 221; // L: 1378
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1379
						var33 = var32 + 25; // L: 1380
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1381
						var33 += 25; // L: 1382
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1383
						var4 = Login.loginBoxX + 180; // L: 1384
						var23 = 311; // L: 1385
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1386
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1387
					} else if (Login.loginIndex == 10) { // L: 1389
						var33 = Login.loginBoxX + 180; // L: 1390
						var34 = 209; // L: 1391
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1392
						var4 = var34 + 20; // L: 1393
						Login.field854.drawAt(var33 - 109, var4); // L: 1394
						class29.field159.drawAt(var33 - 48, var4 + 18); // L: 1395
					} else if (Login.loginIndex == 12) { // L: 1397
						var33 = Login.loginBoxCenter; // L: 1398
						var34 = 216; // L: 1399
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0); // L: 1400
						var4 = var34 + 17; // L: 1401
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0); // L: 1402
						var4 += 17; // L: 1403
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0); // L: 1404
						var4 += 17; // L: 1405
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0); // L: 1406
						var33 = Login.loginBoxCenter - 80; // L: 1407
						var34 = 311; // L: 1408
						Login.titlebuttonSprite.drawAt(var33 - 73, var34 - 20); // L: 1409
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0); // L: 1410
						var33 = Login.loginBoxCenter + 80; // L: 1411
						Login.titlebuttonSprite.drawAt(var33 - 73, var34 - 20); // L: 1412
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0); // L: 1413
					} else if (Login.loginIndex == 13) { // L: 1415
						var32 = 231; // L: 1416
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0); // L: 1417
						var33 = var32 + 20; // L: 1418
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1419
						var4 = Login.loginBoxX + 180; // L: 1420
						var32 = 311; // L: 1421
						Login.titlebuttonSprite.drawAt(var4 - 73, var32 - 20); // L: 1422
						var0.drawCentered("Back", var4, var32 + 5, 16777215, 0); // L: 1423
					} else if (Login.loginIndex == 14) { // L: 1425
						var32 = 201; // L: 1426
						String var24 = ""; // L: 1427
						var5 = ""; // L: 1428
						var6 = ""; // L: 1429
						switch(Login.field866) { // L: 1430
						case 0:
							var24 = "Your account has been disabled."; // L: 1445
							var5 = Strings.field3501; // L: 1446
							var6 = ""; // L: 1447
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1438
							var5 = Strings.field3446; // L: 1439
							var6 = ""; // L: 1440
							break; // L: 1441
						default:
							class1.Login_promptCredentials(false); // L: 1433
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1451
						var33 = var32 + 15; // L: 1452
						var2.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1453
						var33 += 15; // L: 1454
						var2.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1455
						var33 += 15; // L: 1456
						var25 = Login.loginBoxX + 180; // L: 1457
						var36 = 276; // L: 1458
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1459
						var0.drawCentered("Support Page", var25, var36 + 5, 16777215, 0); // L: 1460
						var25 = Login.loginBoxX + 180; // L: 1461
						var36 = 326; // L: 1462
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20); // L: 1463
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0); // L: 1464
					} else if (Login.loginIndex == 24) { // L: 1466
						var32 = 221; // L: 1467
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1468
						var33 = var32 + 15; // L: 1469
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1470
						var33 += 15; // L: 1471
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1472
						var33 += 15; // L: 1473
						var4 = Login.loginBoxX + 180; // L: 1474
						var23 = 301; // L: 1475
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1476
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1477
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1480
				int[] var26 = new int[4]; // L: 1481
				Rasterizer2D.Rasterizer2D_getClipArray(var26); // L: 1482
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, KeyHandler.canvasHeight); // L: 1483
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1484
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1485
				Rasterizer2D.Rasterizer2D_setClipArray(var26); // L: 1486
			}

			VarpDefinition.title_muteSprite[class408.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1488
			if (Client.gameState > 5 && Language.Language_EN == MouseHandler.clientLanguage) { // L: 1489
				if (field54 != null) { // L: 1490
					var33 = Login.xPadding + 5; // L: 1491
					var34 = 463; // L: 1492
					byte var46 = 100; // L: 1493
					byte var27 = 35; // L: 1494
					field54.drawAt(var33, var34); // L: 1495
					var0.drawCentered("World" + " " + Client.worldId, var46 / 2 + var33, var27 / 2 + var34 - 2, 16777215, 0); // L: 1496
					if (class21.World_request != null) { // L: 1497
						var1.drawCentered("Loading...", var46 / 2 + var33, var27 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var46 / 2 + var33, var27 / 2 + var34 + 12, 16777215, 0); // L: 1498
					}
				} else {
					field54 = Script.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "sl_button", ""); // L: 1501
				}
			}

		}
	} // L: 1101 1504

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-2090753673"
	)
	static int method171(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3710
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = MusicPatch.loadWorlds() ? 1 : 0; // L: 3711
			return 1; // L: 3712
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3714
				var9 = class20.worldListStart(); // L: 3715
				if (var9 != null) { // L: 3716
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.id; // L: 3717
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.properties; // L: 3718
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.activity; // L: 3719
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.location; // L: 3720
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.population; // L: 3721
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.host; // L: 3722
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3725
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3726
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3727
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3728
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3729
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3730
				}

				return 1; // L: 3732
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3734
				var9 = class91.getNextWorldListWorld(); // L: 3735
				if (var9 != null) { // L: 3736
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.id; // L: 3737
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.properties; // L: 3738
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.activity; // L: 3739
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.location; // L: 3740
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.population; // L: 3741
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var9.host; // L: 3742
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3745
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3746
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3747
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3748
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3749
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3750
				}

				return 1; // L: 3752
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3754
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3755
					var7 = null; // L: 3756

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3757
						if (var3 == WorldMapEvent.World_worlds[var8].id) { // L: 3758
							var7 = WorldMapEvent.World_worlds[var8]; // L: 3759
							break;
						}
					}

					if (var7 != null) { // L: 3763
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.id; // L: 3764
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.properties; // L: 3765
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.activity; // L: 3766
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.location; // L: 3767
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.population; // L: 3768
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.host; // L: 3769
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3772
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3773
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3774
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3775
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3776
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3777
					}

					return 1; // L: 3779
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3781
					class14.Interpreter_intStackSize -= 4; // L: 3782
					var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3783
					boolean var10 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1; // L: 3784
					var8 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]; // L: 3785
					boolean var6 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3] == 1; // L: 3786
					class11.sortWorldList(var3, var10, var8, var6); // L: 3787
					return 1; // L: 3788
				} else if (var0 != 6511) { // L: 3790
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3811
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 3812
						return 1; // L: 3813
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3815
							class14.Interpreter_intStackSize -= 2; // L: 3816
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3817
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3818
							var5 = Buffer.getParamDefinition(var4); // L: 3819
							if (var5.isString()) { // L: 3820
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ScriptFrame.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3821
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = ScriptFrame.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3824
							}

							return 1; // L: 3826
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3828
							class14.Interpreter_intStackSize -= 2; // L: 3829
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3830
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3831
							var5 = Buffer.getParamDefinition(var4); // L: 3832
							if (var5.isString()) { // L: 3833
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = KitDefinition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3834
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = KitDefinition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3837
							}

							return 1; // L: 3839
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3841
							class14.Interpreter_intStackSize -= 2; // L: 3842
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3843
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3844
							var5 = Buffer.getParamDefinition(var4); // L: 3845
							if (var5.isString()) { // L: 3846
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = TaskHandler.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3847
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = TaskHandler.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3850
							}

							return 1; // L: 3852
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3854
							class14.Interpreter_intStackSize -= 2; // L: 3855
							var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 3856
							var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]; // L: 3857
							var5 = Buffer.getParamDefinition(var4); // L: 3858
							if (var5.isString()) { // L: 3859
								Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = class275.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3860
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class275.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3863
							}

							return 1; // L: 3865
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3867
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3868
							return 1; // L: 3869
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3871
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3872
							return 1; // L: 3873
						} else if (var0 == 6520) { // L: 3875
							return 1; // L: 3876
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3878
							return 1; // L: 3879
						} else if (var0 == 6522) { // L: 3881
							--class295.Interpreter_stringStackSize; // L: 3882
							--class14.Interpreter_intStackSize; // L: 3883
							return 1; // L: 3884
						} else if (var0 == 6523) { // L: 3886
							--class295.Interpreter_stringStackSize; // L: 3887
							--class14.Interpreter_intStackSize; // L: 3888
							return 1; // L: 3889
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 3891
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3892
							return 1; // L: 3893
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 3895
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 3896
							return 1; // L: 3897
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 3899
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 1; // L: 3900
							return 1; // L: 3901
						} else if (var0 == 6527) { // L: 3903
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.field469; // L: 3904
							return 1; // L: 3905
						} else {
							return 2; // L: 3907
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3791
					if (var3 >= 0 && var3 < World.World_count) { // L: 3792
						var7 = WorldMapEvent.World_worlds[var3]; // L: 3793
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.id; // L: 3794
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.properties; // L: 3795
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.activity; // L: 3796
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.location; // L: 3797
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var7.population; // L: 3798
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var7.host; // L: 3799
					} else {
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 3802
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3803
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3804
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3805
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3806
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 3807
					}

					return 1; // L: 3809
				}
			}
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1284893568"
	)
	static void method170(int var0) {
		class274.tempMenuAction = new MenuAction(); // L: 11268
		class274.tempMenuAction.param0 = Client.menuArguments1[var0]; // L: 11269
		class274.tempMenuAction.param1 = Client.menuArguments2[var0]; // L: 11270
		class274.tempMenuAction.opcode = Client.menuOpcodes[var0]; // L: 11271
		class274.tempMenuAction.identifier = Client.menuIdentifiers[var0]; // L: 11272
		class274.tempMenuAction.action = Client.menuActions[var0]; // L: 11273
	} // L: 11274
}
