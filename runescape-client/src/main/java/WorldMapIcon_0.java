import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ai")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		signature = "Lr;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2054953485
	)
	@Export("element")
	final int element;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lar;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 841547123
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -826275661
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		signature = "(Lhg;Lhg;ILar;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = Client.WorldMapElement_get(this.getElement());
		Sprite var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(B)I",
		garbageValue = "0"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(B)Lar;",
		garbageValue = "35"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1804331962"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1265869629"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)[B",
		garbageValue = "-116765930"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "1354105347"
	)
	static int method265(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = TileItemPile.Client_plane;
			int var9 = (class60.localPlayer.x >> 7) + class182.baseX;
			int var5 = (class60.localPlayer.y >> 7) + SecureRandomFuture.baseY;
			ClanChat.getWorldMap().method6532(var3, var9, var5, true);
			return 1;
		} else {
			WorldMapArea var11;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				String var16 = "";
				var11 = ClanChat.getWorldMap().getMapArea(var3);
				if (var11 != null) {
					var16 = var11.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				ClanChat.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
				ClanChat.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var15;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
					ClanChat.getWorldMap().setWorldMapPositionTarget(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
					ClanChat.getWorldMap().setWorldMapPositionTargetInstant(var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
					ClanChat.getWorldMap().jumpToSourceCoord(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
					ClanChat.getWorldMap().jumpToSourceCoordInstant(var15.plane, var15.x, var15.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var13;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var13 = ClanChat.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var13 = ClanChat.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (var13.getRegionHighX() - var13.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = (var13.getRegionHighY() - var13.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var13 = ClanChat.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var13 = ClanChat.getWorldMap().getMapArea(var3);
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var15 = ClanChat.getWorldMap().getDisplayCoord();
						if (var15 == null) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var15.x;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var15.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
						var13 = ClanChat.getWorldMap().getCurrentMapArea();
						if (var13 == null) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var14 = var13.position(var15.plane, var15.x, var15.y);
							if (var14 == null) {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var14[0];
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var14[1];
							}

							return 1;
						}
					} else {
						Coord var7;
						if (var0 == 6618) {
							var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
							var13 = ClanChat.getWorldMap().getCurrentMapArea();
							if (var13 == null) {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var7 = var13.coord(var15.x, var15.y);
								if (var7 == null) {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var7.packed();
								}

								return 1;
							}
						} else {
							Coord var12;
							if (var0 == 6619) {
								UrlRequester.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
								WorldMapElement.method4566(var3, var12, false);
								return 1;
							} else if (var0 == 6620) {
								UrlRequester.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
								WorldMapElement.method4566(var3, var12, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								UrlRequester.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
								var12 = new Coord(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
								var11 = ClanChat.getWorldMap().getMapArea(var3);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var11.containsCoord(var12.plane, var12.x, var12.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var15 = new Coord(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
								var13 = ClanChat.getWorldMap().mapAreaAtCoord(var15.plane, var15.x, var15.y);
								if (var13 == null) {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var13.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								ClanChat.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								ClanChat.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								ClanChat.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								ClanChat.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var10;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
									ClanChat.getWorldMap().setPerpetualFlash(var10);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
									ClanChat.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
									ClanChat.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									ClanChat.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var10 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
									ClanChat.getWorldMap().setElementsDisabled(var10);
									return 1;
								} else {
									boolean var4;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										UrlRequester.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1] == 1;
										ClanChat.getWorldMap().disableElement(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										UrlRequester.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1] == 1;
										ClanChat.getWorldMap().setCategoryDisabled(var3, var4);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = ClanChat.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										UrlRequester.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
										var12 = new Coord(Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
										var7 = ClanChat.getWorldMap().method6575(var3, var12);
										if (var7 == null) {
											Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var7.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var8;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var8 = ClanChat.getWorldMap().iconStart();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var8 = ClanChat.getWorldMap().iconNext();
											if (var8 == null) {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var8.getElement();
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var8.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var6;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
												var6 = Client.WorldMapElement_get(var3);
												if (var6.name == null) {
													Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++WorldMapEvent.Interpreter_stringStackSize - 1] = var6.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
												var6 = Client.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
												var6 = Client.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
												var6 = Client.WorldMapElement_get(var3);
												if (var6 == null) {
													Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = var6.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapSection3.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapSection3.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = WorldMapSection3.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		signature = "(ZI)V",
		garbageValue = "-63078339"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field967 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}

					long var5 = class206.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					UserComparator3.scene.drawEntity(TileItemPile.Client_plane, var2.x, var2.y, Language.getTileHeight(var2.field967 * 64 - 64 + var2.x, var2.field967 * 64 - 64 + var2.y, TileItemPile.Client_plane), var2.field967 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		signature = "([Lhd;Lhd;ZS)V",
		garbageValue = "-3141"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth * 1772823043 * -897574741 : var1.width * 1667004247 * -75340697;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight * -519746393 * -962880745 : var1.height * -2125257181 * 1991883147;
		GrandExchangeOfferUnitPriceComparator.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			GrandExchangeOfferUnitPriceComparator.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			int var6 = var5.group;
			if (UserComparator4.loadInterface(var6)) {
				GrandExchangeOfferUnitPriceComparator.resizeInterface(Widget.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
