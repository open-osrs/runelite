import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 910565899
   )
   @Export("loginBoxCenter")
   static int loginBoxCenter;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1864450081
   )
   @Export("id")
   int id;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 505711675
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1431922107
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1205773017
   )
   @Export("x")
   int x;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2064393717
   )
   @Export("y")
   int y;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1686573995
   )
   @Export("height")
   int height;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1959033933
   )
   @Export("frame")
   int frame = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 230901949
   )
   @Export("frameCycle")
   int frameCycle = 0;
   @ObfuscatedName("l")
   @Export("isFinished")
   boolean isFinished = false;

   GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.id = var1;
      this.plane = var2;
      this.x = var3;
      this.y = var4;
      this.height = var5;
      this.cycleStart = var7 + var6;
      int var8 = AbstractUserComparator.SpotAnimationDefinition_get(this.id).sequence;
      if (var8 != -1) {
         this.isFinished = false;
         this.sequenceDefinition = InterfaceParent.SequenceDefinition_get(var8);
      } else {
         this.isFinished = true;
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-83388372"
   )
   @Export("advance")
   final void advance(int var1) {
      if (!this.isFinished) {
         this.frameCycle += var1;

         while(this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
            this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
            ++this.frame;
            if (this.frame >= this.sequenceDefinition.frameIds.length) {
               this.isFinished = true;
               break;
            }
         }

      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)Lef;",
      garbageValue = "127"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = AbstractUserComparator.SpotAnimationDefinition_get(this.id);
      Model var2;
      if (!this.isFinished) {
         var2 = var1.getModel(this.frame);
      } else {
         var2 = var1.getModel(-1);
      }

      return var2 == null ? null : var2;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-531258942"
   )
   public static boolean method2153(int var0) {
      return var0 >= WorldMapDecorationType.field2765.id && var0 <= WorldMapDecorationType.field2750.id || var0 == WorldMapDecorationType.field2760.id;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
      garbageValue = "0"
   )
   @Export("getFile")
   static File getFile(String var0) {
      if (!FileSystem.FileSystem_hasPermissions) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  FileSystem.FileSystem_cacheFiles.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(ILhd;ZI)V",
      garbageValue = "956374800"
   )
   static void method2154(int var0, Coord var1, boolean var2) {
      WorldMapArea var3 = WorldMapSection0.getWorldMap().getMapArea(var0);
      int var4 = UserComparator9.localPlayer.plane;
      int var5 = GrandExchangeOfferNameComparator.baseX * 64 + (UserComparator9.localPlayer.x >> 7);
      int var6 = NetCache.baseY * 64 + (UserComparator9.localPlayer.y >> 7);
      Coord var7 = new Coord(var4, var5, var6);
      WorldMapSection0.getWorldMap().method6536(var3, var7, var1, var2);
   }
}
