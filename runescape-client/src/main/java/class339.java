import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public abstract class class339 extends class192 implements class388 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Lmd;",
		garbageValue = "-883591339"
	)
	protected abstract class341 vmethod6425(int var1);

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "324704805"
	)
	public int method5994() {
		return super.field2198; // L: 17
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "14"
	)
	public Object vmethod6841(int var1) {
		class341 var2 = this.vmethod6425(var1); // L: 21
		return var2 != null && var2.method6007() ? var2.method6010() : null; // L: 22 23
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)Lnl;",
		garbageValue = "-821097421"
	)
	public class389 method5996(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 27
		class341 var3 = this.vmethod6425(var2); // L: 28
		class389 var4 = new class389(var2); // L: 29
		Class var5 = var3.field3928.field4131; // L: 30
		if (var5 == Integer.class) { // L: 31
			var4.field4216 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4216 = var1.readLong(); // L: 32
		} else if (var5 == String.class) { // L: 33
			var4.field4216 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class384.class.isAssignableFrom(var5)) { // L: 34
				throw new IllegalStateException(); // L: 43
			}

			try {
				class384 var6 = (class384)var5.newInstance(); // L: 36
				var6.method6821(var1); // L: 37
				var4.field4216 = var6; // L: 38
			} catch (InstantiationException var7) { // L: 40
			} catch (IllegalAccessException var8) { // L: 41
			}
		}

		return var4; // L: 44
	}
}
