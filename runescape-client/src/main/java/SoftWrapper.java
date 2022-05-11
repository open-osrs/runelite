import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ij")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("o")
	@Export("ref")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2); // L: 10
		this.ref = new SoftReference(var1); // L: 11
	} // L: 12

	@ObfuscatedName("o")
	@Export("get")
	Object get() {
		return this.ref.get(); // L: 15
	}

	@ObfuscatedName("q")
	@Export("isSoft")
	boolean isSoft() {
		return true; // L: 19
	}
}
