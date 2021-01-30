import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("q")
	public static String field1077;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1758157691
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1615552035
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1115826247
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -686767343
	)
	int field1073;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 744417563
	)
	int field1078;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 417885395
	)
	int field1086;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 736414323
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 959647129
	)
	int field1085;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 409516173
	)
	int field1083;
	@ObfuscatedName("e")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1988798929
	)
	int field1081;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("obj")
	ObjectDefinition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401252200"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 30
		ObjectDefinition var2 = this.obj.transform(); // L: 31
		if (var2 != null) { // L: 32
			this.soundEffectId = var2.ambientSoundId; // L: 33
			this.field1086 = var2.int4 * 128; // L: 34
			this.field1085 = var2.int5; // L: 35
			this.field1083 = var2.int6; // L: 36
			this.soundEffectIds = var2.soundEffectIds; // L: 37
		} else {
			this.soundEffectId = -1; // L: 40
			this.field1086 = 0; // L: 41
			this.field1085 = 0; // L: 42
			this.field1083 = 0; // L: 43
			this.soundEffectIds = null; // L: 44
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 46
			WorldMapManager.pcmStreamMixer.removeSubStream(this.stream1); // L: 47
			this.stream1 = null; // L: 48
		}

	} // L: 50

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "725701035"
	)
	static final int method1993() {
		return ViewportMouse.ViewportMouse_x; // L: 99
	}
}
