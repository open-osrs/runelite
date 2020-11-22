import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Projectile")
public final class Projectile extends Entity {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 127950911
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1863046985
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1665161409
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -893343909
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -263031347
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2028575857
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 982684035
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 628428817
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 941880901
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1476235573
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1149707689
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("o")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("n")
	@Export("x")
	double x;
	@ObfuscatedName("x")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("r")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("y")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("s")
	@Export("speed")
	double speed;
	@ObfuscatedName("j")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("w")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 424232085
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -833335819
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 795159959
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 529023201
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
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
		int var12 = HealthBarUpdate.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class105.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-968797731"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1771638026"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
		this.z += this.speedZ * (double)var1 + 0.5D * this.accelerationZ * (double)var1 * (double)var1; // L: 74
		this.speedZ += this.accelerationZ * (double)var1; // L: 75
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = HealthBarUpdate.SpotAnimationDefinition_get(this.id); // L: 92
		Model var2 = var1.getModel(this.frame); // L: 93
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 95
			return var2; // L: 96
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-809557598"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613642703"
	)
	public static void method2228() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 123
	} // L: 124

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-73"
	)
	@Export("playSoundJingle")
	static void playSoundJingle(int var0, int var1) {
		if (Client.musicVolume != 0 && var0 != -1) { // L: 3605
			Canvas.method952(AbstractByteArrayCopier.archive11, var0, 0, Client.musicVolume, false); // L: 3606
			Client.field916 = true; // L: 3607
		}

	} // L: 3609

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-206735455"
	)
	static void method2226() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) { // L: 4815
			ArchiveLoader.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false); // L: 4816
		}

	} // L: 4818

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "506267788"
	)
	static final void method2223(int var0, int var1, boolean var2) {
		if (!var2 || var0 != GrandExchangeEvent.field78 || AbstractWorldMapData.field198 != var1) { // L: 5569
			GrandExchangeEvent.field78 = var0; // L: 5572
			AbstractWorldMapData.field198 = var1; // L: 5573
			BuddyRankComparator.updateGameState(25); // L: 5574
			AbstractWorldMapData.drawLoadingMessage("Loading - please wait.", true); // L: 5575
			int var3 = FloorDecoration.baseX; // L: 5576
			int var4 = WorldMapData_0.baseY; // L: 5577
			FloorDecoration.baseX = (var0 - 6) * 8; // L: 5578
			WorldMapData_0.baseY = (var1 - 6) * 8; // L: 5579
			int var5 = FloorDecoration.baseX - var3; // L: 5580
			int var6 = WorldMapData_0.baseY - var4; // L: 5581
			var3 = FloorDecoration.baseX; // L: 5582
			var4 = WorldMapData_0.baseY; // L: 5583

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5584
				NPC var19 = Client.npcs[var7]; // L: 5585
				if (var19 != null) { // L: 5586
					for (var9 = 0; var9 < 10; ++var9) { // L: 5587
						var10000 = var19.pathX; // L: 5588
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5589
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5591
					var19.y -= var6 * 128; // L: 5592
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5595
				Player var22 = Client.players[var7]; // L: 5596
				if (var22 != null) { // L: 5597
					for (var9 = 0; var9 < 10; ++var9) { // L: 5598
						var10000 = var22.pathX; // L: 5599
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5600
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5602
					var22.y -= var6 * 128; // L: 5603
				}
			}

			byte var20 = 0; // L: 5606
			byte var8 = 104; // L: 5607
			byte var21 = 1; // L: 5608
			if (var5 < 0) { // L: 5609
				var20 = 103; // L: 5610
				var8 = -1; // L: 5611
				var21 = -1; // L: 5612
			}

			byte var10 = 0; // L: 5614
			byte var11 = 104; // L: 5615
			byte var12 = 1; // L: 5616
			if (var6 < 0) { // L: 5617
				var10 = 103; // L: 5618
				var11 = -1; // L: 5619
				var12 = -1; // L: 5620
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5622
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5623
					int var15 = var13 + var5; // L: 5624
					int var16 = var14 + var6; // L: 5625

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5626
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16]; // L: 5627
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5628
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5632 5633 5637
				var18.x -= var5; // L: 5634
				var18.y -= var6; // L: 5635
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5636
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5639
				Client.destinationX -= var5; // L: 5640
				Client.destinationY -= var6; // L: 5641
			}

			Client.soundEffectCount = 0; // L: 5643
			Client.isCameraLocked = false; // L: 5644
			ItemContainer.cameraX -= var5 << 7; // L: 5645
			WorldMapManager.cameraZ -= var6 << 7; // L: 5646
			TileItem.oculusOrbFocalPointX -= var5 << 7; // L: 5647
			Interpreter.oculusOrbFocalPointY -= var6 << 7; // L: 5648
			Client.field906 = -1; // L: 5649
			Client.graphicsObjects.clear(); // L: 5650
			Client.projectiles.clear(); // L: 5651

			for (var14 = 0; var14 < 4; ++var14) { // L: 5652
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5570 5653
}
