import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1989294347
	)
	@Export("id")
	int id;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 830473187
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 681655727
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1797150279
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1639037601
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -873076039
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 285476427
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1384507767
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 931208305
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2012617583
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -3097229
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("m")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("d")
	@Export("x")
	double x;
	@ObfuscatedName("c")
	@Export("y")
	double y;
	@ObfuscatedName("j")
	@Export("z")
	double z;
	@ObfuscatedName("r")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("q")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("t")
	@Export("speed")
	double speed;
	@ObfuscatedName("v")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 688098207
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 257882257
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1593867047
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1599773741
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0;
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
		int var12 = Varps.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class225.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "549276456"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX; // L: 58
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lgv;",
		garbageValue = "1835906978"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Varps.SpotAnimationDefinition_get(this.id); // L: 92
		Model var2 = var1.getModel(this.frame); // L: 93
		if (var2 == null) { // L: 94
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 95
			return var2; // L: 96
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "622513403"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ; // L: 74
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1389566626"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 23
		if (var4 == null) { // L: 24
			var4 = new ChatChannel(); // L: 25
			Messages.Messages_channels.put(var0, var4); // L: 26
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 28
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 29
		Messages.Messages_queue.add(var5); // L: 30
		Client.chatCycle = Client.cycleCntr; // L: 31
	} // L: 32

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "23539817"
	)
	static final void method1981(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null; // L: 132
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class69.addGameMessage(30, "", var1); // L: 134
	} // L: 136
}
