import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("Projectile")
public final class Projectile extends Renderable
{
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1007905183
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1937509115
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1125805555
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1326748081
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2116079029
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2122039085
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1053007733
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 355829279
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -669638867
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 40350499
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1973654015
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("e")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("m")
	@Export("x")
	double x;
	@ObfuscatedName("c")
	@Export("y")
	double y;
	@ObfuscatedName("i")
	@Export("z")
	double z;
	@ObfuscatedName("f")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("a")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("b")
	@Export("speed")
	double speed;
	@ObfuscatedName("y")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("r")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1429674929
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1912315299
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -564817743
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 849010023
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
		int var12 = TileItem.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = ParamComposition.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "595136450"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-20"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + (double)var1 * this.speedZ;
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Leh;",
		garbageValue = "-1814248977"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = TileItem.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2; // L: 96
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "251926976"
	)
	public static byte[] method2171(CharSequence var0) {
		int var1 = var0.length(); // L: 61
		byte[] var2 = new byte[var1]; // L: 62

		for (int var3 = 0; var3 < var1; ++var3) { // L: 63
			char var4 = var0.charAt(var3); // L: 64
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 65
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 66
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 67
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 68
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 69
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 70
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 71
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 72
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 73
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 74
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118; // L: 75
			} else if (var4 == 8249) { // L: 76
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 77
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 78
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 79
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 80
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 81
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 82
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 83
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 84
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 85
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 86
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 87
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 88
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101; // L: 89
			} else if (var4 == 339) { // L: 90
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 91
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 92
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 93
			}
		}

		return var2; // L: 95
	}
}
