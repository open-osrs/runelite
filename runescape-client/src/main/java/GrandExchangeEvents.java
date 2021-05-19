import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("c")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("o")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("g")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("l")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("h")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator(); // L: 11
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator(); // L: 41
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator(); // L: 54
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lnk;Z)V",
		garbageValue = "1"
	)
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort(); // L: 82
		boolean var4 = var1.readUnsignedByte() == 1; // L: 83
		byte var5;
		if (var4) { // L: 85
			var5 = 1;
		} else {
			var5 = 0; // L: 86
		}

		int var6 = var1.readUnsignedShort(); // L: 87
		this.events = new ArrayList(var6); // L: 88

		for (int var7 = 0; var7 < var6; ++var7) { // L: 89
			this.events.add(new GrandExchangeEvent(var1, var5, var3)); // L: 90
		}

	} // L: 92

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZB)V",
		garbageValue = "1"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) { // L: 95
			Collections.sort(this.events, var1); // L: 96
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1)); // L: 99
		}

	} // L: 101

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1006012588"
	)
	public static int method4968(int var0, int var1, int var2) {
		int var3 = WorldMapLabel.method3582(var2 - var1 + 1); // L: 37
		var3 <<= var1; // L: 38
		return var0 & ~var3; // L: 39
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "-1"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (Messages.World_worlds != null) { // L: 171
			LoginScreenAnimation.doWorldSorting(0, Messages.World_worlds.length - 1, var0, var1, var2, var3); // L: 172
		}

	} // L: 174

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ldk;IIB)Lbd;",
		garbageValue = "79"
	)
	public static final PcmPlayer method4969(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field401 == 0) { // L: 56
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 57
			if (var2 < 256) { // L: 58
				var2 = 256;
			}

			try {
				PcmPlayer var3 = Tiles.pcmPlayerProvider.player(); // L: 60
				var3.samples = new int[(ApproximateRouteStrategy.PcmPlayer_stereo ? 2 : 1) * 256]; // L: 61
				var3.field400 = var2; // L: 62
				var3.init(); // L: 63
				var3.capacity = (var2 & -1024) + 1024; // L: 64
				if (var3.capacity > 16384) { // L: 65
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 66
				if (PcmPlayer.field405 > 0 && PcmPlayer.soundSystem == null) { // L: 67
					PcmPlayer.soundSystem = new SoundSystem(); // L: 68
					class337.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 69
					class337.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 70
				}

				if (PcmPlayer.soundSystem != null) { // L: 72
					if (PcmPlayer.soundSystem.players[var1] != null) { // L: 73
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3; // L: 74
				}

				return var3; // L: 76
			} catch (Throwable var4) { // L: 78
				return new PcmPlayer(); // L: 79
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
