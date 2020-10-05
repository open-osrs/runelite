import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public class Friend extends Buddy {
	@ObfuscatedName("z")
	boolean field3651;
	@ObfuscatedName("k")
	boolean field3652;

	Friend() {
	} // L: 9

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lkc;I)I",
		garbageValue = "1550059745"
	)
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field3651 && !var1.field3651) { // L: 16
			return -1;
		} else if (!this.field3651 && var1.field3651) { // L: 17
			return 1;
		} else if (this.field3652 && !var1.field3652) { // L: 18
			return -1;
		} else if (!this.field3652 && var1.field3652) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljc;I)I",
		garbageValue = "-243007320"
	)
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}
}
