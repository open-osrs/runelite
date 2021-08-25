import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -1135350331
	)
	static int field811;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 623460127
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1356057799
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -506004711
	)
	@Export("y")
	int y;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1721967971
	)
	int field806;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 2019735621
	)
	int field801;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1293883573
	)
	int field804;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1271461183
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1952974983
	)
	int field805;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1623306055
	)
	int field800;
	@ObfuscatedName("y")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1908724289
	)
	int field808;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "434138079"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field804 = var2.field1864 * 128;
			this.field805 = var2.int5;
			this.field800 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field804 = 0;
			this.field805 = 0;
			this.field800 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			MusicPatchPcmStream.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1676783295"
	)
	public static int method1731(int var0, int var1, int var2) {
		int var3 = class120.method2512(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-60"
	)
	static boolean method1734() {
		return (Client.drawPlayerNames & 4) != 0;
	}
}
