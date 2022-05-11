import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 732254663
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1987323191
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 353993277
	)
	@Export("y")
	int y;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 2069201157
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1537948889
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 209965041
	)
	int field817;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -222773955
	)
	int field813;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1832672013
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 727974151
	)
	int field808;
	@ObfuscatedName("w")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 10408455
	)
	int field810;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque(); // L: 11
	}

	ObjectSound() {
	} // L: 27

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026640853"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId; // L: 44
		ObjectComposition var2 = this.obj.transform(); // L: 45
		if (var2 != null) { // L: 46
			this.soundEffectId = var2.ambientSoundId; // L: 47
			this.field817 = var2.int7 * 128; // L: 48
			this.field813 = var2.int5; // L: 49
			this.field808 = var2.int6; // L: 50
			this.soundEffectIds = var2.soundEffectIds; // L: 51
		} else {
			this.soundEffectId = -1; // L: 54
			this.field817 = 0; // L: 55
			this.field813 = 0; // L: 56
			this.field808 = 0; // L: 57
			this.soundEffectIds = null; // L: 58
		}

		if (var1 != this.soundEffectId && this.stream1 != null) { // L: 60
			class122.pcmStreamMixer.removeSubStream(this.stream1); // L: 61
			this.stream1 = null; // L: 62
		}

	} // L: 64

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	public static int method1734() {
		return KeyHandler.KeyHandler_idleCycles; // L: 142
	}

	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2109603976"
	)
	static final void method1730(boolean var0) {
		if (var0) { // L: 3064
			Client.field615 = Login.field900 ? class124.field1557 : class124.field1551; // L: 3065
		} else {
			Client.field615 = class12.clientPreferences.parameters.containsKey(class239.method4810(Login.Login_username)) ? class124.field1556 : class124.field1553; // L: 3068
		}

	} // L: 3070
}
