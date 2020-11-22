import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dn")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("q")
	@Export("position")
	int position;

	AbstractSound() {
	} // L: 10
}
