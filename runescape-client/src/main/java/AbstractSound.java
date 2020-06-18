import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dy")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("g")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
