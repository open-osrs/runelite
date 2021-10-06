import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public abstract class class354 extends class229 implements class407 {
	@ObfuscatedSignature(
		descriptor = "(Ljz;Lkn;I)V"
	)
	protected class354(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IB)Lmp;",
		garbageValue = "110"
	)
	protected abstract class356 vmethod6749(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-112"
	)
	public int method6296() {
		return super.field2645;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-1930407702"
	)
	public Object vmethod7174(int var1) {
		class356 var2 = this.vmethod6749(var1);
		return var2 != null && var2.method6320() ? var2.method6317() : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lot;B)Loj;",
		garbageValue = "21"
	)
	public class408 method6309(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class356 var3 = this.vmethod6749(var2);
		class408 var4 = new class408(var2);
		Class var5 = var3.field4044.field4265;
		if (var5 == Integer.class) {
			var4.field4353 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4353 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4353 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class403.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class403 var6 = (class403)var5.newInstance();
				var6.method7144(var1);
				var4.field4353 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
