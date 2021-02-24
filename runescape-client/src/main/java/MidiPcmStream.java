import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      intValue = 806429497
   )
   @Export("selectedSpellWidget")
   static int selectedSpellWidget;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   @Export("musicPatches")
   NodeHashTable musicPatches = new NodeHashTable(128);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1755740693
   )
   int field2442 = 256;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1913145536
   )
   int field2443 = -727379968;
   @ObfuscatedName("c")
   int[] field2444 = new int[16];
   @ObfuscatedName("y")
   int[] field2447 = new int[16];
   @ObfuscatedName("h")
   int[] field2446 = new int[16];
   @ObfuscatedName("z")
   int[] field2445 = new int[16];
   @ObfuscatedName("e")
   int[] field2448 = new int[16];
   @ObfuscatedName("q")
   int[] field2463 = new int[16];
   @ObfuscatedName("l")
   int[] field2441 = new int[16];
   @ObfuscatedName("s")
   int[] field2451 = new int[16];
   @ObfuscatedName("b")
   int[] field2452 = new int[16];
   @ObfuscatedName("u")
   int[] field2458 = new int[16];
   @ObfuscatedName("t")
   int[] field2455 = new int[16];
   @ObfuscatedName("p")
   int[] field2456 = new int[16];
   @ObfuscatedName("m")
   int[] field2460 = new int[16];
   @ObfuscatedName("r")
   int[] field2457 = new int[16];
   @ObfuscatedName("o")
   int[] field2468 = new int[16];
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "[[Lhq;"
   )
   MusicPatchNode[][] field2450 = new MusicPatchNode[16][128];
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "[[Lhq;"
   )
   MusicPatchNode[][] field2461 = new MusicPatchNode[16][128];
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lho;"
   )
   @Export("midiFile")
   MidiFileReader midiFile = new MidiFileReader();
   @ObfuscatedName("ag")
   boolean field2459;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1902881545
   )
   @Export("track")
   int track;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 418565545
   )
   @Export("trackLength")
   int trackLength;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = 7287012741980602557L
   )
   long field2466;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -8407851489903223283L
   )
   long field2467;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lhe;"
   )
   @Export("patchStream")
   MusicPatchPcmStream patchStream = new MusicPatchPcmStream(this);

   public MidiPcmStream() {
      this.method3931();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "699438448"
   )
   @Export("setPcmStreamVolume")
   public synchronized void setPcmStreamVolume(int var1) {
      this.field2442 = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1131484888"
   )
   int method3912() {
      return this.field2442;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lhr;Lig;Ldy;IB)Z",
      garbageValue = "80"
   )
   @Export("loadMusicTrack")
   public synchronized boolean loadMusicTrack(MusicTrack var1, AbstractArchive var2, SoundCache var3, int var4) {
      var1.method4125();
      boolean var5 = true;
      int[] var6 = null;
      if (var4 > 0) {
         var6 = new int[]{var4};
      }

      for(ByteArrayNode var7 = (ByteArrayNode)var1.table.first(); var7 != null; var7 = (ByteArrayNode)var1.table.next()) {
         int var8 = (int)var7.key;
         MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)var8);
         if (var9 == null) {
            byte[] var11 = var2.takeFileFlat(var8);
            MusicPatch var10;
            if (var11 == null) {
               var10 = null;
            } else {
               var10 = new MusicPatch(var11);
            }

            var9 = var10;
            if (var10 == null) {
               var5 = false;
               continue;
            }

            this.musicPatches.put(var10, (long)var8);
         }

         if (!var9.method4086(var3, var7.byteArray, var6)) {
            var5 = false;
         }
      }

      if (var5) {
         var1.clear();
      }

      return var5;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1484223383"
   )
   @Export("clearAll")
   public synchronized void clearAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.clear();
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-24768"
   )
   @Export("removeAll")
   synchronized void removeAll() {
      for(MusicPatch var1 = (MusicPatch)this.musicPatches.first(); var1 != null; var1 = (MusicPatch)this.musicPatches.next()) {
         var1.remove();
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("firstSubStream")
   protected synchronized PcmStream firstSubStream() {
      return this.patchStream;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("nextSubStream")
   protected synchronized PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("e")
   protected synchronized int vmethod4099() {
      return 0;
   }

   @ObfuscatedName("q")
   @Export("fill")
   protected synchronized void fill(int[] var1, int var2, int var3) {
      if (this.midiFile.isReady()) {
         int var4 = this.midiFile.division * this.field2443 * 1000000 / (StructDefinition.field3338 * 22050);

         do {
            long var5 = this.field2466 + (long)var3 * (long)var4;
            if (this.field2467 - var5 >= 0L) {
               this.field2466 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field2467 - this.field2466) - 1L) / (long)var4);
            this.field2466 += (long)var4 * (long)var7;
            this.patchStream.fill(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method3944();
         } while(this.midiFile.isReady());
      }

      this.patchStream.fill(var1, var2, var3);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(Lhr;ZI)V",
      garbageValue = "99605347"
   )
   @Export("setMusicTrack")
   public synchronized void setMusicTrack(MusicTrack var1, boolean var2) {
      this.clear();
      this.midiFile.parse(var1.midi);
      this.field2459 = var2;
      this.field2466 = 0L;
      int var3 = this.midiFile.trackCount();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.midiFile.gotoTrack(var4);
         this.midiFile.readTrackLength(var4);
         this.midiFile.markTrackPosition(var4);
      }

      this.track = this.midiFile.getPrioritizedTrack();
      this.trackLength = this.midiFile.trackLengths[this.track];
      this.field2467 = this.midiFile.method4048(this.trackLength);
   }

   @ObfuscatedName("s")
   @Export("skip")
   protected synchronized void skip(int var1) {
      if (this.midiFile.isReady()) {
         int var2 = this.midiFile.division * this.field2443 * 1000000 / (StructDefinition.field3338 * 22050);

         do {
            long var3 = this.field2466 + (long)var2 * (long)var1;
            if (this.field2467 - var3 >= 0L) {
               this.field2466 = var3;
               break;
            }

            int var5 = (int)((this.field2467 - this.field2466 + (long)var2 - 1L) / (long)var2);
            this.field2466 += (long)var2 * (long)var5;
            this.patchStream.skip(var5);
            var1 -= var5;
            this.method3944();
         } while(this.midiFile.isReady());
      }

      this.patchStream.skip(var1);
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-121"
   )
   @Export("clear")
   public synchronized void clear() {
      this.midiFile.clear();
      this.method3931();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1309898808"
   )
   @Export("isReady")
   synchronized boolean isReady() {
      return this.midiFile.isReady();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1101705080"
   )
   public synchronized void method3919(int var1, int var2) {
      this.method3920(var1, var2);
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1341078259"
   )
   void method3920(int var1, int var2) {
      this.field2445[var1] = var2;
      this.field2463[var1] = var2 & -128;
      this.method3921(var1, var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-982058038"
   )
   void method3921(int var1, int var2) {
      if (var2 != this.field2448[var1]) {
         this.field2448[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.field2461[var1][var3] = null;
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "441303152"
   )
   void method3922(int var1, int var2, int var3) {
      this.method3924(var1, var2, 64);
      if ((this.field2458[var1] & 2) != 0) {
         for(MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
            if (var4.field2471 == var1 && var4.field2486 < 0) {
               this.field2450[var1][var4.field2475] = null;
               this.field2450[var1][var2] = var4;
               int var8 = (var4.field2472 * var4.field2480 >> 12) + var4.field2478;
               var4.field2478 += var2 - var4.field2475 << 8;
               var4.field2472 = var8 - var4.field2478;
               var4.field2480 = 4096;
               var4.field2475 = var2;
               return;
            }
         }
      }

      MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field2448[var1]);
      if (var9 != null) {
         RawSound var5 = var9.rawSounds[var2];
         if (var5 != null) {
            MusicPatchNode var6 = new MusicPatchNode();
            var6.field2471 = var1;
            var6.patch = var9;
            var6.rawSound = var5;
            var6.field2473 = var9.field2511[var2];
            var6.field2474 = var9.field2512[var2];
            var6.field2475 = var2;
            var6.field2476 = var3 * var3 * var9.field2507[var2] * var9.field2509 + 1024 >> 11;
            var6.field2477 = var9.field2510[var2] & 255;
            var6.field2478 = (var2 << 8) - (var9.field2513[var2] & 32767);
            var6.field2481 = 0;
            var6.field2491 = 0;
            var6.field2483 = 0;
            var6.field2486 = -1;
            var6.field2482 = 0;
            if (this.field2460[var1] == 0) {
               var6.stream = RawPcmStream.method2845(var5, this.method4009(var6), this.method3997(var6), this.method3938(var6));
            } else {
               var6.stream = RawPcmStream.method2845(var5, this.method4009(var6), 0, this.method3938(var6));
               this.method3923(var6, var9.field2513[var2] < 0);
            }

            if (var9.field2513[var2] < 0) {
               var6.stream.setNumLoops(-1);
            }

            if (var6.field2474 >= 0) {
               MusicPatchNode var7 = this.field2461[var1][var6.field2474];
               if (var7 != null && var7.field2486 < 0) {
                  this.field2450[var1][var7.field2475] = null;
                  var7.field2486 = 0;
               }

               this.field2461[var1][var6.field2474] = var6;
            }

            this.patchStream.queue.addFirst(var6);
            this.field2450[var1][var2] = var6;
         }
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Lhq;ZI)V",
      garbageValue = "-2147173721"
   )
   void method3923(MusicPatchNode var1, boolean var2) {
      int var3 = var1.rawSound.samples.length;
      int var4;
      if (var2 && var1.rawSound.field1404) {
         int var5 = var3 + var3 - var1.rawSound.start;
         var4 = (int)((long)this.field2460[var1.field2471] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.stream.method2722();
         }
      } else {
         var4 = (int)((long)this.field2460[var1.field2471] * (long)var3 >> 6);
      }

      var1.stream.method2781(var4);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "589612464"
   )
   void method3924(int var1, int var2, int var3) {
      MusicPatchNode var4 = this.field2450[var1][var2];
      if (var4 != null) {
         this.field2450[var1][var2] = null;
         if ((this.field2458[var1] & 2) != 0) {
            for(MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
               if (var5.field2471 == var4.field2471 && var5.field2486 < 0 && var5 != var4) {
                  var4.field2486 = 0;
                  break;
               }
            }
         } else {
            var4.field2486 = 0;
         }

      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-112"
   )
   void method3925(int var1, int var2, int var3) {
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "419517306"
   )
   void method3926(int var1, int var2) {
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "10"
   )
   void method3995(int var1, int var2) {
      this.field2441[var1] = var2;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "127"
   )
   void method3928(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if (var1 < 0 || var2.field2471 == var1) {
            if (var2.stream != null) {
               var2.stream.method2803(StructDefinition.field3338 * 22050 / 100);
               if (var2.stream.method2730()) {
                  this.patchStream.mixer.addSubStream(var2.stream);
               }

               var2.method4032();
            }

            if (var2.field2486 < 0) {
               this.field2450[var2.field2471][var2.field2475] = null;
            }

            var2.remove();
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-8109"
   )
   void method3929(int var1) {
      if (var1 >= 0) {
         this.field2444[var1] = 12800;
         this.field2447[var1] = 8192;
         this.field2446[var1] = 16383;
         this.field2441[var1] = 8192;
         this.field2451[var1] = 0;
         this.field2452[var1] = 8192;
         this.method3932(var1);
         this.method3971(var1);
         this.field2458[var1] = 0;
         this.field2455[var1] = 32767;
         this.field2456[var1] = 256;
         this.field2460[var1] = 0;
         this.method3935(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method3929(var1);
         }

      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   void method4017(int var1) {
      for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
         if ((var1 < 0 || var2.field2471 == var1) && var2.field2486 < 0) {
            this.field2450[var2.field2471][var2.field2475] = null;
            var2.field2486 = 0;
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-359198859"
   )
   void method3931() {
      this.method3928(-1);
      this.method3929(-1);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.field2448[var1] = this.field2445[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.field2463[var1] = this.field2445[var1] & -128;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2021609414"
   )
   void method3932(int var1) {
      if ((this.field2458[var1] & 2) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field2471 == var1 && this.field2450[var1][var2.field2475] == null && var2.field2486 < 0) {
               var2.field2486 = 0;
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-781688600"
   )
   void method3971(int var1) {
      if ((this.field2458[var1] & 4) != 0) {
         for(MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
            if (var2.field2471 == var1) {
               var2.field2479 = 0;
            }
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "30"
   )
   void method3934(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method3924(var3, var4, var5);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.method3922(var3, var4, var5);
         } else {
            this.method3924(var3, var4, 64);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.method3925(var3, var4, var5);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.field2463[var3] = (var5 << 14) + (this.field2463[var3] & -2080769);
         }

         if (var4 == 32) {
            this.field2463[var3] = (var5 << 7) + (this.field2463[var3] & -16257);
         }

         if (var4 == 1) {
            this.field2451[var3] = (var5 << 7) + (this.field2451[var3] & -16257);
         }

         if (var4 == 33) {
            this.field2451[var3] = var5 + (this.field2451[var3] & -128);
         }

         if (var4 == 5) {
            this.field2452[var3] = (var5 << 7) + (this.field2452[var3] & -16257);
         }

         if (var4 == 37) {
            this.field2452[var3] = var5 + (this.field2452[var3] & -128);
         }

         if (var4 == 7) {
            this.field2444[var3] = (var5 << 7) + (this.field2444[var3] & -16257);
         }

         if (var4 == 39) {
            this.field2444[var3] = var5 + (this.field2444[var3] & -128);
         }

         if (var4 == 10) {
            this.field2447[var3] = (var5 << 7) + (this.field2447[var3] & -16257);
         }

         if (var4 == 42) {
            this.field2447[var3] = var5 + (this.field2447[var3] & -128);
         }

         if (var4 == 11) {
            this.field2446[var3] = (var5 << 7) + (this.field2446[var3] & -16257);
         }

         if (var4 == 43) {
            this.field2446[var3] = var5 + (this.field2446[var3] & -128);
         }

         if (var4 == 64) {
            if (var5 >= 64) {
               this.field2458[var3] |= 1;
            } else {
               this.field2458[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               this.field2458[var3] |= 2;
            } else {
               this.method3932(var3);
               this.field2458[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.field2455[var3] = (var5 << 7) + (this.field2455[var3] & 127);
         }

         if (var4 == 98) {
            this.field2455[var3] = (this.field2455[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.field2455[var3] = (var5 << 7) + (this.field2455[var3] & 127) + 16384;
         }

         if (var4 == 100) {
            this.field2455[var3] = (this.field2455[var3] & 16256) + var5 + 16384;
         }

         if (var4 == 120) {
            this.method3928(var3);
         }

         if (var4 == 121) {
            this.method3929(var3);
         }

         if (var4 == 123) {
            this.method4017(var3);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.field2455[var3];
            if (var6 == 16384) {
               this.field2456[var3] = (var5 << 7) + (this.field2456[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.field2455[var3];
            if (var6 == 16384) {
               this.field2456[var3] = var5 + (this.field2456[var3] & -128);
            }
         }

         if (var4 == 16) {
            this.field2460[var3] = (var5 << 7) + (this.field2460[var3] & -16257);
         }

         if (var4 == 48) {
            this.field2460[var3] = var5 + (this.field2460[var3] & -128);
         }

         if (var4 == 81) {
            if (var5 >= 64) {
               this.field2458[var3] |= 4;
            } else {
               this.method3971(var3);
               this.field2458[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.method3935(var3, (var5 << 7) + (this.field2457[var3] & -16257));
         }

         if (var4 == 49) {
            this.method3935(var3, var5 + (this.field2457[var3] & -128));
         }

      } else if (var2 == 192) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method3921(var3, var4 + this.field2463[var3]);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.method3926(var3, var4);
      } else if (var2 == 224) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method3995(var3, var4);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.method3931();
         }
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1284126948"
   )
   void method3935(int var1, int var2) {
      this.field2457[var1] = var2;
      this.field2468[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lhq;B)I",
      garbageValue = "-12"
   )
   int method4009(MusicPatchNode var1) {
      int var2 = (var1.field2472 * var1.field2480 >> 12) + var1.field2478;
      var2 += (this.field2441[var1.field2471] - 8192) * this.field2456[var1.field2471] >> 12;
      MusicPatchNode2 var3 = var1.field2473;
      int var4;
      if (var3.field2429 > 0 && (var3.field2428 > 0 || this.field2451[var1.field2471] > 0)) {
         var4 = var3.field2428 << 2;
         int var5 = var3.field2422 << 1;
         if (var1.field2488 < var5) {
            var4 = var4 * var1.field2488 / var5;
         }

         var4 += this.field2451[var1.field2471] >> 7;
         double var6 = Math.sin((double)(var1.field2487 & 511) * 0.01227184630308513D);
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)(StructDefinition.field3338 * 22050) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lhq;B)I",
      garbageValue = "75"
   )
   int method3997(MusicPatchNode var1) {
      MusicPatchNode2 var2 = var1.field2473;
      int var3 = this.field2446[var1.field2471] * this.field2444[var1.field2471] + 4096 >> 13;
      var3 = var3 * var3 + 16384 >> 15;
      var3 = var3 * var1.field2476 + 16384 >> 15;
      var3 = var3 * this.field2442 + 128 >> 8;
      if (var2.field2424 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field2424 * (double)var1.field2481 * 1.953125E-5D) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.field2427 != null) {
         var4 = var1.field2491;
         var5 = var2.field2427[var1.field2483 * 4 + 1];
         if (var1.field2483 * 4 < var2.field2427.length - 2) {
            var6 = (var2.field2427[var1.field2483 * 4] & 255) << 8;
            var7 = (var2.field2427[var1.field2483 * 4 + 2] & 255) << 8;
            var5 += (var4 - var6) * (var2.field2427[var1.field2483 * 4 + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.field2486 > 0 && var2.field2423 != null) {
         var4 = var1.field2486;
         var5 = var2.field2423[var1.field2482 * 4 + 1];
         if (var1.field2482 * 4 < var2.field2423.length - 2) {
            var6 = (var2.field2423[var1.field2482 * 4] & 255) << 8;
            var7 = (var2.field2423[var1.field2482 * 4 + 2] & 255) << 8;
            var5 += (var2.field2423[var1.field2482 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + 32 >> 6;
      }

      return var3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lhq;I)I",
      garbageValue = "-118932210"
   )
   int method3938(MusicPatchNode var1) {
      int var2 = this.field2447[var1.field2471];
      return var2 < 8192 ? var2 * var1.field2477 + 32 >> 6 : 16384 - ((128 - var1.field2477) * (16384 - var2) + 32 >> 6);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-36"
   )
   void method3944() {
      int var1 = this.track;
      int var2 = this.trackLength;

      long var3;
      for(var3 = this.field2467; var2 == this.trackLength; var3 = this.midiFile.method4048(var2)) {
         while(var2 == this.midiFile.trackLengths[var1]) {
            this.midiFile.gotoTrack(var1);
            int var5 = this.midiFile.readMessage(var1);
            if (var5 == 1) {
               this.midiFile.setTrackDone();
               this.midiFile.markTrackPosition(var1);
               if (this.midiFile.isDone()) {
                  if (!this.field2459 || var2 == 0) {
                     this.method3931();
                     this.midiFile.clear();
                     return;
                  }

                  this.midiFile.reset(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.method3934(var5);
            }

            this.midiFile.readTrackLength(var1);
            this.midiFile.markTrackPosition(var1);
         }

         var1 = this.midiFile.getPrioritizedTrack();
         var2 = this.midiFile.trackLengths[var1];
      }

      this.track = var1;
      this.trackLength = var2;
      this.field2467 = var3;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lhq;I)Z",
      garbageValue = "-1408710575"
   )
   boolean method3927(MusicPatchNode var1) {
      if (var1.stream == null) {
         if (var1.field2486 >= 0) {
            var1.remove();
            if (var1.field2474 > 0 && var1 == this.field2461[var1.field2471][var1.field2474]) {
               this.field2461[var1.field2471][var1.field2474] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lhq;[IIIB)Z",
      garbageValue = "8"
   )
   boolean method3953(MusicPatchNode var1, int[] var2, int var3, int var4) {
      var1.field2484 = StructDefinition.field3338 * 22050 / 100;
      if (var1.field2486 < 0 || var1.stream != null && !var1.stream.method2786()) {
         int var5 = var1.field2480;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field2452[var1.field2471] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.field2480 = var5;
         }

         var1.stream.method2802(this.method4009(var1));
         MusicPatchNode2 var6 = var1.field2473;
         boolean var7 = false;
         ++var1.field2488;
         var1.field2487 += var6.field2429;
         double var8 = (double)((var1.field2475 - 60 << 8) + (var1.field2472 * var1.field2480 >> 12)) * 5.086263020833333E-6D;
         if (var6.field2424 > 0) {
            if (var6.field2431 > 0) {
               var1.field2481 = var1.field2481 * 298074112 + (int)(128.0D * Math.pow(2.0D, (double)var6.field2431 * var8) + 0.5D) * 298074112;
            } else {
               var1.field2481 = var1.field2481 * 298074112 + -501219328;
            }
         }

         if (var6.field2427 != null) {
            if (var6.field2425 > 0) {
               var1.field2491 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2425 * var8) + 0.5D);
            } else {
               var1.field2491 += 128;
            }

            while(var1.field2483 * 4 < var6.field2427.length - 2 && var1.field2491 > (var6.field2427[var1.field2483 * 4 + 2] & 255) << 8) {
               var1.field2483 = var1.field2483 * 4 + 2;
            }

            if (var1.field2483 * 4 == var6.field2427.length - 2 && var6.field2427[var1.field2483 * 4 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.field2486 >= 0 && var6.field2423 != null && (this.field2458[var1.field2471] & 1) == 0 && (var1.field2474 < 0 || var1 != this.field2461[var1.field2471][var1.field2474])) {
            if (var6.field2426 > 0) {
               var1.field2486 += (int)(128.0D * Math.pow(2.0D, (double)var6.field2426 * var8) + 0.5D);
            } else {
               var1.field2486 += 128;
            }

            while(var1.field2482 * 4 < var6.field2423.length - 2 && var1.field2486 > (var6.field2423[var1.field2482 * 4 + 2] & 255) << 8) {
               var1.field2482 = var1.field2482 * 4 + 2;
            }

            if (var1.field2482 * 4 == var6.field2423.length - 2) {
               var7 = true;
            }
         }

         if (var7) {
            var1.stream.method2803(var1.field2484);
            if (var2 != null) {
               var1.stream.fill(var2, var3, var4);
            } else {
               var1.stream.skip(var4);
            }

            if (var1.stream.method2730()) {
               this.patchStream.mixer.addSubStream(var1.stream);
            }

            var1.method4032();
            if (var1.field2486 >= 0) {
               var1.remove();
               if (var1.field2474 > 0 && var1 == this.field2461[var1.field2471][var1.field2474]) {
                  this.field2461[var1.field2471][var1.field2474] = null;
               }
            }

            return true;
         } else {
            var1.stream.method2843(var1.field2484, this.method3997(var1), this.method3938(var1));
            return false;
         }
      } else {
         var1.method4032();
         var1.remove();
         if (var1.field2474 > 0 && var1 == this.field2461[var1.field2471][var1.field2474]) {
            this.field2461[var1.field2471][var1.field2474] = null;
         }

         return true;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "76"
   )
   public static boolean method3972(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljg;I)Z",
      garbageValue = "543287365"
   )
   static boolean method4031(ObjectDefinition var0) {
      if (var0.transforms != null) {
         int[] var1 = var0.transforms;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            ObjectDefinition var4 = WorldMapAreaData.getObjectDefinition(var3);
            if (var4.mapIconId != -1) {
               return true;
            }
         }
      } else if (var0.mapIconId != -1) {
         return true;
      }

      return false;
   }
}
