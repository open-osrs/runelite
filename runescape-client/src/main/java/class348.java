import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class348 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "255"
	)
	static void method6505(boolean var0) {
		byte var1 = 0; // L: 1133
		if (!BufferedSource.method6889()) { // L: 1134
			var1 = 12; // L: 1135
		} else if (class127.client.method1532() || class127.client.method1476()) { // L: 1137
			var1 = 10; // L: 1138
		}

		Ignored.method6828(var1); // L: 1140
		if (var0) { // L: 1141
			Login.Login_username = ""; // L: 1142
			Login.Login_password = ""; // L: 1143
			WorldMapID.field2386 = 0; // L: 1144
			HealthBar.otp = ""; // L: 1145
		}

		Players.method2421(); // L: 1147
		class12.method157(); // L: 1148
	} // L: 1149
}
