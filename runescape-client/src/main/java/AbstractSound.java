import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bt")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("k")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
