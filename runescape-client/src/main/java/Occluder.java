import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
@Implements("Occluder")
public final class Occluder {
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("worldSelectStars")
   static IndexedSprite[] worldSelectStars;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1869642923
   )
   @Export("minTileX")
   int minTileX;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1553345215
   )
   @Export("maxTileX")
   int maxTileX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -419916701
   )
   @Export("minTileY")
   int minTileY;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 249944423
   )
   @Export("maxTileY")
   int maxTileY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1981412121
   )
   @Export("type")
   int type;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -552540519
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -558367511
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 246269295
   )
   @Export("minZ")
   int minZ;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 371713265
   )
   @Export("maxZ")
   int maxZ;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1905227411
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 1548952897
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -806607637
   )
   int field1918;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1254231211
   )
   int field1920;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1231922825
   )
   int field1909;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1302725109
   )
   int field1922;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 634677509
   )
   int field1919;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -321996029
   )
   int field1923;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1993636743
   )
   int field1924;

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lcq;",
      garbageValue = "37280546"
   )
   @Export("worldListStart")
   static World worldListStart() {
      World.World_listCount = 0;
      return Player.getNextWorldListWorld();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZI)I",
      garbageValue = "809632906"
   )
   static int method3447(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.FRIEND_COUNT) {
         if (InterfaceParent.friendSystem.field1084 == 0) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
         } else if (InterfaceParent.friendSystem.field1084 == 1) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
         } else {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.friendsList.getSize();
         }

         return 1;
      } else {
         int var3;
         if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
               Friend var8 = (Friend)InterfaceParent.friendSystem.friendsList.get(var3);
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getName();
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8.getPreviousName();
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).world;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.friendsList.getSize()) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)InterfaceParent.friendSystem.friendsList.get(var3)).rank;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         } else {
            String var5;
            if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               GrandExchangeOfferTotalQuantityComparator.method163(var5, var6);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               InterfaceParent.friendSystem.addFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               InterfaceParent.friendSystem.removeFriend(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_ADD) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               InterfaceParent.friendSystem.addIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_DEL) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               InterfaceParent.friendSystem.removeIgnore(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.FRIEND_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var5 = Calendar.method4153(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isFriended(new Username(var5, Message.loginType), false) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
               if (WorldMapID.clanChat != null) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.clanChat.name;
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
               if (WorldMapID.clanChat != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.clanChat.getSize();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize()) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.clanChat.get(var3).getUsername().getName();
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)WorldMapID.clanChat.get(var3)).getWorld();
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)WorldMapID.clanChat.get(var3)).rank;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.clanChat != null ? WorldMapID.clanChat.minKick : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               PacketWriter.clanKickUser(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapID.clanChat != null ? WorldMapID.clanChat.rank : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               VarbitDefinition.Clan_joinChat(var5);
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
               Canvas.Clan_leaveChat();
               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
               if (!InterfaceParent.friendSystem.method1974()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.ignoreList.getSize();
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (InterfaceParent.friendSystem.method1974() && var3 >= 0 && var3 < InterfaceParent.friendSystem.ignoreList.getSize()) {
                  Ignored var4 = (Ignored)InterfaceParent.friendSystem.ignoreList.get(var3);
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getName();
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.getPreviousName();
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.IGNORE_TEST) {
               var5 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
               var5 = Calendar.method4153(var5);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = InterfaceParent.friendSystem.isIgnored(new Username(var5, Message.loginType)) ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize() && WorldMapID.clanChat.get(var3).getUsername().equals(UserComparator9.localPlayer.username)) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
               if (WorldMapID.clanChat != null && WorldMapID.clanChat.owner != null) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapID.clanChat.owner;
               } else {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
               }

               return 1;
            } else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize() && ((ClanMate)WorldMapID.clanChat.get(var3)).isFriend()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
               if (var0 == 3628) {
                  InterfaceParent.friendSystem.friendsList.removeComparator();
                  return 1;
               } else {
                  boolean var7;
                  if (var0 == 3629) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3630) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3631) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator3(var7));
                     return 1;
                  } else if (var0 == 3632) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator4(var7));
                     return 1;
                  } else if (var0 == 3633) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator5(var7));
                     return 1;
                  } else if (var0 == 3634) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator6(var7));
                     return 1;
                  } else if (var0 == 3635) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator7(var7));
                     return 1;
                  } else if (var0 == 3636) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator8(var7));
                     return 1;
                  } else if (var0 == 3637) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator9(var7));
                     return 1;
                  } else if (var0 == 3638) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new UserComparator10(var7));
                     return 1;
                  } else if (var0 == 3639) {
                     InterfaceParent.friendSystem.friendsList.sort();
                     return 1;
                  } else if (var0 == 3640) {
                     InterfaceParent.friendSystem.ignoreList.removeComparator();
                     return 1;
                  } else if (var0 == 3641) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator1(var7));
                     return 1;
                  } else if (var0 == 3642) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.ignoreList.addComparator(new UserComparator2(var7));
                     return 1;
                  } else if (var0 == 3643) {
                     InterfaceParent.friendSystem.ignoreList.sort();
                     return 1;
                  } else if (var0 == 3644) {
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.removeComparator();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator1(var7));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator2(var7));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator3(var7));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator4(var7));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator5(var7));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator6(var7));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator7(var7));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator8(var7));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator9(var7));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new UserComparator10(var7));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.sort();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     InterfaceParent.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7));
                     return 1;
                  } else if (var0 == 3657) {
                     var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                     if (WorldMapID.clanChat != null) {
                        WorldMapID.clanChat.addComparator(new BuddyRankComparator(var7));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               if (WorldMapID.clanChat != null && var3 < WorldMapID.clanChat.getSize() && ((ClanMate)WorldMapID.clanChat.get(var3)).isIgnored()) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
