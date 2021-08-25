import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class352 implements class357 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	public final class379 field4023;

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	class352(class380 var1) {
		this.field4023 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lme;)V"
	)
	public class352(class353 var1) {
		this(new class380(var1));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-745432089"
	)
	public int method6231(int var1) {
		return this.field4023.vmethod6605(var1);
	}
}
