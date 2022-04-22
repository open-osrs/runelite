import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pr")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -1129469843
	)
	static int field4662;
	@ObfuscatedName("v")
	final int field4655;
	@ObfuscatedName("c")
	final int field4627;
	@ObfuscatedName("i")
	final int field4626;
	@ObfuscatedName("f")
	final int field4633;
	@ObfuscatedName("b")
	final int field4628;
	@ObfuscatedName("n")
	final int field4634;
	@ObfuscatedName("s")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1322812601
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -430087741
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("o")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -175215317
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1039446447
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1120084063
	)
	int field4636;
	@ObfuscatedName("k")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 18493607
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -837008917
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -694773855
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("t")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 482261833
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1004484133
	)
	int field4643;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1457960971
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("y")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2064048971
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("e")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 180562183
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ae")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("aq")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("aw")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("am")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ak")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ao")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("aj")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("al")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("av")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("at")
	@Export("base")
	int[][] base;
	@ObfuscatedName("an")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ay")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1169026527
	)
	int field4661;

	BZip2State() {
		this.field4655 = 4096; // L: 4
		this.field4627 = 16; // L: 5
		this.field4626 = 258; // L: 6
		this.field4633 = 6; // L: 7
		this.field4628 = 50; // L: 8
		this.field4634 = 18002; // L: 9
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
