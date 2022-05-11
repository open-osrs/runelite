import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bi")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("m")
	@Export("position")
	int position;

	AbstractSound() {
	} // L: 10
}
