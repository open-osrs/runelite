import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1932719699
	)
	int field3240;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	MusicPatchNode2 field3242;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 389268709
	)
	int field3243;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1018403147
	)
	int field3244;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1602906341
	)
	int field3245;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1234953283
	)
	int field3254;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2037770949
	)
	int field3247;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1573845693
	)
	int field3248;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1045686589
	)
	int field3249;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1320174817
	)
	int field3251;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -794832495
	)
	int field3255;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -860984771
	)
	int field3252;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1408530903
	)
	int field3253;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1332405085
	)
	int field3250;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -801153411
	)
	int field3258;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 841486627
	)
	int field3259;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1551077753
	)
	int field3256;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 417761005
	)
	int field3239;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1112307051"
	)
	void method5501() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3242 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38
}
