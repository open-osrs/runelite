import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown; // L: 6
		this.ignored = TriBool.TriBool_unknown; // L: 7
	} // L: 9

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1300571849"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown; // L: 12
	} // L: 13

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1945487843"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) { // L: 16
			this.fillIsFriend(); // L: 17
		}

		return this.friend == TriBool.TriBool_true; // L: 19
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = NetSocket.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 23
	} // L: 24

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "61"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown; // L: 27
	} // L: 28

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "601254132"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) { // L: 31
			this.fillIsIgnored(); // L: 32
		}

		return this.ignored == TriBool.TriBool_true; // L: 34
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-440591589"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = NetSocket.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 38
	} // L: 39

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1024085126"
	)
	static void method5712() {
		Login.Login_username = Login.Login_username.trim(); // L: 786
		if (Login.Login_username.length() == 0) { // L: 787
			class260.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 788
		} else {
			long var1;
			try {
				URL var3 = new URL(KitDefinition.method2705("services", false) + "m=accountappeal/login.ws"); // L: 795
				URLConnection var4 = var3.openConnection(); // L: 796
				var4.setRequestProperty("connection", "close"); // L: 797
				var4.setDoInput(true); // L: 798
				var4.setDoOutput(true); // L: 799
				var4.setConnectTimeout(5000); // L: 800
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 801
				var5.write("data1=req"); // L: 802
				var5.flush(); // L: 803
				InputStream var6 = var4.getInputStream(); // L: 804
				Buffer var7 = new Buffer(new byte[1000]); // L: 805

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 807
					if (var8 == -1) { // L: 808
						var7.offset = 0; // L: 815
						long var23 = var7.readLong(); // L: 816
						var1 = var23; // L: 817
						break;
					}

					var7.offset += var8; // L: 809
					if (var7.offset >= 1000) { // L: 810
						var1 = 0L; // L: 811
						break;
					}
				}
			} catch (Exception var38) { // L: 819
				var1 = 0L; // L: 820
			}

			byte var0;
			if (var1 == 0L) { // L: 824
				var0 = 5;
			} else {
				String var39 = Login.Login_username; // L: 827
				Random var40 = new Random(); // L: 829
				Buffer var27 = new Buffer(128); // L: 830
				Buffer var9 = new Buffer(128); // L: 831
				int[] var10 = new int[]{var40.nextInt(), var40.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 832 833 834 835 836
				var27.writeByte(10); // L: 837

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 838
					var27.writeInt(var40.nextInt()); // L: 839
				}

				var27.writeInt(var10[0]); // L: 841
				var27.writeInt(var10[1]); // L: 842
				var27.writeLong(var1); // L: 843
				var27.writeLong(0L); // L: 844

				for (var11 = 0; var11 < 4; ++var11) { // L: 845
					var27.writeInt(var40.nextInt()); // L: 846
				}

				var27.encryptRsa(class80.field1006, class80.field1007); // L: 848
				var9.writeByte(10); // L: 849

				for (var11 = 0; var11 < 3; ++var11) { // L: 850
					var9.writeInt(var40.nextInt()); // L: 851
				}

				var9.writeLong(var40.nextLong()); // L: 853
				var9.writeLongMedium(var40.nextLong()); // L: 854
				if (Client.randomDatData != null) { // L: 856
					var9.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 857
				} else {
					byte[] var12 = new byte[24]; // L: 862

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 864
						JagexCache.JagexCache_randomDat.readFully(var12); // L: 865

						int var13;
						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) { // L: 866 867 868
						}

						if (var13 >= 24) { // L: 870
							throw new IOException();
						}
					} catch (Exception var37) {
						for (int var14 = 0; var14 < 24; ++var14) { // L: 873
							var12[var14] = -1;
						}
					}

					var9.writeBytes(var12, 0, var12.length); // L: 878
				}

				var9.writeLong(var40.nextLong()); // L: 880
				var9.encryptRsa(class80.field1006, class80.field1007); // L: 881
				var11 = Tiles.stringCp1252NullTerminatedByteSize(var39); // L: 882
				if (var11 % 8 != 0) { // L: 883
					var11 += 8 - var11 % 8;
				}

				Buffer var41 = new Buffer(var11); // L: 884
				var41.writeStringCp1252NullTerminated(var39); // L: 885
				var41.offset = var11; // L: 886
				var41.xteaEncryptAll(var10); // L: 887
				Buffer var28 = new Buffer(var41.offset + var27.offset + var9.offset + 5); // L: 888
				var28.writeByte(2); // L: 889
				var28.writeByte(var27.offset); // L: 890
				var28.writeBytes(var27.array, 0, var27.offset); // L: 891
				var28.writeByte(var9.offset); // L: 892
				var28.writeBytes(var9.array, 0, var9.offset); // L: 893
				var28.writeShort(var41.offset); // L: 894
				var28.writeBytes(var41.array, 0, var41.offset); // L: 895
				byte[] var15 = var28.array; // L: 897
				int var17 = var15.length; // L: 900
				StringBuilder var18 = new StringBuilder(); // L: 902

				int var21;
				for (int var19 = 0; var19 < var17 + 0; var19 += 3) { // L: 903
					int var20 = var15[var19] & 255; // L: 904
					var18.append(class302.field3743[var20 >>> 2]); // L: 905
					if (var19 < var17 - 1) { // L: 906
						var21 = var15[var19 + 1] & 255; // L: 907
						var18.append(class302.field3743[(var20 & 3) << 4 | var21 >>> 4]); // L: 908
						if (var19 < var17 - 2) { // L: 909
							int var22 = var15[var19 + 2] & 255; // L: 910
							var18.append(class302.field3743[(var21 & 15) << 2 | var22 >>> 6]).append(class302.field3743[var22 & 63]); // L: 911
						} else {
							var18.append(class302.field3743[(var21 & 15) << 2]).append("="); // L: 913
						}
					} else {
						var18.append(class302.field3743[(var20 & 3) << 4]).append("=="); // L: 915
					}
				}

				String var16 = var18.toString(); // L: 917
				var16 = var16; // L: 921

				byte var34;
				try {
					URL var31 = new URL(KitDefinition.method2705("services", false) + "m=accountappeal/login.ws"); // L: 923
					URLConnection var42 = var31.openConnection(); // L: 924
					var42.setDoInput(true); // L: 925
					var42.setDoOutput(true); // L: 926
					var42.setConnectTimeout(5000); // L: 927
					OutputStreamWriter var32 = new OutputStreamWriter(var42.getOutputStream()); // L: 928
					var32.write("data2=" + FloorUnderlayDefinition.method2839(var16) + "&dest=" + FloorUnderlayDefinition.method2839("passwordchoice.ws")); // L: 929
					var32.flush(); // L: 930
					InputStream var33 = var42.getInputStream(); // L: 931
					var28 = new Buffer(new byte[1000]); // L: 932

					while (true) {
						var21 = var33.read(var28.array, var28.offset, 1000 - var28.offset); // L: 934
						if (var21 == -1) { // L: 935
							var32.close(); // L: 942
							var33.close(); // L: 943
							String var35 = new String(var28.array); // L: 944
							if (var35.startsWith("OFFLINE")) { // L: 945
								var34 = 4; // L: 946
							} else if (var35.startsWith("WRONG")) { // L: 949
								var34 = 7; // L: 950
							} else if (var35.startsWith("RELOAD")) { // L: 953
								var34 = 3; // L: 954
							} else if (var35.startsWith("Not permitted for social network accounts.")) { // L: 957
								var34 = 6; // L: 958
							} else {
								var28.xteaDecryptAll(var10); // L: 961

								while (var28.offset > 0 && var28.array[var28.offset - 1] == 0) { // L: 962
									--var28.offset; // L: 963
								}

								var35 = new String(var28.array, 0, var28.offset); // L: 965
								if (Interpreter.method1848(var35)) { // L: 966
									Players.openURL(var35, true, false); // L: 967
									var34 = 2; // L: 968
								} else {
									var34 = 5; // L: 970
								}
							}
							break;
						}

						var28.offset += var21; // L: 936
						if (var28.offset >= 1000) { // L: 937
							var34 = 5; // L: 938
							break;
						}
					}
				} catch (Throwable var36) { // L: 972
					var36.printStackTrace(); // L: 973
					var34 = 5; // L: 974
				}

				var0 = var34; // L: 977
			}

			switch(var0) { // L: 979
			case 2:
				class260.setLoginResponseString(Strings.field3503, Strings.field3504, Strings.field3505); // L: 996
				Login.loginIndex = 6; // L: 997
				break;
			case 3:
				class260.setLoginResponseString("", "Error connecting to server.", ""); // L: 984
				break; // L: 985
			case 4:
				class260.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 993
				break; // L: 994
			case 5:
				class260.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 990
				break; // L: 991
			case 6:
				class260.setLoginResponseString("", "Error connecting to server.", ""); // L: 981
				break; // L: 982
			case 7:
				class260.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 987
			}

		}
	} // L: 789 1000
}
