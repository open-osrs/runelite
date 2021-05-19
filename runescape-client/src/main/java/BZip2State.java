import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nc")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("h")
	final int field4182;
	@ObfuscatedName("c")
	final int field4197;
	@ObfuscatedName("o")
	final int field4165;
	@ObfuscatedName("g")
	final int field4166;
	@ObfuscatedName("l")
	final int field4167;
	@ObfuscatedName("z")
	final int field4192;
	@ObfuscatedName("t")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 121849623
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1991745759
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("q")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 326697693
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -262176685
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 226319063
	)
	int field4172;
	@ObfuscatedName("r")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2065877891
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -899182977
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 772528539
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("d")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1960680631
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1501531237
	)
	int field4188;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1394480725
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("f")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -444065165
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("y")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -243440813
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ag")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ae")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("aj")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("aw")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("at")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("av")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("al")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ap")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("am")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ax")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ak")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1956200463
	)
	int field4200;

	BZip2State() {
		this.field4182 = 4096; // L: 4
		this.field4197 = 16; // L: 5
		this.field4165 = 258; // L: 6
		this.field4166 = 6; // L: 7
		this.field4167 = 50; // L: 8
		this.field4192 = 18002; // L: 9
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
