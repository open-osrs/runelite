import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("GraphicsObject")
public final class GraphicsObject extends Entity {
      @ObfuscatedName("ec")
      @Export("secureRandom")
      static SecureRandom secureRandom;
      @ObfuscatedName("z")
      @ObfuscatedGetter(
            intValue = -725302413
      )
      @Export("height")
      int height;
      // $FF: renamed from: id int
      @ObfuscatedName("n")
      @ObfuscatedGetter(
            intValue = 781452541
      )
      @Export("id")
      int field_24;
      @ObfuscatedName("v")
      @ObfuscatedGetter(
            intValue = 34616617
      )
      @Export("cycleStart")
      int cycleStart;
      @ObfuscatedName("u")
      @ObfuscatedGetter(
            intValue = -1951259679
      )
      @Export("plane")
      int plane;
      // $FF: renamed from: x int
      @ObfuscatedName("r")
      @ObfuscatedGetter(
            intValue = 1240960337
      )
      @Export("x")
      int field_25;
      // $FF: renamed from: y int
      @ObfuscatedName("p")
      @ObfuscatedGetter(
            intValue = -1722241771
      )
      @Export("y")
      int field_26;
      @ObfuscatedName("q")
      @ObfuscatedSignature(
            signature = "Lix;"
      )
      @Export("sequenceDefinition")
      SequenceDefinition sequenceDefinition;
      @ObfuscatedName("m")
      @ObfuscatedGetter(
            intValue = 926579167
      )
      @Export("frame")
      int frame = 0;
      @ObfuscatedName("y")
      @ObfuscatedGetter(
            intValue = -1223841967
      )
      @Export("frameCycle")
      int frameCycle = 0;
      @ObfuscatedName("i")
      @Export("isFinished")
      boolean isFinished = false;

      GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
            this.field_24 = var1;
            this.plane = var2;
            this.field_25 = var3;
            this.field_26 = var4;
            this.height = var5;
            this.cycleStart = var7 + var6;
            int var8 = InterfaceParent.SpotAnimationDefinition_get(this.field_24).sequence;
            if (var8 != -1) {
                  this.isFinished = false;
                  this.sequenceDefinition = GrandExchangeOfferUnitPriceComparator.SequenceDefinition_get(var8);
            } else {
                  this.isFinished = true;
            }

      }

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(IB)V",
            garbageValue = "-72"
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

      @ObfuscatedName("y")
      @ObfuscatedSignature(
            signature = "(I)Ldh;",
            garbageValue = "-62237472"
      )
      @Export("getModel")
      protected final Model getModel() {
            SpotAnimationDefinition var1 = InterfaceParent.SpotAnimationDefinition_get(this.field_24);
            Model var2;
            if (!this.isFinished) {
                  var2 = var1.getModel(this.frame);
            } else {
                  var2 = var1.getModel(-1);
            }

            return var2 == null ? null : var2;
      }
}
