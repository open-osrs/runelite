import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -85807901
	)
	int field3248;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	MusicPatchNode2 field3247;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 388699889
	)
	int field3239;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1603871991
	)
	int field3251;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -467029619
	)
	int field3241;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 244268301
	)
	int field3242;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1685721651
	)
	int field3243;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 574011949
	)
	int field3244;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 322850677
	)
	int field3245;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 286335067
	)
	int field3246;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1066885049
	)
	int field3235;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -921472867
	)
	int field3252;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -443275667
	)
	int field3249;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1587247393
	)
	int field3250;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1104457881
	)
	int field3253;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -579957291
	)
	int field3237;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lau;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2013381951
	)
	int field3255;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2077025655
	)
	int field3238;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1181491124"
	)
	void method5473() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field3247 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38
}
