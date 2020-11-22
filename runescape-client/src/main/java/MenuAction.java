import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 856343337
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1008037325
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 967999089
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1415709673
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("z")
	@Export("action")
	String action;

	MenuAction() {
	} // L: 11733

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method2171() {
		Login.loginIndex = 24; // L: 1565
		GrandExchangeOfferNameComparator.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1566
	} // L: 1567
}
