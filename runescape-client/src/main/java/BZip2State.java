import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("li")
public final class BZip2State {
	@ObfuscatedName("bn")
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
	byte[] inputArray;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 839419927
	)
	int nextByte;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 128200733
	)
	int nextBit_unused;
	@ObfuscatedName("m")
	byte[] outputArray;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -181699619
	)
	int next_out;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 36041791
	)
	int outputLength;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -332448629
	)
	int field3759;
	@ObfuscatedName("a")
	byte out_char;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1965134077
	)
	int su_rNToGo;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -807361971
	)
	int bsBuff;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 705369625
	)
	int bsLive;
	@ObfuscatedName("y")
	int blockSize100k;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1211957325
	)
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
	int su_ch2;
	@ObfuscatedName("u")
	int[] unzftab;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1457026287
	)
	int nblocks_used;
	@ObfuscatedName("b")
	int[] cftab;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1999043287
	)
	int nInUse;
	@ObfuscatedName("ab")
	boolean[] inUse;
	@ObfuscatedName("ag")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	byte[] seqToUnseq;
	@ObfuscatedName("ae")
	byte[] ll8;
	@ObfuscatedName("an")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("am")
	byte[] selector;
	@ObfuscatedName("ap")
	byte[] selectorMtf;
	@ObfuscatedName("au")
	byte[][] temp_charArray2d;
	@ObfuscatedName("aa")
	int[][] limit;
	@ObfuscatedName("ar")
	int[][] base;
	@ObfuscatedName("at")
	int[][] perm;
	@ObfuscatedName("aq")
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
