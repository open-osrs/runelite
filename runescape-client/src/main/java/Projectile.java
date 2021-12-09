import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1101813917
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -140525003
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 636428157
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1985391403
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -376580603
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1994096823
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1387673175
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 853821675
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 947987743
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -175033475
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1305386011
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("v")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("d")
	@Export("x")
	double x;
	@ObfuscatedName("h")
	@Export("y")
	double y;
	@ObfuscatedName("g")
	@Export("z")
	double z;
	@ObfuscatedName("e")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("a")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("u")
	@Export("speed")
	double speed;
	@ObfuscatedName("k")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("f")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -38655435
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1967440557
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lgn;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1747879531
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -43602097
	)
	int field904;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0; // L: 32
		this.field904 = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4; // L: 39
		this.sourceZ = var5;
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = AccessFile.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = UserComparator5.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1140642232"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 58
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgo;",
		garbageValue = "202861607"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = AccessFile.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1621806567"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1; // L: 74
		this.speedZ += (double)var1 * this.accelerationZ; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			if (!this.sequenceDefinition.method3690()) { // L: 79
				this.field904 += var1; // L: 80

				while (true) {
					do {
						do {
							if (this.field904 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 81
								return; // L: 98
							}

							this.field904 -= this.sequenceDefinition.frameLengths[this.frame]; // L: 82
							++this.frame; // L: 83
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 84

						this.frame -= this.sequenceDefinition.frameCount; // L: 85
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 86

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 91
				int var2 = this.sequenceDefinition.method3647(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "60"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6; // L: 18
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7; // L: 21

			for (int var8 = var2; var8 < var3; ++var8) { // L: 22
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 23
					String var9 = var0[var8]; // L: 24
					var0[var8] = var0[var5]; // L: 25
					var0[var5] = var9; // L: 26
					short var10 = var1[var8]; // L: 27
					var1[var8] = var1[var5]; // L: 28
					var1[var5++] = var10; // L: 29
				}
			}

			var0[var3] = var0[var5]; // L: 33
			var0[var5] = var6; // L: 34
			var1[var3] = var1[var5]; // L: 35
			var1[var5] = var7; // L: 36
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 37
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 38
		}

	} // L: 40

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1237382938"
	)
	public static boolean method2008() {
		return class260.musicPlayerStatus != 0 ? true : class260.midiPcmStream.isReady(); // L: 62 63
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-674197725"
	)
	static int method2010(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1362
			var5 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1363
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.itemId; // L: 1364
			return 1; // L: 1365
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1367
			var5 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 1368
			if (var5.itemId != -1) { // L: 1369
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1370
			}

			return 1; // L: 1371
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1373
			int var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 1374
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3); // L: 1375
			if (var4 != null) { // L: 1376
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 1377
			}

			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1380
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1381
			return 1; // L: 1382
		} else {
			return 2; // L: 1384
		}
	}
}
