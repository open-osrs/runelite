import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static ClanChannel field1347;
	@ObfuscatedName("l")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lmi;Lmi;I)I",
		garbageValue = "-940164438"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public static int method2458() {
		return ViewportMouse.ViewportMouse_entityCount;
	}
}
