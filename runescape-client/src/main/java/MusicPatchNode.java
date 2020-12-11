import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -780037221
	)
	int field2477;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lgy;"
	)
	MusicPatchNode2 field2459;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -988921205
	)
	int field2460;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1698248805
	)
	int field2461;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1639163759
	)
	int field2462;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -239406377
	)
	int field2463;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1040186295
	)
	int field2476;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1414126871
	)
	int field2464;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -907348397
	)
	int field2466;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1674863125
	)
	int field2467;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -72116075
	)
	int field2465;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -8690283
	)
	int field2472;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1112640035
	)
	int field2470;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1473586889
	)
	int field2471;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1781294933
	)
	int field2468;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1965880629
	)
	int field2469;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1121296603
	)
	int field2475;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -865267785
	)
	int field2456;

	MusicPatchNode() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2082654889"
	)
	void method3860() {
		this.patch = null;
		this.rawSound = null;
		this.field2459 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Ljx;",
		garbageValue = "-621121394"
	)
	@Export("getEnum")
	public static EnumDefinition getEnum(int var0) {
		EnumDefinition var1 = (EnumDefinition)EnumDefinition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumDefinition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumDefinition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumDefinition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}
}
