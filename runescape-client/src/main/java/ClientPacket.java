import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ClientPacket")
public class ClientPacket implements class190 {
	@ObfuscatedName("ph")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2238;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2237;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2313;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2234;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2329;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2236;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final ClientPacket field2307;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2288;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2239;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2330;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2324;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2242;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2243;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2244;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2245;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2246;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2247;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2248;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2249;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2250;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2251;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2252;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2284;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2254;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2274;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2256;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2257;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2258;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2335;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2260;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2261;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2262;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2263;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2264;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2265;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2290;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2267;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2268;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2269;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2270;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2271;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2272;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2298;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2282;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2275;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final ClientPacket field2295;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2277;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2240;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2279;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2280;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2281;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2315;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final ClientPacket field2283;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2255;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2285;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2286;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2325;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2331;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2289;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2334;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2291;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2292;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2293;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2294;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2253;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2296;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2297;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2276;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2312;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2300;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2301;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final ClientPacket field2302;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2303;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2304;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2306;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2241;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2318;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2308;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2309;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2310;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2311;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2323;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2322;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2314;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2299;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2316;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2317;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2266;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2319;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2320;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2321;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2233;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	static final ClientPacket field2231;
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2305;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2287;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2326;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2327;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2328;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2259;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2332;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2235;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2232;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	public static final ClientPacket field2333;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1312212621
	)
	@Export("id")
	final int id;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 848809965
	)
	@Export("length")
	final int length;

	static {
		field2238 = new ClientPacket(0, 16); // L: 5
		field2237 = new ClientPacket(1, -1); // L: 6
		field2313 = new ClientPacket(2, 8); // L: 7
		field2234 = new ClientPacket(3, -1); // L: 8
		field2329 = new ClientPacket(4, -1); // L: 9
		field2236 = new ClientPacket(5, 14); // L: 10
		field2307 = new ClientPacket(6, -1); // L: 11
		field2288 = new ClientPacket(7, 7); // L: 12
		field2239 = new ClientPacket(8, 3); // L: 13
		field2330 = new ClientPacket(9, 4); // L: 14
		field2324 = new ClientPacket(10, 3); // L: 15
		field2242 = new ClientPacket(11, 8); // L: 16
		field2243 = new ClientPacket(12, 8); // L: 17
		field2244 = new ClientPacket(13, 3); // L: 18
		field2245 = new ClientPacket(14, 3); // L: 19
		field2246 = new ClientPacket(15, 7); // L: 20
		field2247 = new ClientPacket(16, 0); // L: 21
		field2248 = new ClientPacket(17, 8); // L: 22
		field2249 = new ClientPacket(18, 7);
		field2250 = new ClientPacket(19, 8);
		field2251 = new ClientPacket(20, 8);
		field2252 = new ClientPacket(21, 8);
		field2284 = new ClientPacket(22, 2);
		field2254 = new ClientPacket(23, 3);
		field2274 = new ClientPacket(24, 8);
		field2256 = new ClientPacket(25, 8);
		field2257 = new ClientPacket(26, 7); // L: 31
		field2258 = new ClientPacket(27, 7); // L: 32
		field2335 = new ClientPacket(28, 13); // L: 33
		field2260 = new ClientPacket(29, -1); // L: 34
		field2261 = new ClientPacket(30, 13); // L: 35
		field2262 = new ClientPacket(31, 0); // L: 36
		field2263 = new ClientPacket(32, 8); // L: 37
		field2264 = new ClientPacket(33, 3); // L: 38
		field2265 = new ClientPacket(34, 7); // L: 39
		field2290 = new ClientPacket(35, 3); // L: 40
		field2267 = new ClientPacket(36, 9); // L: 41
		field2268 = new ClientPacket(37, 4); // L: 42
		field2269 = new ClientPacket(38, -1); // L: 43
		field2270 = new ClientPacket(39, -1); // L: 44
		field2271 = new ClientPacket(40, 0); // L: 45
		field2272 = new ClientPacket(41, 5); // L: 46
		field2298 = new ClientPacket(42, 8); // L: 47
		field2282 = new ClientPacket(43, 13); // L: 48
		field2275 = new ClientPacket(44, 9); // L: 49
		field2295 = new ClientPacket(45, 7); // L: 50
		field2277 = new ClientPacket(46, 8); // L: 51
		field2240 = new ClientPacket(47, -1); // L: 52
		field2279 = new ClientPacket(48, -1); // L: 53
		field2280 = new ClientPacket(49, 3); // L: 54
		field2281 = new ClientPacket(50, 3); // L: 55
		field2315 = new ClientPacket(51, 16); // L: 56
		field2283 = new ClientPacket(52, -1); // L: 57
		field2255 = new ClientPacket(53, -2); // L: 58
		field2285 = new ClientPacket(54, 8); // L: 59
		field2286 = new ClientPacket(55, 4); // L: 60
		field2325 = new ClientPacket(56, 3); // L: 61
		field2331 = new ClientPacket(57, -1); // L: 62
		field2289 = new ClientPacket(58, 8); // L: 63
		field2334 = new ClientPacket(59, -1); // L: 64
		field2291 = new ClientPacket(60, 8); // L: 65
		field2292 = new ClientPacket(61, 4); // L: 66
		field2293 = new ClientPacket(62, 15); // L: 67
		field2294 = new ClientPacket(63, 8); // L: 68
		field2253 = new ClientPacket(64, 6); // L: 69
		field2296 = new ClientPacket(65, 10); // L: 70
		field2297 = new ClientPacket(66, 8); // L: 71
		field2276 = new ClientPacket(67, 8); // L: 72
		field2312 = new ClientPacket(68, 1); // L: 73
		field2300 = new ClientPacket(69, 8); // L: 74
		field2301 = new ClientPacket(70, 7); // L: 75
		field2302 = new ClientPacket(71, -1); // L: 76
		field2303 = new ClientPacket(72, -1); // L: 77
		field2304 = new ClientPacket(73, 9); // L: 78
		field2306 = new ClientPacket(74, 7); // L: 79
		field2241 = new ClientPacket(75, -1); // L: 80
		field2318 = new ClientPacket(76, -1); // L: 81
		field2308 = new ClientPacket(77, 3); // L: 82
		field2309 = new ClientPacket(78, 9);
		field2310 = new ClientPacket(79, -2);
		field2311 = new ClientPacket(80, 3);
		field2323 = new ClientPacket(81, 3);
		field2322 = new ClientPacket(82, 6);
		field2314 = new ClientPacket(83, -1);
		field2299 = new ClientPacket(84, 15);
		field2316 = new ClientPacket(85, 2);
		field2317 = new ClientPacket(86, 2);
		field2266 = new ClientPacket(87, 8);
		field2319 = new ClientPacket(88, 0);
		field2320 = new ClientPacket(89, 0);
		field2321 = new ClientPacket(90, 4);
		field2233 = new ClientPacket(91, 2);
		field2231 = new ClientPacket(92, 2);
		field2305 = new ClientPacket(93, 7);
		field2287 = new ClientPacket(94, -1);
		field2326 = new ClientPacket(95, -2);
		field2327 = new ClientPacket(96, -1);
		field2328 = new ClientPacket(97, 11);
		field2259 = new ClientPacket(98, 7);
		field2332 = new ClientPacket(99, 11);
		field2235 = new ClientPacket(100, 3); // L: 105
		field2232 = new ClientPacket(101, 16); // L: 106
		field2333 = new ClientPacket(102, -1); // L: 107
	}

	ClientPacket(int var1, int var2) {
		this.id = var1;
		this.length = var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljo;",
		garbageValue = "29667"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructDefinition StructDefinition_getStructDefinition(int var0) {
		StructDefinition var1 = (StructDefinition)StructDefinition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructDefinition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructDefinition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "711631648"
	)
	static void method3745() {
		try {
			File var0 = new File(class52.userHomeDirectory, "random.dat"); // L: 281
			int var2;
			if (var0.exists()) { // L: 282
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 283
			} else {
				label38:
				for (int var1 = 0; var1 < Client.field957.length; ++var1) { // L: 286
					for (var2 = 0; var2 < GrandExchangeEvents.field68.length; ++var2) { // L: 287
						File var3 = new File(GrandExchangeEvents.field68[var2] + Client.field957[var1] + File.separatorChar + "random.dat"); // L: 288
						if (var3.exists()) { // L: 289
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0); // L: 290
							break label38; // L: 291
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 296
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw"); // L: 297
				var2 = var4.read(); // L: 298
				var4.seek(0L); // L: 299
				var4.write(var2); // L: 300
				var4.seek(0L); // L: 301
				var4.close(); // L: 302
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0); // L: 303
			}
		} catch (IOException var5) { // L: 306
		}

	} // L: 307

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)Lco;",
		garbageValue = "-1523199610"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 83
		Buffer var2 = new Buffer(var0); // L: 84
		var2.offset = var2.array.length - 2; // L: 85
		int var3 = var2.readUnsignedShort(); // L: 86
		int var4 = var2.array.length - 2 - var3 - 12; // L: 87
		var2.offset = var4; // L: 88
		int var5 = var2.readInt(); // L: 89
		var1.localIntCount = var2.readUnsignedShort(); // L: 90
		var1.localStringCount = var2.readUnsignedShort(); // L: 91
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 92
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 93
		int var6 = var2.readUnsignedByte(); // L: 94
		int var7;
		int var8;
		if (var6 > 0) { // L: 95
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 96

			for (var7 = 0; var7 < var6; ++var7) { // L: 97
				var8 = var2.readUnsignedShort(); // L: 98
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapData_0.method266(var8) : 1); // L: 99
				var1.switches[var7] = var9; // L: 100

				while (var8-- > 0) { // L: 101
					int var10 = var2.readInt(); // L: 102
					int var11 = var2.readInt(); // L: 103
					var9.put(new IntegerNode(var11), (long)var10); // L: 104
				}
			}
		}

		var2.offset = 0; // L: 108
		var2.readStringCp1252NullTerminatedOrNull(); // L: 109
		var1.opcodes = new int[var5]; // L: 110
		var1.intOperands = new int[var5]; // L: 111
		var1.stringOperands = new String[var5]; // L: 112

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 113 114 119
			var8 = var2.readUnsignedShort(); // L: 115
			if (var8 == 3) { // L: 116
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) { // L: 117
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 118
			}
		}

		return var1; // L: 121
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1900705803"
	)
	static final void method3744() {
		Client.field875 = Client.cycleCntr; // L: 11489
		ClanChat_inClanChat = true; // L: 11490
	} // L: 11491
}
