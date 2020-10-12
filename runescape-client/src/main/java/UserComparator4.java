import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("f")
	static String[] field2005;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lev;"
	)
	static UrlRequester urlRequester;
	@ObfuscatedName("z")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;I)I",
		garbageValue = "1508747808"
	)
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2); // L: 18
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}
}
