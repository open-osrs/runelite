import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kg")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2039125055
	)
	public static int field3662;
	@ObfuscatedName("a")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;
	@ObfuscatedName("o")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1828605303
	)
	@Export("musicTrackFileId")
	public static int musicTrackFileId;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque(); // L: 9
		ArchiveDiskActionHandler_responseQueue = new NodeDeque(); // L: 10
		field3662 = 0; // L: 11
		ArchiveDiskActionHandler_lock = new Object();
	} // L: 12

	ArchiveDiskActionHandler() {
	} // L: 15

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 74
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last(); // L: 75
				} // L: 76

				if (var1 != null) { // L: 77
					if (var1.type == 0) { // L: 78
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length); // L: 79
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 80
							var1.remove(); // L: 81
						} // L: 82
					} else if (var1.type == 1) { // L: 84
						var1.data = var1.archiveDisk.read((int)var1.key); // L: 85
						synchronized(ArchiveDiskActionHandler_requestQueue) { // L: 86
							ArchiveDiskActionHandler_responseQueue.addFirst(var1); // L: 87
						} // L: 88
					}

					synchronized(ArchiveDiskActionHandler_lock) { // L: 90
						if (field3662 <= 1) { // L: 91
							field3662 = 0; // L: 92
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 93
							return; // L: 94
						}

						field3662 = 600; // L: 96
					}
				} else {
					FloorUnderlayDefinition.method3190(100L); // L: 100
					synchronized(ArchiveDiskActionHandler_lock) { // L: 101
						if (field3662 <= 1) { // L: 102
							field3662 = 0; // L: 103
							ArchiveDiskActionHandler_lock.notifyAll(); // L: 104
							return; // L: 105
						}

						--field3662; // L: 107
					}
				}
			}
		} catch (Exception var13) { // L: 112
			MilliClock.RunException_sendStackTrace((String)null, var13); // L: 113
		}
	} // L: 115

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "15810"
	)
	static void method5258() {
		if (Login.clearLoginScreen) { // L: 267
			Login.titleboxSprite = null; // L: 268
			Login.titlebuttonSprite = null; // L: 269
			Login.runesSprite = null; // L: 270
			RouteStrategy.leftTitleSprite = null; // L: 271
			class139.rightTitleSprite = null; // L: 272
			class16.logoSprite = null; // L: 273
			VarpDefinition.title_muteSprite = null; // L: 274
			NetSocket.options_buttons_0Sprite = null; // L: 275
			class9.options_buttons_2Sprite = null; // L: 276
			DirectByteArrayCopier.worldSelectBackSprites = null; // L: 277
			UserComparator7.worldSelectFlagSprites = null; // L: 278
			class54.worldSelectArrows = null; // L: 279
			KeyHandler.worldSelectStars = null; // L: 280
			class12.field54 = null; // L: 281
			Login.loginScreenRunesAnimation.method2193(); // L: 282
			class247.musicPlayerStatus = 1; // L: 284
			class128.musicTrackArchive = null; // L: 285
			FillMode.musicTrackGroupId = -1; // L: 286
			musicTrackFileId = -1; // L: 287
			class247.musicTrackVolume = 0; // L: 288
			SecureRandomCallable.musicTrackBoolean = false; // L: 289
			class247.pcmSampleLength = 2; // L: 290
			if (NetCache.NetCache_socket != null) { // L: 293
				try {
					Buffer var0 = new Buffer(4); // L: 295
					var0.writeByte(2); // L: 296
					var0.writeMedium(0); // L: 297
					NetCache.NetCache_socket.write(var0.array, 0, 4); // L: 298
				} catch (IOException var3) {
					try {
						NetCache.NetCache_socket.close(); // L: 302
					} catch (Exception var2) { // L: 304
					}

					++NetCache.NetCache_ioExceptions; // L: 305
					NetCache.NetCache_socket = null; // L: 306
				}
			}

			Login.clearLoginScreen = false; // L: 309
		}
	} // L: 310

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-146684783"
	)
	static int method5257(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 3911
			var3 = GrandExchangeOfferTotalQuantityComparator.Client_plane; // L: 3912
			int var15 = (HealthBarDefinition.localPlayer.x >> 7) + class19.baseX; // L: 3913
			int var8 = (HealthBarDefinition.localPlayer.y >> 7) + DefaultsGroup.baseY; // L: 3914
			class54.getWorldMap().method6497(var3, var15, var8, true); // L: 3915
			return 1; // L: 3916
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 3918
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3919
				String var16 = ""; // L: 3920
				var9 = class54.getWorldMap().getMapArea(var3); // L: 3921
				if (var9 != null) { // L: 3922
					var16 = var9.getExternalName(); // L: 3923
				}

				Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var16; // L: 3925
				return 1; // L: 3926
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 3928
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3929
				class54.getWorldMap().setCurrentMapAreaId(var3); // L: 3930
				return 1; // L: 3931
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 3933
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getZoomLevel(); // L: 3934
				return 1; // L: 3935
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 3937
				var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3938
				class54.getWorldMap().setZoomPercentage(var3); // L: 3939
				return 1; // L: 3940
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 3942
				Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 3943
				return 1; // L: 3944
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 3946
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 3947
					class54.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 3948
					return 1; // L: 3949
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 3951
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 3952
					class54.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 3953
					return 1; // L: 3954
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 3956
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 3957
					class54.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 3958
					return 1; // L: 3959
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 3961
					var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 3962
					class54.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 3963
					return 1; // L: 3964
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 3966
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayX(); // L: 3967
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayY(); // L: 3968
					return 1; // L: 3969
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 3971
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3972
						var11 = class54.getWorldMap().getMapArea(var3); // L: 3973
						if (var11 == null) { // L: 3974
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3975
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 3978
						}

						return 1; // L: 3980
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 3982
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3983
						var11 = class54.getWorldMap().getMapArea(var3); // L: 3984
						if (var11 == null) { // L: 3985
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3986
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3987
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 3990
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 3991
						}

						return 1; // L: 3993
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 3995
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 3996
						var11 = class54.getWorldMap().getMapArea(var3); // L: 3997
						if (var11 == null) { // L: 3998
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 3999
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4000
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4001
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4002
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4005
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4006
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4007
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4008
						}

						return 1; // L: 4010
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4012
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4013
						var11 = class54.getWorldMap().getMapArea(var3); // L: 4014
						if (var11 == null) { // L: 4015
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4016
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4019
						}

						return 1; // L: 4021
					} else if (var0 == 6615) { // L: 4023
						var14 = class54.getWorldMap().getDisplayCoord(); // L: 4024
						if (var14 == null) { // L: 4025
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4026
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4027
						} else {
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var14.x; // L: 4030
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var14.y; // L: 4031
						}

						return 1; // L: 4033
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4035
						Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().currentMapAreaId(); // L: 4036
						return 1; // L: 4037
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4039
						var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 4040
						var11 = class54.getWorldMap().getCurrentMapArea(); // L: 4041
						if (var11 == null) { // L: 4042
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4043
							Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4044
							return 1; // L: 4045
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4047
							if (var12 == null) { // L: 4048
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4049
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4050
							} else {
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var12[0]; // L: 4053
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var12[1]; // L: 4054
							}

							return 1; // L: 4056
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4058
							var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 4059
							var11 = class54.getWorldMap().getCurrentMapArea(); // L: 4060
							if (var11 == null) { // L: 4061
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4062
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4063
								return 1; // L: 4064
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4066
								if (var5 == null) { // L: 4067
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4068
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.packed(); // L: 4071
								}

								return 1; // L: 4073
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4075
								class14.Interpreter_intStackSize -= 2; // L: 4076
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 4077
								var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 4078
								class16.method219(var3, var10, false); // L: 4079
								return 1; // L: 4080
							} else if (var0 == 6620) { // L: 4082
								class14.Interpreter_intStackSize -= 2; // L: 4083
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 4084
								var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 4085
								class16.method219(var3, var10, true); // L: 4086
								return 1; // L: 4087
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4089
								class14.Interpreter_intStackSize -= 2; // L: 4090
								var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 4091
								var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 4092
								var9 = class54.getWorldMap().getMapArea(var3); // L: 4093
								if (var9 == null) { // L: 4094
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = 0; // L: 4095
									return 1; // L: 4096
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4098
									return 1; // L: 4099
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4101
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayWith(); // L: 4102
								Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getDisplayHeight(); // L: 4103
								return 1; // L: 4104
							} else if (var0 == 6623) { // L: 4106
								var14 = new Coord(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 4107
								var11 = class54.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4108
								if (var11 == null) { // L: 4109
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4110
								} else {
									Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var11.getId(); // L: 4113
								}

								return 1; // L: 4115
							} else if (var0 == 6624) { // L: 4117
								class54.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 4118
								return 1; // L: 4119
							} else if (var0 == 6625) { // L: 4121
								class54.getWorldMap().resetMaxFlashCount(); // L: 4122
								return 1; // L: 4123
							} else if (var0 == 6626) { // L: 4125
								class54.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]); // L: 4126
								return 1; // L: 4127
							} else if (var0 == 6627) { // L: 4129
								class54.getWorldMap().resetCyclesPerFlash(); // L: 4130
								return 1; // L: 4131
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4133
									var13 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 4134
									class54.getWorldMap().setPerpetualFlash(var13); // L: 4135
									return 1; // L: 4136
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4138
									var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4139
									class54.getWorldMap().flashElement(var3); // L: 4140
									return 1; // L: 4141
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4143
									var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4144
									class54.getWorldMap().flashCategory(var3); // L: 4145
									return 1; // L: 4146
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4148
									class54.getWorldMap().stopCurrentFlashes(); // L: 4149
									return 1; // L: 4150
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4152
									var13 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1; // L: 4153
									class54.getWorldMap().setElementsDisabled(var13); // L: 4154
									return 1; // L: 4155
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4157
										class14.Interpreter_intStackSize -= 2; // L: 4158
										var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 4159
										var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1; // L: 4160
										class54.getWorldMap().disableElement(var3, var7); // L: 4161
										return 1; // L: 4162
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4164
										class14.Interpreter_intStackSize -= 2; // L: 4165
										var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 4166
										var7 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1] == 1; // L: 4167
										class54.getWorldMap().setCategoryDisabled(var3, var7); // L: 4168
										return 1; // L: 4169
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4171
										Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4172
										return 1; // L: 4173
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4175
										var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4176
										Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4177
										return 1; // L: 4178
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4180
										var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4181
										Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class54.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4182
										return 1; // L: 4183
									} else if (var0 == 6638) { // L: 4185
										class14.Interpreter_intStackSize -= 2; // L: 4186
										var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize]; // L: 4187
										var10 = new Coord(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]); // L: 4188
										var5 = class54.getWorldMap().method6666(var3, var10); // L: 4189
										if (var5 == null) { // L: 4190
											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4191
										} else {
											Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var5.packed(); // L: 4194
										}

										return 1; // L: 4196
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4198
											var6 = class54.getWorldMap().iconStart(); // L: 4199
											if (var6 == null) { // L: 4200
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4201
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4202
											} else {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4205
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4206
											}

											return 1; // L: 4208
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4210
											var6 = class54.getWorldMap().iconNext(); // L: 4211
											if (var6 == null) { // L: 4212
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4213
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4214
											} else {
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4217
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4218
											}

											return 1; // L: 4220
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4222
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4223
												var4 = ItemComposition.WorldMapElement_get(var3); // L: 4224
												if (var4.name == null) { // L: 4225
													Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = ""; // L: 4226
												} else {
													Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4.name; // L: 4229
												}

												return 1; // L: 4231
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4233
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4234
												var4 = ItemComposition.WorldMapElement_get(var3); // L: 4235
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.textSize; // L: 4236
												return 1; // L: 4237
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4239
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4240
												var4 = ItemComposition.WorldMapElement_get(var3); // L: 4241
												if (var4 == null) { // L: 4242
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4243
												} else {
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.category; // L: 4246
												}

												return 1; // L: 4248
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4250
												var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]; // L: 4251
												var4 = ItemComposition.WorldMapElement_get(var3); // L: 4252
												if (var4 == null) { // L: 4253
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1; // L: 4254
												} else {
													Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4257
												}

												return 1; // L: 4259
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4261
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class7.worldMapEvent.mapElement; // L: 4262
												return 1; // L: 4263
											} else if (var0 == 6698) { // L: 4265
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class7.worldMapEvent.coord1.packed(); // L: 4266
												return 1; // L: 4267
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4269
												Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = class7.worldMapEvent.coord2.packed(); // L: 4270
												return 1; // L: 4271
											} else {
												return 2; // L: 4273
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
