import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("p")
final class class4 implements class0 {
	@ObfuscatedName("pk")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "[Llh;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lkn;B)V",
		garbageValue = "0"
	)
	public void vmethod59(Object var1, Buffer var2) {
		this.method46((String)var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Ljava/lang/Object;",
		garbageValue = "114"
	)
	public Object vmethod47(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lkn;I)V",
		garbageValue = "-1456597328"
	)
	void method46(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1273544207"
	)
	public static String method48(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)Lie;",
		garbageValue = "0"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcs;",
		garbageValue = "-1977243752"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = ViewportMouse.method3091(var1, var0);
		Script var4 = VerticalAlignment.method4517(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (var2 + 40000 << 8) + var0;
			var4 = VerticalAlignment.method4517(var5, var0);
			return var4 != null ? var4 : null;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "-1"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZS)Z",
		garbageValue = "4093"
	)
	static boolean method58(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			var0.delete();
			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "0"
	)
	static int method63(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (ModeWhere.friendSystem.field1094 == 0) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -2;
			} else if (ModeWhere.friendSystem.field1094 == 1) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ModeWhere.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				if (ModeWhere.friendSystem.method1923() && var3 >= 0 && var3 < ModeWhere.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)ModeWhere.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				if (ModeWhere.friendSystem.method1923() && var3 >= 0 && var3 < ModeWhere.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ((Buddy)ModeWhere.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				if (ModeWhere.friendSystem.method1923() && var3 >= 0 && var3 < ModeWhere.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ((Buddy)ModeWhere.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					class52.method873(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					ModeWhere.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					ModeWhere.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					ModeWhere.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					ModeWhere.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					var5 = BuddyRankComparator.method3556(var5);
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ModeWhere.friendSystem.isFriended(new Username(var5, class195.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (ClientPreferences.clanChat != null) {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = ClientPreferences.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (ClientPreferences.clanChat != null) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClientPreferences.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ClientPreferences.clanChat != null && var3 < ClientPreferences.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = ClientPreferences.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ClientPreferences.clanChat != null && var3 < ClientPreferences.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ((Buddy)ClientPreferences.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ClientPreferences.clanChat != null && var3 < ClientPreferences.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ((Buddy)ClientPreferences.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClientPreferences.clanChat != null ? ClientPreferences.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					class9.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClientPreferences.clanChat != null ? ClientPreferences.clanChat.rank * -1947222095 * 2143365457 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					Canvas.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					GrandExchangeOffer.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!ModeWhere.friendSystem.method1923()) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ModeWhere.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ModeWhere.friendSystem.method1923() && var3 >= 0 && var3 < ModeWhere.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)ModeWhere.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--WorldMapEvent.Interpreter_stringStackSize];
					var5 = BuddyRankComparator.method3556(var5);
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ModeWhere.friendSystem.isIgnored(new Username(var5, class195.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ClientPreferences.clanChat != null && var3 < ClientPreferences.clanChat.getSize() && ClientPreferences.clanChat.get(var3).getUsername().equals(class60.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (ClientPreferences.clanChat != null && ClientPreferences.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = ClientPreferences.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ClientPreferences.clanChat != null && var3 < ClientPreferences.clanChat.getSize() && ((ClanMate)ClientPreferences.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						ModeWhere.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							ModeWhere.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							ModeWhere.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							ModeWhere.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							ModeWhere.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (ClientPreferences.clanChat != null) {
								ClientPreferences.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
					if (ClientPreferences.clanChat != null && var3 < ClientPreferences.clanChat.getSize() && ((ClanMate)ClientPreferences.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(Lhd;I)V",
		garbageValue = "1118535641"
	)
	static final void method57(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field868 == -1) {
				Client.field868 = var0.spriteId2;
				Client.field938 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field868;
			} else {
				var0.spriteId2 = Client.field938;
			}

		} else if (var1 == 325) {
			if (Client.field868 == -1) {
				Client.field868 = var0.spriteId2;
				Client.field938 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field938;
			} else {
				var0.spriteId2 = Client.field868;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
