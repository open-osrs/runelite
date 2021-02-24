import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lx")
@Implements("BZip2State")
public final class BZip2State {
   @ObfuscatedName("o")
   @Export("BZip2Decompressor_block")
   static int[] BZip2Decompressor_block;
   @ObfuscatedName("n")
   final int field3779 = 4096;
   @ObfuscatedName("v")
   final int field3761 = 16;
   @ObfuscatedName("d")
   final int field3759 = 258;
   @ObfuscatedName("c")
   final int field3758 = 6;
   @ObfuscatedName("y")
   final int field3782 = 50;
   @ObfuscatedName("h")
   final int field3762 = 18002;
   @ObfuscatedName("z")
   @Export("inputArray")
   byte[] inputArray;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1653811455
   )
   @Export("nextByte")
   int nextByte = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -392129599
   )
   @Export("nextBit_unused")
   int nextBit_unused;
   @ObfuscatedName("l")
   @Export("outputArray")
   byte[] outputArray;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -588771909
   )
   @Export("next_out")
   int next_out = 0;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1459583845
   )
   @Export("outputLength")
   int outputLength;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1081351471
   )
   int field3760;
   @ObfuscatedName("w")
   @Export("out_char")
   byte out_char;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1567479605
   )
   @Export("su_rNToGo")
   int su_rNToGo;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1589512339
   )
   @Export("bsBuff")
   int bsBuff;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -113350235
   )
   @Export("bsLive")
   int bsLive;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -635399168
   )
   @Export("blockSize100k")
   int blockSize100k;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1608445671
   )
   @Export("originalPointer")
   int originalPointer;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1888817527
   )
   int field3776;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 2102774435
   )
   @Export("su_ch2")
   int su_ch2;
   @ObfuscatedName("p")
   @Export("unzftab")
   int[] unzftab = new int[256];
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -305344593
   )
   @Export("nblocks_used")
   int nblocks_used;
   @ObfuscatedName("r")
   @Export("cftab")
   int[] cftab = new int[257];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 471183687
   )
   @Export("nInUse")
   int nInUse;
   @ObfuscatedName("ay")
   @Export("inUse")
   boolean[] inUse = new boolean[256];
   @ObfuscatedName("am")
   @Export("inUse16")
   boolean[] inUse16 = new boolean[16];
   @ObfuscatedName("ag")
   @Export("seqToUnseq")
   byte[] seqToUnseq = new byte[256];
   @ObfuscatedName("ae")
   @Export("ll8")
   byte[] ll8 = new byte[4096];
   @ObfuscatedName("ac")
   @Export("getAndMoveToFrontDecode_yy")
   int[] getAndMoveToFrontDecode_yy = new int[16];
   @ObfuscatedName("aq")
   @Export("selector")
   byte[] selector = new byte[18002];
   @ObfuscatedName("at")
   @Export("selectorMtf")
   byte[] selectorMtf = new byte[18002];
   @ObfuscatedName("ak")
   @Export("temp_charArray2d")
   byte[][] temp_charArray2d = new byte[6][258];
   @ObfuscatedName("ax")
   @Export("limit")
   int[][] limit = new int[6][258];
   @ObfuscatedName("ar")
   @Export("base")
   int[][] base = new int[6][258];
   @ObfuscatedName("al")
   @Export("perm")
   int[][] perm = new int[6][258];
   @ObfuscatedName("aa")
   @Export("minLens")
   int[] minLens = new int[6];
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -255221635
   )
   int field3769;
}
