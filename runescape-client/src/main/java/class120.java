import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dw")
public class class120 extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1678979845
	)
	int field1471;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[[Ldt;"
	)
	public class115[][] field1470;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[[Ldt;"
	)
	class115[][] field1472;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1072517793
	)
	int field1473;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1031841031
	)
	int field1474;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgs;"
	)
	public Skeleton field1478;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1707817163
	)
	int field1476;
	@ObfuscatedName("w")
	boolean field1475;

	@ObfuscatedSignature(
		descriptor = "(Lkq;Lkq;IZ)V",
		garbageValue = "0"
	)
	public class120(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1470 = null; // L: 14
		this.field1472 = null; // L: 15
		this.field1476 = 0; // L: 19
		this.field1471 = var3; // L: 23
		byte[] var5 = var1.takeFile(this.field1471 >> 16 & 65535, this.field1471 & 65535); // L: 24
		Buffer var6 = new Buffer(var5); // L: 25
		int var7 = var6.readUnsignedByte(); // L: 26
		int var8 = var6.readUnsignedShort(); // L: 27
		byte[] var9 = var2.getFile(var8, 0); // L: 30
		this.field1478 = new Skeleton(var8, var9); // L: 31
		this.method2660(var6, var7); // L: 32
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "79"
	)
	void method2660(Buffer var1, int var2) {
		this.field1473 = var1.readUnsignedShort(); // L: 36
		this.field1474 = var1.readUnsignedShort(); // L: 37
		this.field1476 = var1.readUnsignedByte(); // L: 38
		int var3 = var1.readUnsignedShort(); // L: 39
		this.field1472 = new class115[this.field1478.method3887().method3871()][]; // L: 40
		this.field1470 = new class115[this.field1478.method3886()][]; // L: 41

		for (int var4 = 0; var4 < var3; ++var4) { // L: 42
			class116 var5 = class113.method2600(var1.readUnsignedByte()); // L: 43
			int var6 = var1.readShortSmart(); // L: 44
			int var8 = var1.readUnsignedByte(); // L: 46
			class117 var9 = (class117)class140.findEnumerated(SoundCache.method792(), var8); // L: 48
			if (var9 == null) { // L: 49
				var9 = class117.field1457;
			}

			class115 var10 = new class115(); // L: 53
			var10.method2619(var1, var2); // L: 54
			int var11 = var5.method2640(); // L: 55
			class115[][] var12;
			if (var5 == class116.field1436) { // L: 57
				var12 = this.field1472; // L: 58
			} else {
				var12 = this.field1470; // L: 61
			}

			if (var12[var6] == null) { // L: 63
				var12[var6] = new class115[var11]; // L: 64
			}

			var12[var6][var9.method2647()] = var10; // L: 66
			if (var5 == class116.field1441) { // L: 67
				this.field1475 = true; // L: 68
			}
		}

	} // L: 71

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	int method2661() {
		return this.field1473; // L: 74
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1685844440"
	)
	int method2662() {
		return this.field1474; // L: 78
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1200373585"
	)
	public int method2666() {
		return this.field1476; // L: 82
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1020257728"
	)
	public int method2693() {
		return this.method2662() - this.method2661(); // L: 86
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "30"
	)
	public boolean method2697() {
		return this.field1475; // L: 90
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILdm;IIB)V",
		garbageValue = "1"
	)
	public void method2679(int var1, class113 var2, int var3, int var4) {
		class371 var5 = WorldMapSection0.method4716(); // L: 94
		this.method2687(var5, var3, var2, var1); // L: 95
		this.method2669(var5, var3, var2, var1); // L: 96
		this.method2680(var5, var3, var2, var1); // L: 97
		var2.method2565(var5); // L: 98
		var5.method6703(); // L: 99
	} // L: 100

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lni;ILdm;IS)V",
		garbageValue = "5450"
	)
	void method2687(class371 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2569(this.field1476); // L: 103
		float var6 = var5[0]; // L: 104
		float var7 = var5[1]; // L: 105
		float var8 = var5[2]; // L: 106
		if (this.field1472[var2] != null) { // L: 107
			class115 var9 = this.field1472[var2][0]; // L: 108
			class115 var10 = this.field1472[var2][1]; // L: 109
			class115 var11 = this.field1472[var2][2]; // L: 110
			if (var9 != null) { // L: 111
				var6 = var9.method2611(var4);
			}

			if (var10 != null) { // L: 112
				var7 = var10.method2611(var4);
			}

			if (var11 != null) { // L: 113
				var8 = var11.method2611(var4);
			}
		}

		class370 var20 = GrandExchangeOfferNameComparator.method5704(); // L: 115
		var20.method6669(1.0F, 0.0F, 0.0F, var6); // L: 116
		class370 var21;
		synchronized(class370.field4235) { // L: 119
			if (class370.field4231 == 0) { // L: 120
				var21 = new class370();
			} else {
				class370.field4235[--class370.field4231].method6643(); // L: 122
				var21 = class370.field4235[class370.field4231]; // L: 123
			}
		}

		var21.method6669(0.0F, 1.0F, 0.0F, var7); // L: 128
		class370 var12;
		synchronized(class370.field4235) { // L: 131
			if (class370.field4231 == 0) { // L: 132
				var12 = new class370();
			} else {
				class370.field4235[--class370.field4231].method6643(); // L: 134
				var12 = class370.field4235[class370.field4231]; // L: 135
			}
		}

		var12.method6669(0.0F, 0.0F, 1.0F, var8); // L: 140
		class370 var14;
		synchronized(class370.field4235) { // L: 143
			if (class370.field4231 == 0) { // L: 144
				var14 = new class370();
			} else {
				class370.field4235[--class370.field4231].method6643(); // L: 146
				var14 = class370.field4235[class370.field4231]; // L: 147
			}
		}

		var14.method6663(var12); // L: 152
		var14.method6663(var20); // L: 153
		var14.method6663(var21); // L: 154
		class371 var16 = WorldMapSection0.method4716(); // L: 155
		var16.method6683(var14); // L: 156
		var1.method6682(var16); // L: 157
		var20.method6642(); // L: 158
		var21.method6642(); // L: 159
		var12.method6642(); // L: 160
		var14.method6642(); // L: 161
		var16.method6703(); // L: 162
	} // L: 163

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lni;ILdm;II)V",
		garbageValue = "238134222"
	)
	void method2680(class371 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2589(this.field1476); // L: 166
		float var6 = var5[0]; // L: 167
		float var7 = var5[1]; // L: 168
		float var8 = var5[2]; // L: 169
		if (this.field1472[var2] != null) { // L: 170
			class115 var9 = this.field1472[var2][3]; // L: 171
			class115 var10 = this.field1472[var2][4]; // L: 172
			class115 var11 = this.field1472[var2][5]; // L: 173
			if (var9 != null) { // L: 174
				var6 = var9.method2611(var4);
			}

			if (var10 != null) { // L: 175
				var7 = var10.method2611(var4);
			}

			if (var11 != null) { // L: 176
				var8 = var11.method2611(var4);
			}
		}

		var1.field4241[12] = var6; // L: 178
		var1.field4241[13] = var7; // L: 179
		var1.field4241[14] = var8; // L: 180
	} // L: 181

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lni;ILdm;II)V",
		garbageValue = "1303358455"
	)
	void method2669(class371 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2570(this.field1476); // L: 184
		float var6 = var5[0]; // L: 185
		float var7 = var5[1]; // L: 186
		float var8 = var5[2]; // L: 187
		if (this.field1472[var2] != null) { // L: 188
			class115 var9 = this.field1472[var2][6]; // L: 189
			class115 var10 = this.field1472[var2][7]; // L: 190
			class115 var11 = this.field1472[var2][8]; // L: 191
			if (var9 != null) { // L: 192
				var6 = var9.method2611(var4);
			}

			if (var10 != null) { // L: 193
				var7 = var10.method2611(var4);
			}

			if (var11 != null) { // L: 194
				var8 = var11.method2611(var4);
			}
		}

		class371 var12 = WorldMapSection0.method4716(); // L: 196
		var12.method6681(var6, var7, var8); // L: 197
		var1.method6682(var12); // L: 198
		var12.method6703(); // L: 199
	} // L: 200

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "1719618305"
	)
	static int method2698(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) { // L: 480
			Interpreter.Interpreter_intStackSize -= 3; // L: 481
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 482
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 483
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 484
			if (var4 == 0) { // L: 485
				throw new RuntimeException(); // L: 486
			} else {
				Widget var6 = class130.getWidget(var9); // L: 488
				if (var6.children == null) { // L: 489
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) { // L: 490
					Widget[] var7 = new Widget[var11 + 1]; // L: 491

					for (int var8 = 0; var8 < var6.children.length; ++var8) { // L: 492
						var7[var8] = var6.children[var8];
					}

					var6.children = var7; // L: 493
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) { // L: 495
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget(); // L: 496
					var12.type = var4; // L: 497
					var12.parentId = var12.id = var6.id; // L: 498
					var12.childIndex = var11; // L: 499
					var12.isIf3 = true; // L: 500
					var6.children[var11] = var12; // L: 501
					if (var2) { // L: 502
						class16.scriptDotWidget = var12;
					} else {
						Interpreter.scriptActiveWidget = var12; // L: 503
					}

					class112.invalidateWidget(var6); // L: 504
					return 1; // L: 505
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) { // L: 507
				var3 = var2 ? class16.scriptDotWidget : Interpreter.scriptActiveWidget; // L: 508
				Widget var10 = class130.getWidget(var3.id); // L: 509
				var10.children[var3.childIndex] = null; // L: 510
				class112.invalidateWidget(var10); // L: 511
				return 1; // L: 512
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) { // L: 514
				var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 515
				var3.children = null; // L: 516
				class112.invalidateWidget(var3); // L: 517
				return 1; // L: 518
			} else if (var0 == 103) { // L: 520
				Interpreter.Interpreter_intStackSize -= 3; // L: 521
				return 1; // L: 522
			} else if (var0 == 104) { // L: 524
				--Interpreter.Interpreter_intStackSize; // L: 525
				return 1; // L: 526
			} else if (var0 != ScriptOpcodes.CC_FIND) { // L: 528
				if (var0 == ScriptOpcodes.IF_FIND) { // L: 541
					var3 = class130.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 542
					if (var3 != null) { // L: 543
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 544
						if (var2) { // L: 545
							class16.scriptDotWidget = var3;
						} else {
							Interpreter.scriptActiveWidget = var3; // L: 546
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 548
					}

					return 1; // L: 549
				} else if (var0 == 202) { // L: 551
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] = 0; // L: 552
					return 1; // L: 553
				} else if (var0 == 203) { // L: 555
					Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize + 1] = 0; // L: 556
					return 1; // L: 557
				} else {
					return 2; // L: 559
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2; // L: 529
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 530
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 531
				Widget var5 = ModeWhere.getWidgetChild(var9, var4); // L: 532
				if (var5 != null && var4 != -1) { // L: 533
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 534
					if (var2) { // L: 535
						class16.scriptDotWidget = var5;
					} else {
						Interpreter.scriptActiveWidget = var5; // L: 536
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 538
				}

				return 1; // L: 539
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1669093139"
	)
	static void method2699() {
		Login.worldSelectOpen = false; // L: 2018
		class260.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2019
		FriendSystem.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2020
		class28.logoSprite.drawAt(Login.xPadding + 382 - class28.logoSprite.subWidth / 2, 18); // L: 2021
	} // L: 2022
}
