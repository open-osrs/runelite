import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.math.BigInteger;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
public class class80 {
	@ObfuscatedName("b")
	static final BigInteger field965;
	@ObfuscatedName("e")
	static final BigInteger field964;

	static {
		field965 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field964 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 547
		if (class21.garbageCollector == null || !class21.garbageCollector.isValid()) { // L: 548
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 550

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 551
					if (var2.isValid()) { // L: 553
						class21.garbageCollector = var2; // L: 554
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 555
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 556
					}
				}
			} catch (Throwable var11) { // L: 561
			}
		}

		if (class21.garbageCollector != null) { // L: 563
			long var9 = ObjectSound.currentTimeMillis(); // L: 564
			long var3 = class21.garbageCollector.getCollectionTime(); // L: 565
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 566
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 567
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 568
				if (var7 != 0L) { // L: 569
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 571
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 572
		}

		return var0; // L: 574
	}
}
