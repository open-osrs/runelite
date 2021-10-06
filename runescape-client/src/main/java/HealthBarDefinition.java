import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("HitSplatDefinition_spritesArchive")
	static AbstractArchive HitSplatDefinition_spritesArchive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = -1732997973
	)
	static int field1671;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 975502943
	)
	public int field1675;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1349521857
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1857884575
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1029795251
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1160024531
	)
	public int field1679;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -964299295
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1825687109
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2014691659
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1639906499
	)
	@Export("width")
	public int width;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1780059389
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	public HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1679 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)V",
		garbageValue = "81"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-410528163"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.method6977();
		} else if (var2 == 8) {
			this.backSpriteID = var1.method6977();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lon;",
		garbageValue = "836195757"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AccessFile.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lon;",
		garbageValue = "18"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AccessFile.SpriteBuffer_getSprite(HitSplatDefinition_spritesArchive, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)V",
		garbageValue = "-2142706436"
	)
	public static void method2978(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1916121645"
	)
	static final void method2977() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
		class138.method2754();
		LoginScreenAnimation.method2175();
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
		WorldMapLabelSize.method3446();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		class276.method5122();
		VarbitComposition.VarbitDefinition_cached.clear();
		UserComparator4.method2395();
		TriBool.field3979.method6750();
		WorldMapIcon_1.HitSplatDefinition_cachedSprites.method6750();
		Clock.method2864();
		HealthBarDefinition_cached.clear();
		HealthBarDefinition_cachedSprites.clear();
		class11.method105();
		ParamComposition.ParamDefinition_cached.clear();
		MilliClock.method2858();
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		KeyHandler.method349();
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear();
		Script.Script_cached.clear();
		ClanChannel.archive0.clearFiles();
		MouseRecorder.archive1.clearFiles();
		class150.archive3.clearFiles();
		class260.archive4.clearFiles();
		ApproximateRouteStrategy.archive5.clearFiles();
		Tiles.archive6.clearFiles();
		Skeleton.archive7.clearFiles();
		class176.archive8.clearFiles();
		Interpreter.archive9.clearFiles();
		UserComparator8.archive10.clearFiles();
		class4.archive11.clearFiles();
		UserComparator6.archive12.clearFiles();
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(Lid;I)V",
		garbageValue = "-637242019"
	)
	static final void method2981(class240 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		TileItem var34;
		if (class240.field2772 == var0) {
			var2 = var1.method6933();
			var3 = var1.readUnsignedByte();
			var4 = (var3 >> 4 & 7) + UrlRequest.field1313;
			var5 = (var3 & 7) + WorldMapElement.field1622;
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				NodeDeque var36 = Client.groundItems[VertexNormal.Client_plane][var4][var5];
				if (var36 != null) {
					for (var34 = (TileItem)var36.last(); var34 != null; var34 = (TileItem)var36.previous()) {
						if ((var2 & 32767) == var34.id) {
							var34.remove();
							break;
						}
					}

					if (var36.last() == null) {
						Client.groundItems[VertexNormal.Client_plane][var4][var5] = null;
					}

					HealthBarUpdate.updateItemPile(var4, var5);
				}
			}

		} else {
			int var6;
			int var7;
			int var8;
			int var9;
			int var11;
			if (class240.field2771 == var0) {
				var2 = var1.method7059();
				var3 = var1.method6927();
				var4 = (var3 >> 4 & 7) + UrlRequest.field1313;
				var5 = (var3 & 7) + WorldMapElement.field1622;
				var6 = var1.method6925();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field690[var7];
				if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
					if (var9 == 0) {
						BoundaryObject var35 = PlayerComposition.scene.method4219(VertexNormal.Client_plane, var4, var5);
						if (var35 != null) {
							var11 = InterfaceParent.Entity_unpackID(var35.tag);
							if (var7 == 2) {
								var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, VertexNormal.Client_plane, var4, var5, var2, false, var35.renderable1);
								var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, VertexNormal.Client_plane, var4, var5, var2, false, var35.renderable2);
							} else {
								var35.renderable1 = new DynamicObject(var11, var7, var8, VertexNormal.Client_plane, var4, var5, var2, false, var35.renderable1);
							}
						}
					}

					if (var9 == 1) {
						WallDecoration var42 = PlayerComposition.scene.method4316(VertexNormal.Client_plane, var4, var5);
						if (var42 != null) {
							var11 = InterfaceParent.Entity_unpackID(var42.tag);
							if (var7 != 4 && var7 != 5) {
								if (var7 == 6) {
									var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, VertexNormal.Client_plane, var4, var5, var2, false, var42.renderable1);
								} else if (var7 == 7) {
									var42.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, VertexNormal.Client_plane, var4, var5, var2, false, var42.renderable1);
								} else if (var7 == 8) {
									var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, VertexNormal.Client_plane, var4, var5, var2, false, var42.renderable1);
									var42.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, VertexNormal.Client_plane, var4, var5, var2, false, var42.renderable2);
								}
							} else {
								var42.renderable1 = new DynamicObject(var11, 4, var8, VertexNormal.Client_plane, var4, var5, var2, false, var42.renderable1);
							}
						}
					}

					if (var9 == 2) {
						GameObject var43 = PlayerComposition.scene.getGameObject(VertexNormal.Client_plane, var4, var5);
						if (var7 == 11) {
							var7 = 10;
						}

						if (var43 != null) {
							var43.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var43.tag), var7, var8, VertexNormal.Client_plane, var4, var5, var2, false, var43.renderable);
						}
					}

					if (var9 == 3) {
						FloorDecoration var44 = PlayerComposition.scene.getFloorDecoration(VertexNormal.Client_plane, var4, var5);
						if (var44 != null) {
							var44.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var44.tag), 22, var8, VertexNormal.Client_plane, var4, var5, var2, false, var44.renderable);
						}
					}
				}

			} else if (class240.field2770 == var0) {
				var2 = var1.method6925();
				var3 = var1.readUnsignedShort();
				var4 = var1.method6925();
				var5 = (var4 >> 4 & 7) + UrlRequest.field1313;
				var6 = (var4 & 7) + WorldMapElement.field1622;
				var7 = var1.method6933();
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
					var5 = var5 * 128 + 64;
					var6 = var6 * 128 + 64;
					GraphicsObject var41 = new GraphicsObject(var7, VertexNormal.Client_plane, var5, var6, MidiPcmStream.getTileHeight(var5, var6, VertexNormal.Client_plane) - var2, var3, Client.cycle);
					Client.graphicsObjects.addFirst(var41);
				}

			} else {
				int var10;
				if (class240.field2767 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method6927();
					var4 = var3 >> 4 & 15;
					var5 = var3 & 7;
					var6 = var1.method6925();
					var7 = (var6 >> 4 & 7) + UrlRequest.field1313;
					var8 = (var6 & 7) + WorldMapElement.field1622;
					var9 = var1.method6927();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var10 = var4 + 1;
						if (class67.localPlayer.pathX[0] >= var7 - var10 && class67.localPlayer.pathX[0] <= var7 + var10 && class67.localPlayer.pathY[0] >= var8 - var10 && class67.localPlayer.pathY[0] <= var8 + var10 && WorldMapDecorationType.clientPreferences.areaSoundEffectsVolume != 0 && var5 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var2;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var9;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var4 + (var8 << 8) + (var7 << 16);
							++Client.soundEffectCount;
						}
					}
				}

				if (class240.field2768 == var0) {
					var2 = var1.method6927();
					var3 = var2 >> 2;
					var4 = var2 & 3;
					var5 = Client.field690[var3];
					var6 = var1.readUnsignedShort();
					var7 = var1.method6925();
					var8 = (var7 >> 4 & 7) + UrlRequest.field1313;
					var9 = (var7 & 7) + WorldMapElement.field1622;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						class113.updatePendingSpawn(VertexNormal.Client_plane, var8, var9, var5, var6, var3, var4, 0, -1);
					}

				} else if (class240.field2774 == var0) {
					var2 = var1.method7059();
					var3 = var1.method6926();
					var4 = (var3 >> 4 & 7) + UrlRequest.field1313;
					var5 = (var3 & 7) + WorldMapElement.field1622;
					var6 = var1.method6934();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var34 = new TileItem();
						var34.id = var2;
						var34.quantity = var6;
						if (Client.groundItems[VertexNormal.Client_plane][var4][var5] == null) {
							Client.groundItems[VertexNormal.Client_plane][var4][var5] = new NodeDeque();
						}

						Client.groundItems[VertexNormal.Client_plane][var4][var5].addFirst(var34);
						HealthBarUpdate.updateItemPile(var4, var5);
					}

				} else if (class240.field2776 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.method6933();
					var4 = var1.method6934();
					var5 = var1.readUnsignedByte();
					var6 = (var5 >> 4 & 7) + UrlRequest.field1313;
					var7 = (var5 & 7) + WorldMapElement.field1622;
					if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
						NodeDeque var32 = Client.groundItems[VertexNormal.Client_plane][var6][var7];
						if (var32 != null) {
							for (TileItem var33 = (TileItem)var32.last(); var33 != null; var33 = (TileItem)var32.previous()) {
								if ((var3 & 32767) == var33.id && var2 == var33.quantity) {
									var33.quantity = var4;
									break;
								}
							}

							HealthBarUpdate.updateItemPile(var6, var7);
						}
					}

				} else {
					int var12;
					int var13;
					int var14;
					byte var38;
					if (class240.field2775 == var0) {
						var2 = var1.method6936();
						var38 = var1.readByte();
						var4 = var1.method6934();
						var5 = var1.method6927();
						var6 = var1.method7059();
						var7 = var1.method6925() * 4;
						var8 = var1.method6927();
						var9 = (var8 >> 4 & 7) + UrlRequest.field1313;
						var10 = (var8 & 7) + WorldMapElement.field1622;
						var11 = var1.method6926();
						byte var40 = var1.method6929();
						var13 = var1.method6933();
						var14 = var1.readUnsignedByte() * 4;
						var12 = var40 + var9;
						var3 = var38 + var10;
						if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 >= 0 && var3 >= 0 && var12 < 104 && var3 < 104 && var6 != 65535) {
							var9 = var9 * 128 + 64;
							var10 = var10 * 128 + 64;
							var12 = var12 * 128 + 64;
							var3 = var3 * 128 + 64;
							Projectile var31 = new Projectile(var6, VertexNormal.Client_plane, var9, var10, MidiPcmStream.getTileHeight(var9, var10, VertexNormal.Client_plane) - var7, var4 + Client.cycle, var13 + Client.cycle, var11, var5, var2, var14);
							var31.setDestination(var12, var3, MidiPcmStream.getTileHeight(var12, var3, VertexNormal.Client_plane) - var14, var4 + Client.cycle);
							Client.projectiles.addFirst(var31);
						}

					} else if (class240.field2769 == var0) {
						var2 = var1.method6926();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field690[var3];
						var6 = var1.method6925();
						var7 = (var6 >> 4 & 7) + UrlRequest.field1313;
						var8 = (var6 & 7) + WorldMapElement.field1622;
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
							class113.updatePendingSpawn(VertexNormal.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
						}

					} else {
						if (class240.field2773 == var0) {
							byte var37 = var1.method6915();
							var38 = var1.method6929();
							var4 = var1.method6926();
							var5 = (var4 >> 4 & 7) + UrlRequest.field1313;
							var6 = (var4 & 7) + WorldMapElement.field1622;
							var7 = var1.readUnsignedShort();
							var8 = var1.method6934();
							byte var39 = var1.method6915();
							var10 = var1.readUnsignedShort();
							var11 = var1.method7059();
							var12 = var1.method6927();
							var13 = var12 >> 2;
							var14 = var12 & 3;
							int var15 = Client.field690[var13];
							byte var16 = var1.method6915();
							Player var17;
							if (var10 == Client.localPlayerIndex) {
								var17 = class67.localPlayer;
							} else {
								var17 = Client.players[var10];
							}

							if (var17 != null) {
								ObjectComposition var18 = class245.getObjectDefinition(var8);
								int var19;
								int var20;
								if (var14 != 1 && var14 != 3) {
									var19 = var18.sizeX;
									var20 = var18.sizeY;
								} else {
									var19 = var18.sizeY;
									var20 = var18.sizeX;
								}

								int var21 = var5 + (var19 >> 1);
								int var22 = var5 + (var19 + 1 >> 1);
								int var23 = var6 + (var20 >> 1);
								int var24 = var6 + (var20 + 1 >> 1);
								int[][] var25 = Tiles.Tiles_heights[VertexNormal.Client_plane];
								int var26 = var25[var22][var24] + var25[var21][var24] + var25[var22][var23] + var25[var21][var23] >> 2;
								int var27 = (var5 << 7) + (var19 << 6);
								int var28 = (var6 << 7) + (var20 << 6);
								Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28);
								if (var29 != null) {
									class113.updatePendingSpawn(VertexNormal.Client_plane, var5, var6, var15, -1, 0, 0, var11 + 1, var7 + 1);
									var17.animationCycleStart = var11 + Client.cycle;
									var17.animationCycleEnd = var7 + Client.cycle;
									var17.model0 = var29;
									var17.field1087 = var19 * 64 + var5 * 128;
									var17.field1070 = var20 * 64 + var6 * 128;
									var17.tileHeight2 = var26;
									byte var30;
									if (var39 > var37) {
										var30 = var39;
										var39 = var37;
										var37 = var30;
									}

									if (var38 > var16) {
										var30 = var38;
										var38 = var16;
										var16 = var30;
									}

									var17.minX = var5 + var39;
									var17.maxX = var37 + var5;
									var17.minY = var6 + var38;
									var17.maxY = var6 + var16;
								}
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	static final void method2980() {
		Client.field685 = Client.cycleCntr;
	}
}
