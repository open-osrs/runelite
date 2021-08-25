import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "[Loi;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 723711115
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 363240787
	)
	@Export("element")
	int element;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 853602973
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1200946541
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Liy;Liy;ILfm;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-283459385"
	)
	@Export("init")
	void init() {
		this.element = HitSplatDefinition.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class54.WorldMapElement_get(this.element));
		WorldMapElement var1 = class54.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "120"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)Lgz;",
		garbageValue = "3118"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-50"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-967271066"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lkk;II)Liz;",
		garbageValue = "-1316529255"
	)
	static MusicPatch method3403(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Lit;",
		garbageValue = "559434564"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.field2836, ServerPacket.field2844, ServerPacket.field2771, ServerPacket.field2864, ServerPacket.field2773, ServerPacket.field2774, ServerPacket.field2821, ServerPacket.field2797, ServerPacket.field2777, ServerPacket.field2778, ServerPacket.field2779, ServerPacket.field2780, ServerPacket.field2770, ServerPacket.field2782, ServerPacket.field2783, ServerPacket.field2787, ServerPacket.field2796, ServerPacket.field2786, ServerPacket.field2837, ServerPacket.field2784, ServerPacket.field2789, ServerPacket.field2790, ServerPacket.field2840, ServerPacket.field2792, ServerPacket.field2851, ServerPacket.field2794, ServerPacket.field2795, ServerPacket.field2769, ServerPacket.field2852, ServerPacket.field2830, ServerPacket.field2799, ServerPacket.field2800, ServerPacket.field2802, ServerPacket.field2811, ServerPacket.field2820, ServerPacket.field2804, ServerPacket.field2805, ServerPacket.field2793, ServerPacket.field2807, ServerPacket.field2815, ServerPacket.field2809, ServerPacket.field2810, ServerPacket.field2816, ServerPacket.field2812, ServerPacket.field2813, ServerPacket.field2814, ServerPacket.field2817, ServerPacket.field2775, ServerPacket.field2842, ServerPacket.field2818, ServerPacket.field2819, ServerPacket.field2863, ServerPacket.field2806, ServerPacket.field2822, ServerPacket.field2823, ServerPacket.field2824, ServerPacket.field2825, ServerPacket.field2826, ServerPacket.field2827, ServerPacket.field2828, ServerPacket.field2829, ServerPacket.field2791, ServerPacket.field2831, ServerPacket.field2832, ServerPacket.field2833, ServerPacket.field2834, ServerPacket.field2835, ServerPacket.field2856, ServerPacket.field2803, ServerPacket.field2838, ServerPacket.field2839, ServerPacket.field2808, ServerPacket.field2841, ServerPacket.field2798, ServerPacket.field2843, ServerPacket.field2772, ServerPacket.field2845, ServerPacket.field2846, ServerPacket.field2847, ServerPacket.field2848, ServerPacket.field2849, ServerPacket.field2850, ServerPacket.field2788, ServerPacket.field2862, ServerPacket.field2853, ServerPacket.field2854, ServerPacket.field2855, ServerPacket.field2781, ServerPacket.field2857, ServerPacket.field2858, ServerPacket.field2859, ServerPacket.field2860, ServerPacket.field2861, ServerPacket.field2785, ServerPacket.field2801};
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)Lfn;",
		garbageValue = "-27680"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = JagexCache.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "648862734"
	)
	static final void method3406(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != VarbitComposition.clientPreferences.musicVolume) {
			if (VarbitComposition.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				Decimator.method1051(class276.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field728 = false;
			} else if (var0 == 0) {
				Canvas.method371();
				Client.field728 = false;
			} else if (class247.musicPlayerStatus != 0) {
				class196.musicTrackVolume = var0;
			} else {
				class135.midiPcmStream.setPcmStreamVolume(var0);
			}

			VarbitComposition.clientPreferences.musicVolume = var0;
			DevicePcmPlayerProvider.savePreferences();
		}

	}
}
