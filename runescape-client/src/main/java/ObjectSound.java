import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 91657877
	)
	int field727;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1049583949
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1525995089
	)
	@Export("x")
	int x;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 483612819
	)
	@Export("y")
	int y;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1198542603
	)
	int field722;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1542168695
	)
	int field723;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2081431069
	)
	int field718;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 7596549
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("obj")
	ObjectComposition obj;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -452369011
	)
	int field728;
	@ObfuscatedName("h")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -904318183
	)
	int field725;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lal;"
	)
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-351961075"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field718 = var2.field1779 * 128;
			this.field727 = var2.int5;
			this.field728 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field718 = 0;
			this.field727 = 0;
			this.field728 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			TileItem.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnv;Lmc;I)Lmc;",
		garbageValue = "1040141632"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = SoundSystem.method530(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(III)Lio;",
		garbageValue = "840518253"
	)
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = UrlRequester.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}
}
