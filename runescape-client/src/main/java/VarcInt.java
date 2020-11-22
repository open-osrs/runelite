import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("l")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public VarcInt() {
		this.persist = false; // L: 12
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-871619448"
	)
	public void method4552(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 20
			if (var2 == 0) { // L: 21
				return; // L: 24
			}

			this.method4556(var1, var2); // L: 22
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lkb;II)V",
		garbageValue = "-359946158"
	)
	void method4556(Buffer var1, int var2) {
		if (var2 == 2) { // L: 27
			this.persist = true; // L: 28
		}

	} // L: 31

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILco;ZI)I",
		garbageValue = "-159585156"
	)
	static int method4562(int var0, Script var1, boolean var2) {
		if (var0 < 1000) { // L: 389
			return Script.method2355(var0, var1, var2);
		} else if (var0 < 1100) { // L: 390
			return SpotAnimationDefinition.method4577(var0, var1, var2);
		} else if (var0 < 1200) { // L: 391
			return KeyHandler.method934(var0, var1, var2);
		} else if (var0 < 1300) { // L: 392
			return class69.method1266(var0, var1, var2);
		} else if (var0 < 1400) { // L: 393
			return FriendSystem.method2018(var0, var1, var2);
		} else if (var0 < 1500) { // L: 394
			return Language.method3802(var0, var1, var2);
		} else if (var0 < 1600) { // L: 395
			return GrandExchangeOffer.method198(var0, var1, var2);
		} else if (var0 < 1700) { // L: 396
			return ParamDefinition.method4671(var0, var1, var2);
		} else if (var0 < 1800) { // L: 397
			return UserComparator4.method3506(var0, var1, var2);
		} else if (var0 < 1900) { // L: 398
			return MouseHandler.method1152(var0, var1, var2);
		} else if (var0 < 2000) { // L: 399
			return PlayerType.method4274(var0, var1, var2);
		} else if (var0 < 2100) { // L: 400
			return SpotAnimationDefinition.method4577(var0, var1, var2);
		} else if (var0 < 2200) { // L: 401
			return KeyHandler.method934(var0, var1, var2);
		} else if (var0 < 2300) { // L: 402
			return class69.method1266(var0, var1, var2);
		} else if (var0 < 2400) { // L: 403
			return FriendSystem.method2018(var0, var1, var2);
		} else if (var0 < 2500) {
			return Language.method3802(var0, var1, var2); // L: 404
		} else if (var0 < 2600) { // L: 405
			return Strings.method4259(var0, var1, var2);
		} else if (var0 < 2700) { // L: 406
			return GrandExchangeEvent.method165(var0, var1, var2);
		} else if (var0 < 2800) { // L: 407
			return class23.method249(var0, var1, var2);
		} else if (var0 < 2900) { // L: 408
			return WorldMapID.method667(var0, var1, var2);
		} else if (var0 < 3000) { // L: 409
			return PlayerType.method4274(var0, var1, var2);
		} else if (var0 < 3200) { // L: 410
			return NPC.method2158(var0, var1, var2);
		} else if (var0 < 3300) { // L: 411
			return WorldMapDecoration.method429(var0, var1, var2);
		} else if (var0 < 3400) { // L: 412
			return VertexNormal.method3134(var0, var1, var2);
		} else if (var0 < 3500) { // L: 413
			return Player.method1354(var0, var1, var2);
		} else if (var0 < 3700) { // L: 414
			return SpriteMask.method4119(var0, var1, var2);
		} else if (var0 < 4000) { // L: 415
			return class217.method4099(var0, var1, var2);
		} else if (var0 < 4100) { // L: 416
			return PendingSpawn.method1840(var0, var1, var2);
		} else if (var0 < 4200) { // L: 417
			return NetCache.method4461(var0, var1, var2);
		} else if (var0 < 4300) { // L: 418
			return ModeWhere.method3806(var0, var1, var2);
		} else if (var0 < 5100) { // L: 419
			return WorldMapSprite.method518(var0, var1, var2);
		} else if (var0 < 5400) { // L: 420
			return Tiles.method1222(var0, var1, var2);
		} else if (var0 < 5600) { // L: 421
			return class169.method3572(var0, var1, var2);
		} else if (var0 < 5700) { // L: 422
			return WorldMapArea.method511(var0, var1, var2);
		} else if (var0 < 6300) { // L: 423
			return class22.method244(var0, var1, var2);
		} else if (var0 < 6600) { // L: 424
			return GrandExchangeOfferAgeComparator.method240(var0, var1, var2);
		} else {
			return var0 < 6700 ? MusicPatch.method4036(var0, var1, var2) : 2; // L: 425 426
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lid;IIIBZI)V",
		garbageValue = "-1601672473"
	)
	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = (long)((var1 << 16) + var2); // L: 223
		NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6); // L: 224
		if (var8 == null) { // L: 225
			var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6); // L: 226
			if (var8 == null) { // L: 227
				var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6); // L: 228
				if (var8 != null) { // L: 229
					if (var5) { // L: 230
						var8.removeDual(); // L: 231
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 232
						--NetCache.NetCache_pendingWritesCount; // L: 233
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 234
					}

				} else {
					if (!var5) { // L: 238
						var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6); // L: 239
						if (var8 != null) { // L: 240
							return;
						}
					}

					var8 = new NetFileRequest(); // L: 242
					var8.archive = var0; // L: 243
					var8.crc = var3; // L: 244
					var8.padding = var4; // L: 245
					if (var5) { // L: 246
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6); // L: 247
						++NetCache.NetCache_pendingPriorityWritesCount; // L: 248
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8); // L: 251
						NetCache.NetCache_pendingWrites.put(var8, var6); // L: 252
						++NetCache.NetCache_pendingWritesCount; // L: 253
					}

				}
			}
		}
	} // L: 236 255

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2000095907"
	)
	static final int method4555(int var0, int var1) {
		if (var0 == -1) { // L: 469
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 470
			if (var1 < 2) { // L: 471
				var1 = 2;
			} else if (var1 > 126) { // L: 472
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 473
		}
	}
}
