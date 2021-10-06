import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oe")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("l")
	final int field4321;
	@ObfuscatedName("q")
	final int field4301;
	@ObfuscatedName("f")
	final int field4297;
	@ObfuscatedName("j")
	final int field4298;
	@ObfuscatedName("m")
	final int field4324;
	@ObfuscatedName("k")
	final int field4327;
	@ObfuscatedName("t")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -423791867
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -35036943
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("i")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -274929017
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1396633921
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1637458191
	)
	int field4307;
	@ObfuscatedName("v")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -19931269
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2147042251
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1165324025
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("x")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1252638347
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -2144945391
	)
	int field4314;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1948961563
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("o")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -194089085
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("n")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -305631671
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ab")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ad")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("as")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ak")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ah")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ay")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("al")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ao")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("au")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("aa")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ag")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("aq")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1097508377
	)
	int field4300;

	BZip2State() {
		this.field4321 = 4096;
		this.field4301 = 16;
		this.field4297 = 258;
		this.field4298 = 6;
		this.field4324 = 50;
		this.field4327 = 18002;
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
