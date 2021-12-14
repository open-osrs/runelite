import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("c")
	final int field4513;
	@ObfuscatedName("b")
	final int field4481;
	@ObfuscatedName("p")
	final int field4479;
	@ObfuscatedName("m")
	final int field4480;
	@ObfuscatedName("t")
	final int field4502;
	@ObfuscatedName("s")
	final int field4482;
	@ObfuscatedName("j")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -629862431
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1582268749
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("r")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1671473769
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -428614875
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -982561829
	)
	int field4489;
	@ObfuscatedName("h")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1975911845
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1278928369
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1731678281
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("u")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -540078153
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -235028951
	)
	int field4484;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 85714323
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("q")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1684289539
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("z")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -620890433
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ah")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ao")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ab")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("an")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ax")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("am")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("az")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("au")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("av")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ap")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ac")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("aj")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1618540435
	)
	int field4478;

	BZip2State() {
		this.field4513 = 4096;
		this.field4481 = 16;
		this.field4479 = 258;
		this.field4480 = 6;
		this.field4502 = 50;
		this.field4482 = 18002;
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

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1894772144"
	)
	static boolean method7571(int var0) {
		for (int var1 = 0; var1 < Client.field701; ++var1) {
			if (Client.field522[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
