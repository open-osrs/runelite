import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iu")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3159(0, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3146(1, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3164(2, 0),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3148(3, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3162(9, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3150(4, 1),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3169(5, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3152(6, 1),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3153(7, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3154(8, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3149(12, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3156(13, 2),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3147(14, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3158(15, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3155(16, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3160(17, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3161(18, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3166(19, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3163(20, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3145(21, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3165(10, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3151(11, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field3167(22, 3);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1560350533
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 38
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "-1036423743"
	)
	static int method4784(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) { // L: 3519
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3520
			Client.field820 = (short)WorldMapManager.method3438(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]); // L: 3521
			if (Client.field820 <= 0) { // L: 3522
				Client.field820 = 256;
			}

			Client.field872 = (short)WorldMapManager.method3438(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]); // L: 3523
			if (Client.field872 <= 0) { // L: 3524
				Client.field872 = 256;
			}

			return 1; // L: 3525
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) { // L: 3527
			WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3528
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3529
			if (Client.zoomHeight <= 0) { // L: 3530
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3531
			if (Client.zoomWidth <= 0) { // L: 3532
				Client.zoomWidth = 320;
			}

			return 1; // L: 3533
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) { // L: 3535
			WorldMapCacheName.Interpreter_intStackSize -= 4; // L: 3536
			Client.field875 = (short)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3537
			if (Client.field875 <= 0) { // L: 3538
				Client.field875 = 1;
			}

			Client.field738 = (short)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3539
			if (Client.field738 <= 0) { // L: 3540
				Client.field738 = 32767;
			} else if (Client.field738 < Client.field875) { // L: 3541
				Client.field738 = Client.field875;
			}

			Client.field877 = (short)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 3542
			if (Client.field877 <= 0) { // L: 3543
				Client.field877 = 1;
			}

			Client.field878 = (short)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3]; // L: 3544
			if (Client.field878 <= 0) { // L: 3545
				Client.field878 = 32767;
			} else if (Client.field878 < Client.field877) { // L: 3546
				Client.field878 = Client.field877;
			}

			return 1; // L: 3547
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) { // L: 3549
			if (Client.viewportWidget != null) { // L: 3550
				VarbitComposition.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false); // L: 3551
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.viewportWidth; // L: 3552
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.viewportHeight; // L: 3553
			} else {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3556
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3557
			}

			return 1; // L: 3559
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) { // L: 3561
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.zoomHeight; // L: 3562
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.zoomWidth; // L: 3563
			return 1; // L: 3564
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) { // L: 3566
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Interpreter.method1808(Client.field820); // L: 3567
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Interpreter.method1808(Client.field872); // L: 3568
			return 1; // L: 3569
		} else if (var0 == 6220) { // L: 3571
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3572
			return 1; // L: 3573
		} else if (var0 == 6221) { // L: 3575
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3576
			return 1; // L: 3577
		} else if (var0 == 6222) { // L: 3579
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = GameEngine.canvasWidth; // L: 3580
			return 1; // L: 3581
		} else if (var0 == 6223) { // L: 3583
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = HealthBarDefinition.canvasHeight; // L: 3584
			return 1; // L: 3585
		} else {
			return 2; // L: 3587
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILia;ZB)V",
		garbageValue = "50"
	)
	static void method4776(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var0); // L: 4336
		int var4 = class35.localPlayer.plane; // L: 4337
		int var5 = (class35.localPlayer.x >> 7) + JagexCache.baseX; // L: 4338
		int var6 = (class35.localPlayer.y >> 7) + Messages.baseY; // L: 4339
		Coord var7 = new Coord(var4, var5, var6); // L: 4340
		GrandExchangeOfferAgeComparator.getWorldMap().method5967(var3, var7, var1, var2); // L: 4341
	} // L: 4342
}
