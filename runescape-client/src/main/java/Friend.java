import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("s")
	boolean field3842;
	@ObfuscatedName("t")
	boolean field3841;

	Friend() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Llb;B)I",
		garbageValue = "-121"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field3842 && !var1.field3842) {
			return -1;
		} else if (!this.field3842 && var1.field3842) {
			return 1;
		} else if (this.field3841 && !var1.field3841) {
			return -1;
		} else if (!this.field3841 && var1.field3841) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Llm;I)I",
		garbageValue = "2074675333"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}
}
