import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ld")
public final class class332 {
	@ObfuscatedName("c")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("b")
	static long[] field4013;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4013 = new long[12];

		for (int var0 = 0; var0 < field4013.length; ++var0) {
			field4013[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZS)I",
		garbageValue = "7484"
	)
	static int method6184(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (class222.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
				Friend.field4084 = class222.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
					Friend.field4084 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Friend.field4084.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1567;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1568;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1569;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1570;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Friend.field4084.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Friend.field4084.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					IsaacCipher.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.method2847(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1579;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.method2881(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.getSortedMembers()[Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					IsaacCipher.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
					class113.method2617(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1582[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						IsaacCipher.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
						class6.method48(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Friend.field4084.field1577[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (UserComparator5.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
							class1.field0 = UserComparator5.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
							class1.field0 = Client.currentClanChannels[var3];
							Interpreter.field812 = var3;
						} else {
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class1.field0.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.field1643;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.field1636;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.method2990();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class1.field0.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field0.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = ((ClanChannelMember)class1.field0.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						class135.method2831(Interpreter.field812, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.method2991(Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1] = class1.field0.getSortedMembers()[Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = BuddyRankComparator.field1342 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
