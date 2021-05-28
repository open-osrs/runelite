import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bp")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("j")
	@Export("position")
	int position;

	AbstractSound() {
	} // L: 10
}
