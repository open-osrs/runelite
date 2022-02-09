import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pl")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("c")
	final int field4517;
	@ObfuscatedName("l")
	final int field4527;
	@ObfuscatedName("s")
	final int field4531;
	@ObfuscatedName("e")
	final int field4518;
	@ObfuscatedName("r")
	final int field4538;
	@ObfuscatedName("o")
	final int field4520;
	@ObfuscatedName("i")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1430672477
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 2135486191
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("a")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1536417739
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1089874699
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 612112329
	)
	int field4528;
	@ObfuscatedName("q")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1645409119
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -652738083
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 114761133
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("m")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1357383429
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 162341103
	)
	int field4534;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 720318015
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("g")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 772860297
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("k")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 814559959
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ap")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("af")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ak")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("av")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ar")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("al")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("aa")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ao")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("aq")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ay")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ac")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ab")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -924914061
	)
	int field4552;

	BZip2State() {
		this.field4517 = 4096; // L: 4
		this.field4527 = 16; // L: 5
		this.field4531 = 258; // L: 6
		this.field4518 = 6; // L: 7
		this.field4538 = 50; // L: 8
		this.field4520 = 18002; // L: 9
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
