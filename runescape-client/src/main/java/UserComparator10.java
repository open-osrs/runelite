import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ei")
	static int[] field2017;
	@ObfuscatedName("z")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;B)I",
		garbageValue = "37"
	)
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1641862640"
	)
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 21
		if (var2 == null) { // L: 22
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0; // L: 23 24
		}
	}
}
