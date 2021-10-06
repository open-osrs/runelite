import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 441486123
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1041645519
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1414459793
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1513793095
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("m")
	@Export("action")
	String action;

	MenuAction() {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-68078688"
	)
	public static int method1885(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}
}
