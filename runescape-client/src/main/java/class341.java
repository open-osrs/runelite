import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class341 implements Iterator {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	class342 field4102;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1686021093
	)
	int field4099;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2018103079
	)
	int field4100;

	@ObfuscatedSignature(
		descriptor = "(Lmn;)V"
	)
	class341(class342 var1) {
		this.field4099 = 0; // L: 165
		this.field4100 = this.field4102.field4108; // L: 166
		this.field4102 = var1; // L: 169
	} // L: 170

	public boolean hasNext() {
		return this.field4099 < this.field4102.field4106; // L: 173
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 187
	}

	public Object next() {
		if (this.field4102.field4108 != this.field4100) { // L: 177
			throw new ConcurrentModificationException();
		} else if (this.field4099 < this.field4102.field4106) { // L: 178
			Object var1 = this.field4102.field4104[this.field4099].field4096; // L: 179
			++this.field4099; // L: 180
			return var1; // L: 181
		} else {
			throw new NoSuchElementException(); // L: 183
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "968220447"
	)
	static int method6280(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Lcz;IILgm;I)V",
		garbageValue = "214021877"
	)
	static final void method6279(Player var0, int var1, int var2, class193 var3) {
		int var4 = var0.pathX[0]; // L: 8351
		int var5 = var0.pathY[0]; // L: 8352
		int var6 = var0.transformedSize(); // L: 8353
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8354
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8355
				int var8 = var0.transformedSize(); // L: 8357
				RouteStrategy var9 = UserComparator10.method2623(var1, var2); // L: 8358
				CollisionMap var10 = Client.collisionMaps[var0.plane]; // L: 8359
				int[] var11 = Client.field784; // L: 8360
				int[] var12 = Client.field785; // L: 8361

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) { // L: 8363
					for (var14 = 0; var14 < 128; ++var14) { // L: 8364
						class194.directions[var13][var14] = 0; // L: 8365
						class194.distances[var13][var14] = 99999999; // L: 8366
					}
				}

				int var15;
				int var16;
				byte var18;
				int var19;
				int var20;
				int var22;
				int var24;
				int var25;
				int var26;
				int var27;
				boolean var33;
				int var35;
				int var36;
				int var38;
				if (var8 == 1) { // L: 8370
					var33 = class29.method404(var4, var5, var9, var10);
				} else if (var8 == 2) { // L: 8371
					var33 = Calendar.method5507(var4, var5, var9, var10);
				} else {
					var15 = var4; // L: 8375
					var16 = var5; // L: 8376
					byte var17 = 64; // L: 8377
					var18 = 64; // L: 8378
					var19 = var4 - var17; // L: 8379
					var20 = var5 - var18; // L: 8380
					class194.directions[var17][var18] = 99; // L: 8381
					class194.distances[var17][var18] = 0; // L: 8382
					byte var21 = 0; // L: 8383
					var22 = 0; // L: 8384
					class194.bufferX[var21] = var4; // L: 8385
					var38 = var21 + 1;
					class194.bufferY[var21] = var5; // L: 8386
					int[][] var23 = var10.flags; // L: 8387

					boolean var34;
					label496:
					while (true) {
						label494:
						while (true) {
							do {
								do {
									do {
										label471:
										do {
											if (var38 == var22) { // L: 8388
												HealthBarUpdate.field1189 = var15; // L: 8508
												StructComposition.field1988 = var16; // L: 8509
												var34 = false; // L: 8510
												break label496;
											}

											var15 = class194.bufferX[var22]; // L: 8389
											var16 = class194.bufferY[var22]; // L: 8390
											var22 = var22 + 1 & 4095; // L: 8391
											var35 = var15 - var19; // L: 8392
											var36 = var16 - var20; // L: 8393
											var24 = var15 - var10.xInset; // L: 8394
											var25 = var16 - var10.yInset; // L: 8395
											if (var9.hasArrived(var8, var15, var16, var10)) { // L: 8396
												HealthBarUpdate.field1189 = var15; // L: 8397
												StructComposition.field1988 = var16; // L: 8398
												var34 = true; // L: 8399
												break label496;
											}

											var26 = class194.distances[var35][var36] + 1; // L: 8402
											if (var35 > 0 && class194.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var8 + var25 - 1] & 19136824) == 0) { // L: 8403 8404 8405 8406
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class194.bufferX[var38] = var15 - 1; // L: 8410
														class194.bufferY[var38] = var16; // L: 8411
														var38 = var38 + 1 & 4095; // L: 8412
														class194.directions[var35 - 1][var36] = 2; // L: 8413
														class194.distances[var35 - 1][var36] = var26; // L: 8414
														break;
													}

													if ((var23[var24 - 1][var27 + var25] & 19136830) != 0) { // L: 8408
														break;
													}

													++var27; // L: 8407
												}
											}

											if (var35 < 128 - var8 && class194.directions[var35 + 1][var36] == 0 && (var23[var24 + var8][var25] & 19136899) == 0 && (var23[var24 + var8][var8 + var25 - 1] & 19136992) == 0) { // L: 8416 8417 8418 8419
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class194.bufferX[var38] = var15 + 1; // L: 8423
														class194.bufferY[var38] = var16; // L: 8424
														var38 = var38 + 1 & 4095; // L: 8425
														class194.directions[var35 + 1][var36] = 8; // L: 8426
														class194.distances[var35 + 1][var36] = var26; // L: 8427
														break;
													}

													if ((var23[var24 + var8][var27 + var25] & 19136995) != 0) { // L: 8421
														break;
													}

													++var27; // L: 8420
												}
											}

											if (var36 > 0 && class194.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + var8 - 1][var25 - 1] & 19136899) == 0) { // L: 8429 8430 8431 8432
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class194.bufferX[var38] = var15; // L: 8436
														class194.bufferY[var38] = var16 - 1; // L: 8437
														var38 = var38 + 1 & 4095; // L: 8438
														class194.directions[var35][var36 - 1] = 1; // L: 8439
														class194.distances[var35][var36 - 1] = var26; // L: 8440
														break;
													}

													if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 8434
														break;
													}

													++var27; // L: 8433
												}
											}

											if (var36 < 128 - var8 && class194.directions[var35][var36 + 1] == 0 && (var23[var24][var8 + var25] & 19136824) == 0 && (var23[var8 + var24 - 1][var25 + var8] & 19136992) == 0) { // L: 8442 8443 8444 8445
												var27 = 1;

												while (true) {
													if (var27 >= var8 - 1) {
														class194.bufferX[var38] = var15; // L: 8449
														class194.bufferY[var38] = var16 + 1; // L: 8450
														var38 = var38 + 1 & 4095; // L: 8451
														class194.directions[var35][var36 + 1] = 4; // L: 8452
														class194.distances[var35][var36 + 1] = var26; // L: 8453
														break;
													}

													if ((var23[var27 + var24][var8 + var25] & 19137016) != 0) { // L: 8447
														break;
													}

													++var27; // L: 8446
												}
											}

											if (var35 > 0 && var36 > 0 && class194.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) { // L: 8455 8456 8457
												var27 = 1;

												while (true) {
													if (var27 >= var8) {
														class194.bufferX[var38] = var15 - 1; // L: 8462
														class194.bufferY[var38] = var16 - 1; // L: 8463
														var38 = var38 + 1 & 4095; // L: 8464
														class194.directions[var35 - 1][var36 - 1] = 3; // L: 8465
														class194.distances[var35 - 1][var36 - 1] = var26; // L: 8466
														break;
													}

													if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) { // L: 8459 8460
														break;
													}

													++var27; // L: 8458
												}
											}

											if (var35 < 128 - var8 && var36 > 0 && class194.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + var8][var25 - 1] & 19136899) == 0) { // L: 8468 8469 8470
												var27 = 1;

												while (true) {
													if (var27 >= var8) {
														class194.bufferX[var38] = var15 + 1; // L: 8475
														class194.bufferY[var38] = var16 - 1; // L: 8476
														var38 = var38 + 1 & 4095; // L: 8477
														class194.directions[var35 + 1][var36 - 1] = 9; // L: 8478
														class194.distances[var35 + 1][var36 - 1] = var26; // L: 8479
														break;
													}

													if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var24 + var27][var25 - 1] & 19136911) != 0) { // L: 8472 8473
														break;
													}

													++var27; // L: 8471
												}
											}

											if (var35 > 0 && var36 < 128 - var8 && class194.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var8 + var25] & 19136824) == 0) { // L: 8481 8482 8483
												for (var27 = 1; var27 < var8; ++var27) { // L: 8484
													if ((var23[var24 - 1][var27 + var25] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 + var8] & 19137016) != 0) { // L: 8485 8486
														continue label471;
													}
												}

												class194.bufferX[var38] = var15 - 1; // L: 8488
												class194.bufferY[var38] = var16 + 1; // L: 8489
												var38 = var38 + 1 & 4095; // L: 8490
												class194.directions[var35 - 1][var36 + 1] = 6; // L: 8491
												class194.distances[var35 - 1][var36 + 1] = var26; // L: 8492
											}
										} while(var35 >= 128 - var8); // L: 8494
									} while(var36 >= 128 - var8);
								} while(class194.directions[var35 + 1][var36 + 1] != 0); // L: 8495
							} while((var23[var8 + var24][var25 + var8] & 19136992) != 0); // L: 8496

							for (var27 = 1; var27 < var8; ++var27) { // L: 8497
								if ((var23[var24 + var27][var25 + var8] & 19137016) != 0 || (var23[var8 + var24][var25 + var27] & 19136995) != 0) { // L: 8498 8499
									continue label494;
								}
							}

							class194.bufferX[var38] = var15 + 1; // L: 8501
							class194.bufferY[var38] = var16 + 1; // L: 8502
							var38 = var38 + 1 & 4095; // L: 8503
							class194.directions[var35 + 1][var36 + 1] = 12; // L: 8504
							class194.distances[var35 + 1][var36 + 1] = var26; // L: 8505
						}
					}

					var33 = var34; // L: 8512
				}

				int var7;
				label542: {
					var14 = var4 - 64; // L: 8514
					var15 = var5 - 64; // L: 8515
					var16 = HealthBarUpdate.field1189; // L: 8516
					var35 = StructComposition.field1988; // L: 8517
					if (!var33) { // L: 8518
						var36 = Integer.MAX_VALUE; // L: 8520
						var19 = Integer.MAX_VALUE; // L: 8521
						byte var37 = 10; // L: 8522
						var38 = var9.approxDestinationX; // L: 8523
						var22 = var9.approxDestinationY; // L: 8524
						int var32 = var9.approxDestinationSizeX; // L: 8525
						var24 = var9.approxDestinationSizeY; // L: 8526

						for (var25 = var38 - var37; var25 <= var38 + var37; ++var25) { // L: 8527
							for (var26 = var22 - var37; var26 <= var22 + var37; ++var26) { // L: 8528
								var27 = var25 - var14; // L: 8529
								int var28 = var26 - var15; // L: 8530
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class194.distances[var27][var28] < 100) { // L: 8531 8532
									int var29 = 0; // L: 8533
									if (var25 < var38) { // L: 8534
										var29 = var38 - var25;
									} else if (var25 > var32 + var38 - 1) { // L: 8535
										var29 = var25 - (var38 + var32 - 1);
									}

									int var30 = 0; // L: 8536
									if (var26 < var22) { // L: 8537
										var30 = var22 - var26;
									} else if (var26 > var24 + var22 - 1) { // L: 8538
										var30 = var26 - (var24 + var22 - 1);
									}

									int var31 = var29 * var29 + var30 * var30; // L: 8539
									if (var31 < var36 || var31 == var36 && class194.distances[var27][var28] < var19) { // L: 8540
										var36 = var31; // L: 8541
										var19 = class194.distances[var27][var28]; // L: 8542
										var16 = var25; // L: 8543
										var35 = var26; // L: 8544
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) { // L: 8550
							var7 = -1; // L: 8551
							break label542;
						}
					}

					if (var16 == var4 && var5 == var35) { // L: 8560
						var11[0] = var16; // L: 8561
						var12[0] = var35; // L: 8562
						var7 = 0; // L: 8563
					} else {
						var18 = 0; // L: 8566
						class194.bufferX[var18] = var16; // L: 8569
						var36 = var18 + 1;
						class194.bufferY[var18] = var35; // L: 8570

						for (var19 = var20 = class194.directions[var16 - var14][var35 - var15]; var4 != var16 || var5 != var35; var19 = class194.directions[var16 - var14][var35 - var15]) { // L: 8571 8572 8582
							if (var19 != var20) { // L: 8573
								var20 = var19; // L: 8574
								class194.bufferX[var36] = var16; // L: 8575
								class194.bufferY[var36++] = var35; // L: 8576
							}

							if ((var19 & 2) != 0) { // L: 8578
								++var16;
							} else if ((var19 & 8) != 0) { // L: 8579
								--var16;
							}

							if ((var19 & 1) != 0) { // L: 8580
								++var35;
							} else if ((var19 & 4) != 0) { // L: 8581
								--var35;
							}
						}

						var38 = 0; // L: 8584

						while (var36-- > 0) { // L: 8585
							var11[var38] = class194.bufferX[var36]; // L: 8586
							var12[var38++] = class194.bufferY[var36]; // L: 8587
							if (var38 >= var11.length) { // L: 8588
								break;
							}
						}

						var7 = var38; // L: 8590
					}
				}

				var13 = var7; // L: 8592
				if (var7 >= 1) { // L: 8593
					for (var14 = 0; var14 < var13 - 1; ++var14) { // L: 8594
						var0.method2127(Client.field784[var14], Client.field785[var14], var3);
					}

				}
			}
		}
	} // L: 8595
}
