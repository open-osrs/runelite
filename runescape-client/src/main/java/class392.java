import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ok")
public class class392 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -11365389
	)
	public final int field4240;
	@ObfuscatedName("t")
	public Object field4241;

	public class392(int var1) {
		this.field4240 = var1;
	}

	public class392(int var1, Object var2) {
		this.field4240 = var1;
		this.field4241 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class392)) {
			return false;
		} else {
			class392 var2 = (class392)var1;
			if (var2.field4241 == null && this.field4241 != null) {
				return false;
			} else if (this.field4241 == null && var2.field4241 != null) {
				return false;
			} else {
				return this.field4240 == var2.field4240 && var2.field4241.equals(this.field4241);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}
}
