import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("dv")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 648896771
	)
	int field2479;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	MusicPatchNode2 field2464;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -567152179
	)
	int field2468;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 63217979
	)
	int field2466;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1531269935
	)
	int field2469;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2019958227
	)
	int field2465;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -441601487
	)
	int field2472;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2122667109
	)
	int field2470;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 419759473
	)
	int field2474;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1747326149
	)
	int field2475;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1604412873
	)
	int field2476;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -481757253
	)
	int field2477;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1285265109
	)
	int field2473;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1335006663
	)
	int field2485;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -46018309
	)
	int field2480;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -39925853
	)
	int field2467;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -631500041
	)
	int field2483;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1318550711
	)
	int field2484;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1941368303"
	)
	void method3971() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2464 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1392160704"
	)
	static void method3973() {
		int var0 = Players.Players_count; // L: 4821
		int[] var1 = Players.Players_indices; // L: 4822

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4823
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4824
				ArchiveLoader.addPlayerToScene(Client.players[var1[var2]], true); // L: 4825
			}
		}

	} // L: 4827
}
