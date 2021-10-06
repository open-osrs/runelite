import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 594812203
	)
	int field2980;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	MusicPatchNode2 field2981;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 481741389
	)
	int field2985;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1319618045
	)
	int field2988;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 754199743
	)
	int field2984;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -986353547
	)
	int field2982;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1048231541
	)
	int field2986;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -40565163
	)
	int field2987;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1800306941
	)
	int field2983;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1955629255
	)
	int field2989;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 20741255
	)
	int field2990;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 723943993
	)
	int field2991;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 804975845
	)
	int field2978;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1338086521
	)
	int field2993;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1413692333
	)
	int field2994;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 306416011
	)
	int field2995;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -367314443
	)
	int field2997;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1969010689
	)
	int field2998;

	MusicPatchNode() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1742353306"
	)
	void method4913() {
		this.patch = null;
		this.rawSound = null;
		this.field2981 = null;
		this.stream = null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1553277832"
	)
	static final void method4912() {
		Object var10000 = null;
		String var0 = "You can't add yourself to your own friend list";
		GraphicsDefaults.addGameMessage(30, "", var0);
	}
}
