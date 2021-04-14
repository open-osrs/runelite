import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nv")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("f")
	final int field4181;
	@ObfuscatedName("o")
	final int field4157;
	@ObfuscatedName("u")
	final int field4158;
	@ObfuscatedName("p")
	final int field4159;
	@ObfuscatedName("b")
	final int field4160;
	@ObfuscatedName("e")
	final int field4161;
	@ObfuscatedName("k")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -811439573
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -214146315
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("n")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1180520057
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 918346221
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 131560233
	)
	int field4168;
	@ObfuscatedName("c")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1093250351
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 221996135
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1968874059
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("t")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1375451961
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1105142065
	)
	int field4175;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1781089345
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("i")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1209285469
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("w")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -531246717
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ac")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ay")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("am")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ag")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("aq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("at")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("aj")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("aw")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ap")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ax")
	@Export("base")
	int[][] base;
	@ObfuscatedName("as")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ad")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1691301735
	)
	int field4184;

	BZip2State() {
		this.field4181 = 4096; // L: 4
		this.field4157 = 16; // L: 5
		this.field4158 = 258; // L: 6
		this.field4159 = 6; // L: 7
		this.field4160 = 50; // L: 8
		this.field4161 = 18002; // L: 9
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
