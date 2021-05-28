import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cm")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -177863619
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 2035613177
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1151722421
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 886051665
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1737947099
	)
	@Export("y")
	int y;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1509450081
	)
	@Export("height")
	int height;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1147002155
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1179440823
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("s")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.height = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = VarcInt.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = LoginScreenAnimation.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1622052519"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 38
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 39
				++this.frame; // L: 40
				if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 41
					this.isFinished = true; // L: 42
					break;
				}
			}

		}
	} // L: 46

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Lgr;",
		garbageValue = "-76"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarcInt.SpotAnimationDefinition_get(this.id); // L: 49
		Model var2;
		if (!this.isFinished) { // L: 51
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 52
		}

		return var2 == null ? null : var2; // L: 53
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1841267567"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 127
		int var2 = 0; // L: 128

		for (int var3 = 0; var3 < var1; ++var3) { // L: 129
			var2 = (var2 << 5) - var2 + ServerPacket.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 130
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Lbg;",
		garbageValue = "503233534"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? Tiles.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-510374773"
	)
	static int method1892(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) { // L: 3591
			Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = SoundSystem.loadWorlds() ? 1 : 0; // L: 3592
			return 1; // L: 3593
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) { // L: 3595
				var9 = SpotAnimationDefinition.worldListStart(); // L: 3596
				if (var9 != null) { // L: 3597
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.id; // L: 3598
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.properties; // L: 3599
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3600
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.location; // L: 3601
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.population; // L: 3602
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3603
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3606
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3607
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3608
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3609
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3610
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3611
				}

				return 1; // L: 3613
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) { // L: 3615
				var9 = getNextWorldListWorld(); // L: 3616
				if (var9 != null) { // L: 3617
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.id; // L: 3618
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.properties; // L: 3619
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity; // L: 3620
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.location; // L: 3621
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var9.population; // L: 3622
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host; // L: 3623
				} else {
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3626
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3627
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3628
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3629
					Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3630
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3631
				}

				return 1; // L: 3633
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) { // L: 3635
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3636
					var7 = null; // L: 3637

					for (var8 = 0; var8 < World.World_count; ++var8) { // L: 3638
						if (var3 == Tiles.World_worlds[var8].id) { // L: 3639
							var7 = Tiles.World_worlds[var8]; // L: 3640
							break;
						}
					}

					if (var7 != null) { // L: 3644
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.id; // L: 3645
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.properties; // L: 3646
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3647
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.location; // L: 3648
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.population; // L: 3649
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3650
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3653
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3654
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3655
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3656
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3657
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3658
					}

					return 1; // L: 3660
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) { // L: 3662
					class44.Interpreter_intStackSize -= 4; // L: 3663
					var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3664
					boolean var10 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1] == 1; // L: 3665
					var8 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 2]; // L: 3666
					boolean var6 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 3] == 1; // L: 3667
					DirectByteArrayCopier.sortWorldList(var3, var10, var8, var6); // L: 3668
					return 1; // L: 3669
				} else if (var0 != ScriptOpcodes.GETWORLDINFO) { // L: 3671
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) { // L: 3692
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize] == 1; // L: 3693
						return 1; // L: 3694
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) { // L: 3696
							class44.Interpreter_intStackSize -= 2; // L: 3697
							var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3698
							var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3699
							var5 = Varcs.getParamDefinition(var4); // L: 3700
							if (var5.isString()) { // L: 3701
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = StructComposition.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3702
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = StructComposition.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3705
							}

							return 1; // L: 3707
						} else if (var0 == ScriptOpcodes.LC_PARAM) { // L: 3709
							class44.Interpreter_intStackSize -= 2; // L: 3710
							var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3711
							var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3712
							var5 = Varcs.getParamDefinition(var4); // L: 3713
							if (var5.isString()) { // L: 3714
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class23.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3715
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class23.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3718
							}

							return 1; // L: 3720
						} else if (var0 == ScriptOpcodes.OC_PARAM) { // L: 3722
							class44.Interpreter_intStackSize -= 2; // L: 3723
							var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3724
							var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3725
							var5 = Varcs.getParamDefinition(var4); // L: 3726
							if (var5.isString()) { // L: 3727
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class260.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr); // L: 3728
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = class260.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt); // L: 3731
							}

							return 1; // L: 3733
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) { // L: 3735
							class44.Interpreter_intStackSize -= 2; // L: 3736
							var3 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize]; // L: 3737
							var4 = Interpreter.Interpreter_intStack[class44.Interpreter_intStackSize + 1]; // L: 3738
							var5 = Varcs.getParamDefinition(var4); // L: 3739
							if (var5.isString()) { // L: 3740
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ArchiveLoader.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr); // L: 3741
							} else {
								Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = ArchiveLoader.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt); // L: 3744
							}

							return 1; // L: 3746
						} else if (var0 == ScriptOpcodes.ON_MOBILE) { // L: 3748
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0; // L: 3749
							return 1; // L: 3750
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) { // L: 3752
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.clientType & 3; // L: 3753
							return 1; // L: 3754
						} else if (var0 == 6520) { // L: 3756
							return 1; // L: 3757
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) { // L: 3759
							return 1; // L: 3760
						} else if (var0 == 6522) { // L: 3762
							--Interpreter.Interpreter_stringStackSize; // L: 3763
							--class44.Interpreter_intStackSize; // L: 3764
							return 1; // L: 3765
						} else if (var0 == 6523) { // L: 3767
							--Interpreter.Interpreter_stringStackSize; // L: 3768
							--class44.Interpreter_intStackSize; // L: 3769
							return 1; // L: 3770
						} else if (var0 == ScriptOpcodes.BATTERYLEVEL) { // L: 3772
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3773
							return 1; // L: 3774
						} else if (var0 == ScriptOpcodes.BATTERYCHARGING) { // L: 3776
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 3777
							return 1; // L: 3778
						} else if (var0 == ScriptOpcodes.WIFIAVAILABLE) { // L: 3780
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 1; // L: 3781
							return 1; // L: 3782
						} else if (var0 == 6527) { // L: 3784
							Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = Client.field643; // L: 3785
							return 1; // L: 3786
						} else {
							return 2; // L: 3788
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class44.Interpreter_intStackSize]; // L: 3672
					if (var3 >= 0 && var3 < World.World_count) { // L: 3673
						var7 = Tiles.World_worlds[var3]; // L: 3674
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.id; // L: 3675
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.properties; // L: 3676
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity; // L: 3677
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.location; // L: 3678
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = var7.population; // L: 3679
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host; // L: 3680
					} else {
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = -1; // L: 3683
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3684
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3685
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3686
						Interpreter.Interpreter_intStack[++class44.Interpreter_intStackSize - 1] = 0; // L: 3687
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = ""; // L: 3688
					}

					return 1; // L: 3690
				}
			}
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-27"
	)
	@Export("createMinimapSprite")
	static final void createMinimapSprite(int var0) {
		int[] var1 = GameEngine.sceneMinimapSprite.pixels; // L: 5569
		int var2 = var1.length; // L: 5570

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5571
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5572
			var4 = (103 - var3) * 2048 + 24628; // L: 5573

			for (var5 = 1; var5 < 103; ++var5) { // L: 5574
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5575
					AbstractSocket.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5576
					AbstractSocket.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5577
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 5580
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 5581
		GameEngine.sceneMinimapSprite.setRaster(); // L: 5582

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 5583
			for (var6 = 1; var6 < 103; ++var6) { // L: 5584
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 5585
					Coord.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 5586
					Coord.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 5589

		for (var5 = 0; var5 < 104; ++var5) { // L: 5590
			for (var6 = 0; var6 < 104; ++var6) { // L: 5591
				long var7 = AbstractSocket.scene.getFloorDecorationTag(class22.Client_plane, var5, var6); // L: 5592
				if (var7 != 0L) { // L: 5593
					int var9 = class93.Entity_unpackID(var7); // L: 5594
					int var10 = class23.getObjectDefinition(var9).mapIconId; // L: 5595
					if (var10 >= 0 && class6.WorldMapElement_get(var10).field1561) { // L: 5596 5597
						Client.mapIcons[Client.mapIconCount] = class6.WorldMapElement_get(var10).getSpriteBool(false); // L: 5600
						Client.mapIconXs[Client.mapIconCount] = var5; // L: 5601
						Client.mapIconYs[Client.mapIconCount] = var6; // L: 5602
						++Client.mapIconCount; // L: 5603
					}
				}
			}
		}

		class26.rasterProvider.apply(); // L: 5608
	} // L: 5609
}
