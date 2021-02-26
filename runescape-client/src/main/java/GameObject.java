import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1569819591
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1280994929
	)
	@Export("height")
	int height;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 554225733
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1832118377
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1300389529
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1124762067
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 389479395
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1171959885
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1972895723
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2090583713
	)
	int field1947;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1378890207
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		longValue = 5598826285352901571L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 328569779
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L; // L: 16
		this.flags = 0; // L: 17
	} // L: 19

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-3"
	)
	public static int method3452(int var0) {
		--var0; // L: 44
		var0 |= var0 >>> 1; // L: 45
		var0 |= var0 >>> 2; // L: 46
		var0 |= var0 >>> 4; // L: 47
		var0 |= var0 >>> 8; // L: 48
		var0 |= var0 >>> 16; // L: 49
		return var0 + 1; // L: 50
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BI)Lcl;",
		garbageValue = "-1796289150"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 83
		Buffer var2 = new Buffer(var0); // L: 84
		var2.offset = var2.array.length - 2; // L: 85
		int var3 = var2.readUnsignedShort(); // L: 86
		int var4 = var2.array.length - 2 - var3 - 12; // L: 87
		var2.offset = var4; // L: 88
		int var5 = var2.readInt(); // L: 89
		var1.localIntCount = var2.readUnsignedShort(); // L: 90
		var1.localStringCount = var2.readUnsignedShort(); // L: 91
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 92
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 93
		int var6 = var2.readUnsignedByte(); // L: 94
		int var7;
		int var8;
		if (var6 > 0) { // L: 95
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 96

			for (var7 = 0; var7 < var6; ++var7) { // L: 97
				var8 = var2.readUnsignedShort(); // L: 98
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? method3452(var8) : 1); // L: 99
				var1.switches[var7] = var9; // L: 100

				while (var8-- > 0) { // L: 101
					int var10 = var2.readInt(); // L: 102
					int var11 = var2.readInt(); // L: 103
					var9.put(new IntegerNode(var11), (long)var10); // L: 104
				}
			}
		}

		var2.offset = 0; // L: 108
		var2.readStringCp1252NullTerminatedOrNull(); // L: 109
		var1.opcodes = new int[var5]; // L: 110
		var1.intOperands = new int[var5]; // L: 111
		var1.stringOperands = new String[var5]; // L: 112

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 113 114 119
			var8 = var2.readUnsignedShort(); // L: 115
			if (var8 == 3) { // L: 116
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 117
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 118
			}
		}

		return var1; // L: 121
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1120887468"
	)
	static final int method3451(int var0, int var1) {
		if (var0 == -1) { // L: 565
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 566
			if (var1 < 2) { // L: 567
				var1 = 2;
			} else if (var1 > 126) { // L: 568
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 569
		}
	}

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(Lcv;I)V",
		garbageValue = "871352937"
	)
	static final void method3453(Actor var0) {
		if (var0.field1006 != 0) { // L: 3649
			if (var0.targetIndex != -1) { // L: 3650
				Object var1 = null; // L: 3651
				if (var0.targetIndex < 32768) { // L: 3652
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3653
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) { // L: 3654
					int var2 = var0.x - ((Actor)var1).x; // L: 3655
					int var3 = var0.y - ((Actor)var1).y; // L: 3656
					if (var2 != 0 || var3 != 0) { // L: 3657
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3659
					var0.targetIndex = -1; // L: 3660
					var0.false0 = false; // L: 3661
				}
			}

			if (var0.field981 != -1 && (var0.pathLength == 0 || var0.field989 > 0)) { // L: 3664
				var0.orientation = var0.field981; // L: 3665
				var0.field981 = -1; // L: 3666
			}

			int var4 = var0.orientation - var0.rotation & 2047; // L: 3668
			if (var4 == 0 && var0.false0) { // L: 3669
				var0.targetIndex = -1; // L: 3670
				var0.false0 = false; // L: 3671
			}

			if (var4 != 0) { // L: 3673
				++var0.field957; // L: 3674
				boolean var6;
				if (var4 > 1024) { // L: 3675
					var0.rotation -= var0.field1006; // L: 3676
					var6 = true; // L: 3677
					if (var4 < var0.field1006 || var4 > 2048 - var0.field1006) { // L: 3678
						var0.rotation = var0.orientation; // L: 3679
						var6 = false; // L: 3680
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field957 > 25 || var6)) { // L: 3682
						if (var0.turnLeftSequence != -1) { // L: 3683
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3684
						}
					}
				} else {
					var0.rotation += var0.field1006; // L: 3688
					var6 = true; // L: 3689
					if (var4 < var0.field1006 || var4 > 2048 - var0.field1006) { // L: 3690
						var0.rotation = var0.orientation; // L: 3691
						var6 = false; // L: 3692
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field957 > 25 || var6)) { // L: 3694
						if (var0.turnRightSequence != -1) { // L: 3695
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3696
						}
					}
				}

				var0.rotation &= 2047; // L: 3700
			} else {
				var0.field957 = 0; // L: 3702
			}

		}
	} // L: 3703
}
