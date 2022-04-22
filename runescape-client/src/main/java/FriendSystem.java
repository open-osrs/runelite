import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	static ClanChannel field808;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -189724235
	)
	int field805;

	@ObfuscatedSignature(
		descriptor = "(Lpe;)V"
	)
	FriendSystem(LoginType var1) {
		this.field805 = 0; // L: 23
		this.loginType = var1; // L: 26
		this.friendsList = new FriendsList(var1); // L: 27
		this.ignoreList = new IgnoreList(var1); // L: 28
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-846146726"
	)
	boolean method1681() {
		return this.field805 == 2; // L: 32
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-22"
	)
	final void method1726() {
		this.field805 = 1; // L: 36
	} // L: 37

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1095656877"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2); // L: 40
		this.field805 = 2; // L: 41
		class295.method5732(); // L: 42
	} // L: 43

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6357"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) { // L: 46
			if ((long)var1.field4246 < class136.method2931() / 1000L - 5L) { // L: 47
				if (var1.world > 0) {
					Actor.addGameMessage(5, "", var1.username + " has logged in."); // L: 48
				}

				if (var1.world == 0) { // L: 49
					Actor.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove(); // L: 50
			}
		}

	} // L: 53

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1878826448"
	)
	@Export("clear")
	final void clear() {
		this.field805 = 0; // L: 56
		this.friendsList.clear(); // L: 57
		this.ignoreList.clear(); // L: 58
	} // L: 59

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqb;ZS)Z",
		garbageValue = "301"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) { // L: 62
			return false;
		} else if (var1.equals(GrandExchangeEvents.localPlayer.username)) { // L: 63
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2); // L: 64
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqb;B)Z",
		garbageValue = "24"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) { // L: 69
			return false;
		} else {
			return this.ignoreList.contains(var1); // L: 70
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "95"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) { // L: 75
			Username var2 = new Username(var1, this.loginType); // L: 76
			if (var2.hasCleanName()) { // L: 77
				if (this.friendsListIsFull()) { // L: 78
					class149.method3138("Your friend list is full. Max of 200 for free users, and 400 for members"); // L: 80
				} else if (GrandExchangeEvents.localPlayer.username.equals(var2)) { // L: 84
					ClanSettings.method3031(); // L: 85
				} else if (this.isFriended(var2, false)) { // L: 88
					class149.method3138(var1 + " is already on your friend list"); // L: 90
				} else if (this.isIgnored(var2)) { // L: 94
					Canvas.method359(var1); // L: 95
				} else {
					Skeleton.method4728(var1); // L: 98
				}
			}
		}
	} // L: 82 86 92 96 99

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1352470577"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field544 != 1; // L: 122
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1994485705"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) { // L: 129
			Username var2 = new Username(var1, this.loginType); // L: 130
			if (var2.hasCleanName()) { // L: 131
				if (this.canAddIgnore()) { // L: 132
					ModeWhere.method6092(); // L: 133
				} else if (GrandExchangeEvents.localPlayer.username.equals(var2)) { // L: 136
					class149.method3138("You can't add yourself to your own ignore list"); // L: 138
				} else if (this.isIgnored(var2)) { // L: 142
					class149.method3138(var1 + " is already on your ignore list"); // L: 144
				} else if (this.isFriended(var2, false)) { // L: 148
					KeyHandler.method348(var1); // L: 149
				} else {
					GameEngine.method569(var1); // L: 152
				}
			}
		}
	} // L: 134 140 146 150 153

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1971481625"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field544 != 1; // L: 172
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-14"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) { // L: 179
			Username var2 = new Username(var1, this.loginType); // L: 180
			if (var2.hasCleanName()) { // L: 181
				if (this.friendsList.removeByUsername(var2)) { // L: 182
					Client.field701 = Client.cycleCntr; // L: 184
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2970, Client.packetWriter.isaacCipher); // L: 187
					var3.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var1)); // L: 188
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 189
					Client.packetWriter.addNode(var3); // L: 190
				}

				class295.method5732(); // L: 192
			}
		}
	} // L: 193

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "20346063"
	)
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) { // L: 196
			Username var2 = new Username(var1, this.loginType); // L: 197
			if (var2.hasCleanName()) { // L: 198
				if (this.ignoreList.removeByUsername(var2)) { // L: 199
					Client.field701 = Client.cycleCntr; // L: 201
					PacketBufferNode var3 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2991, Client.packetWriter.isaacCipher); // L: 204
					var3.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var1)); // L: 205
					var3.packetBuffer.writeStringCp1252NullTerminated(var1); // L: 206
					Client.packetWriter.addNode(var3); // L: 207
				}

				KitDefinition.FriendSystem_invalidateIgnoreds(); // L: 209
			}
		}
	} // L: 210

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lqb;I)Z",
		garbageValue = "-2101577013"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1); // L: 222
		return var2 != null && var2.hasWorld(); // L: 223
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcn;",
		garbageValue = "-1586565487"
	)
	static AttackOption[] method1743() {
		return new AttackOption[]{AttackOption.field1263, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.field1257}; // L: 12680
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "106"
	)
	public static boolean method1698(int var0) {
		return (var0 >> 28 & 1) != 0; // L: 29
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1628645730"
	)
	static final void method1715() {
		class389.method7094(false); // L: 5650
		Client.field747 = 0; // L: 5651
		boolean var0 = true; // L: 5652

		int var1;
		for (var1 = 0; var1 < Varcs.regionLandArchives.length; ++var1) { // L: 5653
			if (VarpDefinition.regionMapArchiveIds[var1] != -1 && Varcs.regionLandArchives[var1] == null) { // L: 5654 5655
				Varcs.regionLandArchives[var1] = Players.archive5.takeFile(VarpDefinition.regionMapArchiveIds[var1], 0); // L: 5656
				if (Varcs.regionLandArchives[var1] == null) { // L: 5657
					var0 = false; // L: 5658
					++Client.field747; // L: 5659
				}
			}

			if (class133.regionLandArchiveIds[var1] != -1 && DynamicObject.regionMapArchives[var1] == null) { // L: 5663 5664
				DynamicObject.regionMapArchives[var1] = Players.archive5.takeFileEncrypted(class133.regionLandArchiveIds[var1], 0, WorldMapSectionType.xteaKeys[var1]); // L: 5665
				if (DynamicObject.regionMapArchives[var1] == null) { // L: 5666
					var0 = false; // L: 5667
					++Client.field747; // L: 5668
				}
			}
		}

		if (!var0) { // L: 5673
			Client.field560 = 1; // L: 5674
		} else {
			Client.field558 = 0; // L: 5677
			var0 = true; // L: 5678

			int var3;
			int var4;
			for (var1 = 0; var1 < Varcs.regionLandArchives.length; ++var1) { // L: 5679
				byte[] var15 = DynamicObject.regionMapArchives[var1]; // L: 5680
				if (var15 != null) { // L: 5681
					var3 = (class21.regions[var1] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX; // L: 5682
					var4 = (class21.regions[var1] & 255) * 64 - VarcInt.baseY; // L: 5683
					if (Client.isInInstance) { // L: 5684
						var3 = 10; // L: 5685
						var4 = 10; // L: 5686
					}

					var0 &= ItemComposition.method3771(var15, var3, var4); // L: 5688
				}
			}

			if (!var0) { // L: 5691
				Client.field560 = 2; // L: 5692
			} else {
				if (Client.field560 != 0) { // L: 5695
					MusicPatch.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class116.playPcmPlayers(); // L: 5696
				ArchiveLoader.scene.clear(); // L: 5697

				for (var1 = 0; var1 < 4; ++var1) { // L: 5698
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) { // L: 5699
					for (var2 = 0; var2 < 104; ++var2) { // L: 5700
						for (var3 = 0; var3 < 104; ++var3) { // L: 5701
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0; // L: 5702
						}
					}
				}

				class116.playPcmPlayers(); // L: 5706
				class321.method5996(); // L: 5707
				var1 = Varcs.regionLandArchives.length; // L: 5708
				ClientPreferences.method2259(); // L: 5709
				class389.method7094(true); // L: 5710
				int var5;
				if (!Client.isInInstance) { // L: 5711
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) { // L: 5712
						var3 = (class21.regions[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX; // L: 5713
						var4 = (class21.regions[var2] & 255) * 64 - VarcInt.baseY; // L: 5714
						var14 = Varcs.regionLandArchives[var2]; // L: 5715
						if (var14 != null) { // L: 5716
							class116.playPcmPlayers(); // L: 5717
							class1.method9(var14, var3, var4, ScriptEvent.field1042 * 8 - 48, KitDefinition.field1855 * 8 - 48, Client.collisionMaps); // L: 5718
						}
					}

					for (var2 = 0; var2 < var1; ++var2) { // L: 5721
						var3 = (class21.regions[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX; // L: 5722
						var4 = (class21.regions[var2] & 255) * 64 - VarcInt.baseY; // L: 5723
						var14 = Varcs.regionLandArchives[var2]; // L: 5724
						if (var14 == null && KitDefinition.field1855 < 800) { // L: 5725
							class116.playPcmPlayers(); // L: 5726
							class431.method7593(var3, var4, 64, 64); // L: 5727
						}
					}

					class389.method7094(true); // L: 5730

					for (var2 = 0; var2 < var1; ++var2) { // L: 5731
						byte[] var13 = DynamicObject.regionMapArchives[var2]; // L: 5732
						if (var13 != null) { // L: 5733
							var4 = (class21.regions[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX; // L: 5734
							var5 = (class21.regions[var2] & 255) * 64 - VarcInt.baseY; // L: 5735
							class116.playPcmPlayers(); // L: 5736
							Widget.method5681(var13, var4, var5, ArchiveLoader.scene, Client.collisionMaps); // L: 5737
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) { // L: 5741
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) { // L: 5742
						class116.playPcmPlayers(); // L: 5743

						for (var3 = 0; var3 < 13; ++var3) { // L: 5744
							for (var4 = 0; var4 < 13; ++var4) { // L: 5745
								boolean var16 = false; // L: 5746
								var6 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5747
								if (var6 != -1) { // L: 5748
									var7 = var6 >> 24 & 3; // L: 5749
									var8 = var6 >> 1 & 3; // L: 5750
									var9 = var6 >> 14 & 1023; // L: 5751
									var10 = var6 >> 3 & 2047; // L: 5752
									var11 = (var9 / 8 << 8) + var10 / 8; // L: 5753

									for (int var12 = 0; var12 < class21.regions.length; ++var12) { // L: 5754
										if (class21.regions[var12] == var11 && Varcs.regionLandArchives[var12] != null) { // L: 5755
											class305.method5781(Varcs.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps); // L: 5756
											var16 = true; // L: 5757
											break;
										}
									}
								}

								if (!var16) { // L: 5762
									KeyHandler.method337(var2, var3 * 8, var4 * 8); // L: 5763
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) { // L: 5768
						for (var3 = 0; var3 < 13; ++var3) { // L: 5769
							var4 = Client.instanceChunkTemplates[0][var2][var3]; // L: 5770
							if (var4 == -1) { // L: 5771
								class431.method7593(var2 * 8, var3 * 8, 8, 8); // L: 5772
							}
						}
					}

					class389.method7094(true); // L: 5776

					for (var2 = 0; var2 < 4; ++var2) { // L: 5777
						class116.playPcmPlayers(); // L: 5778

						for (var3 = 0; var3 < 13; ++var3) { // L: 5779
							for (var4 = 0; var4 < 13; ++var4) { // L: 5780
								var5 = Client.instanceChunkTemplates[var2][var3][var4]; // L: 5781
								if (var5 != -1) { // L: 5782
									var6 = var5 >> 24 & 3; // L: 5783
									var7 = var5 >> 1 & 3; // L: 5784
									var8 = var5 >> 14 & 1023; // L: 5785
									var9 = var5 >> 3 & 2047; // L: 5786
									var10 = (var8 / 8 << 8) + var9 / 8; // L: 5787

									for (var11 = 0; var11 < class21.regions.length; ++var11) { // L: 5788
										if (class21.regions[var11] == var10 && DynamicObject.regionMapArchives[var11] != null) { // L: 5789
											Tiles.method2015(DynamicObject.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, ArchiveLoader.scene, Client.collisionMaps); // L: 5790
											break; // L: 5791
										}
									}
								}
							}
						}
					}
				}

				class389.method7094(true); // L: 5799
				class116.playPcmPlayers(); // L: 5800
				GraphicsDefaults.method6939(ArchiveLoader.scene, Client.collisionMaps); // L: 5801
				class389.method7094(true); // L: 5802
				var2 = Tiles.Tiles_minPlane; // L: 5803
				if (var2 > class18.Client_plane) { // L: 5804
					var2 = class18.Client_plane;
				}

				if (var2 < class18.Client_plane - 1) { // L: 5805
					var2 = class18.Client_plane - 1;
				}

				if (Client.isLowDetail) { // L: 5806
					ArchiveLoader.scene.init(Tiles.Tiles_minPlane);
				} else {
					ArchiveLoader.scene.init(0); // L: 5807
				}

				for (var3 = 0; var3 < 104; ++var3) { // L: 5808
					for (var4 = 0; var4 < 104; ++var4) { // L: 5809
						UserComparator3.updateItemPile(var3, var4); // L: 5810
					}
				}

				class116.playPcmPlayers(); // L: 5813
				class28.method390(); // L: 5814
				ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 5815
				PacketBufferNode var17;
				if (class127.client.hasFrame()) { // L: 5816
					var17 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2893, Client.packetWriter.isaacCipher); // L: 5818
					var17.packetBuffer.writeInt(1057001181); // L: 5819
					Client.packetWriter.addNode(var17); // L: 5820
				}

				if (!Client.isInInstance) { // L: 5822
					var3 = (ScriptEvent.field1042 - 6) / 8; // L: 5823
					var4 = (ScriptEvent.field1042 + 6) / 8; // L: 5824
					var5 = (KitDefinition.field1855 - 6) / 8; // L: 5825
					var6 = (KitDefinition.field1855 + 6) / 8; // L: 5826

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) { // L: 5827
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) { // L: 5828
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) { // L: 5829
								Players.archive5.loadRegionFromName("m" + var7 + "_" + var8); // L: 5830
								Players.archive5.loadRegionFromName("l" + var7 + "_" + var8); // L: 5831
							}
						}
					}
				}

				Decimator.updateGameState(30); // L: 5835
				class116.playPcmPlayers(); // L: 5836
				NPC.method2360(); // L: 5837
				var17 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher); // L: 5838
				Client.packetWriter.addNode(var17); // L: 5839
				UserComparator9.method2619(); // L: 5840
			}
		}
	} // L: 5675 5693 5841

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-825343638"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9666
			Widget var0 = ItemComposition.getWidgetChild(Timer.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9667
			if (var0 != null && var0.onTargetLeave != null) { // L: 9668
				ScriptEvent var1 = new ScriptEvent(); // L: 9669
				var1.widget = var0; // L: 9670
				var1.args = var0.onTargetLeave; // L: 9671
				ClanSettings.runScriptEvent(var1); // L: 9672
			}

			Client.selectedSpellItemId = -1; // L: 9674
			Client.isSpellSelected = false; // L: 9675
			class346.invalidateWidget(var0); // L: 9676
		}
	} // L: 9677
}
