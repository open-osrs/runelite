import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ao")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	static final WorldMapID field292;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	static final WorldMapID field296;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1634523621
	)
	@Export("value")
	final int value;

	static {
		field292 = new WorldMapID(0);
		field296 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1557996921"
	)
	public static void method601() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1833830337"
	)
	static int method600(int var0, Script var1, boolean var2) {
		String var7;
		if (var0 == ScriptOpcodes.MES) {
			var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			class234.addGameMessage(0, "", var7);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			VarcInt.Interpreter_intStackSize -= 2;
			Tiles.performPlayerAnimation(PlayerAppearance.localPlayer, Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize], Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1103) {
				Interpreter.field1104 = true;
			}

			return 1;
		} else {
			int var16;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var16 = 0;
				if (ArchiveDiskAction.isNumber(var7)) {
					var16 = class279.parseInt(var7);
				}

				PacketBufferNode var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2291, Client.packetWriter.isaacCipher);
				var14.packetBuffer.writeInt(var16);
				Client.packetWriter.addNode(var14);
				return 1;
			} else {
				PacketBufferNode var12;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2245, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
					var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2261, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByte(var7.length() + 1);
					var12.packetBuffer.writeStringCp1252NullTerminated(var7);
					Client.packetWriter.addNode(var12);
					return 1;
				} else {
					String var4;
					int var10;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						FloorDecoration.method2931(var10, var4);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						VarcInt.Interpreter_intStackSize -= 3;
						var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
						Widget var15 = CollisionMap.getWidget(var9);
						class13.clickWidget(var15, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						VarcInt.Interpreter_intStackSize -= 2;
						var10 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
						var16 = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
						Widget var13 = var2 ? PlayerAppearance.field2561 : VarcInt.field3264;
						class13.clickWidget(var13, var10, var16);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						UserComparator9.mouseCam = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						Timer.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						GrandExchangeOffer.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var7 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
						boolean var8 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						AttackOption.openURL(var7, var8, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2250, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeShort(var10);
						Client.packetWriter.addNode(var12);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var10 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStackSize -= 2;
						var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
						if (var4.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = ItemContainer.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + FloorDecoration.stringCp1252NullTerminatedByteSize(var4) + FloorDecoration.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeByte(var10);
							var6.packetBuffer.writeStringCp1252NullTerminated(var4);
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class25.setTapToDrop(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class3.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						VarcInt.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						VarcInt.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--VarcInt.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = IgnoreList.canvasWidth;
						Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ModelData0.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--VarcInt.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						VarcInt.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field810 = 3;
						Client.field811 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field810 = 2;
						Client.field811 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field810 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field810 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field810 = 3;
						Client.field811 = var2 ? PlayerAppearance.field2561.id : VarcInt.field3264.id;
						return 1;
					} else {
						boolean var11;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							Timer.clientPreferences.hideUsername = var11;
							GrandExchangeOffer.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var11;
							if (!var11) {
								Timer.clientPreferences.rememberedUsername = "";
								GrandExchangeOffer.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var11 = Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize] == 1;
							if (var11 == Timer.clientPreferences.titleMusicDisabled) {
								Timer.clientPreferences.titleMusicDisabled = !var11;
								GrandExchangeOffer.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Timer.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = class13.method132();
							return 1;
						} else if (var0 == 3155) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							VarcInt.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--VarcInt.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--VarcInt.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--Interpreter.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--VarcInt.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--VarcInt.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							VarcInt.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							VarcInt.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							VarcInt.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--VarcInt.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--VarcInt.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--VarcInt.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--Interpreter.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3181) {
							var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--VarcInt.Interpreter_intStackSize], 0), 100);
							WorldMapSection1.method626((double)((float)var10 / 200.0F + 0.5F));
							return 1;
						} else if (var0 == 3182) {
							float var3 = ((float)Timer.clientPreferences.field1057 - 0.5F) * 200.0F;
							Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 100 - Math.round(var3);
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILcs;ZI)I",
		garbageValue = "-1805385873"
	)
	static int method599(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			VarcInt.Interpreter_intStackSize -= 2;
			Client.field896 = (short)HealthBarUpdate.method1823(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize]);
			if (Client.field896 <= 0) {
				Client.field896 = 256;
			}

			Client.field897 = (short)HealthBarUpdate.method1823(Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1]);
			if (Client.field897 <= 0) {
				Client.field897 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			VarcInt.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			VarcInt.Interpreter_intStackSize -= 4;
			Client.field900 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize];
			if (Client.field900 <= 0) {
				Client.field900 = 1;
			}

			Client.field731 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 1];
			if (Client.field731 <= 0) {
				Client.field731 = 32767;
			} else if (Client.field731 < Client.field900) {
				Client.field731 = Client.field900;
			}

			Client.field828 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 2];
			if (Client.field828 <= 0) {
				Client.field828 = 1;
			}

			Client.field903 = (short)Interpreter.Interpreter_intStack[VarcInt.Interpreter_intStackSize + 3];
			if (Client.field903 <= 0) {
				Client.field903 = 32767;
			} else if (Client.field903 < Client.field828) {
				Client.field903 = Client.field828;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class25.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MouseHandler.method1156(Client.field896);
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = MouseHandler.method1156(Client.field897);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = IgnoreList.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++VarcInt.Interpreter_intStackSize - 1] = ModelData0.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcx;II)V",
		garbageValue = "646312603"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		int var2;
		int var3;
		int var4;
		if (var0.field984 >= Client.cycle) {
			WorldMapManager.method672(var0);
		} else if (var0.field973 >= Client.cycle) {
			if (var0.field973 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0 || var0.sequenceFrameCycle + 1 > ParamDefinition.SequenceDefinition_get(var0.sequence).frameLengths[var0.sequenceFrame]) {
				var2 = var0.field973 - var0.field984;
				var3 = Client.cycle - var0.field984;
				var4 = var0.field981 * 128 + var0.field941 * 108072960;
				int var5 = var0.field982 * 128 + var0.field941 * 108072960;
				int var6 = var0.field958 * 128 + var0.field941 * 108072960;
				int var7 = var0.field956 * 128 + var0.field941 * 108072960;
				var0.x = (var6 * var3 + var4 * (var2 - var3)) / var2;
				var0.y = (var3 * var7 + var5 * (var2 - var3)) / var2;
			}

			var0.field963 = 0;
			var0.orientation = var0.field986;
			var0.rotation = var0.orientation;
		} else {
			class51.method831(var0);
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field984 = 0;
			var0.field973 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field941 * 108072960;
			var0.y = var0.pathY[0] * 128 + var0.field941 * 108072960;
			var0.method1803();
		}

		if (PlayerAppearance.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) {
			var0.sequence = -1;
			var0.spotAnimation = -1;
			var0.field984 = 0;
			var0.field973 = 0;
			var0.x = var0.pathX[0] * 128 + var0.field941 * 108072960;
			var0.y = var0.pathY[0] * 128 + var0.field941 * 108072960;
			var0.method1803();
		}

		if (var0.field940 != 0) {
			if (var0.targetIndex != -1) {
				Object var8 = null;
				if (var0.targetIndex < 32768) {
					var8 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var8 = Client.players[var0.targetIndex - 32768];
				}

				if (var8 != null) {
					var3 = var0.x - ((Actor)var8).x;
					var4 = var0.y - ((Actor)var8).y;
					if (var3 != 0 || var4 != 0) {
						var0.orientation = (int)(Math.atan2((double)var3, (double)var4) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field959 != -1 && (var0.pathLength == 0 || var0.field963 > 0)) {
				var0.orientation = var0.field959;
				var0.field959 = -1;
			}

			var2 = var0.orientation - var0.rotation & 2047;
			if (var2 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var2 != 0) {
				++var0.field954;
				boolean var10;
				if (var2 > 1024) {
					var0.rotation -= var0.field940;
					var10 = true;
					if (var2 < var0.field940 || var2 > 2048 - var0.field940) {
						var0.rotation = var0.orientation;
						var10 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field954 > 25 || var10)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field940;
					var10 = true;
					if (var2 < var0.field940 || var2 > 2048 - var0.field940) {
						var0.rotation = var0.orientation;
						var10 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field954 > 25 || var10)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field954 = 0;
			}
		}

		TilePaint.method3154(var0);
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-1609914367"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}
}
