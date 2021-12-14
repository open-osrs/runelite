import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pz")
public class class426 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1177110261
	)
	public final int field4539;
	@ObfuscatedName("b")
	public Object field4537;

	public class426(int var1) {
		this.field4539 = var1;
	}

	public class426(int var1, Object var2) {
		this.field4539 = var1;
		this.field4537 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class426)) {
			return false;
		} else {
			class426 var2 = (class426)var1;
			if (var2.field4537 == null && this.field4537 != null) {
				return false;
			} else if (this.field4537 == null && var2.field4537 != null) {
				return false;
			} else {
				return this.field4539 == var2.field4539 && var2.field4537.equals(this.field4537);
			}
		}
	}
}
