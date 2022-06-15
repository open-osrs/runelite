import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;I)I",
		garbageValue = "-582515893"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldt;",
		garbageValue = "6"
	)
	static class119[] method2599() {
		return new class119[]{class119.field1497, class119.field1504, class119.field1505, class119.field1501, class119.field1492, class119.field1493, class119.field1494, class119.field1495, class119.field1496, class119.field1489, class119.field1498, class119.field1499, class119.field1500, class119.field1502, class119.field1488, class119.field1503, class119.field1491}; // L: 74
	}
}
