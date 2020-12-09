import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bh")
public final class class52 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Llw;",
		garbageValue = "1066778190"
	)
	public static PrivateChatMode method840(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field3834, PrivateChatMode.field3833, PrivateChatMode.field3832};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field3835) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-677680032"
	)
	public static boolean method844(int var0) {
		return (var0 >> 30 & 1) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "2036711787"
	)
	static int method845(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = GameObject.Client_plane;
			int var15 = NetFileRequest.baseX * 64 + (PlayerAppearance.localPlayer.x >> 7);
			int var8 = class41.baseY * 64 + (PlayerAppearance.localPlayer.y >> 7);
			Actor.getWorldMap().method6370(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				String var16 = "";
				var9 = Actor.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Actor.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
				Actor.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
					Actor.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var11 = Actor.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var11 = Actor.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var11 = Actor.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var11 = Actor.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = Actor.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
						var11 = Actor.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
							var11 = Actor.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								VarcInt.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
								class204.method3721(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								VarcInt.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
								class204.method3721(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								VarcInt.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
								var9 = Actor.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
								var11 = Actor.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								Actor.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								Actor.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								Actor.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								Actor.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
									Actor.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
									Actor.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
									Actor.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									Actor.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
									Actor.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										VarcInt.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1;
										Actor.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										VarcInt.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1] == 1;
										Actor.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Actor.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										VarcInt.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
										var5 = Actor.getWorldMap().method6414(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = Actor.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = Actor.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var4 = UserComparator10.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var4 = UserComparator10.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var4 = UserComparator10.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
												var4 = UserComparator10.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Script.worldMapEvent.coord2.packed();
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
}
