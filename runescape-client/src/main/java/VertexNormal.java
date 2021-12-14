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
	}

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "339374654"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2020888732"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				class295.client.method498();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45) {
				PacketBufferNode.method5016(0);
				Client.field545 = 0;
				Client.field541 = 0;
				Client.timer.method6232(var0);
				if (var0 != 20) {
					FriendSystem.method1791(false);
				}
			}

			if (var0 != 20 && var0 != 40 && Coord.field3186 != null) {
				Coord.field3186.close();
				Coord.field3186 = null;
			}

			if (Client.gameState == 25) {
				Client.field602 = 0;
				Client.field529 = 0;
				Client.field530 = 1;
				Client.field617 = 0;
				Client.field532 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					DefaultsGroup.method6568(class257.archive10, UserComparator6.archive8, true, var1);
				} else if (var0 == 11) {
					DefaultsGroup.method6568(class257.archive10, UserComparator6.archive8, false, 4);
				} else {
					SoundCache.method823();
				}
			} else {
				var1 = AttackOption.method2356() ? 0 : 12;
				DefaultsGroup.method6568(class257.archive10, UserComparator6.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
