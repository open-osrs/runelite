import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ba")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIILfo;B)Z",
		garbageValue = "104"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1846731136"
	)
	static int method1302(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (MilliClock.friendSystem.field1069 == 0) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -2;
			} else if (MilliClock.friendSystem.field1069 == 1) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.friendsList.getSize();
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.friendsList.getSize()) {
					Friend var8 = (Friend)MilliClock.friendSystem.friendsList.get(var3);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)MilliClock.friendSystem.friendsList.get(var3)).world;
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.friendsList.getSize()) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)MilliClock.friendSystem.friendsList.get(var3)).rank;
				} else {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					int var6 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					GrandExchangeOfferOwnWorldComparator.method1359(var5, var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					MilliClock.friendSystem.addFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					MilliClock.friendSystem.removeFriend(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					MilliClock.friendSystem.addIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					MilliClock.friendSystem.removeIgnore(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class22.method220(var5);
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.isFriended(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (WorldMapArea.clanChat != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapArea.clanChat.name;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (WorldMapArea.clanChat != null) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapArea.clanChat.getSize();
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize()) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapArea.clanChat.get(var3).getUsername().getName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)WorldMapArea.clanChat.get(var3)).getWorld();
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize()) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ((Buddy)WorldMapArea.clanChat.get(var3)).rank;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapArea.clanChat != null ? WorldMapArea.clanChat.minKick : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Tiles.clanKickUser(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = WorldMapArea.clanChat != null ? WorldMapArea.clanChat.rank : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					Varcs.Clan_joinChat(var5);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					BZip2State.Clan_leaveChat();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!MilliClock.friendSystem.method1939()) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.ignoreList.getSize();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (MilliClock.friendSystem.method1939() && var3 >= 0 && var3 < MilliClock.friendSystem.ignoreList.getSize()) {
						Ignored var4 = (Ignored)MilliClock.friendSystem.ignoreList.get(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var5 = class22.method220(var5);
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MilliClock.friendSystem.isIgnored(new Username(var5, GrandExchangeOfferUnitPriceComparator.loginType)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize() && WorldMapArea.clanChat.get(var3).getUsername().equals(PlayerAppearance.localPlayer.username)) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (WorldMapArea.clanChat != null && WorldMapArea.clanChat.owner != null) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapArea.clanChat.owner;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize() && ((ClanMate)WorldMapArea.clanChat.get(var3)).isFriend()) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						MilliClock.friendSystem.friendsList.removeComparator();
						return 1;
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator3(var7));
							return 1;
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator4(var7));
							return 1;
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator5(var7));
							return 1;
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator6(var7));
							return 1;
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator7(var7));
							return 1;
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator8(var7));
							return 1;
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator9(var7));
							return 1;
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new UserComparator10(var7));
							return 1;
						} else if (var0 == 3639) {
							MilliClock.friendSystem.friendsList.sort();
							return 1;
						} else if (var0 == 3640) {
							MilliClock.friendSystem.ignoreList.removeComparator();
							return 1;
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
							return 1;
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
							return 1;
						} else if (var0 == 3643) {
							MilliClock.friendSystem.ignoreList.sort();
							return 1;
						} else if (var0 == 3644) {
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.removeComparator();
							}

							return 1;
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator1(var7));
							}

							return 1;
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator2(var7));
							}

							return 1;
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator3(var7));
							}

							return 1;
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator4(var7));
							}

							return 1;
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator5(var7));
							}

							return 1;
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator6(var7));
							}

							return 1;
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator7(var7));
							}

							return 1;
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator8(var7));
							}

							return 1;
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator9(var7));
							}

							return 1;
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new UserComparator10(var7));
							}

							return 1;
						} else if (var0 == 3655) {
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.sort();
							}

							return 1;
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							MilliClock.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
							return 1;
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (WorldMapArea.clanChat != null) {
								WorldMapArea.clanChat.addComparator(new BuddyRankComparator(var7));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
					if (WorldMapArea.clanChat != null && var3 < WorldMapArea.clanChat.getSize() && ((ClanMate)WorldMapArea.clanChat.get(var3)).isIgnored()) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1035519670"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
