import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kt")
public final class class304 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-238084679"
	)
	public static byte[] method5597(Object var0, boolean var1) {
		if (var0 == null) { // L: 8
			return null;
		} else if (var0 instanceof byte[]) { // L: 9
			byte[] var6 = (byte[])((byte[])var0); // L: 10
			if (var1) { // L: 11
				int var4 = var6.length; // L: 14
				byte[] var5 = new byte[var4]; // L: 15
				System.arraycopy(var6, 0, var5, 0, var4); // L: 16
				return var5; // L: 19
			} else {
				return var6; // L: 21
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 23
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 24
			return var2.get(); // L: 25
		} else {
			throw new IllegalArgumentException(); // L: 27
		}
	}
}
