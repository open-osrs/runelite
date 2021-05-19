import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Llq;Llq;I)I",
		garbageValue = "2091372703"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "30955"
	)
	static final void method2492() {
		if (Client.logoutTimer > 0) { // L: 3099
			FileSystem.logOut(); // L: 3100
		} else {
			Client.timer.method5464(); // L: 3103
			Client.updateGameState(40); // L: 3104
			TriBool.field3866 = Client.packetWriter.getSocket(); // L: 3105
			Client.packetWriter.removeSocket(); // L: 3106
		}
	} // L: 3101 3107
}
