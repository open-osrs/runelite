import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("n")
	boolean field3663;
	@ObfuscatedName("v")
	boolean field3661;

	Friend() {
	} // L: 9

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)I",
		garbageValue = "-1403484495"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field3663 && !var1.field3663) { // L: 16
			return -1;
		} else if (!this.field3663 && var1.field3663) { // L: 17
			return 1;
		} else if (this.field3661 && !var1.field3661) { // L: 18
			return -1;
		} else if (!this.field3661 && var1.field3661) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)I",
		garbageValue = "642739557"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}
}
