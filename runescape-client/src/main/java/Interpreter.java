import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Interpreter")
public class Interpreter {
   @ObfuscatedName("y")
   @Export("Interpreter_intLocals")
   static int[] Interpreter_intLocals;
   @ObfuscatedName("z")
   @Export("Interpreter_arrayLengths")
   static int[] Interpreter_arrayLengths = new int[5];
   @ObfuscatedName("e")
   @Export("Interpreter_arrays")
   static int[][] Interpreter_arrays = new int[5][5000];
   @ObfuscatedName("q")
   @Export("Interpreter_intStack")
   static int[] Interpreter_intStack = new int[1000];
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1775407691
   )
   @Export("Interpreter_intStackSize")
   static int Interpreter_intStackSize;
   @ObfuscatedName("s")
   @Export("Interpreter_stringStack")
   static String[] Interpreter_stringStack = new String[1000];
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1832147507
   )
   @Export("Interpreter_stringStackSize")
   static int Interpreter_stringStackSize;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1349197587
   )
   @Export("Interpreter_frameDepth")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lbz;"
   )
   @Export("Interpreter_frames")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lhz;"
   )
   static Widget field1117;
   @ObfuscatedName("x")
   @Export("Interpreter_calendar")
   static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();
   @ObfuscatedName("f")
   @Export("Interpreter_MONTHS")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Lav;"
   )
   @Export("worldMapEvent")
   static WorldMapEvent worldMapEvent;
   @ObfuscatedName("u")
   static boolean field1120 = false;
   @ObfuscatedName("t")
   static boolean field1122 = false;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 365610695
   )
   static int field1123 = 0;
   @ObfuscatedName("j")
   static final double field1124 = Math.log(2.0D);
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      intValue = 847561081
   )
   static int field1116;
   @ObfuscatedName("gk")
   @Export("regionMapArchives")
   static byte[][] regionMapArchives;

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1493110038"
   )
   @Export("hslToRgb")
   static final int hslToRgb(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
      return var3;
   }
}
