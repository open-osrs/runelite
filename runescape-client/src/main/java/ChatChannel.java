import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("ChatChannel")
public class ChatChannel {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "[Llm;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("messages")
	Message[] messages;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1722504417
	)
	@Export("count")
	int count;

	ChatChannel() {
		this.messages = new Message[100]; // L: 83
	} // L: 86

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbd;",
		garbageValue = "1561043824"
	)
	@Export("addMessage")
	Message addMessage(int var1, String var2, String var3, String var4) {
		Message var5 = this.messages[99]; // L: 89

		for (int var6 = this.count; var6 > 0; --var6) { // L: 90
			if (var6 != 100) { // L: 91
				this.messages[var6] = this.messages[var6 - 1]; // L: 92
			}
		}

		if (var5 == null) { // L: 94
			var5 = new Message(var1, var2, var4, var3);
		} else {
			var5.remove(); // L: 96
			var5.removeDual(); // L: 97
			var5.set(var1, var2, var4, var3); // L: 98
		}

		this.messages[0] = var5; // L: 100
		if (this.count < 100) { // L: 101
			++this.count;
		}

		return var5; // L: 102
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lbd;",
		garbageValue = "-55839716"
	)
	@Export("getMessage")
	Message getMessage(int var1) {
		return var1 >= 0 && var1 < this.count ? this.messages[var1] : null; // L: 106 107
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2110362731"
	)
	@Export("size")
	int size() {
		return this.count; // L: 111
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "488468248"
	)
	public static byte[] method2405(Object var0, boolean var1) {
		if (var0 == null) { // L: 21
			return null;
		} else if (var0 instanceof byte[]) { // L: 22
			byte[] var3 = (byte[])((byte[])var0); // L: 23
			return var1 ? UrlRequester.method3460(var3) : var3; // L: 24
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 27
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 28
			return var2.get(); // L: 29
		} else {
			throw new IllegalArgumentException(); // L: 31
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;Ljava/lang/String;I)Lly;",
		garbageValue = "591050656"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1); // L: 121
		int var4 = var0.getFileId(var3, var2); // L: 122
		byte[] var7 = var0.takeFile(var3, var4); // L: 127
		boolean var6;
		if (var7 == null) { // L: 128
			var6 = false; // L: 129
		} else {
			GrandExchangeOfferNameComparator.SpriteBuffer_decode(var7); // L: 132
			var6 = true; // L: 133
		}

		IndexedSprite var5;
		if (!var6) { // L: 135
			var5 = null; // L: 136
		} else {
			var5 = ApproximateRouteStrategy.method1304(); // L: 139
		}

		return var5; // L: 141
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lcq;I)V",
		garbageValue = "291320616"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1526
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1527
			boolean var1 = var0.isMembersOnly(); // L: 1528
			if (var1 != Bounds.ItemDefinition_inMembersWorld) { // L: 1530
				ItemComposition.ItemDefinition_cached.clear(); // L: 1532
				ItemComposition.ItemDefinition_cachedModels.clear(); // L: 1533
				ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 1534
				Bounds.ItemDefinition_inMembersWorld = var1; // L: 1536
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1540
			Archive var3 = ModeWhere.archive8; // L: 1541
			int var2 = var0.properties; // L: 1542
			if ((var2 & 536870912) != 0) { // L: 1544
				Login.logoSprite = SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 1545
			} else if ((var2 & 1073741824) != 0) { // L: 1547
				Login.logoSprite = SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 1548
			} else {
				Login.logoSprite = SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 1551
			}
		}

		MusicPatchNode.worldHost = var0.host; // L: 1555
		Client.worldId = var0.id; // L: 1556
		Client.worldProperties = var0.properties; // L: 1557
		MouseRecorder.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1558
		FrameProvider.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1559
		DynamicObject.currentPort = MouseRecorder.worldPort; // L: 1560
	} // L: 1561
}