import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("Archive")
public class Archive extends AbstractArchive {
   @ObfuscatedName("ag")
   @Export("Archive_crc")
   static CRC32 Archive_crc = new CRC32();
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("archiveDisk")
   ArchiveDisk archiveDisk;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Llu;"
   )
   @Export("masterDisk")
   ArchiveDisk masterDisk;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 985029217
   )
   @Export("index")
   int index;
   @ObfuscatedName("j")
   volatile boolean field3192 = false;
   @ObfuscatedName("ay")
   boolean field3196 = false;
   @ObfuscatedName("am")
   @Export("validGroups")
   volatile boolean[] validGroups;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1841826013
   )
   @Export("indexCrc")
   int indexCrc;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 650586757
   )
   @Export("indexVersion")
   int indexVersion;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 292662723
   )
   int field3200 = -1;

   @ObfuscatedSignature(
      descriptor = "(Llu;Llu;IZZZ)V"
   )
   public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
      super(var4, var5);
      this.archiveDisk = var1;
      this.masterDisk = var2;
      this.index = var3;
      this.field3196 = var6;
      int var8 = this.index;
      if (SoundSystem.NetCache_reference != null) {
         SoundSystem.NetCache_reference.offset = var8 * 8 + 5;
         int var9 = SoundSystem.NetCache_reference.readInt();
         int var10 = SoundSystem.NetCache_reference.readInt();
         this.loadIndex(var9, var10);
      } else {
         WorldMapSectionType.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true);
         NetCache.NetCache_archives[var8] = this;
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "31242"
   )
   @Export("loadRegionFromGroup")
   void loadRegionFromGroup(int var1) {
      AttackOption.method2202(this.index, var1);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-693356446"
   )
   @Export("groupLoadPercent")
   int groupLoadPercent(int var1) {
      if (super.groups[var1] != null) {
         return 100;
      } else if (this.validGroups[var1]) {
         return 100;
      } else {
         int var3 = this.index;
         long var4 = (long)((var3 << 16) + var1);
         int var2;
         if (SecureRandomCallable.NetCache_currentResponse != null && var4 == SecureRandomCallable.NetCache_currentResponse.key) {
            var2 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - SecureRandomCallable.NetCache_currentResponse.padding) + 1;
         } else {
            var2 = 0;
         }

         return var2;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1209383303"
   )
   @Export("loadGroup")
   void loadGroup(int var1) {
      if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
         ArchiveDisk var2 = this.archiveDisk;
         byte[] var4 = null;
         NodeDeque var5 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) {
                  var4 = var6.data;
                  break;
               }
            }
         }

         if (var4 != null) {
            this.load(var2, var1, var4, true);
         } else {
            byte[] var9 = var2.read(var1);
            this.load(var2, var1, var9, true);
         }
      } else {
         WorldMapSectionType.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
      }

   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1775407691"
   )
   public boolean method4461() {
      return this.field3192;
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "6696"
   )
   @Export("percentage")
   public int percentage() {
      if (this.field3192) {
         return 100;
      } else if (super.groups != null) {
         return 99;
      } else {
         int var2 = this.index;
         long var3 = (long)(var2 + 16711680);
         int var1;
         if (SecureRandomCallable.NetCache_currentResponse != null && var3 == SecureRandomCallable.NetCache_currentResponse.key) {
            var1 = NetCache.NetCache_responseArchiveBuffer.offset * 99 / (NetCache.NetCache_responseArchiveBuffer.array.length - SecureRandomCallable.NetCache_currentResponse.padding) + 1;
         } else {
            var1 = 0;
         }

         int var5 = var1;
         if (var1 >= 100) {
            var5 = 99;
         }

         return var5;
      }
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "1"
   )
   @Export("loadIndex")
   public void loadIndex(int var1, int var2) {
      this.indexCrc = var1;
      this.indexVersion = var2;
      if (this.masterDisk != null) {
         int var3 = this.index;
         ArchiveDisk var4 = this.masterDisk;
         byte[] var6 = null;
         NodeDeque var7 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            for(ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
               if (var8.key == (long)var3 && var4 == var8.archiveDisk && var8.type == 0) {
                  var6 = var8.data;
                  break;
               }
            }
         }

         if (var6 != null) {
            this.load(var4, var3, var6, true);
         } else {
            byte[] var11 = var4.read(var3);
            this.load(var4, var3, var11, true);
         }
      } else {
         WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
      }

   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(I[BZZI)V",
      garbageValue = "1626411173"
   )
   @Export("write")
   public void write(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field3192) {
            throw new RuntimeException();
         }

         if (this.masterDisk != null) {
            int var5 = this.index;
            ArchiveDisk var6 = this.masterDisk;
            ArchiveDiskAction var7 = new ArchiveDiskAction();
            var7.type = 0;
            var7.key = (long)var5;
            var7.data = var2;
            var7.archiveDisk = var6;
            NodeDeque var8 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
            }

            Object var21 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
               if (ArchiveDiskActionHandler.field3187 == 0) {
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
               }

               ArchiveDiskActionHandler.field3187 = 600;
            }
         }

         this.decodeIndex(var2);
         this.loadAllLocal();
      } else {
         var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
         var2[var2.length - 1] = (byte)super.groupVersions[var1];
         if (this.archiveDisk != null) {
            ArchiveDisk var13 = this.archiveDisk;
            ArchiveDiskAction var18 = new ArchiveDiskAction();
            var18.type = 0;
            var18.key = (long)var1;
            var18.data = var2;
            var18.archiveDisk = var13;
            NodeDeque var19 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18);
            }

            Object var20 = ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock;
            synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
               if (ArchiveDiskActionHandler.field3187 == 0) {
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
                  ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
               }

               ArchiveDiskActionHandler.field3187 = 600;
            }

            this.validGroups[var1] = true;
         }

         if (var4) {
            super.groups[var1] = class92.method2195(var2, false);
         }
      }

   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(Llu;I[BZI)V",
      garbageValue = "-2146867560"
   )
   @Export("load")
   public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.masterDisk) {
         if (this.field3192) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length);
         var5 = (int)Archive_crc.getValue();
         if (var5 != this.indexCrc) {
            WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         Buffer var9 = new Buffer(WorldMapDecorationType.decompressBytes(var3));
         int var7 = var9.readUnsignedByte();
         if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.index + "," + var2);
         }

         int var8 = 0;
         if (var7 >= 6) {
            var8 = var9.readInt();
         }

         if (var8 != this.indexVersion) {
            WorldMapSectionType.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
         }

         this.decodeIndex(var3);
         this.loadAllLocal();
      } else {
         if (!var4 && var2 == this.field3200) {
            this.field3192 = true;
         }

         if (var3 == null || var3.length <= 2) {
            this.validGroups[var2] = false;
            if (this.field3196 || var4) {
               WorldMapSectionType.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         Archive_crc.reset();
         Archive_crc.update(var3, 0, var3.length - 2);
         var5 = (int)Archive_crc.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
            this.validGroups[var2] = false;
            if (this.field3196 || var4) {
               WorldMapSectionType.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
            }

            return;
         }

         this.validGroups[var2] = true;
         if (var4) {
            super.groups[var2] = class92.method2195(var3, false);
         }
      }

   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1754503913"
   )
   @Export("loadAllLocal")
   void loadAllLocal() {
      this.validGroups = new boolean[super.groups.length];

      int var1;
      for(var1 = 0; var1 < this.validGroups.length; ++var1) {
         this.validGroups[var1] = false;
      }

      if (this.archiveDisk == null) {
         this.field3192 = true;
      } else {
         this.field3200 = -1;

         for(var1 = 0; var1 < this.validGroups.length; ++var1) {
            if (super.fileCounts[var1] > 0) {
               Tiles.method1218(var1, this.archiveDisk, this);
               this.field3200 = var1;
            }
         }

         if (this.field3200 == -1) {
            this.field3192 = true;
         }

      }
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-321850782"
   )
   public boolean method4470(int var1) {
      return this.validGroups[var1];
   }

   @ObfuscatedName("dx")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "106266787"
   )
   public boolean method4471(int var1) {
      return this.getGroupFileIds(var1) != null;
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2024354781"
   )
   @Export("loadPercent")
   public int loadPercent() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.groups.length; ++var3) {
         if (super.fileCounts[var3] > 0) {
            var1 += 100;
            var2 += this.groupLoadPercent(var3);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }
}
