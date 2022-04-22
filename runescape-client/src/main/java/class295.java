import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class class295 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "1171437373"
	)
	static VerticalAlignment[] method5745() {
		return new VerticalAlignment[]{VerticalAlignment.field1932, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1935}; // L: 14
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "176339284"
	)
	static final void method5732() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 12343
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 12344
			var1.clearIsFriend(); // L: 12345
		}

		ObjectComposition.method3674(); // L: 12347
		if (ClientPacket.friendsChat != null) { // L: 12348
			ClientPacket.friendsChat.clearFriends(); // L: 12349
		}

	} // L: 12351
}
