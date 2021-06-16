import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class143 {
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = 592275981
	)
	@Export("menuY")
	static int menuY;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-349868767"
	)
	public static int method2815(int var0, int var1, int var2) {
		var2 &= 3; // L: 9
		if (var2 == 0) { // L: 10
			return var0;
		} else if (var2 == 1) { // L: 11
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1; // L: 12 13
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1661040540"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1187310793"
	)
	static void method2810() {
		Login.Login_username = Login.Login_username.trim(); // L: 710
		if (Login.Login_username.length() == 0) { // L: 711
			CollisionMap.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 712
		} else {
			long var1 = WorldMapElement.method2721(); // L: 716
			byte var0;
			if (var1 == 0L) { // L: 717
				var0 = 5;
			} else {
				String var4 = Login.Login_username; // L: 720
				Random var5 = new Random(); // L: 722
				Buffer var6 = new Buffer(128); // L: 723
				Buffer var7 = new Buffer(128); // L: 724
				int[] var8 = new int[]{var5.nextInt(), var5.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 725 726 727 728 729
				var6.writeByte(10); // L: 730

				int var9;
				for (var9 = 0; var9 < 4; ++var9) { // L: 731
					var6.writeInt(var5.nextInt()); // L: 732
				}

				var6.writeInt(var8[0]); // L: 734
				var6.writeInt(var8[1]); // L: 735
				var6.writeLong(var1); // L: 736
				var6.writeLong(0L); // L: 737

				for (var9 = 0; var9 < 4; ++var9) { // L: 738
					var6.writeInt(var5.nextInt()); // L: 739
				}

				var6.encryptRsa(class80.field983, class80.field984); // L: 741
				var7.writeByte(10); // L: 742

				for (var9 = 0; var9 < 3; ++var9) { // L: 743
					var7.writeInt(var5.nextInt()); // L: 744
				}

				var7.writeLong(var5.nextLong()); // L: 746
				var7.writeLongMedium(var5.nextLong()); // L: 747
				if (Client.randomDatData != null) { // L: 749
					var7.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 750
				} else {
					byte[] var21 = PlatformInfo.method6115(); // L: 753
					var7.writeBytes(var21, 0, var21.length); // L: 754
				}

				var7.writeLong(var5.nextLong()); // L: 756
				var7.encryptRsa(class80.field983, class80.field984); // L: 757
				var9 = class44.stringCp1252NullTerminatedByteSize(var4); // L: 758
				if (var9 % 8 != 0) { // L: 759
					var9 += 8 - var9 % 8;
				}

				Buffer var10 = new Buffer(var9); // L: 760
				var10.writeStringCp1252NullTerminated(var4); // L: 761
				var10.offset = var9; // L: 762
				var10.xteaEncryptAll(var8); // L: 763
				Buffer var11 = new Buffer(var7.offset + var6.offset + var10.offset + 5); // L: 764
				var11.writeByte(2); // L: 765
				var11.writeByte(var6.offset); // L: 766
				var11.writeBytes(var6.array, 0, var6.offset); // L: 767
				var11.writeByte(var7.offset); // L: 768
				var11.writeBytes(var7.array, 0, var7.offset); // L: 769
				var11.writeShort(var10.offset); // L: 770
				var11.writeBytes(var10.array, 0, var10.offset); // L: 771
				byte[] var13 = var11.array; // L: 773
				int var15 = var13.length; // L: 776
				StringBuilder var16 = new StringBuilder(); // L: 778

				int var19;
				for (int var17 = 0; var17 < var15 + 0; var17 += 3) { // L: 779
					int var18 = var13[var17] & 255; // L: 780
					var16.append(class303.field3747[var18 >>> 2]); // L: 781
					if (var17 < var15 - 1) { // L: 782
						var19 = var13[var17 + 1] & 255; // L: 783
						var16.append(class303.field3747[(var18 & 3) << 4 | var19 >>> 4]); // L: 784
						if (var17 < var15 - 2) { // L: 785
							int var20 = var13[var17 + 2] & 255; // L: 786
							var16.append(class303.field3747[(var19 & 15) << 2 | var20 >>> 6]).append(class303.field3747[var20 & 63]); // L: 787
						} else {
							var16.append(class303.field3747[(var19 & 15) << 2]).append("="); // L: 789
						}
					} else {
						var16.append(class303.field3747[(var18 & 3) << 4]).append("=="); // L: 791
					}
				}

				String var14 = var16.toString(); // L: 793
				var14 = var14; // L: 797

				byte var3;
				try {
					URL var22 = new URL(class19.method283("services", false) + "m=accountappeal/login.ws"); // L: 799
					URLConnection var27 = var22.openConnection(); // L: 800
					var27.setDoInput(true); // L: 801
					var27.setDoOutput(true); // L: 802
					var27.setConnectTimeout(5000); // L: 803
					OutputStreamWriter var23 = new OutputStreamWriter(var27.getOutputStream()); // L: 804
					var23.write("data2=" + Renderable.method4251(var14) + "&dest=" + Renderable.method4251("passwordchoice.ws")); // L: 805
					var23.flush(); // L: 806
					InputStream var24 = var27.getInputStream(); // L: 807
					var11 = new Buffer(new byte[1000]); // L: 808

					while (true) {
						var19 = var24.read(var11.array, var11.offset, 1000 - var11.offset); // L: 810
						if (var19 == -1) { // L: 811
							var23.close(); // L: 818
							var24.close(); // L: 819
							String var25 = new String(var11.array); // L: 820
							if (var25.startsWith("OFFLINE")) { // L: 821
								var3 = 4; // L: 822
							} else if (var25.startsWith("WRONG")) { // L: 825
								var3 = 7; // L: 826
							} else if (var25.startsWith("RELOAD")) { // L: 829
								var3 = 3; // L: 830
							} else if (var25.startsWith("Not permitted for social network accounts.")) { // L: 833
								var3 = 6; // L: 834
							} else {
								var11.xteaDecryptAll(var8); // L: 837

								while (var11.offset > 0 && var11.array[var11.offset - 1] == 0) { // L: 838
									--var11.offset; // L: 839
								}

								var25 = new String(var11.array, 0, var11.offset); // L: 841
								if (EnumComposition.method2831(var25)) { // L: 842
									AttackOption.openURL(var25, true, false); // L: 843
									var3 = 2; // L: 844
								} else {
									var3 = 5; // L: 846
								}
							}
							break;
						}

						var11.offset += var19; // L: 812
						if (var11.offset >= 1000) { // L: 813
							var3 = 5; // L: 814
							break;
						}
					}
				} catch (Throwable var26) { // L: 848
					var26.printStackTrace(); // L: 849
					var3 = 5; // L: 850
				}

				var0 = var3; // L: 853
			}

			switch(var0) { // L: 855
			case 2:
				CollisionMap.setLoginResponseString(Strings.field3499, Strings.field3500, Strings.field3286); // L: 872
				Login.loginIndex = 6; // L: 873
				break;
			case 3:
				CollisionMap.setLoginResponseString("", "Error connecting to server.", ""); // L: 863
				break; // L: 864
			case 4:
				CollisionMap.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 857
				break; // L: 858
			case 5:
				CollisionMap.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 860
				break; // L: 861
			case 6:
				CollisionMap.setLoginResponseString("", "Error connecting to server.", ""); // L: 869
				break; // L: 870
			case 7:
				CollisionMap.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 866
			}

		}
	} // L: 713 876

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2116352910"
	)
	public static void method2811() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 269
		NPCComposition.NpcDefinition_cachedModels.clear(); // L: 270
	} // L: 271

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-578637844"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) { // L: 4505
			byte var2 = 4; // L: 4506
			int var3 = var2 + 6; // L: 4507
			int var4 = var2 + 6; // L: 4508
			int var5 = AbstractSocket.fontPlain12.lineWidth(var0, 250); // L: 4509
			int var6 = AbstractSocket.fontPlain12.lineCount(var0, 250) * 13; // L: 4510
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2, 0); // L: 4511
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 16777215); // L: 4512
			AbstractSocket.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0); // L: 4513
			AccessFile.method6437(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2); // L: 4514
			if (var1) { // L: 4515
				AbstractWorldMapData.rasterProvider.drawFull(0, 0); // L: 4516
			} else {
				ReflectionCheck.method1229(var3, var4, var5, var6); // L: 4519
			}

		}
	} // L: 4521
}
