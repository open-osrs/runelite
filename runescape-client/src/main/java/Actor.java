import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 859699173
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1906173449
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2031376903
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ae")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 109112903
	)
	int field1137;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 108323995
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 325157293
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 710162855
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1261206163
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 954630749
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 624221683
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1941620231
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1182742981
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1643817169
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ai")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ac")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ag")
	boolean field1108;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1995115317
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1211889675
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1604541403
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("ax")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bd")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bt")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("bf")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bp")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bl")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -651620429
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bw")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1607294201
	)
	int field1096;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1209933873
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1480679575
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 730478525
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -519423817
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1945553445
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 2024239161
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -268271383
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 934097405
	)
	int field1099;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 358555221
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 416629453
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1367399047
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -499820313
	)
	int field1133;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -138571811
	)
	int field1134;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -2138117835
	)
	int field1135;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1059579057
	)
	int field1121;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -209560377
	)
	int field1141;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1658774391
	)
	int field1110;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1482421269
	)
	int field1139;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1273273369
	)
	int field1140;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1602302083
	)
	int field1101;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1519576615
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 869477707
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 544403561
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -1375996437
	)
	int field1145;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 2052402129
	)
	int field1146;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -745432089
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ch")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cx")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cv")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 590723515
	)
	int field1151;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 531606775
	)
	int field1152;

	Actor() {
		this.isWalking = false;
		this.field1137 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field1108 = false;
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
		this.field1096 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1099 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1145 = 0;
		this.field1146 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field1151 = 0;
		this.field1152 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1101417957"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-123"
	)
	final void method2123() {
		this.pathLength = 0;
		this.field1152 = 0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "73"
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
			HitSplatDefinition var12 = PendingSpawn.method2120(var1);
			var10 = var12.field1813;
			var11 = var12.field1804;
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "75"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class1.method12(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1670 == var7.field1670) {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-63793627"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class1.method12(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)V",
		garbageValue = "1972737451"
	)
	@Export("invalidateWidget")
	static void invalidateWidget(Widget var0) {
		if (var0.cycle == Client.field696) {
			Client.field697[var0.rootIndex] = true;
		}

	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2106118340"
	)
	static void method2132(String var0) {
		WorldMapIcon_0.field2104 = var0;

		try {
			String var1 = ArchiveDiskActionHandler.client.getParameter(Integer.toString(18));
			String var2 = ArchiveDiskActionHandler.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class12.method172(Occluder.method4335() + 94608000000L) + "; Max-Age=" + 94608000L;
			}

			class27.method397(ArchiveDiskActionHandler.client, "document.cookie=\"" + var3 + "\"");
		} catch (Throwable var4) {
		}

	}
}
