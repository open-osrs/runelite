import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("n")
   int field1496;
   @ObfuscatedName("v")
   int field1484;
   @ObfuscatedName("d")
   int field1485;
   @ObfuscatedName("c")
   int field1486;
   @ObfuscatedName("y")
   int field1487;
   @ObfuscatedName("h")
   int field1488;
   @ObfuscatedName("z")
   int field1495;
   @ObfuscatedName("e")
   @Export("numLoops")
   int numLoops;
   @ObfuscatedName("q")
   @Export("start")
   int start;
   @ObfuscatedName("l")
   @Export("end")
   int end;
   @ObfuscatedName("s")
   boolean field1493;
   @ObfuscatedName("b")
   int field1483;
   @ObfuscatedName("a")
   int field1494;
   @ObfuscatedName("k")
   int field1489;
   @ObfuscatedName("i")
   int field1497;

   @ObfuscatedSignature(
      descriptor = "(Ldm;III)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field1493 = var1.field1404;
      this.field1484 = var2;
      this.field1485 = var3;
      this.field1486 = var4;
      this.field1496 = 0;
      this.method2714();
   }

   @ObfuscatedSignature(
      descriptor = "(Ldm;II)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field1493 = var1.field1404;
      this.field1484 = var2;
      this.field1485 = var3;
      this.field1486 = 8192;
      this.field1496 = 0;
      this.method2714();
   }

   @ObfuscatedName("y")
   void method2714() {
      this.field1487 = this.field1485;
      this.field1488 = method2836(this.field1485, this.field1486);
      this.field1495 = method2710(this.field1485, this.field1486);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "()Ldw;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("e")
   protected int vmethod4099() {
      return this.field1485 == 0 && this.field1483 == 0 ? 0 : 1;
   }

   @ObfuscatedName("q")
   @Export("fill")
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field1485 == 0 && this.field1483 == 0) {
         this.skip(var3);
      } else {
         RawSound var4 = (RawSound)super.sound;
         int var5 = this.start << 8;
         int var6 = this.end << 8;
         int var7 = var4.samples.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.numLoops = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field1496 < 0) {
            if (this.field1484 <= 0) {
               this.method2723();
               this.remove();
               return;
            }

            this.field1496 = 0;
         }

         if (this.field1496 >= var7) {
            if (this.field1484 >= 0) {
               this.method2723();
               this.remove();
               return;
            }

            this.field1496 = var7 - 1;
         }

         if (this.numLoops < 0) {
            if (this.field1493) {
               if (this.field1484 < 0) {
                  var9 = this.method2737(var1, var2, var5, var3, var4.samples[this.start]);
                  if (this.field1496 >= var5) {
                     return;
                  }

                  this.field1496 = var5 + var5 - 1 - this.field1496;
                  this.field1484 = -this.field1484;
               }

               while(true) {
                  var9 = this.method2736(var1, var9, var6, var3, var4.samples[this.end - 1]);
                  if (this.field1496 < var6) {
                     return;
                  }

                  this.field1496 = var6 + var6 - 1 - this.field1496;
                  this.field1484 = -this.field1484;
                  var9 = this.method2737(var1, var9, var5, var3, var4.samples[this.start]);
                  if (this.field1496 >= var5) {
                     return;
                  }

                  this.field1496 = var5 + var5 - 1 - this.field1496;
                  this.field1484 = -this.field1484;
               }
            } else if (this.field1484 < 0) {
               while(true) {
                  var9 = this.method2737(var1, var9, var5, var3, var4.samples[this.end - 1]);
                  if (this.field1496 >= var5) {
                     return;
                  }

                  this.field1496 = var6 - 1 - (var6 - 1 - this.field1496) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method2736(var1, var9, var6, var3, var4.samples[this.start]);
                  if (this.field1496 < var6) {
                     return;
                  }

                  this.field1496 = var5 + (this.field1496 - var5) % var8;
               }
            }
         } else {
            if (this.numLoops > 0) {
               if (this.field1493) {
                  label127: {
                     if (this.field1484 < 0) {
                        var9 = this.method2737(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field1496 >= var5) {
                           return;
                        }

                        this.field1496 = var5 + var5 - 1 - this.field1496;
                        this.field1484 = -this.field1484;
                        if (--this.numLoops == 0) {
                           break label127;
                        }
                     }

                     do {
                        var9 = this.method2736(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field1496 < var6) {
                           return;
                        }

                        this.field1496 = var6 + var6 - 1 - this.field1496;
                        this.field1484 = -this.field1484;
                        if (--this.numLoops == 0) {
                           break;
                        }

                        var9 = this.method2737(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field1496 >= var5) {
                           return;
                        }

                        this.field1496 = var5 + var5 - 1 - this.field1496;
                        this.field1484 = -this.field1484;
                     } while(--this.numLoops != 0);
                  }
               } else {
                  int var10;
                  if (this.field1484 < 0) {
                     while(true) {
                        var9 = this.method2737(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field1496 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field1496) / var8;
                        if (var10 >= this.numLoops) {
                           this.field1496 += var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field1496 += var8 * var10;
                        this.numLoops -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method2736(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field1496 < var6) {
                           return;
                        }

                        var10 = (this.field1496 - var5) / var8;
                        if (var10 >= this.numLoops) {
                           this.field1496 -= var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field1496 -= var8 * var10;
                        this.numLoops -= var10;
                     }
                  }
               }
            }

            if (this.field1484 < 0) {
               this.method2737(var1, var9, 0, var3, 0);
               if (this.field1496 < 0) {
                  this.field1496 = -1;
                  this.method2723();
                  this.remove();
               }
            } else {
               this.method2736(var1, var9, var7, var3, 0);
               if (this.field1496 >= var7) {
                  this.field1496 = var7;
                  this.method2723();
                  this.remove();
               }
            }

         }
      }
   }

   @ObfuscatedName("l")
   @Export("setNumLoops")
   public synchronized void setNumLoops(int var1) {
      this.numLoops = var1;
   }

   @ObfuscatedName("s")
   @Export("skip")
   public synchronized void skip(int var1) {
      if (this.field1483 > 0) {
         if (var1 >= this.field1483) {
            if (this.field1485 == Integer.MIN_VALUE) {
               this.field1485 = 0;
               this.field1495 = 0;
               this.field1488 = 0;
               this.field1487 = 0;
               this.remove();
               var1 = this.field1483;
            }

            this.field1483 = 0;
            this.method2714();
         } else {
            this.field1487 += this.field1494 * var1;
            this.field1488 += this.field1489 * var1;
            this.field1495 += this.field1497 * var1;
            this.field1483 -= var1;
         }
      }

      RawSound var2 = (RawSound)super.sound;
      int var3 = this.start << 8;
      int var4 = this.end << 8;
      int var5 = var2.samples.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.numLoops = 0;
      }

      if (this.field1496 < 0) {
         if (this.field1484 <= 0) {
            this.method2723();
            this.remove();
            return;
         }

         this.field1496 = 0;
      }

      if (this.field1496 >= var5) {
         if (this.field1484 >= 0) {
            this.method2723();
            this.remove();
            return;
         }

         this.field1496 = var5 - 1;
      }

      this.field1496 += this.field1484 * var1;
      if (this.numLoops < 0) {
         if (!this.field1493) {
            if (this.field1484 < 0) {
               if (this.field1496 >= var3) {
                  return;
               }

               this.field1496 = var4 - 1 - (var4 - 1 - this.field1496) % var6;
            } else {
               if (this.field1496 < var4) {
                  return;
               }

               this.field1496 = var3 + (this.field1496 - var3) % var6;
            }

         } else {
            if (this.field1484 < 0) {
               if (this.field1496 >= var3) {
                  return;
               }

               this.field1496 = var3 + var3 - 1 - this.field1496;
               this.field1484 = -this.field1484;
            }

            while(this.field1496 >= var4) {
               this.field1496 = var4 + var4 - 1 - this.field1496;
               this.field1484 = -this.field1484;
               if (this.field1496 >= var3) {
                  return;
               }

               this.field1496 = var3 + var3 - 1 - this.field1496;
               this.field1484 = -this.field1484;
            }

         }
      } else {
         if (this.numLoops > 0) {
            if (this.field1493) {
               label129: {
                  if (this.field1484 < 0) {
                     if (this.field1496 >= var3) {
                        return;
                     }

                     this.field1496 = var3 + var3 - 1 - this.field1496;
                     this.field1484 = -this.field1484;
                     if (--this.numLoops == 0) {
                        break label129;
                     }
                  }

                  do {
                     if (this.field1496 < var4) {
                        return;
                     }

                     this.field1496 = var4 + var4 - 1 - this.field1496;
                     this.field1484 = -this.field1484;
                     if (--this.numLoops == 0) {
                        break;
                     }

                     if (this.field1496 >= var3) {
                        return;
                     }

                     this.field1496 = var3 + var3 - 1 - this.field1496;
                     this.field1484 = -this.field1484;
                  } while(--this.numLoops != 0);
               }
            } else {
               label161: {
                  int var7;
                  if (this.field1484 < 0) {
                     if (this.field1496 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field1496) / var6;
                     if (var7 >= this.numLoops) {
                        this.field1496 += var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field1496 += var6 * var7;
                     this.numLoops -= var7;
                  } else {
                     if (this.field1496 < var4) {
                        return;
                     }

                     var7 = (this.field1496 - var3) / var6;
                     if (var7 >= this.numLoops) {
                        this.field1496 -= var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field1496 -= var6 * var7;
                     this.numLoops -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field1484 < 0) {
            if (this.field1496 < 0) {
               this.field1496 = -1;
               this.method2723();
               this.remove();
            }
         } else if (this.field1496 >= var5) {
            this.field1496 = var5;
            this.method2723();
            this.remove();
         }

      }
   }

   @ObfuscatedName("b")
   public synchronized void method2796(int var1) {
      this.method2718(var1 << 6, this.method2773());
   }

   @ObfuscatedName("a")
   synchronized void method2717(int var1) {
      this.method2718(var1, this.method2773());
   }

   @ObfuscatedName("w")
   synchronized void method2718(int var1, int var2) {
      this.field1485 = var1;
      this.field1486 = var2;
      this.field1483 = 0;
      this.method2714();
   }

   @ObfuscatedName("k")
   public synchronized int method2719() {
      return this.field1485 == Integer.MIN_VALUE ? 0 : this.field1485;
   }

   @ObfuscatedName("i")
   public synchronized int method2773() {
      return this.field1486 < 0 ? -1 : this.field1486;
   }

   @ObfuscatedName("x")
   public synchronized void method2781(int var1) {
      int var2 = ((RawSound)super.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field1496 = var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method2722() {
      this.field1484 = (this.field1484 ^ this.field1484 >> 31) + (this.field1484 >>> 31);
      this.field1484 = -this.field1484;
   }

   @ObfuscatedName("u")
   void method2723() {
      if (this.field1483 != 0) {
         if (this.field1485 == Integer.MIN_VALUE) {
            this.field1485 = 0;
         }

         this.field1483 = 0;
         this.method2714();
      }

   }

   @ObfuscatedName("t")
   public synchronized void method2741(int var1, int var2) {
      this.method2843(var1, var2, this.method2773());
   }

   @ObfuscatedName("p")
   public synchronized void method2843(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method2718(var2, var3);
      } else {
         int var4 = method2836(var2, var3);
         int var5 = method2710(var2, var3);
         if (var4 == this.field1488 && var5 == this.field1495) {
            this.field1483 = 0;
         } else {
            int var6 = var2 - this.field1487;
            if (this.field1487 - var2 > var6) {
               var6 = this.field1487 - var2;
            }

            if (var4 - this.field1488 > var6) {
               var6 = var4 - this.field1488;
            }

            if (this.field1488 - var4 > var6) {
               var6 = this.field1488 - var4;
            }

            if (var5 - this.field1495 > var6) {
               var6 = var5 - this.field1495;
            }

            if (this.field1495 - var5 > var6) {
               var6 = this.field1495 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1483 = var1;
            this.field1485 = var2;
            this.field1486 = var3;
            this.field1494 = (var2 - this.field1487) / var1;
            this.field1489 = (var4 - this.field1488) / var1;
            this.field1497 = (var5 - this.field1495) / var1;
         }
      }
   }

   @ObfuscatedName("o")
   public synchronized void method2803(int var1) {
      if (var1 == 0) {
         this.method2717(0);
         this.remove();
      } else if (this.field1488 == 0 && this.field1495 == 0) {
         this.field1483 = 0;
         this.field1485 = 0;
         this.field1487 = 0;
         this.remove();
      } else {
         int var2 = -this.field1487;
         if (this.field1487 > var2) {
            var2 = this.field1487;
         }

         if (-this.field1488 > var2) {
            var2 = -this.field1488;
         }

         if (this.field1488 > var2) {
            var2 = this.field1488;
         }

         if (-this.field1495 > var2) {
            var2 = -this.field1495;
         }

         if (this.field1495 > var2) {
            var2 = this.field1495;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1483 = var1;
         this.field1485 = Integer.MIN_VALUE;
         this.field1494 = -this.field1487 / var1;
         this.field1489 = -this.field1488 / var1;
         this.field1497 = -this.field1495 / var1;
      }
   }

   @ObfuscatedName("ay")
   public synchronized void method2802(int var1) {
      if (this.field1484 < 0) {
         this.field1484 = -var1;
      } else {
         this.field1484 = var1;
      }

   }

   @ObfuscatedName("am")
   public synchronized int method2728() {
      return this.field1484 < 0 ? -this.field1484 : this.field1484;
   }

   @ObfuscatedName("ag")
   public boolean method2786() {
      return this.field1496 < 0 || this.field1496 >= ((RawSound)super.sound).samples.length << 8;
   }

   @ObfuscatedName("ae")
   public boolean method2730() {
      return this.field1483 != 0;
   }

   @ObfuscatedName("ac")
   int method2736(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field1483 > 0) {
            int var6 = var2 + this.field1483;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field1483 += var2;
            if (this.field1484 == 256 && (this.field1496 & 255) == 0) {
               if (PcmPlayer.PcmPlayer_stereo) {
                  var2 = method2748(0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, this.field1489, this.field1497, 0, var6, var3, this);
               } else {
                  var2 = method2747(((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, this.field1494, 0, var6, var3, this);
               }
            } else if (PcmPlayer.PcmPlayer_stereo) {
               var2 = method2746(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, this.field1489, this.field1497, 0, var6, var3, this, this.field1484, var5);
            } else {
               var2 = method2751(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, this.field1494, 0, var6, var3, this, this.field1484, var5);
            }

            this.field1483 -= var2;
            if (this.field1483 != 0) {
               return var2;
            }

            if (!this.method2738()) {
               continue;
            }

            return var4;
         }

         if (this.field1484 == 256 && (this.field1496 & 255) == 0) {
            if (PcmPlayer.PcmPlayer_stereo) {
               return method2813(0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, 0, var4, var3, this);
            }

            return method2752(((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, 0, var4, var3, this);
         }

         if (PcmPlayer.PcmPlayer_stereo) {
            return method2744(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, 0, var4, var3, this, this.field1484, var5);
         }

         return method2758(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, 0, var4, var3, this, this.field1484, var5);
      }
   }

   @ObfuscatedName("aq")
   int method2737(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field1483 > 0) {
            int var6 = var2 + this.field1483;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field1483 += var2;
            if (this.field1484 == -256 && (this.field1496 & 255) == 0) {
               if (PcmPlayer.PcmPlayer_stereo) {
                  var2 = method2750(0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, this.field1489, this.field1497, 0, var6, var3, this);
               } else {
                  var2 = method2749(((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, this.field1494, 0, var6, var3, this);
               }
            } else if (PcmPlayer.PcmPlayer_stereo) {
               var2 = method2847(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, this.field1489, this.field1497, 0, var6, var3, this, this.field1484, var5);
            } else {
               var2 = method2771(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, this.field1494, 0, var6, var3, this, this.field1484, var5);
            }

            this.field1483 -= var2;
            if (this.field1483 != 0) {
               return var2;
            }

            if (!this.method2738()) {
               continue;
            }

            return var4;
         }

         if (this.field1484 == -256 && (this.field1496 & 255) == 0) {
            if (PcmPlayer.PcmPlayer_stereo) {
               return method2742(0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, 0, var4, var3, this);
            }

            return method2735(((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, 0, var4, var3, this);
         }

         if (PcmPlayer.PcmPlayer_stereo) {
            return method2829(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1488, this.field1495, 0, var4, var3, this, this.field1484, var5);
         }

         return method2766(0, 0, ((RawSound)super.sound).samples, var1, this.field1496, var2, this.field1487, 0, var4, var3, this, this.field1484, var5);
      }
   }

   @ObfuscatedName("at")
   boolean method2738() {
      int var1 = this.field1485;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method2836(var1, this.field1486);
         var3 = method2710(var1, this.field1486);
      }

      if (var1 == this.field1487 && var2 == this.field1488 && var3 == this.field1495) {
         if (this.field1485 == Integer.MIN_VALUE) {
            this.field1485 = 0;
            this.field1495 = 0;
            this.field1488 = 0;
            this.field1487 = 0;
            this.remove();
            return true;
         } else {
            this.method2714();
            return false;
         }
      } else {
         if (this.field1487 < var1) {
            this.field1494 = 1;
            this.field1483 = var1 - this.field1487;
         } else if (this.field1487 > var1) {
            this.field1494 = -1;
            this.field1483 = this.field1487 - var1;
         } else {
            this.field1494 = 0;
         }

         if (this.field1488 < var2) {
            this.field1489 = 1;
            if (this.field1483 == 0 || this.field1483 > var2 - this.field1488) {
               this.field1483 = var2 - this.field1488;
            }
         } else if (this.field1488 > var2) {
            this.field1489 = -1;
            if (this.field1483 == 0 || this.field1483 > this.field1488 - var2) {
               this.field1483 = this.field1488 - var2;
            }
         } else {
            this.field1489 = 0;
         }

         if (this.field1495 < var3) {
            this.field1497 = 1;
            if (this.field1483 == 0 || this.field1483 > var3 - this.field1495) {
               this.field1483 = var3 - this.field1495;
            }
         } else if (this.field1495 > var3) {
            this.field1497 = -1;
            if (this.field1483 == 0 || this.field1483 > this.field1495 - var3) {
               this.field1483 = this.field1495 - var3;
            }
         } else {
            this.field1497 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("bi")
   int vmethod2880() {
      int var1 = this.field1487 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.numLoops == 0) {
         var1 -= var1 * this.field1496 / (((RawSound)super.sound).samples.length << 8);
      } else if (this.numLoops >= 0) {
         var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedName("n")
   static int method2836(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("v")
   static int method2710(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ldm;II)Ldt;"
   )
   @Export("createRawPcmStream")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(StructDefinition.field3338 * 2205000)), var2 << 6) : null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Ldm;III)Ldt;"
   )
   public static RawPcmStream method2845(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILdt;)I"
   )
   static int method2752(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field1496 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILdt;)I"
   )
   static int method2813(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field1496 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILdt;)I"
   )
   static int method2735(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field1496 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILdt;)I"
   )
   static int method2742(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field1496 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILdt;II)I"
   )
   static int method2758(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field1496 = var4;
      return var5;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2744(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field1496 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILdt;II)I"
   )
   static int method2766(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field1496 = var4;
      return var5;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2829(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field1496 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILdt;)I"
   )
   static int method2747(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1488 += var9.field1489 * (var6 - var3);
      var9.field1495 += var9.field1497 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field1487 = var4 >> 2;
      var9.field1496 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILdt;)I"
   )
   static int method2748(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field1487 += var12.field1494 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field1488 = var5 >> 2;
      var12.field1495 = var6 >> 2;
      var12.field1496 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILdt;)I"
   )
   static int method2749(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1488 += var9.field1489 * (var6 - var3);
      var9.field1495 += var9.field1497 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field1487 = var4 >> 2;
      var9.field1496 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILdt;)I"
   )
   static int method2750(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1487 += var12.field1494 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field1488 = var5 >> 2;
      var12.field1495 = var6 >> 2;
      var12.field1496 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2751(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field1488 -= var11.field1489 * var5;
      var11.field1495 -= var11.field1497 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1488 += var11.field1489 * var5;
      var11.field1495 += var11.field1497 * var5;
      var11.field1487 = var6;
      var11.field1496 = var4;
      return var5;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILdt;II)I"
   )
   static int method2746(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field1487 -= var5 * var13.field1494;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1487 += var13.field1494 * var5;
      var13.field1488 = var6;
      var13.field1495 = var7;
      var13.field1496 = var4;
      return var5;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILdt;II)I"
   )
   static int method2771(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field1488 -= var11.field1489 * var5;
      var11.field1495 -= var11.field1497 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field1488 += var11.field1489 * var5;
      var11.field1495 += var11.field1497 * var5;
      var11.field1487 = var6;
      var11.field1496 = var4;
      return var5;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILdt;II)I"
   )
   static int method2847(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field1487 -= var5 * var13.field1494;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field1487 += var13.field1494 * var5;
      var13.field1488 = var6;
      var13.field1495 = var7;
      var13.field1496 = var4;
      return var5;
   }
}
