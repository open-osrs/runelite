import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oj")
public class class408 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1905362917
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1474390477
	)
	public final int field4354;
	@ObfuscatedName("q")
	public Object field4353;

	public class408(int var1) {
		this.field4354 = var1;
	}

	public class408(int var1, Object var2) {
		this.field4354 = var1;
		this.field4353 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class408)) {
			return false;
		} else {
			class408 var2 = (class408)var1;
			if (var2.field4353 == null && this.field4353 != null) {
				return false;
			} else if (this.field4353 == null && var2.field4353 != null) {
				return false;
			} else {
				return this.field4354 == var2.field4354 && var2.field4353.equals(this.field4353);
			}
		}
	}
}
