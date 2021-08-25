import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("n")
	final int field4304;
	@ObfuscatedName("c")
	final int field4276;
	@ObfuscatedName("m")
	final int field4277;
	@ObfuscatedName("k")
	final int field4278;
	@ObfuscatedName("o")
	final int field4302;
	@ObfuscatedName("g")
	final int field4294;
	@ObfuscatedName("z")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 53952311
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1797738761
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("e")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1463304683
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1546879961
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -11358323
	)
	int field4306;
	@ObfuscatedName("f")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -2114937873
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1611306341
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 679904065
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("q")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2078278977
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1213180761
	)
	int field4283;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1191633685
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("t")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -607408647
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("p")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1443990071
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("aq")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ad")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("al")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("aa")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("aw")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("at")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("as")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ae")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("av")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ak")
	@Export("base")
	int[][] base;
	@ObfuscatedName("an")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ab")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1858865351
	)
	int field4312;

	BZip2State() {
		this.field4304 = 4096;
		this.field4276 = 16;
		this.field4277 = 258;
		this.field4278 = 6;
		this.field4302 = 50;
		this.field4294 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ljd;I)Z",
		garbageValue = "-1069894209"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class9.method90(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
