import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("LoginPacket")
public class LoginPacket implements class253 {
	@ObfuscatedName("td")
	@ObfuscatedGetter(
		intValue = -715768969
	)
	static int field3062;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	public static final LoginPacket field3064;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	static final LoginPacket field3071;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	public static final LoginPacket field3067;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	public static final LoginPacket field3065;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	public static final LoginPacket field3066;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	static final LoginPacket field3063;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	static final LoginPacket field3068;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "[Lis;"
	)
	static final LoginPacket[] field3070;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -997966029
	)
	@Export("id")
	public final int id;

	static {
		field3064 = new LoginPacket(14, 0); // L: 5
		field3071 = new LoginPacket(15, 4); // L: 6
		field3067 = new LoginPacket(16, -2); // L: 7
		field3065 = new LoginPacket(18, -2); // L: 8
		field3066 = new LoginPacket(19, -2); // L: 9
		field3063 = new LoginPacket(26, 8); // L: 10
		field3068 = new LoginPacket(27, 0); // L: 11
		field3070 = new LoginPacket[32]; // L: 13
		LoginPacket[] var0 = new LoginPacket[]{field3063, field3066, field3064, field3071, field3068, field3065, field3067}; // L: 18
		LoginPacket[] var1 = var0; // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			field3070[var1[var2].id] = var1[var2]; // L: 22
		}

	} // L: 24

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 27
	} // L: 28
}
