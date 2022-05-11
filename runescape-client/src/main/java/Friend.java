import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("o")
	boolean field4311;
	@ObfuscatedName("q")
	boolean field4312;

	Friend() {
	} // L: 9

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "1190428650"
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
		} else if (this.field4311 && !var1.field4311) { // L: 16
			return -1;
		} else if (!this.field4311 && var1.field4311) { // L: 17
			return 1;
		} else if (this.field4312 && !var1.field4312) { // L: 18
			return -1;
		} else if (!this.field4312 && var1.field4312) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)I",
		garbageValue = "434999779"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}
}
