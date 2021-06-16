import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("h")
public class class8 extends class14 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2367979421742745425L
	)
	long field59;
	@ObfuscatedName("e")
	String field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class8(class2 var1) {
		this.this$0 = var1;
		this.field59 = -1L; // L: 74
		this.field60 = null; // L: 75
	} // L: 77

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field59 = var1.readLong();
		}

		this.field60 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method126(this.field59, this.field60, 0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-128382641"
	)
	public static int method104(int var0) {
		return var0 >> 17 & 7; // L: 17
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "1957308272"
	)
	static int method105(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 84
			boolean var3 = false; // L: 85
			boolean var4 = false; // L: 86
			int var5 = 0; // L: 87
			int var6 = var0.length(); // L: 88

			for (int var7 = 0; var7 < var6; ++var7) { // L: 89
				char var8 = var0.charAt(var7); // L: 90
				if (var7 == 0) { // L: 91
					if (var8 == '-') { // L: 92
						var3 = true; // L: 93
						continue;
					}

					if (var8 == '+') { // L: 96
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') { // L: 98
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 99
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 100
						throw new NumberFormatException(); // L: 101
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 102
					throw new NumberFormatException();
				}

				if (var3) { // L: 103
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1; // L: 104
				if (var9 / var1 != var5) { // L: 105
					throw new NumberFormatException();
				}

				var5 = var9; // L: 106
				var4 = true; // L: 107
			}

			if (!var4) { // L: 109
				throw new NumberFormatException();
			} else {
				return var5; // L: 110
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-39"
	)
	static final boolean method103() {
		return ViewportMouse.ViewportMouse_isInViewport; // L: 82
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "1054679248"
	)
	static int method102(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3643
			Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = FaceNormal.loadWorlds() ? 1 : 0; // L: 3644
			return 1; // L: 3645
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3647
				var9 = DevicePcmPlayerProvider.worldListStart(); // L: 3648
				if (var9 != null) { // L: 3649
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.id; // L: 3650
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.properties; // L: 3651
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.activity; // L: 3652
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.location; // L: 3653
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.population; // L: 3654
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.host; // L: 3655
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3658
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3659
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3660
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3661
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3662
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3663
				}

				return 1; // L: 3665
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3667
				var9 = Client.getNextWorldListWorld(); // L: 3668
				if (var9 != null) { // L: 3669
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.id; // L: 3670
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.properties; // L: 3671
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.activity; // L: 3672
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.location; // L: 3673
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var9.population; // L: 3674
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var9.host; // L: 3675
				} else {
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3678
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3679
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3680
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3681
					Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3682
					Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3683
				}

				return 1; // L: 3685
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3687
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3688
					var7 = null; // L: 3689

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3690
						if (var3 == World.World_worlds[var8].id) { // L: 3691
							var7 = World.World_worlds[var8]; // L: 3692
							break;
						}
					}

					if (var7 != null) { // L: 3696
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.id; // L: 3697
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.properties; // L: 3698
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.activity; // L: 3699
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.location; // L: 3700
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.population; // L: 3701
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.host; // L: 3702
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3705
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3706
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3707
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3708
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3709
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3710
					}

					return 1; // L: 3712
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3714
					ChatChannel.Interpreter_intStackSize -= 4; // L: 3715
					var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3716
					boolean var10 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1] == 1; // L: 3717
					var8 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 2]; // L: 3718
					boolean var6 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 3] == 1; // L: 3719
					WorldMapSectionType.sortWorldList(var3, var10, var8, var6); // L: 3720
					return 1; // L: 3721
				} else if (var0 != 6511) { // L: 3723
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3744
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize] == 1; // L: 3745
						return 1; // L: 3746
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3748
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3749
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3750
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3751
							var5 = UserComparator10.getParamDefinition(var4); // L: 3752
							if (var5.isString()) { // L: 3753
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class248.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3754
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class248.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3757
							}

							return 1; // L: 3759
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3761
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3762
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3763
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3764
							var5 = UserComparator10.getParamDefinition(var4); // L: 3765
							if (var5.isString()) { // L: 3766
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = Tiles.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3767
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Tiles.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3770
							}

							return 1; // L: 3772
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3774
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3775
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3776
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3777
							var5 = UserComparator10.getParamDefinition(var4); // L: 3778
							if (var5.isString()) { // L: 3779
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = class250.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3780
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = class250.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3783
							}

							return 1; // L: 3785
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3787
							ChatChannel.Interpreter_intStackSize -= 2; // L: 3788
							var3 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize]; // L: 3789
							var4 = Interpreter.Interpreter_intStack[ChatChannel.Interpreter_intStackSize + 1]; // L: 3790
							var5 = UserComparator10.getParamDefinition(var4); // L: 3791
							if (var5.isString()) { // L: 3792
								Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = UserComparator10.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3793
							} else {
								Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = UserComparator10.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3796
							}

							return 1; // L: 3798
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3800
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3801
							return 1; // L: 3802
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3804
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3805
							return 1; // L: 3806
						} else if (var0 == 6520) { // L: 3808
							return 1; // L: 3809
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3811
							return 1; // L: 3812
						} else if (var0 == 6522) { // L: 3814
							--UserComparator9.Interpreter_stringStackSize; // L: 3815
							--ChatChannel.Interpreter_intStackSize; // L: 3816
							return 1; // L: 3817
						} else if (var0 == 6523) { // L: 3819
							--UserComparator9.Interpreter_stringStackSize; // L: 3820
							--ChatChannel.Interpreter_intStackSize; // L: 3821
							return 1; // L: 3822
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) { // L: 3824
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3825
							return 1; // L: 3826
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) { // L: 3828
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 3829
							return 1; // L: 3830
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) { // L: 3832
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 1; // L: 3833
							return 1; // L: 3834
						} else if (var0 == 6527) { // L: 3836
							Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = Client.field625; // L: 3837
							return 1; // L: 3838
						} else {
							return 2; // L: 3840
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--ChatChannel.Interpreter_intStackSize]; // L: 3724
					if (var3 >= 0 && var3 < World.World_count) { // L: 3725
						var7 = World.World_worlds[var3]; // L: 3726
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.id; // L: 3727
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.properties; // L: 3728
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.activity; // L: 3729
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.location; // L: 3730
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = var7.population; // L: 3731
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = var7.host; // L: 3732
					} else {
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = -1; // L: 3735
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3736
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3737
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3738
						Interpreter.Interpreter_intStack[++ChatChannel.Interpreter_intStackSize - 1] = 0; // L: 3739
						Interpreter.Interpreter_stringStack[++UserComparator9.Interpreter_stringStackSize - 1] = ""; // L: 3740
					}

					return 1; // L: 3742
				}
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1771393574"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (class20.loadInterface(var0)) { // L: 10864
			JagexCache.runComponentCloseListeners(GrandExchangeOfferOwnWorldComparator.Widget_interfaceComponents[var0], var1); // L: 10865
		}
	} // L: 10866
}
