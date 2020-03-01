import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ej")
@Implements("SoftWrapper")
public class SoftWrapper extends Wrapper {
	@ObfuscatedName("c")
	@Export("ref")
	SoftReference ref;

	SoftWrapper(Object var1, int var2) {
		super(var2);
		this.ref = new SoftReference(var1);
	}

	@ObfuscatedName("c")
	@Export("get")
	Object get() {
		return this.ref.get();
	}

	@ObfuscatedName("t")
	@Export("isSoft")
	boolean isSoft() {
		return true;
	}
}
