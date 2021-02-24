import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "Lkl;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("n")
   @Export("args")
   Object[] args;
   @ObfuscatedName("v")
   @Export("isMouseInputEvent")
   boolean isMouseInputEvent;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("widget")
   Widget widget;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1697635159
   )
   @Export("mouseX")
   int mouseX;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 734230281
   )
   @Export("mouseY")
   int mouseY;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 944694965
   )
   @Export("opIndex")
   int opIndex;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   @Export("dragTarget")
   Widget dragTarget;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -905189557
   )
   @Export("keyTyped")
   int keyTyped;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 220260505
   )
   @Export("keyPressed")
   int keyPressed;
   @ObfuscatedName("l")
   @Export("targetName")
   String targetName;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1071641047
   )
   int field593;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1196618585
   )
   @Export("type")
   int type = 76;

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;I)V",
      garbageValue = "807576822"
   )
   @Export("setArgs")
   public void setArgs(Object[] var1) {
      this.args = var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-67"
   )
   @Export("setType")
   public void setType(int var1) {
      this.type = var1;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public static void method1271() {
      class105.reflectionChecks = new IterableNodeDeque();
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1068960678"
   )
   public static void method1272() {
      VertexNormal.midiPcmStream.clear();
      class206.musicPlayerStatus = 1;
      class206.musicTrackArchive = null;
   }
}
