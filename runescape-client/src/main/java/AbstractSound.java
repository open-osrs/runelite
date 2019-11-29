import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("dl")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("p")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
