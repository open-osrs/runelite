import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1463975921
	)
	int field2908;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	MusicPatchNode2 field2915;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 526262157
	)
	int field2907;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -6114463
	)
	int field2902;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -970161773
	)
	int field2903;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -339875115
	)
	int field2904;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -749236091
	)
	int field2905;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 421352965
	)
	int field2906;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1907989053
	)
	int field2900;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -585821047
	)
	int field2911;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1406585343
	)
	int field2909;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1645733579
	)
	int field2910;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1129661053
	)
	int field2898;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -304660997
	)
	int field2912;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1833594555
	)
	int field2913;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 2087137619
	)
	int field2901;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 987956441
	)
	int field2916;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -218831321
	)
	int field2917;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1154138933"
	)
	void method4575() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2915 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Led;",
		garbageValue = "-24"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 18
		if (var1 != null) { // L: 19
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 20
			var1 = new VarpDefinition(); // L: 21
			if (var2 != null) { // L: 22
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 23
			return var1; // L: 24
		}
	}
}
