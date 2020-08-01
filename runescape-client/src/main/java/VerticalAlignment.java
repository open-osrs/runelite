import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enumerated {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	field3226(2, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	field3230(0, 2);

	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -296657291
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1007871837
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-995092303"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)Lcs;",
		garbageValue = "1496312280"
	)
	static Script method4517(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = Message.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = Message.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = WorldMapAreaData.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "735302127"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (MusicPatchPcmStream.garbageCollector == null || !MusicPatchPcmStream.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						MusicPatchPcmStream.garbageCollector = var2;
						GameShell.garbageCollectorLastCheckTimeMs = -1L;
						GameShell.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (MusicPatchPcmStream.garbageCollector != null) {
			long var9 = MilliClock.currentTimeMillis();
			long var3 = MusicPatchPcmStream.garbageCollector.getCollectionTime();
			if (GameShell.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameShell.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameShell.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameShell.garbageCollectorLastCollectionTime = var3;
			GameShell.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
