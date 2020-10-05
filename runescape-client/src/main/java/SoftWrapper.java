import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fj")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("z")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2); // L: 10
		this.ref = new SoftReference(var1); // L: 11
	} // L: 12

	@ObfuscatedName("z")
	Object get() {
		return this.ref.get(); // L: 15
	}

	@ObfuscatedName("k")
	boolean isSoft() {
		return true; // L: 19
	}
}
