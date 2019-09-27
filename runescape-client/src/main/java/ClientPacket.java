import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gy")
@Implements("ClientPacket")
public class ClientPacket implements class181 {
      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2208 = new ClientPacket(0, 4);
      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2185 = new ClientPacket(1, 6);
      @ObfuscatedName("v")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2285 = new ClientPacket(2, 8);
      @ObfuscatedName("u")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2187 = new ClientPacket(3, -1);
      @ObfuscatedName("r")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2188 = new ClientPacket(4, -1);
      @ObfuscatedName("p")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2189 = new ClientPacket(5, 8);
      @ObfuscatedName("q")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2190 = new ClientPacket(6, 7);
      @ObfuscatedName("m")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2191 = new ClientPacket(7, 9);
      @ObfuscatedName("y")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2238 = new ClientPacket(8, 4);
      @ObfuscatedName("i")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2248 = new ClientPacket(9, 2);
      @ObfuscatedName("c")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2194 = new ClientPacket(10, 8);
      @ObfuscatedName("b")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2195 = new ClientPacket(11, 11);
      @ObfuscatedName("o")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2196 = new ClientPacket(12, -1);
      @ObfuscatedName("a")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2229 = new ClientPacket(13, 0);
      @ObfuscatedName("e")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2198 = new ClientPacket(14, 8);
      @ObfuscatedName("w")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2186 = new ClientPacket(15, 1);
      @ObfuscatedName("t")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2200 = new ClientPacket(16, 8);
      @ObfuscatedName("g")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2201 = new ClientPacket(17, -1);
      @ObfuscatedName("x")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2240 = new ClientPacket(18, 7);
      @ObfuscatedName("h")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2203 = new ClientPacket(19, 8);
      @ObfuscatedName("s")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2204 = new ClientPacket(20, 8);
      @ObfuscatedName("f")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2233 = new ClientPacket(21, 3);
      @ObfuscatedName("j")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2215 = new ClientPacket(22, -1);
      @ObfuscatedName("d")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2207 = new ClientPacket(23, 0);
      @ObfuscatedName("l")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2192 = new ClientPacket(24, 7);
      @ObfuscatedName("k")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2209 = new ClientPacket(25, 4);
      @ObfuscatedName("ac")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2210 = new ClientPacket(26, 6);
      @ObfuscatedName("az")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2205 = new ClientPacket(27, 7);
      @ObfuscatedName("aw")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2212 = new ClientPacket(28, 2);
      @ObfuscatedName("aa")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2213 = new ClientPacket(29, 8);
      @ObfuscatedName("ap")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2259 = new ClientPacket(30, 8);
      @ObfuscatedName("ar")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2272 = new ClientPacket(31, 8);
      @ObfuscatedName("ab")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2216 = new ClientPacket(32, -1);
      @ObfuscatedName("ax")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2217 = new ClientPacket(33, 8);
      @ObfuscatedName("as")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2218 = new ClientPacket(34, 13);
      @ObfuscatedName("ao")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2219 = new ClientPacket(35, 3);
      @ObfuscatedName("al")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2220 = new ClientPacket(36, 2);
      @ObfuscatedName("ad")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2221 = new ClientPacket(37, 3);
      @ObfuscatedName("an")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2222 = new ClientPacket(38, 9);
      @ObfuscatedName("ai")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2202 = new ClientPacket(39, -1);
      @ObfuscatedName("ak")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2224 = new ClientPacket(40, -2);
      @ObfuscatedName("aq")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2225 = new ClientPacket(41, 0);
      @ObfuscatedName("am")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2226 = new ClientPacket(42, 7);
      @ObfuscatedName("ae")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2227 = new ClientPacket(43, 3);
      @ObfuscatedName("av")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2228 = new ClientPacket(44, 13);
      @ObfuscatedName("ah")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      static final ClientPacket field2184 = new ClientPacket(45, -1);
      @ObfuscatedName("ag")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2230 = new ClientPacket(46, 15);
      @ObfuscatedName("aj")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2282 = new ClientPacket(47, 8);
      @ObfuscatedName("ay")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2232 = new ClientPacket(48, -1);
      @ObfuscatedName("au")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2283 = new ClientPacket(49, 0);
      @ObfuscatedName("af")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2234 = new ClientPacket(50, 7);
      @ObfuscatedName("at")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2235 = new ClientPacket(51, 7);
      @ObfuscatedName("bx")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2214 = new ClientPacket(52, 3);
      @ObfuscatedName("bh")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2237 = new ClientPacket(53, -1);
      @ObfuscatedName("bd")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2245 = new ClientPacket(54, 2);
      @ObfuscatedName("bm")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2239 = new ClientPacket(55, 9);
      @ObfuscatedName("bv")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2268 = new ClientPacket(56, -1);
      @ObfuscatedName("bj")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2241 = new ClientPacket(57, 0);
      @ObfuscatedName("bs")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2242 = new ClientPacket(58, 3);
      @ObfuscatedName("bz")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2243 = new ClientPacket(59, 11);
      @ObfuscatedName("bc")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2244 = new ClientPacket(60, 8);
      @ObfuscatedName("bk")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2206 = new ClientPacket(61, 3);
      @ObfuscatedName("ba")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2246 = new ClientPacket(62, 14);
      @ObfuscatedName("bn")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2265 = new ClientPacket(63, 7);
      @ObfuscatedName("be")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2236 = new ClientPacket(64, 16);
      @ObfuscatedName("bu")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2249 = new ClientPacket(65, 8);
      @ObfuscatedName("bi")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2250 = new ClientPacket(66, 8);
      @ObfuscatedName("bb")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2254 = new ClientPacket(67, -1);
      @ObfuscatedName("bt")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2252 = new ClientPacket(68, 13);
      @ObfuscatedName("by")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2253 = new ClientPacket(69, 4);
      @ObfuscatedName("bq")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2255 = new ClientPacket(70, 8);
      @ObfuscatedName("bo")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2271 = new ClientPacket(71, 3);
      @ObfuscatedName("br")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2256 = new ClientPacket(72, 5);
      @ObfuscatedName("bl")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2257 = new ClientPacket(73, 8);
      @ObfuscatedName("bf")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      static final ClientPacket field2258 = new ClientPacket(74, 7);
      @ObfuscatedName("bg")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2199 = new ClientPacket(75, 10);
      @ObfuscatedName("bw")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2247 = new ClientPacket(76, 8);
      @ObfuscatedName("bp")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2260 = new ClientPacket(77, 9);
      @ObfuscatedName("cz")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2262 = new ClientPacket(78, 3);
      @ObfuscatedName("ck")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2263 = new ClientPacket(79, 3);
      @ObfuscatedName("cv")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2264 = new ClientPacket(80, -1);
      @ObfuscatedName("co")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2231 = new ClientPacket(81, 3);
      @ObfuscatedName("cs")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2197 = new ClientPacket(82, 15);
      @ObfuscatedName("cg")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      static final ClientPacket field2267 = new ClientPacket(83, 2);
      @ObfuscatedName("cn")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2279 = new ClientPacket(84, -1);
      @ObfuscatedName("cd")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2269 = new ClientPacket(85, 16);
      @ObfuscatedName("cy")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2270 = new ClientPacket(86, -2);
      @ObfuscatedName("cj")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2251 = new ClientPacket(87, 8);
      @ObfuscatedName("cb")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2211 = new ClientPacket(88, 8);
      @ObfuscatedName("cr")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2273 = new ClientPacket(89, 3);
      @ObfuscatedName("ct")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2274 = new ClientPacket(90, 3);
      @ObfuscatedName("ci")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2275 = new ClientPacket(91, -1);
      @ObfuscatedName("cu")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2276 = new ClientPacket(92, -1);
      @ObfuscatedName("ce")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2193 = new ClientPacket(93, -2);
      @ObfuscatedName("cc")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2278 = new ClientPacket(94, 16);
      @ObfuscatedName("cl")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2266 = new ClientPacket(95, 7);
      @ObfuscatedName("cw")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2280 = new ClientPacket(96, 3);
      @ObfuscatedName("cq")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2277 = new ClientPacket(97, 7);
      @ObfuscatedName("ca")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2281 = new ClientPacket(98, -1);
      @ObfuscatedName("cf")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2261 = new ClientPacket(99, 4);
      @ObfuscatedName("cx")
      @ObfuscatedSignature(
            signature = "Lgy;"
      )
      public static final ClientPacket field2284 = new ClientPacket(100, -1);
      // $FF: renamed from: id int
      @ObfuscatedName("cm")
      @ObfuscatedGetter(
            intValue = 1560897385
      )
      @Export("id")
      final int field_36;
      @ObfuscatedName("cp")
      @ObfuscatedGetter(
            intValue = 171085629
      )
      @Export("length")
      final int length;

