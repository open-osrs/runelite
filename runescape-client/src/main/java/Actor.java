import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Entity {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("mapDotSprites")
	static Sprite[] mapDotSprites;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -164376935
	)
	@Export("x")
	int x;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1393247939
	)
	@Export("y")
	int y;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1676669577
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1237850944
	)
	int field941;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -545590403
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1349814771
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1202521559
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 514642555
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 211635629
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1470742753
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1189589409
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -225179451
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -547384873
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ap")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ad")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("ai")
	boolean field953;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1570740193
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1034227111
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -150751555
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("az")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("at")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bh")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("by")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bs")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("br")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1378723849
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bf")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1723621713
	)
	int field959;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 66905399
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1817256849
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2112770449
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 2008675691
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1716773013
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1725354425
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 772627963
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1988310499
	)
	int field974;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1707465321
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 2143799121
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1610783339
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -11622765
	)
	int field978;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 843591835
	)
	int field979;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 450740853
	)
	int field981;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -222499745
	)
	int field958;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -730625153
	)
	int field982;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -447390819
	)
	int field956;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -556199195
	)
	int field984;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1930886253
	)
	int field973;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 287969781
	)
	int field986;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 1778031273
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 197743289
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1792117497
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 494801965
	)
	int field954;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -87751045
	)
	int field940;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -835146171
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ce")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cb")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("cf")
	@Export("pathTraversed")
	byte[] pathTraversed;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 541721127
	)
	int field963;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -884102379
	)
	int field996;

	Actor() {
		this.isWalking = false;
		this.field941 = 64;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.overheadText = null;
		this.field953 = false;
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
		this.field959 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field974 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field954 = 0;
		this.field940 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new byte[10];
		this.field963 = 0;
		this.field996 = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1661589479"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-874125335"
	)
	final void method1803() {
		this.pathLength = 0;
		this.field996 = 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "794886398"
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
			HitSplatDefinition var12 = class198.method3697(var1);
			var10 = var12.field3373;
			var11 = var12.field3364;
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1554709476"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = HealthBarUpdate.method1826(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field3313 == var7.field3313) {
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-324524490"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = HealthBarUpdate.method1826(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lib;ZLku;I)V",
		garbageValue = "411546609"
	)
	public static void method1821(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		NPC.ItemDefinition_archive = var0;
		VertexNormal.ItemDefinition_modelArchive = var1;
		ItemDefinition.ItemDefinition_inMembersWorld = var2;
		Varcs.ItemDefinition_fileCount = NPC.ItemDefinition_archive.getGroupFileCount(10);
		ItemDefinition.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BB)Lcs;",
		garbageValue = "0"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? World.method1870(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1653526163"
	)
	static void method1819(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)Lma;",
		garbageValue = "-1640183017"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return WorldMapRectangle.worldMap;
	}
}
