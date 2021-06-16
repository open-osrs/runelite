import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("LoginPacket")
public class LoginPacket implements class224 {
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	public static class286 field2800;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final LoginPacket field2806;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	static final LoginPacket field2801;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final LoginPacket field2802;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final LoginPacket field2803;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public static final LoginPacket field2804;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	static final LoginPacket field2809;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "[Lhl;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 159099217
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1348026381
	)
	@Export("id")
	public final int id;

	static {
		field2806 = new LoginPacket(14, 0); // L: 5
		field2801 = new LoginPacket(15, 4); // L: 6
		field2802 = new LoginPacket(16, -2); // L: 7
		field2803 = new LoginPacket(18, -2); // L: 8
		field2804 = new LoginPacket(19, -2); // L: 9
		field2809 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class23.method318();

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

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(S)[Ljo;",
		garbageValue = "3316"
	)
	public static class269[] method4510() {
		return new class269[]{class269.field3532, class269.field3533, class269.field3535, class269.field3534}; // L: 15
	}
}
