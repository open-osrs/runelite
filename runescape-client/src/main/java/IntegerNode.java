import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gc")
@Implements("IntegerNode")
public class IntegerNode extends Node {
	@ObfuscatedName("m")
	@Export("integer")
	public int integer;

	public IntegerNode(int var1) {
		this.integer = var1;
	}
}
