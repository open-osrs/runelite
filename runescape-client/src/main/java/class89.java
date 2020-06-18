import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class89 {
	@ObfuscatedName("p")
	static final BigInteger field1161;
	@ObfuscatedName("g")
	static final BigInteger field1163;

	static {
		field1161 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field1163 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "735302127"
	)
	public static void method2161() {
		WorldMapSprite.midiPcmStream.clear();
		class206.field2439 = 1;
		Huffman.musicTrackArchive = null;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-963420797"
	)
	static void method2159() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			MusicPatchPcmStream.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = WorldMapEvent.method839();
			byte var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				String var4 = Login.Login_username;
				Random var5 = new Random();
				Buffer var6 = new Buffer(128);
				Buffer var7 = new Buffer(128);
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1};
				var6.writeByte(10);

				int var9;
				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.writeInt(var8[0]);
				var6.writeInt(var8[1]);
				var6.writeLong(var1);
				var6.writeLong(0L);

				for (var9 = 0; var9 < 4; ++var9) {
					var6.writeInt(var5.nextInt());
				}

				var6.encryptRsa(field1161, field1163);
				var7.writeByte(10);

				for (var9 = 0; var9 < 3; ++var9) {
					var7.writeInt(var5.nextInt());
				}

				var7.writeLong(var5.nextLong());
				var7.writeLongMedium(var5.nextLong());
				if (Client.randomDatData != null) {
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var10 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var10);

						int var11;
						for (var11 = 0; var11 < 24 && var10[var11] == 0; ++var11) {
						}

						if (var11 >= 24) {
							throw new IOException();
						}
					} catch (Exception var39) {
						for (int var12 = 0; var12 < 24; ++var12) {
							var10[var12] = -1;
						}
					}

					var7.writeBytes(var10, 0, var10.length);
				}

				var7.writeLong(var5.nextLong());
				var7.encryptRsa(field1161, field1163);
				var9 = DynamicObject.stringCp1252NullTerminatedByteSize(var4);
				if (var9 % 8 != 0) {
					var9 += 8 - var9 % 8;
				}

				Buffer var40 = new Buffer(var9);
				var40.writeStringCp1252NullTerminated(var4);
				var40.offset = var9;
				var40.xteaEncryptAll(var8);
				Buffer var28 = new Buffer(var7.offset + var6.offset + var40.offset + 5);
				var28.writeByte(2);
				var28.writeByte(var6.offset);
				var28.writeBytes(var6.array, 0, var6.offset);
				var28.writeByte(var7.offset);
				var28.writeBytes(var7.array, 0, var7.offset);
				var28.writeShort(var40.offset);
				var28.writeBytes(var40.array, 0, var40.offset);
				byte[] var13 = var28.array;
				int var15 = var13.length;
				StringBuilder var16 = new StringBuilder();

				int var20;
				for (int var17 = 0; var17 < var15 + 0; var17 += 3) {
					int var18 = var13[var17] & 255;
					var16.append(class299.field3677[var18 >>> 2]);
					if (var17 < var15 - 1) {
						int var19 = var13[var17 + 1] & 255;
						var16.append(class299.field3677[(var18 & 3) << 4 | var19 >>> 4]);
						if (var17 < var15 - 2) {
							var20 = var13[var17 + 2] & 255;
							var16.append(class299.field3677[(var19 & 15) << 2 | var20 >>> 6]).append(class299.field3677[var20 & 63]);
						} else {
							var16.append(class299.field3677[(var19 & 15) << 2]).append("=");
						}
					} else {
						var16.append(class299.field3677[(var18 & 3) << 4]).append("==");
					}
				}

				String var14 = var16.toString();
				var14 = var14;

				byte var3;
				try {
					URL var31 = new URL(HealthBarDefinition.method4669("services", false) + "m=accountappeal/login.ws");
					URLConnection var41 = var31.openConnection();
					var41.setDoInput(true);
					var41.setDoOutput(true);
					var41.setConnectTimeout(5000);
					OutputStreamWriter var32 = new OutputStreamWriter(var41.getOutputStream());
					var20 = var14.length();
					StringBuilder var21 = new StringBuilder(var20);

					int var22;
					for (var22 = 0; var22 < var20; ++var22) {
						char var23 = var14.charAt(var22);
						if ((var23 < 'a' || var23 > 'z') && (var23 < 'A' || var23 > 'Z') && (var23 < '0' || var23 > '9') && var23 != '.' && var23 != '-' && var23 != '*' && var23 != '_') {
							if (var23 == ' ') {
								var21.append('+');
							} else {
								byte var24 = UserComparator3.charToByteCp1252(var23);
								var21.append('%');
								int var25 = var24 >> 4 & 15;
								if (var25 >= 10) {
									var21.append((char)(var25 + 55));
								} else {
									var21.append((char)(var25 + 48));
								}

								var25 = var24 & 15;
								if (var25 >= 10) {
									var21.append((char)(var25 + 55));
								} else {
									var21.append((char)(var25 + 48));
								}
							}
						} else {
							var21.append(var23);
						}
					}

					String var34 = var21.toString();
					String var35 = "data2=" + var34 + "&dest=";
					var22 = "passwordchoice.ws".length();
					StringBuilder var36 = new StringBuilder(var22);

					for (int var44 = 0; var44 < var22; ++var44) {
						char var45 = "passwordchoice.ws".charAt(var44);
						if ((var45 < 'a' || var45 > 'z') && (var45 < 'A' || var45 > 'Z') && (var45 < '0' || var45 > '9') && var45 != '.' && var45 != '-' && var45 != '*' && var45 != '_') {
							if (var45 == ' ') {
								var36.append('+');
							} else {
								byte var26 = UserComparator3.charToByteCp1252(var45);
								var36.append('%');
								int var27 = var26 >> 4 & 15;
								if (var27 >= 10) {
									var36.append((char)(var27 + 55));
								} else {
									var36.append((char)(var27 + 48));
								}

								var27 = var26 & 15;
								if (var27 >= 10) {
									var36.append((char)(var27 + 55));
								} else {
									var36.append((char)(var27 + 48));
								}
							}
						} else {
							var36.append(var45);
						}
					}

					String var42 = var36.toString();
					var32.write(var35 + var42);
					var32.flush();
					InputStream var37 = var41.getInputStream();
					var28 = new Buffer(new byte[1000]);

					while (true) {
						int var43 = var37.read(var28.array, var28.offset, 1000 - var28.offset);
						if (var43 == -1) {
							var32.close();
							var37.close();
							String var46 = new String(var28.array);
							if (var46.startsWith("OFFLINE")) {
								var3 = 4;
							} else if (var46.startsWith("WRONG")) {
								var3 = 7;
							} else if (var46.startsWith("RELOAD")) {
								var3 = 3;
							} else if (var46.startsWith("Not permitted for social network accounts.")) {
								var3 = 6;
							} else {
								var28.xteaDecryptAll(var8);

								while (var28.offset > 0 && var28.array[var28.offset - 1] == 0) {
									--var28.offset;
								}

								var46 = new String(var28.array, 0, var28.offset);
								if (GrandExchangeOfferUnitPriceComparator.method204(var46)) {
									WorldMapSectionType.openURL(var46, true, false);
									var3 = 2;
								} else {
									var3 = 5;
								}
							}
							break;
						}

						var28.offset += var43;
						if (var28.offset >= 1000) {
							var3 = 5;
							break;
						}
					}
				} catch (Throwable var38) {
					var38.printStackTrace();
					var3 = 5;
				}

				var0 = var3;
			}

			switch(var0) {
			case 2:
				MusicPatchPcmStream.setLoginResponseString(Strings.field3060, Strings.field3061, Strings.field3062);
				Login.loginIndex = 6;
				break;
			case 3:
				MusicPatchPcmStream.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				MusicPatchPcmStream.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				MusicPatchPcmStream.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				MusicPatchPcmStream.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				MusicPatchPcmStream.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