      ClientPacket(int var1, int var2) {
            this.field_36 = var1;
            this.length = var2;
      }

      @ObfuscatedName("z")
      @ObfuscatedSignature(
            signature = "(I)V",
            garbageValue = "470229947"
      )
      static void method3575() {
            for(ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
                  if (var0.stream1 != null) {
                        WorldMapLabelSize.pcmStreamMixer.removeSubStream(var0.stream1);
                        var0.stream1 = null;
                  }

                  if (var0.stream2 != null) {
                        WorldMapLabelSize.pcmStreamMixer.removeSubStream(var0.stream2);
                        var0.stream2 = null;
                  }
            }

            ObjectSound.objectSounds.clear();
      }

      @ObfuscatedName("n")
      @ObfuscatedSignature(
            signature = "(ZZI)Llp;",
            garbageValue = "-1999354479"
      )
      static IndexedSprite method3572(boolean var0, boolean var1) {
            return var0 ? (var1 ? Login.field1163 : class42.options_buttons_2Sprite) : (var1 ? ClientPreferences.field1046 : class195.options_buttons_0Sprite);
      }

      @ObfuscatedName("h")
      @ObfuscatedSignature(
            signature = "(ILcu;ZI)I",
            garbageValue = "-2131546736"
      )
      static int method3573(int var0, Script var1, boolean var2) {
            Widget var3;
            if (var0 >= 2000) {
                  var0 -= 1000;
                  var3 = Canvas.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            } else {
                  var3 = var2 ? GrandExchangeOfferAgeComparator.field76 : KitDefinition.field3252;
            }

            if (var0 == ScriptOpcodes.CC_CALLONRESIZE) {
                  if (Interpreter.field1089 >= 10) {
                        throw new RuntimeException();
                  } else if (var3.onResize == null) {
                        return 0;
                  } else {
                        ScriptEvent var4 = new ScriptEvent();
                        var4.widget = var3;
                        var4.args = var3.onResize;
                        var4.field568 = Interpreter.field1089 + 1;
                        Client.scriptEvents.addFirst(var4);
                        return 1;
                  }
            } else {
                  return 2;
            }
      }

      @ObfuscatedName("fc")
      @ObfuscatedSignature(
            signature = "(III)V",
            garbageValue = "-1614691379"
      )
      @Export("playSoundJingle")
      static void playSoundJingle(int var0, int var1) {
            if (Client.field761 != 0 && var0 != -1) {
                  class83.method2064(ClanMate.archive11, var0, 0, Client.field761, false);
                  Client.field759 = true;
            }

      }
}
