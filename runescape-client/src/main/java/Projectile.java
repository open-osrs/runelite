import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = -137640895
	)
	static int field923;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 371400441
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1544589667
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1776950519
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -853682291
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1068225469
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -500238855
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 457578437
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1625899633
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1339845409
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 705683361
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2077250747
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("y")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("v")
	@Export("x")
	double x;
	@ObfuscatedName("f")
	@Export("y")
	double y;
	@ObfuscatedName("s")
	@Export("z")
	double z;
	@ObfuscatedName("h")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("d")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("q")
	@Export("speed")
	double speed;
	@ObfuscatedName("j")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1707129837
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1652805209
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 361188885
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 366386853
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
		int var12 = TaskHandler.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class17.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2137080708"
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
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lhg;",
		garbageValue = "18"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = TaskHandler.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1930137131"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += this.speedZ * (double)var1 + (double)var1 * (double)var1 * this.accelerationZ * 0.5D;
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
