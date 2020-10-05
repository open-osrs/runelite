import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gv")
@Implements("IntegerNode")
public class IntegerNode extends Node {
	@ObfuscatedName("z")
	public int integer;

	public IntegerNode(int var1) {
		this.integer = var1; // L: 7
	} // L: 8
}
