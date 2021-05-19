import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cr")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("h")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("c")
	@Export("lock")
	Object lock;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1951116577
	)
	@Export("index")
	int index;
	@ObfuscatedName("g")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("l")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("z")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; UrlRequest.sleepExact(50L)) { // L: 17 26
			synchronized(this.lock) { // L: 18
				if (this.index < 500) { // L: 19
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 20
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 21
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 22
					++this.index; // L: 23
				}
			}
		}

	} // L: 28

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljava/lang/String;Ljava/lang/String;IZB)V",
		garbageValue = "-90"
	)
	public static void method2124(AbstractArchive var0, String var1, String var2, int var3, boolean var4) {
		int var5 = var0.getGroupId(var1); // L: 34
		int var6 = var0.getFileId(var5, var2); // L: 35
		World.method1684(var0, var5, var6, var3, var4); // L: 36
	} // L: 37

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-975055690"
	)
	public static int method2126(int var0) {
		--var0; // L: 50
		var0 |= var0 >>> 1; // L: 51
		var0 |= var0 >>> 2; // L: 52
		var0 |= var0 >>> 4; // L: 53
		var0 |= var0 >>> 8; // L: 54
		var0 |= var0 >>> 16; // L: 55
		return var0 + 1; // L: 56
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "2105644144"
	)
	static int method2125(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3591
			Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = PrivateChatMode.loadWorlds() ? 1 : 0; // L: 3592
			return 1; // L: 3593
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3595
				var9 = class21.worldListStart(); // L: 3596
				if (var9 != null) { // L: 3597
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.id; // L: 3598
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.properties; // L: 3599
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.activity; // L: 3600
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.location; // L: 3601
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.population; // L: 3602
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.host; // L: 3603
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3606
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3607
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3608
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3609
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3610
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3611
				}

				return 1; // L: 3613
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3615
				var9 = class13.getNextWorldListWorld(); // L: 3616
				if (var9 != null) { // L: 3617
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.id; // L: 3618
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.properties; // L: 3619
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.activity; // L: 3620
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.location; // L: 3621
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var9.population; // L: 3622
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var9.host; // L: 3623
				} else {
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3626
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3627
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3628
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3629
					Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3630
					Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3631
				}

				return 1; // L: 3633
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3635
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3636
					var7 = null; // L: 3637

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3638
						if (var3 == Messages.World_worlds[var8].id) { // L: 3639
							var7 = Messages.World_worlds[var8]; // L: 3640
							break;
						}
					}

					if (var7 != null) { // L: 3644
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.id; // L: 3645
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.properties; // L: 3646
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.activity; // L: 3647
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.location; // L: 3648
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.population; // L: 3649
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.host; // L: 3650
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3653
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3654
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3655
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3656
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3657
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3658
					}

					return 1; // L: 3660
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3662
					WorldMapCacheName.Interpreter_intStackSize -= 4; // L: 3663
					var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3664
					boolean var10 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1] == 1; // L: 3665
					var8 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 3666
					boolean var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 3] == 1; // L: 3667
					GrandExchangeEvents.sortWorldList(var3, var10, var8, var6); // L: 3668
					return 1; // L: 3669
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3671
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3692
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 3693
						return 1; // L: 3694
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3696
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3697
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3698
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3699
							var5 = WorldMapElement.getParamDefinition(var4); // L: 3700
							if (var5.isString()) { // L: 3701
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class8.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3702
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class8.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3705
							}

							return 1; // L: 3707
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3709
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3710
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3711
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3712
							var5 = WorldMapElement.getParamDefinition(var4); // L: 3713
							if (var5.isString()) { // L: 3714
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = AttackOption.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3715
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = AttackOption.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3718
							}

							return 1; // L: 3720
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3722
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3723
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3724
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3725
							var5 = WorldMapElement.getParamDefinition(var4); // L: 3726
							if (var5.isString()) { // L: 3727
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = Strings.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3728
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Strings.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3731
							}

							return 1; // L: 3733
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3735
							WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 3736
							var3 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 3737
							var4 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 3738
							var5 = WorldMapElement.getParamDefinition(var4); // L: 3739
							if (var5.isString()) { // L: 3740
								Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = class229.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3741
							} else {
								Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = class229.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3744
							}

							return 1; // L: 3746
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3748
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3749
							return 1; // L: 3750
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3752
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3753
							return 1; // L: 3754
						} else if (var0 == 6520) { // L: 3756
							return 1; // L: 3757
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3759
							return 1; // L: 3760
						} else if (var0 == 6522) { // L: 3762
							--class13.Interpreter_stringStackSize; // L: 3763
							--WorldMapCacheName.Interpreter_intStackSize; // L: 3764
							return 1; // L: 3765
						} else if (var0 == 6523) { // L: 3767
							--class13.Interpreter_stringStackSize; // L: 3768
							--WorldMapCacheName.Interpreter_intStackSize; // L: 3769
							return 1; // L: 3770
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3772
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3773
							return 1; // L: 3774
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3776
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 3777
							return 1; // L: 3778
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3780
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 1; // L: 3781
							return 1; // L: 3782
						} else if (var0 == 6527) { // L: 3784
							Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Client.field621; // L: 3785
							return 1; // L: 3786
						} else {
							return 2; // L: 3788
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 3672
					if (var3 >= 0 && var3 < World.World_count) { // L: 3673
						var7 = Messages.World_worlds[var3]; // L: 3674
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.id; // L: 3675
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.properties; // L: 3676
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.activity; // L: 3677
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.location; // L: 3678
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = var7.population; // L: 3679
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = var7.host; // L: 3680
					} else {
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = -1; // L: 3683
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3684
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3685
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3686
						Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = 0; // L: 3687
						Interpreter.Interpreter_stringStack[++class13.Interpreter_stringStackSize - 1] = ""; // L: 3688
					}

					return 1; // L: 3690
				}
			}
		}
	}
}
