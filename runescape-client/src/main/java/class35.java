import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
public class class35 {
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static IndexedSprite field244;
	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("f")
	ExecutorService field245;
	@ObfuscatedName("e")
	Future field239;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	final Buffer field247;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class31 field241;

	@ObfuscatedSignature(
		descriptor = "(Lnt;Laz;)V"
	)
	public class35(Buffer var1, class31 var2) {
		this.field245 = Executors.newSingleThreadExecutor(); // L: 10
		this.field247 = var1; // L: 16
		this.field241 = var2; // L: 17
		this.method413(); // L: 18
	} // L: 19

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1008458441"
	)
	public boolean method420() {
		return this.field239.isDone(); // L: 22
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public void method410() {
		this.field245.shutdown(); // L: 26
		this.field245 = null; // L: 27
	} // L: 28

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Lnt;",
		garbageValue = "627853337"
	)
	public Buffer method416() {
		try {
			return (Buffer)this.field239.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2058888310"
	)
	void method413() {
		this.field239 = this.field245.submit(new class29(this, this.field247, this.field241)); // L: 40
	} // L: 41

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2087422044"
	)
	public static void method422() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 60
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 61
			} // L: 62

			if (var0 == null) {
				return; // L: 63
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 64
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-1578358976"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 177
			int var6 = (var0 + var1) / 2; // L: 178
			int var7 = var0; // L: 179
			World var8 = World.World_worlds[var6]; // L: 180
			World.World_worlds[var6] = World.World_worlds[var1]; // L: 181
			World.World_worlds[var1] = var8; // L: 182

			for (int var9 = var0; var9 < var1; ++var9) { // L: 183
				if (ReflectionCheck.method1227(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) { // L: 184
					World var10 = World.World_worlds[var9]; // L: 185
					World.World_worlds[var9] = World.World_worlds[var7]; // L: 186
					World.World_worlds[var7++] = var10; // L: 187
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7]; // L: 191
			World.World_worlds[var7] = var8; // L: 192
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 193
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 194
		}

	} // L: 196

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lns;II)Z",
		garbageValue = "-685210313"
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
				if (Players.field1362[var1] != null) { // L: 390
					var11.read(Players.field1362[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 391
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 392
				var7 = Players.Players_regions[var1]; // L: 393
				var8 = var7 >> 28; // L: 394
				var9 = var7 >> 14 & 255; // L: 395
				var10 = var7 & 255; // L: 396
				var11.pathTraversed[0] = Players.field1361[var1]; // L: 397
				var11.plane = (byte)var8; // L: 398
				var11.resetPath((var9 << 13) + var3 - class15.baseX, (var10 << 13) + var4 - WorldMapSprite.baseY); // L: 399
				var11.field1201 = false; // L: 400
				return true; // L: 401
			}
		} else if (var2 == 1) { // L: 403
			var3 = var0.readBits(2); // L: 404
			var4 = Players.Players_regions[var1]; // L: 405
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455); // L: 406
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
				var10 = var6 + var7 & 255; // L: 447
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 448
				return false; // L: 449
			}
		}
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "2109502620"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden; // L: 11562
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "163144058"
	)
	static void method421() {
		Client.packetWriter.addNode(InterfaceParent.getPacketBufferNode(ClientPacket.field2599, Client.packetWriter.isaacCipher)); // L: 11673
		Client.oculusOrbState = 0; // L: 11674
	} // L: 11675
}
