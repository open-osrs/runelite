import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("n")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lky;Lky;I)I",
		garbageValue = "899318279"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "77103650"
	)
	static String method3580(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1892343700"
	)
	static void method3573() {
		Login.worldSelectOpen = false; // L: 1577
		Login.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1578
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1579
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18); // L: 1580
	} // L: 1581
}
