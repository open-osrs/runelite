import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class60 {
	@ObfuscatedName("qh")
	@ObfuscatedSignature(
		signature = "Ldd;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("m")
	@Export("applet")
	static Applet applet;
	@ObfuscatedName("o")
	static String field450;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		signature = "Lby;"
	)
	@Export("localPlayer")
	static Player localPlayer;

	static {
		applet = null;
		field450 = "";
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lkb;II)V",
		garbageValue = "-220827004"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		DynamicObject.method2373(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 16) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			byte var7 = -1;
			if ((var6 & 256) != 0) {
				var7 = var0.method5750();
			}

			if ((var6 & 64) != 0) {
				var5.field992 = var0.readUnsignedShort();
				if (var5.pathLength == 0) {
					var5.orientation = var5.field992;
					var5.field992 = -1;
				}
			}

			int var8;
			int var9;
			if ((var6 & 128) != 0) {
				var8 = var0.method5757();
				if (var8 == 65535) {
					var8 = -1;
				}

				var9 = var0.method5748();
				SecureRandomCallable.performPlayerAnimation(var5, var8, var9);
			}

			if ((var6 & 2) != 0) {
				var5.overheadText = var0.readStringCp1252NullTerminated();
				if (var5.overheadText.charAt(0) == '~') {
					var5.overheadText = var5.overheadText.substring(1);
					ObjectSound.addGameMessage(2, var5.username.getName(), var5.overheadText);
				} else if (var5 == localPlayer) {
					ObjectSound.addGameMessage(2, var5.username.getName(), var5.overheadText);
				}

				var5.isAutoChatting = false;
				var5.overheadTextColor = 0;
				var5.overheadTextEffect = 0;
				var5.overheadTextCyclesRemaining = 150;
			}

			if ((var6 & 512) != 0) {
				var5.field995 = var0.method5750();
				var5.field1008 = var0.method5750();
				var5.field1007 = var0.method5751();
				var5.field1009 = var0.method5730();
				var5.field966 = var0.readUnsignedShort() + Client.cycle;
				var5.field1011 = var0.method5755() + Client.cycle;
				var5.field1006 = var0.readUnsignedShort();
				if (var5.field659) {
					var5.field995 += var5.tileX;
					var5.field1008 += var5.tileY;
					var5.field1007 += var5.tileX;
					var5.field1009 += var5.tileY;
					var5.pathLength = 0;
				} else {
					var5.field995 += var5.pathX[0];
					var5.field1008 += var5.pathY[0];
					var5.field1007 += var5.pathX[0];
					var5.field1009 += var5.pathY[0];
					var5.pathLength = 1;
				}

				var5.field1023 = 0;
			}

			int var11;
			int var12;
			int var15;
			if ((var6 & 1) != 0) {
				var8 = var0.readUnsignedShort();
				PlayerType var16 = (PlayerType)FaceNormal.findEnumerated(VarbitDefinition.PlayerType_values(), var0.method5936());
				boolean var10 = var0.readUnsignedByte() == 1;
				var11 = var0.method5746();
				var12 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var13 = false;
					if (var16.isUser && ModeWhere.friendSystem.isIgnored(var5.username)) {
						var13 = true;
					}

					if (!var13 && Client.field787 == 0 && !var5.isHidden) {
						Players.field1289.offset = 0;
						var0.readBytes(Players.field1289.array, 0, var11);
						Players.field1289.offset = 0;
						String var14 = AbstractFont.escapeBrackets(TileItemPile.method2903(NPC.method2157(Players.field1289)));
						var5.overheadText = var14.trim();
						var5.overheadTextColor = var8 >> 8;
						var5.overheadTextEffect = var8 & 255;
						var5.overheadTextCyclesRemaining = 150;
						var5.isAutoChatting = var10;
						var5.field979 = var5 != localPlayer && var16.isUser && "" != Client.field755 && var14.toLowerCase().indexOf(Client.field755) == -1;
						if (var16.isPrivileged) {
							var15 = var10 ? 91 : 1;
						} else {
							var15 = var10 ? 90 : 2;
						}

						if (var16.modIcon != -1) {
							ObjectSound.addGameMessage(var15, WorldMapRegion.method611(var16.modIcon) + var5.username.getName(), var14);
						} else {
							ObjectSound.addGameMessage(var15, var5.username.getName(), var14);
						}
					}
				}

				var0.offset = var12 + var11;
			}

			if ((var6 & 8) != 0) {
				var5.targetIndex = var0.readUnsignedShort();
				if (var5.targetIndex == 65535) {
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 4096) != 0) {
				var5.spotAnimation = var0.method5757();
				var8 = var0.method5766();
				var5.field1005 = var8 >> 16;
				var5.field987 = (var8 & 65535) + Client.cycle;
				var5.spotAnimationFrame = 0;
				var5.spotAnimationFrameCycle = 0;
				if (var5.field987 > Client.cycle) {
					var5.spotAnimationFrame = -1;
				}

				if (var5.spotAnimation == 65535) {
					var5.spotAnimation = -1;
				}
			}

			if ((var6 & 1024) != 0) {
				for (var8 = 0; var8 < 3; ++var8) {
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var6 & 2048) != 0) {
				Players.field1278[var4] = var0.method5750();
			}

			if ((var6 & 4) != 0) {
				var8 = var0.method5746();
				int var18;
				int var19;
				int var21;
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var11 = -1;
						var12 = -1;
						var21 = -1;
						var19 = var0.readUShortSmart();
						if (var19 == 32767) {
							var19 = var0.readUShortSmart();
							var12 = var0.readUShortSmart();
							var11 = var0.readUShortSmart();
							var21 = var0.readUShortSmart();
						} else if (var19 != 32766) {
							var12 = var0.readUShortSmart();
						} else {
							var19 = -1;
						}

						var18 = var0.readUShortSmart();
						var5.addHitSplat(var19, var12, var11, var21, Client.cycle, var18);
					}
				}

				var9 = var0.readUnsignedByte();
				if (var9 > 0) {
					for (var19 = 0; var19 < var9; ++var19) {
						var11 = var0.readUShortSmart();
						var12 = var0.readUShortSmart();
						if (var12 != 32767) {
							var21 = var0.readUShortSmart();
							var18 = var0.method5748();
							var15 = var12 > 0 ? var0.method5746() : var18;
							var5.addHealthBar(var11, Client.cycle, var12, var21, var18, var15);
						} else {
							var5.removeHealthBar(var11);
						}
					}
				}
			}

			if ((var6 & 32) != 0) {
				var8 = var0.method5748();
				byte[] var22 = new byte[var8];
				Buffer var17 = new Buffer(var22);
				var0.method5821(var22, 0, var8);
				Players.field1279[var4] = var17;
				var5.read(var17);
			}

			if (var5.field659) {
				if (var7 == 127) {
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					byte var20;
					if (var7 != -1) {
						var20 = var7;
					} else {
						var20 = Players.field1278[var4];
					}

					var5.method1300(var5.tileX, var5.tileY, var20);
				}
			}
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "76630753"
	)
	public static void method972() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		signature = "(Lhd;IIS)V",
		garbageValue = "-5579"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && GrandExchangeEvent.method157(var0) != null) {
				Client.clickedWidget = var0;
				Widget var4 = FriendSystem.method1994(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				Client.clickedWidgetParent = var4;
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				GrandExchangeOfferAgeComparator.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var5 = UrlRequester.method3421();
				if (var5 != -1) {
					WorldMapSection1.method648(var5);
				}

			}
		}
	}
}
