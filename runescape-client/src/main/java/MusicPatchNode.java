import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -830745709
	)
	int field2898;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lid;"
	)
	@Export("patch")
	MusicPatch patch;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	MusicPatchNode2 field2904;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 461020611
	)
	int field2897;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -127033357
	)
	int field2910;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -259364835
	)
	int field2900;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -465046883
	)
	int field2902;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1421225285
	)
	int field2907;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1943082417
	)
	int field2901;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 903145849
	)
	int field2914;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1537236139
	)
	int field2894;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -920697405
	)
	int field2906;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1809682869
	)
	int field2905;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 997505503
	)
	int field2903;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 725888983
	)
	int field2909;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1407978861
	)
	int field2908;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2142706347
	)
	int field2911;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lbv;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1220588121
	)
	int field2913;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1263258455
	)
	int field2899;

	MusicPatchNode() {
	} // L: 31

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-818920920"
	)
	void method4772() {
		this.patch = null; // L: 34
		this.rawSound = null; // L: 35
		this.field2904 = null; // L: 36
		this.stream = null; // L: 37
	} // L: 38

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1957500664"
	)
	public static int method4776(int var0, int var1) {
		return (var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-68"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0); // L: 9906

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) { // L: 9907
			var1 = var1.substring(0, var2) + "," + var1.substring(var2); // L: 9908
		}

		if (var1.length() > 9) { // L: 9910
			return " " + SecureRandomFuture.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + SecureRandomFuture.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + SecureRandomFuture.colorStartTag(16776960) + var1 + "</col>"; // L: 9911 9912
		}
	}
}
