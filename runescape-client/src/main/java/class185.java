import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public enum class185 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	field2119((byte)-1),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	field2120((byte)0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	field2123((byte)1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	field2122((byte)2);

	@ObfuscatedName("ft")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("t")
	public byte field2121;

	class185(byte var3) {
		this.field2121 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2121; // L: 19
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "964558054"
	)
	static void method3731(boolean var0) {
		byte var1 = 0; // L: 1047
		if (!AttackOption.method2356()) { // L: 1048
			var1 = 12; // L: 1049
		} else if (class295.client.method1154()) { // L: 1051
			var1 = 10; // L: 1052
		}

		PlayerType.method5521(var1); // L: 1054
		if (var0) { // L: 1055
			Login.Login_username = ""; // L: 1056
			Login.Login_password = ""; // L: 1057
			class148.field1651 = 0; // L: 1058
			BufferedSource.otp = ""; // L: 1059
		}

		HealthBar.method2311(); // L: 1061
		WorldMapID.method4805(); // L: 1062
	} // L: 1063
}
