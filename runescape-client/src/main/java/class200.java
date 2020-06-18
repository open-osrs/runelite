import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class200 {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lgi;"
	)
	static final class200 field2400;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lgi;"
	)
	static final class200 field2398;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgi;"
	)
	static final class200 field2399;

	static {
		field2400 = new class200();
		field2398 = new class200();
		field2399 = new class200();
	}

	class200() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		signature = "(IZII)V",
		garbageValue = "405257362"
	)
	public static final void method3803(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			class237.field3113 = var0;
			Messages.PcmPlayer_stereo = var1;
			UserComparator3.field2009 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
