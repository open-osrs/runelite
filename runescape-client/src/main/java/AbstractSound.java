import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bq")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
	@ObfuscatedName("s")
	@Export("position")
	int position;

	AbstractSound() {
	}
}
