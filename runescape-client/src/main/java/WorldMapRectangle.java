import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -588844259
	)
	@Export("width")
	int width;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 671222849
	)
	@Export("height")
	int height;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1126418901
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1865600049
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	final WorldMapManager this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhe;)V"
	)
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1; // L: 303
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "18"
	)
	static int method4794(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 84
			var1 /= 2;
		}

		if (var2 > 192) { // L: 85
			var1 /= 2;
		}

		if (var2 > 217) { // L: 86
			var1 /= 2;
		}

		if (var2 > 243) { // L: 87
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 88
		return var3; // L: 89
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	static void method4793() {
		Login.Login_username = Login.Login_username.trim(); // L: 1066
		if (Login.Login_username.length() == 0) { // L: 1067
			class19.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1068
		} else {
			long var1;
			try {
				URL var3 = new URL(InterfaceParent.method2146("services", false) + "m=accountappeal/login.ws"); // L: 1075
				URLConnection var4 = var3.openConnection(); // L: 1076
				var4.setRequestProperty("connection", "close"); // L: 1077
				var4.setDoInput(true); // L: 1078
				var4.setDoOutput(true); // L: 1079
				var4.setConnectTimeout(5000); // L: 1080
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 1081
				var5.write("data1=req"); // L: 1082
				var5.flush(); // L: 1083
				InputStream var6 = var4.getInputStream(); // L: 1084
				Buffer var7 = new Buffer(new byte[1000]); // L: 1085

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 1087
					if (var8 == -1) { // L: 1088
						var7.offset = 0; // L: 1095
						long var24 = var7.readLong(); // L: 1096
						var1 = var24; // L: 1097
						break;
					}

					var7.offset += var8; // L: 1089
					if (var7.offset >= 1000) { // L: 1090
						var1 = 0L; // L: 1091
						break;
					}
				}
			} catch (Exception var33) { // L: 1099
				var1 = 0L; // L: 1100
			}

			byte var0;
			if (var1 == 0L) { // L: 1104
				var0 = 5;
			} else {
				String var34 = Login.Login_username; // L: 1107
				Random var35 = new Random(); // L: 1109
				Buffer var28 = new Buffer(128); // L: 1110
				Buffer var9 = new Buffer(128); // L: 1111
				int[] var10 = new int[]{var35.nextInt(), var35.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1112 1113 1114 1115 1116
				var28.writeByte(10); // L: 1117

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 1118
					var28.writeInt(var35.nextInt()); // L: 1119
				}

				var28.writeInt(var10[0]); // L: 1121
				var28.writeInt(var10[1]); // L: 1122
				var28.writeLong(var1); // L: 1123
				var28.writeLong(0L); // L: 1124

				for (var11 = 0; var11 < 4; ++var11) { // L: 1125
					var28.writeInt(var35.nextInt()); // L: 1126
				}

				var28.encryptRsa(class65.field841, class65.field842); // L: 1128
				var9.writeByte(10); // L: 1129

				for (var11 = 0; var11 < 3; ++var11) { // L: 1130
					var9.writeInt(var35.nextInt()); // L: 1131
				}

				var9.writeLong(var35.nextLong()); // L: 1133
				var9.writeLongMedium(var35.nextLong()); // L: 1134
				Decimator.method1082(var9); // L: 1135
				var9.writeLong(var35.nextLong()); // L: 1136
				var9.encryptRsa(class65.field841, class65.field842); // L: 1137
				var11 = class116.stringCp1252NullTerminatedByteSize(var34); // L: 1138
				if (var11 % 8 != 0) { // L: 1139
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11); // L: 1140
				var12.writeStringCp1252NullTerminated(var34); // L: 1141
				var12.offset = var11; // L: 1142
				var12.xteaEncryptAll(var10); // L: 1143
				Buffer var13 = new Buffer(var12.offset + var28.offset + var9.offset + 5); // L: 1144
				var13.writeByte(2); // L: 1145
				var13.writeByte(var28.offset); // L: 1146
				var13.writeBytes(var28.array, 0, var28.offset); // L: 1147
				var13.writeByte(var9.offset); // L: 1148
				var13.writeBytes(var9.array, 0, var9.offset); // L: 1149
				var13.writeShort(var12.offset); // L: 1150
				var13.writeBytes(var12.array, 0, var12.offset); // L: 1151
				byte[] var15 = var13.array; // L: 1153
				String var14 = PendingSpawn.method2224(var15, 0, var15.length); // L: 1155
				String var16 = var14; // L: 1157

				byte var29;
				try {
					URL var17 = new URL(InterfaceParent.method2146("services", false) + "m=accountappeal/login.ws"); // L: 1159
					URLConnection var18 = var17.openConnection(); // L: 1160
					var18.setDoInput(true); // L: 1161
					var18.setDoOutput(true); // L: 1162
					var18.setConnectTimeout(5000); // L: 1163
					OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream()); // L: 1164
					var19.write("data2=" + class260.method5070(var16) + "&dest=" + class260.method5070("passwordchoice.ws")); // L: 1165
					var19.flush(); // L: 1166
					InputStream var20 = var18.getInputStream(); // L: 1167
					var13 = new Buffer(new byte[1000]); // L: 1168

					while (true) {
						int var21 = var20.read(var13.array, var13.offset, 1000 - var13.offset); // L: 1170
						if (var21 == -1) { // L: 1171
							var19.close(); // L: 1178
							var20.close(); // L: 1179
							String var30 = new String(var13.array); // L: 1180
							if (var30.startsWith("OFFLINE")) { // L: 1181
								var29 = 4; // L: 1182
							} else if (var30.startsWith("WRONG")) { // L: 1185
								var29 = 7; // L: 1186
							} else if (var30.startsWith("RELOAD")) { // L: 1189
								var29 = 3; // L: 1190
							} else if (var30.startsWith("Not permitted for social network accounts.")) { // L: 1193
								var29 = 6; // L: 1194
							} else {
								var13.xteaDecryptAll(var10); // L: 1197

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) { // L: 1198
									--var13.offset; // L: 1199
								}

								var30 = new String(var13.array, 0, var13.offset); // L: 1201
								boolean var22;
								if (var30 == null) { // L: 1204
									var22 = false; // L: 1205
								} else {
									label113: {
										try {
											new URL(var30);
										} catch (MalformedURLException var31) { // L: 1211
											var22 = false; // L: 1212
											break label113; // L: 1213
										}

										var22 = true; // L: 1215
									}
								}

								if (var22) { // L: 1217
									WorldMapSprite.openURL(var30, true, false); // L: 1218
									var29 = 2; // L: 1219
								} else {
									var29 = 5; // L: 1221
								}
							}
							break;
						}

						var13.offset += var21; // L: 1172
						if (var13.offset >= 1000) { // L: 1173
							var29 = 5; // L: 1174
							break;
						}
					}
				} catch (Throwable var32) { // L: 1223
					var32.printStackTrace(); // L: 1224
					var29 = 5; // L: 1225
				}

				var0 = var29; // L: 1228
			}

			switch(var0) { // L: 1230
			case 2:
				class19.setLoginResponseString(Strings.field3747, Strings.field3551, Strings.field3749); // L: 1232
				PlayerType.method5521(6); // L: 1233
				break; // L: 1234
			case 3:
				class19.setLoginResponseString("", "Error connecting to server.", ""); // L: 1248
				break;
			case 4:
				class19.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1236
				break; // L: 1237
			case 5:
				class19.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1242
				break; // L: 1243
			case 6:
				class19.setLoginResponseString("", "Error connecting to server.", ""); // L: 1245
				break; // L: 1246
			case 7:
				class19.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1239
			}

		}
	} // L: 1069 1251

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "-1090496124"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Varcs.worldMap; // L: 656
	}
}
