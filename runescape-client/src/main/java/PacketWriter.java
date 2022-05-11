import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("PacketWriter")
public class PacketWriter {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnf;"
	)
	@Export("socket")
	AbstractSocket socket;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("packetBufferNodes")
	IterableNodeDeque packetBufferNodes;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -644004197
	)
	@Export("bufferSize")
	int bufferSize;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("isaacCipher")
	public IsaacCipher isaacCipher;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("packetBuffer")
	PacketBuffer packetBuffer;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("serverPacket")
	ServerPacket serverPacket;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1393417271
	)
	@Export("serverPacketLength")
	int serverPacketLength;
	@ObfuscatedName("r")
	boolean field1348;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2050999841
	)
	int field1349;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1635279751
	)
	@Export("pendingWrites")
	int pendingWrites;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ServerPacket field1351;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ServerPacket field1340;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	ServerPacket field1345;

	PacketWriter() {
		this.packetBufferNodes = new IterableNodeDeque(); // L: 15
		this.bufferSize = 0; // L: 16
		this.buffer = new Buffer(5000); // L: 17
		this.packetBuffer = new PacketBuffer(40000); // L: 19
		this.serverPacket = null; // L: 20
		this.serverPacketLength = 0; // L: 21
		this.field1348 = true; // L: 22
		this.field1349 = 0; // L: 23
		this.pendingWrites = 0; // L: 24
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-564347144"
	)
	@Export("clearBuffer")
	final void clearBuffer() {
		this.packetBufferNodes.rsClear(); // L: 32
		this.bufferSize = 0; // L: 33
	} // L: 34

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1796136378"
	)
	@Export("flush")
	final void flush() throws IOException {
		if (this.socket != null && this.bufferSize > 0) { // L: 37
			this.buffer.offset = 0; // L: 38

			while (true) {
				PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.last(); // L: 40
				if (var1 == null || var1.index > this.buffer.array.length - this.buffer.offset) { // L: 41 42
					this.socket.write(this.buffer.array, 0, this.buffer.offset); // L: 49
					this.pendingWrites = 0; // L: 50
					break;
				}

				this.buffer.writeBytes(var1.packetBuffer.array, 0, var1.index); // L: 43
				this.bufferSize -= var1.index; // L: 44
				var1.remove(); // L: 45
				var1.packetBuffer.releaseArray(); // L: 46
				var1.release(); // L: 47
			}
		}

	} // L: 52

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljm;B)V",
		garbageValue = "0"
	)
	@Export("addNode")
	public final void addNode(PacketBufferNode var1) {
		this.packetBufferNodes.addFirst(var1); // L: 55
		var1.index = var1.packetBuffer.offset; // L: 56
		var1.packetBuffer.offset = 0; // L: 57
		this.bufferSize += var1.index; // L: 58
	} // L: 59

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)V",
		garbageValue = "1112545790"
	)
	@Export("setSocket")
	void setSocket(AbstractSocket var1) {
		this.socket = var1; // L: 62
	} // L: 63

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-658822811"
	)
	@Export("close")
	void close() {
		if (this.socket != null) { // L: 66
			this.socket.close(); // L: 67
			this.socket = null; // L: 68
		}

	} // L: 70

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
	)
	@Export("removeSocket")
	void removeSocket() {
		this.socket = null; // L: 73
	} // L: 74

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(S)Lnf;",
		garbageValue = "255"
	)
	@Export("getSocket")
	AbstractSocket getSocket() {
		return this.socket; // L: 77
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Lqr;",
		garbageValue = "5"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 357
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 358
			var4 = 1;
		}

		long var6 = ((long)var3 << 42) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40); // L: 359
		SpritePixels var8;
		if (!var5) { // L: 361
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6); // L: 362
			if (var8 != null) { // L: 363
				return var8;
			}
		}

		ItemComposition var9 = FileSystem.ItemDefinition_get(var0); // L: 365
		if (var1 > 1 && var9.countobj != null) { // L: 366
			int var10 = -1; // L: 367

			for (int var11 = 0; var11 < 10; ++var11) { // L: 368
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 369
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 371
				var9 = FileSystem.ItemDefinition_get(var10);
			}
		}

		Model var19 = var9.getModel(1); // L: 373
		if (var19 == null) { // L: 374
			return null;
		} else {
			SpritePixels var20 = null; // L: 375
			if (var9.noteTemplate != -1) { // L: 376
				var20 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 377
				if (var20 == null) { // L: 378
					return null;
				}
			} else if (var9.notedId != -1) { // L: 380
				var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 381
				if (var20 == null) { // L: 382
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 384
				var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 385
				if (var20 == null) { // L: 386
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 388
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 389
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 390
			int[] var15 = new int[4]; // L: 391
			Rasterizer2D.Rasterizer2D_getClipArray(var15); // L: 392
			var8 = new SpritePixels(36, 32); // L: 393
			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 394
			Rasterizer2D.Rasterizer2D_clear(); // L: 395
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 396
			Rasterizer3D.method3939(16, 16); // L: 397
			Rasterizer3D.field2379 = false; // L: 398
			if (var9.placeholderTemplate != -1) { // L: 399
				var20.drawTransBgAt(0, 0);
			}

			int var16 = var9.zoom2d; // L: 400
			if (var5) { // L: 401
				var16 = (int)((double)var16 * 1.5D);
			} else if (var2 == 2) { // L: 402
				var16 = (int)(1.04D * (double)var16);
			}

			int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 403
			int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 404
			var19.calculateBoundsCylinder(); // L: 405
			var19.method4272(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d); // L: 406
			if (var9.notedId != -1) { // L: 407
				var20.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 408
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 409
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 410
				var8.shadow(var3);
			}

			Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32); // L: 411
			if (var9.noteTemplate != -1) { // L: 412
				var20.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 413
				class146.ItemDefinition_fontPlain11.draw(class301.method5583(var1), 0, 9, 16776960, 1); // L: 414
			}

			if (!var5) { // L: 416
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer2D.Rasterizer2D_replace(var12, var13, var14); // L: 417
			Rasterizer2D.Rasterizer2D_setClipArray(var15); // L: 418
			Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 419
			Rasterizer3D.field2379 = true; // L: 420
			return var8; // L: 421
		}
	}
}
