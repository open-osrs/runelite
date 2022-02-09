import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class339 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("pcmPlayerProvider")
	public static class47 pcmPlayerProvider;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 942318439
	)
	int field4066;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 128044911
	)
	int field4065;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 863052549
	)
	int field4063;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -409215037
	)
	int field4064;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4066).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4063).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4065).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4066 + var5 + "Created: " + this.field4065 + var7 + "Total used: " + this.field4063 + var6 + "Max-In-Use: " + this.field4064; // L: 22
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "718600027"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4134
	}
}
