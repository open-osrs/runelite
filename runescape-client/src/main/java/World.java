import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("World")
public class World {
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "[Lcq;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1883151611
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1211509963
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("e")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("q")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	static IndexedSprite field1039;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = 4616072820016449217L
	)
	static long field1036;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1941942941
	)
	@Export("id")
	int id;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2050399625
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -602749729
	)
	@Export("population")
	int population;
	@ObfuscatedName("w")
	@Export("host")
	String host;
	@ObfuscatedName("k")
	@Export("activity")
	String activity;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -175273101
	)
	@Export("location")
	int location;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 865975071
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1593793917"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1662495711"
	)
	boolean method1878() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1886649606"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1928708058"
	)
	boolean method1880() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1939241099"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	boolean method1883() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1636550910"
	)
	public static void method1924() {
		VarpDefinition.VarpDefinition_cached.clear(); // L: 41
	} // L: 42

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lkd;IS)Z",
		garbageValue = "-20652"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2); // L: 370
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) { // L: 371
			if (var0.readBits(1) != 0) { // L: 372
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13); // L: 373
			var4 = var0.readBits(13); // L: 374
			boolean var12 = var0.readBits(1) == 1; // L: 375
			if (var12) { // L: 376
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) { // L: 377
				throw new RuntimeException(); // L: 378
			} else {
				Player var11 = Client.players[var1] = new Player(); // L: 380
				var11.index = var1; // L: 381
				if (Players.field1269[var1] != null) { // L: 382
					var11.read(Players.field1269[var1]);
				}

				var11.orientation = Players.Players_orientations[var1]; // L: 383
				var11.targetIndex = Players.Players_targetIndices[var1]; // L: 384
				var7 = Players.Players_regions[var1]; // L: 385
				var8 = var7 >> 28; // L: 386
				var9 = var7 >> 14 & 255; // L: 387
				var10 = var7 & 255; // L: 388
				var11.pathTraversed[0] = Players.field1274[var1]; // L: 389
				var11.plane = (byte)var8; // L: 390
				var11.resetPath((var9 << 13) + var3 - GrandExchangeOfferNameComparator.baseX, (var10 << 13) + var4 - NetCache.baseY); // L: 391
				var11.field652 = false; // L: 392
				return true; // L: 393
			}
		} else if (var2 == 1) { // L: 395
			var3 = var0.readBits(2); // L: 396
			var4 = Players.Players_regions[var1]; // L: 397
			Players.Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28); // L: 398
			return false; // L: 399
		} else {
			int var5;
			int var6;
			if (var2 == 2) { // L: 401
				var3 = var0.readBits(5); // L: 402
				var4 = var3 >> 3; // L: 403
				var5 = var3 & 7; // L: 404
				var6 = Players.Players_regions[var1]; // L: 405
				var7 = (var6 >> 28) + var4 & 3; // L: 406
				var8 = var6 >> 14 & 255; // L: 407
				var9 = var6 & 255; // L: 408
				if (var5 == 0) { // L: 409
					--var8; // L: 410
					--var9; // L: 411
				}

				if (var5 == 1) { // L: 413
					--var9;
				}

				if (var5 == 2) { // L: 414
					++var8; // L: 415
					--var9; // L: 416
				}

				if (var5 == 3) { // L: 418
					--var8;
				}

				if (var5 == 4) { // L: 419
					++var8;
				}

				if (var5 == 5) { // L: 420
					--var8; // L: 421
					++var9; // L: 422
				}

				if (var5 == 6) { // L: 424
					++var9;
				}

				if (var5 == 7) { // L: 425
					++var8; // L: 426
					++var9; // L: 427
				}

				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28); // L: 429
				return false; // L: 430
			} else {
				var3 = var0.readBits(18); // L: 432
				var4 = var3 >> 16; // L: 433
				var5 = var3 >> 8 & 255; // L: 434
				var6 = var3 & 255; // L: 435
				var7 = Players.Players_regions[var1]; // L: 436
				var8 = (var7 >> 28) + var4 & 3; // L: 437
				var9 = var5 + (var7 >> 14) & 255; // L: 438
				var10 = var6 + var7 & 255; // L: 439
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28); // L: 440
				return false; // L: 441
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "14756"
	)
	static void method1923() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 59

		while (var0.hasNext()) { // L: 64
			Message var1 = (Message)var0.next(); // L: 60
			var1.clearIsFromIgnored(); // L: 62
		}

	} // L: 65

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "37330821"
	)
	static void method1925() {
		if (UserComparator9.localPlayer.x >> 7 == Client.destinationX && UserComparator9.localPlayer.y >> 7 == Client.destinationY) { // L: 4252
			Client.destinationX = 0; // L: 4253
		}

	} // L: 4255
}
