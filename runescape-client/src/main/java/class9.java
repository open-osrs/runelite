import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class9 {
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("z")
	ExecutorService field52;
	@ObfuscatedName("k")
	Future field48;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	final Buffer field49;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lh;"
	)
	final class12 field50;

	@ObfuscatedSignature(
		descriptor = "(Lkf;Lh;)V"
	)
	public class9(Buffer var1, class12 var2) {
		this.field52 = Executors.newSingleThreadExecutor(); // L: 10
		this.field49 = var1; // L: 16
		this.field50 = var2; // L: 17
		this.method118(); // L: 18
	} // L: 19

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	public boolean method109() {
		return this.field48.isDone(); // L: 22
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1920645781"
	)
	public void method110() {
		this.field52.shutdown(); // L: 26
		this.field52 = null; // L: 27
	} // L: 28

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lkf;",
		garbageValue = "-1217218558"
	)
	public Buffer method122() {
		try {
			return (Buffer)this.field48.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	void method118() {
		this.field48 = this.field52.submit(new class8(this, this.field49, this.field50)); // L: 40
	} // L: 41

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "653540515"
	)
	static final int method111() {
		if (Tile.clientPreferences.roofsHidden) { // L: 4331
			return Huffman.Client_plane;
		} else {
			int var0 = 3; // L: 4332
			if (PacketBuffer.cameraPitch < 310) { // L: 4333
				label168: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) { // L: 4336
						var1 = GrandExchangeOfferWorldComparator.oculusOrbFocalPointX >> 7; // L: 4337
						var2 = MouseHandler.oculusOrbFocalPointY >> 7; // L: 4338
					} else {
						var1 = WorldMapLabelSize.localPlayer.x >> 7; // L: 4341
						var2 = WorldMapLabelSize.localPlayer.y >> 7; // L: 4342
					}

					int var3 = VertexNormal.cameraX >> 7; // L: 4344
					int var4 = AbstractWorldMapData.cameraZ >> 7; // L: 4345
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 4346
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 4347
							if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) { // L: 4348
								var0 = Huffman.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 4350
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 4351
							}

							int var6;
							if (var2 > var4) { // L: 4353
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 4354
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 4355
								var7 = var6 * 65536 / var5; // L: 4356
								var8 = 32768; // L: 4357

								while (true) {
									if (var3 == var1) { // L: 4358
										break label168;
									}

									if (var3 < var1) {
										++var3; // L: 4359
									} else if (var3 > var1) { // L: 4360
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) { // L: 4361
										var0 = Huffman.Client_plane;
									}

									var8 += var7; // L: 4362
									if (var8 >= 65536) { // L: 4363
										var8 -= 65536; // L: 4364
										if (var4 < var2) { // L: 4365
											++var4;
										} else if (var4 > var2) { // L: 4366
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) { // L: 4367
											var0 = Huffman.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 4371
									var7 = var5 * 65536 / var6; // L: 4372
									var8 = 32768; // L: 4373

									while (var4 != var2) { // L: 4374
										if (var4 < var2) { // L: 4375
											++var4;
										} else if (var4 > var2) { // L: 4376
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) { // L: 4377
											var0 = Huffman.Client_plane;
										}

										var8 += var7; // L: 4378
										if (var8 >= 65536) { // L: 4379
											var8 -= 65536; // L: 4380
											if (var3 < var1) { // L: 4381
												++var3;
											} else if (var3 > var1) { // L: 4382
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][var3][var4] & 4) != 0) { // L: 4383
												var0 = Huffman.Client_plane;
											}
										}
									}
								}
								break label168;
							}
						}

						return Huffman.Client_plane;
					}

					return Huffman.Client_plane;
				}
			}

			if (WorldMapLabelSize.localPlayer.x >= 0 && WorldMapLabelSize.localPlayer.y >= 0 && WorldMapLabelSize.localPlayer.x < 13312 && WorldMapLabelSize.localPlayer.y < 13312) { // L: 4388
				if ((Tiles.Tiles_renderFlags[Huffman.Client_plane][WorldMapLabelSize.localPlayer.x >> 7][WorldMapLabelSize.localPlayer.y >> 7] & 4) != 0) { // L: 4389
					var0 = Huffman.Client_plane;
				}

				return var0; // L: 4390
			} else {
				return Huffman.Client_plane;
			}
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIII)V",
		garbageValue = "-1834411387"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null; // L: 6609

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 6610 6611 6616
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) { // L: 6612
				var9 = var10; // L: 6613
				break;
			}
		}

		if (var9 == null) { // L: 6618
			var9 = new PendingSpawn(); // L: 6619
			var9.plane = var0; // L: 6620
			var9.type = var3; // L: 6621
			var9.x = var1; // L: 6622
			var9.y = var2; // L: 6623
			WorldMapIcon_1.method375(var9); // L: 6624
			Client.pendingSpawns.addFirst(var9); // L: 6625
		}

		var9.id = var4; // L: 6627
		var9.field964 = var5; // L: 6628
		var9.orientation = var6; // L: 6629
		var9.delay = var7; // L: 6630
		var9.hitpoints = var8; // L: 6631
	} // L: 6632
}
