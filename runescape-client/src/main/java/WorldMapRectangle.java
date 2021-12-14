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
		this.this$0 = var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "18"
	)
	static int method4794(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	static void method4793() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class19.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(InterfaceParent.method2146("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset);
					if (var8 == -1) {
						var7.offset = 0;
						long var24 = var7.readLong();
						var1 = var24;
						break;
					}

					var7.offset += var8;
					if (var7.offset >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var33) {
				var1 = 0L;
			}

			byte var0;
			if (var1 == 0L) {
				var0 = 5;
			} else {
				String var34 = Login.Login_username;
				Random var35 = new Random();
				Buffer var28 = new Buffer(128);
				Buffer var9 = new Buffer(128);
				int[] var10 = new int[]{var35.nextInt(), var35.nextInt(), (int)(var1 >> 32), (int)var1};
				var28.writeByte(10);

				int var11;
				for (var11 = 0; var11 < 4; ++var11) {
					var28.writeInt(var35.nextInt());
				}

				var28.writeInt(var10[0]);
				var28.writeInt(var10[1]);
				var28.writeLong(var1);
				var28.writeLong(0L);

				for (var11 = 0; var11 < 4; ++var11) {
					var28.writeInt(var35.nextInt());
				}

				var28.encryptRsa(class65.field841, class65.field842);
				var9.writeByte(10);

				for (var11 = 0; var11 < 3; ++var11) {
					var9.writeInt(var35.nextInt());
				}

				var9.writeLong(var35.nextLong());
				var9.writeLongMedium(var35.nextLong());
				Decimator.method1082(var9);
				var9.writeLong(var35.nextLong());
				var9.encryptRsa(class65.field841, class65.field842);
				var11 = class116.stringCp1252NullTerminatedByteSize(var34);
				if (var11 % 8 != 0) {
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11);
				var12.writeStringCp1252NullTerminated(var34);
				var12.offset = var11;
				var12.xteaEncryptAll(var10);
				Buffer var13 = new Buffer(var12.offset + var28.offset + var9.offset + 5);
				var13.writeByte(2);
				var13.writeByte(var28.offset);
				var13.writeBytes(var28.array, 0, var28.offset);
				var13.writeByte(var9.offset);
				var13.writeBytes(var9.array, 0, var9.offset);
				var13.writeShort(var12.offset);
				var13.writeBytes(var12.array, 0, var12.offset);
				byte[] var15 = var13.array;
				String var14 = PendingSpawn.method2224(var15, 0, var15.length);
				String var16 = var14;

				byte var29;
				try {
					URL var17 = new URL(InterfaceParent.method2146("services", false) + "m=accountappeal/login.ws");
					URLConnection var18 = var17.openConnection();
					var18.setDoInput(true);
					var18.setDoOutput(true);
					var18.setConnectTimeout(5000);
					OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
					var19.write("data2=" + class260.method5070(var16) + "&dest=" + class260.method5070("passwordchoice.ws"));
					var19.flush();
					InputStream var20 = var18.getInputStream();
					var13 = new Buffer(new byte[1000]);

					while (true) {
						int var21 = var20.read(var13.array, var13.offset, 1000 - var13.offset);
						if (var21 == -1) {
							var19.close();
							var20.close();
							String var30 = new String(var13.array);
							if (var30.startsWith("OFFLINE")) {
								var29 = 4;
							} else if (var30.startsWith("WRONG")) {
								var29 = 7;
							} else if (var30.startsWith("RELOAD")) {
								var29 = 3;
							} else if (var30.startsWith("Not permitted for social network accounts.")) {
								var29 = 6;
							} else {
								var13.xteaDecryptAll(var10);

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) {
									--var13.offset;
								}

								var30 = new String(var13.array, 0, var13.offset);
								boolean var22;
								if (var30 == null) {
									var22 = false;
								} else {
									label113: {
										try {
											new URL(var30);
										} catch (MalformedURLException var31) {
											var22 = false;
											break label113;
										}

										var22 = true;
									}
								}

								if (var22) {
									WorldMapSprite.openURL(var30, true, false);
									var29 = 2;
								} else {
									var29 = 5;
								}
							}
							break;
						}

						var13.offset += var21;
						if (var13.offset >= 1000) {
							var29 = 5;
							break;
						}
					}
				} catch (Throwable var32) {
					var32.printStackTrace();
					var29 = 5;
				}

				var0 = var29;
			}

			switch(var0) {
			case 2:
				class19.setLoginResponseString(Strings.field3747, Strings.field3551, Strings.field3749);
				PlayerType.method5521(6);
				break;
			case 3:
				class19.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class19.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class19.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class19.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class19.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "(I)Lov;",
		garbageValue = "-1090496124"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Varcs.worldMap;
	}
}
