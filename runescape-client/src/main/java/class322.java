import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lx")
public class class322 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -902702553
	)
	int field3872;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1387523435
	)
	int field3874;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1669438009
	)
	int field3870;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1408638013
	)
	int field3871;

	public String toString() {
		int var2 = 10 - Integer.toString(this.field3872).length(); // L: 15
		int var3 = 10 - Integer.toString(this.field3870).length(); // L: 16
		int var4 = 10 - Integer.toString(this.field3874).length(); // L: 17
		String var5 = "          ".substring(10 - var2); // L: 18
		String var6 = "          ".substring(10 - var3); // L: 19
		String var7 = "          ".substring(10 - var4); // L: 20
		return "    Size: " + this.field3872 + var5 + "Created: " + this.field3874 + var7 + "Total used: " + this.field3870 + var6 + "Max-In-Use: " + this.field3871; // L: 21
	}
}
