import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fq")
public class DirectWrapper extends Wrapper {
	@ObfuscatedName("z")
	Object obj;

	DirectWrapper(Object var1, int var2) {
		super(var2); // L: 7
		this.obj = var1; // L: 8
	} // L: 9

	@ObfuscatedName("z")
	Object get() {
		return this.obj; // L: 12
	}

	@ObfuscatedName("k")
	boolean isSoft() {
		return false; // L: 16
	}
}
