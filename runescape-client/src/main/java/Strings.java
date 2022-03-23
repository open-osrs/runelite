import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("be")
	public static String field3731;
	@ObfuscatedName("cb")
	public static String field3684;
	@ObfuscatedName("kn")
	public static String field3645;
	@ObfuscatedName("km")
	public static String field3870;
	@ObfuscatedName("ke")
	public static String field3871;

	static {
		field3731 = "Please visit the support page for assistance.";
		field3684 = "Please visit the support page for assistance."; // L: 99
		field3645 = ""; // L: 299
		field3870 = "Page has opened in a new window."; // L: 300
		field3871 = "(Please check your popup blocker.)"; // L: 301
	} // L: 339

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lpy;I)V",
		garbageValue = "1995067219"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex(); // L: 37
		int var1 = Client.localPlayerIndex; // L: 38
		Player var2 = class19.localPlayer = Client.players[var1] = new Player(); // L: 39
		var2.index = var1;
		int var3 = var0.readBits(30); // L: 41
		byte var4 = (byte)(var3 >> 28); // L: 42
		int var5 = var3 >> 14 & 16383; // L: 43
		int var6 = var3 & 16383; // L: 44
		var2.pathX[0] = var5 - ApproximateRouteStrategy.baseX; // L: 45
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6); // L: 46
		var2.pathY[0] = var6 - class250.baseY; // L: 47
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6); // L: 48
		class160.Client_plane = var2.plane = var4; // L: 49
		if (Players.field1289[var1] != null) { // L: 50
			var2.read(Players.field1289[var1]);
		}

		Players.Players_count = 0; // L: 51
		Players.Players_indices[++Players.Players_count - 1] = var1; // L: 52
		Players.field1288[var1] = 0; // L: 53
		Players.Players_emptyIdxCount = 0; // L: 54

		for (int var7 = 1; var7 < 2048; ++var7) { // L: 55
			if (var7 != var1) { // L: 56
				int var8 = var0.readBits(18); // L: 57
				int var9 = var8 >> 16; // L: 58
				int var10 = var8 >> 8 & 597; // L: 59
				int var11 = var8 & 597; // L: 60
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28); // L: 61
				Players.Players_orientations[var7] = 0; // L: 62
				Players.Players_targetIndices[var7] = -1; // L: 63
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7; // L: 64
				Players.field1288[var7] = 0; // L: 65
			}
		}

		var0.exportIndex(); // L: 67
	} // L: 68

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IB)Lba;",
		garbageValue = "-56"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0); // L: 40
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "222187307"
	)
	static final void method5795() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11680
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11681
			var1.clearIsFriend(); // L: 11682
		}

		class20.method326(); // L: 11684
		if (class230.friendsChat != null) { // L: 11685
			class230.friendsChat.clearFriends(); // L: 11686
		}

	} // L: 11688

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static final void method5798() {
		Client.field726 = Client.cycleCntr; // L: 11705
		class345.ClanChat_inClanChat = true; // L: 11706
	} // L: 11707
}
