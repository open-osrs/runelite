import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("FloorUnderlayDefinition")
public class FloorUnderlayDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("FloorUnderlayDefinition_archive")
	public static AbstractArchive FloorUnderlayDefinition_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("FloorUnderlayDefinition_cached")
	static EvictingDualNodeHashTable FloorUnderlayDefinition_cached;
	@ObfuscatedName("hn")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1688031679
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1166691661
	)
	@Export("rgb")
	int rgb;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1101049757
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2015074227
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1371638813
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1786707103
	)
	@Export("hueMultiplier")
	public int hueMultiplier;

	static {
		FloorUnderlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	FloorUnderlayDefinition() {
		this.rgb = 0; // L: 12
	} // L: 18

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("postDecode")
	void postDecode() {
		this.setHsl(this.rgb); // L: 32
	} // L: 33

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V",
		garbageValue = "-1229195714"
	)
	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 37
			if (var3 == 0) { // L: 38
				return; // L: 41
			}

			this.decodeNext(var1, var3, var2); // L: 39
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;III)V",
		garbageValue = "1871549003"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 44
			this.rgb = var1.readMedium();
		}

	} // L: 46

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "118"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 49
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 50
		double var6 = (double)(var1 & 255) / 256.0D; // L: 51
		double var8 = var2; // L: 52
		if (var4 < var2) { // L: 53
			var8 = var4;
		}

		if (var6 < var8) { // L: 54
			var8 = var6;
		}

		double var10 = var2; // L: 55
		if (var4 > var2) { // L: 56
			var10 = var4;
		}

		if (var6 > var10) { // L: 57
			var10 = var6;
		}

		double var12 = 0.0D; // L: 58
		double var14 = 0.0D; // L: 59
		double var16 = (var10 + var8) / 2.0D; // L: 60
		if (var8 != var10) { // L: 61
			if (var16 < 0.5D) { // L: 62
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 63
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) { // L: 64
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) { // L: 65
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D; // L: 66
			}
		}

		var12 /= 6.0D; // L: 68
		this.saturation = (int)(var14 * 256.0D); // L: 69
		this.lightness = (int)(256.0D * var16); // L: 70
		if (this.saturation < 0) { // L: 71
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 72
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 73
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 74
			this.lightness = 255;
		}

		if (var16 > 0.5D) { // L: 75
			this.hueMultiplier = (int)(512.0D * (1.0D - var16) * var14);
		} else {
			this.hueMultiplier = (int)(512.0D * var16 * var14); // L: 76
		}

		if (this.hueMultiplier < 1) { // L: 77
			this.hueMultiplier = 1;
		}

		this.hue = (int)(var12 * (double)this.hueMultiplier); // L: 78
	} // L: 79

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lpc;II)Z",
		garbageValue = "1224143507"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 376
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 377
			if (var0.readBits(1) != 0) { // L: 378
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 379
			var4 = var0.readBits(13); // L: 380
			boolean var12 = var0.readBits(1) == 1; // L: 381
			if (var12) { // L: 382
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 383
				throw new RuntimeException(); // L: 384
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 386
				var11.index = var1; // L: 387
				if (Players.field1307[var1] != null) { // L: 388
					var11.read(Players.field1307[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 389
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 390
				var7 = Players.Players_regions[var1]; // L: 391
				var8 = var7 >> 28; // L: 392
				var9 = var7 >> 14 & 255; // L: 393
				var10 = var7 & 255; // L: 394
				var11.pathTraversed[0] = Players.field1302[var1]; // L: 395
				var11.plane = (byte)var8; // L: 396
				var11.resetPath((var9 << 13) + var3 - SecureRandomCallable.baseX, (var10 << 13) + var4 - GrandExchangeOfferOwnWorldComparator.baseY); // L: 397
				var11.field1095 = false; // L: 398
				return true; // L: 399
			}
		} else if (var2 == 1) { // L: 401
			var3 = var0.readBits(2); // L: 402
			var4 = Players.Players_regions[var1]; // L: 403
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 404
			return false; // L: 405
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 407
				var3 = var0.readBits(5); // L: 408
				var4 = var3 >> 3; // L: 409
				var5 = var3 & 7; // L: 410
				var6 = Players.Players_regions[var1]; // L: 411
				var7 = (var6 >> 28) + var4 & 3; // L: 412
				var8 = var6 >> 14 & 255; // L: 413
				var9 = var6 & 255; // L: 414
				if (var5 == 0) { // L: 415
					--var8; // L: 416
					--var9; // L: 417
				}

				if (var5 == 1) { // L: 419
					--var9;
				}

				if (var5 == 2) { // L: 420
					++var8; // L: 421
					--var9; // L: 422
				}

				if (var5 == 3) { // L: 424
					--var8;
				}

				if (var5 == 4) { // L: 425
					++var8;
				}

				if (var5 == 5) { // L: 426
					--var8; // L: 427
					++var9; // L: 428
				}

				if (var5 == 6) { // L: 430
					++var9;
				}

				if (var5 == 7) { // L: 431
					++var8; // L: 432
					++var9; // L: 433
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 435
				return false; // L: 436
			} else {
				var3 = var0.readBits(18); // L: 438
				var4 = var3 >> 16; // L: 439
				var5 = var3 >> 8 & 255; // L: 440
				var6 = var3 & 255; // L: 441
				var7 = Players.Players_regions[var1]; // L: 442
				var8 = (var7 >> 28) + var4 & 3; // L: 443
				var9 = var5 + (var7 >> 14) & 255; // L: 444
				var10 = var7 + var6 & 255; // L: 445
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 446
				return false; // L: 447
			}
		}
	}
}
