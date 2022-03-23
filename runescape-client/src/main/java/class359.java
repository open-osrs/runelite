import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("mh")
public class class359 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	public static final class359 field4222;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	static final class359 field4220;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1598216455
	)
	final int field4219;

	static {
		field4222 = new class359(1); // L: 5
		field4220 = new class359(0); // L: 6
	}

	class359(int var1) {
		this.field4219 = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-1840227815"
	)
	public static byte[] method6624(byte[] var0) {
		int var1 = var0.length; // L: 35
		byte[] var2 = new byte[var1]; // L: 36
		System.arraycopy(var0, 0, var2, 0, var1); // L: 37
		return var2; // L: 38
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "1772105666"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 212
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 213
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 214
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 215
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 216
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 217
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 218
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 219
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 220 221
		}
	}
}
