import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("MusicPatch")
public class MusicPatch extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -145246635
   )
   int field2509;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "[Ldm;"
   )
   @Export("rawSounds")
   RawSound[] rawSounds = new RawSound[128];
   @ObfuscatedName("d")
   short[] field2513 = new short[128];
   @ObfuscatedName("c")
   byte[] field2507 = new byte[128];
   @ObfuscatedName("y")
   byte[] field2510 = new byte[128];
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Lgy;"
   )
   MusicPatchNode2[] field2511 = new MusicPatchNode2[128];
   @ObfuscatedName("z")
   byte[] field2512 = new byte[128];
   @ObfuscatedName("e")
   int[] field2506 = new int[128];

   MusicPatch(byte[] var1) {
      Buffer var2 = new Buffer(var1);

      int var3;
      for(var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.readByte();
      }

      ++var2.offset;
      ++var3;
      var5 = var2.offset;
      var2.offset += var3;

      int var6;
      for(var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.readByte();
      }

      ++var2.offset;
      ++var6;
      var8 = var2.offset;
      var2.offset += var6;

      int var9;
      for(var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.readByte();
      }

      ++var2.offset;
      ++var9;
      byte[] var37 = new byte[var9];
      int var12;
      int var14;
      if (var9 > 1) {
         var37[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var42 = var2.readUnsignedByte();
            if (var42 == 0) {
               var13 = var12++;
            } else {
               if (var42 <= var13) {
                  --var42;
               }

               var13 = var42;
            }

            var37[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      MusicPatchNode2[] var38 = new MusicPatchNode2[var12];

      MusicPatchNode2 var15;
      for(var14 = 0; var14 < var38.length; ++var14) {
         var15 = var38[var14] = new MusicPatchNode2();
         int var41 = var2.readUnsignedByte();
         if (var41 > 0) {
            var15.field2427 = new byte[var41 * 2];
         }

         var41 = var2.readUnsignedByte();
         if (var41 > 0) {
            var15.field2423 = new byte[var41 * 2 + 2];
            var15.field2423[1] = 64;
         }
      }

      var14 = var2.readUnsignedByte();
      byte[] var43 = var14 > 0 ? new byte[var14 * 2] : null;
      var14 = var2.readUnsignedByte();
      byte[] var16 = var14 > 0 ? new byte[var14 * 2] : null;

      int var17;
      for(var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.readByte();
      }

      ++var2.offset;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         this.field2513[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.readUnsignedByte();
         this.field2513[var20] = (short)(this.field2513[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.readVarInt();
         }

         this.field2513[var23] = (short)(this.field2513[var23] + ((var22 - 1 & 2) << 14));
         this.field2506[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (this.field2506[var24] != 0) {
            if (var20 == 0) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.array[var5++] - 1;
            }

            this.field2512[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (this.field2506[var25] != 0) {
            if (var20 == 0) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.array[var8++] + 16 << 2;
            }

            this.field2510[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      MusicPatchNode2 var39 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (this.field2506[var26] != 0) {
            if (var20 == 0) {
               var39 = var38[var37[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field2511[var26] = var39;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.field2506[var27] > 0) {
               var26 = var2.readUnsignedByte() + 1;
            }
         }

         this.field2507[var27] = (byte)var26;
         --var20;
      }

      this.field2509 = var2.readUnsignedByte() + 1;

      int var29;
      MusicPatchNode2 var40;
      for(var27 = 0; var27 < var12; ++var27) {
         var40 = var38[var27];
         if (var40.field2427 != null) {
            for(var29 = 1; var29 < var40.field2427.length; var29 += 2) {
               var40.field2427[var29] = var2.readByte();
            }
         }

         if (var40.field2423 != null) {
            for(var29 = 3; var29 < var40.field2423.length - 2; var29 += 2) {
               var40.field2423[var29] = var2.readByte();
            }
         }
      }

      if (var43 != null) {
         for(var27 = 1; var27 < var43.length; var27 += 2) {
            var43[var27] = var2.readByte();
         }
      }

      if (var16 != null) {
         for(var27 = 1; var27 < var16.length; var27 += 2) {
            var16[var27] = var2.readByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var40 = var38[var27];
         if (var40.field2423 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var40.field2423.length; var29 += 2) {
               var19 = var19 + 1 + var2.readUnsignedByte();
               var40.field2423[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var40 = var38[var27];
         if (var40.field2427 != null) {
            var19 = 0;

            for(var29 = 2; var29 < var40.field2427.length; var29 += 2) {
               var19 = 1 + var19 + var2.readUnsignedByte();
               var40.field2427[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var35;
      int var46;
      byte var48;
      if (var43 != null) {
         var19 = var2.readUnsignedByte();
         var43[0] = (byte)var19;

         for(var27 = 2; var27 < var43.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var43[var27] = (byte)var19;
         }

         var48 = var43[0];
         byte var28 = var43[1];

         for(var29 = 0; var29 < var48; ++var29) {
            this.field2507[var29] = (byte)(var28 * this.field2507[var29] + 32 >> 6);
         }

         for(var29 = 2; var29 < var43.length; var29 += 2) {
            var30 = var43[var29];
            byte var31 = var43[var29 + 1];
            var32 = var28 * (var30 - var48) + (var30 - var48) / 2;

            for(var33 = var48; var33 < var30; ++var33) {
               var35 = var30 - var48;
               int var36 = var32 >>> 31;
               var34 = (var36 + var32) / var35 - var36;
               this.field2507[var33] = (byte)(var34 * this.field2507[var33] + 32 >> 6);
               var32 += var31 - var28;
            }

            var48 = var30;
            var28 = var31;
         }

         for(var46 = var48; var46 < 128; ++var46) {
            this.field2507[var46] = (byte)(var28 * this.field2507[var46] + 32 >> 6);
         }

         var15 = null;
      }

      if (var16 != null) {
         var19 = var2.readUnsignedByte();
         var16[0] = (byte)var19;

         for(var27 = 2; var27 < var16.length; var27 += 2) {
            var19 = var19 + 1 + var2.readUnsignedByte();
            var16[var27] = (byte)var19;
         }

         var48 = var16[0];
         int var45 = var16[1] << 1;

         for(var29 = 0; var29 < var48; ++var29) {
            var46 = var45 + (this.field2510[var29] & 255);
            if (var46 < 0) {
               var46 = 0;
            }

            if (var46 > 128) {
               var46 = 128;
            }

            this.field2510[var29] = (byte)var46;
         }

         int var47;
         for(var29 = 2; var29 < var16.length; var29 += 2) {
            var30 = var16[var29];
            var47 = var16[var29 + 1] << 1;
            var32 = var45 * (var30 - var48) + (var30 - var48) / 2;

            for(var33 = var48; var33 < var30; ++var33) {
               var34 = MouseHandler.method1176(var32, var30 - var48);
               var35 = var34 + (this.field2510[var33] & 255);
               if (var35 < 0) {
                  var35 = 0;
               }

               if (var35 > 128) {
                  var35 = 128;
               }

               this.field2510[var33] = (byte)var35;
               var32 += var47 - var45;
            }

            var48 = var30;
            var45 = var47;
         }

         for(var46 = var48; var46 < 128; ++var46) {
            var47 = var45 + (this.field2510[var46] & 255);
            if (var47 < 0) {
               var47 = 0;
            }

            if (var47 > 128) {
               var47 = 128;
            }

            this.field2510[var46] = (byte)var47;
         }

         Object var44 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var38[var27].field2424 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var40 = var38[var27];
         if (var40.field2427 != null) {
            var40.field2425 = var2.readUnsignedByte();
         }

         if (var40.field2423 != null) {
            var40.field2426 = var2.readUnsignedByte();
         }

         if (var40.field2424 > 0) {
            var40.field2431 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var38[var27].field2429 = var2.readUnsignedByte();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var40 = var38[var27];
         if (var40.field2429 > 0) {
            var40.field2428 = var2.readUnsignedByte();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var40 = var38[var27];
         if (var40.field2428 > 0) {
            var40.field2422 = var2.readUnsignedByte();
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ldy;[B[II)Z",
      garbageValue = "2106723997"
   )
   boolean method4086(SoundCache var1, byte[] var2, int[] var3) {
      boolean var4 = true;
      int var5 = 0;
      RawSound var6 = null;

      for(int var7 = 0; var7 < 128; ++var7) {
         if (var2 == null || var2[var7] != 0) {
            int var8 = this.field2506[var7];
            if (var8 != 0) {
               if (var8 != var5) {
                  var5 = var8--;
                  if ((var8 & 1) == 0) {
                     var6 = var1.getSoundEffect(var8 >> 2, var3);
                  } else {
                     var6 = var1.getMusicSample(var8 >> 2, var3);
                  }

                  if (var6 == null) {
                     var4 = false;
                  }
               }

               if (var6 != null) {
                  this.rawSounds[var7] = var6;
                  this.field2506[var7] = 0;
               }
            }
         }
      }

      return var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "26821632"
   )
   @Export("clear")
   void clear() {
      this.field2506 = null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-9"
   )
   @Export("Widget_unpackTargetMask")
   public static int Widget_unpackTargetMask(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lkd;I)V",
      garbageValue = "-1581933835"
   )
   static final void method4095(PacketBuffer var0) {
      for(int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
         int var2 = Players.Players_pendingUpdateIndices[var1];
         Player var3 = Client.players[var2];
         int var4 = var0.readUnsignedByte();
         if ((var4 & 4) != 0) {
            var4 += var0.readUnsignedByte() << 8;
         }

         Skills.method4320(var0, var2, var3, var4);
      }

   }
}
