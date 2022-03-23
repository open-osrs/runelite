import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("FillMode")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	field4698(1, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	field4695(2, 2);

	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1649672729
	)
	public final int field4696;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 774013847
	)
	final int field4697;

	FillMode(int var3, int var4) {
		this.field4696 = var3; // L: 19
		this.field4697 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "15"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4697; // L: 25
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2114010966"
	)
	static void method8155(String var0) {
		class429.field4593 = var0; // L: 11828

		try {
			String var1 = UserComparator10.client.getParameter(Integer.toString(18)); // L: 11830
			String var2 = UserComparator10.client.getParameter(Integer.toString(13)); // L: 11831
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 11832
			if (var0.length() == 0) { // L: 11833
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + class160.method3236(WorldMapSprite.method4989() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 11834
			}

			class27.method416(UserComparator10.client, "document.cookie=\"" + var3 + "\""); // L: 11835
		} catch (Throwable var4) { // L: 11837
		}

	} // L: 11838
}
