import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1005138925
	)
	public int field3680;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("t")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lki;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3680 = (int)(class298.currentTimeMillis() / 1000L); // L: 106
		this.username = var1; // L: 107
		this.world = (short)var2; // L: 108
	} // L: 109

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-1"
	)
	public static boolean method5290(int var0) {
		return var0 >= WorldMapDecorationType.field2761.id && var0 <= WorldMapDecorationType.field2747.id || var0 == WorldMapDecorationType.field2748.id; // L: 42
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1404693123"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z'; // L: 155
	}
}
