import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bc")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("e")
	@Export("position")
	int position;

	AbstractSound() {
	} // L: 10
}
