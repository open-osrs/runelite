import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gm")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("o")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("o")
	@Export("isSoft")
	abstract boolean isSoft();
}
