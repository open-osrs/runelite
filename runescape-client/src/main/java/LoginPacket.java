import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("LoginPacket")
public class LoginPacket implements class261 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	public static final LoginPacket field3137;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final LoginPacket field3131;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	public static final LoginPacket field3132;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	public static final LoginPacket field3133;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	public static final LoginPacket field3134;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	static final LoginPacket field3130;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Ljv;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 696686347
	)
	@Export("id")
	public final int id;

	static {
		field3137 = new LoginPacket(14, 0); // L: 5
		field3131 = new LoginPacket(15, 4); // L: 6
		field3132 = new LoginPacket(16, -2); // L: 7
		field3133 = new LoginPacket(18, -2); // L: 8
		field3134 = new LoginPacket(19, -2); // L: 9
		field3130 = new LoginPacket(27, 0); // L: 10
		LoginPacket_indexedValues = new LoginPacket[32]; // L: 12
		LoginPacket[] var0 = class127.method2836(); // L: 15

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

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpz;I)I",
		garbageValue = "-1030532734"
	)
	static int method5195(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 187
		int var2;
		if (var1 == 0) { // L: 189
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 190
		} else if (var1 == 2) { // L: 191
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 192
		}

		return var2; // L: 193
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	static void method5192() {
		if (Client.renderSelf) { // L: 4767
			ArchiveLoader.addPlayerToScene(GrandExchangeEvents.localPlayer, false); // L: 4768
		}

	} // L: 4770
}
