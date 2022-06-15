import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public abstract class class392 extends class249 implements class449 {
	@ObfuscatedSignature(
		descriptor = "(Lkx;Llb;I)V"
	)
	protected class392(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Loj;",
		garbageValue = "-231569171"
	)
	protected abstract class394 vmethod7521(int var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1559402072"
	)
	public int method7058() {
		return super.field2884; // L: 19
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "1786905463"
	)
	public Object vmethod8027(int var1) {
		class394 var2 = this.vmethod7521(var1); // L: 24
		return var2 != null && var2.method7074() ? var2.method7082() : null; // L: 25 26
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Lqr;",
		garbageValue = "-145331804"
	)
	public class450 method7060(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class394 var3 = this.vmethod7521(var2); // L: 31
		class450 var4 = new class450(var2); // L: 32
		Class var5 = var3.field4428.field4659; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4766 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4766 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4766 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class445.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class445 var6 = (class445)var5.newInstance(); // L: 39
				var6.method8005(var1); // L: 40
				var4.field4766 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
