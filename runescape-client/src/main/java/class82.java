import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public enum class82 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field1069(0, -1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field1066(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field1067(2, 7),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field1068(3, 8),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	field1073(4, 9);

	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -20141329
	)
	final int field1065;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 868910059
	)
	final int field1071;

	class82(int var3, int var4) {
		this.field1065 = var3; // L: 20
		this.field1071 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-100"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1071; // L: 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ldq;",
		garbageValue = "2053304227"
	)
	static class118 method2116(int var0) {
		class118[] var1 = new class118[]{class118.field1481, class118.field1477, class118.field1478, class118.field1479, class118.field1480, class118.field1484}; // L: 33
		class118 var2 = (class118)Actor.findEnumerated(var1, var0); // L: 35
		if (var2 == null) { // L: 36
			var2 = class118.field1481;
		}

		return var2; // L: 37
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 9722
			class4.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 9723
		}

		long var4 = -1L; // L: 9726
		long var6 = -1L; // L: 9727

		int var8;
		for (var8 = 0; var8 < Frames.method4349(); ++var8) { // L: 9728
			long var24 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9731
			if (var6 != var24) { // L: 9734
				var6 = var24; // L: 9735
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 9739
				int var14 = (int)(var15 >>> 0 & 127L); // L: 9741
				var14 = var14; // L: 9745
				int var28 = InterfaceParent.method2095(var8); // L: 9746
				int var16 = TileItem.method2414(var8); // L: 9747
				int var17 = JagexCache.method3250(var8); // L: 9748
				if (var16 == 2 && class356.scene.getObjectFlags(PacketWriter.Client_plane, var14, var28, var24) >= 0) { // L: 9749 9750
					ObjectComposition var18 = class162.getObjectDefinition(var17); // L: 9751
					if (var18.transforms != null) { // L: 9752
						var18 = var18.transform();
					}

					if (var18 == null) { // L: 9753
						continue;
					}

					if (Client.isItemSelected == 1) { // L: 9754
						class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(65535) + var18.name, 1, var17, var14, var28); // L: 9755
					} else if (Client.isSpellSelected) { // L: 9758
						if ((HealthBar.selectedSpellFlags & 4) == 4) { // L: 9759
							class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(65535) + var18.name, 2, var17, var14, var28); // L: 9760
						}
					} else {
						String[] var19 = var18.actions; // L: 9765
						if (var19 != null) { // L: 9766
							for (int var20 = 4; var20 >= 0; --var20) { // L: 9767
								if (var19[var20] != null) { // L: 9768
									short var21 = 0; // L: 9769
									if (var20 == 0) { // L: 9770
										var21 = 3;
									}

									if (var20 == 1) { // L: 9771
										var21 = 4;
									}

									if (var20 == 2) { // L: 9772
										var21 = 5;
									}

									if (var20 == 3) { // L: 9773
										var21 = 6;
									}

									if (var20 == 4) { // L: 9774
										var21 = 1001;
									}

									class4.insertMenuItemNoShift(var19[var20], class122.colorStartTag(65535) + var18.name, var21, var17, var14, var28); // L: 9775
								}
							}
						}

						class4.insertMenuItemNoShift("Examine", class122.colorStartTag(65535) + var18.name, 1002, var18.id, var14, var28); // L: 9780
					}
				}

				Player var22;
				int var29;
				NPC var30;
				int var37;
				int[] var38;
				if (var16 == 1) { // L: 9785
					NPC var33 = Client.npcs[var17]; // L: 9786
					if (var33 == null) { // L: 9787
						continue;
					}

					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 9788
						for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 9789
							var30 = Client.npcs[Client.npcIndices[var29]]; // L: 9790
							if (var30 != null && var33 != var30 && var30.definition.size == 1 && var30.x == var33.x && var30.y == var33.y) { // L: 9791
								class160.addNpcToMenu(var30, Client.npcIndices[var29], var14, var28);
							}
						}

						var29 = Players.Players_count; // L: 9793
						var38 = Players.Players_indices; // L: 9794

						for (var37 = 0; var37 < var29; ++var37) { // L: 9795
							var22 = Client.players[var38[var37]]; // L: 9796
							if (var22 != null && var22.x == var33.x && var22.y == var33.y) { // L: 9797
								DynamicObject.addPlayerToMenu(var22, var38[var37], var14, var28);
							}
						}
					}

					class160.addNpcToMenu(var33, var17, var14, var28); // L: 9800
				}

				if (var16 == 0) { // L: 9802
					Player var34 = Client.players[var17]; // L: 9803
					if (var34 == null) { // L: 9804
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 9805
						for (var29 = 0; var29 < Client.npcCount; ++var29) { // L: 9806
							var30 = Client.npcs[Client.npcIndices[var29]]; // L: 9807
							if (var30 != null && var30.definition.size == 1 && var30.x == var34.x && var30.y == var34.y) { // L: 9808
								class160.addNpcToMenu(var30, Client.npcIndices[var29], var14, var28);
							}
						}

						var29 = Players.Players_count; // L: 9810
						var38 = Players.Players_indices; // L: 9811

						for (var37 = 0; var37 < var29; ++var37) { // L: 9812
							var22 = Client.players[var38[var37]]; // L: 9813
							if (var22 != null && var22 != var34 && var34.x == var22.x && var22.y == var34.y) { // L: 9814
								DynamicObject.addPlayerToMenu(var22, var38[var37], var14, var28);
							}
						}
					}

					if (var17 != Client.combatTargetPlayerIndex) { // L: 9817
						DynamicObject.addPlayerToMenu(var34, var17, var14, var28);
					} else {
						var4 = var24; // L: 9818
					}
				}

				if (var16 == 3) { // L: 9820
					NodeDeque var36 = Client.groundItems[PacketWriter.Client_plane][var14][var28]; // L: 9821
					if (var36 != null) { // L: 9822
						for (TileItem var35 = (TileItem)var36.first(); var35 != null; var35 = (TileItem)var36.next()) { // L: 9823 9824 9857
							ItemComposition var39 = EnumComposition.ItemDefinition_get(var35.id); // L: 9825
							if (Client.isItemSelected == 1) { // L: 9826
								class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16748608) + var39.name, 16, var35.id, var14, var28); // L: 9827
							} else if (Client.isSpellSelected) { // L: 9830
								if ((HealthBar.selectedSpellFlags & 1) == 1) { // L: 9831
									class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16748608) + var39.name, 17, var35.id, var14, var28); // L: 9832
								}
							} else {
								String[] var31 = var39.groundActions; // L: 9837

								for (int var32 = 4; var32 >= 0; --var32) { // L: 9838
									if (var31 != null && var31[var32] != null) { // L: 9839
										byte var23 = 0; // L: 9840
										if (var32 == 0) { // L: 9841
											var23 = 18;
										}

										if (var32 == 1) { // L: 9842
											var23 = 19;
										}

										if (var32 == 2) { // L: 9843
											var23 = 20;
										}

										if (var32 == 3) { // L: 9844
											var23 = 21;
										}

										if (var32 == 4) { // L: 9845
											var23 = 22;
										}

										class4.insertMenuItemNoShift(var31[var32], class122.colorStartTag(16748608) + var39.name, var23, var35.id, var14, var28); // L: 9846
									} else if (var32 == 2) { // L: 9849
										class4.insertMenuItemNoShift("Take", class122.colorStartTag(16748608) + var39.name, 20, var35.id, var14, var28); // L: 9850
									}
								}

								class4.insertMenuItemNoShift("Examine", class122.colorStartTag(16748608) + var39.name, 1004, var35.id, var14, var28); // L: 9854
							}
						}
					}
				}
			}
		}

		if (-1L != var4) { // L: 9862
			var8 = (int)(var4 >>> 0 & 127L); // L: 9865
			int var10 = (int)(var4 >>> 7 & 127L); // L: 9870
			Player var12 = Client.players[Client.combatTargetPlayerIndex]; // L: 9873
			DynamicObject.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10); // L: 9874
		}

	} // L: 9876
}
