import java.io.IOException;
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
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("a")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -2117760903
	)
	static int field2321;
	@ObfuscatedName("hy")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1196340151
	)
	@Export("type")
	final int type;
	@ObfuscatedName("n")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 26
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "-23723856"
	)
	static final int method4312(long var0, String var2) {
		Random var3 = new Random(); // L: 65
		Buffer var4 = new Buffer(128); // L: 66
		Buffer var5 = new Buffer(128); // L: 67
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0}; // L: 68 69 70 71 72
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]); // L: 77
		var4.writeInt(var6[1]); // L: 78
		var4.writeLong(var0); // L: 79
		var4.writeLong(0L); // L: 80

		for (var7 = 0; var7 < 4; ++var7) { // L: 81
			var4.writeInt(var3.nextInt()); // L: 82
		}

		var4.encryptRsa(class65.field863, class65.field864); // L: 84
		var5.writeByte(10); // L: 85

		for (var7 = 0; var7 < 3; ++var7) { // L: 86
			var5.writeInt(var3.nextInt()); // L: 87
		}

		var5.writeLong(var3.nextLong()); // L: 89
		var5.writeLongMedium(var3.nextLong()); // L: 90
		if (Client.randomDatData != null) { // L: 92
			var5.writeBytes(Client.randomDatData, 0, Client.randomDatData.length); // L: 93
		} else {
			byte[] var8 = new byte[24]; // L: 98

			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 100
				JagexCache.JagexCache_randomDat.readFully(var8); // L: 101

				int var9;
				for (var9 = 0; var9 < 24 && var8[var9] == 0; ++var9) { // L: 102 103 104
				}

				if (var9 >= 24) { // L: 106
					throw new IOException();
				}
			} catch (Exception var24) {
				for (int var10 = 0; var10 < 24; ++var10) { // L: 109
					var8[var10] = -1;
				}
			}

			var5.writeBytes(var8, 0, var8.length); // L: 114
		}

		var5.writeLong(var3.nextLong()); // L: 116
		var5.encryptRsa(class65.field863, class65.field864); // L: 117
		var7 = class425.stringCp1252NullTerminatedByteSize(var2); // L: 118
		if (var7 % 8 != 0) { // L: 119
			var7 += 8 - var7 % 8;
		}

		Buffer var25 = new Buffer(var7); // L: 120
		var25.writeStringCp1252NullTerminated(var2); // L: 121
		var25.offset = var7; // L: 122
		var25.xteaEncryptAll(var6); // L: 123
		Buffer var18 = new Buffer(var4.offset + var5.offset + var25.offset + 5); // L: 124
		var18.writeByte(2); // L: 125
		var18.writeByte(var4.offset); // L: 126
		var18.writeBytes(var4.array, 0, var4.offset); // L: 127
		var18.writeByte(var5.offset); // L: 128
		var18.writeBytes(var5.array, 0, var5.offset); // L: 129
		var18.writeShort(var25.offset); // L: 130
		var18.writeBytes(var25.array, 0, var25.offset); // L: 131
		String var20 = ApproximateRouteStrategy.method1125(var18.array); // L: 132

		try {
			URL var11 = new URL(ArchiveLoader.method2063("services", false) + "m=accountappeal/login.ws"); // L: 134
			URLConnection var12 = var11.openConnection(); // L: 135
			var12.setDoInput(true); // L: 136
			var12.setDoOutput(true); // L: 137
			var12.setConnectTimeout(5000); // L: 138
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream()); // L: 139
			var13.write("data2=" + class270.method5206(var20) + "&dest=" + class270.method5206("passwordchoice.ws")); // L: 140
			var13.flush(); // L: 141
			InputStream var14 = var12.getInputStream(); // L: 142
			var18 = new Buffer(new byte[1000]); // L: 143

			do {
				int var15 = var14.read(var18.array, var18.offset, 1000 - var18.offset); // L: 145
				if (var15 == -1) { // L: 146
					var13.close(); // L: 152
					var14.close(); // L: 153
					String var21 = new String(var18.array); // L: 154
					if (var21.startsWith("OFFLINE")) { // L: 155
						return 4; // L: 156
					} else if (var21.startsWith("WRONG")) { // L: 158
						return 7; // L: 159
					} else if (var21.startsWith("RELOAD")) { // L: 161
						return 3; // L: 162
					} else if (var21.startsWith("Not permitted for social network accounts.")) { // L: 164
						return 6; // L: 165
					} else {
						var18.xteaDecryptAll(var6); // L: 167

						while (var18.offset > 0 && var18.array[var18.offset - 1] == 0) { // L: 168
							--var18.offset; // L: 169
						}

						var21 = new String(var18.array, 0, var18.offset); // L: 171
						boolean var16;
						if (var21 == null) { // L: 174
							var16 = false; // L: 175
						} else {
							label106: {
								try {
									new URL(var21);
								} catch (MalformedURLException var22) { // L: 181
									var16 = false; // L: 182
									break label106; // L: 183
								}

								var16 = true; // L: 185
							}
						}

						if (var16) { // L: 187
							class391.openURL(var21, true, false); // L: 188
							return 2; // L: 189
						} else {
							return 5; // L: 191
						}
					}
				}

				var18.offset += var15; // L: 147
			} while(var18.offset < 1000); // L: 148

			return 5; // L: 149
		} catch (Throwable var23) { // L: 193
			var23.printStackTrace(); // L: 194
			return 5; // L: 195
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhe;",
		garbageValue = "-868172814"
	)
	static WorldMapSectionType[] method4305() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE1, WORLDMAPSECTIONTYPE0}; // L: 17
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1441766816"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 73
		if (var1 == null) { // L: 74
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 75 76
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-2088968249"
	)
	static int method4310(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2710
			if (class154.guestClanSettings != null) { // L: 2711
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2712
				Calendar.field3269 = class154.guestClanSettings; // L: 2713
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2715
			}

			return 1; // L: 2716
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2718
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2719
				if (Client.currentClanSettings[var3] != null) { // L: 2720
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2721
					Calendar.field3269 = Client.currentClanSettings[var3]; // L: 2722
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2724
				}

				return 1; // L: 2725
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2727
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = Calendar.field3269.name; // L: 2728
				return 1; // L: 2729
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2731
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.allowGuests ? 1 : 0; // L: 2732
				return 1; // L: 2733
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2735
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1591; // L: 2736
				return 1; // L: 2737
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2739
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1592; // L: 2740
				return 1; // L: 2741
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2743
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1593; // L: 2744
				return 1; // L: 2745
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2747
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1606; // L: 2748
				return 1; // L: 2749
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2751
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.memberCount; // L: 2752
				return 1; // L: 2753
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2755
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2756
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = Calendar.field3269.memberNames[var3]; // L: 2757
				return 1; // L: 2758
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2760
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2761
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.memberRanks[var3]; // L: 2762
				return 1; // L: 2763
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2765
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.bannedMemberCount; // L: 2766
				return 1; // L: 2767
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2769
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2770
				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = Calendar.field3269.bannedMemberNames[var3]; // L: 2771
				return 1; // L: 2772
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2774
					Interpreter.Interpreter_intStackSize -= 3; // L: 2775
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2776
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2777
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2778
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.method2956(var3, var6, var5); // L: 2779
					return 1; // L: 2780
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2782
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.currentOwner; // L: 2783
					return 1; // L: 2784
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2786
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1604; // L: 2787
					return 1; // L: 2788
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2790
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.method2955(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]); // L: 2791
					return 1; // L: 2792
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2794
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 2795
					return 1; // L: 2796
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2798
					Interpreter.Interpreter_intStackSize -= 2; // L: 2799
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2800
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2801
					class18.method264(var6, var3); // L: 2802
					return 1; // L: 2803
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2805
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2806
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1600[var3]; // L: 2807
					return 1; // L: 2808
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2810
						Interpreter.Interpreter_intStackSize -= 3; // L: 2811
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2812
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2813
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2814
						ClanChannel.method3137(var5, var3, var4); // L: 2815
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2817
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2818
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Calendar.field3269.field1601[var3] ? 1 : 0; // L: 2819
						return 1; // L: 2820
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2822
						if (class21.guestClanChannel != null) { // L: 2823
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2824
							FriendSystem.field808 = class21.guestClanChannel; // L: 2825
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2827
						}

						return 1; // L: 2828
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2830
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2831
						if (Client.currentClanChannels[var3] != null) { // L: 2832
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2833
							FriendSystem.field808 = Client.currentClanChannels[var3]; // L: 2834
							AttackOption.field1255 = var3; // L: 2835
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2837
						}

						return 1; // L: 2838
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2840
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = FriendSystem.field808.name; // L: 2841
						return 1; // L: 2842
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2844
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendSystem.field808.field1659; // L: 2845
						return 1; // L: 2846
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2848
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendSystem.field808.field1654; // L: 2849
						return 1; // L: 2850
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2852
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendSystem.field808.method3119(); // L: 2853
						return 1; // L: 2854
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2856
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2857
						Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ((ClanChannelMember)FriendSystem.field808.members.get(var3)).username.getName(); // L: 2858
						return 1; // L: 2859
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2861
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2862
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)FriendSystem.field808.members.get(var3)).rank; // L: 2863
						return 1; // L: 2864
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2866
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2867
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)FriendSystem.field808.members.get(var3)).world; // L: 2868
						return 1; // L: 2869
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2871
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2872
						HealthBar.method2328(AttackOption.field1255, var3); // L: 2873
						return 1; // L: 2874
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2876
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FriendSystem.field808.method3116(Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize]); // L: 2877
						return 1; // L: 2878
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2880
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = FriendSystem.field808.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 2881
						return 1; // L: 2882
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2884
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = HorizontalAlignment.field1885 != null ? 1 : 0; // L: 2885
						return 1; // L: 2886
					} else {
						return 2; // L: 2888
					}
				}
			}
		}
	}

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "815671875"
	)
	static final void method4308(int var0, int var1) {
		if (var0 < 128) { // L: 3756
			var0 = 128;
		}

		if (var0 > 383) { // L: 3757
			var0 = 383;
		}

		if (class147.cameraPitch < var0) { // L: 3758
			class147.cameraPitch = (var0 - class147.cameraPitch) * class386.field4337 / 1000 + class147.cameraPitch + NetFileRequest.field3960; // L: 3759
			if (class147.cameraPitch > var0) { // L: 3760
				class147.cameraPitch = var0;
			}
		}

		if (class147.cameraPitch > var0) { // L: 3762
			class147.cameraPitch -= (class147.cameraPitch - var0) * class386.field4337 / 1000 + NetFileRequest.field3960; // L: 3763
			if (class147.cameraPitch < var0) { // L: 3764
				class147.cameraPitch = var0;
			}
		}

		int var2 = var1 - class21.cameraYaw; // L: 3766
		if (var2 > 1024) { // L: 3767
			var2 -= 2048;
		}

		if (var2 < -1024) { // L: 3768
			var2 += 2048;
		}

		if (var2 > 0) { // L: 3769
			class21.cameraYaw = class21.cameraYaw + NetFileRequest.field3960 + var2 * class386.field4337 / 1000; // L: 3770
			class21.cameraYaw &= 2047; // L: 3771
		}

		if (var2 < 0) { // L: 3773
			class21.cameraYaw -= NetFileRequest.field3960 + -var2 * class386.field4337 / 1000; // L: 3774
			class21.cameraYaw &= 2047; // L: 3775
		}

		int var3 = var1 - class21.cameraYaw; // L: 3777
		if (var3 > 1024) { // L: 3778
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048; // L: 3779
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3780
			class21.cameraYaw = var1;
		}

	} // L: 3781
}
