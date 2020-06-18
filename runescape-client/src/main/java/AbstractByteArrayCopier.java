import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(I)[B",
		garbageValue = "300747627"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "([BB)V",
		garbageValue = "92"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
