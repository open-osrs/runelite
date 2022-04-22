import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("p")
class class11 implements TlsAuthentication {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = -2100133853
	)
	static int field54;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lk;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lk;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1; // L: 246
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509"); // L: 249
			LinkedList var3 = new LinkedList(); // L: 250
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList(); // L: 252

			for (int var5 = 0; var5 < var4.length; ++var5) { // L: 253
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5]; // L: 254
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded()))); // L: 256
			}

			this.this$2.this$1.field62 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0])); // L: 260
		} catch (CertificateException var7) { // L: 262
			throw new IOException(var7); // L: 263
		}
	} // L: 265

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null; // L: 268
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILbd;ZI)I",
		garbageValue = "-513388138"
	)
	static int method100(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) { // L: 4118
			var3 = class18.Client_plane; // L: 4119
			int var15 = (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX; // L: 4120
			int var8 = (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY; // L: 4121
			class21.getWorldMap().method7327(var3, var15, var8, true); // L: 4122
			return 1; // L: 4123
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) { // L: 4125
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4126
				String var16 = ""; // L: 4127
				var9 = class21.getWorldMap().getMapArea(var3); // L: 4128
				if (var9 != null) { // L: 4129
					var16 = var9.getExternalName(); // L: 4130
				}

				Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var16; // L: 4132
				return 1; // L: 4133
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) { // L: 4135
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4136
				class21.getWorldMap().setCurrentMapAreaId(var3); // L: 4137
				return 1; // L: 4138
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) { // L: 4140
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().getZoomLevel(); // L: 4141
				return 1; // L: 4142
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) { // L: 4144
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4145
				class21.getWorldMap().setZoomPercentage(var3); // L: 4146
				return 1; // L: 4147
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) { // L: 4149
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().isCacheLoaded() ? 1 : 0; // L: 4150
				return 1; // L: 4151
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) { // L: 4153
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4154
					class21.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y); // L: 4155
					return 1; // L: 4156
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) { // L: 4158
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4159
					class21.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y); // L: 4160
					return 1; // L: 4161
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) { // L: 4163
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4164
					class21.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y); // L: 4165
					return 1; // L: 4166
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) { // L: 4168
					var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4169
					class21.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y); // L: 4170
					return 1; // L: 4171
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) { // L: 4173
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().getDisplayX(); // L: 4174
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().getDisplayY(); // L: 4175
					return 1; // L: 4176
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) { // L: 4178
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4179
						var11 = class21.getWorldMap().getMapArea(var3); // L: 4180
						if (var11 == null) { // L: 4181
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4182
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getOrigin().packed(); // L: 4185
						}

						return 1; // L: 4187
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) { // L: 4189
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4190
						var11 = class21.getWorldMap().getMapArea(var3); // L: 4191
						if (var11 == null) { // L: 4192
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4193
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4194
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64; // L: 4197
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64; // L: 4198
						}

						return 1; // L: 4200
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) { // L: 4202
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4203
						var11 = class21.getWorldMap().getMapArea(var3); // L: 4204
						if (var11 == null) { // L: 4205
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4206
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4207
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4208
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4209
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64; // L: 4212
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64; // L: 4213
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1; // L: 4214
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1; // L: 4215
						}

						return 1; // L: 4217
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) { // L: 4219
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4220
						var11 = class21.getWorldMap().getMapArea(var3); // L: 4221
						if (var11 == null) { // L: 4222
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4223
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getZoom(); // L: 4226
						}

						return 1; // L: 4228
					} else if (var0 == 6615) { // L: 4230
						var14 = class21.getWorldMap().getDisplayCoord(); // L: 4231
						if (var14 == null) { // L: 4232
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4233
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4234
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.x; // L: 4237
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var14.y; // L: 4238
						}

						return 1; // L: 4240
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) { // L: 4242
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().currentMapAreaId(); // L: 4243
						return 1; // L: 4244
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) { // L: 4246
						var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4247
						var11 = class21.getWorldMap().getCurrentMapArea(); // L: 4248
						if (var11 == null) { // L: 4249
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4250
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4251
							return 1; // L: 4252
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y); // L: 4254
							if (var12 == null) { // L: 4255
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4256
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4257
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[0]; // L: 4260
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12[1]; // L: 4261
							}

							return 1; // L: 4263
						}
					} else {
						Coord var5;
						if (var0 == 6618) { // L: 4265
							var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4266
							var11 = class21.getWorldMap().getCurrentMapArea(); // L: 4267
							if (var11 == null) { // L: 4268
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4269
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4270
								return 1; // L: 4271
							} else {
								var5 = var11.coord(var14.x, var14.y); // L: 4273
								if (var5 == null) { // L: 4274
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4275
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4278
								}

								return 1; // L: 4280
							}
						} else {
							Coord var10;
							if (var0 == 6619) { // L: 4282
								Interpreter.Interpreter_intStackSize -= 2; // L: 4283
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4284
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4285
								GameEngine.method570(var3, var10, false); // L: 4286
								return 1; // L: 4287
							} else if (var0 == 6620) { // L: 4289
								Interpreter.Interpreter_intStackSize -= 2; // L: 4290
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4291
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4292
								GameEngine.method570(var3, var10, true); // L: 4293
								return 1; // L: 4294
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) { // L: 4296
								Interpreter.Interpreter_intStackSize -= 2; // L: 4297
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4298
								var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4299
								var9 = class21.getWorldMap().getMapArea(var3); // L: 4300
								if (var9 == null) { // L: 4301
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 4302
									return 1; // L: 4303
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0; // L: 4305
									return 1; // L: 4306
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) { // L: 4308
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().getDisplayWith(); // L: 4309
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().getDisplayHeight(); // L: 4310
								return 1; // L: 4311
							} else if (var0 == 6623) { // L: 4313
								var14 = new Coord(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4314
								var11 = class21.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y); // L: 4315
								if (var11 == null) { // L: 4316
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4317
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.getId(); // L: 4320
								}

								return 1; // L: 4322
							} else if (var0 == 6624) { // L: 4324
								class21.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4325
								return 1; // L: 4326
							} else if (var0 == 6625) { // L: 4328
								class21.getWorldMap().resetMaxFlashCount(); // L: 4329
								return 1; // L: 4330
							} else if (var0 == 6626) { // L: 4332
								class21.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 4333
								return 1; // L: 4334
							} else if (var0 == 6627) { // L: 4336
								class21.getWorldMap().resetCyclesPerFlash(); // L: 4337
								return 1; // L: 4338
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) { // L: 4340
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4341
									class21.getWorldMap().setPerpetualFlash(var13); // L: 4342
									return 1; // L: 4343
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) { // L: 4345
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4346
									class21.getWorldMap().flashElement(var3); // L: 4347
									return 1; // L: 4348
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) { // L: 4350
									var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4351
									class21.getWorldMap().flashCategory(var3); // L: 4352
									return 1; // L: 4353
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) { // L: 4355
									class21.getWorldMap().stopCurrentFlashes(); // L: 4356
									return 1; // L: 4357
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) { // L: 4359
									var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 4360
									class21.getWorldMap().setElementsDisabled(var13); // L: 4361
									return 1; // L: 4362
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) { // L: 4364
										Interpreter.Interpreter_intStackSize -= 2; // L: 4365
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4366
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4367
										class21.getWorldMap().disableElement(var3, var7); // L: 4368
										return 1; // L: 4369
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) { // L: 4371
										Interpreter.Interpreter_intStackSize -= 2; // L: 4372
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4373
										var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 4374
										class21.getWorldMap().setCategoryDisabled(var3, var7); // L: 4375
										return 1; // L: 4376
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) { // L: 4378
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().getElementsDisabled() ? 1 : 0; // L: 4379
										return 1; // L: 4380
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) { // L: 4382
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4383
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().isElementDisabled(var3) ? 1 : 0; // L: 4384
										return 1; // L: 4385
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) { // L: 4387
										var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4388
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class21.getWorldMap().isCategoryDisabled(var3) ? 1 : 0; // L: 4389
										return 1; // L: 4390
									} else if (var0 == 6638) { // L: 4392
										Interpreter.Interpreter_intStackSize -= 2; // L: 4393
										var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 4394
										var10 = new Coord(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]); // L: 4395
										var5 = class21.getWorldMap().method7269(var3, var10); // L: 4396
										if (var5 == null) { // L: 4397
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4398
										} else {
											Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.packed(); // L: 4401
										}

										return 1; // L: 4403
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) { // L: 4405
											var6 = class21.getWorldMap().iconStart(); // L: 4406
											if (var6 == null) { // L: 4407
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4408
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4409
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4412
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4413
											}

											return 1; // L: 4415
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) { // L: 4417
											var6 = class21.getWorldMap().iconNext(); // L: 4418
											if (var6 == null) { // L: 4419
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4420
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4421
											} else {
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.getElement(); // L: 4424
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6.coord2.packed(); // L: 4425
											}

											return 1; // L: 4427
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) { // L: 4429
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4430
												var4 = UserComparator7.WorldMapElement_get(var3); // L: 4431
												if (var4.name == null) { // L: 4432
													Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = ""; // L: 4433
												} else {
													Interpreter.Interpreter_stringStack[++class122.Interpreter_stringStackSize - 1] = var4.name; // L: 4436
												}

												return 1; // L: 4438
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) { // L: 4440
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4441
												var4 = UserComparator7.WorldMapElement_get(var3); // L: 4442
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.textSize; // L: 4443
												return 1; // L: 4444
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) { // L: 4446
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4447
												var4 = UserComparator7.WorldMapElement_get(var3); // L: 4448
												if (var4 == null) { // L: 4449
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4450
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.category; // L: 4453
												}

												return 1; // L: 4455
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) { // L: 4457
												var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4458
												var4 = UserComparator7.WorldMapElement_get(var3); // L: 4459
												if (var4 == null) { // L: 4460
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 4461
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.sprite1; // L: 4464
												}

												return 1; // L: 4466
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) { // L: 4468
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.worldMapEvent.mapElement; // L: 4469
												return 1; // L: 4470
											} else if (var0 == 6698) { // L: 4472
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.worldMapEvent.coord1.packed(); // L: 4473
												return 1; // L: 4474
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) { // L: 4476
												Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SpotAnimationDefinition.worldMapEvent.coord2.packed(); // L: 4477
												return 1; // L: 4478
											} else {
												return 2; // L: 4480
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
