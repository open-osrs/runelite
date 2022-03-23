import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class351 {
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = 657587037
	)
	static int field4157;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 625961515
	)
	int field4162;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -703933987
	)
	int field4156;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1716197001
	)
	int field4158;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1542841635
	)
	int field4159;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4162).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4158).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4156).length();
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4162 + var5 + "Created: " + this.field4156 + var7 + "Total used: " + this.field4158 + var6 + "Max-In-Use: " + this.field4159; // L: 22
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1708289498"
	)
	static String method6579(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}
}
