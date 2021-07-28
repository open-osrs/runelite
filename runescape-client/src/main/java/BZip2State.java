import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("nn")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("s")
	final int field4213;
	@ObfuscatedName("t")
	final int field4185;
	@ObfuscatedName("v")
	final int field4193;
	@ObfuscatedName("j")
	final int field4186;
	@ObfuscatedName("l")
	final int field4188;
	@ObfuscatedName("n")
	final int field4189;
	@ObfuscatedName("w")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1167904443
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2140718727
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("x")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 152058377
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 720811517
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1102451059
	)
	int field4196;
	@ObfuscatedName("k")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1797318969
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 577319637
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -844578273
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("e")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2013367365
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1202872339
	)
	int field4203;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -382061133
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("b")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 464515415
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("d")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1433904183
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ae")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("an")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("am")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("al")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("aq")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("aa")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ab")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ax")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("au")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("av")
	@Export("base")
	int[][] base;
	@ObfuscatedName("as")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ao")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 498963667
	)
	int field4207;

	BZip2State() {
		this.field4213 = 4096;
		this.field4185 = 16;
		this.field4193 = 258;
		this.field4186 = 6;
		this.field4188 = 50;
		this.field4189 = 18002;
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
