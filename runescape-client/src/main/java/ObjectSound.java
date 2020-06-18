import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Ljp;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = -1274287771
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 979067629
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -107293807
	)
	@Export("x")
	int x;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1886851705
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1922393949
	)
	int field1103;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 371547415
	)
	int field1104;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1292781509
	)
	int field1105;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1063635793
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		signature = "Ldk;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -654816811
	)
	int field1108;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 648336705
	)
	int field1115;
	@ObfuscatedName("y")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1339220777
	)
	int field1111;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Ldk;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Ljg;"
	)
	@Export("obj")
	ObjectDefinition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "2014471583"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectDefinition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field1105 = var2.int4 * 128;
			this.field1108 = var2.int5;
			this.field1115 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field1105 = 0;
			this.field1108 = 0;
			this.field1115 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class60.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-997797111"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		WorldMapID.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Lic;I)V",
		garbageValue = "1163495687"
	)
	public static void method1999(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "23035"
	)
	public static void method2007() {
		PlayerAppearance.PlayerAppearance_cachedModels.clear();
	}

	@ObfuscatedName("w")
	static final void method2010(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1381107864"
	)
	public static void method2008() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}
}
