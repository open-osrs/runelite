import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	} // L: 4

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "814382249"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-83"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2013103742"
	)
	public static boolean method3331(int var0) {
		return var0 >= WorldMapDecorationType.field3553.id && var0 <= WorldMapDecorationType.field3552.id; // L: 43
	}
}
