import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
@Implements("Projectile")
public final class Projectile extends Entity {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1675813545
	)
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1633530883
	)
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1241662831
	)
	int sourceX;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 674628417
	)
	int sourceY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1517344079
	)
	int sourceZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1565729659
	)
	int endHeight;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 287551571
	)
	int cycleStart;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -23705649
	)
	int cycleEnd;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1941838325
	)
	int slope;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1921562263
	)
	int startHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1380116723
	)
	int targetIndex;
	@ObfuscatedName("d")
	boolean isMoving;
	@ObfuscatedName("h")
	double x;
	@ObfuscatedName("a")
	double y;
	@ObfuscatedName("q")
	double z;
	@ObfuscatedName("c")
	double speedX;
	@ObfuscatedName("f")
	double speedY;
	@ObfuscatedName("y")
	double speed;
	@ObfuscatedName("v")
	double speedZ;
	@ObfuscatedName("j")
	double accelerationZ;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2137407611
	)
	int yaw;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2024563433
	)
	int pitch;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1681921945
	)
	int frame;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1329964451
	)
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
			this.sequenceDefinition = WorldMapRegion.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "81"
	)
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + this.speedZ * (double)var1; // L: 74
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ler;",
		garbageValue = "-2026237468"
	)
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

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "([Lhq;II)V",
		garbageValue = "-823007916"
	)
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 10302
			Widget var3 = var0[var2]; // L: 10303
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !GrandExchangeOfferUnitPriceComparator.isComponentHidden(var3))) { // L: 10304 10305 10306
				if (var3.type == 0) { // L: 10307
					if (!var3.isIf3 && GrandExchangeOfferUnitPriceComparator.isComponentHidden(var3) && var3 != TriBool.mousedOverWidgetIf1) { // L: 10308
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 10309
					if (var3.children != null) { // L: 10310
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 10311
					if (var4 != null) { // L: 10312
						class58.method913(var4.group);
					}
				}

				if (var3.type == 6) { // L: 10314
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 10315
						boolean var7 = MusicPatch.runCs1(var3); // L: 10316
						if (var7) { // L: 10318
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 10319
						}

						if (var5 != -1) { // L: 10320
							SequenceDefinition var6 = WorldMapRegion.SequenceDefinition_get(var5); // L: 10321

							for (var3.modelFrameCycle += Client.field737; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class52.invalidateWidget(var3)) { // L: 10322 10323 10330
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 10324
								++var3.modelFrame; // L: 10325
								if (var3.modelFrame >= var6.frameIds.length) { // L: 10326
									var3.modelFrame -= var6.frameCount; // L: 10327
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 10328
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field2633 != 0 && !var3.isIf3) { // L: 10334
						int var8 = var3.field2633 >> 16; // L: 10335
						var5 = var3.field2633 << 16 >> 16; // L: 10336
						var8 *= Client.field737; // L: 10337
						var5 *= Client.field737; // L: 10338
						var3.modelAngleX = var8 + var3.modelAngleX & 2047; // L: 10339
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 10340
						class52.invalidateWidget(var3); // L: 10341
					}
				}
			}
		}

	} // L: 10345
}
