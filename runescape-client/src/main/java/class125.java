import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class125 extends class126 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 863990671
	)
	int field1514;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	final class129 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldk;)V"
	)
	class125(class129 var1) {
		this.this$0 = var1;
		this.field1514 = -1; // L: 114
	} // L: 116

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "703192976"
	)
	void vmethod3019(Buffer var1) {
		this.field1514 = var1.readUnsignedShort(); // L: 119
	} // L: 120

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "750335300"
	)
	void vmethod3020(ClanSettings var1) {
		var1.method2853(this.field1514); // L: 123
	} // L: 124

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)Lpt;",
		garbageValue = "-2047697021"
	)
	public static final SpritePixels method2743(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight();
			int[] var4 = new int[var3 * var2]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-142466895"
	)
	public static int method2741(int var0) {
		return class263.field3091[var0]; // L: 24
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lkq;III)Z",
		garbageValue = "-130705025"
	)
	public static boolean method2744(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 145
		if (var3 == null) {
			return false; // L: 146
		} else {
			class372.SpriteBuffer_decode(var3); // L: 147
			return true; // L: 148
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-981957509"
	)
	static void method2745() {
		Login.Login_username = Login.Login_username.trim(); // L: 1216
		if (Login.Login_username.length() == 0) { // L: 1217
			UserComparator7.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1218
		} else {
			long var1 = SceneTilePaint.method4271(); // L: 1222
			byte var0;
			if (var1 == 0L) { // L: 1223
				var0 = 5;
			} else {
				String var4 = Login.Login_username; // L: 1226
				Random var5 = new Random(); // L: 1228
				Buffer var6 = new Buffer(128); // L: 1229
				Buffer var7 = new Buffer(128); // L: 1230
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 1231 1232 1233 1234 1235
				var6.writeByte(10); // L: 1236

				int var9;
				for (var9 = 0; var9 < 4; ++var9) { // L: 1237
					var6.writeInt(var5.nextInt()); // L: 1238
				}

				var6.writeInt(var8[0]); // L: 1240
				var6.writeInt(var8[1]); // L: 1241
				var6.writeLong(var1); // L: 1242
				var6.writeLong(0L); // L: 1243

				for (var9 = 0; var9 < 4; ++var9) { // L: 1244
					var6.writeInt(var5.nextInt()); // L: 1245
				}

				var6.encryptRsa(class65.field869, class65.field868); // L: 1247
				var7.writeByte(10); // L: 1248

				for (var9 = 0; var9 < 3; ++var9) { // L: 1249
					var7.writeInt(var5.nextInt()); // L: 1250
				}

				var7.writeLong(var5.nextLong()); // L: 1252
				var7.writeLongMedium(var5.nextLong()); // L: 1253
				if (Client.randomDatData != null) { // L: 1255
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 1256
				} else {
					byte[] var22 = KeyHandler.method332(); // L: 1259
					var7.writeBytes(var22, 0, var22.length); // L: 1260
				}

				var7.writeLong(var5.nextLong()); // L: 1262
				var7.encryptRsa(class65.field869, class65.field868); // L: 1263
				var9 = GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var4); // L: 1264
				if (var9 % 8 != 0) { // L: 1265
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9); // L: 1266
				var10.writeStringCp1252NullTerminated(var4); // L: 1267
				var10.offset = var9; // L: 1268
				var10.xteaEncryptAll(var8); // L: 1269
				Buffer var11 = new Buffer(var7.offset + var6.offset + var10.offset + 5); // L: 1270
				var11.writeByte(2); // L: 1271
				var11.writeByte(var6.offset); // L: 1272
				var11.writeBytes(var6.array, 0, var6.offset); // L: 1273
				var11.writeByte(var7.offset); // L: 1274
				var11.writeBytes(var7.array, 0, var7.offset); // L: 1275
				var11.writeShort(var10.offset); // L: 1276
				var11.writeBytes(var10.array, 0, var10.offset); // L: 1277
				byte[] var13 = var11.array; // L: 1279
				String var12 = class134.method2826(var13, 0, var13.length); // L: 1281
				String var14 = var12; // L: 1283

				byte var3;
				try {
					URL var15 = new URL(StructComposition.method3387("services", false) + "m=accountappeal/login.ws"); // L: 1285
					URLConnection var16 = var15.openConnection(); // L: 1286
					var16.setDoInput(true); // L: 1287
					var16.setDoOutput(true); // L: 1288
					var16.setConnectTimeout(5000); // L: 1289
					OutputStreamWriter var17 = new OutputStreamWriter(var16.getOutputStream()); // L: 1290
					var17.write("data2=" + TileItem.method2296(var14) + "&dest=" + TileItem.method2296("passwordchoice.ws")); // L: 1291
					var17.flush(); // L: 1292
					InputStream var18 = var16.getInputStream(); // L: 1293
					var11 = new Buffer(new byte[1000]); // L: 1294

					while (true) {
						int var19 = var18.read(var11.array, var11.offset, 1000 - var11.offset); // L: 1296
						if (var19 == -1) { // L: 1297
							var17.close(); // L: 1304
							var18.close(); // L: 1305
							String var23 = new String(var11.array); // L: 1306
							if (var23.startsWith("OFFLINE")) { // L: 1307
								var3 = 4; // L: 1308
							} else if (var23.startsWith("WRONG")) { // L: 1311
								var3 = 7; // L: 1312
							} else if (var23.startsWith("RELOAD")) { // L: 1315
								var3 = 3; // L: 1316
							} else if (var23.startsWith("Not permitted for social network accounts.")) { // L: 1319
								var3 = 6; // L: 1320
							} else {
								var11.xteaDecryptAll(var8); // L: 1323

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) { // L: 1324
									--var11.offset; // L: 1325
								}

								var23 = new String(var11.array, 0, var11.offset); // L: 1327
								boolean var20;
								if (var23 == null) { // L: 1330
									var20 = false; // L: 1331
								} else {
									label106: {
										try {
											new URL(var23);
										} catch (MalformedURLException var24) { // L: 1337
											var20 = false; // L: 1338
											break label106; // L: 1339
										}

										var20 = true; // L: 1341
									}
								}

								if (var20) { // L: 1343
									MilliClock.openURL(var23, true, false); // L: 1344
									var3 = 2; // L: 1345
								} else {
									var3 = 5; // L: 1347
								}
							}
							break;
						}

						var11.offset += var19; // L: 1298
						if (var11.offset >= 1000) { // L: 1299
							var3 = 5; // L: 1300
							break;
						}
					}
				} catch (Throwable var25) { // L: 1349
					var25.printStackTrace(); // L: 1350
					var3 = 5; // L: 1351
				}

				var0 = var3; // L: 1354
			}

			switch(var0) { // L: 1356
			case 2:
				UserComparator7.setLoginResponseString(Strings.field3802, Strings.field3569, Strings.field3716); // L: 1370
				Player.method2159(6); // L: 1371
				break; // L: 1372
			case 3:
				UserComparator7.setLoginResponseString("", "Error connecting to server.", ""); // L: 1374
				break;
			case 4:
				UserComparator7.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1358
				break; // L: 1359
			case 5:
				UserComparator7.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1361
				break; // L: 1362
			case 6:
				UserComparator7.setLoginResponseString("", "Error connecting to server.", ""); // L: 1367
				break; // L: 1368
			case 7:
				UserComparator7.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1364
			}

		}
	} // L: 1219 1377

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lcw;IILgl;I)V",
		garbageValue = "-864027006"
	)
	static final void method2742(Player var0, int var1, int var2, class185 var3) {
		int var4 = var0.pathX[0]; // L: 7869
		int var5 = var0.pathY[0]; // L: 7870
		int var6 = var0.transformedSize(); // L: 7871
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 7872
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 7873
				int var8 = var0.transformedSize(); // L: 7875
				Client.field781.approxDestinationX = var1; // L: 7878
				Client.field781.approxDestinationY = var2; // L: 7879
				Client.field781.approxDestinationSizeX = 1; // L: 7880
				Client.field781.approxDestinationSizeY = 1; // L: 7881
				ApproximateRouteStrategy var9 = Client.field781; // L: 7882
				ApproximateRouteStrategy var10 = var9; // L: 7884
				CollisionMap var11 = Client.collisionMaps[var0.plane]; // L: 7885
				int[] var12 = Client.field782; // L: 7886
				int[] var13 = Client.field783; // L: 7887

				int var14;
				int var15;
				for (var14 = 0; var14 < 128; ++var14) { // L: 7889
					for (var15 = 0; var15 < 128; ++var15) { // L: 7890
						class186.directions[var14][var15] = 0; // L: 7891
						class186.distances[var14][var15] = 99999999; // L: 7892
					}
				}

				int var16;
				int var17;
				byte var19;
				int var20;
				int var21;
				int var23;
				int var25;
				int var26;
				int var27;
				int var28;
				boolean var34;
				int var36;
				int var37;
				int var39;
				if (var8 == 1) { // L: 7896
					var34 = class16.method199(var4, var5, var9, var11);
				} else if (var8 == 2) { // L: 7897
					var34 = PlayerComposition.method5395(var4, var5, var9, var11);
				} else {
					var16 = var4; // L: 7901
					var17 = var5; // L: 7902
					byte var18 = 64; // L: 7903
					var19 = 64; // L: 7904
					var20 = var4 - var18; // L: 7905
					var21 = var5 - var19; // L: 7906
					class186.directions[var18][var19] = 99; // L: 7907
					class186.distances[var18][var19] = 0; // L: 7908
					byte var22 = 0; // L: 7909
					var23 = 0; // L: 7910
					class186.bufferX[var22] = var4; // L: 7911
					var39 = var22 + 1;
					class186.bufferY[var22] = var5; // L: 7912
					int[][] var24 = var11.flags; // L: 7913

					boolean var35;
					label494:
					while (true) {
						label492:
						while (true) {
							do {
								do {
									do {
										label469:
										do {
											if (var23 == var39) { // L: 7914
												SecureRandomCallable.field1009 = var16; // L: 8034
												class7.field39 = var17; // L: 8035
												var35 = false; // L: 8036
												break label494;
											}

											var16 = class186.bufferX[var23]; // L: 7915
											var17 = class186.bufferY[var23]; // L: 7916
											var23 = var23 + 1 & 4095; // L: 7917
											var36 = var16 - var20; // L: 7918
											var37 = var17 - var21; // L: 7919
											var25 = var16 - var11.xInset; // L: 7920
											var26 = var17 - var11.yInset; // L: 7921
											if (var10.hasArrived(var8, var16, var17, var11)) { // L: 7922
												SecureRandomCallable.field1009 = var16; // L: 7923
												class7.field39 = var17; // L: 7924
												var35 = true; // L: 7925
												break label494;
											}

											var27 = class186.distances[var36][var37] + 1; // L: 7928
											if (var36 > 0 && class186.directions[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136782) == 0 && (var24[var25 - 1][var8 + var26 - 1] & 19136824) == 0) { // L: 7929 7930 7931 7932
												var28 = 1;

												while (true) {
													if (var28 >= var8 - 1) {
														class186.bufferX[var39] = var16 - 1; // L: 7936
														class186.bufferY[var39] = var17; // L: 7937
														var39 = var39 + 1 & 4095; // L: 7938
														class186.directions[var36 - 1][var37] = 2; // L: 7939
														class186.distances[var36 - 1][var37] = var27; // L: 7940
														break;
													}

													if ((var24[var25 - 1][var26 + var28] & 19136830) != 0) { // L: 7934
														break;
													}

													++var28; // L: 7933
												}
											}

											if (var36 < 128 - var8 && class186.directions[var36 + 1][var37] == 0 && (var24[var25 + var8][var26] & 19136899) == 0 && (var24[var25 + var8][var8 + var26 - 1] & 19136992) == 0) { // L: 7942 7943 7944 7945
												var28 = 1;

												while (true) {
													if (var28 >= var8 - 1) {
														class186.bufferX[var39] = var16 + 1; // L: 7949
														class186.bufferY[var39] = var17; // L: 7950
														var39 = var39 + 1 & 4095; // L: 7951
														class186.directions[var36 + 1][var37] = 8; // L: 7952
														class186.distances[var36 + 1][var37] = var27; // L: 7953
														break;
													}

													if ((var24[var8 + var25][var26 + var28] & 19136995) != 0) { // L: 7947
														break;
													}

													++var28; // L: 7946
												}
											}

											if (var37 > 0 && class186.directions[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136782) == 0 && (var24[var8 + var25 - 1][var26 - 1] & 19136899) == 0) { // L: 7955 7956 7957 7958
												var28 = 1;

												while (true) {
													if (var28 >= var8 - 1) {
														class186.bufferX[var39] = var16; // L: 7962
														class186.bufferY[var39] = var17 - 1; // L: 7963
														var39 = var39 + 1 & 4095; // L: 7964
														class186.directions[var36][var37 - 1] = 1; // L: 7965
														class186.distances[var36][var37 - 1] = var27; // L: 7966
														break;
													}

													if ((var24[var28 + var25][var26 - 1] & 19136911) != 0) { // L: 7960
														break;
													}

													++var28; // L: 7959
												}
											}

											if (var37 < 128 - var8 && class186.directions[var36][var37 + 1] == 0 && (var24[var25][var26 + var8] & 19136824) == 0 && (var24[var8 + var25 - 1][var8 + var26] & 19136992) == 0) { // L: 7968 7969 7970 7971
												var28 = 1;

												while (true) {
													if (var28 >= var8 - 1) {
														class186.bufferX[var39] = var16; // L: 7975
														class186.bufferY[var39] = var17 + 1; // L: 7976
														var39 = var39 + 1 & 4095; // L: 7977
														class186.directions[var36][var37 + 1] = 4; // L: 7978
														class186.distances[var36][var37 + 1] = var27; // L: 7979
														break;
													}

													if ((var24[var25 + var28][var26 + var8] & 19137016) != 0) { // L: 7973
														break;
													}

													++var28; // L: 7972
												}
											}

											if (var36 > 0 && var37 > 0 && class186.directions[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0) { // L: 7981 7982 7983
												var28 = 1;

												while (true) {
													if (var28 >= var8) {
														class186.bufferX[var39] = var16 - 1; // L: 7988
														class186.bufferY[var39] = var17 - 1; // L: 7989
														var39 = var39 + 1 & 4095; // L: 7990
														class186.directions[var36 - 1][var37 - 1] = 3; // L: 7991
														class186.distances[var36 - 1][var37 - 1] = var27; // L: 7992
														break;
													}

													if ((var24[var25 - 1][var28 + (var26 - 1)] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var26 - 1] & 19136911) != 0) { // L: 7985 7986
														break;
													}

													++var28; // L: 7984
												}
											}

											if (var36 < 128 - var8 && var37 > 0 && class186.directions[var36 + 1][var37 - 1] == 0 && (var24[var25 + var8][var26 - 1] & 19136899) == 0) { // L: 7994 7995 7996
												var28 = 1;

												while (true) {
													if (var28 >= var8) {
														class186.bufferX[var39] = var16 + 1; // L: 8001
														class186.bufferY[var39] = var17 - 1; // L: 8002
														var39 = var39 + 1 & 4095; // L: 8003
														class186.directions[var36 + 1][var37 - 1] = 9; // L: 8004
														class186.distances[var36 + 1][var37 - 1] = var27; // L: 8005
														break;
													}

													if ((var24[var25 + var8][var28 + (var26 - 1)] & 19136995) != 0 || (var24[var25 + var28][var26 - 1] & 19136911) != 0) { // L: 7998 7999
														break;
													}

													++var28; // L: 7997
												}
											}

											if (var36 > 0 && var37 < 128 - var8 && class186.directions[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var8 + var26] & 19136824) == 0) { // L: 8007 8008 8009
												for (var28 = 1; var28 < var8; ++var28) { // L: 8010
													if ((var24[var25 - 1][var26 + var28] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var26 + var8] & 19137016) != 0) { // L: 8011 8012
														continue label469;
													}
												}

												class186.bufferX[var39] = var16 - 1; // L: 8014
												class186.bufferY[var39] = var17 + 1; // L: 8015
												var39 = var39 + 1 & 4095; // L: 8016
												class186.directions[var36 - 1][var37 + 1] = 6; // L: 8017
												class186.distances[var36 - 1][var37 + 1] = var27; // L: 8018
											}
										} while(var36 >= 128 - var8); // L: 8020
									} while(var37 >= 128 - var8);
								} while(class186.directions[var36 + 1][var37 + 1] != 0); // L: 8021
							} while((var24[var8 + var25][var26 + var8] & 19136992) != 0); // L: 8022

							for (var28 = 1; var28 < var8; ++var28) { // L: 8023
								if ((var24[var28 + var25][var8 + var26] & 19137016) != 0 || (var24[var25 + var8][var28 + var26] & 19136995) != 0) { // L: 8024 8025
									continue label492;
								}
							}

							class186.bufferX[var39] = var16 + 1; // L: 8027
							class186.bufferY[var39] = var17 + 1; // L: 8028
							var39 = var39 + 1 & 4095; // L: 8029
							class186.directions[var36 + 1][var37 + 1] = 12; // L: 8030
							class186.distances[var36 + 1][var37 + 1] = var27; // L: 8031
						}
					}

					var34 = var35; // L: 8038
				}

				int var7;
				label540: {
					var15 = var4 - 64; // L: 8040
					var16 = var5 - 64; // L: 8041
					var17 = SecureRandomCallable.field1009; // L: 8042
					var36 = class7.field39; // L: 8043
					if (!var34) { // L: 8044
						var37 = Integer.MAX_VALUE; // L: 8046
						var20 = Integer.MAX_VALUE; // L: 8047
						byte var38 = 10; // L: 8048
						var39 = var10.approxDestinationX; // L: 8049
						var23 = var10.approxDestinationY; // L: 8050
						int var33 = var10.approxDestinationSizeX; // L: 8051
						var25 = var10.approxDestinationSizeY; // L: 8052

						for (var26 = var39 - var38; var26 <= var38 + var39; ++var26) { // L: 8053
							for (var27 = var23 - var38; var27 <= var23 + var38; ++var27) { // L: 8054
								var28 = var26 - var15; // L: 8055
								int var29 = var27 - var16; // L: 8056
								if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class186.distances[var28][var29] < 100) { // L: 8057 8058
									int var30 = 0; // L: 8059
									if (var26 < var39) { // L: 8060
										var30 = var39 - var26;
									} else if (var26 > var39 + var33 - 1) { // L: 8061
										var30 = var26 - (var39 + var33 - 1);
									}

									int var31 = 0; // L: 8062
									if (var27 < var23) { // L: 8063
										var31 = var23 - var27;
									} else if (var27 > var23 + var25 - 1) { // L: 8064
										var31 = var27 - (var25 + var23 - 1);
									}

									int var32 = var31 * var31 + var30 * var30; // L: 8065
									if (var32 < var37 || var37 == var32 && class186.distances[var28][var29] < var20) { // L: 8066
										var37 = var32; // L: 8067
										var20 = class186.distances[var28][var29]; // L: 8068
										var17 = var26; // L: 8069
										var36 = var27; // L: 8070
									}
								}
							}
						}

						if (var37 == Integer.MAX_VALUE) { // L: 8076
							var7 = -1; // L: 8077
							break label540;
						}
					}

					if (var4 == var17 && var36 == var5) { // L: 8086
						var12[0] = var17; // L: 8087
						var13[0] = var36; // L: 8088
						var7 = 0; // L: 8089
					} else {
						var19 = 0; // L: 8092
						class186.bufferX[var19] = var17; // L: 8095
						var37 = var19 + 1;
						class186.bufferY[var19] = var36; // L: 8096

						for (var20 = var21 = class186.directions[var17 - var15][var36 - var16]; var4 != var17 || var36 != var5; var20 = class186.directions[var17 - var15][var36 - var16]) { // L: 8097 8098 8108
							if (var21 != var20) { // L: 8099
								var21 = var20; // L: 8100
								class186.bufferX[var37] = var17; // L: 8101
								class186.bufferY[var37++] = var36; // L: 8102
							}

							if ((var20 & 2) != 0) { // L: 8104
								++var17;
							} else if ((var20 & 8) != 0) { // L: 8105
								--var17;
							}

							if ((var20 & 1) != 0) { // L: 8106
								++var36;
							} else if ((var20 & 4) != 0) { // L: 8107
								--var36;
							}
						}

						var39 = 0; // L: 8110

						while (var37-- > 0) { // L: 8111
							var12[var39] = class186.bufferX[var37]; // L: 8112
							var13[var39++] = class186.bufferY[var37]; // L: 8113
							if (var39 >= var12.length) { // L: 8114
								break;
							}
						}

						var7 = var39; // L: 8116
					}
				}

				var14 = var7; // L: 8118
				if (var7 >= 1) { // L: 8119
					for (var15 = 0; var15 < var14 - 1; ++var15) { // L: 8120
						var0.method2116(Client.field782[var15], Client.field783[var15], var3);
					}

				}
			}
		}
	} // L: 8121
}
