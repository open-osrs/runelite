import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public abstract class class371 extends class242 implements class425 {
	@ObfuscatedSignature(
		descriptor = "(Lko;Llf;I)V"
	)
	protected class371(StudioGame var1, Language var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lnp;",
		garbageValue = "1453466959"
	)
	protected abstract class373 vmethod7209(int var1);

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-70"
	)
	public int method6759() {
		return super.field2787;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "-78"
	)
	public Object vmethod7625(int var1) {
		class373 var2 = this.vmethod7209(var1);
		return var2 != null && var2.method6780() ? var2.method6781() : null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)Lpz;",
		garbageValue = "-2120093804"
	)
	public class426 method6761(Buffer var1) {
		int var2 = var1.readUnsignedShort();
		class373 var3 = this.vmethod7209(var2);
		class426 var4 = new class426(var2);
		Class var5 = var3.field4226.field4446;
		if (var5 == Integer.class) {
			var4.field4537 = var1.readInt();
		} else if (var5 == Long.class) {
			var4.field4537 = var1.readLong();
		} else if (var5 == String.class) {
			var4.field4537 = var1.readStringCp1252NullCircumfixed();
		} else {
			if (!class421.class.isAssignableFrom(var5)) {
				throw new IllegalStateException();
			}

			try {
				class421 var6 = (class421)var5.newInstance();
				var6.method7596(var1);
				var4.field4537 = var6;
			} catch (InstantiationException var7) {
			} catch (IllegalAccessException var8) {
			}
		}

		return var4;
	}
}
