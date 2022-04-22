import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 355454995
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfc;",
		garbageValue = "-12"
	)
	public static VarcInt method6839(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0); // L: 17
		if (var1 != null) { // L: 18
			return var1;
		} else {
			byte[] var2 = class384.VarcInt_archive.takeFile(19, var0); // L: 19
			var1 = new VarcInt(); // L: 20
			if (var2 != null) { // L: 21
				var1.method3414(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0); // L: 22
			return var1; // L: 23
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(II)Ldf;",
		garbageValue = "-468677079"
	)
	static class118 method6838(int var0) {
		class118 var1 = (class118)MusicPatchPcmStream.findEnumerated(class18.method258(), var0); // L: 35
		if (var1 == null) {
			var1 = class118.field1433; // L: 36
		}

		return var1; // L: 37
	}
}
