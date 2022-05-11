import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
public abstract class class393 extends class250 implements class446 {
	@ObfuscatedName("dt")
	static boolean field4428;

	@ObfuscatedSignature(
		descriptor = "(Lke;Llq;I)V"
	)
	protected class393(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3); // L: 15
	} // L: 16

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lou;",
		garbageValue = "-318323569"
	)
	protected abstract class395 vmethod7381(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "970560687"
	)
	public int method6909() {
		return super.field2926; // L: 19
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-322202585"
	)
	public Object vmethod7814(int var1) {
		class395 var2 = this.vmethod7381(var1); // L: 24
		return var2 != null && var2.method6929() ? var2.method6930() : null; // L: 25 26
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)Lqx;",
		garbageValue = "1616655669"
	)
	public class447 method6920(Buffer var1) {
		int var2 = var1.readUnsignedShort(); // L: 30
		class395 var3 = this.vmethod7381(var2); // L: 31
		class447 var4 = new class447(var2); // L: 32
		Class var5 = var3.field4430.field4667; // L: 33
		if (var5 == Integer.class) { // L: 34
			var4.field4742 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4742 = var1.readLong(); // L: 35
		} else if (var5 == String.class) { // L: 36
			var4.field4742 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class442.class.isAssignableFrom(var5)) { // L: 37
				throw new IllegalStateException(); // L: 46
			}

			try {
				class442 var6 = (class442)var5.newInstance(); // L: 39
				var6.method7783(var1); // L: 40
				var4.field4742 = var6; // L: 41
			} catch (InstantiationException var7) { // L: 43
			} catch (IllegalAccessException var8) { // L: 44
			}
		}

		return var4; // L: 47
	}
}
