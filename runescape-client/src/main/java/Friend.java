import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("l")
	boolean field3949;
	@ObfuscatedName("q")
	boolean field3948;

	Friend() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)I",
		garbageValue = "2007974516"
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
		} else if (this.field3949 && !var1.field3949) {
			return -1;
		} else if (!this.field3949 && var1.field3949) {
			return 1;
		} else if (this.field3948 && !var1.field3948) {
			return -1;
		} else if (!this.field3948 && var1.field3948) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llu;B)I",
		garbageValue = "-81"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "67"
	)
	public static int method6003(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1839296655"
	)
	static int method6004(int var0) {
		return (int)Math.pow(2.0D, (double)(7.0F + (float)var0 / 256.0F));
	}
}
