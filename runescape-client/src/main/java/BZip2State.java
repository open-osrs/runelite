import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gt")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("m")
	@Export("unused_4096")
	final int unused_4096;
	@ObfuscatedName("f")
	@Export("unused_16")
	final int unused_16;
	@ObfuscatedName("q")
	@Export("MAX_ALPHA_SIZE")
	final int MAX_ALPHA_SIZE;
	@ObfuscatedName("w")
	@Export("N_GROUPS")
	final int N_GROUPS;
	@ObfuscatedName("o")
	@Export("G_SIZE")
	final int G_SIZE;
	@ObfuscatedName("u")
	@Export("MAX_SELECTORS")
	final int MAX_SELECTORS;
	@ObfuscatedName("g")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1510817847
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -473971741
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("x")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -861462251
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 594179173
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1860254567
	)
	int field68;
	@ObfuscatedName("i")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1994129645
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1793367959
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1987934943
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1172102327
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1502359789
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -953353963
	)
	int field75;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1981923611
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("b")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -557334365
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("r")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -886333045
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ag")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("aq")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("aj")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("av")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ar")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ac")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ay")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ah")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ak")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("aw")
	@Export("base")
	int[][] base;
	@ObfuscatedName("al")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ab")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 444639767
	)
	@Export("groupPos")
	int groupPos;

	BZip2State() {
		this.unused_4096 = 4096;
		this.unused_16 = 16;
		this.MAX_ALPHA_SIZE = 258;
		this.N_GROUPS = 6;
		this.G_SIZE = 50;
		this.MAX_SELECTORS = 18002;
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
}
