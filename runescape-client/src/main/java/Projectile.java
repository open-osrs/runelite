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
		int var12 = AccessFile.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = UserComparator5.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1140642232"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lgo;",
		garbageValue = "202861607"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = AccessFile.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1621806567"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.method3690()) {
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
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.method3647();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
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
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1237382938"
	)
	public static boolean method2008() {
		return class260.musicPlayerStatus != 0 ? true : class260.midiPcmStream.isReady();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-674197725"
	)
	static int method2010(int var0, Script var1, boolean var2) {
		Widget var5;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var5 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var5 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
			if (var5.itemId != -1) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var5.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}
}
