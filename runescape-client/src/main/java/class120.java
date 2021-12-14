import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("db")
public class class120 extends DualNode {
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		longValue = -7392064901863756545L
	)
	static long field1450;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -223419425
	)
	int field1454;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[[Ldn;"
	)
	public class115[][] field1453;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[[Ldn;"
	)
	class115[][] field1451;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 637363397
	)
	int field1452;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 930082989
	)
	int field1456;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	public Skeleton field1457;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -129283669
	)
	int field1455;
	@ObfuscatedName("w")
	boolean field1449;

	@ObfuscatedSignature(
		descriptor = "(Lku;Lku;IZ)V"
	)
	class120(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1453 = null;
		this.field1451 = null;
		this.field1455 = 0;
		this.field1454 = var3;
		byte[] var5 = var1.takeFile(this.field1454 >> 16 & 65535, this.field1454 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1457 = new Skeleton(var8, var9);
		this.method2690(var6, var7);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "1"
	)
	void method2690(Buffer var1, int var2) {
		this.field1452 = var1.readUnsignedShort();
		this.field1456 = var1.readUnsignedShort();
		this.field1455 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1451 = new class115[this.field1457.method3943().method3935()][];
		this.field1453 = new class115[this.field1457.method3949()][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var6 = var1.readUnsignedByte();
			class116 var7 = (class116)class130.findEnumerated(Login.method1994(), var6);
			if (var7 == null) {
				var7 = class116.field1421;
			}

			int var8 = var1.readShortSmart();
			int var10 = var1.readUnsignedByte();
			class117 var11 = (class117)class130.findEnumerated(class7.method74(), var10);
			if (var11 == null) {
				var11 = class117.field1425;
			}

			class115 var12 = new class115();
			var12.method2638(var1, var2);
			int var13 = var7.method2669();
			class115[][] var14;
			if (var7 == class116.field1415) {
				var14 = this.field1451;
			} else {
				var14 = this.field1453;
			}

			if (var14[var8] == null) {
				var14[var8] = new class115[var13];
			}

			var14[var8][var11.method2674()] = var12;
			if (var7 == class116.field1418) {
				this.field1449 = true;
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	int method2704() {
		return this.field1452;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565946270"
	)
	int method2693() {
		return this.field1456;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1439954797"
	)
	public int method2694() {
		return this.field1455;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "528719548"
	)
	public int method2691() {
		return this.method2693() - this.method2704();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public boolean method2695() {
		return this.field1449;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILdf;III)V",
		garbageValue = "-1220329535"
	)
	public void method2700(int var1, class113 var2, int var3, int var4) {
		class366 var5;
		synchronized(class366.field4191) {
			if (class149.field1663 == 0) {
				var5 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652();
				var5 = class366.field4191[class149.field1663];
			}
		}

		this.method2701(var5, var3, var2, var1);
		this.method2699(var5, var3, var2, var1);
		this.method2698(var5, var3, var2, var1);
		var2.method2576(var5);
		var5.method6656();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lno;ILdf;IB)V",
		garbageValue = "96"
	)
	void method2701(class366 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2583(this.field1455);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1451[var2] != null) {
			class115 var9 = this.field1451[var2][0];
			class115 var10 = this.field1451[var2][1];
			class115 var11 = this.field1451[var2][2];
			if (var9 != null) {
				var6 = var9.method2632(var4);
			}

			if (var10 != null) {
				var7 = var10.method2632(var4);
			}

			if (var11 != null) {
				var8 = var11.method2632(var4);
			}
		}

		class365 var17 = Friend.method6296();
		var17.method6630(1.0F, 0.0F, 0.0F, var6);
		class365 var18 = Friend.method6296();
		var18.method6630(0.0F, 1.0F, 0.0F, var7);
		class365 var19 = Friend.method6296();
		var19.method6630(0.0F, 0.0F, 1.0F, var8);
		class365 var12 = Friend.method6296();
		var12.method6628(var19);
		var12.method6628(var17);
		var12.method6628(var18);
		class366 var13;
		synchronized(class366.field4191) {
			if (class149.field1663 == 0) {
				var13 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652();
				var13 = class366.field4191[class149.field1663];
			}
		}

		var13.method6711(var12);
		var1.method6670(var13);
		var17.method6646();
		var18.method6646();
		var19.method6646();
		var12.method6646();
		var13.method6656();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lno;ILdf;IB)V",
		garbageValue = "1"
	)
	void method2698(class366 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2577(this.field1455);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1451[var2] != null) {
			class115 var9 = this.field1451[var2][3];
			class115 var10 = this.field1451[var2][4];
			class115 var11 = this.field1451[var2][5];
			if (var9 != null) {
				var6 = var9.method2632(var4);
			}

			if (var10 != null) {
				var7 = var10.method2632(var4);
			}

			if (var11 != null) {
				var8 = var11.method2632(var4);
			}
		}

		var1.field4196[12] = var6;
		var1.field4196[13] = var7;
		var1.field4196[14] = var8;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lno;ILdf;IB)V",
		garbageValue = "-84"
	)
	void method2699(class366 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2585(this.field1455);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1451[var2] != null) {
			class115 var9 = this.field1451[var2][6];
			class115 var10 = this.field1451[var2][7];
			class115 var11 = this.field1451[var2][8];
			if (var9 != null) {
				var6 = var9.method2632(var4);
			}

			if (var10 != null) {
				var7 = var10.method2632(var4);
			}

			if (var11 != null) {
				var8 = var11.method2632(var4);
			}
		}

		class366 var14;
		synchronized(class366.field4191) {
			if (class149.field1663 == 0) {
				var14 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652();
				var14 = class366.field4191[class149.field1663];
			}
		}

		var14.method6667(var6, var7, var8);
		var1.method6670(var14);
		var14.method6656();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-2070475584"
	)
	static int method2724(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class13.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				IsaacCipher.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
				var4.parent = class126.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--IsaacCipher.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						IsaacCipher.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]};
						World.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						IsaacCipher.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							UserComparator3.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize];
						UserComparator3.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--IsaacCipher.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							class16.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						class16.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						IsaacCipher.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + IsaacCipher.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + IsaacCipher.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + IsaacCipher.Interpreter_intStackSize + 1];
							}
						}
					} else {
						IsaacCipher.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						World.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
