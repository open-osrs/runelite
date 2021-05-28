import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("v")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("n")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("f")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("bd")
	@Export("otp")
	static String otp;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000]; // L: 17
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static final void method4647() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) { // L: 11244
			Player var1 = Client.players[Players.Players_indices[var0]]; // L: 11245
			var1.clearIsFriend(); // L: 11246
		}

		Iterator var2 = Messages.Messages_hashTable.iterator(); // L: 11249

		while (var2.hasNext()) {
			Message var3 = (Message)var2.next(); // L: 11250
			var3.clearIsFromFriend(); // L: 11252
		}

		if (WorldMapRegion.friendsChat != null) { // L: 11256
			WorldMapRegion.friendsChat.clearFriends(); // L: 11257
		}

	} // L: 11259
}
