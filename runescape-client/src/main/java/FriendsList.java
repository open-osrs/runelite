import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lb")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 993918805
	)
	static int field3812;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1152075333
	)
	int field3808;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Lnc;)V"
	)
	public FriendsList(LoginType var1) {
		super(400); // L: 17
		this.field3808 = 1; // L: 13
		this.friendLoginUpdates = new LinkDeque(); // L: 14
		this.loginType = var1; // L: 18
	} // L: 19

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)Llx;",
		garbageValue = "126"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend(); // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)[Llx;",
		garbageValue = "1924184817"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1]; // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lly;ZB)Z",
		garbageValue = "112"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1); // L: 30
		if (var3 == null) {
			return false; // L: 31
		} else {
			return !var2 || var3.world != 0; // L: 32
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnd;II)V",
		garbageValue = "1726713479"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) { // L: 37
				boolean var3 = var1.readUnsignedByte() == 1; // L: 38
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 39
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0; // L: 44
				boolean var10 = (var8 & 1) != 0; // L: 45
				if (var6 > 0) { // L: 46
					var1.readStringCp1252NullTerminated(); // L: 47
					var1.readUnsignedByte(); // L: 48
					var1.readInt(); // L: 49
				}

				var1.readStringCp1252NullTerminated(); // L: 51
				if (var4 != null && var4.hasCleanName()) { // L: 52
					Friend var11 = (Friend)this.getByCurrentUsername(var4); // L: 53
					if (var3) { // L: 54
						Friend var12 = (Friend)this.getByCurrentUsername(var5); // L: 55
						if (var12 != null && var12 != var11) { // L: 56
							if (var11 != null) { // L: 57
								this.remove(var12); // L: 58
							} else {
								var11 = var12; // L: 61
							}
						}
					}

					if (var11 != null) { // L: 65
						this.changeName(var11, var4, var5); // L: 66
						if (var6 != var11.world) { // L: 67
							boolean var14 = true; // L: 68

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) { // L: 69
								if (var13.username.equals(var4)) { // L: 70
									if (var6 != 0 && var13.world == 0) { // L: 71
										var13.remove(); // L: 72
										var14 = false; // L: 73
									} else if (var6 == 0 && var13.world != 0) { // L: 75
										var13.remove(); // L: 76
										var14 = false; // L: 77
									}
								}
							}

							if (var14) { // L: 81
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) { // L: 84
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5); // L: 85
					}

					if (var6 != var11.world) { // L: 88
						var11.int2 = ++this.field3808 - 1; // L: 89
						if (var11.world == -1 && var6 == 0) { // L: 90
							var11.int2 = -(var11.int2 * -2116718473) * -1023710905;
						}

						var11.world = var6; // L: 91
					}

					var11.rank = var7; // L: 93
					var11.field3824 = var9; // L: 94
					var11.field3823 = var10; // L: 95
					continue; // L: 96
				}

				throw new IllegalStateException();
			}

			this.sort(); // L: 97
			return; // L: 98
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lmr;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "98"
	)
	static String method5650(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 40
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 41
			return var3 == null ? var2 : (String)var3.obj; // L: 42 43
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "574138081"
	)
	static int method5647(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) { // L: 2751
			class44.Interpreter_intStackSize -= 2; // L: 2752
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2753
			var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2754
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 + var4; // L: 2755
			return 1; // L: 2756
		} else if (var0 == ScriptOpcodes.SUB) { // L: 2758
			class44.Interpreter_intStackSize -= 2; // L: 2759
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2760
			var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2761
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 - var4; // L: 2762
			return 1; // L: 2763
		} else if (var0 == ScriptOpcodes.MULTIPLY) { // L: 2765
			class44.Interpreter_intStackSize -= 2; // L: 2766
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2767
			var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2768
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var4 * var3; // L: 2769
			return 1; // L: 2770
		} else if (var0 == ScriptOpcodes.DIV) { // L: 2772
			class44.Interpreter_intStackSize -= 2; // L: 2773
			var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2774
			var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2775
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 / var4; // L: 2776
			return 1; // L: 2777
		} else if (var0 == ScriptOpcodes.RANDOM) { // L: 2779
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2780
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3); // L: 2781
			return 1; // L: 2782
		} else if (var0 == ScriptOpcodes.RANDOMINC) { // L: 2784
			var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 2785
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1)); // L: 2786
			return 1; // L: 2787
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) { // L: 2789
				class44.Interpreter_intStackSize -= 5; // L: 2790
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2791
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2792
				var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2793
				var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3]; // L: 2794
				var7 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 4]; // L: 2795
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5); // L: 2796
				return 1; // L: 2797
			} else if (var0 == ScriptOpcodes.ADDPERCENT) { // L: 2799
				class44.Interpreter_intStackSize -= 2; // L: 2800
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2801
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2802
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 + var4 * var3 / 100; // L: 2803
				return 1; // L: 2804
			} else if (var0 == ScriptOpcodes.SETBIT) { // L: 2806
				class44.Interpreter_intStackSize -= 2; // L: 2807
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2808
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2809
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 | 1 << var4; // L: 2810
				return 1; // L: 2811
			} else if (var0 == ScriptOpcodes.CLEARBIT) { // L: 2813
				class44.Interpreter_intStackSize -= 2; // L: 2814
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2815
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2816
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4); // L: 2817
				return 1; // L: 2818
			} else if (var0 == ScriptOpcodes.TESTBIT) { // L: 2820
				class44.Interpreter_intStackSize -= 2; // L: 2821
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2822
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2823
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0; // L: 2824
				return 1; // L: 2825
			} else if (var0 == ScriptOpcodes.MOD) { // L: 2827
				class44.Interpreter_intStackSize -= 2; // L: 2828
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2829
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2830
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 % var4; // L: 2831
				return 1; // L: 2832
			} else if (var0 == ScriptOpcodes.POW) { // L: 2834
				class44.Interpreter_intStackSize -= 2; // L: 2835
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2836
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2837
				if (var3 == 0) { // L: 2838
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4); // L: 2839
				}

				return 1; // L: 2840
			} else if (var0 == ScriptOpcodes.INVPOW) { // L: 2842
				class44.Interpreter_intStackSize -= 2; // L: 2843
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2844
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2845
				if (var3 == 0) { // L: 2846
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 2847
					return 1; // L: 2848
				} else {
					switch(var4) { // L: 2850
					case 0:
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Integer.MAX_VALUE; // L: 2868
						break; // L: 2869
					case 1:
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3; // L: 2863
						break; // L: 2864
					case 2:
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3); // L: 2878
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3); // L: 2873
						break; // L: 2874
					case 4:
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3)); // L: 2858
						break; // L: 2859
					default:
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0D / (double)var4); // L: 2853
					}

					return 1; // L: 2882
				}
			} else if (var0 == ScriptOpcodes.AND) { // L: 2884
				class44.Interpreter_intStackSize -= 2; // L: 2885
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2886
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2887
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 & var4; // L: 2888
				return 1; // L: 2889
			} else if (var0 == ScriptOpcodes.OR) { // L: 2891
				class44.Interpreter_intStackSize -= 2; // L: 2892
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2893
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2894
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 | var4; // L: 2895
				return 1; // L: 2896
			} else if (var0 == ScriptOpcodes.SCALE) { // L: 2898
				class44.Interpreter_intStackSize -= 3; // L: 2899
				long var9 = (long)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2900
				long var11 = (long)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2901
				long var13 = (long)Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2902
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = (int)(var9 * var13 / var11); // L: 2903
				return 1; // L: 2904
			} else if (var0 == 4025) { // L: 2906
				var3 = SequenceDefinition.method3149(Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]); // L: 2907
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3; // L: 2908
				return 1; // L: 2909
			} else if (var0 == 4026) { // L: 2911
				class44.Interpreter_intStackSize -= 2; // L: 2912
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2913
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2914
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 ^ 1 << var4; // L: 2915
				return 1; // L: 2916
			} else if (var0 == 4027) { // L: 2918
				class44.Interpreter_intStackSize -= 3; // L: 2919
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2920
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2921
				var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2922
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class342.method6043(var3, var4, var5); // L: 2923
				return 1; // L: 2924
			} else if (var0 == 4028) { // L: 2926
				class44.Interpreter_intStackSize -= 3; // L: 2927
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2928
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2929
				var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2930
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = World.method1685(var3, var4, var5); // L: 2931
				return 1; // L: 2932
			} else if (var0 == 4029) { // L: 2934
				class44.Interpreter_intStackSize -= 3; // L: 2935
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2936
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2937
				var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2938
				var6 = 31 - var5; // L: 2939
				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6; // L: 2940
				return 1; // L: 2941
			} else if (var0 == 4030) { // L: 2943
				class44.Interpreter_intStackSize -= 4; // L: 2944
				var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 2945
				var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 2946
				var5 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 2947
				var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3]; // L: 2948
				var3 = World.method1685(var3, var5, var6); // L: 2949
				var7 = CollisionMap.method3185(var6 - var5 + 1); // L: 2950
				if (var4 > var7) { // L: 2951
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var3 | var4 << var5; // L: 2952
				return 1; // L: 2953
			} else {
				return 2; // L: 2955
			}
		}
	}
}
