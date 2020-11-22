import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lj")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("f")
	final int field3776;
	@ObfuscatedName("b")
	final int field3760;
	@ObfuscatedName("l")
	final int field3756;
	@ObfuscatedName("m")
	final int field3757;
	@ObfuscatedName("z")
	final int field3758;
	@ObfuscatedName("q")
	final int field3759;
	@ObfuscatedName("k")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2107089089
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1265536035
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("t")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1237814353
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1984438571
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1896689393
	)
	int field3766;
	@ObfuscatedName("x")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -59946543
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1329480859
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1443404011
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("s")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -872261387
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1806589357
	)
	int field3761;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1647228145
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("d")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2108747911
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("g")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -207358751
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ab")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ac")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("af")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("av")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ar")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ay")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ah")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("az")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ak")
	@Export("base")
	int[][] base;
	@ObfuscatedName("au")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ai")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -974418121
	)
	int field3791;

	BZip2State() {
		this.field3776 = 4096; // L: 4
		this.field3760 = 16; // L: 5
		this.field3756 = 258; // L: 6
		this.field3757 = 6; // L: 7
		this.field3758 = 50; // L: 8
		this.field3759 = 18002; // L: 9
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
