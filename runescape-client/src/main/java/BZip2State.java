import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lx")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("o")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("n")
	final int field3779;
	@ObfuscatedName("v")
	final int field3761;
	@ObfuscatedName("d")
	final int field3759;
	@ObfuscatedName("c")
	final int field3758;
	@ObfuscatedName("y")
	final int field3782;
	@ObfuscatedName("h")
	final int field3762;
	@ObfuscatedName("z")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1653811455
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -392129599
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("l")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -588771909
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1459583845
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1081351471
	)
	int field3760;
	@ObfuscatedName("w")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1567479605
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1589512339
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -113350235
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("f")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1608445671
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1888817527
	)
	int field3776;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 2102774435
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("p")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -305344593
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("r")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 471183687
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ay")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("am")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ag")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ae")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ac")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("aq")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("at")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ak")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ax")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ar")
	@Export("base")
	int[][] base;
	@ObfuscatedName("al")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("aa")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -255221635
	)
	int field3769;

	BZip2State() {
		this.field3779 = 4096; // L: 4
		this.field3761 = 16; // L: 5
		this.field3759 = 258; // L: 6
		this.field3758 = 6; // L: 7
		this.field3782 = 50; // L: 8
		this.field3762 = 18002; // L: 9
		this.nextByte = 0; // L: 11
		this.next_out = 0; // L: 14
		this.unzftab = new int[256]; // L: 25
		this.cftab = new int[257]; // L: 27
		this.inUse = new boolean[256]; // L: 30
		this.inUse16 = new boolean[16]; // L: 31
		this.seqToUnseq = new byte[256]; // L: 32
		this.ll8 = new byte[4096]; // L: 33
		this.getAndMoveToFrontDecode_yy = new int[16]; // L: 34
		this.selector = new byte[18002]; // L: 35
		this.selectorMtf = new byte[18002]; // L: 36
		this.temp_charArray2d = new byte[6][258]; // L: 37
		this.limit = new int[6][258]; // L: 38
		this.base = new int[6][258]; // L: 39
		this.perm = new int[6][258]; // L: 40
		this.minLens = new int[6]; // L: 41
	} // L: 44
}
