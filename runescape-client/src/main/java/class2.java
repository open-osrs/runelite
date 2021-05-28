import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class2 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 4932681583424374285L
	)
	long field21;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2049607965
	)
	int field13;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	IterableNodeDeque field14;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	public class2(Buffer var1) {
		this.field13 = -1; // L: 9
		this.field14 = new IterableNodeDeque(); // L: 10
		this.method19(var1); // L: 28
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "1835710687"
	)
	void method19(Buffer var1) {
		this.field21 = var1.readLong(); // L: 32
		this.field13 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class13(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class8(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class26(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class17(this);
			} else if (var2 == 6) {
				var3 = new class10(this); // L: 41
			} else if (var2 == 5) { // L: 42
				var3 = new class22(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class23(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class21(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class18(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class6(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class0(this);
			} else if (var2 == 10) { // L: 48
				var3 = new class4(this);
			} else if (var2 == 11) { // L: 49
				var3 = new class1(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class15(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class27(this);
			}

			((class14)var3).vmethod276(var1); // L: 53
			this.field14.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;I)V",
		garbageValue = "-184881258"
	)
	public void method16(ClanSettings var1) {
		if (var1.field109 == this.field21 && this.field13 == var1.field94) { // L: 60
			for (class14 var2 = (class14)this.field14.last(); var2 != null; var2 = (class14)this.field14.previous()) { // L: 61
				var2.vmethod281(var1); // L: 62
			}

			++var1.field94; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(Lcy;B)V",
		garbageValue = "0"
	)
	static final void method21(Actor var0) {
		if (var0.field1283 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > LoginScreenAnimation.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) { // L: 3647
			int var1 = var0.field1283 - var0.field1265; // L: 3648
			int var2 = Client.cycle - var0.field1265; // L: 3649
			int var3 = var0.field1239 * 64 + var0.field1278 * 128; // L: 3650
			int var4 = var0.field1239 * 64 + var0.field1280 * 128; // L: 3651
			int var5 = var0.field1239 * 64 + var0.field1269 * 128; // L: 3652
			int var6 = var0.field1239 * 64 + var0.field1238 * 128; // L: 3653
			var0.x = (var5 * var2 + var3 * (var1 - var2)) / var1; // L: 3654
			var0.y = (var2 * var6 + var4 * (var1 - var2)) / var1; // L: 3655
		}

		var0.field1294 = 0; // L: 3657
		var0.orientation = var0.field1284; // L: 3658
		var0.rotation = var0.orientation; // L: 3659
	} // L: 3660

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1987725219"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 8855
			Occluder.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 8856
		}

		long var4 = -1L; // L: 8859
		long var6 = -1L; // L: 8860

		int var8;
		for (var8 = 0; var8 < ItemComposition.method3084(); ++var8) { // L: 8861
			long var22 = HealthBarDefinition.method2720(var8); // L: 8862
			if (var22 != var6) { // L: 8863
				var6 = var22; // L: 8864
				int var11 = class5.method58(var8); // L: 8865
				int var12 = GrandExchangeOfferOwnWorldComparator.method1166(var8); // L: 8866
				int var13 = class261.method4842(var8); // L: 8867
				int var14 = class93.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 8870
				int var15 = var14; // L: 8872
				if (var13 == 2 && AbstractSocket.scene.getObjectFlags(class22.Client_plane, var11, var12, var22) >= 0) { // L: 8873 8874
					ObjectComposition var16 = class23.getObjectDefinition(var14); // L: 8875
					if (var16.transforms != null) { // L: 8876
						var16 = var16.transform();
					}

					if (var16 == null) { // L: 8877
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 8878
						Occluder.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class44.colorStartTag(65535) + var16.name, 1, var14, var11, var12); // L: 8879
					} else if (Client.isSpellSelected) { // L: 8882
						if ((class4.selectedSpellFlags & 4) == 4) { // L: 8883
							Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class44.colorStartTag(65535) + var16.name, 2, var14, var11, var12); // L: 8884
						}
					} else {
						String[] var17 = var16.actions; // L: 8889
						if (var17 != null) { // L: 8890
							for (int var18 = 4; var18 >= 0; --var18) { // L: 8891
								if (var17[var18] != null) { // L: 8892
									short var19 = 0; // L: 8893
									if (var18 == 0) { // L: 8894
										var19 = 3;
									}

									if (var18 == 1) { // L: 8895
										var19 = 4;
									}

									if (var18 == 2) { // L: 8896
										var19 = 5;
									}

									if (var18 == 3) { // L: 8897
										var19 = 6;
									}

									if (var18 == 4) { // L: 8898
										var19 = 1001;
									}

									Occluder.insertMenuItemNoShift(var17[var18], class44.colorStartTag(65535) + var16.name, var19, var15, var11, var12); // L: 8899
								}
							}
						}

						Occluder.insertMenuItemNoShift("Examine", class44.colorStartTag(65535) + var16.name, 1002, var16.id, var11, var12); // L: 8904
					}
				}

				Player var20;
				int var24;
				NPC var25;
				int var32;
				int[] var33;
				if (var13 == 1) { // L: 8909
					NPC var28 = Client.npcs[var15]; // L: 8910
					if (var28 == null) { // L: 8911
						continue;
					}

					if (var28.definition.size == 1 && (var28.x & 127) == 64 && (var28.y & 127) == 64) { // L: 8912
						for (var24 = 0; var24 < Client.npcCount; ++var24) { // L: 8913
							var25 = Client.npcs[Client.npcIndices[var24]]; // L: 8914
							if (var25 != null && var28 != var25 && var25.definition.size == 1 && var25.x == var28.x && var25.y == var28.y) { // L: 8915
								class35.addNpcToMenu(var25.definition, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count; // L: 8917
						var33 = Players.Players_indices; // L: 8918

						for (var32 = 0; var32 < var24; ++var32) { // L: 8919
							var20 = Client.players[var33[var32]]; // L: 8920
							if (var20 != null && var20.x == var28.x && var28.y == var20.y) { // L: 8921
								HitSplatDefinition.addPlayerToMenu(var20, var33[var32], var11, var12);
							}
						}
					}

					class35.addNpcToMenu(var28.definition, var15, var11, var12); // L: 8924
				}

				if (var13 == 0) { // L: 8926
					Player var29 = Client.players[var15]; // L: 8927
					if (var29 == null) { // L: 8928
						continue;
					}

					if ((var29.x & 127) == 64 && (var29.y & 127) == 64) { // L: 8929
						for (var24 = 0; var24 < Client.npcCount; ++var24) { // L: 8930
							var25 = Client.npcs[Client.npcIndices[var24]]; // L: 8931
							if (var25 != null && var25.definition.size == 1 && var29.x == var25.x && var25.y == var29.y) { // L: 8932
								class35.addNpcToMenu(var25.definition, Client.npcIndices[var24], var11, var12);
							}
						}

						var24 = Players.Players_count; // L: 8934
						var33 = Players.Players_indices; // L: 8935

						for (var32 = 0; var32 < var24; ++var32) { // L: 8936
							var20 = Client.players[var33[var32]]; // L: 8937
							if (var20 != null && var20 != var29 && var29.x == var20.x && var29.y == var20.y) { // L: 8938
								HitSplatDefinition.addPlayerToMenu(var20, var33[var32], var11, var12);
							}
						}
					}

					if (var15 != Client.combatTargetPlayerIndex) { // L: 8941
						HitSplatDefinition.addPlayerToMenu(var29, var15, var11, var12);
					} else {
						var4 = var22; // L: 8942
					}
				}

				if (var13 == 3) { // L: 8944
					NodeDeque var31 = Client.groundItems[class22.Client_plane][var11][var12]; // L: 8945
					if (var31 != null) { // L: 8946
						for (TileItem var30 = (TileItem)var31.first(); var30 != null; var30 = (TileItem)var31.next()) { // L: 8947 8948 8981
							ItemComposition var34 = class260.ItemDefinition_get(var30.id); // L: 8949
							if (Client.isItemSelected == 1) { // L: 8950
								Occluder.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class44.colorStartTag(16748608) + var34.name, 16, var30.id, var11, var12); // L: 8951
							} else if (Client.isSpellSelected) { // L: 8954
								if ((class4.selectedSpellFlags & 1) == 1) { // L: 8955
									Occluder.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class44.colorStartTag(16748608) + var34.name, 17, var30.id, var11, var12); // L: 8956
								}
							} else {
								String[] var26 = var34.groundActions; // L: 8961

								for (int var27 = 4; var27 >= 0; --var27) { // L: 8962
									if (var26 != null && var26[var27] != null) { // L: 8963
										byte var21 = 0; // L: 8964
										if (var27 == 0) { // L: 8965
											var21 = 18;
										}

										if (var27 == 1) { // L: 8966
											var21 = 19;
										}

										if (var27 == 2) { // L: 8967
											var21 = 20;
										}

										if (var27 == 3) { // L: 8968
											var21 = 21;
										}

										if (var27 == 4) { // L: 8969
											var21 = 22;
										}

										Occluder.insertMenuItemNoShift(var26[var27], class44.colorStartTag(16748608) + var34.name, var21, var30.id, var11, var12); // L: 8970
									} else if (var27 == 2) { // L: 8973
										Occluder.insertMenuItemNoShift("Take", class44.colorStartTag(16748608) + var34.name, 20, var30.id, var11, var12); // L: 8974
									}
								}

								Occluder.insertMenuItemNoShift("Examine", class44.colorStartTag(16748608) + var34.name, 1004, var30.id, var11, var12); // L: 8978
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) { // L: 8986
			var8 = VarpDefinition.method2630(var4); // L: 8987
			int var9 = class229.method4374(var4); // L: 8988
			Player var10 = Client.players[Client.combatTargetPlayerIndex]; // L: 8989
			HitSplatDefinition.addPlayerToMenu(var10, Client.combatTargetPlayerIndex, var8, var9); // L: 8990
		}

	} // L: 8992
}
