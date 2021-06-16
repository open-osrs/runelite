import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("w")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("f")
	final int field4174;
	@ObfuscatedName("e")
	final int field4164;
	@ObfuscatedName("v")
	final int field4165;
	@ObfuscatedName("y")
	final int field4166;
	@ObfuscatedName("j")
	final int field4167;
	@ObfuscatedName("o")
	final int field4168;
	@ObfuscatedName("m")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -39933589
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -531147281
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("d")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1195525677
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1044111453
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -974665581
	)
	int field4175;
	@ObfuscatedName("k")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1559424305
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1700230051
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -416010867
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("u")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1898128253
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -553596923
	)
	int field4182;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 723737753
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("c")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -142342171
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("l")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1916971597
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("aw")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ak")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ad")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("at")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ah")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("az")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ap")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ag")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ab")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("aq")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ae")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ao")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 87198187
	)
	int field4201;

	BZip2State() {
		this.field4174 = 4096; // L: 4
		this.field4164 = 16; // L: 5
		this.field4165 = 258; // L: 6
		this.field4166 = 6; // L: 7
		this.field4167 = 50; // L: 8
		this.field4168 = 18002; // L: 9
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

	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "(I)Lme;",
		garbageValue = "-1693796296"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class80.worldMap; // L: 686
	}
}
