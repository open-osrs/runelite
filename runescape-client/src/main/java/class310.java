import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class310 {
	@ObfuscatedName("dn")
	@Export("mouseCam")
	static boolean mouseCam;

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1349204309"
	)
	static boolean method5655(int var0) {
		for (int var1 = 0; var1 < Client.field450; ++var1) {
			if (Client.field430[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
