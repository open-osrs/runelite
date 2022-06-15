import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("World")
public class World {
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1243814163
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1265990767
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("w")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("y")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("bx")
	@Export("otp")
	static String otp;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1195695549
	)
	@Export("id")
	int id;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1566282553
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 856262613
	)
	@Export("population")
	int population;
	@ObfuscatedName("r")
	@Export("host")
	String host;
	@ObfuscatedName("u")
	@Export("activity")
	String activity;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -951869585
	)
	@Export("location")
	int location;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1645334635
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2111399818"
	)
	boolean method1628() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1146943017"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2013300690"
	)
	boolean method1594() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2131603316"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1130172337"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "119"
	)
	boolean method1597() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Lfv;",
		garbageValue = "-7"
	)
	public static Clock method1601() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1666471855"
	)
	static final void method1627() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) { // L: 4850 4851 4868
			if (var0.plane == PacketWriter.Client_plane && Client.cycle <= var0.cycleEnd) { // L: 4852
				if (Client.cycle >= var0.cycleStart) { // L: 4853
					if (var0.targetIndex > 0) { // L: 4854
						NPC var1 = Client.npcs[var0.targetIndex - 1]; // L: 4855
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) { // L: 4856
							var0.setDestination(var1.x, var1.y, SceneTilePaint.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) { // L: 4858
						int var2 = -var0.targetIndex - 1; // L: 4860
						Player var3;
						if (var2 == Client.localPlayerIndex) { // L: 4861
							var3 = class101.localPlayer;
						} else {
							var3 = Client.players[var2]; // L: 4862
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, SceneTilePaint.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle); // L: 4863
						}
					}

					var0.advance(Client.field555); // L: 4865
					class356.scene.drawEntity(PacketWriter.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false); // L: 4866
				}
			} else {
				var0.remove();
			}
		}

	} // L: 4870
}
