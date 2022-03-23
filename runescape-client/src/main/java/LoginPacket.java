import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("LoginPacket")
public class LoginPacket implements class261 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	public static final LoginPacket field3135;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static final LoginPacket field3132;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	public static final LoginPacket field3133;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	public static final LoginPacket field3134;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	public static final LoginPacket field3137;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	static final LoginPacket field3136;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Ljx;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -441279243
	)
	@Export("id")
	public final int id;

	static {
		field3135 = new LoginPacket(14, 0); // L: 5
		field3132 = new LoginPacket(15, 4); // L: 6
		field3133 = new LoginPacket(16, -2); // L: 7
		field3134 = new LoginPacket(18, -2); // L: 8
		field3137 = new LoginPacket(19, -2); // L: 9
		field3136 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = VertexNormal.method4495(); // L: 15

		for (int var1 = 0; var1 < var0.length; ++var1) { // L: 16
			LoginPacket_indexedValues[var0[var1].id] = var0[var1]; // L: 17
		}

	} // L: 19

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1; // L: 26
	} // L: 27
}
