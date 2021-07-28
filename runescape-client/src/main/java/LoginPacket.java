import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("LoginPacket")
public class LoginPacket implements class225 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static final LoginPacket field2791;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final LoginPacket field2796;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static final LoginPacket field2789;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static final LoginPacket field2792;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	public static final LoginPacket field2793;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final LoginPacket field2790;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lhb;"
	)
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -2039924665
	)
	@Export("id")
	public final int id;

	static {
		field2791 = new LoginPacket(14, 0);
		field2796 = new LoginPacket(15, 4);
		field2789 = new LoginPacket(16, -2);
		field2792 = new LoginPacket(18, -2);
		field2793 = new LoginPacket(19, -2);
		field2790 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = WorldMap.method6366();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			LoginPacket_indexedValues[var0[var1].id] = var0[var1];
		}

	}

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}
}
