import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)[B",
		garbageValue = "147"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BS)V",
		garbageValue = "2048"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
