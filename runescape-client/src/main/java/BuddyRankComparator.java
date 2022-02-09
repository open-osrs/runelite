import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lmd;Lmd;I)I",
		garbageValue = "-1694287070"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1750865876"
	)
	static boolean method2513(int var0, int var1) {
		return var0 != 4 || var1 < 8; // L: 26
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1109868456"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 578
		if (GameEngine.garbageCollector == null || !GameEngine.garbageCollector.isValid()) { // L: 579
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 581

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 582
					if (var2.isValid()) { // L: 584
						GameEngine.garbageCollector = var2; // L: 585
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 586
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 587
					}
				}
			} catch (Throwable var11) { // L: 592
			}
		}

		if (GameEngine.garbageCollector != null) { // L: 594
			long var9 = DirectByteArrayCopier.method5318(); // L: 595
			long var3 = GameEngine.garbageCollector.getCollectionTime(); // L: 596
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 597
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 598
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 599
				if (0L != var7) { // L: 600
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 602
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 603
		}

		return var0; // L: 605
	}
}
