import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("ServerPacket")
public class ServerPacket {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2370;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2351;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2431;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2353;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2354;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2355;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2356;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2357;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2358;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2359;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2432;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2426;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2362;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2363;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2422;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2380;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2366;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2364;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2368;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2369;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2352;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2433;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2367;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2373;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2374;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2428;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2376;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2377;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2378;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2379;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2393;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2392;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2446;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2383;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2384;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2385;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2361;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2387;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2409;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2382;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2413;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2391;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2375;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2372;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2388;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2436;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2396;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2390;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2398;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2399;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2400;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2401;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2402;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2403;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2394;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2405;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2406;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2407;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2408;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2448;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2410;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2411;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2412;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2381;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2414;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2415;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2371;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2417;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2418;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2419;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2395;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2421;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2386;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2423;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2424;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2425;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2416;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2427;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2404;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2350;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2365;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2434;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2430;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2360;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2397;
	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2435;
	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2429;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2437;
	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2438;
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2439;
	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2389;
	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2441;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2442;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2443;
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2444;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2445;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	public static final ServerPacket field2440;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -634167591
	)
	@Export("id")
	public final int id;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -631403881
	)
	@Export("length")
	public final int length;

	static {
		field2370 = new ServerPacket(0, 14); // L: 5
		field2351 = new ServerPacket(1, 0); // L: 6
		field2431 = new ServerPacket(2, -2); // L: 7
		field2353 = new ServerPacket(3, 2); // L: 8
		field2354 = new ServerPacket(4, -2); // L: 9
		field2355 = new ServerPacket(5, 3);
		field2356 = new ServerPacket(6, 6); // L: 11
		field2357 = new ServerPacket(7, 0); // L: 12
		field2358 = new ServerPacket(8, 1); // L: 13
		field2359 = new ServerPacket(9, 2); // L: 14
		field2432 = new ServerPacket(10, 2); // L: 15
		field2426 = new ServerPacket(11, -2);
		field2362 = new ServerPacket(12, -2); // L: 17
		field2363 = new ServerPacket(13, 0); // L: 18
		field2422 = new ServerPacket(14, 1); // L: 19
		field2380 = new ServerPacket(15, -2); // L: 20
		field2366 = new ServerPacket(16, -2); // L: 21
		field2364 = new ServerPacket(17, 8); // L: 22
		field2368 = new ServerPacket(18, -2); // L: 23
		field2369 = new ServerPacket(19, 1); // L: 24
		field2352 = new ServerPacket(20, 6); // L: 25
		field2433 = new ServerPacket(21, 4); // L: 26
		field2367 = new ServerPacket(22, 0); // L: 27
		field2373 = new ServerPacket(23, 7); // L: 28
		field2374 = new ServerPacket(24, 1); // L: 29
		field2428 = new ServerPacket(25, 5); // L: 30
		field2376 = new ServerPacket(26, -2); // L: 31
		field2377 = new ServerPacket(27, -2); // L: 32
		field2378 = new ServerPacket(28, 20); // L: 33
		field2379 = new ServerPacket(29, 6); // L: 34
		field2393 = new ServerPacket(30, -1); // L: 35
		field2392 = new ServerPacket(31, 6); // L: 36
		field2446 = new ServerPacket(32, 2); // L: 37
		field2383 = new ServerPacket(33, 1); // L: 38
		field2384 = new ServerPacket(34, 6); // L: 39
		field2385 = new ServerPacket(35, -1); // L: 40
		field2361 = new ServerPacket(36, -2); // L: 41
		field2387 = new ServerPacket(37, 8); // L: 42
		field2409 = new ServerPacket(38, 6); // L: 43
		field2382 = new ServerPacket(39, -1); // L: 44
		field2413 = new ServerPacket(40, 8); // L: 45
		field2391 = new ServerPacket(41, 4); // L: 46
		field2375 = new ServerPacket(42, 6); // L: 47
		field2372 = new ServerPacket(43, 4); // L: 48
		field2388 = new ServerPacket(44, 2); // L: 49
		field2436 = new ServerPacket(45, 4); // L: 50
		field2396 = new ServerPacket(46, 4); // L: 51
		field2390 = new ServerPacket(47, 12); // L: 52
		field2398 = new ServerPacket(48, -1); // L: 53
		field2399 = new ServerPacket(49, 2); // L: 54
		field2400 = new ServerPacket(50, 6); // L: 55
		field2401 = new ServerPacket(51, 0); // L: 56
		field2402 = new ServerPacket(52, 28); // L: 57
		field2403 = new ServerPacket(53, 10); // L: 58
		field2394 = new ServerPacket(54, 6); // L: 59
		field2405 = new ServerPacket(55, 5); // L: 60
		field2406 = new ServerPacket(56, -2); // L: 61
		field2407 = new ServerPacket(57, 2); // L: 62
		field2408 = new ServerPacket(58, -2); // L: 63
		field2448 = new ServerPacket(59, 7); // L: 64
		field2410 = new ServerPacket(60, 0); // L: 65
		field2411 = new ServerPacket(61, 3); // L: 66
		field2412 = new ServerPacket(62, 4); // L: 67
		field2381 = new ServerPacket(63, -2); // L: 68
		field2414 = new ServerPacket(64, 2); // L: 69
		field2415 = new ServerPacket(65, 6); // L: 70
		field2371 = new ServerPacket(66, -1); // L: 71
		field2417 = new ServerPacket(67, 6); // L: 72
		field2418 = new ServerPacket(68, -2); // L: 73
		field2419 = new ServerPacket(69, 0); // L: 74
		field2395 = new ServerPacket(70, 10); // L: 75
		field2421 = new ServerPacket(71, -2); // L: 76
		field2386 = new ServerPacket(72, 4); // L: 77
		field2423 = new ServerPacket(73, 8); // L: 78
		field2424 = new ServerPacket(74, -2); // L: 79
		field2425 = new ServerPacket(75, 5); // L: 80
		field2416 = new ServerPacket(76, -2); // L: 81
		field2427 = new ServerPacket(77, 15); // L: 82
		field2404 = new ServerPacket(78, 5); // L: 83
		field2350 = new ServerPacket(79, 2); // L: 84
		field2365 = new ServerPacket(80, 1); // L: 85
		field2434 = new ServerPacket(81, -1); // L: 86
		field2430 = new ServerPacket(82, 5); // L: 87
		field2360 = new ServerPacket(83, 2); // L: 88
		field2397 = new ServerPacket(84, -2); // L: 89
		field2435 = new ServerPacket(85, -2); // L: 90
		field2429 = new ServerPacket(86, -2); // L: 91
		field2437 = new ServerPacket(87, -2); // L: 92
		field2438 = new ServerPacket(88, -1); // L: 93
		field2439 = new ServerPacket(89, -1); // L: 94
		field2389 = new ServerPacket(90, -1); // L: 95
		field2441 = new ServerPacket(91, 0); // L: 96
		field2442 = new ServerPacket(92, 0); // L: 97
		field2443 = new ServerPacket(93, -2); // L: 98
		field2444 = new ServerPacket(94, -2); // L: 99
		field2445 = new ServerPacket(95, -2); // L: 100
		field2440 = new ServerPacket(96, -2); // L: 101
	}

	ServerPacket(int var1, int var2) {
		this.id = var1; // L: 110
		this.length = var2; // L: 111
	} // L: 112

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1347419990"
	)
	static final boolean method3902(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 16
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;IIB)Lli;",
		garbageValue = "37"
	)
	public static AbstractSocket method3901(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2); // L: 10
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1900201533"
	)
	static final void method3903(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0; // L: 4504
		boolean var4 = false; // L: 4505
		int var5 = -1; // L: 4506
		int var6 = -1; // L: 4507
		int var7 = Players.Players_count; // L: 4508
		int[] var8 = Players.Players_indices; // L: 4509

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 4510
			Object var20;
			if (var9 < var7) { // L: 4512
				var20 = Client.players[var8[var9]]; // L: 4513
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 4514
					var4 = true; // L: 4515
					var5 = var9; // L: 4516
					continue;
				}

				if (var20 == Varcs.localPlayer) { // L: 4519
					var6 = var9; // L: 4520
					continue; // L: 4521
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 4524
			}

			class311.drawActor2d((Actor)var20, var9, var0, var1, var2, var3); // L: 4525
		}

		if (Client.renderSelf && var6 != -1) { // L: 4527
			class311.drawActor2d(Varcs.localPlayer, var6, var0, var1, var2, var3); // L: 4528
		}

		if (var4) { // L: 4530
			class311.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 4531
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) { // L: 4533
			int var10 = Client.overheadTextXs[var9]; // L: 4534
			int var11 = Client.overheadTextYs[var9]; // L: 4535
			int var12 = Client.overheadTextXOffsets[var9]; // L: 4536
			int var13 = Client.overheadTextAscents[var9]; // L: 4537
			boolean var14 = true; // L: 4538

			while (var14) {
				var14 = false; // L: 4540

				for (int var19 = 0; var19 < var9; ++var19) { // L: 4541
					if (var11 + 2 > Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] && var11 - var13 < Client.overheadTextYs[var19] + 2 && var10 - var12 < Client.overheadTextXs[var19] + Client.overheadTextXOffsets[var19] && var10 + var12 > Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19] && Client.overheadTextYs[var19] - Client.overheadTextAscents[var19] < var11) { // L: 4542 4543
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]; // L: 4544
						var14 = true; // L: 4545
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9]; // L: 4550
			Client.viewportTempY = Client.overheadTextYs[var9] = var11; // L: 4551
			String var15 = Client.overheadText[var9]; // L: 4552
			if (Client.chatEffects == 0) { // L: 4553
				int var16 = 16776960; // L: 4554
				if (Client.overheadTextColors[var9] < 6) { // L: 4555
					var16 = Client.field821[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) { // L: 4556
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) { // L: 4557
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) { // L: 4558
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) { // L: 4559
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4560
					if (var17 < 50) { // L: 4561
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 4562
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4563
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) { // L: 4565
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4566
					if (var17 < 50) { // L: 4567
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 4568
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 4569
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) { // L: 4571
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4572
					if (var17 < 50) { // L: 4573
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 4574
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 4575
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				if (Client.overheadTextEffects[var9] == 0) { // L: 4577
					class368.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) { // L: 4578
					class368.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) { // L: 4579
					class368.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) { // L: 4580
					class368.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) { // L: 4581
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class368.fontBold12.stringWidth(var15) + 100) / 150; // L: 4582
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 4583
					class368.fontBold12.draw(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0); // L: 4584
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4585
				}

				if (Client.overheadTextEffects[var9] == 5) { // L: 4587
					var17 = 150 - Client.overheadTextCyclesRemaining[var9]; // L: 4588
					int var18 = 0; // L: 4589
					if (var17 < 25) { // L: 4590
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 4591
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class368.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 4592
					class368.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0); // L: 4593
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 4594
				}
			} else {
				class368.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 4598
			}
		}

	} // L: 4601
}
