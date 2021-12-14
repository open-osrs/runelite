import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class334 {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "[Lbw;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -745121595
	)
	int field4015;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1091400175
	)
	int field4014;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1334767653
	)
	int field4016;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2057835859
	)
	int field4017;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4015).length();
		int var3 = 10 - Integer.toString(this.field4016).length();
		int var4 = 10 - Integer.toString(this.field4014).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4015 + var5 + "Created: " + this.field4014 + var7 + "Total used: " + this.field4016 + var6 + "Max-In-Use: " + this.field4017;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method6216() {
		Client.field672 = Client.cycleCntr;
		SoundSystem.ClanChat_inClanChat = true;
	}
}
