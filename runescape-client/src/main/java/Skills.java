import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("Skills")
public class Skills {
   @ObfuscatedName("v")
   @Export("Skills_enabled")
   public static final boolean[] Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("d")
   @Export("Skills_experienceTable")
   public static int[] Skills_experienceTable = new int[99];
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "Liu;"
   )
   static GameBuild field2774;

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         Skills_experienceTable[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lkd;ILbk;IB)V",
      garbageValue = "4"
   )
   static final void method4320(PacketBuffer var0, int var1, Player var2, int var3) {
      byte var4 = -1;
      if ((var3 & 4096) != 0) {
         var2.field992 = var0.method5721();
         var2.field952 = var0.readByte();
         var2.field996 = var0.method5747();
         var2.field998 = var0.method5747();
         var2.field999 = var0.readUnsignedShort() + Client.cycle;
         var2.field1000 = var0.readUnsignedShort() + Client.cycle;
         var2.field1001 = var0.readUnsignedShort();
         if (var2.field652) {
            var2.field992 += var2.tileX;
            var2.field952 += var2.tileY;
            var2.field996 += var2.tileX;
            var2.field998 += var2.tileY;
            var2.pathLength = 0;
         } else {
            var2.field992 += var2.pathX[0];
            var2.field952 += var2.pathY[0];
            var2.field996 += var2.pathX[0];
            var2.field998 += var2.pathY[0];
            var2.pathLength = 1;
         }

         var2.field1012 = 0;
      }

      int var5;
      if ((var3 & 1024) != 0) {
         var2.spotAnimation = var0.method5729();
         var5 = var0.method5739();
         var2.field994 = var5 >> 16;
         var2.field993 = (var5 & '\uffff') + Client.cycle;
         var2.spotAnimationFrame = 0;
         var2.spotAnimationFrameCycle = 0;
         if (var2.field993 > Client.cycle) {
            var2.spotAnimationFrame = -1;
         }

         if (var2.spotAnimation == 65535) {
            var2.spotAnimation = -1;
         }
      }

      int var8;
      int var9;
      int var12;
      if ((var3 & 32) != 0) {
         var5 = var0.method5729();
         PlayerType var6 = (PlayerType)InterfaceParent.findEnumerated(class69.PlayerType_values(), var0.method5720());
         boolean var7 = var0.method5776() == 1;
         var8 = var0.method5776();
         var9 = var0.offset;
         if (var2.username != null && var2.appearance != null) {
            boolean var10 = false;
            if (var6.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) {
               var10 = true;
            }

            if (!var10 && Client.field778 == 0 && !var2.isHidden) {
               Players.field1279.offset = 0;
               var0.method5740(Players.field1279.array, 0, var8);
               Players.field1279.offset = 0;
               String var11 = AbstractFont.escapeBrackets(UrlRequester.method3467(JagexCache.method3683(Players.field1279)));
               var2.overheadText = var11.trim();
               var2.overheadTextColor = var5 >> 8;
               var2.overheadTextEffect = var5 & 255;
               var2.overheadTextCyclesRemaining = 150;
               var2.isAutoChatting = var7;
               var2.field968 = var2 != UserComparator9.localPlayer && var6.isUser && "" != Client.field882 && var11.toLowerCase().indexOf(Client.field882) == -1;
               if (var6.isPrivileged) {
                  var12 = var7 ? 91 : 1;
               } else {
                  var12 = var7 ? 90 : 2;
               }

               if (var6.modIcon != -1) {
                  AbstractWorldMapData.addGameMessage(var12, UserComparator10.method3580(var6.modIcon) + var2.username.getName(), var11);
               } else {
                  AbstractWorldMapData.addGameMessage(var12, var2.username.getName(), var11);
               }
            }
         }

         var0.offset = var9 + var8;
      }

      if ((var3 & 256) != 0) {
         for(var5 = 0; var5 < 3; ++var5) {
            var2.actions[var5] = var0.readStringCp1252NullTerminated();
         }
      }

      if ((var3 & 2048) != 0) {
         Players.field1274[var1] = var0.method5721();
      }

      if ((var3 & 8) != 0) {
         var2.targetIndex = var0.readUnsignedShort();
         if (var2.targetIndex == 65535) {
            var2.targetIndex = -1;
         }
      }

      int var13;
      if ((var3 & 128) != 0) {
         var5 = var0.readUnsignedByte();
         int var15;
         int var17;
         int var19;
         if (var5 > 0) {
            for(var13 = 0; var13 < var5; ++var13) {
               var8 = -1;
               var9 = -1;
               var19 = -1;
               var17 = var0.readUShortSmart();
               if (var17 == 32767) {
                  var17 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  var8 = var0.readUShortSmart();
                  var19 = var0.readUShortSmart();
               } else if (var17 != 32766) {
                  var9 = var0.readUShortSmart();
               } else {
                  var17 = -1;
               }

               var15 = var0.readUShortSmart();
               var2.addHitSplat(var17, var9, var8, var19, Client.cycle, var15);
            }
         }

         var13 = var0.method5776();
         if (var13 > 0) {
            for(var17 = 0; var17 < var13; ++var17) {
               var8 = var0.readUShortSmart();
               var9 = var0.readUShortSmart();
               if (var9 != 32767) {
                  var19 = var0.readUShortSmart();
                  var15 = var0.method5717();
                  var12 = var9 > 0 ? var0.method5776() : var15;
                  var2.addHealthBar(var8, Client.cycle, var9, var19, var15, var12);
               } else {
                  var2.removeHealthBar(var8);
               }
            }
         }
      }

      if ((var3 & 512) != 0) {
         var4 = var0.method5721();
      }

      if ((var3 & 64) != 0) {
         var5 = var0.readUnsignedShort();
         if (var5 == 65535) {
            var5 = -1;
         }

         var13 = var0.method5720();
         UserComparator7.performPlayerAnimation(var2, var5, var13);
      }

      if ((var3 & 1) != 0) {
         var2.field981 = var0.method5729();
         if (var2.pathLength == 0) {
            var2.orientation = var2.field981;
            var2.field981 = -1;
         }
      }

      if ((var3 & 16) != 0) {
         var2.overheadText = var0.readStringCp1252NullTerminated();
         if (var2.overheadText.charAt(0) == '~') {
            var2.overheadText = var2.overheadText.substring(1);
            AbstractWorldMapData.addGameMessage(2, var2.username.getName(), var2.overheadText);
         } else if (var2 == UserComparator9.localPlayer) {
            AbstractWorldMapData.addGameMessage(2, var2.username.getName(), var2.overheadText);
         }

         var2.isAutoChatting = false;
         var2.overheadTextColor = 0;
         var2.overheadTextEffect = 0;
         var2.overheadTextCyclesRemaining = 150;
      }

      if ((var3 & 2) != 0) {
         var5 = var0.method5776();
         byte[] var16 = new byte[var5];
         Buffer var14 = new Buffer(var16);
         var0.method5740(var16, 0, var5);
         Players.field1269[var1] = var14;
         var2.read(var14);
      }

      if (var2.field652) {
         if (var4 == 127) {
            var2.resetPath(var2.tileX, var2.tileY);
         } else {
            byte var18;
            if (var4 != -1) {
               var18 = var4;
            } else {
               var18 = Players.field1274[var1];
            }

            var2.method1327(var2.tileX, var2.tileY, var18);
         }
      }

   }
}
