import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static Widget field100;
	@ObfuscatedName("n")
	@Export("state")
	byte state;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1764119781
	)
	@Export("id")
	public int id;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1987297797
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 795872735
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 252650677
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 710426357
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	} // L: 13

	@ObfuscatedSignature(
		descriptor = "(Lkx;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte(); // L: 16
		this.id = var1.readUnsignedShort(); // L: 17
		this.unitPrice = var1.readInt(); // L: 18
		this.totalQuantity = var1.readInt(); // L: 19
		this.currentQuantity = var1.readInt(); // L: 20
		this.currentPrice = var1.readInt(); // L: 21
	} // L: 22

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-15"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-522457380"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "575158813"
	)
	void method166(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	} // L: 60

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "656048251"
	)
	void method168(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8); // L: 64
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfu;III)Ldh;",
		garbageValue = "779350721"
	)
	public static final PcmPlayer method167(TaskHandler var0, int var1, int var2) {
		if (StructComposition.field3338 == 0) { // L: 45
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 46
			if (var2 < 256) { // L: 47
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class2.pcmPlayerProvider.player(); // L: 49
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 50
				var3.field1427 = var2; // L: 51
				var3.init(); // L: 52
				var3.capacity = (var2 & -1024) + 1024; // L: 53
				if (var3.capacity > 16384) { // L: 54
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 55
				if (PcmPlayer.field1419 > 0 && PcmPlayer.soundSystem == null) { // L: 56
					PcmPlayer.soundSystem = new SoundSystem(); // L: 57
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 58
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 59
				}

				if (PcmPlayer.soundSystem != null) { // L: 61
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 62
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 63
				}

				return var3; // L: 65
			} catch (Throwable var4) { // L: 67
				return new PcmPlayer(); // L: 68
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 586
		if (WorldMapID.garbageCollector == null || !WorldMapID.garbageCollector.isValid()) { // L: 587
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 589

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 590
					if (var2.isValid()) { // L: 592
						WorldMapID.garbageCollector = var2; // L: 593
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 594
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 595
					}
				}
			} catch (Throwable var11) { // L: 600
			}
		}

		if (WorldMapID.garbageCollector != null) { // L: 602
			long var9 = Tiles.currentTimeMillis(); // L: 603
			long var3 = WorldMapID.garbageCollector.getCollectionTime(); // L: 604
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) { // L: 605
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 606
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 607
				if (0L != var7) { // L: 608
					var0 = (int)(100L * var5 / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 610
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 611
		}

		return var0; // L: 613
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-64"
	)
	static final String method187(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10056 10057
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(Lbs;ZS)V",
		garbageValue = "-4659"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group; // L: 11249
		int var3 = (int)var0.key; // L: 11250
		var0.remove(); // L: 11251
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) { // L: 11252 11253 11254
			FontName.Widget_archive.clearFilesGroup(var2); // L: 11255
			if (DefaultsGroup.Widget_interfaceComponents[var2] != null) { // L: 11256
				boolean var4 = true; // L: 11257

				for (int var5 = 0; var5 < DefaultsGroup.Widget_interfaceComponents[var2].length; ++var5) { // L: 11258
					if (DefaultsGroup.Widget_interfaceComponents[var2][var5] != null) { // L: 11259
						if (DefaultsGroup.Widget_interfaceComponents[var2][var5].type != 2) { // L: 11260
							DefaultsGroup.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false; // L: 11261
						}
					}
				}

				if (var4) { // L: 11264
					DefaultsGroup.Widget_interfaceComponents[var2] = null;
				}

				Widget.Widget_loadedInterfaces[var2] = false; // L: 11265
			}
		}

		ModeWhere.method3871(var2); // L: 11267
		Widget var6 = class237.getWidget(var3); // L: 11268
		if (var6 != null) { // L: 11269
			IsaacCipher.invalidateWidget(var6);
		}

		AbstractWorldMapData.method352(); // L: 11270
		if (Client.rootInterface != -1) { // L: 11271
			class228.runIntfCloseListeners(Client.rootInterface, 1);
		}

	} // L: 11272
}
