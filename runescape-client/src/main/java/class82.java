import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
public class class82 {
	@ObfuscatedName("f")
	static final BigInteger field983;
	@ObfuscatedName("o")
	static final BigInteger field982;

	static {
		field983 = new BigInteger("10001", 16); // L: 6
		field982 = new BigInteger("db1dc3067a0e86b4ab98b9ac9b5b63c8c4981b479a87444e15b890655ad1aed0c16d9e923d9f8742cb779d26d01e9fc0335277a63f3d5d290b3197201f8da3a906a88e147cb818ce1712f76ba6cdd796c3802e14a2c7f7834391703c81e923733301425d60a1a972e72806439d82d77cf3cc274125e7046d41a25e2376cffb8f", 16); // L: 7
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-489476877"
	)
	static void method1924() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 119
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 120
			KeyHandler.KeyHandler_keyCodes[187] = 27; // L: 121
			KeyHandler.KeyHandler_keyCodes[188] = 71; // L: 122
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 123
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 124
			KeyHandler.KeyHandler_keyCodes[191] = 73; // L: 125
			KeyHandler.KeyHandler_keyCodes[192] = 58; // L: 126
			KeyHandler.KeyHandler_keyCodes[219] = 42; // L: 127
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 128
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 129
			KeyHandler.KeyHandler_keyCodes[222] = 59; // L: 130
			KeyHandler.KeyHandler_keyCodes[223] = 28; // L: 131
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71; // L: 134
			KeyHandler.KeyHandler_keyCodes[45] = 26; // L: 135
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 136
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 137
			KeyHandler.KeyHandler_keyCodes[59] = 57; // L: 138
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 139
			KeyHandler.KeyHandler_keyCodes[91] = 42; // L: 140
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 141
			KeyHandler.KeyHandler_keyCodes[93] = 43; // L: 142
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 143
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 144
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 145
		}

	} // L: 147

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1857383054"
	)
	static int method1923(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 14
		if (var2 == null) { // L: 15
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1; // L: 16 17
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcc;ZI)I",
		garbageValue = "1669467265"
	)
	static int method1922(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) { // L: 2750
			class16.Interpreter_intStackSize -= 2; // L: 2751
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2752
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2753
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4 + var9; // L: 2754
			return 1; // L: 2755
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2757
			class16.Interpreter_intStackSize -= 2; // L: 2758
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2759
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2760
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 - var4; // L: 2761
			return 1; // L: 2762
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2764
			class16.Interpreter_intStackSize -= 2; // L: 2765
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2766
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2767
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var4 * var9; // L: 2768
			return 1; // L: 2769
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2771
			class16.Interpreter_intStackSize -= 2; // L: 2772
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2773
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2774
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 / var4; // L: 2775
			return 1; // L: 2776
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2778
			var9 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2779
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9); // L: 2780
			return 1; // L: 2781
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2783
			var9 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]; // L: 2784
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1)); // L: 2785
			return 1; // L: 2786
		} else if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2788
			class16.Interpreter_intStackSize -= 5; // L: 2789
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2790
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2791
			int var10 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 2792
			int var6 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 3]; // L: 2793
			int var11 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 4]; // L: 2794
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 + (var11 - var10) * (var4 - var9) / (var6 - var10); // L: 2795
			return 1; // L: 2796
		} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2798
			class16.Interpreter_intStackSize -= 2; // L: 2799
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2800
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2801
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100; // L: 2802
			return 1; // L: 2803
		} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2805
			class16.Interpreter_intStackSize -= 2; // L: 2806
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2807
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2808
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 | 1 << var4; // L: 2809
			return 1; // L: 2810
		} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2812
			class16.Interpreter_intStackSize -= 2; // L: 2813
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2814
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2815
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4); // L: 2816
			return 1; // L: 2817
		} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2819
			class16.Interpreter_intStackSize -= 2; // L: 2820
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2821
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2822
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0; // L: 2823
			return 1; // L: 2824
		} else if (var0 == ScriptOpcodes.MOD) { // L: 2826
			class16.Interpreter_intStackSize -= 2; // L: 2827
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2828
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2829
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 % var4; // L: 2830
			return 1; // L: 2831
		} else if (var0 == ScriptOpcodes.POW) { // L: 2833
			class16.Interpreter_intStackSize -= 2; // L: 2834
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2835
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2836
			if (var9 == 0) { // L: 2837
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4); // L: 2838
			}

			return 1; // L: 2839
		} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2841
			class16.Interpreter_intStackSize -= 2; // L: 2842
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2843
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2844
			if (var9 == 0) { // L: 2845
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0; // L: 2846
				return 1; // L: 2847
			} else {
				switch(var4) { // L: 2849
				case 0:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2862
					break; // L: 2863
				case 1:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9; // L: 2857
					break; // L: 2858
				case 2:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9); // L: 2872
					break; // L: 2873
				case 3:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9); // L: 2867
					break; // L: 2868
				case 4:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9)); // L: 2852
					break;
				default:
					Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4); // L: 2877
				}

				return 1; // L: 2881
			}
		} else if (var0 == ScriptOpcodes.AND) { // L: 2883
			class16.Interpreter_intStackSize -= 2; // L: 2884
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2885
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2886
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 & var4; // L: 2887
			return 1; // L: 2888
		} else if (var0 == ScriptOpcodes.OR) { // L: 2890
			class16.Interpreter_intStackSize -= 2; // L: 2891
			var9 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2892
			var4 = Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2893
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var9 | var4; // L: 2894
			return 1; // L: 2895
		} else if (var0 == ScriptOpcodes.SCALE) { // L: 2897
			class16.Interpreter_intStackSize -= 3; // L: 2898
			long var3 = (long)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize]; // L: 2899
			long var5 = (long)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 1]; // L: 2900
			long var7 = (long)Interpreter.Interpreter_intStack[class16.Interpreter_intStackSize + 2]; // L: 2901
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = (int)(var7 * var3 / var5); // L: 2902
			return 1; // L: 2903
		} else {
			return 2; // L: 2905
		}
	}
}
