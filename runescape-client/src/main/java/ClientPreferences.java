import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -764103933
	)
	@Export("ClientPreferences_optionCount")
	static int ClientPreferences_optionCount;
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 908401167
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("m")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("k")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1524960687
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("g")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("z")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("a")
	double field1193;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -970652687
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -753455133
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 611081845
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1860802513
	)
	int field1192;
	@ObfuscatedName("v")
	@Export("parameters")
	LinkedHashMap parameters;

	static {
		ClientPreferences_optionCount = 8;
	}

	ClientPreferences() {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1193 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1192 = -1;
		this.parameters = new LinkedHashMap();
		this.method2185(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lot;)V"
	)
	ClientPreferences(Buffer var1) {
		this.windowMode = 1;
		this.rememberedUsername = null;
		this.hideUsername = false;
		this.field1193 = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.field1192 = -1;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= ClientPreferences_optionCount) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.field1193 = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.field1192 = var1.readUnsignedByte();
				}
			} else {
				this.method2185(true);
			}
		} else {
			this.method2185(true);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1497380914"
	)
	void method2185(boolean var1) {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lot;",
		garbageValue = "1683782622"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(100);
		var1.writeByte(ClientPreferences_optionCount);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.field1193));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.field1192);
		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "60"
	)
	static int method2200(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (class20.friendSystem.field793 == 0) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -2;
			} else if (class20.friendSystem.field793 == 1) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class20.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (class20.friendSystem.method1682() && var3 >= 0 && var3 < class20.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)class20.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (class20.friendSystem.method1682() && var3 >= 0 && var3 < class20.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ((Buddy)class20.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				if (class20.friendSystem.method1682() && var3 >= 0 && var3 < class20.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ((Buddy)class20.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					SceneTilePaint.method4479(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class20.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class20.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class20.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					class20.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = WorldMapArea.method3513(var5);
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class20.friendSystem.isFriended(new Username(var5, SoundCache.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class78.friendsChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class78.friendsChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class78.friendsChat != null) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class78.friendsChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class78.friendsChat != null && var3 < class78.friendsChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class78.friendsChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class78.friendsChat != null && var3 < class78.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ((Buddy)class78.friendsChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class78.friendsChat != null && var3 < class78.friendsChat.getSize()) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = ((Buddy)class78.friendsChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class78.friendsChat != null ? class78.friendsChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					WorldMapData_0.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class78.friendsChat != null ? class78.friendsChat.rank * -871547187 * 342416901 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					MidiPcmStream.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					Players.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class20.friendSystem.method1682()) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class20.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class20.friendSystem.method1682() && var3 >= 0 && var3 < class20.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)class20.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = WorldMapArea.method3513(var5);
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class20.friendSystem.isIgnored(new Username(var5, SoundCache.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class78.friendsChat != null && var3 < class78.friendsChat.getSize() && class78.friendsChat.get(var3).getUsername().equals(class129.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class78.friendsChat != null && class78.friendsChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class78.friendsChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class78.friendsChat != null && var3 < class78.friendsChat.getSize() && ((ClanMate)class78.friendsChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						class20.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							class20.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							class20.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							class20.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (class78.friendsChat != null) {
								class78.friendsChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (class78.friendsChat != null) {
								class78.friendsChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							class20.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
							if (class78.friendsChat != null) {
								class78.friendsChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
					if (class78.friendsChat != null && var3 < class78.friendsChat.getSize() && ((ClanMate)class78.friendsChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)V",
		garbageValue = "-1413738331"
	)
	static void method2195(Buffer var0) {
		if (Client.randomDatData != null) {
			var0.writeBytes(Client.randomDatData, 0, Client.randomDatData.length);
		} else {
			byte[] var2 = new byte[24];

			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.readFully(var2);

				int var3;
				for (var3 = 0; var3 < 24 && var2[var3] == 0; ++var3) {
				}

				if (var3 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var4 = 0; var4 < 24; ++var4) {
					var2[var4] = -1;
				}
			}

			var0.writeBytes(var2, 0, var2.length);
		}
	}
}
