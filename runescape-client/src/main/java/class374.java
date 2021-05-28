import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
public class class374 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public static final class374 field4131;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public static final class374 field4128;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	public static final class374 field4129;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1536498237
	)
	final int field4130;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 618578037
	)
	public final int field4135;
	@ObfuscatedName("j")
	public final Class field4127;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	final class370 field4133;

	static {
		field4131 = new class374(2, 0, Integer.class, new class371()); // L: 10
		field4128 = new class374(0, 1, Long.class, new class373()); // L: 23
		field4129 = new class374(1, 2, String.class, new class375()); // L: 36
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lnv;)V"
	)
	class374(int var1, int var2, Class var3, class370 var4) {
		this.field4130 = var1; // L: 59
		this.field4135 = var2; // L: 60
		this.field4127 = var3; // L: 61
		this.field4133 = var4; // L: 62
	} // L: 63

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4135; // L: 90
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Ljava/lang/Object;",
		garbageValue = "-2104172776"
	)
	public Object method6480(Buffer var1) {
		return this.field4133.vmethod6500(var1); // L: 94
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lax;B)Lai;",
		garbageValue = "-46"
	)
	public static class31 method6477(class34 var0) {
		switch(var0.field252) { // L: 9
		case 0:
			return new class28(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnp;",
		garbageValue = "-72158502"
	)
	public static class374[] method6476() {
		return new class374[]{field4131, field4128, field4129}; // L: 55
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;B)Lnp;",
		garbageValue = "-16"
	)
	public static class374 method6479(Class var0) {
		class374[] var1 = method6476(); // L: 67

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 68
			class374 var3 = var1[var2]; // L: 69
			if (var3.field4127 == var0) {
				return var3; // L: 71
			}
		}

		return null; // L: 75
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnd;I)V",
		garbageValue = "-926534106"
	)
	public static void method6475(Object var0, Buffer var1) {
		class370 var2 = method6478(var0.getClass()); // L: 79
		var2.vmethod6493(var0, var1); // L: 80
	} // L: 81

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;S)Lnv;",
		garbageValue = "-2594"
	)
	static class370 method6478(Class var0) {
		class374 var1 = method6479(var0); // L: 84
		if (var1 == null) {
			throw new IllegalArgumentException(); // L: 85
		} else {
			return var1.field4133; // L: 86
		}
	}
}
