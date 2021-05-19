import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("c")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var1 + var2 * 64]; // L: 24
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Lnz;",
		garbageValue = "2142784840"
	)
	public static class374 method3581(int var0) {
		int var1 = class372.field4132[var0]; // L: 11
		if (var1 == 1) { // L: 12
			return class374.field4141; // L: 13
		} else if (var1 == 2) { // L: 15
			return class374.field4136; // L: 16
		} else {
			return var1 == 3 ? class374.field4135 : null; // L: 18 19 21
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Z",
		garbageValue = "418250981"
	)
	static final boolean method3580(Widget var0) {
		int var1 = var0.contentType; // L: 11352
		if (var1 == 205) { // L: 11353
			Client.logoutTimer = 250; // L: 11354
			return true; // L: 11355
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 11357
				var2 = (var1 - 300) / 2; // L: 11358
				var3 = var1 & 1; // L: 11359
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 11360
			}

			if (var1 >= 314 && var1 <= 323) { // L: 11362
				var2 = (var1 - 314) / 2; // L: 11363
				var3 = var1 & 1; // L: 11364
				Client.playerAppearance.method4617(var2, var3 == 1); // L: 11365
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false); // L: 11367
			}

			if (var1 == 325) { // L: 11368
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) { // L: 11369
				PacketBufferNode var4 = HealthBarDefinition.getPacketBufferNode(ClientPacket.field2629, Client.packetWriter.isaacCipher); // L: 11371
				Client.playerAppearance.write(var4.packetBuffer); // L: 11372
				Client.packetWriter.addNode(var4); // L: 11373
				return true; // L: 11374
			} else {
				return false; // L: 11376
			}
		}
	}
}
