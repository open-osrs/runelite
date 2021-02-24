import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("Player")
public final class Player extends Actor {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lkk;"
   )
   @Export("username")
   Username username;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lhu;"
   )
   @Export("appearance")
   PlayerAppearance appearance;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -542532009
   )
   @Export("headIconPk")
   int headIconPk = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2086179455
   )
   @Export("headIconPrayer")
   int headIconPrayer = -1;
   @ObfuscatedName("h")
   @Export("actions")
   String[] actions = new String[3];
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1032185691
   )
   @Export("combatLevel")
   int combatLevel;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -844211389
   )
   @Export("skillLevel")
   int skillLevel;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 2099878383
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1111564727
   )
   @Export("animationCycleStart")
   int animationCycleStart;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1006983921
   )
   @Export("animationCycleEnd")
   int animationCycleEnd;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2021402629
   )
   int field637;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -141826323
   )
   @Export("tileHeight2")
   int tileHeight2;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -2121626467
   )
   int field639;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lef;"
   )
   @Export("model0")
   Model model0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 123594343
   )
   int field641;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2053334325
   )
   int field642;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1294199975
   )
   int field640;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1259880177
   )
   int field644;
   @ObfuscatedName("u")
   @Export("isUnanimated")
   boolean isUnanimated;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1563525681
   )
   @Export("team")
   int team;
   @ObfuscatedName("p")
   @Export("isHidden")
   boolean isHidden;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1722408107
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1541347041
   )
   @Export("index")
   int index;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("isFriendTriBool")
   TriBool isFriendTriBool;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("isInClanChat")
   TriBool isInClanChat;
   @ObfuscatedName("ay")
   boolean field652;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1937405249
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1915597601
   )
   @Export("tileY")
   int tileY;

   Player() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.actions[var1] = "";
      }

      this.combatLevel = 0;
      this.skillLevel = 0;
      this.animationCycleStart = 0;
      this.animationCycleEnd = 0;
      this.isUnanimated = false;
      this.team = 0;
      this.isHidden = false;
      this.isFriendTriBool = TriBool.TriBool_unknown;
      this.isInClanChat = TriBool.TriBool_unknown;
      this.field652 = false;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Lkx;I)V",
      garbageValue = "937296924"
   )
   @Export("read")
   final void read(Buffer var1) {
      var1.offset = 0;
      int var2 = var1.readUnsignedByte();
      this.headIconPk = var1.readByte();
      this.headIconPrayer = var1.readByte();
      int var3 = -1;
      this.team = 0;
      int[] var4 = new int[12];

      int var6;
      int var7;
      for(int var5 = 0; var5 < 12; ++var5) {
         var6 = var1.readUnsignedByte();
         if (var6 == 0) {
            var4[var5] = 0;
         } else {
            var7 = var1.readUnsignedByte();
            var4[var5] = var7 + (var6 << 8);
            if (var5 == 0 && var4[0] == 65535) {
               var3 = var1.readUnsignedShort();
               break;
            }

            if (var4[var5] >= 512) {
               int var8 = class281.ItemDefinition_get(var4[var5] - 512).team;
               if (var8 != 0) {
                  this.team = var8;
               }
            }
         }
      }

      int[] var9 = new int[5];

      for(var6 = 0; var6 < 5; ++var6) {
         var7 = var1.readUnsignedByte();
         if (var7 < 0 || var7 >= class105.field1339[var6].length) {
            var7 = 0;
         }

         var9[var6] = var7;
      }

      super.idleSequence = var1.readUnsignedShort();
      if (super.idleSequence == 65535) {
         super.idleSequence = -1;
      }

      super.turnLeftSequence = var1.readUnsignedShort();
      if (super.turnLeftSequence == 65535) {
         super.turnLeftSequence = -1;
      }

      super.turnRightSequence = super.turnLeftSequence;
      super.walkSequence = var1.readUnsignedShort();
      if (super.walkSequence == 65535) {
         super.walkSequence = -1;
      }

      super.walkBackSequence = var1.readUnsignedShort();
      if (super.walkBackSequence == 65535) {
         super.walkBackSequence = -1;
      }

      super.walkLeftSequence = var1.readUnsignedShort();
      if (super.walkLeftSequence == 65535) {
         super.walkLeftSequence = -1;
      }

      super.walkRightSequence = var1.readUnsignedShort();
      if (super.walkRightSequence == 65535) {
         super.walkRightSequence = -1;
      }

      super.runSequence = var1.readUnsignedShort();
      if (super.runSequence == 65535) {
         super.runSequence = -1;
      }

      this.username = new Username(var1.readStringCp1252NullTerminated(), Message.loginType);
      this.clearIsFriend();
      this.clearIsInClanChat();
      if (this == UserComparator9.localPlayer) {
         class1.localPlayerName = this.username.getName();
      }

      this.combatLevel = var1.readUnsignedByte();
      this.skillLevel = var1.readUnsignedShort();
      this.isHidden = var1.readUnsignedByte() == 1;
      if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
         this.isHidden = false;
      }

      if (this.appearance == null) {
         this.appearance = new PlayerAppearance();
      }

      this.appearance.update(var4, var9, var2 == 1, var3);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "644215303"
   )
   @Export("isFriend")
   boolean isFriend() {
      if (this.isFriendTriBool == TriBool.TriBool_unknown) {
         this.checkIsFriend();
      }

      return this.isFriendTriBool == TriBool.TriBool_true;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "511487286"
   )
   @Export("clearIsFriend")
   void clearIsFriend() {
      this.isFriendTriBool = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "667815611"
   )
   @Export("checkIsFriend")
   void checkIsFriend() {
      this.isFriendTriBool = InterfaceParent.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "34388997"
   )
   @Export("isClanMember")
   boolean isClanMember() {
      if (this.isInClanChat == TriBool.TriBool_unknown) {
         this.updateIsInClanChat();
      }

      return this.isInClanChat == TriBool.TriBool_true;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-54"
   )
   @Export("clearIsInClanChat")
   void clearIsInClanChat() {
      this.isInClanChat = TriBool.TriBool_unknown;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "3"
   )
   @Export("updateIsInClanChat")
   void updateIsInClanChat() {
      this.isInClanChat = WorldMapID.clanChat != null && WorldMapID.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1075941627"
   )
   @Export("transformedSize")
   int transformedSize() {
      return this.appearance != null && this.appearance.npcTransformId != -1 ? class90.getNpcDefinition(this.appearance.npcTransformId).size : 1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lef;",
      garbageValue = "127"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.appearance == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? InterfaceParent.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : InterfaceParent.SequenceDefinition_get(super.movementSequence);
         Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            Model var4;
            Model[] var5;
            if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
               var4 = AbstractUserComparator.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
               if (var4 != null) {
                  var4.offsetBy(0, -super.field994, 0);
                  var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
               }
            }

            if (!this.isUnanimated && this.model0 != null) {
               if (Client.cycle >= this.animationCycleEnd) {
                  this.model0 = null;
               }

               if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
                  var4 = this.model0;
                  var4.offsetBy(this.field637 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field639 * 4096 - super.y);
                  if (super.orientation == 512) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  } else if (super.orientation == 1024) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  } else if (super.orientation == 1536) {
                     var4.rotateY90Ccw();
                  }

                  var5 = new Model[]{var3, var4};
                  var3 = new Model(var5, 2);
                  if (super.orientation == 512) {
                     var4.rotateY90Ccw();
                  } else if (super.orientation == 1024) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  } else if (super.orientation == 1536) {
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                     var4.rotateY90Ccw();
                  }

                  var4.offsetBy(super.x - this.field637 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field639 * 4096);
               }
            }

            var3.isSingleTile = true;
            return var3;
         }
      }
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIBI)V",
      garbageValue = "1833516243"
   )
   final void method1327(int var1, int var2, byte var3) {
      if (super.sequence != -1 && InterfaceParent.SequenceDefinition_get(super.sequence).field3565 == 1) {
         super.sequence = -1;
      }

      super.field981 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
            if (var3 == 2) {
               Player var4 = this;
               int var5 = super.pathX[0];
               int var6 = super.pathY[0];
               int var7 = this.transformedSize();
               if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
                  int var9 = this.transformedSize();
                  RouteStrategy var10 = GrandExchangeOfferAgeComparator.method214(var1, var2);
                  CollisionMap var11 = Client.collisionMaps[this.plane];
                  int[] var12 = Client.field708;
                  int[] var13 = Client.field859;
                  int var14 = 0;

                  label550:
                  while(true) {
                     int var15;
                     if (var14 >= 128) {
                        int var16;
                        int var17;
                        byte var19;
                        int var20;
                        int var21;
                        int var23;
                        int var25;
                        int var26;
                        int var27;
                        int var28;
                        boolean var34;
                        int var36;
                        int var37;
                        int var39;
                        if (var9 == 1) {
                           var34 = MusicPatchPcmStream.method4098(var5, var6, var10, var11);
                        } else if (var9 == 2) {
                           var34 = WorldMapElement.method4591(var5, var6, var10, var11);
                        } else {
                           var16 = var5;
                           var17 = var6;
                           byte var18 = 64;
                           var19 = 64;
                           var20 = var5 - var18;
                           var21 = var6 - var19;
                           class182.directions[var18][var19] = 99;
                           class182.distances[var18][var19] = 0;
                           byte var22 = 0;
                           var23 = 0;
                           class182.bufferX[var22] = var5;
                           var39 = var22 + 1;
                           class182.bufferY[var22] = var6;
                           int[][] var24 = var11.flags;

                           boolean var35;
                           label536:
                           while(true) {
                              label534:
                              while(true) {
                                 do {
                                    do {
                                       do {
                                          label511:
                                          do {
                                             if (var23 == var39) {
                                                class182.field2118 = var16;
                                                class182.field2124 = var17;
                                                var35 = false;
                                                break label536;
                                             }

                                             var16 = class182.bufferX[var23];
                                             var17 = class182.bufferY[var23];
                                             var23 = var23 + 1 & 4095;
                                             var36 = var16 - var20;
                                             var37 = var17 - var21;
                                             var25 = var16 - var11.xInset;
                                             var26 = var17 - var11.yInset;
                                             if (var10.hasArrived(var9, var16, var17, var11)) {
                                                class182.field2118 = var16;
                                                class182.field2124 = var17;
                                                var35 = true;
                                                break label536;
                                             }

                                             var27 = class182.distances[var36][var37] + 1;
                                             if (var36 > 0 && class182.directions[var36 - 1][var37] == 0 && (var24[var25 - 1][var26] & 19136782) == 0 && (var24[var25 - 1][var9 + var26 - 1] & 19136824) == 0) {
                                                var28 = 1;

                                                while(true) {
                                                   if (var28 >= var9 - 1) {
                                                      class182.bufferX[var39] = var16 - 1;
                                                      class182.bufferY[var39] = var17;
                                                      var39 = var39 + 1 & 4095;
                                                      class182.directions[var36 - 1][var37] = 2;
                                                      class182.distances[var36 - 1][var37] = var27;
                                                      break;
                                                   }

                                                   if ((var24[var25 - 1][var28 + var26] & 19136830) != 0) {
                                                      break;
                                                   }

                                                   ++var28;
                                                }
                                             }

                                             if (var36 < 128 - var9 && class182.directions[var36 + 1][var37] == 0 && (var24[var9 + var25][var26] & 19136899) == 0 && (var24[var25 + var9][var26 + var9 - 1] & 19136992) == 0) {
                                                var28 = 1;

                                                while(true) {
                                                   if (var28 >= var9 - 1) {
                                                      class182.bufferX[var39] = var16 + 1;
                                                      class182.bufferY[var39] = var17;
                                                      var39 = var39 + 1 & 4095;
                                                      class182.directions[var36 + 1][var37] = 8;
                                                      class182.distances[var36 + 1][var37] = var27;
                                                      break;
                                                   }

                                                   if ((var24[var25 + var9][var28 + var26] & 19136995) != 0) {
                                                      break;
                                                   }

                                                   ++var28;
                                                }
                                             }

                                             if (var37 > 0 && class182.directions[var36][var37 - 1] == 0 && (var24[var25][var26 - 1] & 19136782) == 0 && (var24[var25 + var9 - 1][var26 - 1] & 19136899) == 0) {
                                                var28 = 1;

                                                while(true) {
                                                   if (var28 >= var9 - 1) {
                                                      class182.bufferX[var39] = var16;
                                                      class182.bufferY[var39] = var17 - 1;
                                                      var39 = var39 + 1 & 4095;
                                                      class182.directions[var36][var37 - 1] = 1;
                                                      class182.distances[var36][var37 - 1] = var27;
                                                      break;
                                                   }

                                                   if ((var24[var28 + var25][var26 - 1] & 19136911) != 0) {
                                                      break;
                                                   }

                                                   ++var28;
                                                }
                                             }

                                             if (var37 < 128 - var9 && class182.directions[var36][var37 + 1] == 0 && (var24[var25][var26 + var9] & 19136824) == 0 && (var24[var25 + var9 - 1][var9 + var26] & 19136992) == 0) {
                                                var28 = 1;

                                                while(true) {
                                                   if (var28 >= var9 - 1) {
                                                      class182.bufferX[var39] = var16;
                                                      class182.bufferY[var39] = var17 + 1;
                                                      var39 = var39 + 1 & 4095;
                                                      class182.directions[var36][var37 + 1] = 4;
                                                      class182.distances[var36][var37 + 1] = var27;
                                                      break;
                                                   }

                                                   if ((var24[var28 + var25][var26 + var9] & 19137016) != 0) {
                                                      break;
                                                   }

                                                   ++var28;
                                                }
                                             }

                                             if (var36 > 0 && var37 > 0 && class182.directions[var36 - 1][var37 - 1] == 0 && (var24[var25 - 1][var26 - 1] & 19136782) == 0) {
                                                var28 = 1;

                                                while(true) {
                                                   if (var28 >= var9) {
                                                      class182.bufferX[var39] = var16 - 1;
                                                      class182.bufferY[var39] = var17 - 1;
                                                      var39 = var39 + 1 & 4095;
                                                      class182.directions[var36 - 1][var37 - 1] = 3;
                                                      class182.distances[var36 - 1][var37 - 1] = var27;
                                                      break;
                                                   }

                                                   if ((var24[var25 - 1][var28 + (var26 - 1)] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var26 - 1] & 19136911) != 0) {
                                                      break;
                                                   }

                                                   ++var28;
                                                }
                                             }

                                             if (var36 < 128 - var9 && var37 > 0 && class182.directions[var36 + 1][var37 - 1] == 0 && (var24[var25 + var9][var26 - 1] & 19136899) == 0) {
                                                var28 = 1;

                                                while(true) {
                                                   if (var28 >= var9) {
                                                      class182.bufferX[var39] = var16 + 1;
                                                      class182.bufferY[var39] = var17 - 1;
                                                      var39 = var39 + 1 & 4095;
                                                      class182.directions[var36 + 1][var37 - 1] = 9;
                                                      class182.distances[var36 + 1][var37 - 1] = var27;
                                                      break;
                                                   }

                                                   if ((var24[var9 + var25][var28 + (var26 - 1)] & 19136995) != 0 || (var24[var25 + var28][var26 - 1] & 19136911) != 0) {
                                                      break;
                                                   }

                                                   ++var28;
                                                }
                                             }

                                             if (var36 > 0 && var37 < 128 - var9 && class182.directions[var36 - 1][var37 + 1] == 0 && (var24[var25 - 1][var26 + var9] & 19136824) == 0) {
                                                for(var28 = 1; var28 < var9; ++var28) {
                                                   if ((var24[var25 - 1][var26 + var28] & 19136830) != 0 || (var24[var28 + (var25 - 1)][var9 + var26] & 19137016) != 0) {
                                                      continue label511;
                                                   }
                                                }

                                                class182.bufferX[var39] = var16 - 1;
                                                class182.bufferY[var39] = var17 + 1;
                                                var39 = var39 + 1 & 4095;
                                                class182.directions[var36 - 1][var37 + 1] = 6;
                                                class182.distances[var36 - 1][var37 + 1] = var27;
                                             }
                                          } while(var36 >= 128 - var9);
                                       } while(var37 >= 128 - var9);
                                    } while(class182.directions[var36 + 1][var37 + 1] != 0);
                                 } while((var24[var25 + var9][var9 + var26] & 19136992) != 0);

                                 for(var28 = 1; var28 < var9; ++var28) {
                                    if ((var24[var25 + var28][var26 + var9] & 19137016) != 0 || (var24[var9 + var25][var26 + var28] & 19136995) != 0) {
                                       continue label534;
                                    }
                                 }

                                 class182.bufferX[var39] = var16 + 1;
                                 class182.bufferY[var39] = var17 + 1;
                                 var39 = var39 + 1 & 4095;
                                 class182.directions[var36 + 1][var37 + 1] = 12;
                                 class182.distances[var36 + 1][var37 + 1] = var27;
                              }
                           }

                           var34 = var35;
                        }

                        int var8;
                        label589: {
                           var15 = var5 - 64;
                           var16 = var6 - 64;
                           var17 = class182.field2118;
                           var36 = class182.field2124;
                           if (!var34) {
                              var37 = Integer.MAX_VALUE;
                              var20 = Integer.MAX_VALUE;
                              byte var38 = 10;
                              var39 = var10.approxDestinationX;
                              var23 = var10.approxDestinationY;
                              int var33 = var10.approxDestinationSizeX;
                              var25 = var10.approxDestinationSizeY;

                              for(var26 = var39 - var38; var26 <= var39 + var38; ++var26) {
                                 for(var27 = var23 - var38; var27 <= var38 + var23; ++var27) {
                                    var28 = var26 - var15;
                                    int var29 = var27 - var16;
                                    if (var28 >= 0 && var29 >= 0 && var28 < 128 && var29 < 128 && class182.distances[var28][var29] < 100) {
                                       int var30 = 0;
                                       if (var26 < var39) {
                                          var30 = var39 - var26;
                                       } else if (var26 > var33 + var39 - 1) {
                                          var30 = var26 - (var39 + var33 - 1);
                                       }

                                       int var31 = 0;
                                       if (var27 < var23) {
                                          var31 = var23 - var27;
                                       } else if (var27 > var25 + var23 - 1) {
                                          var31 = var27 - (var23 + var25 - 1);
                                       }

                                       int var32 = var31 * var31 + var30 * var30;
                                       if (var32 < var37 || var37 == var32 && class182.distances[var28][var29] < var20) {
                                          var37 = var32;
                                          var20 = class182.distances[var28][var29];
                                          var17 = var26;
                                          var36 = var27;
                                       }
                                    }
                                 }
                              }

                              if (var37 == Integer.MAX_VALUE) {
                                 var8 = -1;
                                 break label589;
                              }
                           }

                           if (var5 == var17 && var6 == var36) {
                              var8 = 0;
                           } else {
                              var19 = 0;
                              class182.bufferX[var19] = var17;
                              var37 = var19 + 1;
                              class182.bufferY[var19] = var36;

                              for(var20 = var21 = class182.directions[var17 - var15][var36 - var16]; var17 != var5 || var6 != var36; var20 = class182.directions[var17 - var15][var36 - var16]) {
                                 if (var20 != var21) {
                                    var21 = var20;
                                    class182.bufferX[var37] = var17;
                                    class182.bufferY[var37++] = var36;
                                 }

                                 if ((var20 & 2) != 0) {
                                    ++var17;
                                 } else if ((var20 & 8) != 0) {
                                    --var17;
                                 }

                                 if ((var20 & 1) != 0) {
                                    ++var36;
                                 } else if ((var20 & 4) != 0) {
                                    --var36;
                                 }
                              }

                              var39 = 0;

                              while(var37-- > 0) {
                                 var12[var39] = class182.bufferX[var37];
                                 var13[var39++] = class182.bufferY[var37];
                                 if (var39 >= var12.length) {
                                    break;
                                 }
                              }

                              var8 = var39;
                           }
                        }

                        var14 = var8;
                        if (var8 < 1) {
                           break;
                        }

                        var15 = 0;

                        while(true) {
                           if (var15 >= var14 - 1) {
                              break label550;
                           }

                           var4.method1329(Client.field708[var15], Client.field859[var15], (byte)2);
                           ++var15;
                        }
                     }

                     for(var15 = 0; var15 < 128; ++var15) {
                        class182.directions[var14][var15] = 0;
                        class182.distances[var14][var15] = 99999999;
                     }

                     ++var14;
                  }
               }
            }

            this.method1329(var1, var2, var3);
         } else {
            this.resetPath(var1, var2);
         }
      } else {
         this.resetPath(var1, var2);
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-101"
   )
   @Export("resetPath")
   void resetPath(int var1, int var2) {
      super.pathLength = 0;
      super.field1012 = 0;
      super.field989 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      int var3 = this.transformedSize();
      super.x = var3 * 64 + super.pathX[0] * 128;
      super.y = var3 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IIBI)V",
      garbageValue = "-498567231"
   )
   final void method1329(int var1, int var2, byte var3) {
      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var4 = super.pathLength; var4 > 0; --var4) {
         super.pathX[var4] = super.pathX[var4 - 1];
         super.pathY[var4] = super.pathY[var4 - 1];
         super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
      }

      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.pathTraversed[0] = var3;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-251916247"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.appearance != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lcq;",
      garbageValue = "1"
   )
   @Export("getNextWorldListWorld")
   static World getNextWorldListWorld() {
      return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "4"
   )
   public static int method1317(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1132112001"
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

   @ObfuscatedName("ki")
   @ObfuscatedSignature(
      descriptor = "(Lhz;B)Ljava/lang/String;",
      garbageValue = "101"
   )
   @Export("Widget_getSpellActionName")
   static String Widget_getSpellActionName(Widget var0) {
      if (MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var0)) == 0) {
         return null;
      } else {
         return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
      }
   }
}
