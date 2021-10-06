import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 843492453
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1629429381
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -549763557
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		longValue = -4918137841721985399L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 844864059
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Lky;",
		garbageValue = "-1474913181"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3) {
		ArchiveDisk var4 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var4 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var4, HealthBarUpdate.masterDisk, var0, var1, var2, var3);
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1673843314"
	)
	static final void method4020() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}

		Iterator var2 = Messages.Messages_hashTable.iterator();

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next();
			var3.clearIsFromFriend();
		}

		if (class264.friendsChat != null) {
			class264.friendsChat.clearFriends();
		}

	}
}
