import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -37753137
	)
	@Export("cameraY")
	static int cameraY;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1918796592"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1795617978"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
