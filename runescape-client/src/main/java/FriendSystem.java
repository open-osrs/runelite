import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1129387531
	)
	int field920;

	@ObfuscatedSignature(
		descriptor = "(Lnj;)V"
	)
	FriendSystem(LoginType var1) {
		this.field920 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	} // L: 29

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-75"
	)
	boolean method1744() {
		return this.field920 == 2; // L: 32
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1542795320"
	)
	final void method1734() {
		this.field920 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IB)V",
		garbageValue = "-75"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field920 = 2; // L: 41

		for (int var3 = 0; var3 < Players.Players_count; ++var3) { // L: 43
			Player var4 = Client.players[Players.Players_indices[var3]]; // L: 44
			var4.clearIsFriend(); // L: 45
		}

		FontName.method6159(); // L: 47
		if (class25.clanChat != null) { // L: 48
			class25.clanChat.clearFriends(); // L: 49
		}

	} // L: 52

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1264028150"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 55
			if ((long)var1.field3840 < Archive.currentTimeMillis() / 1000L - 5L) { // L: 56
				if (var1.world > 0) {
					WorldMapScaleHandler.addGameMessage(5, "", var1.username + " has logged in."); // L: 57
				}

				if (var1.world == 0) { // L: 58
					WorldMapScaleHandler.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 59
			}
		}

	} // L: 62

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "962792858"
	)
	@Export("clear")
	final void clear() {
		this.field920 = 0; // L: 65
		this.friendsList.clear(); // L: 66
		this.ignoreList.clear(); // L: 67
	} // L: 68

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lla;ZI)Z",
		garbageValue = "166133195"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 71
			return false;
		} else if (var1.equals(class35.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lla;I)Z",
		garbageValue = "-919307241"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 78
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 79
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "60"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 84
			Username var2 = new Username(var1, this.loginType); // L: 85
			if (var2.hasCleanName()) { // L: 86
				if (this.friendsListIsFull()) { // L: 87
					AbstractByteArrayCopier.method4738(); // L: 88
				} else {
					StringBuilder var10000;
					String var4;
					if (class35.localPlayer.username.equals(var2)) { // L: 91
						var10000 = null; // L: 93
						var4 = "You can't add yourself to your own friend list";
						WorldMapScaleHandler.addGameMessage(30, "", var4); // L: 95
					} else {
						Object var10001;
						if (this.isFriended(var2, false)) { // L: 100
							var10000 = (new StringBuilder()).append(var1); // L: 102
							var10001 = null;
							var4 = var10000.append(" is already on your friend list").toString();
							WorldMapScaleHandler.addGameMessage(30, "", var4); // L: 104
						} else if (this.isIgnored(var2)) { // L: 109
							var10000 = new StringBuilder();
							var10001 = null; // L: 111
							var10000 = var10000.append("Please remove ").append(var1);
							var10001 = null;
							var4 = var10000.append(" from your ignore list first").toString();
							WorldMapScaleHandler.addGameMessage(30, "", var4); // L: 113
						} else {
							PacketBufferNode var3 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2589, Client.packetWriter.isaacCipher); // L: 120
							var3.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var1)); // L: 121
							var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 122
							Client.packetWriter.addNode(var3); // L: 123
						}
					}
				}
			}
		}
	} // L: 89 98 107 116 125

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2083998302"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field734 != 1; // L: 135
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1460320800"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 142
			Username var2 = new Username(var1, this.loginType); // L: 143
			if (var2.hasCleanName()) { // L: 144
				StringBuilder var10000;
				String var3;
				if (this.canAddIgnore()) { // L: 145
					var10000 = null; // L: 147
					var3 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					WorldMapScaleHandler.addGameMessage(30, "", var3); // L: 149
				} else if (class35.localPlayer.username.equals(var2)) { // L: 154
					var10000 = null; // L: 156
					var3 = "You can't add yourself to your own ignore list";
					WorldMapScaleHandler.addGameMessage(30, "", var3); // L: 158
				} else if (this.isIgnored(var2)) { // L: 163
					class14.method222(var1); // L: 164
				} else if (this.isFriended(var2, false)) { // L: 167
					var10000 = new StringBuilder();
					Object var10001 = null; // L: 169
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var3 = var10000.append(" from your friend list first").toString();
					WorldMapScaleHandler.addGameMessage(30, "", var3); // L: 171
				} else {
					class34.method393(var1); // L: 176
				}
			}
		}
	} // L: 152 161 165 174 177

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field734 != 1; // L: 195
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-81"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 202
			Username var2 = new Username(var1, this.loginType); // L: 203
			if (var2.hasCleanName()) { // L: 204
				if (this.friendsList.removeByUsername(var2)) { // L: 205
					Client.field801 = Client.cycleCntr; // L: 207
					PacketBufferNode var3 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2573, Client.packetWriter.isaacCipher); // L: 210
					var3.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var1)); // L: 211
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 212
					Client.packetWriter.addNode(var3); // L: 213
				}

				for (int var5 = 0; var5 < Players.Players_count; ++var5) { // L: 216
					Player var4 = Client.players[Players.Players_indices[var5]]; // L: 217
					var4.clearIsFriend(); // L: 218
				}

				FontName.method6159(); // L: 220
				if (class25.clanChat != null) { // L: 221
					class25.clanChat.clearFriends(); // L: 222
				}

			}
		}
	} // L: 225

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1160977242"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 228
			Username var2 = new Username(var1, this.loginType); // L: 229
			if (var2.hasCleanName()) { // L: 230
				if (this.ignoreList.removeByUsername(var2)) { // L: 231
					Client.field801 = Client.cycleCntr; // L: 233
					PacketBufferNode var3 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2648, Client.packetWriter.isaacCipher); // L: 236
					var3.packetBuffer.writeByte(class4.stringCp1252NullTerminatedByteSize(var1)); // L: 237
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 238
					Client.packetWriter.addNode(var3); // L: 239
				}

				class181.FriendSystem_invalidateIgnoreds(); // L: 241
			}
		}
	} // L: 242

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lla;B)Z",
		garbageValue = "-128"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 254
		return var2 != null && var2.hasWorld(); // L: 255
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-153839217"
	)
	static void method1782(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "714561014"
	)
	static int method1795(int var0, Script var1, boolean var2) {
		int var6;
		if (var0 == ScriptOpcodes.OC_NAME) { // L: 3120
			var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3121
			Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Strings.ItemDefinition_get(var6).name; // L: 3122
			return 1; // L: 3123
		} else {
			int var4;
			ItemComposition var5;
			if (var0 == ScriptOpcodes.OC_OP) { // L: 3125
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3126
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3127
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3128
				var5 = Strings.ItemDefinition_get(var6); // L: 3129
				if (var4 >= 1 && var4 <= 5 && var5.groundActions[var4 - 1] != null) { // L: 3130
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.groundActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3131
				}

				return 1; // L: 3132
			} else if (var0 == ScriptOpcodes.OC_IOP) { // L: 3134
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3135
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3136
				var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3137
				var5 = Strings.ItemDefinition_get(var6); // L: 3138
				if (var4 >= 1 && var4 <= 5 && var5.inventoryActions[var4 - 1] != null) { // L: 3139
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var5.inventoryActions[var4 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3140
				}

				return 1; // L: 3141
			} else if (var0 == ScriptOpcodes.OC_COST) { // L: 3143
				var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3144
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var6).price; // L: 3145
				return 1; // L: 3146
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) { // L: 3148
				var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3149
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var6).isStackable == 1 ? 1 : 0; // L: 3150
				return 1; // L: 3151
			} else {
				ItemComposition var7;
				if (var0 == ScriptOpcodes.OC_CERT) { // L: 3153
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3154
					var7 = Strings.ItemDefinition_get(var6); // L: 3155
					if (var7.noteTemplate == -1 && var7.note >= 0) { // L: 3156
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6; // L: 3157
					}

					return 1; // L: 3158
				} else if (var0 == ScriptOpcodes.OC_UNCERT) { // L: 3160
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3161
					var7 = Strings.ItemDefinition_get(var6); // L: 3162
					if (var7.noteTemplate >= 0 && var7.note >= 0) { // L: 3163
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.note;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6; // L: 3164
					}

					return 1; // L: 3165
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) { // L: 3167
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3168
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var6).isMembersOnly ? 1 : 0; // L: 3169
					return 1; // L: 3170
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) { // L: 3172
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3173
					var7 = Strings.ItemDefinition_get(var6); // L: 3174
					if (var7.placeholderTemplate == -1 && var7.placeholder >= 0) { // L: 3175
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6; // L: 3176
					}

					return 1; // L: 3177
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) { // L: 3179
					var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3180
					var7 = Strings.ItemDefinition_get(var6); // L: 3181
					if (var7.placeholderTemplate >= 0 && var7.placeholder >= 0) { // L: 3182
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var6; // L: 3183
					}

					return 1; // L: 3184
				} else if (var0 == ScriptOpcodes.OC_FIND) { // L: 3186
					String var3 = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 3187
					var4 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3188
					class10.findItemDefinitions(var3, var4 == 1); // L: 3189
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class135.foundItemIdCount; // L: 3190
					return 1; // L: 3191
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) { // L: 3193
					if (var0 == ScriptOpcodes.OC_FINDRESET) { // L: 3198
						WorldMapManager.foundItemIndex = 0; // L: 3199
						return 1; // L: 3200
					} else {
						return 2; // L: 3202
					}
				} else {
					if (class179.foundItemIds != null && WorldMapManager.foundItemIndex < class135.foundItemIdCount) { // L: 3194
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class179.foundItemIds[++WorldMapManager.foundItemIndex - 1] & '\uffff'; // L: 3195
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1;
					}

					return 1; // L: 3196
				}
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "405028707"
	)
	static void method1732() {
		if (Client.oculusOrbState == 1) { // L: 11750
			Client.field699 = true; // L: 11751
		}

	} // L: 11753
}
