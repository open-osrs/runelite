import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class334 {
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1671308737
	)
	static int field4057;
	@ObfuscatedName("c")
	static char[] field4052;
	@ObfuscatedName("l")
	static char[] field4051;
	@ObfuscatedName("s")
	static char[] field4053;
	@ObfuscatedName("e")
	static int[] field4054;

	static {
		field4052 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4052[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4052[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4052[var0] = (char)(var0 + 48 - 52);
		}

		field4052[62] = '+'; // L: 11
		field4052[63] = '/'; // L: 12
		field4051 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4051[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4051[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4051[var0] = (char)(var0 + 48 - 52);
		}

		field4051[62] = '*'; // L: 22
		field4051[63] = '-'; // L: 23
		field4053 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4053[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4053[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4053[var0] = (char)(var0 + 48 - 52);
		}

		field4053[62] = '-'; // L: 33
		field4053[63] = '_'; // L: 34
		field4054 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4054.length; ++var0) { // L: 41
			field4054[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4054[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4054[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4054[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4054; // L: 45
		field4054[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4054; // L: 48
		field4054[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)Ldp;",
		garbageValue = "-2022855172"
	)
	static class121 method6128(int var0) {
		class121 var1 = (class121)class140.findEnumerated(class115.method2620(), var0); // L: 120
		if (var1 == null) {
			var1 = class121.field1482; // L: 121
		}

		return var1; // L: 122
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILbl;ZI)I",
		garbageValue = "-411703308"
	)
	static int method6130(int var0, Script var1, boolean var2) {
		if (var0 == 6800) { // L: 4308
			Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 4309
			return 1; // L: 4310
		} else if (var0 != 6801 && var0 != 6802) { // L: 4312
			if (var0 == 6850) { // L: 4316
				Interpreter.Interpreter_stringStack[++BufferedNetSocket.Interpreter_stringStackSize - 1] = ""; // L: 4317
				return 1; // L: 4318
			} else if (var0 != 6851 && var0 != 6852) { // L: 4320
				if (var0 == 6853) { // L: 4324
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4325
					return 1; // L: 4326
				} else {
					return 2; // L: 4328
				}
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4321
				return 1; // L: 4322
			}
		} else {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4313
			return 1; // L: 4314
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Lcq;IB)V",
		garbageValue = "-18"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field1157 >= Client.cycle) { // L: 3796
			var2 = Math.max(1, var0.field1157 - Client.cycle); // L: 3797
			var3 = var0.field1113 * 64 + var0.field1153 * 128; // L: 3798
			var4 = var0.field1113 * 64 + var0.field1144 * 128; // L: 3799
			var0.x += (var3 - var0.x) / var2; // L: 3800
			var0.y += (var4 - var0.y) / var2; // L: 3801
			var0.field1175 = 0; // L: 3802
			var0.orientation = var0.field1159; // L: 3803
		} else if (var0.field1158 >= Client.cycle) { // L: 3805
			if (var0.field1158 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > class78.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3806
				var2 = var0.field1158 - var0.field1157; // L: 3807
				var3 = Client.cycle - var0.field1157; // L: 3808
				var4 = var0.field1113 * 64 + var0.field1153 * 128; // L: 3809
				int var5 = var0.field1113 * 64 + var0.field1144 * 128; // L: 3810
				int var6 = var0.field1113 * 64 + var0.field1147 * 128; // L: 3811
				int var7 = var0.field1113 * 64 + var0.field1156 * 128; // L: 3812
				var0.x = (var3 * var6 + var4 * (var2 - var3)) / var2; // L: 3813
				var0.y = (var7 * var3 + var5 * (var2 - var3)) / var2; // L: 3814
			}

			var0.field1175 = 0; // L: 3816
			var0.orientation = var0.field1159; // L: 3817
			var0.rotation = var0.orientation; // L: 3818
		} else {
			class17.method219(var0); // L: 3820
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3821
			var0.sequence = -1; // L: 3822
			var0.spotAnimation = -1; // L: 3823
			var0.field1157 = 0; // L: 3824
			var0.field1158 = 0; // L: 3825
			var0.x = var0.field1113 * 64 + var0.pathX[0] * 128; // L: 3826
			var0.y = var0.field1113 * 64 + var0.pathY[0] * 128; // L: 3827
			var0.method2163(); // L: 3828
		}

		if (WorldMapSprite.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3830 3831
			var0.sequence = -1; // L: 3832
			var0.spotAnimation = -1; // L: 3833
			var0.field1157 = 0; // L: 3834
			var0.field1158 = 0; // L: 3835
			var0.x = var0.pathX[0] * 128 + var0.field1113 * 64; // L: 3836
			var0.y = var0.pathY[0] * 128 + var0.field1113 * 64; // L: 3837
			var0.method2163(); // L: 3838
		}

		if (var0.field1170 != 0) { // L: 3842
			if (var0.targetIndex != -1) { // L: 3843
				Object var8 = null; // L: 3844
				if (var0.targetIndex < 32768) { // L: 3845
					var8 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) { // L: 3846
					var8 = Client.players[var0.targetIndex - 32768];
				}

				if (var8 != null) { // L: 3847
					var3 = var0.x - ((Actor)var8).x; // L: 3848
					var4 = var0.y - ((Actor)var8).y; // L: 3849
					if (var3 != 0 || var4 != 0) { // L: 3850
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) { // L: 3852
					var0.targetIndex = -1; // L: 3853
					var0.false0 = false; // L: 3854
				}
			}

			if (var0.field1138 != -1 && (var0.pathLength == 0 || var0.field1175 > 0)) { // L: 3857
				var0.orientation = var0.field1138; // L: 3858
				var0.field1138 = -1; // L: 3859
			}

			var2 = var0.orientation - var0.rotation & 2047; // L: 3861
			if (var2 == 0 && var0.false0) { // L: 3862
				var0.targetIndex = -1; // L: 3863
				var0.false0 = false; // L: 3864
			}

			if (var2 != 0) { // L: 3866
				++var0.field1169; // L: 3867
				boolean var10;
				if (var2 > 1024) { // L: 3868
					var0.rotation -= var0.field1139 ? var2 : var0.field1170 * 416354727 * -1787394537; // L: 3869
					var10 = true; // L: 3870
					if (var2 < var0.field1170 || var2 > 2048 - var0.field1170) { // L: 3871
						var0.rotation = var0.orientation; // L: 3872
						var10 = false; // L: 3873
					}

					if (!var0.field1139 && var0.idleSequence == var0.movementSequence && (var0.field1169 > 25 || var10)) { // L: 3875
						if (var0.turnLeftSequence != -1) { // L: 3876
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3877
						}
					}
				} else {
					var0.rotation += var0.field1139 ? var2 : 416354727 * var0.field1170 * -1787394537; // L: 3881
					var10 = true; // L: 3882
					if (var2 < var0.field1170 || var2 > 2048 - var0.field1170) { // L: 3883
						var0.rotation = var0.orientation; // L: 3884
						var10 = false; // L: 3885
					}

					if (!var0.field1139 && var0.idleSequence == var0.movementSequence && (var0.field1169 > 25 || var10)) { // L: 3887
						if (var0.turnRightSequence != -1) { // L: 3888
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence; // L: 3889
						}
					}
				}

				var0.rotation &= 2047; // L: 3893
				var0.field1139 = false; // L: 3894
			} else {
				var0.field1169 = 0; // L: 3896
			}
		}

		class293.method5481(var0); // L: 3898
	} // L: 3899
}
