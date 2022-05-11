import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mp")
public class class352 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1906795163
	)
	int field4205;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -154815115
	)
	int field4206;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 250970163
	)
	int field4208;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -457383541
	)
	int field4207;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4205).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4208).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4206).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4205 + var5 + "Created: " + this.field4206 + var7 + "Total used: " + this.field4208 + var6 + "Max-In-Use: " + this.field4207; // L: 22
	}
}
