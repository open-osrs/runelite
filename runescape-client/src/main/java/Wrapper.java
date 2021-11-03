import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("in")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("w")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("i")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("w")
	@Export("isSoft")
	abstract boolean isSoft();
}
