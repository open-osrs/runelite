import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("af")
@Implements("WorldMapData_1")
public class WorldMapData_1 extends AbstractWorldMapData {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1324815795
	)
	@Export("chunkXLow")
	int chunkXLow;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1581992363
	)
	@Export("chunkYLow")
	int chunkYLow;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1550350231
	)
	@Export("chunkX")
	int chunkX;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -706955927
	)
	@Export("chunkY")
	int chunkY;

	WorldMapData_1() {
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "-804130257"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 14
		if (var2 != WorldMapID.field296.value) { // L: 15
			throw new IllegalStateException(""); // L: 16
		} else {
			super.minPlane = var1.readUnsignedByte(); // L: 18
			super.planes = var1.readUnsignedByte(); // L: 19
			super.regionXLow = var1.readUnsignedShort(); // L: 20
			super.regionYLow = var1.readUnsignedShort(); // L: 21
			this.chunkXLow = var1.readUnsignedByte(); // L: 22
			this.chunkYLow = var1.readUnsignedByte(); // L: 23
			super.regionX = var1.readUnsignedShort(); // L: 24
			super.regionY = var1.readUnsignedShort(); // L: 25
			this.chunkX = var1.readUnsignedByte(); // L: 26
			this.chunkY = var1.readUnsignedByte();
			super.groupId = var1.method5559();
			super.fileId = var1.method5559();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V",
		garbageValue = "1878970684"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64]; // L: 34
		super.floorOverlayIds = new short[super.planes][64][64]; // L: 35
		super.field178 = new byte[super.planes][64][64]; // L: 36
		super.field177 = new byte[super.planes][64][64]; // L: 37
		super.decorations = new WorldMapDecoration[super.planes][64][64][]; // L: 38
		int var2 = var1.readUnsignedByte(); // L: 39
		if (var2 != class39.field277.value) { // L: 40
			throw new IllegalStateException(""); // L: 41
		} else {
			int var3 = var1.readUnsignedByte(); // L: 43
			int var4 = var1.readUnsignedByte(); // L: 44
			int var5 = var1.readUnsignedByte(); // L: 45
			int var6 = var1.readUnsignedByte(); // L: 46
			if (var3 == super.regionX && var4 == super.regionY && var5 == this.chunkX && var6 == this.chunkY) { // L: 47
				for (int var7 = 0; var7 < 8; ++var7) { // L: 50
					for (int var8 = 0; var8 < 8; ++var8) { // L: 51
						this.readTile(var7 + this.chunkX * 8, var8 + this.chunkY * 8, var1); // L: 52
					}
				}

			} else {
				throw new IllegalStateException(""); // L: 48
			}
		}
	} // L: 55

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915979405"
	)
	@Export("getChunkXLow")
	int getChunkXLow() {
		return this.chunkXLow; // L: 73
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1034896406"
	)
	@Export("getChunkYLow")
	int getChunkYLow() {
		return this.chunkYLow; // L: 77
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "3"
	)
	@Export("getChunkX")
	int getChunkX() {
		return this.chunkX; // L: 81
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1372566315"
	)
	@Export("getChunkY")
	int getChunkY() {
		return this.chunkY; // L: 85
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_1)) { // L: 58
			return false; // L: 59
		} else {
			WorldMapData_1 var2 = (WorldMapData_1)var1; // L: 61
			if (var2.regionX == super.regionX && var2.regionY == super.regionY) { // L: 62
				return var2.chunkX == this.chunkX && this.chunkY == var2.chunkY; // L: 65
			} else {
				return false; // L: 63
			}
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8 | this.chunkX << 16 | this.chunkY << 24; // L: 69
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lif;",
		garbageValue = "1792117497"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0); // L: 27
		if (var1 != null) { // L: 28
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 29
			var1 = new KitDefinition(); // L: 30
			if (var2 != null) { // L: 31
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 32
			return var1; // L: 33
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZB)I",
		garbageValue = "6"
	)
	static int method736(int var0, Script var1, boolean var2) {
		int var4 = -1; // L: 550
		Widget var3;
		if (var0 >= 2000) { // L: 551
			var0 -= 1000; // L: 552
			var4 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 553
			var3 = CollisionMap.getWidget(var4); // L: 554
		} else {
			var3 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264; // L: 556
		}

		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) { // L: 557
			VarcInt.Interpreter_intStackSize -= 2; // L: 558
			var3.scrollX = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 559
			if (var3.scrollX > var3.scrollWidth - var3.width) { // L: 560
				var3.scrollX = var3.scrollWidth - var3.width;
			}

			if (var3.scrollX < 0) { // L: 561
				var3.scrollX = 0;
			}

			var3.scrollY = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 562
			if (var3.scrollY > var3.scrollHeight - var3.height) { // L: 563
				var3.scrollY = var3.scrollHeight - var3.height;
			}

			if (var3.scrollY < 0) { // L: 564
				var3.scrollY = 0;
			}

			CollisionMap.invalidateWidget(var3); // L: 565
			return 1; // L: 566
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) { // L: 568
			var3.color = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 569
			CollisionMap.invalidateWidget(var3); // L: 570
			return 1; // L: 571
		} else if (var0 == ScriptOpcodes.CC_SETFILL) { // L: 573
			var3.fill = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 574
			CollisionMap.invalidateWidget(var3); // L: 575
			return 1; // L: 576
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) { // L: 578
			var3.transparencyTop = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 579
			CollisionMap.invalidateWidget(var3); // L: 580
			return 1; // L: 581
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) { // L: 583
			var3.lineWid = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 584
			CollisionMap.invalidateWidget(var3); // L: 585
			return 1; // L: 586
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) { // L: 588
			var3.spriteId2 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 589
			CollisionMap.invalidateWidget(var3); // L: 590
			return 1; // L: 591
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) { // L: 593
			var3.spriteAngle = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 594
			CollisionMap.invalidateWidget(var3); // L: 595
			return 1; // L: 596
		} else if (var0 == ScriptOpcodes.CC_SETTILING) { // L: 598
			var3.spriteTiling = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 599
			CollisionMap.invalidateWidget(var3); // L: 600
			return 1; // L: 601
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) { // L: 603
			var3.modelType = 1; // L: 604
			var3.modelId = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 605
			CollisionMap.invalidateWidget(var3); // L: 606
			return 1; // L: 607
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) { // L: 609
			VarcInt.Interpreter_intStackSize -= 6; // L: 610
			var3.modelOffsetX = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 611
			var3.modelOffsetY = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 612
			var3.modelAngleX = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 613
			var3.modelAngleY = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3]; // L: 614
			var3.modelAngleZ = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 4]; // L: 615
			var3.modelZoom = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 5]; // L: 616
			CollisionMap.invalidateWidget(var3); // L: 617
			return 1; // L: 618
		} else {
			int var8;
			if (var0 == ScriptOpcodes.CC_SETMODELANIM) { // L: 620
				var8 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 621
				if (var8 != var3.sequenceId) { // L: 622
					var3.sequenceId = var8; // L: 623
					var3.modelFrame = 0; // L: 624
					var3.modelFrameCycle = 0; // L: 625
					CollisionMap.invalidateWidget(var3); // L: 626
				}

				return 1; // L: 628
			} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) { // L: 630
				var3.modelOrthog = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 631
				CollisionMap.invalidateWidget(var3); // L: 632
				return 1; // L: 633
			} else if (var0 == ScriptOpcodes.CC_SETTEXT) { // L: 635
				String var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize]; // L: 636
				if (!var7.equals(var3.text)) { // L: 637
					var3.text = var7; // L: 638
					CollisionMap.invalidateWidget(var3); // L: 639
				}

				return 1; // L: 641
			} else if (var0 == ScriptOpcodes.CC_SETTEXTFONT) { // L: 643
				var3.fontId = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 644
				CollisionMap.invalidateWidget(var3); // L: 645
				return 1; // L: 646
			} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) { // L: 648
				VarcInt.Interpreter_intStackSize -= 3; // L: 649
				var3.textXAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 650
				var3.textYAlignment = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 651
				var3.textLineHeight = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2]; // L: 652
				CollisionMap.invalidateWidget(var3); // L: 653
				return 1; // L: 654
			} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) { // L: 656
				var3.textShadowed = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 657
				CollisionMap.invalidateWidget(var3); // L: 658
				return 1; // L: 659
			} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) { // L: 661
				var3.outline = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 662
				CollisionMap.invalidateWidget(var3); // L: 663
				return 1; // L: 664
			} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) { // L: 666
				var3.spriteShadow = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 667
				CollisionMap.invalidateWidget(var3); // L: 668
				return 1; // L: 669
			} else if (var0 == ScriptOpcodes.CC_SETVFLIP) { // L: 671
				var3.spriteFlipV = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 672
				CollisionMap.invalidateWidget(var3); // L: 673
				return 1; // L: 674
			} else if (var0 == ScriptOpcodes.CC_SETHFLIP) { // L: 676
				var3.spriteFlipH = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 677
				CollisionMap.invalidateWidget(var3); // L: 678
				return 1; // L: 679
			} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) { // L: 681
				VarcInt.Interpreter_intStackSize -= 2; // L: 682
				var3.scrollWidth = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]; // L: 683
				var3.scrollHeight = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]; // L: 684
				CollisionMap.invalidateWidget(var3); // L: 685
				if (var4 != -1 && var3.type == 0) { // L: 686
					PendingSpawn.revalidateWidgetScroll(class9.Widget_interfaceComponents[var4 >> 16], var3, false);
				}

				return 1; // L: 687
			} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) { // L: 689
				DynamicObject.resumePauseWidget(var3.id, var3.childIndex); // L: 690
				Client.meslayerContinueWidget = var3; // L: 691
				CollisionMap.invalidateWidget(var3); // L: 692
				return 1; // L: 693
			} else if (var0 == 1122) { // L: 695
				var3.spriteId = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 696
				CollisionMap.invalidateWidget(var3); // L: 697
				return 1; // L: 698
			} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) { // L: 700
				var3.color2 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 701
				CollisionMap.invalidateWidget(var3); // L: 702
				return 1; // L: 703
			} else if (var0 == 1124) { // L: 705
				var3.transparencyBot = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 706
				CollisionMap.invalidateWidget(var3); // L: 707
				return 1; // L: 708
			} else if (var0 == ScriptOpcodes.CC_SETFILLMODE) { // L: 710
				var8 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]; // L: 711
				class333 var6 = (class333)UrlRequester.findEnumerated(NetSocket.FillMode_values(), var8); // L: 712
				if (var6 != null) { // L: 713
					var3.fillMode = var6; // L: 714
					CollisionMap.invalidateWidget(var3); // L: 715
				}

				return 1; // L: 717
			} else {
				boolean var5;
				if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) { // L: 719
					var5 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 720
					var3.field2620 = var5; // L: 721
					return 1; // L: 722
				} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) { // L: 724
					var5 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1; // L: 725
					var3.modelTransparency = var5; // L: 726
					return 1; // L: 727
				} else {
					return 2; // L: 729
				}
			}
		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1785957932"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) { // L: 6987
			if (Client.isLowDetail && var0 != GameObject.Client_plane) { // L: 6988
				return;
			}

			long var7 = 0L; // L: 6989
			boolean var9 = true; // L: 6990
			boolean var10 = false; // L: 6991
			boolean var11 = false; // L: 6992
			if (var1 == 0) { // L: 6993
				var7 = ArchiveLoader.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) { // L: 6994
				var7 = ArchiveLoader.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) { // L: 6995
				var7 = ArchiveLoader.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) { // L: 6996
				var7 = ArchiveLoader.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var12;
			if (var7 != 0L) { // L: 6997
				var12 = ArchiveLoader.scene.getObjectFlags(var0, var2, var3, var7); // L: 6998
				int var14 = Occluder.Entity_unpackID(var7); // L: 6999
				int var15 = var12 & 31; // L: 7000
				int var16 = var12 >> 6 & 3; // L: 7001
				ObjectComposition var13;
				if (var1 == 0) { // L: 7002
					ArchiveLoader.scene.removeBoundaryObject(var0, var2, var3); // L: 7003
					var13 = WorldMapDecoration.getObjectDefinition(var14); // L: 7004
					if (var13.interactType != 0) { // L: 7005
						Client.collisionMaps[var0].method3616(var2, var3, var15, var16, var13.boolean1);
					}
				}

				if (var1 == 1) { // L: 7007
					ArchiveLoader.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) { // L: 7008
					ArchiveLoader.scene.removeGameObject(var0, var2, var3); // L: 7009
					var13 = WorldMapDecoration.getObjectDefinition(var14); // L: 7010
					if (var2 + var13.sizeX > 103 || var3 + var13.sizeX > 103 || var2 + var13.sizeY > 103 || var3 + var13.sizeY > 103) { // L: 7011
						return;
					}

					if (var13.interactType != 0) { // L: 7012
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var13.sizeX, var13.sizeY, var16, var13.boolean1);
					}
				}

				if (var1 == 3) { // L: 7014
					ArchiveLoader.scene.removeFloorDecoration(var0, var2, var3); // L: 7015
					var13 = WorldMapDecoration.getObjectDefinition(var14); // L: 7016
					if (var13.interactType == 1) { // L: 7017
						Client.collisionMaps[var0].method3619(var2, var3);
					}
				}
			}

			if (var4 >= 0) { // L: 7020
				var12 = var0; // L: 7021
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 7022
					var12 = var0 + 1;
				}

				ScriptEvent.method1259(var0, var12, var2, var3, var4, var5, var6, ArchiveLoader.scene, Client.collisionMaps[var0]); // L: 7023
			}
		}

	} // L: 7026

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "155276335"
	)
	static void method767() {
		for (int var0 = 0; var0 < Client.menuOptionsCount; ++var0) { // L: 8528
			if (WorldMapSection1.method624(Client.menuOpcodes[var0])) { // L: 8529
				if (var0 < Client.menuOptionsCount - 1) { // L: 8530
					for (int var1 = var0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 8531
						Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 8532
						Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 8533
						Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 8534
						Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 8535
						Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 8536
						Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 8537
						Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 8538
					}
				}

				--var0; // L: 8541
				--Client.menuOptionsCount; // L: 8542
			}
		}

		BuddyRankComparator.method3522(Occluder.menuWidth / 2 + AbstractUserComparator.menuX, DynamicObject.menuY); // L: 8546
	} // L: 8548
}
