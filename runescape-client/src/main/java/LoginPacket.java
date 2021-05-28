import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("LoginPacket")
public class LoginPacket implements class223 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public static final LoginPacket field2806;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	static final LoginPacket field2800;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public static final LoginPacket field2802;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public static final LoginPacket field2799;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public static final LoginPacket field2803;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	static final LoginPacket field2804;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -2104818809
	)
	@Export("id")
	public final int id;

	static {
		field2806 = new LoginPacket(14, 0); // L: 5
		field2800 = new LoginPacket(15, 4); // L: 6
		field2802 = new LoginPacket(16, -2); // L: 7
		field2799 = new LoginPacket(18, -2); // L: 8
		field2803 = new LoginPacket(19, -2); // L: 9
		field2804 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = new LoginPacket[]{field2804, field2806, field2803, field2799, field2800, field2802}; // L: 17
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

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1030853503"
	)
	static final void method4373(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 10926
		ObjectComposition.clientPreferences.areaSoundEffectsVolume = var0; // L: 10927
		TileItem.savePreferences(); // L: 10928
	} // L: 10929
}
