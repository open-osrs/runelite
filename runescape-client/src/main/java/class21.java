import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("b")
public class class21 {
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("fa")
	static String field122;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1937379027
	)
	final int field117;
	@ObfuscatedName("v")
	final String field116;

	class21(String var1) {
		this.field117 = 400; // L: 32
		this.field116 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field117 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field117 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field116 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	public int method258() {
		return this.field117; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1470500279"
	)
	public String method262() {
		return this.field116; // L: 41
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "2085250923"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 940
			var1 /= 2;
		}

		if (var2 > 192) { // L: 941
			var1 /= 2;
		}

		if (var2 > 217) { // L: 942
			var1 /= 2;
		}

		if (var2 > 243) { // L: 943
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 944
		return var3; // L: 945
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbi;ZI)I",
		garbageValue = "1464198346"
	)
	static int method264(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3831
			Client.logoutTimer = 250; // L: 3832
			return 1; // L: 3833
		} else if (var0 != 5631 && var0 != 5633) { // L: 3835
			if (var0 == 5632) { // L: 3839
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 26; // L: 3840
				return 1; // L: 3841
			} else {
				return 2; // L: 3843
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2; // L: 3836
			return 1; // L: 3837
		}
	}
}
