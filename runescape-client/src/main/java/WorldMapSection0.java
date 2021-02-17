import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1775426037
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1417422949
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1514356361
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1086537607
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -817500625
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2065957163
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 442203897
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -999047197
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -755644285
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -692612685
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 992317231
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 841901679
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1830115023
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 600167231
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lav;S)V",
		garbageValue = "19050"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7; // L: 35
		} else {
			return false; // L: 33
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7; // L: 39
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{var2 + (this.newX * 64 - this.oldX * 64) + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 53
			return null; // L: 54
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1; // L: 56
			int var4 = var2 + (this.oldY * 64 - this.newY * 64) + (this.oldChunkYLow * 8 - this.newChunkYLow * 8); // L: 57
			return new Coord(this.oldZ, var3, var4); // L: 58
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte(); // L: 62
		this.newZ = var1.readUnsignedByte(); // L: 63
		this.oldX = var1.readUnsignedShort(); // L: 64
		this.oldChunkXLow = var1.readUnsignedByte(); // L: 65
		this.oldChunkXHigh = var1.readUnsignedByte(); // L: 66
		this.oldY = var1.readUnsignedShort(); // L: 67
		this.oldChunkYLow = var1.readUnsignedByte(); // L: 68
		this.oldChunkYHigh = var1.readUnsignedByte(); // L: 69
		this.newX = var1.readUnsignedShort(); // L: 70
		this.newChunkXLow = var1.readUnsignedByte(); // L: 71
		this.newChunkXHigh = var1.readUnsignedByte(); // L: 72
		this.newY = var1.readUnsignedShort(); // L: 73
		this.newChunkYLow = var1.readUnsignedByte(); // L: 74
		this.newChunkYHigh = var1.readUnsignedByte(); // L: 75
		this.postRead(); // L: 76
	} // L: 77

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2143649574"
	)
	@Export("postRead")
	void postRead() {
	} // L: 79

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)Llm;",
		garbageValue = "1856556337"
	)
	@Export("convertJpgToSprite")
	public static final SpritePixels convertJpgToSprite(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0)); // L: 22
			int var2 = var1.getWidth(); // L: 23
			int var3 = var1.getHeight(); // L: 24
			int[] var4 = new int[var2 * var3]; // L: 25
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2); // L: 26
			var5.grabPixels(); // L: 27
			return new SpritePixels(var4, var2, var3); // L: 28
		} catch (IOException var7) { // L: 30
		} catch (InterruptedException var8) { // L: 31
		}

		return new SpritePixels(0, 0); // L: 32
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lky;II)Z",
		garbageValue = "92498700"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 378
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 379
			if (var0.readBits(1) != 0) { // L: 380
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 381
			var4 = var0.readBits(13); // L: 382
			boolean var12 = var0.readBits(1) == 1; // L: 383
			if (var12) { // L: 384
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 385
				throw new RuntimeException(); // L: 386
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 388
				var11.index = var1; // L: 389
				if (Players.field1254[var1] != null) { // L: 390
					var11.read(Players.field1254[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 391
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 392
				var7 = Players.Players_regions[var1]; // L: 393
				var8 = var7 >> 28; // L: 394
				var9 = var7 >> 14 & 255; // L: 395
				var10 = var7 & 255; // L: 396
				var11.pathTraversed[0] = Players.field1253[var1]; // L: 397
				var11.plane = (byte)var8; // L: 398
				var11.resetPath((var9 << 13) + var3 - NetFileRequest.baseX, (var10 << 13) + var4 - class41.baseY); // L: 399
				var11.field631 = false; // L: 400
				return true; // L: 401
			}
		} else if (var2 == 1) { // L: 403
			var3 = var0.readBits(2); // L: 404
			var4 = Players.Players_regions[var1]; // L: 405
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 406
			return false; // L: 407
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 409
				var3 = var0.readBits(5); // L: 410
				var4 = var3 >> 3; // L: 411
				var5 = var3 & 7; // L: 412
				var6 = Players.Players_regions[var1]; // L: 413
				var7 = (var6 >> 28) + var4 & 3; // L: 414
				var8 = var6 >> 14 & 255; // L: 415
				var9 = var6 & 255; // L: 416
				if (var5 == 0) { // L: 417
					--var8; // L: 418
					--var9; // L: 419
				}

				if (var5 == 1) { // L: 421
					--var9;
				}

				if (var5 == 2) { // L: 422
					++var8; // L: 423
					--var9; // L: 424
				}

				if (var5 == 3) { // L: 426
					--var8;
				}

				if (var5 == 4) { // L: 427
					++var8;
				}

				if (var5 == 5) { // L: 428
					--var8; // L: 429
					++var9; // L: 430
				}

				if (var5 == 6) { // L: 432
					++var9;
				}

				if (var5 == 7) { // L: 433
					++var8; // L: 434
					++var9; // L: 435
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 437
				return false; // L: 438
			} else {
				var3 = var0.readBits(18); // L: 440
				var4 = var3 >> 16; // L: 441
				var5 = var3 >> 8 & 255; // L: 442
				var6 = var3 & 255; // L: 443
				var7 = Players.Players_regions[var1]; // L: 444
				var8 = (var7 >> 28) + var4 & 3; // L: 445
				var9 = var5 + (var7 >> 14) & 255; // L: 446
				var10 = var7 + var6 & 255; // L: 447
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 448
				return false; // L: 449
			}
		}
	}
}
