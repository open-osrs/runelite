import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	static IndexedSprite field1354;
	@ObfuscatedName("o")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("q")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("l")
	@Export("requests")
	Queue requests;

	UrlRequester() {
		this.requests = new LinkedList(); // L: 16
		this.thread = new Thread(this); // L: 19
		this.thread.setPriority(1); // L: 20
		this.thread.start(); // L: 21
	} // L: 22

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lcb;I)V",
		garbageValue = "717056983"
	)
	abstract void vmethod2544(UrlRequest var1) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "-70"
	)
	void method2517(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 50
		var1.setReadTimeout(5000); // L: 51
		var1.setUseCaches(false); // L: 52
		var1.setRequestProperty("Connection", "close"); // L: 53
	} // L: 54

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lcb;B)V",
		garbageValue = "97"
	)
	void method2518(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 57

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0]; // L: 67
				byte[] var6 = class116.ByteArrayPool_getArray(5000); // L: 68

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 69 70 74
					var8 = new byte[var4.length + var7]; // L: 71
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 72
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 73
				}

				class168.ByteArrayPool_release(var6); // L: 76
			}

			var2.response0 = var4; // L: 78
		} catch (IOException var10) { // L: 80
		}

		if (var3 != null) { // L: 81
			try {
				var3.close(); // L: 83
			} catch (IOException var9) { // L: 85
			}
		}

	} // L: 87

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lcb;",
		garbageValue = "-1608503592"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 90
		synchronized(this) { // L: 91
			this.requests.add(var2); // L: 92
			this.notify(); // L: 93
			return var2; // L: 95
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "382803574"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 99

		try {
			synchronized(this) { // L: 101
				this.notify(); // L: 102
			} // L: 103

			this.thread.join(); // L: 104
		} catch (InterruptedException var4) { // L: 106
		}

	} // L: 107

	public void run() {
		while (!this.isClosed) { // L: 26
			try {
				UrlRequest var1;
				synchronized(this) { // L: 29
					var1 = (UrlRequest)this.requests.poll(); // L: 30
					if (var1 == null) { // L: 31
						try {
							this.wait(); // L: 33
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.vmethod2544(var1); // L: 39
			} catch (Exception var7) { // L: 41
				ArchiveDiskActionHandler.RunException_sendStackTrace((String)null, var7); // L: 42
			}
		}

	} // L: 45

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BB)[B",
		garbageValue = "21"
	)
	static byte[] method2537(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "44420485"
	)
	public static void method2538(int var0) {
		class273.musicPlayerStatus = 1; // L: 58
		ClanChannelMember.musicTrackArchive = null; // L: 59
		StructComposition.musicTrackGroupId = -1; // L: 60
		FriendsList.musicTrackFileId = -1; // L: 61
		Clock.musicTrackVolume = 0; // L: 62
		VertexNormal.musicTrackBoolean = false; // L: 63
		GrandExchangeEvent.pcmSampleLength = var0; // L: 64
	} // L: 65

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-127"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3894
			class12.clientPreferences.method2219(!class12.clientPreferences.method2222()); // L: 3895
			if (class12.clientPreferences.method2222()) { // L: 3896
				WorldMapEvent.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3897
			} else {
				WorldMapEvent.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3900
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3903
			class12.clientPreferences.method2228();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3904
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3905
		}

		if (Client.staffModLevel >= 2) { // L: 3906
			if (var0.equalsIgnoreCase("errortest")) { // L: 3907
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3908
				ServerPacket.worldMap.showCoord = !ServerPacket.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3909
				class12.clientPreferences.method2227(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3910
				class12.clientPreferences.method2227(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3911
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3912
				class129.method2812();
			}
		}

		PacketBufferNode var1 = WallDecoration.getPacketBufferNode(ClientPacket.field2988, Client.packetWriter.isaacCipher); // L: 3915
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3916
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3917
		Client.packetWriter.addNode(var1); // L: 3918
	} // L: 3919

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Lci;B)V",
		garbageValue = "-115"
	)
	static final void method2536(PendingSpawn var0) {
		long var1 = 0L; // L: 7853
		int var3 = -1; // L: 7854
		int var4 = 0; // L: 7855
		int var5 = 0; // L: 7856
		if (var0.type == 0) { // L: 7857
			var1 = class175.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7858
			var1 = class175.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7859
			var1 = class175.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class175.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y); // L: 7860
		}

		if (0L != var1) { // L: 7861
			int var6 = class175.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7862
			var3 = NetSocket.Entity_unpackID(var1); // L: 7863
			var4 = var6 & 31; // L: 7864
			var5 = var6 >> 6 & 3; // L: 7865
		}

		var0.objectId = var3; // L: 7867
		var0.field1129 = var4; // L: 7868
		var0.field1131 = var5; // L: 7869
	} // L: 7870

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Lca;IILgd;I)V",
		garbageValue = "-1504276994"
	)
	static final void method2540(Player var0, int var1, int var2, class193 var3) {
		int var4 = var0.pathX[0]; // L: 8321
		int var5 = var0.pathY[0]; // L: 8322
		int var6 = var0.transformedSize(); // L: 8323
		if (var4 >= var6 && var4 < 104 - var6 && var5 >= var6 && var5 < 104 - var6) { // L: 8324
			if (var1 >= var6 && var1 < 104 - var6 && var2 >= var6 && var2 < 104 - var6) { // L: 8325
				int var8 = var0.transformedSize(); // L: 8327
				RouteStrategy var9 = class65.method1879(var1, var2); // L: 8328
				CollisionMap var10 = Client.collisionMaps[var0.plane]; // L: 8329
				int[] var11 = Client.field772; // L: 8330
				int[] var12 = Client.field773; // L: 8331

				int var13;
				int var14;
				for (var13 = 0; var13 < 128; ++var13) { // L: 8333
					for (var14 = 0; var14 < 128; ++var14) { // L: 8334
						class194.directions[var13][var14] = 0; // L: 8335
						class194.distances[var13][var14] = 99999999; // L: 8336
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
				if (var8 == 1) { // L: 8340
					var33 = AbstractWorldMapIcon.method4863(var4, var5, var9, var10);
				} else {
					byte var17;
					byte var21;
					int[][] var23;
					boolean var34;
					if (var8 == 2) { // L: 8341
						var15 = var4; // L: 8344
						var16 = var5; // L: 8345
						var17 = 64; // L: 8346
						var18 = 64; // L: 8347
						var19 = var4 - var17; // L: 8348
						var20 = var5 - var18; // L: 8349
						class194.directions[var17][var18] = 99; // L: 8350
						class194.distances[var17][var18] = 0; // L: 8351
						var21 = 0; // L: 8352
						var22 = 0; // L: 8353
						class194.bufferX[var21] = var4; // L: 8354
						var38 = var21 + 1;
						class194.bufferY[var21] = var5; // L: 8355
						var23 = var10.flags; // L: 8356

						while (true) {
							if (var38 == var22) { // L: 8357
								Varps.field3348 = var15; // L: 8457
								class194.field2255 = var16; // L: 8458
								var34 = false; // L: 8459
								break;
							}

							var15 = class194.bufferX[var22]; // L: 8358
							var16 = class194.bufferY[var22]; // L: 8359
							var22 = var22 + 1 & 4095; // L: 8360
							var35 = var15 - var19; // L: 8361
							var36 = var16 - var20; // L: 8362
							var24 = var15 - var10.xInset; // L: 8363
							var25 = var16 - var10.yInset; // L: 8364
							if (var9.hasArrived(2, var15, var16, var10)) { // L: 8365
								Varps.field3348 = var15; // L: 8366
								class194.field2255 = var16; // L: 8367
								var34 = true; // L: 8368
								break;
							}

							var26 = class194.distances[var35][var36] + 1; // L: 8371
							if (var35 > 0 && class194.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + 1] & 19136824) == 0) { // L: 8372 8373 8374 8375
								class194.bufferX[var38] = var15 - 1; // L: 8376
								class194.bufferY[var38] = var16; // L: 8377
								var38 = var38 + 1 & 4095; // L: 8378
								class194.directions[var35 - 1][var36] = 2; // L: 8379
								class194.distances[var35 - 1][var36] = var26; // L: 8380
							}

							if (var35 < 126 && class194.directions[var35 + 1][var36] == 0 && (var23[var24 + 2][var25] & 19136899) == 0 && (var23[var24 + 2][var25 + 1] & 19136992) == 0) { // L: 8382 8383 8384 8385
								class194.bufferX[var38] = var15 + 1; // L: 8386
								class194.bufferY[var38] = var16; // L: 8387
								var38 = var38 + 1 & 4095; // L: 8388
								class194.directions[var35 + 1][var36] = 8; // L: 8389
								class194.distances[var35 + 1][var36] = var26; // L: 8390
							}

							if (var36 > 0 && class194.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + 1][var25 - 1] & 19136899) == 0) { // L: 8392 8393 8394 8395
								class194.bufferX[var38] = var15; // L: 8396
								class194.bufferY[var38] = var16 - 1; // L: 8397
								var38 = var38 + 1 & 4095; // L: 8398
								class194.directions[var35][var36 - 1] = 1; // L: 8399
								class194.distances[var35][var36 - 1] = var26; // L: 8400
							}

							if (var36 < 126 && class194.directions[var35][var36 + 1] == 0 && (var23[var24][var25 + 2] & 19136824) == 0 && (var23[var24 + 1][var25 + 2] & 19136992) == 0) { // L: 8402 8403 8404 8405
								class194.bufferX[var38] = var15; // L: 8406
								class194.bufferY[var38] = var16 + 1; // L: 8407
								var38 = var38 + 1 & 4095; // L: 8408
								class194.directions[var35][var36 + 1] = 4; // L: 8409
								class194.distances[var35][var36 + 1] = var26; // L: 8410
							}

							if (var35 > 0 && var36 > 0 && class194.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25] & 19136830) == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0 && (var23[var24][var25 - 1] & 19136911) == 0) { // L: 8412 8413 8414 8415 8416
								class194.bufferX[var38] = var15 - 1; // L: 8417
								class194.bufferY[var38] = var16 - 1; // L: 8418
								var38 = var38 + 1 & 4095; // L: 8419
								class194.directions[var35 - 1][var36 - 1] = 3; // L: 8420
								class194.distances[var35 - 1][var36 - 1] = var26; // L: 8421
							}

							if (var35 < 126 && var36 > 0 && class194.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + 1][var25 - 1] & 19136911) == 0 && (var23[var24 + 2][var25 - 1] & 19136899) == 0 && (var23[var24 + 2][var25] & 19136995) == 0) { // L: 8423 8424 8425 8426 8427
								class194.bufferX[var38] = var15 + 1; // L: 8428
								class194.bufferY[var38] = var16 - 1; // L: 8429
								var38 = var38 + 1 & 4095; // L: 8430
								class194.directions[var35 + 1][var36 - 1] = 9; // L: 8431
								class194.distances[var35 + 1][var36 - 1] = var26; // L: 8432
							}

							if (var35 > 0 && var36 < 126 && class194.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + 1] & 19136830) == 0 && (var23[var24 - 1][var25 + 2] & 19136824) == 0 && (var23[var24][var25 + 2] & 19137016) == 0) { // L: 8434 8435 8436 8437 8438
								class194.bufferX[var38] = var15 - 1; // L: 8439
								class194.bufferY[var38] = var16 + 1; // L: 8440
								var38 = var38 + 1 & 4095; // L: 8441
								class194.directions[var35 - 1][var36 + 1] = 6; // L: 8442
								class194.distances[var35 - 1][var36 + 1] = var26; // L: 8443
							}

							if (var35 < 126 && var36 < 126 && class194.directions[var35 + 1][var36 + 1] == 0 && (var23[var24 + 1][var25 + 2] & 19137016) == 0 && (var23[var24 + 2][var25 + 2] & 19136992) == 0 && (var23[var24 + 2][var25 + 1] & 19136995) == 0) { // L: 8445 8446 8447 8448 8449
								class194.bufferX[var38] = var15 + 1; // L: 8450
								class194.bufferY[var38] = var16 + 1; // L: 8451
								var38 = var38 + 1 & 4095; // L: 8452
								class194.directions[var35 + 1][var36 + 1] = 12; // L: 8453
								class194.distances[var35 + 1][var36 + 1] = var26; // L: 8454
							}
						}

						var33 = var34; // L: 8461
					} else {
						var15 = var4; // L: 8466
						var16 = var5; // L: 8467
						var17 = 64; // L: 8468
						var18 = 64; // L: 8469
						var19 = var4 - var17; // L: 8470
						var20 = var5 - var18; // L: 8471
						class194.directions[var17][var18] = 99; // L: 8472
						class194.distances[var17][var18] = 0; // L: 8473
						var21 = 0; // L: 8474
						var22 = 0; // L: 8475
						class194.bufferX[var21] = var4; // L: 8476
						var38 = var21 + 1;
						class194.bufferY[var21] = var5; // L: 8477
						var23 = var10.flags; // L: 8478

						label670:
						while (true) {
							label668:
							while (true) {
								do {
									do {
										do {
											label645:
											do {
												if (var38 == var22) { // L: 8479
													Varps.field3348 = var15; // L: 8599
													class194.field2255 = var16; // L: 8600
													var34 = false; // L: 8601
													break label670;
												}

												var15 = class194.bufferX[var22]; // L: 8480
												var16 = class194.bufferY[var22]; // L: 8481
												var22 = var22 + 1 & 4095; // L: 8482
												var35 = var15 - var19; // L: 8483
												var36 = var16 - var20; // L: 8484
												var24 = var15 - var10.xInset; // L: 8485
												var25 = var16 - var10.yInset; // L: 8486
												if (var9.hasArrived(var8, var15, var16, var10)) { // L: 8487
													Varps.field3348 = var15; // L: 8488
													class194.field2255 = var16; // L: 8489
													var34 = true; // L: 8490
													break label670;
												}

												var26 = class194.distances[var35][var36] + 1; // L: 8493
												if (var35 > 0 && class194.directions[var35 - 1][var36] == 0 && (var23[var24 - 1][var25] & 19136782) == 0 && (var23[var24 - 1][var25 + var8 - 1] & 19136824) == 0) { // L: 8494 8495 8496 8497
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15 - 1; // L: 8501
															class194.bufferY[var38] = var16; // L: 8502
															var38 = var38 + 1 & 4095; // L: 8503
															class194.directions[var35 - 1][var36] = 2; // L: 8504
															class194.distances[var35 - 1][var36] = var26; // L: 8505
															break;
														}

														if ((var23[var24 - 1][var27 + var25] & 19136830) != 0) { // L: 8499
															break;
														}

														++var27; // L: 8498
													}
												}

												if (var35 < 128 - var8 && class194.directions[var35 + 1][var36] == 0 && (var23[var24 + var8][var25] & 19136899) == 0 && (var23[var8 + var24][var8 + var25 - 1] & 19136992) == 0) { // L: 8507 8508 8509 8510
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15 + 1; // L: 8514
															class194.bufferY[var38] = var16; // L: 8515
															var38 = var38 + 1 & 4095; // L: 8516
															class194.directions[var35 + 1][var36] = 8; // L: 8517
															class194.distances[var35 + 1][var36] = var26; // L: 8518
															break;
														}

														if ((var23[var24 + var8][var25 + var27] & 19136995) != 0) { // L: 8512
															break;
														}

														++var27; // L: 8511
													}
												}

												if (var36 > 0 && class194.directions[var35][var36 - 1] == 0 && (var23[var24][var25 - 1] & 19136782) == 0 && (var23[var24 + var8 - 1][var25 - 1] & 19136899) == 0) { // L: 8520 8521 8522 8523
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15; // L: 8527
															class194.bufferY[var38] = var16 - 1; // L: 8528
															var38 = var38 + 1 & 4095; // L: 8529
															class194.directions[var35][var36 - 1] = 1; // L: 8530
															class194.distances[var35][var36 - 1] = var26; // L: 8531
															break;
														}

														if ((var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 8525
															break;
														}

														++var27; // L: 8524
													}
												}

												if (var36 < 128 - var8 && class194.directions[var35][var36 + 1] == 0 && (var23[var24][var8 + var25] & 19136824) == 0 && (var23[var24 + var8 - 1][var25 + var8] & 19136992) == 0) { // L: 8533 8534 8535 8536
													var27 = 1;

													while (true) {
														if (var27 >= var8 - 1) {
															class194.bufferX[var38] = var15; // L: 8540
															class194.bufferY[var38] = var16 + 1; // L: 8541
															var38 = var38 + 1 & 4095; // L: 8542
															class194.directions[var35][var36 + 1] = 4; // L: 8543
															class194.distances[var35][var36 + 1] = var26; // L: 8544
															break;
														}

														if ((var23[var27 + var24][var8 + var25] & 19137016) != 0) { // L: 8538
															break;
														}

														++var27; // L: 8537
													}
												}

												if (var35 > 0 && var36 > 0 && class194.directions[var35 - 1][var36 - 1] == 0 && (var23[var24 - 1][var25 - 1] & 19136782) == 0) { // L: 8546 8547 8548
													var27 = 1;

													while (true) {
														if (var27 >= var8) {
															class194.bufferX[var38] = var15 - 1; // L: 8553
															class194.bufferY[var38] = var16 - 1; // L: 8554
															var38 = var38 + 1 & 4095; // L: 8555
															class194.directions[var35 - 1][var36 - 1] = 3; // L: 8556
															class194.distances[var35 - 1][var36 - 1] = var26; // L: 8557
															break;
														}

														if ((var23[var24 - 1][var27 + (var25 - 1)] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var25 - 1] & 19136911) != 0) { // L: 8550 8551
															break;
														}

														++var27; // L: 8549
													}
												}

												if (var35 < 128 - var8 && var36 > 0 && class194.directions[var35 + 1][var36 - 1] == 0 && (var23[var24 + var8][var25 - 1] & 19136899) == 0) { // L: 8559 8560 8561
													var27 = 1;

													while (true) {
														if (var27 >= var8) {
															class194.bufferX[var38] = var15 + 1; // L: 8566
															class194.bufferY[var38] = var16 - 1; // L: 8567
															var38 = var38 + 1 & 4095; // L: 8568
															class194.directions[var35 + 1][var36 - 1] = 9; // L: 8569
															class194.distances[var35 + 1][var36 - 1] = var26; // L: 8570
															break;
														}

														if ((var23[var8 + var24][var27 + (var25 - 1)] & 19136995) != 0 || (var23[var27 + var24][var25 - 1] & 19136911) != 0) { // L: 8563 8564
															break;
														}

														++var27; // L: 8562
													}
												}

												if (var35 > 0 && var36 < 128 - var8 && class194.directions[var35 - 1][var36 + 1] == 0 && (var23[var24 - 1][var25 + var8] & 19136824) == 0) { // L: 8572 8573 8574
													for (var27 = 1; var27 < var8; ++var27) { // L: 8575
														if ((var23[var24 - 1][var25 + var27] & 19136830) != 0 || (var23[var27 + (var24 - 1)][var8 + var25] & 19137016) != 0) { // L: 8576 8577
															continue label645;
														}
													}

													class194.bufferX[var38] = var15 - 1; // L: 8579
													class194.bufferY[var38] = var16 + 1; // L: 8580
													var38 = var38 + 1 & 4095; // L: 8581
													class194.directions[var35 - 1][var36 + 1] = 6; // L: 8582
													class194.distances[var35 - 1][var36 + 1] = var26; // L: 8583
												}
											} while(var35 >= 128 - var8); // L: 8585
										} while(var36 >= 128 - var8);
									} while(class194.directions[var35 + 1][var36 + 1] != 0); // L: 8586
								} while((var23[var24 + var8][var25 + var8] & 19136992) != 0); // L: 8587

								for (var27 = 1; var27 < var8; ++var27) { // L: 8588
									if ((var23[var27 + var24][var8 + var25] & 19137016) != 0 || (var23[var24 + var8][var25 + var27] & 19136995) != 0) { // L: 8589 8590
										continue label668;
									}
								}

								class194.bufferX[var38] = var15 + 1; // L: 8592
								class194.bufferY[var38] = var16 + 1; // L: 8593
								var38 = var38 + 1 & 4095; // L: 8594
								class194.directions[var35 + 1][var36 + 1] = 12; // L: 8595
								class194.distances[var35 + 1][var36 + 1] = var26; // L: 8596
							}
						}

						var33 = var34; // L: 8603
					}
				}

				int var7;
				label718: {
					var14 = var4 - 64; // L: 8605
					var15 = var5 - 64; // L: 8606
					var16 = Varps.field3348; // L: 8607
					var35 = class194.field2255; // L: 8608
					if (!var33) { // L: 8609
						var36 = Integer.MAX_VALUE; // L: 8611
						var19 = Integer.MAX_VALUE; // L: 8612
						byte var37 = 10; // L: 8613
						var38 = var9.approxDestinationX; // L: 8614
						var22 = var9.approxDestinationY; // L: 8615
						int var32 = var9.approxDestinationSizeX; // L: 8616
						var24 = var9.approxDestinationSizeY; // L: 8617

						for (var25 = var38 - var37; var25 <= var38 + var37; ++var25) { // L: 8618
							for (var26 = var22 - var37; var26 <= var22 + var37; ++var26) { // L: 8619
								var27 = var25 - var14; // L: 8620
								int var28 = var26 - var15; // L: 8621
								if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class194.distances[var27][var28] < 100) { // L: 8622 8623
									int var29 = 0; // L: 8624
									if (var25 < var38) { // L: 8625
										var29 = var38 - var25;
									} else if (var25 > var38 + var32 - 1) { // L: 8626
										var29 = var25 - (var32 + var38 - 1);
									}

									int var30 = 0; // L: 8627
									if (var26 < var22) { // L: 8628
										var30 = var22 - var26;
									} else if (var26 > var22 + var24 - 1) { // L: 8629
										var30 = var26 - (var22 + var24 - 1);
									}

									int var31 = var29 * var29 + var30 * var30; // L: 8630
									if (var31 < var36 || var36 == var31 && class194.distances[var27][var28] < var19) { // L: 8631
										var36 = var31; // L: 8632
										var19 = class194.distances[var27][var28]; // L: 8633
										var16 = var25; // L: 8634
										var35 = var26; // L: 8635
									}
								}
							}
						}

						if (var36 == Integer.MAX_VALUE) { // L: 8641
							var7 = -1; // L: 8642
							break label718;
						}
					}

					if (var4 == var16 && var35 == var5) { // L: 8651
						var11[0] = var16; // L: 8652
						var12[0] = var35; // L: 8653
						var7 = 0; // L: 8654
					} else {
						var18 = 0; // L: 8657
						class194.bufferX[var18] = var16; // L: 8660
						var36 = var18 + 1;
						class194.bufferY[var18] = var35; // L: 8661

						for (var19 = var20 = class194.directions[var16 - var14][var35 - var15]; var4 != var16 || var5 != var35; var19 = class194.directions[var16 - var14][var35 - var15]) { // L: 8662 8663 8673
							if (var19 != var20) { // L: 8664
								var20 = var19; // L: 8665
								class194.bufferX[var36] = var16; // L: 8666
								class194.bufferY[var36++] = var35; // L: 8667
							}

							if ((var19 & 2) != 0) { // L: 8669
								++var16;
							} else if ((var19 & 8) != 0) { // L: 8670
								--var16;
							}

							if ((var19 & 1) != 0) { // L: 8671
								++var35;
							} else if ((var19 & 4) != 0) { // L: 8672
								--var35;
							}
						}

						var38 = 0; // L: 8675

						while (var36-- > 0) { // L: 8676
							var11[var38] = class194.bufferX[var36]; // L: 8677
							var12[var38++] = class194.bufferY[var36]; // L: 8678
							if (var38 >= var11.length) { // L: 8679
								break;
							}
						}

						var7 = var38; // L: 8681
					}
				}

				var13 = var7; // L: 8683
				if (var7 >= 1) { // L: 8684
					for (var14 = 0; var14 < var13 - 1; ++var14) { // L: 8685
						var0.method2119(Client.field772[var14], Client.field773[var14], var3);
					}

				}
			}
		}
	} // L: 8686

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "16711680"
	)
	static final boolean method2539(int var0) {
		if (var0 < 0) { // L: 8901
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8902
			if (var1 >= 2000) { // L: 8903
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8904
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Lki;B)I",
		garbageValue = "58"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12503
		return var1 != null ? var1.integer : var0.flags; // L: 12504 12505
	}
}
