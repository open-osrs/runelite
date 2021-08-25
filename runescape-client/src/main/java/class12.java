import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.security.cert.Certificate;
import java.util.Date;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("v")
class class12 extends SSLSocket {
	@ObfuscatedName("n")
	Certificate[] field60;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lh;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	@ObfuscatedName("n")
	public static String method172(long var0) {
		Calendar.Calendar_calendar.setTime(new Date(var0));
		int var2 = Calendar.Calendar_calendar.get(7);
		int var3 = Calendar.Calendar_calendar.get(5);
		int var4 = Calendar.Calendar_calendar.get(2);
		int var5 = Calendar.Calendar_calendar.get(1);
		int var6 = Calendar.Calendar_calendar.get(11);
		int var7 = Calendar.Calendar_calendar.get(12);
		int var8 = Calendar.Calendar_calendar.get(13);
		return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "27"
	)
	static void method129(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class29.field172.startsWith("win") && !var3) {
				BufferedNetSocket.method6116(var0, 0, "openjs");
				return;
			}

			if (class29.field172.startsWith("mac")) {
				BufferedNetSocket.method6116(var0, 1, var2);
				return;
			}

			BufferedNetSocket.method6116(var0, 2, "openjs");
		} else {
			BufferedNetSocket.method6116(var0, 3, "openjs");
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILbg;ZB)I",
		garbageValue = "82"
	)
	static int method173(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class391.Client_plane;
			int var15 = (class129.localPlayer.x >> 7) + FloorOverlayDefinition.baseX;
			int var8 = (class129.localPlayer.y >> 7) + class320.baseY;
			NetSocket.getWorldMap().method6361(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				String var16 = "";
				var9 = NetSocket.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				NetSocket.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
				NetSocket.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
					NetSocket.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
					NetSocket.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
					NetSocket.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
					NetSocket.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var11 = NetSocket.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var11 = NetSocket.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var11 = NetSocket.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
						var11 = NetSocket.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = NetSocket.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
						var11 = NetSocket.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
							var11 = NetSocket.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class240.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
								class15.method214(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class240.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
								class15.method214(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class240.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
								var9 = NetSocket.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
								var11 = NetSocket.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								NetSocket.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								NetSocket.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								NetSocket.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								NetSocket.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
									NetSocket.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
									NetSocket.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
									NetSocket.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									NetSocket.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize] == 1;
									NetSocket.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class240.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1] == 1;
										NetSocket.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class240.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1] == 1;
										NetSocket.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = NetSocket.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class240.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class240.Interpreter_intStackSize + 1]);
										var5 = NetSocket.getWorldMap().method6405(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = NetSocket.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = NetSocket.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
												var4 = class54.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
												var4 = class54.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
												var4 = class54.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class240.Interpreter_intStackSize];
												var4 = class54.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class138.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class138.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class240.Interpreter_intStackSize - 1] = class138.worldMapEvent.coord2.packed();
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

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-76026334"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}
}
