import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ip")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("v")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1; // L: 9
	} // L: 10

	@ObfuscatedName("c")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("v")
	@Export("isSoft")
	abstract boolean isSoft();
}
