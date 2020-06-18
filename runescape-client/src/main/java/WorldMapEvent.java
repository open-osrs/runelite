import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1506774655
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1403861851
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhg;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lhg;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		signature = "(ILhg;Lhg;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)J",
		garbageValue = "-33276510"
	)
	static long method839() {
		try {
			URL var0 = new URL(HealthBarDefinition.method4669("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(II)Lir;",
		garbageValue = "-2114458170"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lig;IIIBZI)V",
		garbageValue = "-966731754"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2);
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
		if (var8 == null) {
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
			if (var8 == null) {
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		signature = "(ILcs;ZI)I",
		garbageValue = "-1652034071"
	)
	static int method836(int var0, Script var1, boolean var2) {
		String var3;
		if (var0 == ScriptOpcodes.MES) {
			var3 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
			ObjectSound.addGameMessage(0, "", var3);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			UrlRequester.Interpreter_intStackSize -= 2;
			SecureRandomCallable.performPlayerAnimation(class60.localPlayer, Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize], Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1118) {
				Interpreter.field1125 = true;
			}

			return 1;
		} else {
			int var10;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
				var10 = 0;
				if (UserComparator7.isNumber(var3)) {
					var10 = Tiles.parseInt(var3);
				}

				PacketBufferNode var12 = UserComparator4.getPacketBufferNode(ClientPacket.field2298, Client.packetWriter.isaacCipher);
				var12.packetBuffer.writeInt(var10);
				Client.packetWriter.addNode(var12);
				return 1;
			} else {
				PacketBufferNode var14;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
					var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2312, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else {
					String var7;
					int var15;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var15 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
						SoundCache.method2647(var15, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						UrlRequester.Interpreter_intStackSize -= 3;
						var15 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 2];
						Widget var13 = WorldMapSprite.getWidget(var9);
						class60.clickWidget(var13, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						UrlRequester.Interpreter_intStackSize -= 2;
						var15 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
						Widget var11 = var2 ? KeyHandler.field407 : SecureRandomCallable.field544;
						class60.clickWidget(var11, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						ArchiveLoader.mouseCam = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = NetSocket.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						NetSocket.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						SpriteMask.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var3 = Interpreter.Interpreter_stringStack[--Interpreter_stringStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						WorldMapSectionType.openURL(var3, var4, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var15 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						var14 = UserComparator4.getPacketBufferNode(ClientPacket.field2269, Client.packetWriter.isaacCipher);
						var14.packetBuffer.writeShort(var15);
						Client.packetWriter.addNode(var14);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var15 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						Interpreter_stringStackSize -= 2;
						var7 = Interpreter.Interpreter_stringStack[Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter_stringStackSize + 1];
						if (var7.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = UserComparator4.getPacketBufferNode(ClientPacket.field2304, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + DynamicObject.stringCp1252NullTerminatedByteSize(var7) + DynamicObject.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var7);
							var6.packetBuffer.method5837(var15);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Skeleton.setTapToDrop(Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Player.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						UrlRequester.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[UrlRequester.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						UrlRequester.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--UrlRequester.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Varcs.canvasWidth;
						Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = class52.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--UrlRequester.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						UrlRequester.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field835 = 3;
						Client.field671 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field835 = 2;
						Client.field671 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field835 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field835 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field835 = 3;
						Client.field671 = var2 ? KeyHandler.field407.id * 40459347 * 1532053467 : SecureRandomCallable.field544.id * 40459347 * 1532053467;
						return 1;
					} else {
						boolean var8;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var8 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							NetSocket.clientPreferences.hideUsername = var8;
							SpriteMask.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = NetSocket.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var8 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var8;
							if (!var8) {
								NetSocket.clientPreferences.rememberedUsername = "";
								SpriteMask.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var8 = Interpreter.Interpreter_intStack[--UrlRequester.Interpreter_intStackSize] == 1;
							if (var8 == NetSocket.clientPreferences.titleMusicDisabled) {
								NetSocket.clientPreferences.titleMusicDisabled = !var8;
								SpriteMask.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = NetSocket.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = MusicPatchNode2.method3820();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							UrlRequester.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--UrlRequester.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--UrlRequester.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--UrlRequester.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--UrlRequester.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							UrlRequester.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							UrlRequester.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							UrlRequester.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--UrlRequester.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--UrlRequester.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--UrlRequester.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++UrlRequester.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter_stringStackSize;
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "823242837"
	)
	static void method840(int var0, int var1) {
		int var2 = GrandExchangeOfferNameComparator.fontBold12.stringWidth("Choose Option");

		int var3;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			Font var4 = GrandExchangeOfferNameComparator.fontBold12;
			String var5;
			if (var3 < 0) {
				var5 = "";
			} else if (Client.menuTargets[var3].length() > 0) {
				var5 = Client.menuActions[var3] + " " + Client.menuTargets[var3];
			} else {
				var5 = Client.menuActions[var3];
			}

			int var6 = var4.stringWidth(var5);
			if (var6 > var2) {
				var2 = var6;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		int var7 = var0 - var2 / 2;
		if (var2 + var7 > Varcs.canvasWidth) {
			var7 = Varcs.canvasWidth - var2;
		}

		if (var7 < 0) {
			var7 = 0;
		}

		int var8 = var1;
		if (var3 + var1 > class52.canvasHeight) {
			var8 = class52.canvasHeight - var3;
		}

		if (var8 < 0) {
			var8 = 0;
		}

		WorldMapRectangle.menuX = var7;
		Frames.menuY = var8;
		class69.menuWidth = var2;
		ApproximateRouteStrategy.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
