import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = 650908415
	)
	static int field1403;
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "-1160366364"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 14
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 22
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Lke;II)Lke;",
		garbageValue = "-1507017848"
	)
	@Export("findEnumerated")
	public static Enumerated findEnumerated(Enumerated[] var0, int var1) {
		Enumerated[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			Enumerated var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}
}
