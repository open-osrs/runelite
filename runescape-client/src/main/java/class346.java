import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class346 {
	@ObfuscatedName("x")
	static final int[] field3951;
	@ObfuscatedName("r")
	static final int[] field3953;

	static {
		field3951 = new int[2048];
		field3953 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field3951[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field3953[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnf;I)I",
		garbageValue = "-275350223"
	)
	static final int method6099(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field4113) {
			case 0:
				return 20;
			default:
				return 12;
			}
		}
	}
}
