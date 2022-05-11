import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("b")
	static int[] field866;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 912945925
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1803529141
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1012533909
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1732693837
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("a")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 12749

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "32"
	)
	public static boolean method1880(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0; // L: 9
	}
}
