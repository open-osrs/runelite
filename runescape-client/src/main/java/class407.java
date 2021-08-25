import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class407 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -9563353
	)
	public final int field4339;
	@ObfuscatedName("c")
	public Object field4340;

	public class407(int var1) {
		this.field4339 = var1;
	}

	public class407(int var1, Object var2) {
		this.field4339 = var1;
		this.field4340 = var2;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class407)) {
			return false;
		} else {
			class407 var2 = (class407)var1;
			if (var2.field4340 == null && this.field4340 != null) {
				return false;
			} else if (this.field4340 == null && var2.field4340 != null) {
				return false;
			} else {
				return this.field4339 == var2.field4339 && var2.field4340.equals(this.field4340);
			}
		}
	}

	public int hashCode() {
		return super.hashCode();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lek;",
		garbageValue = "21"
	)
	public static VarcInt method7122(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method2854(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
