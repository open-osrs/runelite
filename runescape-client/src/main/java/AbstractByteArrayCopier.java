import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("r")
	static int[] field3115;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -1508140937
	)
	@Export("menuX")
	static int menuX;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1778746914"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "973811650"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "-1461595719"
	)
	public static void method4756(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "583032704"
	)
	static final int method4754(int var0, int var1) {
		int var2 = var0 + var1 * 57; // L: 485
		var2 ^= var2 << 13; // L: 486
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 487
		return var3 >> 19 & 255; // L: 488
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-331498963"
	)
	static final void method4738() {
		Object var10000 = null; // L: 128
		String var0 = "Your friend list is full. Max of 200 for free users, and 400 for members";
		WorldMapScaleHandler.addGameMessage(30, "", var0); // L: 130
	} // L: 132
}
