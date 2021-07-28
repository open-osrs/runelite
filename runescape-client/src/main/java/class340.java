import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public abstract class class340 extends class216 implements class391 {
	@ObfuscatedSignature(
		descriptor = "(Ljr;Lkq;I)V"
	)
	protected class340(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Lmd;",
		garbageValue = "-232657382"
	)
	protected abstract class342 vmethod6511(int var1);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1220313000"
	)
	public int method6061() {
		return super.field2547;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "0"
	)
	public Object vmethod6964(int var1) {
		class342 var2 = this.vmethod6511(var1);
		return var2 != null && var2.method6080() ? var2.method6087() : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lnv;I)Lok;",
		garbageValue = "125948709"
	)
	public class392 method6074(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class342 var3 = this.vmethod6511(var2);
		class392 var4 = new class392(var2);
		Class var5 = var3.field3940.field4160;
		if (var5 == Integer.class) {
			var4.field4241 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4241 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4241 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class387.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class387 var6 = (class387)var5.newInstance();
				var6.method6935(var1);
				var4.field4241 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
