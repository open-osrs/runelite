import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	static Bounds field946;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 1774721187
	)
	static int field944;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 635126401
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1804600121
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -865645861
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 823151717
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1640532067
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1908333049
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1093018891
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 129177565
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1426433187
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1732852593
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -552309999
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("x")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("c")
	@Export("x")
	double x;
	@ObfuscatedName("j")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("s")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("b")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("w")
	@Export("speed")
	double speed;
	@ObfuscatedName("a")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("m")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 747032263
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1515393455
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1010884921
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 637494227
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
		int var12 = class6.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1216965669"
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
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Lhx;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class6.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
		this.z += (double)var1 * this.speedZ + (double)var1 * (double)var1 * 0.5D * this.accelerationZ; // L: 74
		this.speedZ += (double)var1 * this.accelerationZ; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 79
				this.frameCycle += var1; // L: 80

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 81
								return; // L: 98
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 82
							++this.frame; // L: 83
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 84

						this.frame -= this.sequenceDefinition.frameCount; // L: 85
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 86

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 91
				int var2 = this.sequenceDefinition.method3827(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	static final void method1957() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7361 7362 7368
			if (var0.hitpoints == -1) { // L: 7363
				var0.delay = 0; // L: 7364
				WorldMapRegion.method4795(var0); // L: 7365
			} else {
				var0.remove(); // L: 7367
			}
		}

	} // L: 7370
}
