import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("im")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("q")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("o")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("q")
	@Export("isSoft")
	abstract boolean isSoft();
}
