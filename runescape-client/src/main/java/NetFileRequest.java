import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field3577;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1109753371
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("v")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lkj;Lkj;I)V",
		garbageValue = "1099473080"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (AttackOption.canvasWidth - 765) / 2; // L: 879
		Login.loginBoxX = Login.xPadding + 202; // L: 880
		class25.loginBoxCenter = Login.loginBoxX + 180; // L: 881
		if (Login.worldSelectOpen) { // L: 882
			class27.method353(var0, var1); // L: 883
		} else {
			class339.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 886
			class377.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 887
			Messages.logoSprite.drawAt(Login.xPadding + 382 - Messages.logoSprite.subWidth / 2, 18); // L: 888
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 889
				byte var3 = 20; // L: 890
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 891
				var4 = 253 - var3; // L: 892
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 893
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 894
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 895
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 896
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 897
			}

			String var5;
			String var6;
			short var16;
			int var17;
			short var18;
			if (Client.gameState == 20) { // L: 899
				Coord.titleboxSprite.drawAt(Login.loginBoxX + 180 - Coord.titleboxSprite.subWidth / 2, 271 - Coord.titleboxSprite.subHeight / 2); // L: 900
				var16 = 201; // L: 901
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0); // L: 902
				var17 = var16 + 15; // L: 903
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0); // L: 904
				var17 += 15; // L: 905
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0); // L: 906
				var17 += 15; // L: 907
				var17 += 7; // L: 908
				if (Login.loginIndex != 4) { // L: 909
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var17, 16777215, 0); // L: 910
					var18 = 200; // L: 911

					for (var5 = class17.method255(); var0.stringWidth(var5) > var18; var5 = var5.substring(0, var5.length() - 1)) { // L: 912 913 914
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var17, 16777215, 0); // L: 916
					var17 += 15; // L: 917

					for (var6 = class22.method315(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) { // L: 918 919 920
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var17, 16777215, 0); // L: 922
					var17 += 15; // L: 923
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11) { // L: 926
				Coord.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 927
				short var11;
				if (Login.loginIndex == 0) { // L: 928
					var16 = 251; // L: 929
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var16, 16776960, 0); // L: 930
					var17 = var16 + 30; // L: 931
					var4 = Login.loginBoxX + 180 - 80; // L: 932
					var11 = 291; // L: 933
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 934
					var0.drawLines("New User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 935
					var4 = Login.loginBoxX + 180 + 80; // L: 936
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 937
					var0.drawLines("Existing User", var4 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 938
				} else if (Login.loginIndex == 1) { // L: 940
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 941
					var16 = 236; // L: 942
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0); // L: 943
					var17 = var16 + 15; // L: 944
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0); // L: 945
					var17 += 15; // L: 946
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0); // L: 947
					var17 += 15; // L: 948
					var4 = Login.loginBoxX + 180 - 80; // L: 949
					var11 = 321; // L: 950
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 951
					var0.drawCentered("Continue", var4, var11 + 5, 16777215, 0); // L: 952
					var4 = Login.loginBoxX + 180 + 80; // L: 953
					class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 954
					var0.drawCentered("Cancel", var4, var11 + 5, 16777215, 0); // L: 955
				} else {
					int var7;
					if (Login.loginIndex == 2) { // L: 957
						var16 = 201; // L: 958
						var0.drawCentered(Login.Login_response1, class25.loginBoxCenter, var16, 16776960, 0); // L: 959
						var17 = var16 + 15; // L: 960
						var0.drawCentered(Login.Login_response2, class25.loginBoxCenter, var17, 16776960, 0); // L: 961
						var17 += 15; // L: 962
						var0.drawCentered(Login.Login_response3, class25.loginBoxCenter, var17, 16776960, 0); // L: 963
						var17 += 15; // L: 964
						var17 += 7; // L: 965
						var0.draw("Login: ", class25.loginBoxCenter - 110, var17, 16777215, 0); // L: 966
						var18 = 200; // L: 967

						for (var5 = class17.method255(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) { // L: 968 969 970
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), class25.loginBoxCenter - 70, var17, 16777215, 0); // L: 972
						var17 += 15; // L: 973

						for (var6 = class22.method315(Login.Login_password); var0.stringWidth(var6) > var18; var6 = var6.substring(1)) { // L: 974 975 976
						}

						var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), class25.loginBoxCenter - 108, var17, 16777215, 0); // L: 978
						var17 += 15; // L: 979
						var16 = 277; // L: 980
						var7 = class25.loginBoxCenter + -117; // L: 981
						IndexedSprite var14 = Archive.method5021(Client.Login_isUsernameRemembered, Login.field1006); // L: 982
						var14.drawAt(var7, var16); // L: 983
						var7 = var7 + var14.subWidth + 5; // L: 984
						var1.draw("Remember username", var7, var16 + 13, 16776960, 0); // L: 985
						var7 = class25.loginBoxCenter + 24; // L: 986
						var14 = Archive.method5021(class4.clientPreferences.hideUsername, Login.field1021); // L: 987
						var14.drawAt(var7, var16); // L: 988
						var7 = var7 + var14.subWidth + 5; // L: 989
						var1.draw("Hide username", var7, var16 + 13, 16776960, 0); // L: 990
						var17 = var16 + 15; // L: 991
						int var9 = class25.loginBoxCenter - 80; // L: 992
						short var10 = 321; // L: 993
						class289.titlebuttonSprite.drawAt(var9 - 73, var10 - 20); // L: 994
						var0.drawCentered("Login", var9, var10 + 5, 16777215, 0); // L: 995
						var9 = class25.loginBoxCenter + 80; // L: 996
						class289.titlebuttonSprite.drawAt(var9 - 73, var10 - 20); // L: 997
						var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0); // L: 998
						var16 = 357; // L: 999
						switch(Login.field1012) { // L: 1000
						case 2:
							class215.field2557 = "Having trouble logging in?"; // L: 1005
							break;
						default:
							class215.field2557 = "Can't login? Click here."; // L: 1002
						}

						Client.field903 = new Bounds(class25.loginBoxCenter, var16, var1.stringWidth(class215.field2557), 11); // L: 1008
						DefaultsGroup.field3891 = new Bounds(class25.loginBoxCenter, var16, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1009
						var1.drawCentered(class215.field2557, class25.loginBoxCenter, var16, 16777215, 0); // L: 1010
					} else if (Login.loginIndex == 3) { // L: 1012
						var16 = 201; // L: 1013
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var16, 16776960, 0); // L: 1014
						var17 = var16 + 20; // L: 1015
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var17, 16776960, 0); // L: 1016
						var17 += 15; // L: 1017
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var17, 16776960, 0); // L: 1018
						var17 += 15; // L: 1019
						var4 = Login.loginBoxX + 180; // L: 1020
						var11 = 276; // L: 1021
						class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1022
						var2.drawCentered("Try again", var4, var11 + 5, 16777215, 0); // L: 1023
						var4 = Login.loginBoxX + 180; // L: 1024
						var11 = 326; // L: 1025
						class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1026
						var2.drawCentered("Forgotten password?", var4, var11 + 5, 16777215, 0); // L: 1027
					} else {
						short var8;
						if (Login.loginIndex == 4) { // L: 1029
							var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1030
							var16 = 236; // L: 1031
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0); // L: 1032
							var17 = var16 + 15; // L: 1033
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0); // L: 1034
							var17 += 15; // L: 1035
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0); // L: 1036
							var17 += 15; // L: 1037
							var0.draw("PIN: " + class22.method315(ItemLayer.otp) + (Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var17, 16777215, 0); // L: 1038
							var17 -= 8; // L: 1039
							var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var17, 16776960, 0); // L: 1040
							var17 += 15; // L: 1041
							var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var17, 16776960, 0); // L: 1042
							var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1043
							int var21 = var17 - var0.ascent; // L: 1044
							IndexedSprite var19;
							if (Login.field1022) { // L: 1046
								var19 = WorldMapCacheName.options_buttons_2Sprite; // L: 1047
							} else {
								var19 = Login.options_buttons_0Sprite; // L: 1050
							}

							var19.drawAt(var4, var21); // L: 1052
							var17 += 15; // L: 1053
							var7 = Login.loginBoxX + 180 - 80; // L: 1054
							var8 = 321; // L: 1055
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1056
							var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0); // L: 1057
							var7 = Login.loginBoxX + 180 + 80; // L: 1058
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1059
							var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0); // L: 1060
							var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0); // L: 1061
						} else if (Login.loginIndex == 5) { // L: 1063
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1064
							var16 = 221; // L: 1065
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0); // L: 1066
							var17 = var16 + 15; // L: 1067
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0); // L: 1068
							var17 += 15; // L: 1069
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0); // L: 1070
							var17 += 15; // L: 1071
							var17 += 14; // L: 1072
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var17, 16777215, 0); // L: 1073
							var18 = 174; // L: 1074

							for (var5 = class17.method255(); var0.stringWidth(var5) > var18; var5 = var5.substring(1)) { // L: 1075 1076 1077
							}

							var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? SecureRandomFuture.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var17, 16777215, 0); // L: 1079
							var17 += 15; // L: 1080
							int var13 = Login.loginBoxX + 180 - 80; // L: 1081
							short var20 = 321; // L: 1082
							class289.titlebuttonSprite.drawAt(var13 - 73, var20 - 20); // L: 1083
							var0.drawCentered("Recover", var13, var20 + 5, 16777215, 0); // L: 1084
							var13 = Login.loginBoxX + 180 + 80; // L: 1085
							class289.titlebuttonSprite.drawAt(var13 - 73, var20 - 20); // L: 1086
							var0.drawCentered("Back", var13, var20 + 5, 16777215, 0); // L: 1087
							var20 = 356; // L: 1088
							var1.drawCentered("Still having trouble logging in?", class25.loginBoxCenter, var20, 268435455, 0); // L: 1089
						} else if (Login.loginIndex == 6) { // L: 1091
							var16 = 201; // L: 1092
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16776960, 0); // L: 1093
							var17 = var16 + 15; // L: 1094
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16776960, 0); // L: 1095
							var17 += 15; // L: 1096
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16776960, 0); // L: 1097
							var17 += 15; // L: 1098
							var4 = Login.loginBoxX + 180; // L: 1099
							var11 = 321; // L: 1100
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1101
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0); // L: 1102
						} else if (Login.loginIndex == 7) { // L: 1104
							var16 = 216; // L: 1105
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var16, 16776960, 0); // L: 1106
							var17 = var16 + 15; // L: 1107
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var17, 16776960, 0); // L: 1108
							var17 += 15; // L: 1109
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var17, 16776960, 0); // L: 1110
							var17 += 15; // L: 1111
							var4 = Login.loginBoxX + 180 - 80; // L: 1112
							var11 = 321; // L: 1113
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1114
							var0.drawCentered("Set Date of Birth", var4, var11 + 5, 16777215, 0); // L: 1115
							var4 = Login.loginBoxX + 180 + 80; // L: 1116
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1117
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0); // L: 1118
						} else if (Login.loginIndex == 8) { // L: 1120
							var16 = 216; // L: 1121
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var16, 16776960, 0); // L: 1122
							var17 = var16 + 15; // L: 1123
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var17, 16776960, 0); // L: 1124
							var17 += 15; // L: 1125
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var17, 16776960, 0); // L: 1126
							var17 += 15; // L: 1127
							var4 = Login.loginBoxX + 180 - 80; // L: 1128
							var11 = 321; // L: 1129
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1130
							var0.drawCentered("Privacy Policy", var4, var11 + 5, 16777215, 0); // L: 1131
							var4 = Login.loginBoxX + 180 + 80; // L: 1132
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1133
							var0.drawCentered("Back", var4, var11 + 5, 16777215, 0); // L: 1134
						} else if (Login.loginIndex == 12) { // L: 1136
							var16 = 201; // L: 1137
							String var12 = ""; // L: 1138
							var5 = ""; // L: 1139
							var6 = ""; // L: 1140
							switch(Login.field1011) { // L: 1141
							case 0:
								var12 = "Your account has been disabled."; // L: 1144
								var5 = Strings.field3284; // L: 1145
								var6 = ""; // L: 1146
								break;
							case 1:
								var12 = "Account locked as we suspect it has been stolen."; // L: 1151
								var5 = Strings.field3529; // L: 1152
								var6 = ""; // L: 1153
								break; // L: 1154
							default:
								class69.Login_promptCredentials(false); // L: 1158
							}

							var0.drawCentered(var12, Login.loginBoxX + 180, var16, 16776960, 0); // L: 1162
							var17 = var16 + 15; // L: 1163
							var2.drawCentered(var5, Login.loginBoxX + 180, var17, 16776960, 0); // L: 1164
							var17 += 15; // L: 1165
							var2.drawCentered(var6, Login.loginBoxX + 180, var17, 16776960, 0); // L: 1166
							var17 += 15; // L: 1167
							var7 = Login.loginBoxX + 180; // L: 1168
							var8 = 276; // L: 1169
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1170
							var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0); // L: 1171
							var7 = Login.loginBoxX + 180; // L: 1172
							var8 = 326; // L: 1173
							class289.titlebuttonSprite.drawAt(var7 - 73, var8 - 20); // L: 1174
							var0.drawCentered("Back", var7, var8 + 5, 16777215, 0); // L: 1175
						} else if (Login.loginIndex == 24) { // L: 1177
							var16 = 221; // L: 1178
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var16, 16777215, 0); // L: 1179
							var17 = var16 + 15; // L: 1180
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var17, 16777215, 0); // L: 1181
							var17 += 15; // L: 1182
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var17, 16777215, 0); // L: 1183
							var17 += 15; // L: 1184
							var4 = Login.loginBoxX + 180; // L: 1185
							var11 = 301; // L: 1186
							class289.titlebuttonSprite.drawAt(var4 - 73, var11 - 20); // L: 1187
							var0.drawCentered("Ok", var4, var11 + 5, 16777215, 0); // L: 1188
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1191
				int[] var15 = new int[4]; // L: 1192
				Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 1193
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class0.canvasHeight); // L: 1194
				PendingSpawn.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1195
				PendingSpawn.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1196
				Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 1197
			}

			GrandExchangeEvents.title_muteSprite[class4.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1199
			if (Client.gameState > 5 && AbstractArchive.clientLanguage == Language.Language_EN) { // L: 1200
				if (class35.field244 != null) { // L: 1201
					var17 = Login.xPadding + 5; // L: 1202
					var18 = 463; // L: 1203
					byte var23 = 100; // L: 1204
					byte var22 = 35; // L: 1205
					class35.field244.drawAt(var17, var18); // L: 1206
					var0.drawCentered("World" + " " + Client.worldId, var23 / 2 + var17, var22 / 2 + var18 - 2, 16777215, 0); // L: 1207
					if (World.World_request != null) { // L: 1208
						var1.drawCentered("Loading...", var23 / 2 + var17, var22 / 2 + var18 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var23 / 2 + var17, var22 / 2 + var18 + 12, 16777215, 0); // L: 1209
					}
				} else {
					class35.field244 = TextureProvider.SpriteBuffer_getIndexedSpriteByName(ModeWhere.archive8, "sl_button", ""); // L: 1212
				}
			}

		}
	} // L: 884 1215

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbc;I)V",
		garbageValue = "2038899006"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 263
		if (var0.sound != null) { // L: 264
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 265
		}

	} // L: 266
}
