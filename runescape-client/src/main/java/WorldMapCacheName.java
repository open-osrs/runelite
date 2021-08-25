import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	public static final WorldMapCacheName field2199;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	public static final WorldMapCacheName field2203;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	public static final WorldMapCacheName field2201;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	static final WorldMapCacheName field2202;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	public static final WorldMapCacheName field2200;
	@ObfuscatedName("g")
	@Export("name")
	public final String name;

	static {
		field2199 = new WorldMapCacheName("details");
		field2203 = new WorldMapCacheName("compositemap");
		field2201 = new WorldMapCacheName("compositetexture");
		field2202 = new WorldMapCacheName("area");
		field2200 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1928602665"
	)
	public static boolean method3872(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static final int method3873(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
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

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Tiles.method2005();
		if (class78.friendsChat != null) {
			class78.friendsChat.invalidateIgnoreds();
		}

	}
}
