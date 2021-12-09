import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -62264007
	)
	static int field460;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;

	ApproximateRouteStrategy() {
	} // L: 12795

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIILgf;I)Z",
		garbageValue = "-563456214"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY; // L: 12799
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbn;ZB)I",
		garbageValue = "-10"
	)
	static int method1139(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3707
			Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = PlayerComposition.loadWorlds() ? 1 : 0; // L: 3708
			return 1; // L: 3709
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3711
				var9 = class282.worldListStart(); // L: 3712
				if (var9 != null) { // L: 3713
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.id; // L: 3714
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.properties; // L: 3715
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.activity; // L: 3716
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.location; // L: 3717
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.population; // L: 3718
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.host; // L: 3719
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3722
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3723
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3724
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3725
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3726
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3727
				}

				return 1; // L: 3729
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3731
				var9 = Canvas.getNextWorldListWorld(); // L: 3732
				if (var9 != null) { // L: 3733
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.id; // L: 3734
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.properties; // L: 3735
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.activity; // L: 3736
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.location; // L: 3737
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var9.population; // L: 3738
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.host; // L: 3739
				} else {
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3742
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3743
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3744
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3745
					Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3746
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3747
				}

				return 1; // L: 3749
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3751
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3752
					var7 = null; // L: 3753

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3754
						if (var3 == class334.World_worlds[var8].id) { // L: 3755
							var7 = class334.World_worlds[var8]; // L: 3756
							break;
						}
					}

					if (var7 != null) { // L: 3760
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.id; // L: 3761
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.properties; // L: 3762
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.activity; // L: 3763
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.location; // L: 3764
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.population; // L: 3765
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.host; // L: 3766
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3769
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3770
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3771
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3772
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3773
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3774
					}

					return 1; // L: 3776
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3778
					IsaacCipher.Interpreter_intStackSize -= 4; // L: 3779
					var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3780
					boolean var10 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1] == 1; // L: 3781
					var8 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 2]; // L: 3782
					boolean var6 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 3] == 1; // L: 3783
					class118.sortWorldList(var3, var10, var8, var6); // L: 3784
					return 1; // L: 3785
				} else if (var0 != 6511) { // L: 3787
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3808
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize] == 1; // L: 3809
						return 1; // L: 3810
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3812
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3813
							var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3814
							var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3815
							var5 = VerticalAlignment.getParamDefinition(var4); // L: 3816
							if (var5.isString()) { // L: 3817
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = WorldMapLabelSize.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3818
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = WorldMapLabelSize.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3821
							}

							return 1; // L: 3823
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3825
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3826
							var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3827
							var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3828
							var5 = VerticalAlignment.getParamDefinition(var4); // L: 3829
							if (var5.isString()) { // L: 3830
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class148.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3831
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class148.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3834
							}

							return 1; // L: 3836
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3838
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3839
							var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3840
							var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3841
							var5 = VerticalAlignment.getParamDefinition(var4); // L: 3842
							if (var5.isString()) { // L: 3843
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = UserComparator6.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3844
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = UserComparator6.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3847
							}

							return 1; // L: 3849
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3851
							IsaacCipher.Interpreter_intStackSize -= 2; // L: 3852
							var3 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize]; // L: 3853
							var4 = Interpreter.Interpreter_intStack[IsaacCipher.Interpreter_intStackSize + 1]; // L: 3854
							var5 = VerticalAlignment.getParamDefinition(var4); // L: 3855
							if (var5.isString()) { // L: 3856
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class18.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3857
							} else {
								Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = class18.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3860
							}

							return 1; // L: 3862
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3864
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3865
							return 1; // L: 3866
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3868
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3869
							return 1; // L: 3870
						} else if (var0 == 6520) { // L: 3872
							return 1; // L: 3873
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3875
							return 1; // L: 3876
						} else if (var0 == 6522) { // L: 3878
							--class13.Interpreter_stringStackSize; // L: 3879
							--IsaacCipher.Interpreter_intStackSize; // L: 3880
							return 1; // L: 3881
						} else if (var0 == 6523) { // L: 3883
							--class13.Interpreter_stringStackSize; // L: 3884
							--IsaacCipher.Interpreter_intStackSize; // L: 3885
							return 1; // L: 3886
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 3888
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3889
							return 1; // L: 3890
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 3892
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 3893
							return 1; // L: 3894
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 3896
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 1; // L: 3897
							return 1; // L: 3898
						} else if (var0 == 6527) { // L: 3900
							Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = Client.field499; // L: 3901
							return 1; // L: 3902
						} else {
							return 2; // L: 3904
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--IsaacCipher.Interpreter_intStackSize]; // L: 3788
					if (var3 >= 0 && var3 < World.World_count) { // L: 3789
						var7 = class334.World_worlds[var3]; // L: 3790
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.id; // L: 3791
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.properties; // L: 3792
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.activity; // L: 3793
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.location; // L: 3794
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = var7.population; // L: 3795
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.host; // L: 3796
					} else {
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = -1; // L: 3799
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3800
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3801
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3802
						Interpreter.Interpreter_intStack[++IsaacCipher.Interpreter_intStackSize - 1] = 0; // L: 3803
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3804
					}

					return 1; // L: 3806
				}
			}
		}
	}
}
