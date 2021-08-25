import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public abstract class class229 implements class231 {
	@ObfuscatedName("so")
	@ObfuscatedGetter(
		intValue = 601316141
	)
	static int field2624;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 305376963
	)
	protected int field2625;

	@ObfuscatedSignature(
		descriptor = "(Lju;Lka;I)V"
	)
	protected class229(StudioGame var1, Language var2, int var3) {
		this.field2625 = var3;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1720011828"
	)
	public static int method4497(int var0) {
		return class360.field4033[var0 & 16383];
	}
}
