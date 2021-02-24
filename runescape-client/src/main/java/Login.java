import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cy")
@Implements("Login")
public class Login {
   @ObfuscatedName("v")
   @Export("clearLoginScreen")
   static boolean clearLoginScreen;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -798516213
   )
   @Export("xPadding")
   static int xPadding = 0;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("runesSprite")
   static IndexedSprite[] runesSprite;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("rightTitleSprite")
   static SpritePixels rightTitleSprite;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("logoSprite")
   static IndexedSprite logoSprite;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "[Lly;"
   )
   @Export("title_muteSprite")
   static IndexedSprite[] title_muteSprite;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("options_buttons_2Sprite")
   static IndexedSprite options_buttons_2Sprite;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -491759097
   )
   @Export("loginBoxX")
   static int loginBoxX;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1990930167
   )
   @Export("Login_loadingPercent")
   static int Login_loadingPercent;
   @ObfuscatedName("m")
   @Export("Login_loadingText")
   static String Login_loadingText;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1379115269
   )
   static int field1206;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1813136613
   )
   static int field1207;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1401481889
   )
   @Export("loginIndex")
   static int loginIndex;
   @ObfuscatedName("aa")
   @Export("Login_response0")
   static String Login_response0;
   @ObfuscatedName("as")
   @Export("Login_response1")
   static String Login_response1;
   @ObfuscatedName("aw")
   @Export("Login_response2")
   static String Login_response2;
   @ObfuscatedName("az")
   @Export("Login_response3")
   static String Login_response3;
   @ObfuscatedName("ah")
   @Export("Login_username")
   static String Login_username;
   @ObfuscatedName("ap")
   @Export("Login_password")
   static String Login_password;
   @ObfuscatedName("af")
   static boolean field1222;
   @ObfuscatedName("av")
   static boolean field1216;
   @ObfuscatedName("bn")
   static boolean field1217;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -557955143
   )
   @Export("currentLoginField")
   static int currentLoginField;
   @ObfuscatedName("bx")
   @Export("worldSelectOpen")
   static boolean worldSelectOpen;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 933074711
   )
   @Export("hoveredWorldIndex")
   static int hoveredWorldIndex;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 1816463307
   )
   @Export("worldSelectPage")
   static int worldSelectPage;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1081007071
   )
   @Export("worldSelectPagesCount")
   static int worldSelectPagesCount;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      longValue = -6454888937678848821L
   )
   static long field1213;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      longValue = 2692717295757623997L
   )
   static long field1226;
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "Liy;"
   )
   @Export("archive20")
   static Archive archive20;
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      descriptor = "Lkl;"
   )
   @Export("fontPlain12")
   static Font fontPlain12;

   static {
      loginBoxX = xPadding + 202;
      Login_loadingPercent = 10;
      Login_loadingText = "";
      field1206 = -1;
      field1207 = 1;
      loginIndex = 0;
      Login_response0 = "";
      Login_response1 = "";
      Login_response2 = "";
      Login_response3 = "";
      Login_username = "";
      Login_password = "";
      field1222 = false;
      field1216 = false;
      field1217 = true;
      currentLoginField = 0;
      worldSelectOpen = false;
      hoveredWorldIndex = -1;
      worldSelectPage = 0;
      worldSelectPagesCount = 0;
      new DecimalFormat("##0.00");
      new class171();
      field1213 = -1L;
      field1226 = -1L;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2056829974"
   )
   public static boolean method2244(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(ILcl;ZB)I",
      garbageValue = "23"
   )
   static int method2223(int var0, Script var1, boolean var2) {
      Widget var3 = class237.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MusicPatch.Widget_unpackTargetMask(class60.getWidgetFlags(var3));
         return 1;
      } else if (var0 != ScriptOpcodes.IF_GETOP) {
         if (var0 == ScriptOpcodes.IF_GETOPBASE) {
            if (var3.dataText == null) {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
            } else {
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         --var4;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
         } else {
            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
         }

         return 1;
      }
   }
}
