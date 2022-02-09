import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public final class class4 {
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 402577755
	)
	static int field17;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -868657001
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "[Lpt;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)I",
		garbageValue = "-1462342644"
	)
	static int method15(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 181
		int var2;
		if (var1 == 0) { // L: 183
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 184
		} else if (var1 == 2) { // L: 185
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 186
		}

		return var2; // L: 187
	}
}
