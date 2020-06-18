import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("m")
	final int field3750;
	@ObfuscatedName("o")
	final int field3784;
	@ObfuscatedName("q")
	final int field3749;
	@ObfuscatedName("j")
	final int field3755;
	@ObfuscatedName("p")
	final int field3751;
	@ObfuscatedName("g")
	final int field3752;
	@ObfuscatedName("n")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 2048322099
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -2079551029
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("z")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -521485937
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -962372007
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1091946921
	)
	int field3783;
	@ObfuscatedName("h")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -475619831
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 37444239
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 590709617
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("v")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1631921855
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 755758005
	)
	int field3779;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1026760725
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("t")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -819259021
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("b")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -420415873
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ah")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ai")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ao")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ae")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("ax")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ag")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ab")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("am")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ak")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("ad")
	@Export("base")
	int[][] base;
	@ObfuscatedName("as")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ar")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 202332287
	)
	int field3766;

	BZip2State() {
		this.field3750 = 4096;
		this.field3784 = 16;
		this.field3749 = 258;
		this.field3755 = 6;
		this.field3751 = 50;
		this.field3752 = 18002;
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

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lhd;I)Ljava/lang/String;",
		garbageValue = "-1638627143"
	)
	static String method6001(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + class225.method4182(Canvas.method923(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
