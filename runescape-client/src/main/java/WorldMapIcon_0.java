import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1404019363
	)
	static int field2105;
	@ObfuscatedName("be")
	static String field2104;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1294282713
	)
	@Export("element")
	final int element;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2094833405
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 292316121
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Liy;Liy;ILgz;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class54.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "-1853266202"
	)
	public static VarbitComposition method3741(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var1 = new VarbitComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244161405"
	)
	public static void method3730() {
		try {
			if (class247.musicPlayerStatus == 1) {
				int var0 = class135.midiPcmStream.method4621();
				if (var0 > 0 && class135.midiPcmStream.isReady()) {
					var0 -= class130.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					class135.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class135.midiPcmStream.clear();
				class135.midiPcmStream.removeAll();
				if (class247.musicTrackArchive != null) {
					class247.musicPlayerStatus = 2;
				} else {
					class247.musicPlayerStatus = 0;
				}

				class281.musicTrack = null;
				class273.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class135.midiPcmStream.clear();
			class247.musicPlayerStatus = 0;
			class281.musicTrack = null;
			class273.soundCache = null;
			class247.musicTrackArchive = null;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method3732(int var0) {
		return class275.method5066(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljd;B)Ljava/lang/String;",
		garbageValue = "2"
	)
	static String method3729(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = class9.method90(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
