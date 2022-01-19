import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -920273095
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -797221037
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -378004067
	)
	@Export("y")
	int y;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1848624375
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1728936343
	)
	int field1120;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 467296973
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -913877769
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 383490447
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -15560867
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1191511995
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1495792429
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 731481149
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1761005899
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 80446087
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("at")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ai")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aq")
	boolean field1114;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1997962917
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -662438945
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 106086783
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ad")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bp")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bd")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("ba")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bq")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -962879023
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bm")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1964951137
	)
	int field1122;
	@ObfuscatedName("bl")
	boolean field1118;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1411460693
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1470905675
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 892078037
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1419164143
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 126354783
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1624543435
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -538098431
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -524732497
	)
	int field1126;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1337511095
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2016638493
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -921802207
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1121204749
	)
	int field1130;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -2034554825
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -873586319
	)
	int field1132;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1359620153
	)
	int field1133;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 415157759
	)
	int field1134;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 288830733
	)
	int field1135;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -2010992435
	)
	int field1136;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1055433063
	)
	int field1157;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -473786329
	)
	int field1138;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 987624827
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 384336211
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -529478277
	)
	int field1141;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1020348289
	)
	int field1140;
	@ObfuscatedName("cv")
	byte field1143;
	@ObfuscatedName("co")
	byte field1144;
	@ObfuscatedName("cc")
	byte field1095;
	@ObfuscatedName("cs")
	byte field1146;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 592803175
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -399857819
	)
	int field1148;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -771997279
	)
	int field1149;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 832053673
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cz")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cw")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	@Export("pathTraversed")
	class185[] pathTraversed;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -154765815
	)
	int field1117;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1854868211
	)
	int field1098;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 658677507
	)
	int field1119;

	Actor() {
		this.isWalking = false;
		this.field1120 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1114 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1122 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1126 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1141 = -1;
		this.field1140 = -1;
		this.field1148 = 0;
		this.field1149 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class185[10];
		this.field1117 = 0;
		this.field1098 = 0;
		this.field1119 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1722592983"
	)
	final void method2228() {
		this.pathLength = 0;
		this.field1098 = 0;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1118050478"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = UserComparator6.method2554(var1);
			var10 = var12.field1946;
			var11 = var12.field1934;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1630331843"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class118.method2683(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1796 == var7.field1796) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBar(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-93"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class118.method2683(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1718558788"
	)
	static int method2235(int var0, int var1) {
		FloorOverlayDefinition var2 = class18.method302(var0);
		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | -16777216;
		} else {
			int var3;
			int var4;
			byte var5;
			int var7;
			if (var2.texture >= 0) {
				var4 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				var5 = 96;
				if (var4 == -2) {
					var3 = 12345678;
				} else if (var4 == -1) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var3 = var7;
				} else {
					var7 = var5 * (var4 & 127) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var3 = var7 + (var4 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = WorldMapRectangle.method4794(var2.hue, var2.saturation, var2.lightness);
				var5 = 96;
				if (var3 == -2) {
					var4 = 12345678;
				} else if (var3 == -1) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var4 = var7;
				} else {
					var7 = var5 * (var3 & 127) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "28"
	)
	static int method2233(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
