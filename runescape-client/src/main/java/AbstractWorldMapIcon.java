import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = -1942470229
   )
   static int field4;
   @ObfuscatedName("ka")
   @ObfuscatedGetter(
      intValue = -1734004743
   )
   @Export("menuHeight")
   static int menuHeight;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   @Export("coord2")
   public final Coord coord2;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "Lhu;"
   )
   @Export("coord1")
   public final Coord coord1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -521086143
   )
   @Export("screenX")
   int screenX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1065362217
   )
   @Export("screenY")
   int screenY;

   @ObfuscatedSignature(
      signature = "(Lhu;Lhu;)V"
   )
   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.coord1 = var1;
      this.coord2 = var2;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "1990181988"
   )
   @Export("getElement")
   public abstract int getElement();

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)Laj;",
      garbageValue = "1159446036"
   )
   @Export("getLabel")
   abstract WorldMapLabel getLabel();

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      signature = "(B)I",
      garbageValue = "75"
   )
   @Export("getSubWidth")
   abstract int getSubWidth();

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-1558233611"
   )
   @Export("getSubHeight")
   abstract int getSubHeight();

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(IIB)Z",
      garbageValue = "-63"
   )
   @Export("fitsScreen")
   boolean fitsScreen(int x, int y) {
      return this.elementFitsScreen(x, y) ? true : this.labelFitsScreen(x, y);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      signature = "(I)Z",
      garbageValue = "1150380891"
   )
   @Export("hasValidElement")
   boolean hasValidElement() {
      return this.getElement() >= 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "484201257"
   )
   @Export("elementFitsScreen")
   boolean elementFitsScreen(int x, int y) {
      if (!this.hasValidElement()) {
         return false;
      } else {
         WorldMapElement var3 = ViewportMouse.getWorldMapElement(this.getElement());
         int var4 = this.getSubWidth();
         int var5 = this.getSubHeight();
         switch(var3.horizontalAlignment.value) {
         case 0:
            if (x >= this.screenX - var4 / 2 && x <= var4 / 2 + this.screenX) {
               break;
            }

            return false;
         case 1:
            if (x >= this.screenX && x < var4 + this.screenX) {
               break;
            }

            return false;
         case 2:
            if (x <= this.screenX - var4 || x > this.screenX) {
               return false;
            }
         }

         switch(var3.verticalAlignment.value) {
         case 0:
            if (y <= this.screenY - var5 || y > this.screenY) {
               return false;
            }
            break;
         case 1:
            if (y < this.screenY - var5 / 2 || y > var5 / 2 + this.screenY) {
               return false;
            }
            break;
         case 2:
            if (y < this.screenY || y >= var5 + this.screenY) {
               return false;
            }
         }

         return true;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(III)Z",
      garbageValue = "1201712205"
   )
   @Export("labelFitsScreen")
   boolean labelFitsScreen(int x, int y) {
      WorldMapLabel var3 = this.getLabel();
      return var3 == null ? false : (x >= this.screenX - var3.width / 2 && x <= var3.width / 2 + this.screenX ? y >= this.screenY && y <= var3.height + this.screenY : false);
   }

   @ObfuscatedName("es")
   @ObfuscatedSignature(
      signature = "(Lit;Ljava/lang/String;I)V",
      garbageValue = "-1018878027"
   )
   static void method625(Archive var0, String var1) {
      ArchiveLoader var2 = new ArchiveLoader(var0, var1);
      Client.archiveLoaders.add(var2);
      Client.field140 += var2.groupCount;
   }
}
