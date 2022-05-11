import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("py")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("o")
	final int field4689;
	@ObfuscatedName("q")
	final int field4684;
	@ObfuscatedName("l")
	final int field4685;
	@ObfuscatedName("k")
	final int field4702;
	@ObfuscatedName("a")
	final int field4687;
	@ObfuscatedName("m")
	final int field4688;
	@ObfuscatedName("p")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1006289449
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 213678345
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("v")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -230908601
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2001230231
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 541649199
	)
	int field4715;
	@ObfuscatedName("b")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -540019141
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 790421793
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1354808017
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("n")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1115223461
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 888729529
	)
	int field4714;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1393554365
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("d")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1338159051
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("z")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1217769335
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ag")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ar")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("am")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ac")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ab")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("aj")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ae")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("az")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ap")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("as")
	@Export("base")
	int[][] base;
	@ObfuscatedName("au")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ak")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -412410727
	)
	int field4720;

	BZip2State() {
		this.field4689 = 4096; // L: 4
		this.field4684 = 16; // L: 5
		this.field4685 = 258; // L: 6
		this.field4702 = 6; // L: 7
		this.field4687 = 50; // L: 8
		this.field4688 = 18002; // L: 9
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
