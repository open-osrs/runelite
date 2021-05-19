import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("h")
	@Export("args")
	Object[] args;
	@ObfuscatedName("c")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -536753663
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1589642175
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1051394147
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1110784837
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1654982573
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("q")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1407639647
	)
	int field1140;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1084436757
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-2043975850"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1691988247"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnm;ILcg;IB)V",
		garbageValue = "106"
	)
	static final void method2116(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = -1; // L: 483
		if ((var3 & 8) != 0) { // L: 484
			var2.targetIndex = var0.readUnsignedShort(); // L: 485
			if (var2.targetIndex == 65535) { // L: 486
				var2.targetIndex = -1;
			}
		}

		int var5;
		if ((var3 & 256) != 0) { // L: 488
			var2.spotAnimation = var0.method6486(); // L: 489
			var5 = var0.method6481(); // L: 490
			var2.field1224 = var5 >> 16; // L: 491
			var2.field1243 = (var5 & 65535) + Client.cycle; // L: 492
			var2.spotAnimationFrame = 0; // L: 493
			var2.spotAnimationFrameCycle = 0; // L: 494
			if (var2.field1243 > Client.cycle) { // L: 495
				var2.spotAnimationFrame = -1;
			}

			if (var2.spotAnimation == 65535) { // L: 496
				var2.spotAnimation = -1;
			}
		}

		int var6;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) { // L: 498
			var5 = var0.method6478(); // L: 499
			int var7;
			int var10;
			int var15;
			if (var5 > 0) { // L: 500
				for (var6 = 0; var6 < var5; ++var6) { // L: 501
					var8 = -1; // L: 503
					var9 = -1; // L: 504
					var10 = -1; // L: 505
					var7 = var0.readUShortSmart(); // L: 506
					if (var7 == 32767) { // L: 507
						var7 = var0.readUShortSmart(); // L: 508
						var9 = var0.readUShortSmart(); // L: 509
						var8 = var0.readUShortSmart(); // L: 510
						var10 = var0.readUShortSmart(); // L: 511
					} else if (var7 != 32766) { // L: 513
						var9 = var0.readUShortSmart(); // L: 514
					} else {
						var7 = -1; // L: 516
					}

					var15 = var0.readUShortSmart(); // L: 517
					var2.addHitSplat(var7, var9, var8, var10, Client.cycle, var15); // L: 518
				}
			}

			var6 = var0.readUnsignedByte(); // L: 521
			if (var6 > 0) { // L: 522
				for (var7 = 0; var7 < var6; ++var7) { // L: 523
					var8 = var0.readUShortSmart(); // L: 524
					var9 = var0.readUShortSmart(); // L: 525
					if (var9 != 32767) { // L: 526
						var10 = var0.readUShortSmart(); // L: 527
						var15 = var0.method6477(); // L: 528
						var12 = var9 > 0 ? var0.method6476() : var15; // L: 529
						var2.addHealthBar(var8, Client.cycle, var9, var10, var15, var12); // L: 530
					} else {
						var2.removeHealthBar(var8); // L: 532
					}
				}
			}
		}

		if ((var3 & 1) != 0) { // L: 536
			var2.field1247 = var0.method6648(); // L: 537
			if (var2.pathLength == 0) { // L: 538
				var2.orientation = var2.field1247; // L: 539
				var2.field1247 = -1; // L: 540
			}
		}

		if ((var3 & 2048) != 0) { // L: 543
			Players.field1345[var1] = var0.method6480(); // L: 544
		}

		if ((var3 & 512) != 0) { // L: 546
			for (var5 = 0; var5 < 3; ++var5) { // L: 547
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8192) != 0) { // L: 549
			var2.field1236 = var0.method6526(); // L: 550
			var2.field1252 = var0.method6530(); // L: 551
			var2.field1251 = var0.method6530(); // L: 552
			var2.field1253 = var0.method6480(); // L: 553
			var2.field1254 = var0.readUnsignedShort() + Client.cycle; // L: 554
			var2.field1237 = var0.method6486() + Client.cycle; // L: 555
			var2.field1256 = var0.method6648(); // L: 556
			if (var2.field1186) { // L: 557
				var2.field1236 += var2.tileX; // L: 558
				var2.field1252 += var2.tileY; // L: 559
				var2.field1251 += var2.tileX; // L: 560
				var2.field1253 += var2.tileY; // L: 561
				var2.pathLength = 0; // L: 562
			} else {
				var2.field1236 += var2.pathX[0]; // L: 565
				var2.field1252 += var2.pathY[0]; // L: 566
				var2.field1251 += var2.pathX[0]; // L: 567
				var2.field1253 += var2.pathY[0]; // L: 568
				var2.pathLength = 1; // L: 569
			}

			var2.field1215 = 0; // L: 571
		}

		if ((var3 & 64) != 0) { // L: 573
			var5 = var0.method6486(); // L: 574
			PlayerType var13 = (PlayerType)UserComparator4.findEnumerated(class249.PlayerType_values(), var0.method6478()); // L: 575
			boolean var17 = var0.method6476() == 1; // L: 576
			var8 = var0.method6476(); // L: 577
			var9 = var0.offset; // L: 578
			if (var2.username != null && var2.appearance != null) { // L: 579
				boolean var18 = false; // L: 580
				if (var13.isUser && GrandExchangeOfferUnitPriceComparator.friendSystem.isIgnored(var2.username)) { // L: 581 582
					var18 = true;
				}

				if (!var18 && Client.field727 == 0 && !var2.isHidden) { // L: 584
					Players.field1357.offset = 0; // L: 585
					var0.method6499(Players.field1357.array, 0, var8); // L: 586
					Players.field1357.offset = 0; // L: 587
					String var11 = AbstractFont.escapeBrackets(Clock.method2592(class22.method299(Players.field1357))); // L: 588
					var2.overheadText = var11.trim(); // L: 589
					var2.overheadTextColor = var5 >> 8; // L: 590
					var2.overheadTextEffect = var5 & 255; // L: 591
					var2.overheadTextCyclesRemaining = 150; // L: 592
					var2.isAutoChatting = var17; // L: 593
					var2.field1223 = var2 != class35.localPlayer && var13.isUser && "" != Client.field843 && var11.toLowerCase().indexOf(Client.field843) == -1; // L: 594
					if (var13.isPrivileged) { // L: 596
						var12 = var17 ? 91 : 1;
					} else {
						var12 = var17 ? 90 : 2; // L: 597
					}

					if (var13.modIcon != -1) { // L: 598
						WorldMapScaleHandler.addGameMessage(var12, class169.method3495(var13.modIcon) + var2.username.getName(), var11);
					} else {
						WorldMapScaleHandler.addGameMessage(var12, var2.username.getName(), var11); // L: 599
					}
				}
			}

			var0.offset = var9 + var8; // L: 602
		}

		if ((var3 & 2) != 0) { // L: 604
			var5 = var0.method6476(); // L: 605
			byte[] var19 = new byte[var5]; // L: 606
			Buffer var14 = new Buffer(var19); // L: 607
			var0.method6499(var19, 0, var5); // L: 608
			Players.field1346[var1] = var14; // L: 609
			var2.read(var14); // L: 610
		}

		if ((var3 & 4) != 0) { // L: 612
			var5 = var0.method6620(); // L: 613
			if (var5 == 65535) { // L: 614
				var5 = -1;
			}

			var6 = var0.method6476(); // L: 615
			class69.performPlayerAnimation(var2, var5, var6); // L: 616
		}

		if ((var3 & 4096) != 0) { // L: 618
			var4 = var0.method6530(); // L: 619
		}

		if ((var3 & 32) != 0) { // L: 621
			var2.overheadText = var0.readStringCp1252NullTerminated(); // L: 622
			if (var2.overheadText.charAt(0) == '~') { // L: 623
				var2.overheadText = var2.overheadText.substring(1); // L: 624
				WorldMapScaleHandler.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 625
			} else if (var2 == class35.localPlayer) { // L: 627
				WorldMapScaleHandler.addGameMessage(2, var2.username.getName(), var2.overheadText); // L: 628
			}

			var2.isAutoChatting = false; // L: 630
			var2.overheadTextColor = 0; // L: 631
			var2.overheadTextEffect = 0; // L: 632
			var2.overheadTextCyclesRemaining = 150; // L: 633
		}

		if (var2.field1186) { // L: 635
			if (var4 == 127) { // L: 636
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				byte var16;
				if (var4 != -1) { // L: 639
					var16 = var4;
				} else {
					var16 = Players.field1345[var1]; // L: 640
				}

				var2.method2140(var2.tileX, var2.tileY, var16); // L: 641
			}
		}

	} // L: 645

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZS)I",
		garbageValue = "-4573"
	)
	static int method2120(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 834
		Widget var4;
		if (var0 >= 2000) { // L: 836
			var0 -= 1000; // L: 837
			var4 = DevicePcmPlayerProvider.getWidget(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]); // L: 838
			var3 = false; // L: 839
		} else {
			var4 = var2 ? class308.scriptDotWidget : class24.scriptActiveWidget; // L: 841
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 842
			var11 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] - 1; // L: 843
			if (var11 >= 0 && var11 <= 9) { // L: 844
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]); // L: 848
				return 1; // L: 849
			} else {
				--class13.Interpreter_stringStackSize; // L: 845
				return 1; // L: 846
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 851
				WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 852
				var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]; // L: 853
				var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 854
				var4.parent = PacketWriter.getWidgetChild(var11, var6); // L: 855
				return 1; // L: 856
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 858
				var4.isScrollBar = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 859
				return 1; // L: 860
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 862
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 863
				return 1; // L: 864
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 866
				var4.dragThreshold = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 867
				return 1; // L: 868
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 870
				var4.dataText = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 871
				return 1; // L: 872
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 874
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class13.Interpreter_stringStackSize]; // L: 875
				return 1; // L: 876
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 878
				var4.actions = null; // L: 879
				return 1; // L: 880
			} else if (var0 == 1308) { // L: 882
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] == 1; // L: 883
				return 1; // L: 884
			} else if (var0 == 1309) { // L: 886
				--WorldMapCacheName.Interpreter_intStackSize; // L: 887
				return 1; // L: 888
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 890
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 920
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 921
						var5 = 10; // L: 922
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]}; // L: 923
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]}; // L: 924
						ServerPacket.Widget_setKey(var4, var5, var8, var9); // L: 925
						return 1; // L: 926
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 928
						WorldMapCacheName.Interpreter_intStackSize -= 3; // L: 929
						var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] - 1; // L: 930
						var6 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 931
						var7 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]; // L: 932
						if (var11 >= 0 && var11 <= 9) { // L: 933
							LoginPacket.Widget_setKeyRate(var4, var11, var6, var7); // L: 936
							return 1; // L: 937
						} else {
							throw new RuntimeException(); // L: 934
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 939
						var5 = 10; // L: 940
						var6 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 941
						var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]; // L: 942
						LoginPacket.Widget_setKeyRate(var4, var5, var6, var7); // L: 943
						return 1; // L: 944
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 946
						--WorldMapCacheName.Interpreter_intStackSize; // L: 947
						var11 = Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize] - 1; // L: 948
						if (var11 >= 0 && var11 <= 9) { // L: 949
							SoundSystem.Widget_setKeyIgnoreHeld(var4, var11); // L: 952
							return 1; // L: 953
						} else {
							throw new RuntimeException(); // L: 950
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 955
						var5 = 10; // L: 956
						SoundSystem.Widget_setKeyIgnoreHeld(var4, var5); // L: 957
						return 1; // L: 958
					} else {
						return 2; // L: 960
					}
				} else {
					byte[] var10 = null; // L: 891
					var8 = null; // L: 892
					if (var3) { // L: 893
						WorldMapCacheName.Interpreter_intStackSize -= 10; // L: 894

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + WorldMapCacheName.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 896 897
						}

						if (var7 > 0) { // L: 899
							var10 = new byte[var7 / 2]; // L: 900
							var8 = new byte[var7 / 2]; // L: 901

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 902
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + WorldMapCacheName.Interpreter_intStackSize]; // L: 903
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + WorldMapCacheName.Interpreter_intStackSize + 1]; // L: 904
							}
						}
					} else {
						WorldMapCacheName.Interpreter_intStackSize -= 2; // L: 909
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize]}; // L: 910
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]}; // L: 911
					}

					var7 = Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize] - 1; // L: 913
					if (var7 >= 0 && var7 <= 9) { // L: 914
						ServerPacket.Widget_setKey(var4, var7, var10, var8); // L: 917
						return 1; // L: 918
					} else {
						throw new RuntimeException(); // L: 915
					}
				}
			}
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1097710894"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9132
			InterfaceParent.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9133
		}

		long var4 = -1L; // L: 9136
		long var6 = -1L; // L: 9137
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount; // L: 9142
			if (var8 >= var10) { // L: 9144
				if (var4 != -1L) { // L: 9273
					var8 = (int)(var4 >>> 0 & 127L); // L: 9276
					var10 = (int)(var4 >>> 7 & 127L); // L: 9281
					Player var12 = Client.players[Client.combatTargetPlayerIndex]; // L: 9284
					FontName.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10); // L: 9285
				}

				return; // L: 9287
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9147
			if (var6 != var26) { // L: 9150
				label326: {
					var6 = var26; // L: 9151
					int var15 = InterfaceParent.method2111(var8); // L: 9152
					int var16 = MouseHandler.method688(var8); // L: 9153
					int var17 = VarbitComposition.method2813(var8); // L: 9154
					int var18 = class6.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 9157
					int var19 = var18; // L: 9159
					if (var17 == 2 && class5.scene.getObjectFlags(ParamComposition.Client_plane, var15, var16, var26) >= 0) { // L: 9160 9161
						ObjectComposition var20 = AttackOption.getObjectDefinition(var18); // L: 9162
						if (var20.transforms != null) { // L: 9163
							var20 = var20.transform();
						}

						if (var20 == null) { // L: 9164
							break label326;
						}

						if (Client.isItemSelected == 1) { // L: 9165
							InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(65535) + var20.name, 1, var18, var15, var16); // L: 9166
						} else if (Client.isSpellSelected) { // L: 9169
							if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 4) == 4) { // L: 9170
								InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(65535) + var20.name, 2, var18, var15, var16); // L: 9171
							}
						} else {
							String[] var21 = var20.actions; // L: 9176
							if (var21 != null) { // L: 9177
								for (int var22 = 4; var22 >= 0; --var22) { // L: 9178
									if (var21[var22] != null) { // L: 9179
										short var23 = 0; // L: 9180
										if (var22 == 0) { // L: 9181
											var23 = 3;
										}

										if (var22 == 1) { // L: 9182
											var23 = 4;
										}

										if (var22 == 2) { // L: 9183
											var23 = 5;
										}

										if (var22 == 3) { // L: 9184
											var23 = 6;
										}

										if (var22 == 4) { // L: 9185
											var23 = 1001;
										}

										InterfaceParent.insertMenuItemNoShift(var21[var22], HorizontalAlignment.colorStartTag(65535) + var20.name, var23, var19, var15, var16); // L: 9186
									}
								}
							}

							InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var16); // L: 9191
						}
					}

					Player var24;
					int var28;
					NPC var29;
					int var36;
					int[] var37;
					if (var17 == 1) { // L: 9196
						NPC var32 = Client.npcs[var19]; // L: 9197
						if (var32 == null) { // L: 9198
							break label326;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) { // L: 9199
							for (var28 = 0; var28 < Client.npcCount; ++var28) { // L: 9200
								var29 = Client.npcs[Client.npcIndices[var28]]; // L: 9201
								if (var29 != null && var29 != var32 && var29.definition.size == 1 && var29.x == var32.x && var32.y == var29.y) { // L: 9202
									Script.addNpcToMenu(var29.definition, Client.npcIndices[var28], var15, var16);
								}
							}

							var28 = Players.Players_count; // L: 9204
							var37 = Players.Players_indices; // L: 9205

							for (var36 = 0; var36 < var28; ++var36) { // L: 9206
								var24 = Client.players[var37[var36]]; // L: 9207
								if (var24 != null && var24.x == var32.x && var32.y == var24.y) { // L: 9208
									FontName.addPlayerToMenu(var24, var37[var36], var15, var16);
								}
							}
						}

						Script.addNpcToMenu(var32.definition, var19, var15, var16); // L: 9211
					}

					if (var17 == 0) { // L: 9213
						Player var33 = Client.players[var19]; // L: 9214
						if (var33 == null) { // L: 9215
							break label326;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 9216
							for (var28 = 0; var28 < Client.npcCount; ++var28) { // L: 9217
								var29 = Client.npcs[Client.npcIndices[var28]]; // L: 9218
								if (var29 != null && var29.definition.size == 1 && var33.x == var29.x && var33.y == var29.y) { // L: 9219
									Script.addNpcToMenu(var29.definition, Client.npcIndices[var28], var15, var16);
								}
							}

							var28 = Players.Players_count; // L: 9221
							var37 = Players.Players_indices; // L: 9222

							for (var36 = 0; var36 < var28; ++var36) { // L: 9223
								var24 = Client.players[var37[var36]]; // L: 9224
								if (var24 != null && var33 != var24 && var33.x == var24.x && var24.y == var33.y) { // L: 9225
									FontName.addPlayerToMenu(var24, var37[var36], var15, var16);
								}
							}
						}

						if (var19 != Client.combatTargetPlayerIndex) { // L: 9228
							FontName.addPlayerToMenu(var33, var19, var15, var16);
						} else {
							var4 = var26; // L: 9229
						}
					}

					if (var17 == 3) { // L: 9231
						NodeDeque var35 = Client.groundItems[ParamComposition.Client_plane][var15][var16]; // L: 9232
						if (var35 != null) { // L: 9233
							for (TileItem var34 = (TileItem)var35.first(); var34 != null; var34 = (TileItem)var35.next()) { // L: 9234 9235 9268
								ItemComposition var38 = Strings.ItemDefinition_get(var34.id); // L: 9236
								if (Client.isItemSelected == 1) { // L: 9237
									InterfaceParent.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var38.name, 16, var34.id, var15, var16); // L: 9238
								} else if (Client.isSpellSelected) { // L: 9241
									if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 1) == 1) { // L: 9242
										InterfaceParent.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HorizontalAlignment.colorStartTag(16748608) + var38.name, 17, var34.id, var15, var16); // L: 9243
									}
								} else {
									String[] var30 = var38.groundActions; // L: 9248

									for (int var31 = 4; var31 >= 0; --var31) { // L: 9249
										if (var30 != null && var30[var31] != null) { // L: 9250
											byte var25 = 0; // L: 9251
											if (var31 == 0) { // L: 9252
												var25 = 18;
											}

											if (var31 == 1) { // L: 9253
												var25 = 19;
											}

											if (var31 == 2) { // L: 9254
												var25 = 20;
											}

											if (var31 == 3) { // L: 9255
												var25 = 21;
											}

											if (var31 == 4) { // L: 9256
												var25 = 22;
											}

											InterfaceParent.insertMenuItemNoShift(var30[var31], HorizontalAlignment.colorStartTag(16748608) + var38.name, var25, var34.id, var15, var16); // L: 9257
										} else if (var31 == 2) { // L: 9260
											InterfaceParent.insertMenuItemNoShift("Take", HorizontalAlignment.colorStartTag(16748608) + var38.name, 20, var34.id, var15, var16); // L: 9261
										}
									}

									InterfaceParent.insertMenuItemNoShift("Examine", HorizontalAlignment.colorStartTag(16748608) + var38.name, 1004, var34.id, var15, var16); // L: 9265
								}
							}
						}
					}
				}
			}

			++var8; // L: 9138
		}
	}
}
