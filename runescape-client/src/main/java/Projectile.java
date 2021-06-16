import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -620929205
	)
	@Export("id")
	int id;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1503104185
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1281749377
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -856181149
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2061408833
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -722624469
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -578493745
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1349240519
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 383721093
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1902000949
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -770535721
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("b")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("i")
	@Export("x")
	double x;
	@ObfuscatedName("k")
	@Export("y")
	double y;
	@ObfuscatedName("g")
	@Export("z")
	double z;
	@ObfuscatedName("t")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("x")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("u")
	@Export("speed")
	double speed;
	@ObfuscatedName("q")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("s")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -9873959
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -909606039
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -2026775219
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -472667051
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = Tiles.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = WorldMapScaleHandler.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-4"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)Lgd;",
		garbageValue = "326918784"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Tiles.SpotAnimationDefinition_get(this.id); // L: 92
		Model var2 = var1.getModel(this.frame); // L: 93
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 95
			return var2; // L: 96
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1411274037"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += this.speedZ * (double)var1 + 0.5D * this.accelerationZ * (double)var1 * (double)var1; // L: 74
		this.speedZ += (double)var1 * this.accelerationZ; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			this.frameCycle += var1; // L: 79

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 80
							return; // L: 89
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 81
						++this.frame; // L: 82
					} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 83

					this.frame -= this.sequenceDefinition.frameCount; // L: 84
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 85

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-530547820"
	)
	public static void method2075() {
		ItemComposition.ItemDefinition_cached.clear(); // L: 555
		ItemComposition.ItemDefinition_cachedModels.clear(); // L: 556
		ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 557
	} // L: 558

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-114"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1388
			if (Client.gameState == 0) { // L: 1389
				class1.client.method672();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1390
				Client.loginState = 0; // L: 1391
				Client.field811 = 0; // L: 1392
				Client.field654 = 0; // L: 1393
				Client.timer.method5675(var0); // L: 1394
				if (var0 != 20) { // L: 1395
					class19.method281(false);
				}
			}

			if (var0 != 20 && var0 != 40 && DefaultsGroup.field3887 != null) { // L: 1397 1398
				DefaultsGroup.field3887.close(); // L: 1399
				DefaultsGroup.field3887 = null; // L: 1400
			}

			if (Client.gameState == 25) { // L: 1403
				Client.field678 = 0; // L: 1404
				Client.field618 = 0; // L: 1405
				Client.field789 = 1; // L: 1406
				Client.field742 = 0; // L: 1407
				Client.field677 = 1; // L: 1408
			}

			if (var0 != 5 && var0 != 10) { // L: 1410
				if (var0 == 20) { // L: 1413
					DesktopPlatformInfoProvider.method6109(JagexCache.archive10, ModeWhere.archive8, true, Client.gameState == 11 ? 4 : 0); // L: 1414
				} else if (var0 == 11) { // L: 1416
					DesktopPlatformInfoProvider.method6109(JagexCache.archive10, ModeWhere.archive8, false, 4); // L: 1417
				} else if (class377.clearLoginScreen) { // L: 1420
					Coord.titleboxSprite = null; // L: 1421
					class289.titlebuttonSprite = null; // L: 1422
					Login.runesSprite = null; // L: 1423
					class339.leftTitleSprite = null; // L: 1424
					class377.rightTitleSprite = null; // L: 1425
					Messages.logoSprite = null; // L: 1426
					GrandExchangeEvents.title_muteSprite = null; // L: 1427
					Login.options_buttons_0Sprite = null; // L: 1428
					WorldMapCacheName.options_buttons_2Sprite = null; // L: 1429
					Varcs.worldSelectBackSprites = null; // L: 1430
					class364.worldSelectFlagSprites = null; // L: 1431
					class10.worldSelectArrows = null; // L: 1432
					Huffman.worldSelectStars = null; // L: 1433
					class35.field244 = null; // L: 1434
					PendingSpawn.loginScreenRunesAnimation.method2296(); // L: 1435
					PcmPlayer.method856(2); // L: 1436
					class105.method2358(true); // L: 1437
					class377.clearLoginScreen = false; // L: 1438
				}
			} else {
				DesktopPlatformInfoProvider.method6109(JagexCache.archive10, ModeWhere.archive8, true, 0); // L: 1411
			}

			Client.gameState = var0; // L: 1440
		}
	} // L: 1441
}
