import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
public class class353 implements class358 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	public final class380 field4042;

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	class353(class381 var1) {
		this.field4042 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lmu;)V"
	)
	public class353(class354 var1) {
		this(new class381(var1));
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1690813919"
	)
	public int method6291(int var1) {
		return this.field4042.vmethod6668(var1);
	}
}
