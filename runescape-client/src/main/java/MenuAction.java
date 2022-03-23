import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1395213587
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1235070557
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1780359583
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -538792745
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("l")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 11995

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CS)C",
		garbageValue = "1843"
	)
	static char method1877(char var0) {
		if (var0 == 198) { // L: 119
			return 'E';
		} else if (var0 == 230) { // L: 120
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 121
		} else if (var0 == 338) { // L: 122
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 123 124
		}
	}
}
