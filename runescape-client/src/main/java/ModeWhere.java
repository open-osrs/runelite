import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("ModeWhere")
public enum ModeWhere implements Enumerated {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3710("", 0, new class286[]{class286.field3686}),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3708("", 1, new class286[]{class286.field3687, class286.field3686}),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3726("", 2, new class286[]{class286.field3687, class286.field3684, class286.field3686}),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3717("", 3, new class286[]{class286.field3687}),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3711("", 4),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3718("", 5, new class286[]{class286.field3687, class286.field3686}),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3720("", 6, new class286[]{class286.field3686}),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3714("", 8, new class286[]{class286.field3687, class286.field3686}),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3715("", 9, new class286[]{class286.field3687, class286.field3684}),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3716("", 10, new class286[]{class286.field3687}),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3709("", 11, new class286[]{class286.field3687}),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3707("", 12, new class286[]{class286.field3687, class286.field3686}),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	field3719("", 13, new class286[]{class286.field3687});

	@ObfuscatedName("ai")
	@Export("null_string")
	protected static String null_string;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class369 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1167949463
	)
	@Export("id")
	final int id;
	@ObfuscatedName("p")
	final Set field3721;

	static {
		method5073(); // L: 28
	} // L: 29

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lkl;)V"
	)
	ModeWhere(String var3, int var4, class286[] var5) {
		this.field3721 = new HashSet();
		this.id = var4; // L: 43
		class286[] var6 = var5; // L: 45

		for (int var7 = 0; var7 < var6.length; ++var7) { // L: 46
			class286 var8 = var6[var7]; // L: 47
			this.field3721.add(var8); // L: 48
		}

	} // L: 51

	ModeWhere(String var3, int var4) {
		this.field3721 = new HashSet(); // L: 32
		this.id = var4; // L: 39
	} // L: 40

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-708237537"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 54
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhs;",
		garbageValue = "-1050476944"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2774, ServerPacket.field2750, ServerPacket.field2744, ServerPacket.field2711, ServerPacket.field2703, ServerPacket.field2704, ServerPacket.field2738, ServerPacket.field2762, ServerPacket.field2707, ServerPacket.field2708, ServerPacket.field2709, ServerPacket.field2710, ServerPacket.field2742, ServerPacket.field2712, ServerPacket.field2713, ServerPacket.field2714, ServerPacket.field2715, ServerPacket.field2716, ServerPacket.field2729, ServerPacket.field2787, ServerPacket.field2767, ServerPacket.field2720, ServerPacket.field2721, ServerPacket.field2699, ServerPacket.field2723, ServerPacket.field2724, ServerPacket.field2771, ServerPacket.field2726, ServerPacket.field2727, ServerPacket.field2725, ServerPacket.field2700, ServerPacket.field2730, ServerPacket.field2731, ServerPacket.field2732, ServerPacket.field2722, ServerPacket.field2737, ServerPacket.field2735, ServerPacket.field2736, ServerPacket.field2734, ServerPacket.field2757, ServerPacket.field2739, ServerPacket.field2741, ServerPacket.field2740, ServerPacket.field2781, ServerPacket.field2743, ServerPacket.field2702, ServerPacket.field2745, ServerPacket.field2772, ServerPacket.field2747, ServerPacket.field2748, ServerPacket.field2749, ServerPacket.field2746, ServerPacket.field2733, ServerPacket.field2719, ServerPacket.field2753, ServerPacket.field2754, ServerPacket.field2755, ServerPacket.field2756, ServerPacket.field2769, ServerPacket.field2758, ServerPacket.field2759, ServerPacket.field2763, ServerPacket.field2761, ServerPacket.field2718, ServerPacket.field2752, ServerPacket.field2764, ServerPacket.field2765, ServerPacket.field2766, ServerPacket.field2701, ServerPacket.field2768, ServerPacket.field2728, ServerPacket.field2770, ServerPacket.field2795, ServerPacket.field2794, ServerPacket.field2773, ServerPacket.field2780, ServerPacket.field2775, ServerPacket.field2776, ServerPacket.field2777, ServerPacket.field2778, ServerPacket.field2779, ServerPacket.field2760, ServerPacket.field2705, ServerPacket.field2782, ServerPacket.field2783, ServerPacket.field2784, ServerPacket.field2785, ServerPacket.field2786, ServerPacket.field2751, ServerPacket.field2788, ServerPacket.field2789, ServerPacket.field2790, ServerPacket.field2791, ServerPacket.field2792, ServerPacket.field2793}; // L: 104
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkb;",
		garbageValue = "62"
	)
	static ModeWhere[] method5073() {
		return new ModeWhere[]{field3711, field3714, field3718, field3710, field3707, field3726, field3709, field3719, field3717, field3720, field3715, field3708, field3716}; // L: 35
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "1"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (UserComparator8.loadInterface(var0)) { // L: 9488
			Ignored.field3859 = null; // L: 9495
			class44.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9496
			if (Ignored.field3859 != null) { // L: 9497
				class44.drawInterface(Ignored.field3859, -1412584499, var1, var2, var3, var4, VarcInt.field1576, class230.field2812, var7); // L: 9498
				Ignored.field3859 = null; // L: 9499
			}

		} else {
			if (var7 != -1) { // L: 9489
				Client.field825[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9491
					Client.field825[var8] = true;
				}
			}

		}
	} // L: 9493 9501
}
