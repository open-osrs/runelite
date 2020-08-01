import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Actor")
public abstract class Actor extends Entity {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 744009553
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2097901447
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2131261511
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ab")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2038697523
	)
	int field967;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -316528469
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -137751655
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1305511341
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -513548165
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -72649199
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 379584779
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 186381867
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1749182957
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -966124115
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("af")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("at")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("aa")
	boolean field979;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 447977523
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -825187417
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 674699849
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("au")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("aj")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bk")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bh")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bg")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("be")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1028152459
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bd")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 861621789
	)
	int field992;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1977710907
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1631636501
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1589742041
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1536630843
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1208509489
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -739438903
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1247625137
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 2084373007
	)
	int field1000;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 2084591071
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1471011659
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 337978883
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1421591937
	)
	int field987;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 541486383
	)
	int field1005;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -558534631
	)
	int field995;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1971586345
	)
	int field1007;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1672081961
	)
	int field1008;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -715675955
	)
	int field1009;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1514147523
	)
	int field966;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 337308087
	)
	int field1011;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1718156865
	)
	int field1006;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -249207775
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1368163093
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1251205823
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 1694854685
	)
	int field1016;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1077718703
	)
	int field1017;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1769461271
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("ck")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cv")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -706356397
	)
	int field1022;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 318153573
	)
	int field1023;

	Actor() {
		this.isWalking = false;
		this.field967 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field979 = false;
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
		this.field992 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1000 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1016 = 0;
		this.field1017 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1022 = 0;
		this.field1023 = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "78"
	)
	final void method1810() {
		this.pathLength = 0;
		this.field1023 = 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1007174032"
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
			HitSplatDefinition var13 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var1);
			HitSplatDefinition var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var1);
				var13 = new HitSplatDefinition();
				if (var14 != null) {
					var13.decode(new Buffer(var14));
				}

				HitSplatDefinition.HitSplatDefinition_cached.put(var13, (long)var1);
				var12 = var13;
			}

			var10 = var12.field3373;
			var11 = var12.field3364;
		}

		int var15;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var15 = 0;
			if (var10 == 0) {
				var15 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var15 = this.hitSplatValues[0];
			}

			for (int var16 = 1; var16 < 4; ++var16) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var16] < var15) {
						var9 = var16;
						var15 = this.hitSplatCycles[var16];
					}
				} else if (var10 == 1 && this.hitSplatValues[var16] < var15) {
					var9 = var16;
					var15 = this.hitSplatValues[var16];
				}
			}

			if (var10 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var17 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var17] <= var5) {
					var9 = var17;
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-680285813"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field3312 == var8.field3312) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = LoginPacket.method3745(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lch;Lch;IZI)I",
		garbageValue = "-1172543926"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1841() ? (var1.method1841() ? 0 : 1) : (var1.method1841() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1874() ? (var1.method1874() ? 0 : 1) : (var1.method1874() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "46"
	)
	static int method1822(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
