import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -765367779
	)
	int field2996;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	MusicPatchNode2 field2988;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1956432115
	)
	int field2989;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -25523701
	)
	int field2990;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1073862623
	)
	int field2991;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 483864743
	)
	int field2992;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1449376121
	)
	int field2993;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 154374579
	)
	int field2997;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 875004827
	)
	int field2998;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -282874889
	)
	int field2986;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1795067685
	)
	int field3004;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1488194149
	)
	int field2994;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 546562593
	)
	int field2999;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -95307761
	)
	int field3000;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -828280659
	)
	int field3001;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -604585329
	)
	int field3002;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 630031751
	)
	int field2995;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -848603207
	)
	int field3003;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method4992() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2988 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38
}
