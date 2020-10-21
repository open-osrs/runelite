import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1331025573
	)
	int field1097;

	@ObfuscatedSignature(
		descriptor = "(Lmc;)V"
	)
	FriendSystem(LoginType var1) {
		this.field1097 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "366163976"
	)
	boolean method1958() {
		return this.field1097 == 2; // L: 32
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1495060497"
	)
	final void method1957() {
		this.field1097 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-320273584"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field1097 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		Iterator var5 = Messages.Messages_hashTable.iterator(); // L: 48

		while (var5.hasNext()) {
			Message var6 = (Message)var5.next(); // L: 49
			var6.clearIsFromFriend(); // L: 51
		}

		if (DevicePcmPlayerProvider.clanChat != null) { // L: 55
			DevicePcmPlayerProvider.clanChat.clearFriends(); // L: 56
		}

	} // L: 59

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1762300851"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 62
			if ((long)var1.field3670 < User.currentTimeMillis() / 1000L - 5L) {
				if (var1.world > 0) {
					DevicePcmPlayerProvider.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					DevicePcmPlayerProvider.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-710169059"
	)
	@Export("clear")
	final void clear() {
		this.field1097 = 0;
		this.friendsList.clear(); // L: 73
		this.ignoreList.clear(); // L: 74
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkm;ZI)Z",
		garbageValue = "-1897160718"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(PlayerType.localPlayer.username)) { // L: 79
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 80
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lkm;I)Z",
		garbageValue = "1651377109"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 85
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 86
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "625813578"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 91
			Username var2 = new Username(var1, this.loginType); // L: 92
			if (var2.hasCleanName()) { // L: 93
				if (this.friendsListIsFull()) { // L: 94
					Object var10000 = null; // L: 96
					String var3 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					DevicePcmPlayerProvider.addGameMessage(30, "", var3); // L: 98
				} else if (PlayerType.localPlayer.username.equals(var2)) { // L: 103
					MouseRecorder.method1286(); // L: 104
				} else if (this.isFriended(var2, false)) { // L: 107
					class60.method983(var1); // L: 108
				} else if (this.isIgnored(var2)) { // L: 111
					GrandExchangeOfferAgeComparator.method241(var1); // L: 112
				} else {
					Canvas.method949(var1); // L: 115
				}
			}
		}
	} // L: 101 105 109 113 116

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1768016322"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field799 != 1; // L: 148
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-109423207"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 155
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				Object var10000;
				String var3;
				if (this.canAddIgnore()) {
					var10000 = null;
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					DevicePcmPlayerProvider.addGameMessage(30, "", var3);
				} else if (PlayerType.localPlayer.username.equals(var2)) {
					var10000 = null; // L: 169
					var3 = "You can't add yourself to your own ignore list";
					DevicePcmPlayerProvider.addGameMessage(30, "", var3);
				} else if (this.isIgnored(var2)) { // L: 176
					class217.method4098(var1);
				} else if (this.isFriended(var2, false)) {
					WorldMapArea.method506(var1); // L: 181
				} else {
					HealthBarUpdate.method1869(var1); // L: 184
				}
			}
		}
	} // L: 174 182 185

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-34"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field799 != 1; // L: 210
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1777583860"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 217
			Username var2 = new Username(var1, this.loginType); // L: 218
			if (var2.hasCleanName()) { // L: 219
				if (this.friendsList.removeByUsername(var2)) { // L: 220
					Client.field874 = Client.cycleCntr; // L: 222
					PacketBufferNode var3 = class4.getPacketBufferNode(ClientPacket.field2327, Client.packetWriter.isaacCipher); // L: 225
					var3.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var1)); // L: 226
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 227
					Client.packetWriter.addNode(var3); // L: 228
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 231
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 232
					var4.clearIsFriend(); // L: 233
				}

				Iterator var6 = Messages.Messages_hashTable.iterator(); // L: 236

				while (var6.hasNext()) {
					Message var7 = (Message)var6.next(); // L: 237
					var7.clearIsFromFriend(); // L: 239
				}

				if (DevicePcmPlayerProvider.clanChat != null) { // L: 243
					DevicePcmPlayerProvider.clanChat.clearFriends(); // L: 244
				}

			}
		}
	} // L: 247

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "66"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 250
			Username var2 = new Username(var1, this.loginType); // L: 251
			if (var2.hasCleanName()) { // L: 252
				if (this.ignoreList.removeByUsername(var2)) { // L: 253
					Client.field874 = Client.cycleCntr; // L: 255
					PacketBufferNode var3 = class4.getPacketBufferNode(ClientPacket.field2240, Client.packetWriter.isaacCipher); // L: 258
					var3.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var1)); // L: 259
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 260
					Client.packetWriter.addNode(var3); // L: 261
				}

				class52.FriendSystem_invalidateIgnoreds(); // L: 263
			}
		}
	} // L: 264

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lkm;I)Z",
		garbageValue = "-1712856211"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 276
		return var2 != null && var2.hasWorld(); // L: 277
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-145581337"
	)
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4]; // L: 63
		int[] var3 = new int[4]; // L: 64
		var2[0] = var0; // L: 65
		var3[0] = var1; // L: 66
		int var4 = 1; // L: 67

		for (int var5 = 0; var5 < 4; ++var5) { // L: 68
			if (World.World_sortOption1[var5] != var0) { // L: 69
				var2[var4] = World.World_sortOption1[var5]; // L: 70
				var3[var4] = World.World_sortOption2[var5]; // L: 71
				++var4; // L: 72
			}
		}

		World.World_sortOption1 = var2; // L: 75
		World.World_sortOption2 = var3; // L: 76
		ModeWhere.sortWorlds(DefaultsGroup.World_worlds, 0, DefaultsGroup.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 77
	} // L: 78

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2017() {
		synchronized(KeyHandler.KeyHandler_instance) { // L: 156
			++KeyHandler.KeyHandler_idleCycles; // L: 157
			KeyHandler.field415 = KeyHandler.field428; // L: 158
			KeyHandler.field427 = 0; // L: 159
			int var1;
			if (KeyHandler.field423 < 0) { // L: 160
				for (var1 = 0; var1 < 112; ++var1) { // L: 161
					KeyHandler.KeyHandler_pressedKeys[var1] = false;
				}

				KeyHandler.field423 = KeyHandler.field422; // L: 162
			} else {
				while (KeyHandler.field422 != KeyHandler.field423) { // L: 165
					var1 = KeyHandler.field435[KeyHandler.field422]; // L: 166
					KeyHandler.field422 = KeyHandler.field422 + 1 & 127; // L: 167
					if (var1 < 0) { // L: 168
						KeyHandler.KeyHandler_pressedKeys[~var1] = false;
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var1] && KeyHandler.field427 < KeyHandler.field430.length - 1) { // L: 170
							KeyHandler.field430[++KeyHandler.field427 - 1] = var1; // L: 171
						}

						KeyHandler.KeyHandler_pressedKeys[var1] = true; // L: 173
					}
				}
			}

			if (KeyHandler.field427 > 0) { // L: 177
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field428 = KeyHandler.field413; // L: 178
		}
	} // L: 180

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZB)I",
		garbageValue = "104"
	)
	static int method2018(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 772
		Widget var4;
		if (var0 >= 2000) { // L: 774
			var0 -= 1000; // L: 775
			var4 = UserComparator4.getWidget(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]); // L: 776
			var3 = false; // L: 777
		} else {
			var4 = var2 ? MouseRecorder.field621 : Interpreter.field1122; // L: 779
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 780
			var11 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] - 1; // L: 781
			if (var11 >= 0 && var11 <= 9) { // L: 782
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]); // L: 786
				return 1; // L: 787
			} else {
				--UrlRequester.Interpreter_stringStackSize; // L: 783
				return 1; // L: 784
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 789
				MilliClock.Interpreter_intStackSize -= 2; // L: 790
				var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]; // L: 791
				var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 792
				var4.parent = ItemContainer.getWidgetChild(var11, var6); // L: 793
				return 1; // L: 794
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 796
				var4.isScrollBar = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 797
				return 1; // L: 798
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 800
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 801
				return 1; // L: 802
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 804
				var4.dragThreshold = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 805
				return 1; // L: 806
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 808
				var4.dataText = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 809
				return 1; // L: 810
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 812
				var4.spellActionName = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize]; // L: 813
				return 1; // L: 814
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 816
				var4.actions = null; // L: 817
				return 1; // L: 818
			} else if (var0 == 1308) { // L: 820
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1; // L: 821
				return 1; // L: 822
			} else if (var0 == 1309) { // L: 824
				--MilliClock.Interpreter_intStackSize; // L: 825
				return 1; // L: 826
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 828
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 858
						MilliClock.Interpreter_intStackSize -= 2; // L: 859
						var5 = 10; // L: 860
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]}; // L: 861
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]}; // L: 862
						ChatChannel.Widget_setKey(var4, var5, var8, var9); // L: 863
						return 1; // L: 864
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 866
						MilliClock.Interpreter_intStackSize -= 3; // L: 867
						var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] - 1; // L: 868
						var6 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]; // L: 869
						var7 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2]; // L: 870
						if (var11 >= 0 && var11 <= 9) { // L: 871
							WorldMapIcon_1.Widget_setKeyRate(var4, var11, var6, var7); // L: 874
							return 1; // L: 875
						} else {
							throw new RuntimeException(); // L: 872
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 877
						var5 = 10; // L: 878
						var6 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 879
						var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize]; // L: 880
						WorldMapIcon_1.Widget_setKeyRate(var4, var5, var6, var7); // L: 881
						return 1; // L: 882
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 884
						--MilliClock.Interpreter_intStackSize; // L: 885
						var11 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize] - 1; // L: 886
						if (var11 >= 0 && var11 <= 9) { // L: 887
							MusicPatchNode2.Widget_setKeyIgnoreHeld(var4, var11); // L: 890
							return 1; // L: 891
						} else {
							throw new RuntimeException(); // L: 888
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 893
						var5 = 10; // L: 894
						MusicPatchNode2.Widget_setKeyIgnoreHeld(var4, var5); // L: 895
						return 1; // L: 896
					} else {
						return 2; // L: 898
					}
				} else {
					byte[] var10 = null; // L: 829
					var8 = null; // L: 830
					if (var3) { // L: 831
						MilliClock.Interpreter_intStackSize -= 10; // L: 832

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + MilliClock.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 834 835
						}

						if (var7 > 0) { // L: 837
							var10 = new byte[var7 / 2]; // L: 838
							var8 = new byte[var7 / 2]; // L: 839

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 840
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + MilliClock.Interpreter_intStackSize]; // L: 841
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + MilliClock.Interpreter_intStackSize + 1]; // L: 842
							}
						}
					} else {
						MilliClock.Interpreter_intStackSize -= 2; // L: 847
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize]}; // L: 848
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]}; // L: 849
					}

					var7 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] - 1; // L: 851
					if (var7 >= 0 && var7 <= 9) { // L: 852
						ChatChannel.Widget_setKey(var4, var7, var10, var8); // L: 855
						return 1; // L: 856
					} else {
						throw new RuntimeException(); // L: 853
					}
				}
			}
		}
	}

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1364904686"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class23.pcmPlayer1 != null) { // L: 3491
			class23.pcmPlayer1.run();
		}

		if (class195.pcmPlayer0 != null) { // L: 3492
			class195.pcmPlayer0.run();
		}

	} // L: 3493
}
