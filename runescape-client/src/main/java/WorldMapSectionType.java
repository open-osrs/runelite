import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(3, (byte)0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(1, (byte)1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(2, (byte)2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(0, (byte)3);

	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -493940413
	)
	static int field2723;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 608641575
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	static Widget field2720;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 550297925
	)
	@Export("type")
	final int type;
	@ObfuscatedName("o")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 21
		this.id = var4; // L: 22
	} // L: 23

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-303340189"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 27
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-87998947"
	)
	static String method4720(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(S)[Lhf;",
		garbageValue = "14034"
	)
	static WorldMapSectionType[] method4723() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1}; // L: 17
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1693744275"
	)
	public static void method4726() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 123
	} // L: 124

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Ldw;",
		garbageValue = "-1694408965"
	)
	static class120 method4724(int var0) {
		class120 var1 = (class120)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0); // L: 368
		if (var1 != null) { // L: 369
			return var1;
		} else {
			AbstractArchive var3 = WorldMapData_0.SequenceDefinition_animationsArchive; // L: 371
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive; // L: 372
			boolean var5 = true; // L: 374
			byte[] var6 = var3.takeFile(var0 >> 16 & 65535, var0 & 65535); // L: 375
			class120 var2;
			if (var6 == null) { // L: 376
				var5 = false; // L: 377
				var2 = null; // L: 378
			} else {
				int var7 = (var6[1] & 255) << 8 | var6[2] & 255; // L: 381
				byte[] var8 = var4.getFile(var7, 0); // L: 384
				if (var8 == null) { // L: 385
					var5 = false;
				}

				if (!var5) { // L: 386
					var2 = null; // L: 387
				} else {
					try {
						var2 = new class120(var3, var4, var0, false); // L: 391
					} catch (Exception var10) { // L: 393
						var2 = null; // L: 394
					}
				}
			}

			if (var2 != null) { // L: 398
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, (long)var0);
			}

			return var2; // L: 399
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1583923340"
	)
	static final boolean method4717(int var0, int var1) {
		ObjectComposition var2 = ParamComposition.getObjectDefinition(var0); // L: 1028
		if (var1 == 11) { // L: 1029
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4; // L: 1030
		}

		return var2.method3475(var1); // L: 1031
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1498740944"
	)
	static final void method4725() {
		if (Skeleton.ClanChat_inClanChat) { // L: 3472
			if (class67.friendsChat != null) { // L: 3473
				class67.friendsChat.sort(); // L: 3474
			}

			for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 3477
				Player var1 = Client.players[Players.Players_indices[var0]]; // L: 3478
				var1.clearIsInFriendsChat(); // L: 3479
			}

			Skeleton.ClanChat_inClanChat = false; // L: 3482
		}

	} // L: 3484
}
