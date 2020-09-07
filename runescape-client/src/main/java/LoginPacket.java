import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("LoginPacket")
public class LoginPacket implements class190 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2360;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static final LoginPacket field2350;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2351;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2352;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	public static final LoginPacket field2353;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static final LoginPacket field2354;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgc;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("compass")
	static Sprite compass;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -176591909
	)
	@Export("id")
	public final int id;

	static {
		field2360 = new LoginPacket(14, 0); // L: 5
		field2350 = new LoginPacket(15, 4); // L: 6
		field2351 = new LoginPacket(16, -2); // L: 7
		field2352 = new LoginPacket(18, -2); // L: 8
		field2353 = new LoginPacket(19, -2); // L: 9
		field2354 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field2353, field2352, field2360, field2354, field2351, field2350}; // L: 17
		LoginPacket[] var1 = var0; // L: 19

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 20
			LoginPacket_indexedValues[var1[var2].id] = var1[var2]; // L: 21
		}

	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1633158926"
	)
	static boolean method3707() {
		return (Client.drawPlayerNames & 4) != 0; // L: 4401
	}
}
