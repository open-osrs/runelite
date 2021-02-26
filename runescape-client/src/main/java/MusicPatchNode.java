import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("ey")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 550011447
	)
	int field2471;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	MusicPatchNode2 field2473;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 2110028369
	)
	int field2474;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -96343197
	)
	int field2475;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1440668291
	)
	int field2476;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1716873171
	)
	int field2477;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1965253533
	)
	int field2478;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -323457353
	)
	int field2472;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1000773439
	)
	int field2480;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1349292389
	)
	int field2481;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -720324353
	)
	int field2491;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1839598813
	)
	int field2483;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -378867617
	)
	int field2486;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -449130681
	)
	int field2482;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1114388965
	)
	int field2488;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1049905099
	)
	int field2487;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2011885117
	)
	int field2484;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1908320753
	)
	int field2479;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	void method4032() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2473 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38
}
