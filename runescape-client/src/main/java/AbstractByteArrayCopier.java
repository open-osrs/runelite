import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "70"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-362326915"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
