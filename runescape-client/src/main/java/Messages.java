import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("s")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -237431523
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("clock")
	protected static Clock clock;
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "460801171"
	)
	static int method2072(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljh;",
		garbageValue = "-120"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.PlayerType_ironman, PlayerType.PlayerType_jagexModerator, PlayerType.field3540, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_playerModerator};
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lbs;B)V",
		garbageValue = "3"
	)
	static final void method2094(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = WorldMapIcon_1.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = WorldMapIcon_1.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = WorldMapIcon_1.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = WorldMapIcon_1.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = WorldMapIcon_1.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class78.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1009 = var4;
		var0.field1012 = var5;
	}
}
