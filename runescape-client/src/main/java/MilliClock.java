import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1909140371
	)
	static int field2032;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("n")
	long[] field2029;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1115691505
	)
	int field2027;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1924917613
	)
	int field2026;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 4130614396061915879L
	)
	long field2028;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1837898463
	)
	int field2030;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 730128979
	)
	int field2031;

	public MilliClock() {
		this.field2029 = new long[10]; // L: 7
		this.field2027 = 256; // L: 15
		this.field2026 = 1; // L: 16
		this.field2030 = 0; // L: 17
		this.field2028 = Tiles.currentTimeMillis(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field2029[var1] = this.field2028; // L: 20
		}

	} // L: 22

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field2029[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1861957348"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2027; // L: 31
		int var4 = this.field2026; // L: 32
		this.field2027 = 300; // L: 33
		this.field2026 = 1; // L: 34
		this.field2028 = Tiles.currentTimeMillis(); // L: 35
		if (this.field2029[this.field2031] == 0L) { // L: 36
			this.field2027 = var3; // L: 37
			this.field2026 = var4; // L: 38
		} else if (this.field2028 > this.field2029[this.field2031]) { // L: 40
			this.field2027 = (int)((long)(var1 * 2560) / (this.field2028 - this.field2029[this.field2031]));
		}

		if (this.field2027 < 25) { // L: 41
			this.field2027 = 25;
		}

		if (this.field2027 > 256) { // L: 42
			this.field2027 = 256; // L: 43
			this.field2026 = (int)((long)var1 - (this.field2028 - this.field2029[this.field2031]) / 10L);
		}

		if (this.field2026 > var1) {
			this.field2026 = var1;
		}

		this.field2029[this.field2031] = this.field2028; // L: 47
		this.field2031 = (this.field2031 + 1) % 10; // L: 48
		int var5;
		if (this.field2026 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field2029[var5] != 0L) { // L: 51
					this.field2029[var5] += (long)this.field2026;
				}
			}
		}

		if (this.field2026 < var2) { // L: 54
			this.field2026 = var2;
		}

		ApproximateRouteStrategy.sleepExact((long)this.field2026); // L: 55

		for (var5 = 0; this.field2030 < 256; this.field2030 += this.field2027) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field2030 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;Ljava/lang/String;I)[Lly;",
		garbageValue = "1085285286"
	)
	public static IndexedSprite[] method3664(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 115
		int var4 = var0.getFileId(var3, var2); // L: 116
		return BoundaryObject.method3420(var0, var3, var4); // L: 117
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "9"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;Lkl;I)V",
		garbageValue = "737300507"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GrandExchangeOfferTotalQuantityComparator.canvasWidth - 765) / 2; // L: 962
		Login.loginBoxX = Login.xPadding + 202; // L: 963
		GraphicsObject.loginBoxCenter = Login.loginBoxX + 180; // L: 964
		byte var3;
		int var4;
		int var7;
		int var9;
		int var25;
		int var30;
		int var38;
		if (Login.worldSelectOpen) { // L: 965
			if (WorldMapID.worldSelectBackSprites == null) { // L: 967
				WorldMapID.worldSelectBackSprites = WorldMapID.method648(ModeWhere.archive8, "sl_back", "");
			}

			if (WorldMapManager.worldSelectFlagSprites == null) { // L: 968
				WorldMapManager.worldSelectFlagSprites = method3664(ModeWhere.archive8, "sl_flags", "");
			}

			if (DevicePcmPlayerProvider.worldSelectArrows == null) { // L: 969
				DevicePcmPlayerProvider.worldSelectArrows = method3664(ModeWhere.archive8, "sl_arrows", "");
			}

			if (Occluder.worldSelectStars == null) { // L: 970
				Occluder.worldSelectStars = method3664(ModeWhere.archive8, "sl_stars", "");
			}

			if (class7.worldSelectLeftSprite == null) { // L: 971
				class7.worldSelectLeftSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "leftarrow", "");
			}

			if (class2.worldSelectRightSprite == null) { // L: 972
				class2.worldSelectRightSprite = ChatChannel.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 973
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 974
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 975
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 976
			if (Occluder.worldSelectStars != null) { // L: 977
				Occluder.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 978
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 979
				Occluder.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 980
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 981
			}

			if (DevicePcmPlayerProvider.worldSelectArrows != null) { // L: 983
				var30 = Login.xPadding + 280; // L: 984
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 985
					DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var30, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var30, 4); // L: 986
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 987
					DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var30 + 15, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var30 + 15, 4); // L: 988
				}

				var0.draw("World", var30 + 32, 17, 16777215, -1); // L: 989
				var4 = Login.xPadding + 390; // L: 990
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 991
					DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var4, 4); // L: 992
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 993
					DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 994
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 995
				var38 = Login.xPadding + 500; // L: 996
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 997
					DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var38, 4); // L: 998
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 999
					DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var38 + 15, 4); // L: 1000
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1); // L: 1001
				var25 = Login.xPadding + 610; // L: 1002
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1003
					DevicePcmPlayerProvider.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[0].drawAt(var25, 4); // L: 1004
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1005
					DevicePcmPlayerProvider.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					DevicePcmPlayerProvider.worldSelectArrows[1].drawAt(var25 + 15, 4); // L: 1006
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1); // L: 1007
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1009
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1010
			Login.hoveredWorldIndex = -1; // L: 1011
			if (WorldMapID.worldSelectBackSprites != null) { // L: 1012
				var3 = 88; // L: 1013
				byte var35 = 19; // L: 1014
				var38 = 765 / (var3 + 1) - 1; // L: 1015
				var25 = 480 / (var35 + 1); // L: 1016

				int var33;
				do {
					var7 = var25; // L: 1018
					var33 = var38; // L: 1019
					if (var25 * (var38 - 1) >= World.World_count) { // L: 1020
						--var38;
					}

					if (var38 * (var25 - 1) >= World.World_count) { // L: 1021
						--var25;
					}

					if (var38 * (var25 - 1) >= World.World_count) { // L: 1022
						--var25;
					}
				} while(var7 != var25 || var33 != var38); // L: 1023

				var7 = (765 - var38 * var3) / (var38 + 1); // L: 1025
				if (var7 > 5) { // L: 1026
					var7 = 5;
				}

				var33 = (480 - var25 * var35) / (var25 + 1); // L: 1027
				if (var33 > 5) { // L: 1028
					var33 = 5;
				}

				var9 = (765 - var38 * var3 - var7 * (var38 - 1)) / 2; // L: 1029
				int var36 = (480 - var25 * var35 - var33 * (var25 - 1)) / 2; // L: 1030
				int var11 = (var25 + World.World_count - 1) / var25; // L: 1031
				Login.worldSelectPagesCount = var11 - var38; // L: 1032
				if (class7.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1033
					class7.worldSelectLeftSprite.drawAt(8, class25.canvasHeight / 2 - class7.worldSelectLeftSprite.subHeight / 2); // L: 1034
				}

				if (class2.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1036
					class2.worldSelectRightSprite.drawAt(GrandExchangeOfferTotalQuantityComparator.canvasWidth - class2.worldSelectRightSprite.subWidth - 8, class25.canvasHeight / 2 - class2.worldSelectRightSprite.subHeight / 2); // L: 1037
				}

				int var12 = var36 + 23; // L: 1039
				int var13 = var9 + Login.xPadding; // L: 1040
				int var14 = 0; // L: 1041
				boolean var15 = false; // L: 1042
				int var16 = Login.worldSelectPage; // L: 1043

				int var17;
				for (var17 = var16 * var25; var17 < World.World_count && var16 - Login.worldSelectPage < var38; ++var17) { // L: 1044 1045
					World var18 = World.World_worlds[var17]; // L: 1048
					boolean var19 = true; // L: 1049
					String var20 = Integer.toString(var18.population); // L: 1050
					if (var18.population == -1) { // L: 1051
						var20 = "OFF"; // L: 1052
						var19 = false; // L: 1053
					} else if (var18.population > 1980) { // L: 1055
						var20 = "FULL"; // L: 1056
						var19 = false; // L: 1057
					}

					int var22 = 0; // L: 1060
					byte var21;
					if (var18.isBeta()) { // L: 1061
						if (var18.isMembersOnly()) { // L: 1062
							var21 = 7;
						} else {
							var21 = 6; // L: 1063
						}
					} else if (var18.isDeadman()) { // L: 1065
						var22 = 16711680; // L: 1066
						if (var18.isMembersOnly()) { // L: 1067
							var21 = 5;
						} else {
							var21 = 4; // L: 1068
						}
					} else if (var18.method1883()) { // L: 1070
						if (var18.isMembersOnly()) { // L: 1071
							var21 = 9;
						} else {
							var21 = 8; // L: 1072
						}
					} else if (var18.isPvp()) { // L: 1074
						if (var18.isMembersOnly()) { // L: 1075
							var21 = 3;
						} else {
							var21 = 2; // L: 1076
						}
					} else if (var18.isMembersOnly()) { // L: 1079
						var21 = 1;
					} else {
						var21 = 0; // L: 1080
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var35 + var12 && var19) { // L: 1082
						Login.hoveredWorldIndex = var17; // L: 1083
						WorldMapID.worldSelectBackSprites[var21].drawTransOverlayAt(var13, var12, 128, 16777215); // L: 1084
						var15 = true; // L: 1085
					} else {
						WorldMapID.worldSelectBackSprites[var21].drawAt(var13, var12); // L: 1087
					}

					if (WorldMapManager.worldSelectFlagSprites != null) { // L: 1088
						WorldMapManager.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var35 / 2 + var12 + 5, var22, -1); // L: 1089
					var1.drawCentered(var20, var13 + 60, var35 / 2 + var12 + 5, 268435455, -1); // L: 1090
					var12 = var12 + var35 + var33; // L: 1091
					++var14; // L: 1092
					if (var14 >= var25) {
						var12 = var36 + 23; // L: 1093
						var13 = var13 + var3 + var7; // L: 1094
						var14 = 0; // L: 1095
						++var16; // L: 1096
					}
				}

				if (var15) { // L: 1099
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1100
					int var28 = var1.ascent + 8; // L: 1101
					int var37 = MouseHandler.MouseHandler_y + 25; // L: 1102
					if (var37 + var28 > 480) { // L: 1103
						var37 = MouseHandler.MouseHandler_y - 25 - var28; // L: 1104
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var28, 16777120); // L: 1106
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var28, 0); // L: 1107
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1); // L: 1108
				}
			}

			FileSystem.rasterProvider.drawFull(0, 0); // L: 1111
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1115
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1116
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1117
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1118
				var3 = 20; // L: 1119
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1120
				var4 = 253 - var3; // L: 1121
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1122
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1123
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1124
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1125
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1126
			}

			String var5;
			String var6;
			short var29;
			short var31;
			if (Client.gameState == 20) { // L: 1128
				GrandExchangeOfferNameComparator.titleboxSprite.drawAt(Login.loginBoxX + 180 - GrandExchangeOfferNameComparator.titleboxSprite.subWidth / 2, 271 - GrandExchangeOfferNameComparator.titleboxSprite.subHeight / 2); // L: 1129
				var29 = 201; // L: 1130
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var29, 16776960, 0); // L: 1131
				var30 = var29 + 15; // L: 1132
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1133
				var30 += 15; // L: 1134
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1135
				var30 += 15; // L: 1136
				var30 += 7; // L: 1137
				if (Login.loginIndex != 4) { // L: 1138
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var30, 16777215, 0); // L: 1139
					var31 = 200; // L: 1140

					for (var5 = WorldMapID.method645(); var0.stringWidth(var5) > var31; var5 = var5.substring(0, var5.length() - 1)) { // L: 1141 1142 1143
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var30, 16777215, 0); // L: 1145
					var30 += 15; // L: 1146

					for (var6 = HitSplatDefinition.method4768(Login.Login_password); var0.stringWidth(var6) > var31; var6 = var6.substring(1)) { // L: 1147 1148 1149
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var30, 16777215, 0); // L: 1151
					var30 += 15; // L: 1152
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 1155
				GrandExchangeOfferNameComparator.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1156
				short var23;
				if (Login.loginIndex == 0) { // L: 1157
					var29 = 251; // L: 1158
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var29, 16776960, 0); // L: 1159
					var30 = var29 + 30; // L: 1160
					var4 = Login.loginBoxX + 180 - 80; // L: 1161
					var23 = 291; // L: 1162
					InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1163
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1164
					var4 = Login.loginBoxX + 180 + 80; // L: 1165
					InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1166
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1167
				} else if (Login.loginIndex == 1) { // L: 1169
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1170
					var29 = 236; // L: 1171
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var29, 16777215, 0); // L: 1172
					var30 = var29 + 15; // L: 1173
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1174
					var30 += 15; // L: 1175
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1176
					var30 += 15; // L: 1177
					var4 = Login.loginBoxX + 180 - 80; // L: 1178
					var23 = 321; // L: 1179
					InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1180
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1181
					var4 = Login.loginBoxX + 180 + 80; // L: 1182
					InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1183
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1184
				} else if (Login.loginIndex == 2) { // L: 1186
					var29 = 201; // L: 1187
					var0.drawCentered(Login.Login_response1, GraphicsObject.loginBoxCenter, var29, 16776960, 0); // L: 1188
					var30 = var29 + 15; // L: 1189
					var0.drawCentered(Login.Login_response2, GraphicsObject.loginBoxCenter, var30, 16776960, 0); // L: 1190
					var30 += 15; // L: 1191
					var0.drawCentered(Login.Login_response3, GraphicsObject.loginBoxCenter, var30, 16776960, 0); // L: 1192
					var30 += 15; // L: 1193
					var30 += 7; // L: 1194
					var0.draw("Login: ", GraphicsObject.loginBoxCenter - 110, var30, 16777215, 0); // L: 1195
					var31 = 200; // L: 1196

					for (var5 = WorldMapID.method645(); var0.stringWidth(var5) > var31; var5 = var5.substring(1)) { // L: 1197 1198 1199
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? FileSystem.colorStartTag(16776960) + "|" : ""), GraphicsObject.loginBoxCenter - 70, var30, 16777215, 0); // L: 1201
					var30 += 15; // L: 1202

					for (var6 = HitSplatDefinition.method4768(Login.Login_password); var0.stringWidth(var6) > var31; var6 = var6.substring(1)) { // L: 1203 1204 1205
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? FileSystem.colorStartTag(16776960) + "|" : ""), GraphicsObject.loginBoxCenter - 108, var30, 16777215, 0); // L: 1207
					var30 += 15; // L: 1208
					var29 = 277; // L: 1209
					var7 = GraphicsObject.loginBoxCenter + -117; // L: 1210
					IndexedSprite var26 = UrlRequest.method3476(Client.Login_isUsernameRemembered, Login.field1222); // L: 1211
					var26.drawAt(var7, var29); // L: 1212
					var7 = var7 + var26.subWidth + 5; // L: 1213
					var1.draw("Remember username", var7, var29 + 13, 16776960, 0); // L: 1214
					var7 = GraphicsObject.loginBoxCenter + 24; // L: 1215
					var26 = UrlRequest.method3476(WorldMapSectionType.clientPreferences.hideUsername, Login.field1216); // L: 1216
					var26.drawAt(var7, var29); // L: 1217
					var7 = var7 + var26.subWidth + 5; // L: 1218
					var1.draw("Hide username", var7, var29 + 13, 16776960, 0); // L: 1219
					var30 = var29 + 15; // L: 1220
					var9 = GraphicsObject.loginBoxCenter - 80; // L: 1221
					short var10 = 321; // L: 1222
					InterfaceParent.titlebuttonSprite.drawAt(var9 - 73, var10 - 20); // L: 1223
					var0.drawCentered("Login", var9, var10 + 5, 16777215, 0); // L: 1224
					var9 = GraphicsObject.loginBoxCenter + 80; // L: 1225
					InterfaceParent.titlebuttonSprite.drawAt(var9 - 73, var10 - 20); // L: 1226
					var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0); // L: 1227
					var29 = 357; // L: 1228
					switch(Login.field1207) { // L: 1229
					case 2:
						DevicePcmPlayerProvider.field433 = "Having trouble logging in?"; // L: 1231
						break;
					default:
						DevicePcmPlayerProvider.field433 = "Can't login? Click here."; // L: 1234
					}

					AttackOption.field1190 = new Bounds(GraphicsObject.loginBoxCenter, var29, var1.stringWidth(DevicePcmPlayerProvider.field433), 11); // L: 1237
					KeyHandler.field409 = new Bounds(GraphicsObject.loginBoxCenter, var29, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1238
					var1.drawCentered(DevicePcmPlayerProvider.field433, GraphicsObject.loginBoxCenter, var29, 16777215, 0); // L: 1239
				} else if (Login.loginIndex == 3) { // L: 1241
					var29 = 201; // L: 1242
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var29, 16776960, 0); // L: 1243
					var30 = var29 + 20; // L: 1244
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1245
					var30 += 15; // L: 1246
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1247
					var30 += 15; // L: 1248
					var4 = Login.loginBoxX + 180; // L: 1249
					var23 = 276; // L: 1250
					InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1251
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1252
					var4 = Login.loginBoxX + 180; // L: 1253
					var23 = 326; // L: 1254
					InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1255
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1256
				} else {
					short var8;
					if (Login.loginIndex == 4) { // L: 1258
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1259
						var29 = 236; // L: 1260
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var29, 16777215, 0); // L: 1261
						var30 = var29 + 15; // L: 1262
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1263
						var30 += 15; // L: 1264
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1265
						var30 += 15; // L: 1266
						var0.draw("PIN: " + HitSplatDefinition.method4768(class1.otp) + (Client.cycle % 40 < 20 ? FileSystem.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var30, 16777215, 0); // L: 1267
						var30 -= 8; // L: 1268
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var30, 16776960, 0); // L: 1269
						var30 += 15; // L: 1270
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var30, 16776960, 0); // L: 1271
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1272
						var38 = var30 - var0.ascent; // L: 1273
						IndexedSprite var32;
						if (Login.field1217) { // L: 1275
							var32 = Login.options_buttons_2Sprite; // L: 1276
						} else {
							var32 = class69.options_buttons_0Sprite; // L: 1279
						}

						var32.drawAt(var4, var38); // L: 1281
						var30 += 15; // L: 1282
						var7 = Login.loginBoxX + 180 - 80; // L: 1283
						var8 = 321; // L: 1284
						InterfaceParent.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1285
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1286
						var7 = Login.loginBoxX + 180 + 80; // L: 1287
						InterfaceParent.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1288
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1289
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0); // L: 1290
					} else if (Login.loginIndex == 5) { // L: 1292
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1293
						var29 = 221; // L: 1294
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var29, 16776960, 0); // L: 1295
						var30 = var29 + 15; // L: 1296
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1297
						var30 += 15; // L: 1298
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1299
						var30 += 15; // L: 1300
						var30 += 14; // L: 1301
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var30, 16777215, 0); // L: 1302
						var31 = 174; // L: 1303

						for (var5 = WorldMapID.method645(); var0.stringWidth(var5) > var31; var5 = var5.substring(1)) { // L: 1304 1305 1306
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? FileSystem.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var30, 16777215, 0); // L: 1308
						var30 += 15; // L: 1309
						var25 = Login.loginBoxX + 180 - 80; // L: 1310
						short var34 = 321; // L: 1311
						InterfaceParent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1312
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0); // L: 1313
						var25 = Login.loginBoxX + 180 + 80; // L: 1314
						InterfaceParent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20); // L: 1315
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0); // L: 1316
						var34 = 356; // L: 1317
						var1.drawCentered("Still having trouble logging in?", GraphicsObject.loginBoxCenter, var34, 268435455, 0); // L: 1318
					} else if (Login.loginIndex == 6) { // L: 1320
						var29 = 201; // L: 1321
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var29, 16776960, 0); // L: 1322
						var30 = var29 + 15; // L: 1323
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1324
						var30 += 15; // L: 1325
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1326
						var30 += 15; // L: 1327
						var4 = Login.loginBoxX + 180; // L: 1328
						var23 = 321; // L: 1329
						InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1330
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1331
					} else if (Login.loginIndex == 7) { // L: 1333
						var29 = 216; // L: 1334
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var29, 16776960, 0); // L: 1335
						var30 = var29 + 15; // L: 1336
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1337
						var30 += 15; // L: 1338
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1339
						var30 += 15; // L: 1340
						var4 = Login.loginBoxX + 180 - 80; // L: 1341
						var23 = 321; // L: 1342
						InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1343
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1344
						var4 = Login.loginBoxX + 180 + 80; // L: 1345
						InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1346
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1347
					} else if (Login.loginIndex == 8) { // L: 1349
						var29 = 216; // L: 1350
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var29, 16776960, 0); // L: 1351
						var30 = var29 + 15; // L: 1352
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1353
						var30 += 15; // L: 1354
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var30, 16776960, 0); // L: 1355
						var30 += 15; // L: 1356
						var4 = Login.loginBoxX + 180 - 80; // L: 1357
						var23 = 321; // L: 1358
						InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1359
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1360
						var4 = Login.loginBoxX + 180 + 80; // L: 1361
						InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1362
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1363
					} else if (Login.loginIndex == 12) { // L: 1365
						var29 = 201; // L: 1366
						String var24 = ""; // L: 1367
						var5 = ""; // L: 1368
						var6 = ""; // L: 1369
						switch(Login.field1206) { // L: 1370
						case 0:
							var24 = "Your account has been disabled."; // L: 1385
							var5 = Strings.field2841; // L: 1386
							var6 = ""; // L: 1387
							break;
						case 1:
							var24 = "Account locked as we suspect it has been stolen."; // L: 1378
							var5 = Strings.field2918; // L: 1379
							var6 = ""; // L: 1380
							break; // L: 1381
						default:
							GrandExchangeOfferOwnWorldComparator.Login_promptCredentials(false); // L: 1373
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var29, 16776960, 0); // L: 1391
						var30 = var29 + 15; // L: 1392
						var2.drawCentered(var5, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1393
						var30 += 15; // L: 1394
						var2.drawCentered(var6, Login.loginBoxX + 180, var30, 16776960, 0); // L: 1395
						var30 += 15; // L: 1396
						var7 = Login.loginBoxX + 180; // L: 1397
						var8 = 276; // L: 1398
						InterfaceParent.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1399
						var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0); // L: 1400
						var7 = Login.loginBoxX + 180; // L: 1401
						var8 = 326; // L: 1402
						InterfaceParent.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1403
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1404
					} else if (Login.loginIndex == 24) { // L: 1406
						var29 = 221; // L: 1407
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var29, 16777215, 0); // L: 1408
						var30 = var29 + 15; // L: 1409
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1410
						var30 += 15; // L: 1411
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var30, 16777215, 0); // L: 1412
						var30 += 15; // L: 1413
						var4 = Login.loginBoxX + 180; // L: 1414
						var23 = 301; // L: 1415
						InterfaceParent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1416
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1417
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1420
				int[] var27 = new int[4]; // L: 1421
				Rasterizer2D.Rasterizer2D_getClipArray(var27); // L: 1422
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class25.canvasHeight); // L: 1423
				class9.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1424
				class9.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1425
				Rasterizer2D.Rasterizer2D_setClipArray(var27); // L: 1426
			}

			Login.title_muteSprite[WorldMapSectionType.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1428
			if (Client.gameState > 5 && Language.Language_EN == NPCComposition.clientLanguage) { // L: 1429
				if (World.field1039 != null) { // L: 1430
					var30 = Login.xPadding + 5; // L: 1431
					var31 = 463; // L: 1432
					byte var40 = 100; // L: 1433
					byte var39 = 35; // L: 1434
					World.field1039.drawAt(var30, var31); // L: 1435
					var0.drawCentered("World" + " " + Client.worldId, var40 / 2 + var30, var39 / 2 + var31 - 2, 16777215, 0); // L: 1436
					if (UserComparator9.World_request != null) { // L: 1437
						var1.drawCentered("Loading...", var40 / 2 + var30, var39 / 2 + var31 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var40 / 2 + var30, var39 / 2 + var31 + 12, 16777215, 0); // L: 1438
					}
				} else {
					World.field1039 = ChatChannel.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "sl_button", ""); // L: 1441
				}
			}

		}
	} // L: 1113 1444
}
