import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Varcs")
public class Varcs {
   @ObfuscatedName("d")
   @Export("intsPersistence")
   boolean[] intsPersistence;
   @ObfuscatedName("c")
   @Export("map")
   Map map;
   @ObfuscatedName("y")
   @Export("strings")
   String[] strings;
   @ObfuscatedName("h")
   @Export("unwrittenChanges")
   boolean unwrittenChanges = false;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      longValue = 3247217840907840609L
   )
   long field1282;

   Varcs() {
      int var1 = WorldMapIcon_0.archive2.getGroupFileCount(19);
      this.map = new HashMap();
      this.intsPersistence = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
         VarcInt var3;
         if (var4 != null) {
            var3 = var4;
         } else {
            byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
            var4 = new VarcInt();
            if (var5 != null) {
               var4.method4594(new Buffer(var5));
            }

            VarcInt.VarcInt_cached.put(var4, (long)var2);
            var3 = var4;
         }

         this.intsPersistence[var2] = var3.persist;
      }

      var2 = 0;
      if (WorldMapIcon_0.archive2.method4471(15)) {
         var2 = WorldMapIcon_0.archive2.getGroupFileCount(15);
      }

      this.strings = new String[var2];
      this.read();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1194686711"
   )
   @Export("setInt")
   void setInt(int var1, int var2) {
      this.map.put(var1, var2);
      if (this.intsPersistence[var1]) {
         this.unwrittenChanges = true;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "16777215"
   )
   @Export("getInt")
   int getInt(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "2044340742"
   )
   @Export("setString")
   void setString(int var1, String var2) {
      this.map.put(var1, var2);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1459564767"
   )
   @Export("getString")
   String getString(int var1) {
      Object var2 = this.map.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "81320649"
   )
   @Export("setStringOld")
   void setStringOld(int var1, String var2) {
      this.strings[var1] = var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "-82"
   )
   @Export("getStringOld")
   String getStringOld(int var1) {
      return this.strings[var1];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1732763236"
   )
   @Export("clearTransient")
   void clearTransient() {
      int var1;
      for(var1 = 0; var1 < this.intsPersistence.length; ++var1) {
         if (!this.intsPersistence[var1]) {
            this.map.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.strings.length; ++var1) {
         this.strings[var1] = null;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lmc;",
      garbageValue = "1003516163"
   )
   @Export("getPreferencesFile")
   AccessFile getPreferencesFile(boolean var1) {
      return WorldMapRectangle.getPreferencesFile("2", FontName.field3699.name, var1);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2064490955"
   )
   @Export("write")
   void write() {
      AccessFile var1 = this.getPreferencesFile(true);

      try {
         int var2 = 3;
         int var3 = 0;
         Iterator var4 = this.map.entrySet().iterator();

         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            int var6 = (Integer)var5.getKey();
            if (this.intsPersistence[var6]) {
               Object var7 = var5.getValue();
               var2 += 3;
               if (var7 instanceof Integer) {
                  var2 += 4;
               } else if (var7 instanceof String) {
                  var2 += WorldMapLabelSize.stringCp1252NullTerminatedByteSize((String)var7);
               }

               ++var3;
            }
         }

         Buffer var28 = new Buffer(var2);
         var28.writeByte(2);
         var28.writeShort(var3);
         Iterator var29 = this.map.entrySet().iterator();

         label146:
         while(true) {
            Entry var17;
            int var18;
            do {
               if (!var29.hasNext()) {
                  var1.write(var28.array, 0, var28.offset);
                  break label146;
               }

               var17 = (Entry)var29.next();
               var18 = (Integer)var17.getKey();
            } while(!this.intsPersistence[var18]);

            var28.writeShort(var18);
            Object var8 = var17.getValue();
            Class var10 = var8.getClass();
            class3[] var11 = new class3[]{class3.field18, class3.field26, class3.field17};
            class3[] var12 = var11;
            int var13 = 0;

            class3 var9;
            while(true) {
               if (var13 >= var12.length) {
                  var9 = null;
                  break;
               }

               class3 var14 = var12[var13];
               if (var10 == var14.field21) {
                  var9 = var14;
                  break;
               }

               ++var13;
            }

            var28.writeByte(var9.field22);
            class3.method30(var8, var28);
         }
      } catch (Exception var26) {
         ;
      } finally {
         try {
            var1.close();
         } catch (Exception var25) {
            ;
         }

      }

      this.unwrittenChanges = false;
      this.field1282 = Tiles.currentTimeMillis();
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1389856130"
   )
   @Export("read")
   void read() {
      AccessFile var1 = this.getPreferencesFile(false);

      label227: {
         try {
            byte[] var2 = new byte[(int)var1.length()];

            int var4;
            for(int var3 = 0; var3 < var2.length; var3 += var4) {
               var4 = var1.read(var2, var3, var2.length - var3);
               if (var4 == -1) {
                  throw new EOFException();
               }
            }

            Buffer var15 = new Buffer(var2);
            if (var15.array.length - var15.offset < 1) {
               return;
            }

            int var16 = var15.readUnsignedByte();
            if (var16 >= 0 && var16 <= 2) {
               int var7;
               int var8;
               int var9;
               int var17;
               if (var16 >= 2) {
                  var17 = var15.readUnsignedShort();
                  var7 = 0;

                  while(true) {
                     if (var7 >= var17) {
                        break label227;
                     }

                     var8 = var15.readUnsignedShort();
                     var9 = var15.readUnsignedByte();
                     class3[] var10 = new class3[]{class3.field18, class3.field26, class3.field17};
                     class3 var11 = (class3)InterfaceParent.findEnumerated(var10, var9);
                     Object var12 = var11.method32(var15);
                     if (this.intsPersistence[var8]) {
                        this.map.put(var8, var12);
                     }

                     ++var7;
                  }
               } else {
                  var17 = var15.readUnsignedShort();

                  for(var7 = 0; var7 < var17; ++var7) {
                     var8 = var15.readUnsignedShort();
                     var9 = var15.readInt();
                     if (this.intsPersistence[var8]) {
                        this.map.put(var8, var9);
                     }
                  }

                  var7 = var15.readUnsignedShort();
                  var8 = 0;

                  while(true) {
                     if (var8 >= var7) {
                        break label227;
                     }

                     var15.readUnsignedShort();
                     var15.readStringCp1252NullTerminated();
                     ++var8;
                  }
               }
            }
         } catch (Exception var26) {
            break label227;
         } finally {
            try {
               var1.close();
            } catch (Exception var25) {
               ;
            }

         }

         return;
      }

      this.unwrittenChanges = false;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2098120459"
   )
   @Export("tryWrite")
   void tryWrite() {
      if (this.unwrittenChanges && this.field1282 < Tiles.currentTimeMillis() - 60000L) {
         this.write();
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2106101646"
   )
   @Export("hasUnwrittenChanges")
   boolean hasUnwrittenChanges() {
      return this.unwrittenChanges;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IB)Lcl;",
      garbageValue = "18"
   )
   @Export("getScript")
   static Script getScript(int var0) {
      Script var1 = (Script)Script.Script_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = WorldMapSection0.archive12.takeFile(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = GameObject.newScript(var2);
            Script.Script_cached.put(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-73"
   )
   @Export("isKeyDown")
   public static final boolean isKeyDown() {
      KeyHandler var0 = KeyHandler.KeyHandler_instance;
      synchronized(KeyHandler.KeyHandler_instance) {
         if (KeyHandler.field424 == KeyHandler.field418) {
            return false;
         } else {
            ModeWhere.field2417 = KeyHandler.field428[KeyHandler.field418];
            WorldMapID.field299 = KeyHandler.field422[KeyHandler.field418];
            KeyHandler.field418 = KeyHandler.field418 + 1 & 127;
            return true;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   static void method2346() {
      try {
         File var0 = new File(JagexCache.userHomeDirectory, "random.dat");
         int var2;
         if (var0.exists()) {
            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         } else {
            label39:
            for(int var1 = 0; var1 < Timer.field3621.length; ++var1) {
               for(var2 = 0; var2 < class224.field2576.length; ++var2) {
                  File var3 = new File(class224.field2576[var2] + Timer.field3621[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
                     break label39;
                  }
               }
            }
         }

         if (JagexCache.JagexCache_randomDat == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
         ;
      }

   }
}
