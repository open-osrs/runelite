import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("archive0")
	static Archive archive0;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-45"
	)
	static boolean method5817(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-17"
	)
	static final void method5818(boolean var0) {
		if (var0) { // L: 2449
			Client.field636 = Login.field1005 ? class125.field1456 : class125.field1457; // L: 2450
		} else {
			LinkedHashMap var1 = Login.clientPreferences.parameters; // L: 2453
			String var3 = Login.Login_username; // L: 2455
			int var4 = var3.length(); // L: 2457
			int var5 = 0; // L: 2458

			for (int var6 = 0; var6 < var4; ++var6) { // L: 2459
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}

			Client.field636 = var1.containsKey(var5) ? class125.field1459 : class125.field1458; // L: 2462
		}

	} // L: 2464
}
