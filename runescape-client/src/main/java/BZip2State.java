import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("h")
	final int field3765;
	@ObfuscatedName("v")
	final int field3761;
	@ObfuscatedName("x")
	final int field3762;
	@ObfuscatedName("w")
	final int field3769;
	@ObfuscatedName("t")
	final int field3783;
	@ObfuscatedName("j")
	final int field3793;
	@ObfuscatedName("n")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 2048002917
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1387110715
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("z")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -124829371
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 990524105
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1359867971
	)
	int field3772;
	@ObfuscatedName("c")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 370207757
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1851938871
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -487654005
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("b")
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1325444151
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1685477849
	)
	int field3779;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1899062287
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("g")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 995488429
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("o")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1840218043
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("an")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("aj")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("ax")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("ag")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("au")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("as")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ae")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("ac")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("ak")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("av")
	@Export("base")
	int[][] base;
	@ObfuscatedName("aq")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ah")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1908981277
	)
	int field3797;

	BZip2State() {
		this.field3765 = 4096; // L: 4
		this.field3761 = 16; // L: 5
		this.field3762 = 258; // L: 6
		this.field3769 = 6; // L: 7
		this.field3783 = 50; // L: 8
		this.field3793 = 18002; // L: 9
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

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-244499356"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.field2285, Client.packetWriter.isaacCipher); // L: 11039
		var0.packetBuffer.writeByte(0); // L: 11040
		Client.packetWriter.addNode(var0); // L: 11041
	} // L: 11042
}
