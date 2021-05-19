import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("y")
public class class23 extends class14 {
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1382596605
	)
	int field191;
	@ObfuscatedName("c")
	byte field190;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field191 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field191 = var1.readUnsignedShort(); // L: 134
		this.field190 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.method191(this.field191, this.field190); // L: 139
	} // L: 140

	@ObfuscatedName("h")
	public static final int method309(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = (var2 + 1.0D) * var4;
			} else {
				var12 = var2 + var4 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (var16 * 6.0D < 1.0D) { // L: 22
				var6 = var14 + var16 * (var12 - var14) * 6.0D;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (3.0D * var16 < 2.0D) {
				var6 = (var12 - var14) * (0.6666666666666666D - var16) * 6.0D + var14;
			} else {
				var6 = var14;
			}

			if (6.0D * var0 < 1.0D) {
				var8 = var0 * (var12 - var14) * 6.0D + var14;
			} else if (var0 * 2.0D < 1.0D) {
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14;
			} else {
				var8 = var14;
			}

			if (var20 * 6.0D < 1.0D) {
				var10 = 6.0D * (var12 - var14) * var20 + var14;
			} else if (var20 * 2.0D < 1.0D) {
				var10 = var12;
			} else if (var20 * 3.0D < 2.0D) {
				var10 = 6.0D * (var12 - var14) * (0.6666666666666666D - var20) + var14;
			} else {
				var10 = var14;
			}
		}

		int var22 = (int)(256.0D * var6);
		int var13 = (int)(256.0D * var8);
		int var23 = (int)(256.0D * var10);
		int var15 = var23 + (var13 << 8) + (var22 << 16);
		return var15; // L: 39
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(ILnk;I)Lea;",
		garbageValue = "-344240049"
	)
	public static class135 method310(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class135 var5 = new class135(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1527 != null && var7.length == var5.field1527.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1527[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1531 != null && var7.length == var5.field1531.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1531[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-686734686"
	)
	static boolean method308(String var0) {
		if (var0 == null) { // L: 163
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 170
			} catch (MalformedURLException var2) { // L: 167
				return false; // L: 168
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkc;Lkc;Lkc;B)V",
		garbageValue = "46"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2; // L: 993
		Login.loginBoxX = Login.xPadding + 202; // L: 994
		class21.loginBoxCenter = Login.loginBoxX + 180; // L: 995
		byte var3;
		int var4;
		int var7;
		int var8;
		int var11;
		int var12;
		int var25;
		int var33;
		int var37;
		if (Login.worldSelectOpen) { // L: 996
			int var46;
			if (Login.worldSelectBackSprites == null) { // L: 998
				Archive var43 = class43.archive8; // L: 1000
				var46 = var43.getGroupId("sl_back"); // L: 1002
				var25 = var43.getFileId(var46, ""); // L: 1003
				SpritePixels[] var49 = class253.method4767(var43, var46, var25); // L: 1004
				Login.worldSelectBackSprites = var49; // L: 1006
			}

			if (UserComparator5.worldSelectFlagSprites == null) { // L: 1008
				UserComparator5.worldSelectFlagSprites = GameObject.method4235(class43.archive8, "sl_flags", "");
			}

			if (Login.worldSelectArrows == null) { // L: 1009
				Login.worldSelectArrows = GameObject.method4235(class43.archive8, "sl_arrows", "");
			}

			if (AbstractWorldMapIcon.worldSelectStars == null) { // L: 1010
				AbstractWorldMapIcon.worldSelectStars = GameObject.method4235(class43.archive8, "sl_stars", "");
			}

			if (class285.worldSelectLeftSprite == null) { // L: 1011
				class285.worldSelectLeftSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(class43.archive8, "leftarrow", "");
			}

			if (User.worldSelectRightSprite == null) { // L: 1012
				User.worldSelectRightSprite = MenuAction.SpriteBuffer_getIndexedSpriteByName(class43.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1013
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1014
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1015
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1016
			if (AbstractWorldMapIcon.worldSelectStars != null) { // L: 1017
				AbstractWorldMapIcon.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1018
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1019
				AbstractWorldMapIcon.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1020
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1021
			}

			if (Login.worldSelectArrows != null) { // L: 1023
				var33 = Login.xPadding + 280; // L: 1024
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1025
					Login.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var33, 4); // L: 1026
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1027
					Login.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var33 + 15, 4); // L: 1028
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1); // L: 1029
				var4 = Login.xPadding + 390; // L: 1030
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1031
					Login.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var4, 4); // L: 1032
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1033
					Login.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1034
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1035
				var46 = Login.xPadding + 500; // L: 1036
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1037
					Login.worldSelectArrows[2].drawAt(var46, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var46, 4); // L: 1038
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1039
					Login.worldSelectArrows[3].drawAt(var46 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var46 + 15, 4); // L: 1040
				}

				var0.draw("Location", var46 + 32, 17, 16777215, -1); // L: 1041
				var25 = Login.xPadding + 610; // L: 1042
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1043
					Login.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					Login.worldSelectArrows[0].drawAt(var25, 4); // L: 1044
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1045
					Login.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					Login.worldSelectArrows[1].drawAt(var25 + 15, 4); // L: 1046
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1); // L: 1047
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1049
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1050
			Login.hoveredWorldIndex = -1; // L: 1051
			if (Login.worldSelectBackSprites != null) { // L: 1052
				var3 = 88; // L: 1053
				byte var38 = 19; // L: 1054
				var46 = 765 / (var3 + 1) - 1; // L: 1055
				var25 = 480 / (var38 + 1); // L: 1056

				do {
					var7 = var25; // L: 1058
					var8 = var46; // L: 1059
					if (var25 * (var46 - 1) >= World.World_count) { // L: 1060
						--var46;
					}

					if (var46 * (var25 - 1) >= World.World_count) { // L: 1061
						--var25;
					}

					if (var46 * (var25 - 1) >= World.World_count) { // L: 1062
						--var25;
					}
				} while(var25 != var7 || var8 != var46); // L: 1063

				var7 = (765 - var46 * var3) / (var46 + 1); // L: 1065
				if (var7 > 5) { // L: 1066
					var7 = 5;
				}

				var8 = (480 - var25 * var38) / (var25 + 1); // L: 1067
				if (var8 > 5) { // L: 1068
					var8 = 5;
				}

				var37 = (765 - var3 * var46 - var7 * (var46 - 1)) / 2; // L: 1069
				int var48 = (480 - var38 * var25 - var8 * (var25 - 1)) / 2; // L: 1070
				var11 = (var25 + World.World_count - 1) / var25; // L: 1071
				Login.worldSelectPagesCount = var11 - var46; // L: 1072
				if (class285.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1073
					class285.worldSelectLeftSprite.drawAt(8, HealthBarDefinition.canvasHeight / 2 - class285.worldSelectLeftSprite.subHeight / 2); // L: 1074
				}

				if (User.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1076
					User.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - User.worldSelectRightSprite.subWidth - 8, HealthBarDefinition.canvasHeight / 2 - User.worldSelectRightSprite.subHeight / 2); // L: 1077
				}

				var12 = var48 + 23; // L: 1079
				int var41 = var37 + Login.xPadding; // L: 1080
				int var14 = 0; // L: 1081
				boolean var15 = false; // L: 1082
				int var16 = Login.worldSelectPage; // L: 1083

				int var17;
				for (var17 = var16 * var25; var17 < World.World_count && var16 - Login.worldSelectPage < var46; ++var17) { // L: 1084 1085
					World var18 = Messages.World_worlds[var17]; // L: 1088
					boolean var19 = true; // L: 1089
					String var20 = Integer.toString(var18.population); // L: 1090
					if (var18.population == -1) { // L: 1091
						var20 = "OFF"; // L: 1092
						var19 = false; // L: 1093
					} else if (var18.population > 1980) { // L: 1095
						var20 = "FULL"; // L: 1096
						var19 = false; // L: 1097
					}

					int var22 = 0; // L: 1100
					byte var21;
					if (var18.isBeta()) { // L: 1101
						if (var18.isMembersOnly()) { // L: 1102
							var21 = 7;
						} else {
							var21 = 6; // L: 1103
						}
					} else if (var18.isDeadman()) { // L: 1105
						var22 = 16711680; // L: 1106
						if (var18.isMembersOnly()) { // L: 1107
							var21 = 5;
						} else {
							var21 = 4; // L: 1108
						}
					} else if (var18.method1689()) { // L: 1110
						if (var18.isMembersOnly()) { // L: 1111
							var21 = 9;
						} else {
							var21 = 8; // L: 1112
						}
					} else if (var18.isPvp()) { // L: 1114
						if (var18.isMembersOnly()) { // L: 1115
							var21 = 3;
						} else {
							var21 = 2; // L: 1116
						}
					} else if (var18.isMembersOnly()) { // L: 1119
						var21 = 1;
					} else {
						var21 = 0; // L: 1120
					}

					if (MouseHandler.MouseHandler_x >= var41 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var41 + var3 && MouseHandler.MouseHandler_y < var12 + var38 && var19) { // L: 1122
						Login.hoveredWorldIndex = var17; // L: 1123
						Login.worldSelectBackSprites[var21].drawTransOverlayAt(var41, var12, 128, 16777215); // L: 1124
						var15 = true; // L: 1125
					} else {
						Login.worldSelectBackSprites[var21].drawAt(var41, var12); // L: 1127
					}

					if (UserComparator5.worldSelectFlagSprites != null) { // L: 1128
						UserComparator5.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var41 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var41 + 15, var38 / 2 + var12 + 5, var22, -1); // L: 1129
					var1.drawCentered(var20, var41 + 60, var38 / 2 + var12 + 5, 268435455, -1); // L: 1130
					var12 = var12 + var38 + var8; // L: 1131
					++var14; // L: 1132
					if (var14 >= var25) {
						var12 = var48 + 23; // L: 1133
						var41 = var41 + var3 + var7; // L: 1134
						var14 = 0; // L: 1135
						++var16; // L: 1136
					}
				}

				if (var15) { // L: 1139
					var17 = var1.stringWidth(Messages.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1140
					int var31 = var1.ascent + 8; // L: 1141
					int var42 = MouseHandler.MouseHandler_y + 25; // L: 1142
					if (var31 + var42 > 480) { // L: 1143
						var42 = MouseHandler.MouseHandler_y - 25 - var31; // L: 1144
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var31, 16777120); // L: 1146
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var31, 0); // L: 1147
					var1.drawCentered(Messages.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1); // L: 1148
				}
			}

			WorldMapDecorationType.rasterProvider.drawFull(0, 0); // L: 1151
		} else {
			Canvas.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1155
			class12.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1156
			FontName.logoSprite.drawAt(Login.xPadding + 382 - FontName.logoSprite.subWidth / 2, 18); // L: 1157
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1158
				var3 = 20; // L: 1159
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1160
				var4 = 253 - var3; // L: 1161
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1162
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1163
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1164
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1165
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1166
			}

			String var5;
			String var6;
			short var32;
			short var34;
			if (Client.gameState == 20) { // L: 1168
				ItemContainer.titleboxSprite.drawAt(Login.loginBoxX + 180 - ItemContainer.titleboxSprite.subWidth / 2, 271 - ItemContainer.titleboxSprite.subHeight / 2); // L: 1169
				var32 = 201; // L: 1170
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1171
				var33 = var32 + 15; // L: 1172
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1173
				var33 += 15; // L: 1174
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1175
				var33 += 15; // L: 1176
				var33 += 7; // L: 1177
				if (Login.loginIndex != 4) { // L: 1178
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0); // L: 1179
					var34 = 200; // L: 1180

					for (var5 = class25.method316(); var0.stringWidth(var5) > var34; var5 = var5.substring(0, var5.length() - 1)) { // L: 1181 1182 1183
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var33, 16777215, 0); // L: 1185
					var33 += 15; // L: 1186

					for (var6 = SecureRandomCallable.method2081(Login.Login_password); var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1187 1188 1189
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1191
					var33 += 15; // L: 1192
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1195
				ItemContainer.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1196
				short var23;
				if (Login.loginIndex == 0) { // L: 1197
					var32 = 251; // L: 1198
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1199
					var33 = var32 + 30; // L: 1200
					var4 = Login.loginBoxX + 180 - 80; // L: 1201
					var23 = 291; // L: 1202
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1203
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1204
					var4 = Login.loginBoxX + 180 + 80; // L: 1205
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1206
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1207
				} else if (Login.loginIndex == 1) { // L: 1209
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1210
					var32 = 236; // L: 1211
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1212
					var33 = var32 + 15; // L: 1213
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1214
					var33 += 15; // L: 1215
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1216
					var33 += 15; // L: 1217
					var4 = Login.loginBoxX + 180 - 80; // L: 1218
					var23 = 321; // L: 1219
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1220
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1221
					var4 = Login.loginBoxX + 180 + 80; // L: 1222
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1223
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1224
				} else if (Login.loginIndex == 2) { // L: 1226
					var32 = 201; // L: 1227
					var0.drawCentered(Login.Login_response1, class21.loginBoxCenter, var32, 16776960, 0); // L: 1228
					var33 = var32 + 15; // L: 1229
					var0.drawCentered(Login.Login_response2, class21.loginBoxCenter, var33, 16776960, 0); // L: 1230
					var33 += 15; // L: 1231
					var0.drawCentered(Login.Login_response3, class21.loginBoxCenter, var33, 16776960, 0); // L: 1232
					var33 += 15; // L: 1233
					var33 += 7; // L: 1234
					var0.draw("Login: ", class21.loginBoxCenter - 110, var33, 16777215, 0); // L: 1235
					var34 = 200; // L: 1236

					for (var5 = class25.method316(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) { // L: 1237 1238 1239
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), class21.loginBoxCenter - 70, var33, 16777215, 0); // L: 1241
					var33 += 15; // L: 1242

					for (var6 = SecureRandomCallable.method2081(Login.Login_password); var0.stringWidth(var6) > var34; var6 = var6.substring(1)) { // L: 1243 1244 1245
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), class21.loginBoxCenter - 108, var33, 16777215, 0); // L: 1247
					var33 += 15; // L: 1248
					var32 = 277; // L: 1249
					var7 = class21.loginBoxCenter + -117; // L: 1250
					boolean var9 = Client.Login_isUsernameRemembered; // L: 1252
					boolean var28 = Login.field1006; // L: 1253
					IndexedSprite var27 = var9 ? (var28 ? class225.field2684 : GrandExchangeEvent.options_buttons_2Sprite) : (var28 ? InterfaceParent.field1134 : GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite); // L: 1255
					var27.drawAt(var7, var32); // L: 1258
					var7 = var7 + var27.subWidth + 5; // L: 1259
					var1.draw("Remember username", var7, var32 + 13, 16776960, 0); // L: 1260
					var7 = class21.loginBoxCenter + 24; // L: 1261
					IndexedSprite var29 = SoundCache.method866(class12.clientPreferences.hideUsername, Login.field1007); // L: 1262
					var29.drawAt(var7, var32); // L: 1263
					var7 = var7 + var29.subWidth + 5; // L: 1264
					var1.draw("Hide username", var7, var32 + 13, 16776960, 0); // L: 1265
					var33 = var32 + 15; // L: 1266
					var12 = class21.loginBoxCenter - 80; // L: 1267
					short var13 = 321; // L: 1268
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1269
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0); // L: 1270
					var12 = class21.loginBoxCenter + 80; // L: 1271
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1272
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0); // L: 1273
					var32 = 357; // L: 1274
					switch(Login.field997) { // L: 1275
					case 2:
						Varps.field2923 = "Having trouble logging in?"; // L: 1277
						break;
					default:
						Varps.field2923 = "Can't login? Click here."; // L: 1280
					}

					class18.field155 = new Bounds(class21.loginBoxCenter, var32, var1.stringWidth(Varps.field2923), 11); // L: 1283
					WorldMapElement.field1572 = new Bounds(class21.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1284
					var1.drawCentered(Varps.field2923, class21.loginBoxCenter, var32, 16777215, 0); // L: 1285
				} else if (Login.loginIndex == 3) { // L: 1287
					var32 = 201; // L: 1288
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1289
					var33 = var32 + 20; // L: 1290
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1291
					var33 += 15; // L: 1292
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1293
					var33 += 15; // L: 1294
					var4 = Login.loginBoxX + 180; // L: 1295
					var23 = 276; // L: 1296
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1297
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1298
					var4 = Login.loginBoxX + 180; // L: 1299
					var23 = 326; // L: 1300
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1301
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1302
				} else if (Login.loginIndex == 4) { // L: 1304
					var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1305
					var32 = 236; // L: 1306
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0); // L: 1307
					var33 = var32 + 15; // L: 1308
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1309
					var33 += 15; // L: 1310
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1311
					var33 += 15; // L: 1312
					var5 = "PIN: "; // L: 1314
					String var26 = class16.otp; // L: 1316
					var37 = var26.length(); // L: 1319
					char[] var10 = new char[var37]; // L: 1321

					for (var11 = 0; var11 < var37; ++var11) { // L: 1322
						var10[var11] = '*';
					}

					String var47 = new String(var10); // L: 1323
					var0.draw(var5 + var47 + (Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0); // L: 1327
					var33 -= 8; // L: 1328
					var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1329
					var33 += 15; // L: 1330
					var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0); // L: 1331
					var8 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1332
					var37 = var33 - var0.ascent; // L: 1333
					IndexedSprite var39;
					if (Login.field1008) { // L: 1335
						var39 = GrandExchangeEvent.options_buttons_2Sprite; // L: 1336
					} else {
						var39 = GrandExchangeOfferUnitPriceComparator.options_buttons_0Sprite; // L: 1339
					}

					var39.drawAt(var8, var37); // L: 1341
					var33 += 15; // L: 1342
					var11 = Login.loginBoxX + 180 - 80; // L: 1343
					short var40 = 321; // L: 1344
					Login.titlebuttonSprite.drawAt(var11 - 73, var40 - 20); // L: 1345
					var0.drawCentered("Continue", var11, var40 + 5, 16777215, 0); // L: 1346
					var11 = Login.loginBoxX + 180 + 80; // L: 1347
					Login.titlebuttonSprite.drawAt(var11 - 73, var40 - 20); // L: 1348
					var0.drawCentered("Cancel", var11, var40 + 5, 16777215, 0); // L: 1349
					var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var40 + 36, 255, 0); // L: 1350
				} else if (Login.loginIndex == 5) { // L: 1352
					var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1353
					var32 = 221; // L: 1354
					var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1355
					var33 = var32 + 15; // L: 1356
					var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1357
					var33 += 15; // L: 1358
					var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1359
					var33 += 15; // L: 1360
					var33 += 14; // L: 1361
					var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0); // L: 1362
					var34 = 174; // L: 1363

					for (var5 = class25.method316(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) { // L: 1364 1365 1366
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? HorizontalAlignment.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0); // L: 1368
					var33 += 15; // L: 1369
					var25 = Login.loginBoxX + 180 - 80; // L: 1370
					short var35 = 321; // L: 1371
					Login.titlebuttonSprite.drawAt(var25 - 73, var35 - 20); // L: 1372
					var0.drawCentered("Recover", var25, var35 + 5, 16777215, 0); // L: 1373
					var25 = Login.loginBoxX + 180 + 80; // L: 1374
					Login.titlebuttonSprite.drawAt(var25 - 73, var35 - 20); // L: 1375
					var0.drawCentered("Back", var25, var35 + 5, 16777215, 0); // L: 1376
					var35 = 356; // L: 1377
					var1.drawCentered("Still having trouble logging in?", class21.loginBoxCenter, var35, 268435455, 0); // L: 1378
				} else if (Login.loginIndex == 6) { // L: 1380
					var32 = 201; // L: 1381
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1382
					var33 = var32 + 15; // L: 1383
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1384
					var33 += 15; // L: 1385
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1386
					var33 += 15; // L: 1387
					var4 = Login.loginBoxX + 180; // L: 1388
					var23 = 321; // L: 1389
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1390
					var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1391
				} else if (Login.loginIndex == 7) { // L: 1393
					var32 = 216; // L: 1394
					var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1395
					var33 = var32 + 15; // L: 1396
					var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1397
					var33 += 15; // L: 1398
					var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1399
					var33 += 15; // L: 1400
					var4 = Login.loginBoxX + 180 - 80; // L: 1401
					var23 = 321; // L: 1402
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1403
					var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1404
					var4 = Login.loginBoxX + 180 + 80; // L: 1405
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1406
					var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1407
				} else if (Login.loginIndex == 8) { // L: 1409
					var32 = 216; // L: 1410
					var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0); // L: 1411
					var33 = var32 + 15; // L: 1412
					var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1413
					var33 += 15; // L: 1414
					var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1415
					var33 += 15; // L: 1416
					var4 = Login.loginBoxX + 180 - 80; // L: 1417
					var23 = 321; // L: 1418
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1419
					var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1420
					var4 = Login.loginBoxX + 180 + 80; // L: 1421
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1422
					var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1423
				} else if (Login.loginIndex == 12) { // L: 1425
					var32 = 201; // L: 1426
					String var24 = ""; // L: 1427
					var5 = ""; // L: 1428
					var6 = ""; // L: 1429
					switch(Login.field996) { // L: 1430
					case 0:
						var24 = "Your account has been disabled."; // L: 1433
						var5 = Strings.field3295; // L: 1434
						var6 = ""; // L: 1435
						break;
					case 1:
						var24 = "Account locked as we suspect it has been stolen."; // L: 1440
						var5 = Strings.field3334; // L: 1441
						var6 = ""; // L: 1442
						break; // L: 1443
					default:
						BufferedSink.Login_promptCredentials(false); // L: 1447
					}

					var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0); // L: 1451
					var33 = var32 + 15; // L: 1452
					var2.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1453
					var33 += 15; // L: 1454
					var2.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1455
					var33 += 15; // L: 1456
					var7 = Login.loginBoxX + 180; // L: 1457
					short var36 = 276; // L: 1458
					Login.titlebuttonSprite.drawAt(var7 - 73, var36 - 20); // L: 1459
					var0.drawCentered("Support Page", var7, var36 + 5, 16777215, 0); // L: 1460
					var7 = Login.loginBoxX + 180; // L: 1461
					var36 = 326; // L: 1462
					Login.titlebuttonSprite.drawAt(var7 - 73, var36 - 20); // L: 1463
					var0.drawCentered("Back", var7, var36 + 5, 16777215, 0); // L: 1464
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

			if (Client.gameState >= 10) { // L: 1480
				int[] var30 = new int[4]; // L: 1481
				Rasterizer2D.Rasterizer2D_getClipArray(var30); // L: 1482
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, HealthBarDefinition.canvasHeight); // L: 1483
				AttackOption.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1484
				AttackOption.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1485
				Rasterizer2D.Rasterizer2D_setClipArray(var30); // L: 1486
			}

			FontName.title_muteSprite[class12.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1488
			if (Client.gameState > 5 && class7.clientLanguage == Language.Language_EN) { // L: 1489
				if (class288.field3691 != null) { // L: 1490
					var33 = Login.xPadding + 5; // L: 1491
					var34 = 463; // L: 1492
					byte var44 = 100; // L: 1493
					byte var45 = 35; // L: 1494
					class288.field3691.drawAt(var33, var34); // L: 1495
					var0.drawCentered("World" + " " + Client.worldId, var44 / 2 + var33, var45 / 2 + var34 - 2, 16777215, 0); // L: 1496
					if (World.World_request != null) { // L: 1497
						var1.drawCentered("Loading...", var44 / 2 + var33, var45 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var44 / 2 + var33, var45 / 2 + var34 + 12, 16777215, 0); // L: 1498
					}
				} else {
					class288.field3691 = MenuAction.SpriteBuffer_getIndexedSpriteByName(class43.archive8, "sl_button", ""); // L: 1501
				}
			}

		}
	} // L: 1153 1504

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "90"
	)
	static final void method306(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11186
		if (var0 != class12.clientPreferences.musicVolume) { // L: 11187
			if (class12.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) { // L: 11188
				World.method1684(class29.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11189
				Client.field866 = false; // L: 11190
			} else if (var0 == 0) { // L: 11192
				ViewportMouse.method4193(); // L: 11193
				Client.field866 = false; // L: 11194
			} else {
				FriendLoginUpdate.method5552(var0); // L: 11196
			}

			class12.clientPreferences.musicVolume = var0; // L: 11197
			KeyHandler.savePreferences(); // L: 11198
		}

	} // L: 11200
}
