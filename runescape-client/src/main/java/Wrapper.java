import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ie")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
	@ObfuscatedName("b")
	@Export("size")
	final int size;

	Wrapper(int var1) {
		this.size = var1;
	}

	@ObfuscatedName("c")
	@Export("get")
	abstract Object get();

	@ObfuscatedName("b")
	@Export("isSoft")
	abstract boolean isSoft();
}
