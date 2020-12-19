import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1464759987
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -722850475
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lil;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1844563500"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method4305(var1) || this.archive.method4319(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lmu;I)I",
		garbageValue = "-737934411"
	)
	static final int method1232(LoginType var0) {
		if (var0 == null) { // L: 16
			return 12; // L: 17
		} else {
			switch(var0.field4067) { // L: 19
			case 2:
				return 20; // L: 21
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "919177129"
	)
	public static String method1229(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 58

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 59
			int var5 = var0[var4] & 255; // L: 60
			var3.append(class300.field3695[var5 >>> 2]); // L: 61
			if (var4 < var2 - 1) { // L: 62
				int var6 = var0[var4 + 1] & 255; // L: 63
				var3.append(class300.field3695[(var5 & 3) << 4 | var6 >>> 4]); // L: 64
				if (var4 < var2 - 2) { // L: 65
					int var7 = var0[var4 + 2] & 255; // L: 66
					var3.append(class300.field3695[(var6 & 15) << 2 | var7 >>> 6]).append(class300.field3695[var7 & 63]); // L: 67
				} else {
					var3.append(class300.field3695[(var6 & 15) << 2]).append("="); // L: 69
				}
			} else {
				var3.append(class300.field3695[(var5 & 3) << 4]).append("=="); // L: 71
			}
		}

		return var3.toString(); // L: 73
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lio;",
		garbageValue = "-12"
	)
	public static GameBuild method1225(int var0) {
		GameBuild[] var1 = class1.method11(); // L: 23

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 24
			GameBuild var3 = var1[var2]; // L: 25
			if (var0 == var3.buildId) {
				return var3; // L: 27
			}
		}

		return null; // L: 31
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;Lku;I)V",
		garbageValue = "1414133310"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (IgnoreList.canvasWidth - 765) / 2; // L: 960
		Login.loginBoxX = Login.xPadding + 202; // L: 961
		Login.loginBoxCenter = Login.loginBoxX + 180; // L: 962
		byte var3;
		int var4;
		int var9;
		int var11;
		int var26;
		int var27;
		int var32;
		int var39;
		if (Login.worldSelectOpen) { // L: 963
			if (class301.worldSelectBackSprites == null) { // L: 965
				class301.worldSelectBackSprites = class280.method5008(Messages.archive8, "sl_back", "");
			}

			if (class90.worldSelectFlagSprites == null) { // L: 966
				class90.worldSelectFlagSprites = class89.method2123(Messages.archive8, "sl_flags", "");
			}

			if (WorldMapSectionType.worldSelectArrows == null) { // L: 967
				WorldMapSectionType.worldSelectArrows = class89.method2123(Messages.archive8, "sl_arrows", "");
			}

			if (class349.worldSelectStars == null) { // L: 968
				class349.worldSelectStars = class89.method2123(Messages.archive8, "sl_stars", "");
			}

			if (VerticalAlignment.worldSelectLeftSprite == null) { // L: 969
				VerticalAlignment.worldSelectLeftSprite = class51.SpriteBuffer_getIndexedSpriteByName(Messages.archive8, "leftarrow", "");
			}

			if (class8.worldSelectRightSprite == null) { // L: 970
				class8.worldSelectRightSprite = class51.SpriteBuffer_getIndexedSpriteByName(Messages.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 971
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 972
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 973
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 974
			if (class349.worldSelectStars != null) { // L: 975
				class349.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 976
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 977
				class349.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 978
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 979
			}

			int var40;
			if (WorldMapSectionType.worldSelectArrows != null) { // L: 981
				var32 = Login.xPadding + 280; // L: 982
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 983
					WorldMapSectionType.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var32, 4); // L: 984
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 985
					WorldMapSectionType.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var32 + 15, 4); // L: 986
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1); // L: 987
				var4 = Login.xPadding + 390; // L: 988
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 989
					WorldMapSectionType.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var4, 4); // L: 990
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 991
					WorldMapSectionType.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 992
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 993
				var40 = Login.xPadding + 500; // L: 994
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 995
					WorldMapSectionType.worldSelectArrows[2].drawAt(var40, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var40, 4); // L: 996
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 997
					WorldMapSectionType.worldSelectArrows[3].drawAt(var40 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var40 + 15, 4); // L: 998
				}

				var0.draw("Location", var40 + 32, 17, 16777215, -1); // L: 999
				var27 = Login.xPadding + 610; // L: 1000
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1001
					WorldMapSectionType.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[0].drawAt(var27, 4); // L: 1002
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1003
					WorldMapSectionType.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					WorldMapSectionType.worldSelectArrows[1].drawAt(var27 + 15, 4); // L: 1004
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1); // L: 1005
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1007
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1008
			Login.hoveredWorldIndex = -1; // L: 1009
			if (class301.worldSelectBackSprites != null) { // L: 1010
				var3 = 88; // L: 1011
				byte var34 = 19; // L: 1012
				var40 = 765 / (var3 + 1) - 1; // L: 1013
				var27 = 480 / (var34 + 1); // L: 1014

				do {
					var39 = var27; // L: 1016
					var26 = var40; // L: 1017
					if (var27 * (var40 - 1) >= World.World_count) { // L: 1018
						--var40;
					}

					if (var40 * (var27 - 1) >= World.World_count) { // L: 1019
						--var27;
					}

					if (var40 * (var27 - 1) >= World.World_count) { // L: 1020
						--var27;
					}
				} while(var39 != var27 || var26 != var40); // L: 1021

				var39 = (765 - var3 * var40) / (var40 + 1); // L: 1023
				if (var39 > 5) { // L: 1024
					var39 = 5;
				}

				var26 = (480 - var34 * var27) / (var27 + 1); // L: 1025
				if (var26 > 5) { // L: 1026
					var26 = 5;
				}

				var9 = (765 - var40 * var3 - var39 * (var40 - 1)) / 2; // L: 1027
				int var29 = (480 - var27 * var34 - var26 * (var27 - 1)) / 2; // L: 1028
				var11 = (var27 + World.World_count - 1) / var27; // L: 1029
				Login.worldSelectPagesCount = var11 - var40; // L: 1030
				if (VerticalAlignment.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1031
					VerticalAlignment.worldSelectLeftSprite.drawAt(8, ModelData0.canvasHeight / 2 - VerticalAlignment.worldSelectLeftSprite.subHeight / 2); // L: 1032
				}

				if (class8.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1034
					class8.worldSelectRightSprite.drawAt(IgnoreList.canvasWidth - class8.worldSelectRightSprite.subWidth - 8, ModelData0.canvasHeight / 2 - class8.worldSelectRightSprite.subHeight / 2); // L: 1035
				}

				int var36 = var29 + 23; // L: 1037
				int var13 = var9 + Login.xPadding; // L: 1038
				int var14 = 0; // L: 1039
				boolean var15 = false; // L: 1040
				int var16 = Login.worldSelectPage; // L: 1041

				int var17;
				for (var17 = var16 * var27; var17 < World.World_count && var16 - Login.worldSelectPage < var40; ++var17) { // L: 1042 1043
					World var18 = World.World_worlds[var17]; // L: 1046
					boolean var19 = true; // L: 1047
					String var20 = Integer.toString(var18.population); // L: 1048
					if (var18.population == -1) { // L: 1049
						var20 = "OFF"; // L: 1050
						var19 = false; // L: 1051
					} else if (var18.population > 1980) { // L: 1053
						var20 = "FULL"; // L: 1054
						var19 = false; // L: 1055
					}

					int var22 = 0; // L: 1058
					byte var21;
					if (var18.isBeta()) { // L: 1059
						if (var18.isMembersOnly()) { // L: 1060
							var21 = 7;
						} else {
							var21 = 6; // L: 1061
						}
					} else if (var18.isDeadman()) { // L: 1063
						var22 = 16711680; // L: 1064
						if (var18.isMembersOnly()) { // L: 1065
							var21 = 5;
						} else {
							var21 = 4; // L: 1066
						}
					} else if (var18.method1845()) { // L: 1068
						if (var18.isMembersOnly()) { // L: 1069
							var21 = 9;
						} else {
							var21 = 8; // L: 1070
						}
					} else if (var18.isPvp()) { // L: 1072
						if (var18.isMembersOnly()) { // L: 1073
							var21 = 3;
						} else {
							var21 = 2; // L: 1074
						}
					} else if (var18.isMembersOnly()) { // L: 1077
						var21 = 1;
					} else {
						var21 = 0; // L: 1078
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var36 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var34 + var36 && var19) { // L: 1080
						Login.hoveredWorldIndex = var17; // L: 1081
						class301.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var36, 128, 16777215); // L: 1082
						var15 = true; // L: 1083
					} else {
						class301.worldSelectBackSprites[var21].drawAt(var13, var36); // L: 1085
					}

					if (class90.worldSelectFlagSprites != null) { // L: 1086
						class90.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var36);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var34 / 2 + var36 + 5, var22, -1); // L: 1087
					var1.drawCentered(var20, var13 + 60, var34 / 2 + var36 + 5, 268435455, -1); // L: 1088
					var36 = var36 + var34 + var26; // L: 1089
					++var14; // L: 1090
					if (var14 >= var27) {
						var36 = var29 + 23; // L: 1091
						var13 = var13 + var39 + var3; // L: 1092
						var14 = 0; // L: 1093
						++var16; // L: 1094
					}
				}

				if (var15) { // L: 1097
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1098
					int var30 = var1.ascent + 8; // L: 1099
					int var37 = MouseHandler.MouseHandler_y + 25; // L: 1100
					if (var37 + var30 > 480) { // L: 1101
						var37 = MouseHandler.MouseHandler_y - 25 - var30; // L: 1102
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var30, 16777120); // L: 1104
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var30, 0); // L: 1105
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1); // L: 1106
				}
			}

			WorldMapIcon_0.rasterProvider.drawFull(0, 0); // L: 1109
		} else {
			class25.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1113
			class224.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1114
			class224.logoSprite.drawAt(Login.xPadding + 382 - class224.logoSprite.subWidth / 2, 18); // L: 1115
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1116
				var3 = 20; // L: 1117
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1118
				var4 = 253 - var3; // L: 1119
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1120
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1121
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1122
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1123
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1124
			}

			String var5;
			String var7;
			String var8;
			char[] var10;
			short var31;
			short var33;
			if (Client.gameState == 20) { // L: 1126
				WorldMapEvent.titleboxSprite.drawAt(Login.loginBoxX + 180 - WorldMapEvent.titleboxSprite.subWidth / 2, 271 - WorldMapEvent.titleboxSprite.subHeight / 2); // L: 1127
				var31 = 201; // L: 1128
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1129
				var32 = var31 + 15; // L: 1130
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1131
				var32 += 15; // L: 1132
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1133
				var32 += 15; // L: 1134
				var32 += 7; // L: 1135
				if (Login.loginIndex != 4) { // L: 1136
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0); // L: 1137
					var33 = 200; // L: 1138

					for (var5 = LoginPacket.method3674(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) { // L: 1139 1140 1141
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0); // L: 1143
					var32 += 15; // L: 1144
					var7 = Login.Login_password; // L: 1146
					var9 = var7.length(); // L: 1149
					var10 = new char[var9]; // L: 1151

					for (var11 = 0; var11 < var9; ++var11) { // L: 1152
						var10[var11] = '*';
					}

					var8 = new String(var10); // L: 1153

					for (var8 = var8; var0.stringWidth(var8) > var33; var8 = var8.substring(1)) { // L: 1157 1158 1159
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1161
					var32 += 15; // L: 1162
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1165
				WorldMapEvent.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1166
				short var23;
				if (Login.loginIndex == 0) { // L: 1167
					var31 = 251; // L: 1168
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1169
					var32 = var31 + 30; // L: 1170
					var4 = Login.loginBoxX + 180 - 80; // L: 1171
					var23 = 291; // L: 1172
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1173
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1174
					var4 = Login.loginBoxX + 180 + 80; // L: 1175
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1176
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1177
				} else if (Login.loginIndex == 1) { // L: 1179
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1180
					var31 = 236; // L: 1181
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1182
					var32 = var31 + 15; // L: 1183
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1184
					var32 += 15; // L: 1185
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1186
					var32 += 15; // L: 1187
					var4 = Login.loginBoxX + 180 - 80; // L: 1188
					var23 = 321; // L: 1189
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1190
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1191
					var4 = Login.loginBoxX + 180 + 80; // L: 1192
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1193
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1194
				} else {
					short var12;
					IndexedSprite var35;
					if (Login.loginIndex == 2) { // L: 1196
						var31 = 201; // L: 1197
						var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var31, 16776960, 0); // L: 1198
						var32 = var31 + 15; // L: 1199
						var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var32, 16776960, 0); // L: 1200
						var32 += 15; // L: 1201
						var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var32, 16776960, 0); // L: 1202
						var32 += 15; // L: 1203
						var32 += 7; // L: 1204
						var0.draw("Login: ", Login.loginBoxCenter - 110, var32, 16777215, 0); // L: 1205
						var33 = 200; // L: 1206

						for (var5 = LoginPacket.method3674(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1207 1208 1209
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var32, 16777215, 0); // L: 1211
						var32 += 15; // L: 1212
						var7 = Login.Login_password; // L: 1214
						var9 = var7.length(); // L: 1217
						var10 = new char[var9]; // L: 1219

						for (var11 = 0; var11 < var9; ++var11) { // L: 1220
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1221

						for (var8 = var8; var0.stringWidth(var8) > var33; var8 = var8.substring(1)) { // L: 1225 1226 1227
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var32, 16777215, 0); // L: 1229
						var32 += 15; // L: 1230
						var31 = 277; // L: 1231
						var9 = Login.loginBoxCenter + -117; // L: 1232
						var35 = Strings.method4158(Client.Login_isUsernameRemembered, Login.field1192); // L: 1233
						var35.drawAt(var9, var31); // L: 1234
						var9 = var9 + var35.subWidth + 5; // L: 1235
						var1.draw("Remember username", var9, var31 + 13, 16776960, 0); // L: 1236
						var9 = Login.loginBoxCenter + 24; // L: 1237
						var35 = Strings.method4158(Timer.clientPreferences.hideUsername, Login.field1180); // L: 1238
						var35.drawAt(var9, var31); // L: 1239
						var9 = var9 + var35.subWidth + 5; // L: 1240
						var1.draw("Hide username", var9, var31 + 13, 16776960, 0); // L: 1241
						var32 = var31 + 15; // L: 1242
						var11 = Login.loginBoxCenter - 80; // L: 1243
						var12 = 321; // L: 1244
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1245
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0); // L: 1246
						var11 = Login.loginBoxCenter + 80; // L: 1247
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1248
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1249
						var31 = 357; // L: 1250
						switch(Login.field1190) { // L: 1251
						case 2:
							class22.field107 = "Having trouble logging in?"; // L: 1253
							break;
						default:
							class22.field107 = "Can't login? Click here."; // L: 1256
						}

						GameShell.field481 = new Bounds(Login.loginBoxCenter, var31, var1.stringWidth(class22.field107), 11); // L: 1259
						GrandExchangeOfferOwnWorldComparator.field643 = new Bounds(Login.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1260
						var1.drawCentered(class22.field107, Login.loginBoxCenter, var31, 16777215, 0); // L: 1261
					} else if (Login.loginIndex == 3) { // L: 1263
						var31 = 201; // L: 1264
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1265
						var32 = var31 + 20; // L: 1266
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1267
						var32 += 15; // L: 1268
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1269
						var32 += 15; // L: 1270
						var4 = Login.loginBoxX + 180; // L: 1271
						var23 = 276; // L: 1272
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1273
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1274
						var4 = Login.loginBoxX + 180; // L: 1275
						var23 = 326; // L: 1276
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1277
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1278
					} else if (Login.loginIndex == 4) { // L: 1280
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1281
						var31 = 236; // L: 1282
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1283
						var32 = var31 + 15; // L: 1284
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1285
						var32 += 15; // L: 1286
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1287
						var32 += 15; // L: 1288
						var5 = "PIN: "; // L: 1290
						var7 = SecureRandomCallable.otp; // L: 1292
						var9 = var7.length(); // L: 1295
						var10 = new char[var9]; // L: 1297

						for (var11 = 0; var11 < var9; ++var11) { // L: 1298
							var10[var11] = '*';
						}

						var8 = new String(var10); // L: 1299
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0); // L: 1303
						var32 -= 8; // L: 1304
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1305
						var32 += 15; // L: 1306
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0); // L: 1307
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1308
						var9 = var32 - var0.ascent; // L: 1309
						if (Login.field1200) { // L: 1311
							var35 = ItemContainer.options_buttons_2Sprite; // L: 1312
						} else {
							var35 = DirectByteArrayCopier.options_buttons_0Sprite; // L: 1315
						}

						var35.drawAt(var26, var9); // L: 1317
						var32 += 15; // L: 1318
						var11 = Login.loginBoxX + 180 - 80; // L: 1319
						var12 = 321; // L: 1320
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1321
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0); // L: 1322
						var11 = Login.loginBoxX + 180 + 80; // L: 1323
						Login.titlebuttonSprite.drawAt(var11 - 73, var12 - 20); // L: 1324
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0); // L: 1325
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0); // L: 1326
					} else if (Login.loginIndex == 5) { // L: 1328
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1329
						var31 = 221; // L: 1330
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1331
						var32 = var31 + 15; // L: 1332
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1333
						var32 += 15; // L: 1334
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1335
						var32 += 15; // L: 1336
						var32 += 14; // L: 1337
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0); // L: 1338
						var33 = 174; // L: 1339

						for (var5 = LoginPacket.method3674(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) { // L: 1340 1341 1342
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class23.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0); // L: 1344
						var32 += 15; // L: 1345
						var27 = Login.loginBoxX + 180 - 80; // L: 1346
						short var25 = 321; // L: 1347
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20); // L: 1348
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0); // L: 1349
						var27 = Login.loginBoxX + 180 + 80; // L: 1350
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20); // L: 1351
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0); // L: 1352
						var25 = 356; // L: 1353
						var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var25, 268435455, 0); // L: 1354
					} else if (Login.loginIndex == 6) { // L: 1356
						var31 = 201; // L: 1357
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1358
						var32 = var31 + 15; // L: 1359
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1360
						var32 += 15; // L: 1361
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1362
						var32 += 15; // L: 1363
						var4 = Login.loginBoxX + 180; // L: 1364
						var23 = 321; // L: 1365
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1366
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1367
					} else if (Login.loginIndex == 7) { // L: 1369
						var31 = 216; // L: 1370
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1371
						var32 = var31 + 15; // L: 1372
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1373
						var32 += 15; // L: 1374
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1375
						var32 += 15; // L: 1376
						var4 = Login.loginBoxX + 180 - 80; // L: 1377
						var23 = 321; // L: 1378
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1379
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1380
						var4 = Login.loginBoxX + 180 + 80; // L: 1381
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1382
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1383
					} else if (Login.loginIndex == 8) { // L: 1385
						var31 = 216; // L: 1386
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0); // L: 1387
						var32 = var31 + 15; // L: 1388
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1389
						var32 += 15; // L: 1390
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1391
						var32 += 15; // L: 1392
						var4 = Login.loginBoxX + 180 - 80; // L: 1393
						var23 = 321; // L: 1394
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1395
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1396
						var4 = Login.loginBoxX + 180 + 80; // L: 1397
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1398
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1399
					} else if (Login.loginIndex == 12) { // L: 1401
						var31 = 201; // L: 1402
						String var24 = ""; // L: 1403
						var5 = ""; // L: 1404
						String var6 = ""; // L: 1405
						switch(Login.field1199) { // L: 1406
						case 0:
							var24 = "Your account has been disabled."; // L: 1409
							var5 = Strings.field3011; // L: 1410
							var6 = ""; // L: 1411
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1416
							var5 = Strings.field2877; // L: 1417
							var6 = ""; // L: 1418
							break; // L: 1419
						default:
							AbstractWorldMapIcon.Login_promptCredentials(false); // L: 1423
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0); // L: 1427
						var32 = var31 + 15; // L: 1428
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1429
						var32 += 15; // L: 1430
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1431
						var32 += 15; // L: 1432
						var39 = Login.loginBoxX + 180; // L: 1433
						short var41 = 276; // L: 1434
						Login.titlebuttonSprite.drawAt(var39 - 73, var41 - 20); // L: 1435
						var0.drawCentered("Support Page", var39, var41 + 5, 16777215, 0); // L: 1436
						var39 = Login.loginBoxX + 180; // L: 1437
						var41 = 326; // L: 1438
						Login.titlebuttonSprite.drawAt(var39 - 73, var41 - 20); // L: 1439
						var0.drawCentered("Back", var39, var41 + 5, 16777215, 0); // L: 1440
					} else if (Login.loginIndex == 24) { // L: 1442
						var31 = 221; // L: 1443
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0); // L: 1444
						var32 = var31 + 15; // L: 1445
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1446
						var32 += 15; // L: 1447
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1448
						var32 += 15; // L: 1449
						var4 = Login.loginBoxX + 180; // L: 1450
						var23 = 301; // L: 1451
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1452
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1453
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1456
				int[] var28 = new int[4]; // L: 1457
				Rasterizer2D.Rasterizer2D_getClipArray(var28); // L: 1458
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, ModelData0.canvasHeight); // L: 1459
				class1.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1460
				class1.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1461
				Rasterizer2D.Rasterizer2D_setClipArray(var28); // L: 1462
			}

			Login.title_muteSprite[Timer.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1464
			if (Client.gameState > 5 && Language.Language_EN == WorldMapScaleHandler.clientLanguage) { // L: 1465
				if (class9.field42 != null) { // L: 1466
					var32 = Login.xPadding + 5; // L: 1467
					var33 = 463; // L: 1468
					byte var38 = 100; // L: 1469
					byte var42 = 35; // L: 1470
					class9.field42.drawAt(var32, var33); // L: 1471
					var0.drawCentered("World" + " " + Client.worldId, var38 / 2 + var32, var42 / 2 + var33 - 2, 16777215, 0); // L: 1472
					if (World.World_request != null) { // L: 1473
						var1.drawCentered("Loading...", var38 / 2 + var32, var42 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var38 / 2 + var32, var42 / 2 + var33 + 12, 16777215, 0); // L: 1474
					}
				} else {
					class9.field42 = class51.SpriteBuffer_getIndexedSpriteByName(Messages.archive8, "sl_button", ""); // L: 1477
				}
			}

		}
	} // L: 1111 1480

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-2003250230"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 6916

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6917 6918 6923
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 6919
				var9 = var10; // L: 6920
				break;
			}
		}

		if (var9 == null) { // L: 6925
			var9 = new PendingSpawn(); // L: 6926
			var9.plane = var0; // L: 6927
			var9.type = var3; // L: 6928
			var9.x = var1; // L: 6929
			var9.y = var2; // L: 6930
			class7.method86(var9); // L: 6931
			Client.pendingSpawns.addFirst(var9); // L: 6932
		}

		var9.id = var4; // L: 6934
		var9.field933 = var5; // L: 6935
		var9.orientation = var6; // L: 6936
		var9.delay = var7; // L: 6937
		var9.hitpoints = var8; // L: 6938
	} // L: 6939

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "636889033"
	)
	static String method1230(int var0) {
		if (var0 < 0) { // L: 8555
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0]; // L: 8556 8557
		}
	}
}
