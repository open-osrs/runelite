import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("b")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "895258324"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "894306984"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
