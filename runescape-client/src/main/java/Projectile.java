import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ba")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("fs")
	@ObfuscatedGetter(
		intValue = 1652766549
	)
	static int field955;
	@ObfuscatedName("ms")
	@ObfuscatedGetter(
		intValue = 1365886225
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 544019481
	)
	@Export("id")
	int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1296031991
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1696264285
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 576824563
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1778659705
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2037376117
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 939878615
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 597868345
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 813089219
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -77924159
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -228041705
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("u")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("h")
	@Export("x")
	double x;
	@ObfuscatedName("q")
	@Export("y")
	double y;
	@ObfuscatedName("x")
	@Export("z")
	double z;
	@ObfuscatedName("p")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("n")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("m")
	@Export("speed")
	double speed;
	@ObfuscatedName("d")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("j")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1470989415
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -130990231
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 493792113
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -155726325
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
		int var12 = Widget.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class78.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "940270805"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Lgf;",
		garbageValue = "39"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Widget.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1935695525"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX;
		this.y += this.speedY * (double)var1; // L: 73
		this.z += this.speedZ * (double)var1 + (double)var1 * this.accelerationZ * 0.5D * (double)var1; // L: 74
		this.speedZ += this.accelerationZ * (double)var1; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			if (!this.sequenceDefinition.method3600()) { // L: 79
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
				int var2 = this.sequenceDefinition.method3637(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Lbl;",
		garbageValue = "1045641298"
	)
	static Script method1969(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16)); // L: 52
		if (var2 != null) { // L: 53
			return var2; // L: 54
		} else {
			String var3 = String.valueOf(var0); // L: 56
			int var4 = class148.archive12.getGroupId(var3); // L: 57
			if (var4 == -1) { // L: 58
				return null; // L: 59
			} else {
				byte[] var5 = class148.archive12.takeFileFlat(var4); // L: 61
				if (var5 != null) { // L: 62
					if (var5.length <= 1) { // L: 63
						return null; // L: 64
					}

					var2 = ScriptFrame.newScript(var5); // L: 66
					if (var2 != null) { // L: 67
						Script.Script_cached.put(var2, (long)(var0 << 16)); // L: 68
						return var2; // L: 69
					}
				}

				return null; // L: 72
			}
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "(Lgm;IIII)V",
		garbageValue = "-1549271927"
	)
	static void method1958(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class424.clientPreferences.areaSoundEffectsVolume != 0) { // L: 3403
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3404
				ObjectComposition.method3508(var0.soundEffects[var1], var2, var3); // L: 3405
			}
		}
	} // L: 3406
}
