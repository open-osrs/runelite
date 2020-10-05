import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("TileItem")
public final class TileItem extends Entity {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 652464565
	)
	int id;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 417363545
	)
	int quantity;

	TileItem() {
	} // L: 11

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	protected final Model getModel() {
		return GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(this.id).getModel(this.quantity); // L: 14
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(II)Lhq;",
		garbageValue = "7632896"
	)
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 186
		int var2 = var0 & 65535; // L: 187
		if (Widget.Widget_interfaceComponents[var1] == null || Widget.Widget_interfaceComponents[var1][var2] == null) { // L: 188
			boolean var3 = WorldMapSprite.loadInterface(var1); // L: 189
			if (!var3) { // L: 190
				return null;
			}
		}

		return Widget.Widget_interfaceComponents[var1][var2]; // L: 192
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Lld;",
		garbageValue = "86"
	)
	public static PrivateChatMode method2202(int var0) {
		PrivateChatMode[] var1 = SpotAnimationDefinition.method4518(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field3824) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(CLgn;I)C",
		garbageValue = "-2022621554"
	)
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 93
			if (var0 >= 192 && var0 <= 198) { // L: 94
				return 'A';
			}

			if (var0 == 199) { // L: 95
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 96
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 97
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 98
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 99
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 100
				return 'U';
			}

			if (var0 == 221) { // L: 101
				return 'Y';
			}

			if (var0 == 223) { // L: 102
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 103
				return 'a';
			}

			if (var0 == 231) { // L: 104
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 105
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i'; // L: 106
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 107
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 108
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 109
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 110
				return 'y';
			}
		}

		if (var0 == 338) { // L: 112
			return 'O';
		} else if (var0 == 339) { // L: 113
			return 'o';
		} else if (var0 == 376) { // L: 114
			return 'Y';
		} else {
			return var0; // L: 115
		}
	}

	@ObfuscatedName("t")
	public static int Entity_unpackSceneX(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static final int method2206(int var0, int var1) {
		int var2 = GrandExchangeOfferOwnWorldComparator.method1334(var0 - 1, var1 - 1) + GrandExchangeOfferOwnWorldComparator.method1334(var0 + 1, var1 - 1) + GrandExchangeOfferOwnWorldComparator.method1334(var0 - 1, 1 + var1) + GrandExchangeOfferOwnWorldComparator.method1334(var0 + 1, var1 + 1); // L: 849
		int var3 = GrandExchangeOfferOwnWorldComparator.method1334(var0 - 1, var1) + GrandExchangeOfferOwnWorldComparator.method1334(1 + var0, var1) + GrandExchangeOfferOwnWorldComparator.method1334(var0, var1 - 1) + GrandExchangeOfferOwnWorldComparator.method1334(var0, var1 + 1); // L: 850
		int var4 = GrandExchangeOfferOwnWorldComparator.method1334(var0, var1); // L: 851
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 852
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lfo;III)Ldr;",
		garbageValue = "-1837543032"
	)
	public static final PcmPlayer method2205(TaskHandler var0, int var1, int var2) {
		if (PcmPlayer.field1447 == 0) { // L: 52
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) { // L: 53
			if (var2 < 256) { // L: 54
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class300.pcmPlayerProvider.player(); // L: 56
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)]; // L: 57
				var3.field1438 = var2; // L: 58
				var3.init(); // L: 59
				var3.capacity = (var2 & -1024) + 1024; // L: 60
				if (var3.capacity > 16384) { // L: 61
					var3.capacity = 16384;
				}

				var3.open(var3.capacity); // L: 62
				if (Decimator.field1491 > 0 && class1.soundSystem == null) { // L: 63
					class1.soundSystem = new SoundSystem(); // L: 64
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1); // L: 65
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(class1.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS); // L: 66
				}

				if (class1.soundSystem != null) { // L: 68
					if (class1.soundSystem.players[var1] != null) { // L: 69
						throw new IllegalArgumentException();
					}

					class1.soundSystem.players[var1] = var3; // L: 70
				}

				return var3; // L: 72
			} catch (Throwable var4) { // L: 74
				return new PcmPlayer(); // L: 75
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "41"
	)
	static boolean method2208() {
		return (Client.drawPlayerNames & 8) != 0; // L: 4409
	}
}
