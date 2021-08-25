import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public abstract class class353 extends class229 implements class406 {
	@ObfuscatedSignature(
		descriptor = "(Lju;Lka;I)V"
	)
	protected class353(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmi;",
		garbageValue = "0"
	)
	protected abstract class355 vmethod6676(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-111"
	)
	public int method6235() {
		return super.field2625;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-469045059"
	)
	public Object vmethod7113(int var1) {
		class355 var2 = this.vmethod6676(var1);
		return var2 != null && var2.method6260() ? var2.method6258() : null;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lot;I)Log;",
		garbageValue = "-1585853671"
	)
	public class407 method6250(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class355 var3 = this.vmethod6676(var2);
		class407 var4 = new class407(var2);
		Class var5 = var3.field4025.field4246;
		if (var5 == Integer.class) {
			var4.field4340 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4340 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4340 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class402.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class402 var6 = (class402)var5.newInstance();
				var6.method7078(var1);
				var4.field4340 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
