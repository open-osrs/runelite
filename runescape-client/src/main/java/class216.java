import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public abstract class class216 implements class218 {
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -1590779813
	)
	static int field2545;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 2133191631
	)
	static int field2548;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 2027952581
	)
	protected int field2547;

	@ObfuscatedSignature(
		descriptor = "(Ljr;Lkq;I)V"
	)
	protected class216(StudioGame var1, Language var2, int var3) {
		this.field2547 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "100"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
