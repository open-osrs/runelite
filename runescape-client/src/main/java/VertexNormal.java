import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ei")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("archive18")
	static Archive archive18;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 571778343
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1513329049
	)
	@Export("y")
	int y;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -73747775
	)
	@Export("z")
	int z;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 89505295
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	} // L: 9

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x; // L: 12
		this.y = var1.y; // L: 13
		this.z = var1.z; // L: 14
		this.magnitude = var1.magnitude; // L: 15
	} // L: 16

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "339374654"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 73
		if (var1 == null) { // L: 74
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 75 76
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2020888732"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) { // L: 1959
			if (Client.gameState == 0) { // L: 1960
				class295.client.method498();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) { // L: 1961
				PacketBufferNode.method5016(0); // L: 1962
				Client.field545 = 0; // L: 1963
				Client.field541 = 0; // L: 1964
				Client.timer.method6232(var0); // L: 1965
				if (var0 != 20) { // L: 1966
					FriendSystem.method1791(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Coord.field3186 != null) { // L: 1968 1969
				Coord.field3186.close(); // L: 1970
				Coord.field3186 = null; // L: 1971
			}

			if (Client.gameState == 25) { // L: 1974
				Client.field602 = 0; // L: 1975
				Client.field529 = 0; // L: 1976
				Client.field530 = 1; // L: 1977
				Client.field617 = 0; // L: 1978
				Client.field532 = 1; // L: 1979
			}

			int var1;
			if (var0 != 5 && var0 != 10) { // L: 1981
				if (var0 == 20) { // L: 1985
					var1 = Client.gameState == 11 ? 4 : 0; // L: 1986
					DefaultsGroup.method6568(class257.archive10, UserComparator6.archive8, true, var1); // L: 1987
				} else if (var0 == 11) { // L: 1989
					DefaultsGroup.method6568(class257.archive10, UserComparator6.archive8, false, 4); // L: 1990
				} else {
					SoundCache.method823(); // L: 1992
				}
			} else {
				var1 = AttackOption.method2356() ? 0 : 12; // L: 1982
				DefaultsGroup.method6568(class257.archive10, UserComparator6.archive8, true, var1); // L: 1983
			}

			Client.gameState = var0; // L: 1993
		}
	} // L: 1994
}
