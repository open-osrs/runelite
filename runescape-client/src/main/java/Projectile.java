import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1111424395
	)
	@Export("id")
	int id;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1253498993
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 255024795
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1599918591
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1504804357
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 991764239
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -367161897
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -915919331
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1457010005
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 754451797
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1233798491
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("p")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("h")
	@Export("x")
	double x;
	@ObfuscatedName("k")
	@Export("y")
	double y;
	@ObfuscatedName("a")
	@Export("z")
	double z;
	@ObfuscatedName("q")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("u")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("e")
	@Export("speed")
	double speed;
	@ObfuscatedName("c")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("i")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 124208403
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1460402629
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 25550675
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1297468435
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = PcmPlayer.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = World.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1925687009"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Lgl;",
		garbageValue = "1291603774"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = PcmPlayer.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-893243986"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljy;I)V",
		garbageValue = "-1667200203"
	)
	public static void method1702(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lfy;I)V",
		garbageValue = "-1319516605"
	)
	static final void method1700(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var10 = new Buffer(var0);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					class125.loadTerrain(var10, var7, var8 + var1, var9 + var2, var3, var4, 0);
				}
			}
		}

	}
}
