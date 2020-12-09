import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class171 implements class170 {
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1627436603"
	)
	static boolean method3535(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}
}
