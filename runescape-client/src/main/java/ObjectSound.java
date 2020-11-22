import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1138191805
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1682034251
	)
	@Export("x")
	int x;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 2073758619
	)
	@Export("y")
	int y;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1257501441
	)
	int field1103;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1906931409
	)
	int field1112;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2106963407
	)
	int field1104;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 786656401
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -68558045
	)
	int field1107;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 151310867
	)
	int field1109;
	@ObfuscatedName("o")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -828996147
	)
	int field1108;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("obj")
	ObjectDefinition obj;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2054247540"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 30
		ObjectDefinition var2 = this.obj.transform(); // L: 31
		if (var2 != null) { // L: 32
			this.soundEffectId = var2.ambientSoundId; // L: 33
			this.field1104 = var2.int4 * 128; // L: 34
			this.field1107 = var2.int5; // L: 35
			this.field1109 = var2.int6; // L: 36
			this.soundEffectIds = var2.soundEffectIds; // L: 37
		} else {
			this.soundEffectId = -1; // L: 40
			this.field1104 = 0; // L: 41
			this.field1107 = 0; // L: 42
			this.field1109 = 0; // L: 43
			this.soundEffectIds = null; // L: 44
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 46
			GrandExchangeEvents.pcmStreamMixer.removeSubStream(this.stream1); // L: 47
			this.stream1 = null; // L: 48
		}

	} // L: 50

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2057231744"
	)
	@Export("parseInt")
	public static int parseInt(CharSequence var0) {
		return SecureRandomCallable.parseIntCustomRadix(var0, 10, true); // L: 76
	}

	@ObfuscatedName("k")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 68
	}
}
