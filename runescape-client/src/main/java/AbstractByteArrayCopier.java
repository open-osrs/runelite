import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive13")
	static Archive archive13;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-87"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2067022612"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
