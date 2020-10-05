import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fx")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("k")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("z")
	abstract Object get();

	@ObfuscatedName("k")
	abstract boolean isSoft();
}
