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
		intValue = 1091838848
	)
	@Export("x")
	int x;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2006873984
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
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "401252200"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectDefinition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field1086 = var2.int4 * 128;
			this.field1085 = var2.int5;
			this.field1083 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field1086 = 0;
			this.field1085 = 0;
			this.field1083 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			WorldMapManager.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "725701035"
	)
	static final int method1993() {
		return ViewportMouse.ViewportMouse_x;
	}
}
