import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 612017877
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1252527971
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -861559657
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -178242535
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1274361179
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 632360777
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1209560849
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1759593837
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -212620571
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1789569559
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1450017667
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("w")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("g")
	@Export("x")
	double x;
	@ObfuscatedName("v")
	@Export("y")
	double y;
	@ObfuscatedName("s")
	@Export("z")
	double z;
	@ObfuscatedName("c")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("b")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("x")
	@Export("speed")
	double speed;
	@ObfuscatedName("p")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("z")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1966340063
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -618468267
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 999044951
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -987354937
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
		int var12 = class21.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = KitDefinition.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-631217793"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var7 * var7 + var5 * var5);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Lhl;",
		garbageValue = "126"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class21.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-39"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
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
}
