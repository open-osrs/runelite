import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 923209033
	)
	int field2554;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lhc;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lah;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	MusicPatchNode2 field2550;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -645577827
	)
	int field2551;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1425204299
	)
	int field2547;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1052221875
	)
	int field2553;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -59060905
	)
	int field2557;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -990038091
	)
	int field2555;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1971126449
	)
	int field2556;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1100690869
	)
	int field2552;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -978602639
	)
	int field2568;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1970474251
	)
	int field2559;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -874480547
	)
	int field2560;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 741885295
	)
	int field2561;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1928199641
	)
	int field2562;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 463873485
	)
	int field2563;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 372649253
	)
	int field2564;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 987730343
	)
	int field2566;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1210964927
	)
	int field2567;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1071892920"
	)
	void method4163() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2550 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38
}
