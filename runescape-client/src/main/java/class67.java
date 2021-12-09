import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
public class class67 {
	@ObfuscatedName("c")
	static final BigInteger field856;
	@ObfuscatedName("b")
	static final BigInteger field857;

	static {
		field856 = new BigInteger("10001", 16); // L: 6
		field857 = new BigInteger("959194ea8a966b960e862427e497e246718ecc7e76f242845673d52b62df19f52fa6fb93c8d9c5129b95747f8ca61fb059fa44297c08c6f5cc6cca99e8d39fc8f0faa58e58d1ca99e861439d01158c14880260b09ace07d25862f6d14e2db785c3016567101e927e4b2513e0b8a0f275ccf60c6a689af387a64b2b82a313d8dd", 16); // L: 7
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1654088160"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = ""; // L: 1037
		Login.Login_response2 = "Enter your username/email & password."; // L: 1038
		Login.Login_response3 = ""; // L: 1039
		PlayerType.method5521(2); // L: 1040
		if (var0) { // L: 1041
			Login.Login_password = "";
		}

		HealthBar.method2311(); // L: 1042
		WorldMapID.method4805(); // L: 1043
	} // L: 1044

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-67"
	)
	static int method1962(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field814 - 7.0D) * 256.0D); // L: 3631
	}
}
