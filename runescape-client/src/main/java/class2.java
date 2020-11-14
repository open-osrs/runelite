import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
final class class2 implements class0 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkb;I)V",
		garbageValue = "192866787"
	)
	public void vmethod69(Object var1, Buffer var2) {
		this.method25((Long)var1, var2); // L: 33
	} // L: 34

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)Ljava/lang/Object;",
		garbageValue = "-1094020977"
	)
	public Object vmethod72(Buffer var1) {
		return var1.readLong(); // L: 29
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lkb;B)V",
		garbageValue = "3"
	)
	void method25(Long var1, Buffer var2) {
		var2.writeLong(var1); // L: 25
	} // L: 26

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "929998205"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 48
		return var1 == null ? 0 : var1.size(); // L: 49 50
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method38() {
		Login.Login_username = Login.Login_username.trim(); // L: 835
		if (Login.Login_username.length() == 0) { // L: 836
			GrandExchangeOfferNameComparator.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 837
		} else {
			long var1;
			try {
				URL var3 = new URL(NPC.method2157("services", false) + "m=accountappeal/login.ws"); // L: 844
				URLConnection var4 = var3.openConnection(); // L: 845
				var4.setRequestProperty("connection", "close"); // L: 846
				var4.setDoInput(true); // L: 847
				var4.setDoOutput(true); // L: 848
				var4.setConnectTimeout(5000); // L: 849
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream()); // L: 850
				var5.write("data1=req"); // L: 851
				var5.flush(); // L: 852
				InputStream var6 = var4.getInputStream(); // L: 853
				Buffer var7 = new Buffer(new byte[1000]); // L: 854

				while (true) {
					int var8 = var6.read(var7.array, var7.offset, 1000 - var7.offset); // L: 856
					if (var8 == -1) { // L: 857
						var7.offset = 0; // L: 864
						long var22 = var7.readLong(); // L: 865
						var1 = var22; // L: 866
						break;
					}

					var7.offset += var8; // L: 858
					if (var7.offset >= 1000) { // L: 859
						var1 = 0L; // L: 860
						break;
					}
				}
			} catch (Exception var30) { // L: 868
				var1 = 0L; // L: 869
			}

			byte var0;
			if (var1 == 0L) { // L: 873
				var0 = 5;
			} else {
				String var31 = Login.Login_username; // L: 876
				Random var32 = new Random(); // L: 878
				Buffer var26 = new Buffer(128); // L: 879
				Buffer var9 = new Buffer(128); // L: 880
				int[] var10 = new int[]{var32.nextInt(), var32.nextInt(), (int)(var1 >> 32), (int)var1}; // L: 881 882 883 884 885
				var26.writeByte(10); // L: 886

				int var11;
				for (var11 = 0; var11 < 4; ++var11) { // L: 887
					var26.writeInt(var32.nextInt()); // L: 888
				}

				var26.writeInt(var10[0]); // L: 890
				var26.writeInt(var10[1]); // L: 891
				var26.writeLong(var1); // L: 892
				var26.writeLong(0L); // L: 893

				for (var11 = 0; var11 < 4; ++var11) { // L: 894
					var26.writeInt(var32.nextInt()); // L: 895
				}

				var26.encryptRsa(class89.field1166, class89.field1167); // L: 897
				var9.writeByte(10); // L: 898

				for (var11 = 0; var11 < 3; ++var11) { // L: 899
					var9.writeInt(var32.nextInt()); // L: 900
				}

				var9.writeLong(var32.nextLong()); // L: 902
				var9.writeLongMedium(var32.nextLong()); // L: 903
				Language.method3801(var9); // L: 904
				var9.writeLong(var32.nextLong()); // L: 905
				var9.encryptRsa(class89.field1166, class89.field1167); // L: 906
				var11 = SpriteMask.stringCp1252NullTerminatedByteSize(var31); // L: 907
				if (var11 % 8 != 0) { // L: 908
					var11 += 8 - var11 % 8;
				}

				Buffer var12 = new Buffer(var11); // L: 909
				var12.writeStringCp1252NullTerminated(var31); // L: 910
				var12.offset = var11; // L: 911
				var12.xteaEncryptAll(var10); // L: 912
				Buffer var13 = new Buffer(var12.offset + var26.offset + var9.offset + 5); // L: 913
				var13.writeByte(2); // L: 914
				var13.writeByte(var26.offset); // L: 915
				var13.writeBytes(var26.array, 0, var26.offset); // L: 916
				var13.writeByte(var9.offset); // L: 917
				var13.writeBytes(var9.array, 0, var9.offset); // L: 918
				var13.writeShort(var12.offset); // L: 919
				var13.writeBytes(var12.array, 0, var12.offset); // L: 920
				byte[] var15 = var13.array; // L: 922
				String var14 = class299.method5418(var15, 0, var15.length); // L: 924
				String var16 = var14; // L: 926

				byte var27;
				try {
					URL var17 = new URL(NPC.method2157("services", false) + "m=accountappeal/login.ws"); // L: 928
					URLConnection var18 = var17.openConnection(); // L: 929
					var18.setDoInput(true); // L: 930
					var18.setDoOutput(true); // L: 931
					var18.setConnectTimeout(5000); // L: 932
					OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream()); // L: 933
					var19.write("data2=" + class204.method3829(var16) + "&dest=" + class204.method3829("passwordchoice.ws")); // L: 934
					var19.flush(); // L: 935
					InputStream var20 = var18.getInputStream(); // L: 936
					var13 = new Buffer(new byte[1000]); // L: 937

					while (true) {
						int var21 = var20.read(var13.array, var13.offset, 1000 - var13.offset); // L: 939
						if (var21 == -1) { // L: 940
							var19.close(); // L: 947
							var20.close(); // L: 948
							String var28 = new String(var13.array); // L: 949
							if (var28.startsWith("OFFLINE")) { // L: 950
								var27 = 4; // L: 951
							} else if (var28.startsWith("WRONG")) { // L: 954
								var27 = 7; // L: 955
							} else if (var28.startsWith("RELOAD")) { // L: 958
								var27 = 3; // L: 959
							} else if (var28.startsWith("Not permitted for social network accounts.")) { // L: 962
								var27 = 6; // L: 963
							} else {
								var13.xteaDecryptAll(var10); // L: 966

								while (var13.offset > 0 && var13.array[var13.offset - 1] == 0) { // L: 967
									--var13.offset; // L: 968
								}

								var28 = new String(var13.array, 0, var13.offset); // L: 970
								if (HealthBarUpdate.method1870(var28)) { // L: 971
									Skeleton.openURL(var28, true, false); // L: 972
									var27 = 2; // L: 973
								} else {
									var27 = 5; // L: 975
								}
							}
							break;
						}

						var13.offset += var21; // L: 941
						if (var13.offset >= 1000) { // L: 942
							var27 = 5; // L: 943
							break;
						}
					}
				} catch (Throwable var29) { // L: 977
					var29.printStackTrace(); // L: 978
					var27 = 5; // L: 979
				}

				var0 = var27; // L: 982
			}

			switch(var0) { // L: 984
			case 2:
				GrandExchangeOfferNameComparator.setLoginResponseString(Strings.field3054, Strings.field3055, Strings.field3056); // L: 1001
				Login.loginIndex = 6; // L: 1002
				break;
			case 3:
				GrandExchangeOfferNameComparator.setLoginResponseString("", "Error connecting to server.", ""); // L: 989
				break; // L: 990
			case 4:
				GrandExchangeOfferNameComparator.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 998
				break; // L: 999
			case 5:
				GrandExchangeOfferNameComparator.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 995
				break; // L: 996
			case 6:
				GrandExchangeOfferNameComparator.setLoginResponseString("", "Error connecting to server.", ""); // L: 986
				break; // L: 987
			case 7:
				GrandExchangeOfferNameComparator.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 992
			}

		}
	} // L: 838 1005

	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1215217092"
	)
	static final void method30() {
		if (ClientPacket.ClanChat_inClanChat) { // L: 3612
			if (DevicePcmPlayerProvider.clanChat != null) { // L: 3613
				DevicePcmPlayerProvider.clanChat.sort(); // L: 3614
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3617
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3618
				var1.clearIsInClanChat(); // L: 3619
			}

			ClientPacket.ClanChat_inClanChat = false; // L: 3622
		}

	} // L: 3624

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1276683355"
	)
	static final void method41() {
		int var0 = Players.Players_count; // L: 3893
		int[] var1 = Players.Players_indices; // L: 3894

		for (int var2 = 0; var2 < var0; ++var2) { // L: 3895
			Player var3 = Client.players[var1[var2]]; // L: 3896
			if (var3 != null) { // L: 3897
				class13.updateActorSequence(var3, 1); // L: 3898
			}
		}

	} // L: 3901

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1946760208"
	)
	static boolean method28() {
		return (Client.drawPlayerNames & 1) != 0; // L: 4918
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lht;I)Ljava/lang/String;",
		garbageValue = "1452658207"
	)
	static String method39(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) { // L: 9832
			for (int var2 = 1; var2 <= 5; ++var2) { // L: 9833
				while (true) {
					int var3 = var0.indexOf("%" + var2); // L: 9835
					if (var3 == -1) { // L: 9836
						break;
					}

					var0 = var0.substring(0, var3) + HorizontalAlignment.method4880(WorldMapID.method663(var1, var2 - 1)) + var0.substring(var3 + 2); // L: 9837
				}
			}
		}

		return var0; // L: 9841
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-2"
	)
	public static void method42(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class4.getPacketBufferNode(ClientPacket.field2309, Client.packetWriter.isaacCipher); // L: 11647
		var4.packetBuffer.writeShort(var1); // L: 11648
		var4.packetBuffer.writeByte(var2); // L: 11649
		var4.packetBuffer.method5674(var0); // L: 11650
		var4.packetBuffer.method5684(var3 ? Client.field763 * -2027491329 * 1473843199 : 0); // L: 11651
		Client.packetWriter.addNode(var4); // L: 11652
	} // L: 11653
}
