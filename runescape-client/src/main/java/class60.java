import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class60 {
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -685259439
	)
	static int field452;
	@ObfuscatedName("f")
	@Export("applet")
	public static Applet applet;
	@ObfuscatedName("b")
	public static String field453;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "[Llc;"
	)
	@Export("crossSprites")
	static Sprite[] crossSprites;

	static {
		applet = null; // L: 10
		field453 = "";
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Liw;Liw;IZI)Lex;",
		garbageValue = "-908411627"
	)
	public static Frames method984(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true; // L: 11
		int[] var5 = var0.getGroupFileIds(var2); // L: 12

		for (int var6 = 0; var6 < var5.length; ++var6) { // L: 13
			byte[] var7 = var0.getFile(var2, var5[var6]); // L: 14
			if (var7 == null) { // L: 15
				var4 = false; // L: 16
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255; // L: 19
				byte[] var9;
				if (var3) { // L: 21
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0); // L: 22
				}

				if (var9 == null) { // L: 23
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null; // L: 25
		} else {
			try {
				return new Frames(var0, var1, var2, var3); // L: 27
			} catch (Exception var11) { // L: 29
				return null; // L: 30
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "687907076"
	)
	static final void method983(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		Object var10001 = null;
		String var1 = var10000.append(" is already on your friend list").toString(); // L: 119
		DevicePcmPlayerProvider.addGameMessage(30, "", var1); // L: 121
	} // L: 123

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;Lkq;B)V",
		garbageValue = "106"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (ItemContainer.canvasWidth - 765) / 2; // L: 1008
		Login.loginBoxX = Login.xPadding + 202; // L: 1009
		AttackOption.loginBoxCenter = Login.loginBoxX + 180; // L: 1010
		byte var3;
		int var4;
		int var8;
		int var10;
		int var25;
		int var31;
		int var38;
		if (Login.worldSelectOpen) { // L: 1011
			if (EnumDefinition.worldSelectBackSprites == null) { // L: 1013
				EnumDefinition.worldSelectBackSprites = ParamDefinition.method4677(GrandExchangeOffer.archive8, "sl_back", "");
			}

			Archive var39;
			IndexedSprite[] var41;
			int var42;
			if (FaceNormal.worldSelectFlagSprites == null) { // L: 1014
				var39 = GrandExchangeOffer.archive8; // L: 1016
				var38 = var39.getGroupId("sl_flags"); // L: 1018
				var42 = var39.getFileId(var38, ""); // L: 1019
				var41 = UserComparator5.method3540(var39, var38, var42); // L: 1020
				FaceNormal.worldSelectFlagSprites = var41; // L: 1022
			}

			if (class301.worldSelectArrows == null) { // L: 1024
				var39 = GrandExchangeOffer.archive8; // L: 1026
				var38 = var39.getGroupId("sl_arrows"); // L: 1028
				var42 = var39.getFileId(var38, ""); // L: 1029
				var41 = UserComparator5.method3540(var39, var38, var42); // L: 1030
				class301.worldSelectArrows = var41; // L: 1032
			}

			if (GameObject.worldSelectStars == null) { // L: 1034
				var39 = GrandExchangeOffer.archive8; // L: 1036
				var38 = var39.getGroupId("sl_stars"); // L: 1038
				var42 = var39.getFileId(var38, ""); // L: 1039
				var41 = UserComparator5.method3540(var39, var38, var42); // L: 1040
				GameObject.worldSelectStars = var41; // L: 1042
			}

			if (class323.worldSelectLeftSprite == null) { // L: 1044
				class323.worldSelectLeftSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOffer.archive8, "leftarrow", "");
			}

			if (class280.worldSelectRightSprite == null) { // L: 1045
				class280.worldSelectRightSprite = Canvas.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOffer.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1046
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1047
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1048
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1049
			if (GameObject.worldSelectStars != null) { // L: 1050
				GameObject.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1051
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1052
				GameObject.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1053
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1054
			}

			if (class301.worldSelectArrows != null) { // L: 1056
				var31 = Login.xPadding + 280; // L: 1057
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1058
					class301.worldSelectArrows[2].drawAt(var31, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var31, 4); // L: 1059
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1060
					class301.worldSelectArrows[3].drawAt(var31 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var31 + 15, 4); // L: 1061
				}

				var0.draw("World", var31 + 32, 17, 16777215, -1); // L: 1062
				var4 = Login.xPadding + 390; // L: 1063
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1064
					class301.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var4, 4); // L: 1065
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1066
					class301.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1067
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1068
				var38 = Login.xPadding + 500; // L: 1069
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1070
					class301.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var38, 4); // L: 1071
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1072
					class301.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var38 + 15, 4); // L: 1073
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1); // L: 1074
				var42 = Login.xPadding + 610; // L: 1075
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1076
					class301.worldSelectArrows[2].drawAt(var42, 4);
				} else {
					class301.worldSelectArrows[0].drawAt(var42, 4); // L: 1077
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1078
					class301.worldSelectArrows[3].drawAt(var42 + 15, 4);
				} else {
					class301.worldSelectArrows[1].drawAt(var42 + 15, 4); // L: 1079
				}

				var0.draw("Type", var42 + 32, 17, 16777215, -1); // L: 1080
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1082
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1083
			Login.hoveredWorldIndex = -1; // L: 1084
			if (EnumDefinition.worldSelectBackSprites != null) { // L: 1085
				var3 = 88; // L: 1086
				byte var35 = 19; // L: 1087
				var38 = 765 / (var3 + 1) - 1; // L: 1088
				var42 = 480 / (var35 + 1); // L: 1089

				do {
					var25 = var42; // L: 1091
					var8 = var38; // L: 1092
					if (var42 * (var38 - 1) >= World.World_count) { // L: 1093
						--var38;
					}

					if (var38 * (var42 - 1) >= World.World_count) { // L: 1094
						--var42;
					}

					if (var38 * (var42 - 1) >= World.World_count) { // L: 1095
						--var42;
					}
				} while(var25 != var42 || var8 != var38); // L: 1096

				var25 = (765 - var3 * var38) / (var38 + 1); // L: 1098
				if (var25 > 5) { // L: 1099
					var25 = 5;
				}

				var8 = (480 - var35 * var42) / (var42 + 1); // L: 1100
				if (var8 > 5) { // L: 1101
					var8 = 5;
				}

				int var28 = (765 - var3 * var38 - var25 * (var38 - 1)) / 2; // L: 1102
				var10 = (480 - var35 * var42 - var8 * (var42 - 1)) / 2; // L: 1103
				int var36 = (var42 + World.World_count - 1) / var42; // L: 1104
				Login.worldSelectPagesCount = var36 - var38; // L: 1105
				if (class323.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1106
					class323.worldSelectLeftSprite.drawAt(8, HealthBar.canvasHeight / 2 - class323.worldSelectLeftSprite.subHeight / 2); // L: 1107
				}

				if (class280.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1109
					class280.worldSelectRightSprite.drawAt(ItemContainer.canvasWidth - class280.worldSelectRightSprite.subWidth - 8, HealthBar.canvasHeight / 2 - class280.worldSelectRightSprite.subHeight / 2); // L: 1110
				}

				int var12 = var10 + 23; // L: 1112
				int var13 = var28 + Login.xPadding; // L: 1113
				int var14 = 0; // L: 1114
				boolean var15 = false; // L: 1115
				int var16 = Login.worldSelectPage; // L: 1116

				int var17;
				for (var17 = var42 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var38; ++var17) { // L: 1117 1118
					World var18 = DefaultsGroup.World_worlds[var17]; // L: 1121
					boolean var19 = true; // L: 1122
					String var20 = Integer.toString(var18.population); // L: 1123
					if (var18.population == -1) { // L: 1124
						var20 = "OFF"; // L: 1125
						var19 = false; // L: 1126
					} else if (var18.population > 1980) { // L: 1128
						var20 = "FULL"; // L: 1129
						var19 = false; // L: 1130
					}

					int var22 = 0; // L: 1133
					byte var21;
					if (var18.isBeta()) { // L: 1134
						if (var18.isMembersOnly()) { // L: 1135
							var21 = 7;
						} else {
							var21 = 6; // L: 1136
						}
					} else if (var18.isDeadman()) { // L: 1138
						var22 = 16711680; // L: 1139
						if (var18.isMembersOnly()) { // L: 1140
							var21 = 5;
						} else {
							var21 = 4; // L: 1141
						}
					} else if (var18.method1880()) { // L: 1143
						if (var18.isMembersOnly()) { // L: 1144
							var21 = 9;
						} else {
							var21 = 8; // L: 1145
						}
					} else if (var18.isPvp()) { // L: 1147
						if (var18.isMembersOnly()) { // L: 1148
							var21 = 3;
						} else {
							var21 = 2; // L: 1149
						}
					} else if (var18.isMembersOnly()) { // L: 1152
						var21 = 1;
					} else {
						var21 = 0; // L: 1153
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var35 + var12 && var19) { // L: 1155
						Login.hoveredWorldIndex = var17; // L: 1156
						EnumDefinition.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var12, 128, 16777215); // L: 1157
						var15 = true; // L: 1158
					} else {
						EnumDefinition.worldSelectBackSprites[var21].drawAt(var13, var12); // L: 1160
					}

					if (FaceNormal.worldSelectFlagSprites != null) { // L: 1161
						FaceNormal.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var35 / 2 + var12 + 5, var22, -1); // L: 1162
					var1.drawCentered(var20, var13 + 60, var35 / 2 + var12 + 5, 268435455, -1); // L: 1163
					var12 = var12 + var8 + var35; // L: 1164
					++var14; // L: 1165
					if (var14 >= var42) {
						var12 = var10 + 23; // L: 1166
						var13 = var13 + var25 + var3; // L: 1167
						var14 = 0; // L: 1168
						++var16; // L: 1169
					}
				}

				if (var15) { // L: 1172
					var17 = var1.stringWidth(DefaultsGroup.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1173
					int var29 = var1.ascent + 8; // L: 1174
					int var37 = MouseHandler.MouseHandler_y + 25; // L: 1175
					if (var37 + var29 > 480) { // L: 1176
						var37 = MouseHandler.MouseHandler_y - 25 - var29; // L: 1177
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 16777120); // L: 1179
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 0); // L: 1180
					var1.drawCentered(DefaultsGroup.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1); // L: 1181
				}
			}

			class22.rasterProvider.drawFull(0, 0); // L: 1184
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1188
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1189
			SecureRandomFuture.logoSprite.drawAt(Login.xPadding + 382 - SecureRandomFuture.logoSprite.subWidth / 2, 18); // L: 1190
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1191
				var3 = 20; // L: 1192
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1193
				var4 = 253 - var3; // L: 1194
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1195
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1196
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1197
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1198
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1199
			}

			String var5;
			String var6;
			String var7;
			short var30;
			short var32;
			if (Client.gameState == 20) { // L: 1201
				Tiles.titleboxSprite.drawAt(Login.loginBoxX + 180 - Tiles.titleboxSprite.subWidth / 2, 271 - Tiles.titleboxSprite.subHeight / 2); // L: 1202
				var30 = 201; // L: 1203
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1204
				var31 = var30 + 15; // L: 1205
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1206
				var31 += 15; // L: 1207
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1208
				var31 += 15; // L: 1209
				var31 += 7; // L: 1210
				if (Login.loginIndex != 4) { // L: 1211
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var31, 16777215, 0); // L: 1212
					var32 = 200; // L: 1213
					var5 = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? LoginPacket.method3747(Login.Login_username) : Login.Login_username; // L: 1216

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(0, var6.length() - 1)) { // L: 1218 1219 1220
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var31, 16777215, 0); // L: 1222
					var31 += 15; // L: 1223

					for (var7 = LoginPacket.method3747(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) { // L: 1224 1225 1226
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var31, 16777215, 0); // L: 1228
					var31 += 15; // L: 1229
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1232
				Tiles.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1233
				short var23;
				if (Login.loginIndex == 0) { // L: 1234
					var30 = 251; // L: 1235
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1236
					var31 = var30 + 30; // L: 1237
					var4 = Login.loginBoxX + 180 - 80; // L: 1238
					var23 = 291; // L: 1239
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1240
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1241
					var4 = Login.loginBoxX + 180 + 80; // L: 1242
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1243
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1244
				} else if (Login.loginIndex == 1) { // L: 1246
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1247
					var30 = 236; // L: 1248
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1249
					var31 = var30 + 15; // L: 1250
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1251
					var31 += 15; // L: 1252
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1253
					var31 += 15; // L: 1254
					var4 = Login.loginBoxX + 180 - 80; // L: 1255
					var23 = 321; // L: 1256
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1257
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1258
					var4 = Login.loginBoxX + 180 + 80; // L: 1259
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1260
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1261
				} else if (Login.loginIndex == 2) { // L: 1263
					var30 = 201; // L: 1264
					var0.drawCentered(Login.Login_response1, AttackOption.loginBoxCenter, var30, 16776960, 0); // L: 1265
					var31 = var30 + 15; // L: 1266
					var0.drawCentered(Login.Login_response2, AttackOption.loginBoxCenter, var31, 16776960, 0); // L: 1267
					var31 += 15; // L: 1268
					var0.drawCentered(Login.Login_response3, AttackOption.loginBoxCenter, var31, 16776960, 0); // L: 1269
					var31 += 15; // L: 1270
					var31 += 7; // L: 1271
					var0.draw("Login: ", AttackOption.loginBoxCenter - 110, var31, 16777215, 0); // L: 1272
					var32 = 200; // L: 1273
					var5 = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? LoginPacket.method3747(Login.Login_username) : Login.Login_username; // L: 1276

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) { // L: 1278 1279 1280
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), AttackOption.loginBoxCenter - 70, var31, 16777215, 0); // L: 1282
					var31 += 15; // L: 1283

					for (var7 = LoginPacket.method3747(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) { // L: 1284 1285 1286
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), AttackOption.loginBoxCenter - 108, var31, 16777215, 0); // L: 1288
					var31 += 15; // L: 1289
					var30 = 277; // L: 1290
					var8 = AttackOption.loginBoxCenter + -117; // L: 1291
					IndexedSprite var9 = TaskHandler.method3609(Client.Login_isUsernameRemembered, Login.field1230); // L: 1292
					var9.drawAt(var8, var30); // L: 1293
					var8 = var8 + var9.subWidth + 5; // L: 1294
					var1.draw("Remember username", var8, var30 + 13, 16776960, 0); // L: 1295
					var8 = AttackOption.loginBoxCenter + 24; // L: 1296
					var9 = TaskHandler.method3609(GrandExchangeOfferAgeComparator.clientPreferences.hideUsername, Login.field1229); // L: 1297
					var9.drawAt(var8, var30); // L: 1298
					var8 = var8 + var9.subWidth + 5; // L: 1299
					var1.draw("Hide username", var8, var30 + 13, 16776960, 0); // L: 1300
					var31 = var30 + 15; // L: 1301
					var10 = AttackOption.loginBoxCenter - 80; // L: 1302
					short var11 = 321; // L: 1303
					Login.titlebuttonSprite.drawAt(var10 - 73, var11 - 20); // L: 1304
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0); // L: 1305
					var10 = AttackOption.loginBoxCenter + 80; // L: 1306
					Login.titlebuttonSprite.drawAt(var10 - 73, var11 - 20); // L: 1307
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0); // L: 1308
					var30 = 357; // L: 1309
					switch(Login.field1217) { // L: 1310
					case 2:
						UserComparator10.field2002 = "Having trouble logging in?"; // L: 1315
						break;
					default:
						UserComparator10.field2002 = "Can't login? Click here."; // L: 1312
					}

					class89.field1163 = new Bounds(AttackOption.loginBoxCenter, var30, var1.stringWidth(UserComparator10.field2002), 11); // L: 1318
					ClientPreferences.field1089 = new Bounds(AttackOption.loginBoxCenter, var30, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1319
					var1.drawCentered(UserComparator10.field2002, AttackOption.loginBoxCenter, var30, 16777215, 0); // L: 1320
				} else if (Login.loginIndex == 3) { // L: 1322
					var30 = 201; // L: 1323
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1324
					var31 = var30 + 20; // L: 1325
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1326
					var31 += 15; // L: 1327
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1328
					var31 += 15; // L: 1329
					var4 = Login.loginBoxX + 180; // L: 1330
					var23 = 276; // L: 1331
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1332
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1333
					var4 = Login.loginBoxX + 180; // L: 1334
					var23 = 326; // L: 1335
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1336
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1337
				} else {
					short var34;
					if (Login.loginIndex == 4) { // L: 1339
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1340
						var30 = 236; // L: 1341
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1342
						var31 = var30 + 15; // L: 1343
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1344
						var31 += 15; // L: 1345
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1346
						var31 += 15; // L: 1347
						var0.draw("PIN: " + LoginPacket.method3747(EnumDefinition.otp) + (Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var31, 16777215, 0); // L: 1348
						var31 -= 8; // L: 1349
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var31, 16776960, 0); // L: 1350
						var31 += 15; // L: 1351
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var31, 16776960, 0); // L: 1352
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1353
						var38 = var31 - var0.ascent; // L: 1354
						IndexedSprite var33;
						if (Login.field1227) { // L: 1356
							var33 = Login.options_buttons_2Sprite; // L: 1357
						} else {
							var33 = Login.options_buttons_0Sprite; // L: 1360
						}

						var33.drawAt(var4, var38); // L: 1362
						var31 += 15; // L: 1363
						var25 = Login.loginBoxX + 180 - 80; // L: 1364
						var34 = 321; // L: 1365
						Login.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1366
						var0.drawCentered("Continue", var25, var34 + 5, 16777215, 0); // L: 1367
						var25 = Login.loginBoxX + 180 + 80; // L: 1368
						Login.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1369
						var0.drawCentered("Cancel", var25, var34 + 5, 16777215, 0); // L: 1370
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var34 + 36, 255, 0); // L: 1371
					} else if (Login.loginIndex == 5) { // L: 1373
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1374
						var30 = 221; // L: 1375
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1376
						var31 = var30 + 15; // L: 1377
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1378
						var31 += 15; // L: 1379
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1380
						var31 += 15; // L: 1381
						var31 += 14; // L: 1382
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var31, 16777215, 0); // L: 1383
						var32 = 174; // L: 1384
						var5 = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? LoginPacket.method3747(Login.Login_username) : Login.Login_username; // L: 1387

						for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) { // L: 1389 1390 1391
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? Client.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var31, 16777215, 0); // L: 1393
						var31 += 15; // L: 1394
						var25 = Login.loginBoxX + 180 - 80; // L: 1395
						var34 = 321; // L: 1396
						Login.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1397
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0); // L: 1398
						var25 = Login.loginBoxX + 180 + 80; // L: 1399
						Login.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1400
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0); // L: 1401
						var34 = 356; // L: 1402
						var1.drawCentered("Still having trouble logging in?", AttackOption.loginBoxCenter, var34, 268435455, 0); // L: 1403
					} else if (Login.loginIndex == 6) { // L: 1405
						var30 = 201; // L: 1406
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1407
						var31 = var30 + 15; // L: 1408
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1409
						var31 += 15; // L: 1410
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1411
						var31 += 15; // L: 1412
						var4 = Login.loginBoxX + 180; // L: 1413
						var23 = 321; // L: 1414
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1415
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1416
					} else if (Login.loginIndex == 7) { // L: 1418
						var30 = 216; // L: 1419
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1420
						var31 = var30 + 15; // L: 1421
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1422
						var31 += 15; // L: 1423
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1424
						var31 += 15; // L: 1425
						var4 = Login.loginBoxX + 180 - 80; // L: 1426
						var23 = 321; // L: 1427
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1428
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1429
						var4 = Login.loginBoxX + 180 + 80; // L: 1430
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1431
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1432
					} else if (Login.loginIndex == 8) { // L: 1434
						var30 = 216; // L: 1435
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1436
						var31 = var30 + 15; // L: 1437
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1438
						var31 += 15; // L: 1439
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1440
						var31 += 15; // L: 1441
						var4 = Login.loginBoxX + 180 - 80; // L: 1442
						var23 = 321; // L: 1443
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1444
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1445
						var4 = Login.loginBoxX + 180 + 80; // L: 1446
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1447
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1448
					} else if (Login.loginIndex == 12) { // L: 1450
						var30 = 201; // L: 1451
						String var24 = ""; // L: 1452
						var5 = ""; // L: 1453
						var6 = ""; // L: 1454
						switch(Login.field1216) { // L: 1455
						case 0:
							var24 = "Your account has been disabled."; // L: 1465
							var5 = Strings.field2839; // L: 1466
							var6 = ""; // L: 1467
							break; // L: 1468
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1458
							var5 = Strings.field3046; // L: 1459
							var6 = ""; // L: 1460
							break;
						default:
							HealthBar.Login_promptCredentials(false); // L: 1472
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1476
						var31 = var30 + 15; // L: 1477
						var2.drawCentered(var5, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1478
						var31 += 15; // L: 1479
						var2.drawCentered(var6, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1480
						var31 += 15; // L: 1481
						var25 = Login.loginBoxX + 180; // L: 1482
						var34 = 276; // L: 1483
						Login.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1484
						var0.drawCentered("Support Page", var25, var34 + 5, 16777215, 0); // L: 1485
						var25 = Login.loginBoxX + 180; // L: 1486
						var34 = 326; // L: 1487
						Login.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1488
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0); // L: 1489
					} else if (Login.loginIndex == 24) { // L: 1491
						var30 = 221; // L: 1492
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1493
						var31 = var30 + 15; // L: 1494
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1495
						var31 += 15; // L: 1496
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1497
						var31 += 15; // L: 1498
						var4 = Login.loginBoxX + 180; // L: 1499
						var23 = 301; // L: 1500
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1501
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1502
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1505
				int[] var26 = new int[4]; // L: 1506
				Rasterizer2D.Rasterizer2D_getClipArray(var26); // L: 1507
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, HealthBar.canvasHeight); // L: 1508
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1509
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1510
				Rasterizer2D.Rasterizer2D_setClipArray(var26); // L: 1511
			}

			DefaultsGroup.title_muteSprite[GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1513
			if (Client.gameState > 5 && Language.Language_EN == FontName.clientLanguage) { // L: 1514
				if (MouseHandler.field523 != null) { // L: 1515
					var31 = Login.xPadding + 5; // L: 1516
					var32 = 463; // L: 1517
					byte var40 = 100; // L: 1518
					byte var27 = 35; // L: 1519
					MouseHandler.field523.drawAt(var31, var32); // L: 1520
					var0.drawCentered("World" + " " + Client.worldId, var40 / 2 + var31, var27 / 2 + var32 - 2, 16777215, 0); // L: 1521
					if (class248.World_request != null) { // L: 1522
						var1.drawCentered("Loading...", var40 / 2 + var31, var27 / 2 + var32 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var40 / 2 + var31, var27 / 2 + var32 + 12, 16777215, 0); // L: 1523
					}
				} else {
					MouseHandler.field523 = Canvas.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOffer.archive8, "sl_button", ""); // L: 1526
				}
			}

		}
	} // L: 1186 1529
}
