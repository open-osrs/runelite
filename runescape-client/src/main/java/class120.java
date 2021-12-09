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
		this.field1453 = null; // L: 14
		this.field1451 = null; // L: 15
		this.field1455 = 0; // L: 19
		this.field1454 = var3; // L: 44
		byte[] var5 = var1.takeFile(this.field1454 >> 16 & 65535, this.field1454 & 65535); // L: 45
		Buffer var6 = new Buffer(var5); // L: 46
		int var7 = var6.readUnsignedByte(); // L: 47
		int var8 = var6.readUnsignedShort(); // L: 48
		byte[] var9;
		if (var4) { // L: 50
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0); // L: 51
		}

		this.field1457 = new Skeleton(var8, var9); // L: 52
		this.method2690(var6, var7); // L: 53
	} // L: 54

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lpi;IB)V",
		garbageValue = "1"
	)
	void method2690(Buffer var1, int var2) {
		this.field1452 = var1.readUnsignedShort(); // L: 57
		this.field1456 = var1.readUnsignedShort(); // L: 58
		this.field1455 = var1.readUnsignedByte(); // L: 59
		int var3 = var1.readUnsignedShort(); // L: 60
		this.field1451 = new class115[this.field1457.method3943().method3935()][]; // L: 61
		this.field1453 = new class115[this.field1457.method3949()][]; // L: 62

		for (int var4 = 0; var4 < var3; ++var4) { // L: 63
			int var6 = var1.readUnsignedByte(); // L: 65
			class116 var7 = (class116)class130.findEnumerated(Login.method1994(), var6); // L: 67
			if (var7 == null) { // L: 68
				var7 = class116.field1421;
			}

			int var8 = var1.readShortSmart(); // L: 72
			int var10 = var1.readUnsignedByte(); // L: 74
			class117 var11 = (class117)class130.findEnumerated(class7.method74(), var10); // L: 76
			if (var11 == null) { // L: 77
				var11 = class117.field1425;
			}

			class115 var12 = new class115(); // L: 81
			var12.method2638(var1, var2); // L: 82
			int var13 = var7.method2669(); // L: 83
			class115[][] var14;
			if (var7 == class116.field1415) { // L: 85
				var14 = this.field1451; // L: 86
			} else {
				var14 = this.field1453; // L: 89
			}

			if (var14[var8] == null) { // L: 91
				var14[var8] = new class115[var13]; // L: 92
			}

			var14[var8][var11.method2674()] = var12; // L: 94
			if (var7 == class116.field1418) { // L: 95
				this.field1449 = true; // L: 96
			}
		}

	} // L: 99

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	int method2704() {
		return this.field1452; // L: 102
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565946270"
	)
	int method2693() {
		return this.field1456; // L: 106
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1439954797"
	)
	public int method2694() {
		return this.field1455; // L: 110
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "528719548"
	)
	public int method2691() {
		return this.method2693() - this.method2704(); // L: 114
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public boolean method2695() {
		return this.field1449; // L: 118
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILdf;III)V",
		garbageValue = "-1220329535"
	)
	public void method2700(int var1, class113 var2, int var3, int var4) {
		class366 var5;
		synchronized(class366.field4191) { // L: 124
			if (class149.field1663 == 0) { // L: 125
				var5 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652(); // L: 127
				var5 = class366.field4191[class149.field1663]; // L: 128
			}
		}

		this.method2701(var5, var3, var2, var1); // L: 133
		this.method2699(var5, var3, var2, var1); // L: 134
		this.method2698(var5, var3, var2, var1); // L: 135
		var2.method2576(var5); // L: 136
		var5.method6656(); // L: 137
	} // L: 138

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lno;ILdf;IB)V",
		garbageValue = "96"
	)
	void method2701(class366 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2583(this.field1455); // L: 141
		float var6 = var5[0]; // L: 142
		float var7 = var5[1]; // L: 143
		float var8 = var5[2]; // L: 144
		if (this.field1451[var2] != null) { // L: 145
			class115 var9 = this.field1451[var2][0]; // L: 146
			class115 var10 = this.field1451[var2][1]; // L: 147
			class115 var11 = this.field1451[var2][2]; // L: 148
			if (var9 != null) { // L: 149
				var6 = var9.method2632(var4);
			}

			if (var10 != null) { // L: 150
				var7 = var10.method2632(var4);
			}

			if (var11 != null) { // L: 151
				var8 = var11.method2632(var4);
			}
		}

		class365 var17 = Friend.method6296(); // L: 153
		var17.method6630(1.0F, 0.0F, 0.0F, var6); // L: 154
		class365 var18 = Friend.method6296(); // L: 155
		var18.method6630(0.0F, 1.0F, 0.0F, var7); // L: 156
		class365 var19 = Friend.method6296(); // L: 157
		var19.method6630(0.0F, 0.0F, 1.0F, var8); // L: 158
		class365 var12 = Friend.method6296(); // L: 159
		var12.method6628(var19); // L: 160
		var12.method6628(var17); // L: 161
		var12.method6628(var18); // L: 162
		class366 var13;
		synchronized(class366.field4191) { // L: 165
			if (class149.field1663 == 0) { // L: 166
				var13 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652(); // L: 168
				var13 = class366.field4191[class149.field1663]; // L: 169
			}
		}

		var13.method6711(var12); // L: 174
		var1.method6670(var13); // L: 175
		var17.method6646(); // L: 176
		var18.method6646(); // L: 177
		var19.method6646(); // L: 178
		var12.method6646(); // L: 179
		var13.method6656(); // L: 180
	} // L: 181

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lno;ILdf;IB)V",
		garbageValue = "1"
	)
	void method2698(class366 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2577(this.field1455); // L: 184
		float var6 = var5[0]; // L: 185
		float var7 = var5[1]; // L: 186
		float var8 = var5[2]; // L: 187
		if (this.field1451[var2] != null) { // L: 188
			class115 var9 = this.field1451[var2][3]; // L: 189
			class115 var10 = this.field1451[var2][4]; // L: 190
			class115 var11 = this.field1451[var2][5]; // L: 191
			if (var9 != null) { // L: 192
				var6 = var9.method2632(var4);
			}

			if (var10 != null) { // L: 193
				var7 = var10.method2632(var4);
			}

			if (var11 != null) { // L: 194
				var8 = var11.method2632(var4);
			}
		}

		var1.field4196[12] = var6; // L: 196
		var1.field4196[13] = var7; // L: 197
		var1.field4196[14] = var8; // L: 198
	} // L: 199

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lno;ILdf;IB)V",
		garbageValue = "-84"
	)
	void method2699(class366 var1, int var2, class113 var3, int var4) {
		float[] var5 = var3.method2585(this.field1455); // L: 202
		float var6 = var5[0]; // L: 203
		float var7 = var5[1]; // L: 204
		float var8 = var5[2]; // L: 205
		if (this.field1451[var2] != null) { // L: 206
			class115 var9 = this.field1451[var2][6]; // L: 207
			class115 var10 = this.field1451[var2][7]; // L: 208
			class115 var11 = this.field1451[var2][8]; // L: 209
			if (var9 != null) { // L: 210
				var6 = var9.method2632(var4);
			}

			if (var10 != null) { // L: 211
				var7 = var10.method2632(var4);
			}

			if (var11 != null) { // L: 212
				var8 = var11.method2632(var4);
			}
		}

		class366 var14;
		synchronized(class366.field4191) { // L: 216
			if (class149.field1663 == 0) { // L: 217
				var14 = new class366();
			} else {
				class366.field4191[--class149.field1663].method6652(); // L: 219
				var14 = class366.field4191[class149.field1663]; // L: 220
			}
		}

		var14.method6667(var6, var7, var8); // L: 225
		var1.method6670(var14); // L: 226
		var14.method6656(); // L: 227
	} // L: 228

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZI)I",
		garbageValue = "-2070475584"
	)
	static int method2724(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 842
		Widget var4;
		if (var0 >= 2000) { // L: 844
			var0 -= 1000; // L: 845
			var4 = ChatChannel.getWidget(Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]); // L: 846
			var3 = false; // L: 847
		} else {
			var4 = var2 ? WorldMapArea.scriptDotWidget : Messages.scriptActiveWidget; // L: 849
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 850
			var11 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] - 1; // L: 851
			if (var11 >= 0 && var11 <= 9) { // L: 852
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 856
				return 1; // L: 857
			} else {
				--class13.Interpreter_stringStackSize; // L: 853
				return 1; // L: 854
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 859
				IsaacCipher.Interpreter_intStackSize -= 2; // L: 860
				var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 861
				var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 862
				var4.parent = class126.getWidgetChild(var11, var6); // L: 863
				return 1; // L: 864
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 866
				var4.isScrollBar = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 867
				return 1; // L: 868
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 870
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 871
				return 1; // L: 872
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 874
				var4.dragThreshold = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 875
				return 1; // L: 876
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 878
				var4.dataText = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 879
				return 1; // L: 880
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 882
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 883
				return 1; // L: 884
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 886
				var4.actions = null; // L: 887
				return 1; // L: 888
			} else if (var0 == 1308) { // L: 890
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 891
				return 1; // L: 892
			} else if (var0 == 1309) { // L: 894
				--IsaacCipher.Interpreter_intStackSize; // L: 895
				return 1; // L: 896
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 898
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 928
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 929
						var5 = 10; // L: 930
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]}; // L: 931
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]}; // L: 932
						World.Widget_setKey(var4, var5, var8, var9); // L: 933
						return 1; // L: 934
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 936
						IsaacCipher.Interpreter_intStackSize -= 3; // L: 937
						var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] - 1; // L: 938
						var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 939
						var7 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 940
						if (var11 >= 0 && var11 <= 9) { // L: 941
							UserComparator3.Widget_setKeyRate(var4, var11, var6, var7); // L: 944
							return 1; // L: 945
						} else {
							throw new RuntimeException(); // L: 942
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 947
						var5 = 10; // L: 948
						var6 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 949
						var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 950
						UserComparator3.Widget_setKeyRate(var4, var5, var6, var7); // L: 951
						return 1; // L: 952
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 954
						--IsaacCipher.Interpreter_intStackSize; // L: 955
						var11 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize] - 1; // L: 956
						if (var11 >= 0 && var11 <= 9) { // L: 957
							class16.Widget_setKeyIgnoreHeld(var4, var11); // L: 960
							return 1; // L: 961
						} else {
							throw new RuntimeException(); // L: 958
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 963
						var5 = 10; // L: 964
						class16.Widget_setKeyIgnoreHeld(var4, var5); // L: 965
						return 1; // L: 966
					} else {
						return 2; // L: 968
					}
				} else {
					byte[] var10 = null; // L: 899
					var8 = null; // L: 900
					if (var3) { // L: 901
						IsaacCipher.Interpreter_intStackSize -= 10; // L: 902

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + IsaacCipher.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 904 905
						}

						if (var7 > 0) { // L: 907
							var10 = new byte[var7 / 2]; // L: 908
							var8 = new byte[var7 / 2]; // L: 909

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 910
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + IsaacCipher.Interpreter_intStackSize]; // L: 911
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + IsaacCipher.Interpreter_intStackSize + 1]; // L: 912
							}
						}
					} else {
						IsaacCipher.Interpreter_intStackSize -= 2; // L: 917
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]}; // L: 918
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]}; // L: 919
					}

					var7 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] - 1; // L: 921
					if (var7 >= 0 && var7 <= 9) { // L: 922
						World.Widget_setKey(var4, var7, var10, var8); // L: 925
						return 1; // L: 926
					} else {
						throw new RuntimeException(); // L: 923
					}
				}
			}
		}
	}
}
