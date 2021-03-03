import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lji;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(
		intValue = -1964902031
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2133589173
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1700481629
	)
	@Export("x")
	int x;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 63156075
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1427133393
	)
	int field1090;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -125163379
	)
	int field1094;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1800180133
	)
	int field1092;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -334742389
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -718153563
	)
	int field1095;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1722103043
	)
	int field1096;
	@ObfuscatedName("b")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -603753603
	)
	int field1097;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 30
		ObjectComposition var2 = this.obj.transform(); // L: 31
		if (var2 != null) { // L: 32
			this.soundEffectId = var2.ambientSoundId; // L: 33
			this.field1092 = var2.int4 * 128; // L: 34
			this.field1095 = var2.int5; // L: 35
			this.field1096 = var2.int6; // L: 36
			this.soundEffectIds = var2.soundEffectIds; // L: 37
		} else {
			this.soundEffectId = -1; // L: 40
			this.field1092 = 0; // L: 41
			this.field1095 = 0; // L: 42
			this.field1096 = 0; // L: 43
			this.soundEffectIds = null; // L: 44
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 46
			VarbitComposition.pcmStreamMixer.removeSubStream(this.stream1); // L: 47
			this.stream1 = null; // L: 48
		}

	} // L: 50

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "-293129030"
	)
	public static long method2044(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 52
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "([Lhz;IIIZI)V",
		garbageValue = "2024248022"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 9956
			Widget var6 = var0[var5]; // L: 9957
			if (var6 != null && var6.parentId == var1) { // L: 9958 9959
				WorldMapManager.alignWidgetSize(var6, var2, var3, var4); // L: 9960
				ClientPreferences.alignWidgetPosition(var6, var2, var3); // L: 9961
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 9962
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 9963
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) { // L: 9964
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) { // L: 9965
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 9966
					class182.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 9968
}
