import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -486262227
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1658643165
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -457731185
	)
	@Export("y")
	int y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1010602035
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1936125561
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1930286525
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -607759825
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -1585251643949812861L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 148336509
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(S)[Lin;",
		garbageValue = "180"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2878, ServerPacket.field2882, ServerPacket.field2869, ServerPacket.field2790, ServerPacket.field2791, ServerPacket.field2792, ServerPacket.field2862, ServerPacket.field2794, ServerPacket.field2827, ServerPacket.field2841, ServerPacket.field2832, ServerPacket.field2798, ServerPacket.field2799, ServerPacket.field2789, ServerPacket.field2804, ServerPacket.field2802, ServerPacket.field2795, ServerPacket.field2816, ServerPacket.field2805, ServerPacket.field2806, ServerPacket.field2807, ServerPacket.field2803, ServerPacket.field2809, ServerPacket.field2810, ServerPacket.field2811, ServerPacket.field2808, ServerPacket.field2813, ServerPacket.field2817, ServerPacket.field2815, ServerPacket.field2812, ServerPacket.field2801, ServerPacket.field2818, ServerPacket.field2819, ServerPacket.field2820, ServerPacket.field2788, ServerPacket.field2822, ServerPacket.field2823, ServerPacket.field2796, ServerPacket.field2845, ServerPacket.field2826, ServerPacket.field2821, ServerPacket.field2828, ServerPacket.field2829, ServerPacket.field2830, ServerPacket.field2831, ServerPacket.field2814, ServerPacket.field2833, ServerPacket.field2834, ServerPacket.field2835, ServerPacket.field2797, ServerPacket.field2836, ServerPacket.field2838, ServerPacket.field2839, ServerPacket.field2840, ServerPacket.field2865, ServerPacket.field2787, ServerPacket.field2843, ServerPacket.field2844, ServerPacket.field2879, ServerPacket.field2846, ServerPacket.field2847, ServerPacket.field2793, ServerPacket.field2849, ServerPacket.field2850, ServerPacket.field2851, ServerPacket.field2852, ServerPacket.field2853, ServerPacket.field2861, ServerPacket.field2855, ServerPacket.field2848, ServerPacket.field2857, ServerPacket.field2858, ServerPacket.field2859, ServerPacket.field2860, ServerPacket.field2824, ServerPacket.field2874, ServerPacket.field2863, ServerPacket.field2864, ServerPacket.field2856, ServerPacket.field2800, ServerPacket.field2867, ServerPacket.field2868, ServerPacket.field2866, ServerPacket.field2870, ServerPacket.field2871, ServerPacket.field2872, ServerPacket.field2873, ServerPacket.field2842, ServerPacket.field2875, ServerPacket.field2876, ServerPacket.field2877, ServerPacket.field2854, ServerPacket.field2837, ServerPacket.field2880, ServerPacket.field2881};
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1531705117"
	)
	public static String method4580(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class317.field3869[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class317.field3869[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class317.field3869[(var6 & 15) << 2 | var7 >>> 6]).append(class317.field3869[var7 & 63]);
				} else {
					var3.append(class317.field3869[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class317.field3869[(var5 & 3) << 4]).append("==");
			}
		}

		return var3.toString();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILbe;ZB)I",
		garbageValue = "-20"
	)
	static int method4581(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 != 6801 && var0 != 6802) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[++class54.Interpreter_stringStackSize - 1] = "";
				return 1;
			} else if (var0 != 6851 && var0 != 6852) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[++AbstractByteArrayCopier.Interpreter_intStackSize - 1] = -1;
			return 1;
		}
	}
}
