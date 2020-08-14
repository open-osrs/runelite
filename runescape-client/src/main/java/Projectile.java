import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("Projectile")
public final class Projectile extends Entity {
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1211843013
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 584817429
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1041388181
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1446127367
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 967638661
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -2073235503
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1099398643
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1884800007
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -305912625
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1437284949
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1247378157
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("y")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("c")
	@Export("x")
	double x;
	@ObfuscatedName("h")
	@Export("y")
	double y;
	@ObfuscatedName("k")
	@Export("z")
	double z;
	@ObfuscatedName("r")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("s")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("v")
	@Export("speed")
	double speed;
	@ObfuscatedName("d")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("e")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 2056427921
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -414343735
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 106305103
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1726511745
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
		int var12 = class4.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = NetSocket.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "129892196"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-44"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += (double)var1 * this.speedY;
		this.z += this.accelerationZ * 0.5D * (double)var1 * (double)var1 + (double)var1 * this.speedZ;
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Lef;",
		garbageValue = "1832696685"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class4.SpotAnimationDefinition_get(this.id);
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
		descriptor = "(I)V",
		garbageValue = "-40295508"
	)
	static void method2247() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	public static boolean method2249(int var0) {
		return (var0 >> 29 & 1) != 0;
	}
}
