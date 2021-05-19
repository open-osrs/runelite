import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static Widget field1039;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -21466483
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1714458595
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1769020129
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1326029017
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1321727169
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1233167489
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1994273251
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -818433303
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -502302855
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1531548715
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 274415859
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("x")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("k")
	@Export("x")
	double x;
	@ObfuscatedName("r")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("a")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("e")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("d")
	@Export("speed")
	double speed;
	@ObfuscatedName("u")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("m")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -631589541
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2003697543
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1278263155
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2141182287
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
		int var12 = Friend.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = Player.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-228325121"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Friend.SpotAnimationDefinition_get(this.id); // L: 92
		Model var2 = var1.getModel(this.frame); // L: 93
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 95
			return var2; // L: 96
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "982624616"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + (double)var1 * this.speedZ; // L: 74
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7028"
	)
	static void method1996() {
		Players.Players_count = 0; // L: 648

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 649
			Players.field1346[var0] = null; // L: 650
			Players.field1345[var0] = 1; // L: 651
		}

	} // L: 653
}
