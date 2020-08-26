import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("li")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("bn")
	@Export("worldListURL")
	static String worldListURL;
	@ObfuscatedName("z")
	final int field3754;
	@ObfuscatedName("k")
	final int field3748;
	@ObfuscatedName("s")
	final int field3784;
	@ObfuscatedName("t")
	final int field3772;
	@ObfuscatedName("i")
	final int field3751;
	@ObfuscatedName("o")
	final int field3760;
	@ObfuscatedName("x")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 839419927
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 128200733
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("m")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -181699619
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 36041791
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -332448629
	)
	int field3759;
	@ObfuscatedName("a")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1965134077
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -807361971
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 705369625
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("y")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1211957325
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 586928333
	)
	int field3766;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 25295989
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("u")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1457026287
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("b")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1999043287
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ab")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ag")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ae")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("an")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("am")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ap")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("au")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("aa")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ar")
	@Export("base")
	int[][] base;
	@ObfuscatedName("at")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("aq")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 960928111
	)
	int field3770;

	BZip2State() {
		this.field3754 = 4096; // L: 4
		this.field3748 = 16; // L: 5
		this.field3784 = 258; // L: 6
		this.field3772 = 6; // L: 7
		this.field3751 = 50; // L: 8
		this.field3760 = 18002; // L: 9
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
