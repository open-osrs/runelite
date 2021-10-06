import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class322 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 65308803
	)
	int field3878;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1163920539
	)
	int field3879;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1995398165
	)
	int field3880;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1378321945
	)
	int field3881;

	public String toString() {
		int var2 = 10 - Integer.toString(this.field3878).length();
		int var3 = 10 - Integer.toString(this.field3880).length();
		int var4 = 10 - Integer.toString(this.field3879).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field3878 + var5 + "Created: " + this.field3879 + var7 + "Total used: " + this.field3880 + var6 + "Max-In-Use: " + this.field3881;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Ljt;IB)V",
		garbageValue = "-7"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3115 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3190 == null) {
				var0.field3190 = new int[var0.field3115.length];
			}

			var0.field3190[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static void method5894(int var0) {
		Client.oculusOrbState = var0;
	}
}
