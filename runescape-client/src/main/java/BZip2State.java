import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pw")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("v")
	final int field4642;
	@ObfuscatedName("o")
	final int field4621;
	@ObfuscatedName("h")
	final int field4631;
	@ObfuscatedName("g")
	final int field4623;
	@ObfuscatedName("l")
	final int field4622;
	@ObfuscatedName("n")
	final int field4625;
	@ObfuscatedName("d")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 181099261
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1759162365
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("r")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -522842353
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1864321797
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -30429837
	)
	int field4635;
	@ObfuscatedName("j")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 471836973
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1476637683
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -786091243
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("w")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 991263757
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -346783491
	)
	int field4638;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1526094507
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("y")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 433729093
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("e")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2017567191
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ac")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ax")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ay")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("au")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("at")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("aw")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ar")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ae")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ab")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("aa")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ad")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("aj")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1816704057
	)
	int field4657;

	BZip2State() {
		this.field4642 = 4096; // L: 4
		this.field4621 = 16; // L: 5
		this.field4631 = 258; // L: 6
		this.field4623 = 6; // L: 7
		this.field4622 = 50; // L: 8
		this.field4625 = 18002; // L: 9
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
