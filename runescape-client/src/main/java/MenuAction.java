import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cq")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -498360171
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 853980149
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1397689415
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1633768997
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("t")
	@Export("action")
	String action;

	MenuAction() {
	}
}
