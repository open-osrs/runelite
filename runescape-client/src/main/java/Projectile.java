import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 914973851
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1185495603
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1975154263
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1770224161
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1880458377
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 460279713
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1894077723
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1817230173
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1395984447
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -692803357
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 319116855
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("l")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("o")
	@Export("x")
	double x;
	@ObfuscatedName("c")
	@Export("y")
	double y;
	@ObfuscatedName("e")
	@Export("z")
	double z;
	@ObfuscatedName("g")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("a")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("k")
	@Export("speed")
	double speed;
	@ObfuscatedName("m")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 2013686209
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1708799041
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -774931897
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1812825413
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
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = VarcInt.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = LoginScreenAnimation.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1589443362"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 58
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

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgr;",
		garbageValue = "-76"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarcInt.SpotAnimationDefinition_get(this.id); // L: 92
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
		descriptor = "(II)V",
		garbageValue = "-602839745"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1; // L: 74
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lev;",
		garbageValue = "-1277280984"
	)
	public static HitSplatDefinition method1966(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0); // L: 46
		if (var1 != null) { // L: 47
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0); // L: 48
			var1 = new HitSplatDefinition(); // L: 49
			if (var2 != null) { // L: 50
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0); // L: 51
			return var1; // L: 52
		}
	}
}
